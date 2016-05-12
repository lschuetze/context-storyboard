package de.larsschuetze.storyboard.generator

import com.google.inject.Inject
import de.larsschuetze.storyboard.dsl.AbstractElement
import de.larsschuetze.storyboard.dsl.StartNode
import de.larsschuetze.storyboard.dsl.StoryPatternNode
import de.larsschuetze.storyboard.dsl.Storyboard
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.compiler.ImportManager
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable
import org.eclipse.xtext.xbase.compiler.TypeReferenceSerializer
import de.larsschuetze.storyboard.services.DslGrammarAccess.StoryPatternNodeElements
import de.larsschuetze.storyboard.dsl.Transition

class DslGenerator implements IGenerator {

	@Inject extension IQualifiedNameProvider
	@Inject extension TypeReferenceSerializer

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		for (e : input.allContents.toIterable.filter(typeof(Storyboard))) {
			fsa.generateFile(
				"GeneratedStoryboard" + e.fullyQualifiedName.toString("/") + ".java",
				e.compile
			)
		}
	}

	def compile(Storyboard it) '''
		«val importManager = new ImportManager(true)»
		«val body = body(importManager)»
		
		«FOR i : importManager.imports»
			import «i»;
		«ENDFOR»
		import de.larsschuetze.storyboard.runtime.library.*;
		
		«body»
	'''

	def body(Storyboard it, ImportManager im) '''
		public class GeneratedStoryboard«name» extends Storyboard {
			
			public void instantiateElements() {
			«FOR e : elements»
				«e.compile(im)»
			«ENDFOR»
			}
		}
	'''

	def compile(AbstractElement it, ImportManager im) {
		if (it instanceof StartNode)
			compile(it as StartNode, im)
		if (it instanceof StoryPatternNode)
			compile(it as StoryPatternNode, im)
		if (it instanceof Transition)
			compile(it as Transition, im)
	}

	def compile(Transition it, ImportManager im) '''
		Transition «name» = new Transition(«source.fullyQualifiedName.getSegment(source.fullyQualifiedName.segmentCount-1)»«IF sourcePort != null».«sourcePort»«ENDIF»,
			«target.fullyQualifiedName.getSegment(target.fullyQualifiedName.segmentCount-1)»,«name»);
			«name».setTriggerEventType(«event.name»);
			
	'''

	def compile(StoryPatternNode it, ImportManager im) '''
		
	'''

	def compile(StartNode it, ImportManager im) '''
		StartNode start = new StartNode();
		start.setName(«name»);
	'''

	def shortName(JvmTypeReference ref, ImportManager im) {
		val result = new StringBuilderBasedAppendable(im)
		ref.serialize(ref.eContainer, result)
		result.toString
	}

	var transCount = 0

	def transName(Transition t) {
		val result = "Transition" + transCount
		transCount++
		result.toString
	}
}
