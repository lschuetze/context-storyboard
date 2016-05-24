/**
 * generated by Xtext 2.9.1
 */
package de.larsschuetze.storyboard.formatting2;

import com.google.inject.Inject;
import de.larsschuetze.storyboard.dsl.AbstractElement;
import de.larsschuetze.storyboard.dsl.Event;
import de.larsschuetze.storyboard.dsl.Storyboard;
import de.larsschuetze.storyboard.services.DslGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeConstraint;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBasicForLoopExpression;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XCollectionLiteral;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XPostfixOperation;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XSynchronizedExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.formatting2.XbaseFormatter;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xtype.XFunctionTypeRef;
import org.eclipse.xtext.xtype.XImportDeclaration;
import org.eclipse.xtext.xtype.XImportSection;

@SuppressWarnings("all")
public class DslFormatter extends XbaseFormatter {
  @Inject
  @Extension
  private DslGrammarAccess _dslGrammarAccess;
  
  protected void _format(final Storyboard storyboard, @Extension final IFormattableDocument document) {
    EList<Event> _importedEvents = storyboard.getImportedEvents();
    for (final Event importedEvents : _importedEvents) {
      document.<Event>format(importedEvents);
    }
    EList<AbstractElement> _elements = storyboard.getElements();
    for (final AbstractElement elements : _elements) {
      document.<AbstractElement>format(elements);
    }
  }
  
  protected void _format(final Event event, @Extension final IFormattableDocument document) {
    JvmTypeReference _eventType = event.getEventType();
    document.<JvmTypeReference>format(_eventType);
  }
  
  public void format(final Object event, final IFormattableDocument document) {
    if (event instanceof JvmTypeParameter) {
      _format((JvmTypeParameter)event, document);
      return;
    } else if (event instanceof JvmFormalParameter) {
      _format((JvmFormalParameter)event, document);
      return;
    } else if (event instanceof XtextResource) {
      _format((XtextResource)event, document);
      return;
    } else if (event instanceof XAssignment) {
      _format((XAssignment)event, document);
      return;
    } else if (event instanceof XBinaryOperation) {
      _format((XBinaryOperation)event, document);
      return;
    } else if (event instanceof XDoWhileExpression) {
      _format((XDoWhileExpression)event, document);
      return;
    } else if (event instanceof XFeatureCall) {
      _format((XFeatureCall)event, document);
      return;
    } else if (event instanceof XMemberFeatureCall) {
      _format((XMemberFeatureCall)event, document);
      return;
    } else if (event instanceof XPostfixOperation) {
      _format((XPostfixOperation)event, document);
      return;
    } else if (event instanceof XWhileExpression) {
      _format((XWhileExpression)event, document);
      return;
    } else if (event instanceof XFunctionTypeRef) {
      _format((XFunctionTypeRef)event, document);
      return;
    } else if (event instanceof JvmGenericArrayTypeReference) {
      _format((JvmGenericArrayTypeReference)event, document);
      return;
    } else if (event instanceof JvmParameterizedTypeReference) {
      _format((JvmParameterizedTypeReference)event, document);
      return;
    } else if (event instanceof JvmWildcardTypeReference) {
      _format((JvmWildcardTypeReference)event, document);
      return;
    } else if (event instanceof XBasicForLoopExpression) {
      _format((XBasicForLoopExpression)event, document);
      return;
    } else if (event instanceof XBlockExpression) {
      _format((XBlockExpression)event, document);
      return;
    } else if (event instanceof XCastedExpression) {
      _format((XCastedExpression)event, document);
      return;
    } else if (event instanceof XClosure) {
      _format((XClosure)event, document);
      return;
    } else if (event instanceof XCollectionLiteral) {
      _format((XCollectionLiteral)event, document);
      return;
    } else if (event instanceof XConstructorCall) {
      _format((XConstructorCall)event, document);
      return;
    } else if (event instanceof XForLoopExpression) {
      _format((XForLoopExpression)event, document);
      return;
    } else if (event instanceof XIfExpression) {
      _format((XIfExpression)event, document);
      return;
    } else if (event instanceof XInstanceOfExpression) {
      _format((XInstanceOfExpression)event, document);
      return;
    } else if (event instanceof XReturnExpression) {
      _format((XReturnExpression)event, document);
      return;
    } else if (event instanceof XSwitchExpression) {
      _format((XSwitchExpression)event, document);
      return;
    } else if (event instanceof XSynchronizedExpression) {
      _format((XSynchronizedExpression)event, document);
      return;
    } else if (event instanceof XThrowExpression) {
      _format((XThrowExpression)event, document);
      return;
    } else if (event instanceof XTryCatchFinallyExpression) {
      _format((XTryCatchFinallyExpression)event, document);
      return;
    } else if (event instanceof XTypeLiteral) {
      _format((XTypeLiteral)event, document);
      return;
    } else if (event instanceof XVariableDeclaration) {
      _format((XVariableDeclaration)event, document);
      return;
    } else if (event instanceof Event) {
      _format((Event)event, document);
      return;
    } else if (event instanceof Storyboard) {
      _format((Storyboard)event, document);
      return;
    } else if (event instanceof JvmTypeConstraint) {
      _format((JvmTypeConstraint)event, document);
      return;
    } else if (event instanceof XExpression) {
      _format((XExpression)event, document);
      return;
    } else if (event instanceof XImportDeclaration) {
      _format((XImportDeclaration)event, document);
      return;
    } else if (event instanceof XImportSection) {
      _format((XImportSection)event, document);
      return;
    } else if (event instanceof EObject) {
      _format((EObject)event, document);
      return;
    } else if (event == null) {
      _format((Void)null, document);
      return;
    } else if (event != null) {
      _format(event, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(event, document).toString());
    }
  }
}
