package de.larsschuetze.storyboard.generator

import com.google.inject.Inject
import de.larsschuetze.storyboard.dsl.AbstractElement
import de.larsschuetze.storyboard.dsl.AddRoleNode
import de.larsschuetze.storyboard.dsl.EndNode
import de.larsschuetze.storyboard.dsl.Guard
import de.larsschuetze.storyboard.dsl.StartNode
import de.larsschuetze.storyboard.dsl.StoryPatternNode
import de.larsschuetze.storyboard.dsl.Storyboard
import de.larsschuetze.storyboard.dsl.Transition
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.naming.IQualifiedNameProvider
import de.larsschuetze.storyboard.dsl.ProhibitedRoleNode
import de.larsschuetze.storyboard.dsl.RemoveRoleNode
import de.larsschuetze.storyboard.dsl.RenewRoleNode

class DslGenerator implements IGenerator {

	@Inject extension IQualifiedNameProvider

	var guardCount = 0

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		getPackageName(input)
		for (e : input.allContents.toIterable.filter(typeof(Guard))) {
			val fileName = packageName + ".GeneratedGuard" + guardCount++
			guardMap.put(e as Guard, fileName)
			fsa.generateFile(
				fileName.replace('.', '/') + ".java",
				compile(e as Guard)
			)
		}
		for (e : input.allContents.toIterable.filter(typeof(StoryPatternNode))) {
			val fileName = packageName + "." + e.name
			fsa.generateFile(
				fileName.replace('.', '/') + "Matcher.java",
				compileMatcher(e as StoryPatternNode)
			)
			fsa.generateFile(
				fileName.replace('.', '/') + "Adapter.java",
				compileAdapter(e as StoryPatternNode)
			)
		}
		for (e : input.allContents.toIterable.filter(typeof(Storyboard))) {
			fsa.generateFile(
				e.fullyQualifiedName.toString("/") + ".java",
				compile(e as Storyboard)
			)
		}
	}

	String packageName;
	val guardMap = newLinkedHashMap

	def getPackageName(Resource r) {
		for (e : r.allContents.toIterable.filter(typeof(Storyboard))) {
			packageName = e.name.substring(0, e.name.lastIndexOf('.'))
		}
	}

	def compile(Storyboard it) '''
		package «packageName»;
		
		import de.larsschuetze.storyboard.runtime.library.*;
		
		public class «name.substring(name.lastIndexOf('.')+1)» extends Storyboard {
			
			public void instantiateElements() {
				«FOR e : elements»
					«e.instantiate»
				«ENDFOR»
			}
		}
	'''

	def instantiate(AbstractElement it) {
		if (it instanceof StoryPatternNode)
			instantiate(it as StoryPatternNode)
		else if (it instanceof StartNode)
			instantiate(it as StartNode)
		else if (it instanceof EndNode)
			instantiate(it as EndNode)
		else if (it instanceof Transition)
			instantiate(it as Transition)
	}

	def instantiate(StoryPatternNode it) '''
		MatchActivity «name» = new MatchActivity(new «name»Matcher(), new «name»Adapter());
	'''

	def instantiate(StartNode it) '''
		StartNode «name» = new StartNode();
		«name».setName("«name»");
		this.setStartNode(«name»);		
	'''

	def instantiate(EndNode it) '''
		EndNode «name» = new EndNode();
	'''

	def compile(Guard it) '''
		package «packageName»;
		«val eventType = (it.eContainer as Transition).event.eventType.type»
		import «eventType.fullyQualifiedName»;
		import de.larsschuetze.storyboard.runtime.library.*;
		
		public class GeneratedGuard«guardCount-1» extends Guard {
			
			@Override
			public boolean accept(Event event) {
				Object eventObject = event.getEventObject();
				if(eventObject instanceof «eventType.qualifiedName») {
					«eventType.qualifiedName» castedEventObject = («eventType.qualifiedName») eventObject;
					return castedEventObject.«guard»;
				}
				return false;
			}
		}
	'''

	def instantiate(Transition it) '''
		Transition «name» = new Transition(«source.fullyQualifiedName.getSegment(
			source.fullyQualifiedName.segmentCount-1)»«IF sourcePort != null»
														«IF sourcePort == "success"».getSuccessNode()«ELSE».getFailNode()«ENDIF»
		«ENDIF»,
			«target.fullyQualifiedName.getSegment(target.fullyQualifiedName.segmentCount-1)», "«name»");
			«name».setTriggerEventType("«event.eventType.type.qualifiedName»");
			«IF guard != null»«name».setGuard(new «guardMap.get(guard)»());«ENDIF»
	'''

	def compileAdapter(StoryPatternNode it) '''
		package «packageName»;
		
		import java.util.*;
		
		import de.larsschuetze.storyboard.runtime.library.Adapter;
		import de.larsschuetze.storyboard.manager.roles.IAdaptModelInstance;
		import de.larsschuetze.storyboard.manager.roles.IQueryModelInstance;
		import de.larsschuetze.storyboard.model.crom.crom_l0.*;
		
		public class «name»Adapter extends Adapter {
			@Override
			public void adapt(Player adaptee,
						IAdaptModelInstance adaption, IQueryModelInstance query) {
				«FOR r : it.roleReconfigurations»
					«IF r instanceof AddRoleNode»
						putAdaptionAction("add", "«r.compartmentName»", "«r.name»");
					«ENDIF»
					«IF r instanceof RemoveRoleNode»
						putAdaptionAction("remove", "«r.compartmentName»", "«r.name»");
					«ENDIF»
					«IF r instanceof RenewRoleNode»
						putAdaptionAction("remove", "«r.compartmentName»", "«r.name»");
						putAdaptionAction("add", "«r.compartmentName»", "«r.name»");
					«ENDIF»
				«ENDFOR»				
			}
		}
	'''

	def compileMatcher(StoryPatternNode it) '''
		package «packageName»;
		
		import java.util.*;
		
		import de.larsschuetze.storyboard.runtime.library.Matcher;
		import de.larsschuetze.storyboard.manager.roles.IQueryModelInstance;
		import de.larsschuetze.storyboard.model.crom.crom_l0.Player;
		import de.larsschuetze.storyboard.model.crom.crom_l0.Role;
		
		public class «name»Matcher extends Matcher {			
			@Override
			public boolean execute(IQueryModelInstance query) {
				Map<String, String> matchingRoles = new HashMap<>();
				Map<String, String> prohibitedRoles = new HashMap<>();
				«FOR r : it.roleReconfigurations»
					«IF !(r instanceof AddRoleNode) »
						«IF (r instanceof ProhibitedRoleNode)»
							prohibitedRoles.put("«r.name»", "«r.compartmentName»");
						«ELSE»
							matchingRoles.put("«r.name»", "«r.compartmentName»");
						«ENDIF»
					«ENDIF»
				«ENDFOR»
				
				for(Player p : query.getPlayers("«it.className»")) {
					boolean errorMatch = false;
					for(String roleName : matchingRoles.keySet()) {
						if(getRoleCompMap(query, p).containsKey(roleName)) {
							if(getRoleCompMap(query, p).get(roleName) == matchingRoles.get(roleName)) {
								List<Role> roles = rolesOfPlayer.get(
							} else {
							errorMatch |= true;	
							}								
						} else {
							errorMatch |= true;
						}
					}
					
					for(String roleName : prohibitedRoles.keySet()) {
						if(getRoleCompMap(query, p).containsKey(roleName)) {
							if(getRoleCompMap(query, p).get(roleName) == prohibitedRoles.get(roleName)) {
								errorMatch |= true;
							}
						}								
					}
					
					if(!errorMatch) {
						setMatchResult(p);
						return true;
					}
				}
				return false;
			}
		
			private Map<String, String> getRoleCompMap(IQueryModelInstance query, Player p) {
				List<Role> roles = query.getRoleByPlayer(p);
				Map<String, String> result = new HashMap<>();
				for(Role r : roles) {
					result.put(r.getRoleType(), query.getCompartment(r).getCompartmentType());
				}
				return result;
			}
		}
	'''

	var nameCount = 0

	def nextName() {
		val result = "Element" + nameCount++
		result.toString
	}
}
