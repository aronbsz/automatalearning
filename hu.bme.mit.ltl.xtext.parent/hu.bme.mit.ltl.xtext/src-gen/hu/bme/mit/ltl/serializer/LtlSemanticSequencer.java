/*
 * generated by Xtext 2.23.0
 */
package hu.bme.mit.ltl.serializer;

import com.google.inject.Inject;
import hu.bme.mit.ltl.AndExpression;
import hu.bme.mit.ltl.AtomicProposition;
import hu.bme.mit.ltl.EquivalenceExpression;
import hu.bme.mit.ltl.FalseExpression;
import hu.bme.mit.ltl.FutureExpression;
import hu.bme.mit.ltl.GloballyExpression;
import hu.bme.mit.ltl.ImplyExpression;
import hu.bme.mit.ltl.LtlPackage;
import hu.bme.mit.ltl.NextExpression;
import hu.bme.mit.ltl.NotExpression;
import hu.bme.mit.ltl.OrExpression;
import hu.bme.mit.ltl.TrueExpression;
import hu.bme.mit.ltl.UntilExpression;
import hu.bme.mit.ltl.services.LtlGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class LtlSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LtlGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == LtlPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case LtlPackage.AND_EXPRESSION:
				sequence_AndExpression(context, (AndExpression) semanticObject); 
				return; 
			case LtlPackage.ATOMIC_PROPOSITION:
				sequence_AtomicProposition(context, (AtomicProposition) semanticObject); 
				return; 
			case LtlPackage.EQUIVALENCE_EXPRESSION:
				sequence_ArrowExpression(context, (EquivalenceExpression) semanticObject); 
				return; 
			case LtlPackage.FALSE_EXPRESSION:
				sequence_FalseExpression(context, (FalseExpression) semanticObject); 
				return; 
			case LtlPackage.FUTURE_EXPRESSION:
				sequence_FutureGloballyExpression(context, (FutureExpression) semanticObject); 
				return; 
			case LtlPackage.GLOBALLY_EXPRESSION:
				sequence_FutureGloballyExpression(context, (GloballyExpression) semanticObject); 
				return; 
			case LtlPackage.IMPLY_EXPRESSION:
				sequence_ArrowExpression(context, (ImplyExpression) semanticObject); 
				return; 
			case LtlPackage.NEXT_EXPRESSION:
				sequence_NextExpression(context, (NextExpression) semanticObject); 
				return; 
			case LtlPackage.NOT_EXPRESSION:
				sequence_PrimaryExpression(context, (NotExpression) semanticObject); 
				return; 
			case LtlPackage.OR_EXPRESSION:
				sequence_OrExpression(context, (OrExpression) semanticObject); 
				return; 
			case LtlPackage.TRUE_EXPRESSION:
				sequence_TrueExpression(context, (TrueExpression) semanticObject); 
				return; 
			case LtlPackage.UNTIL_EXPRESSION:
				sequence_UntilExpression(context, (UntilExpression) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     LTLExpression returns AndExpression
	 *     ArrowExpression returns AndExpression
	 *     ArrowExpression.ImplyExpression_1_0_0 returns AndExpression
	 *     ArrowExpression.EquivalenceExpression_1_1_0 returns AndExpression
	 *     OrExpression returns AndExpression
	 *     OrExpression.OrExpression_1_0 returns AndExpression
	 *     AndExpression returns AndExpression
	 *     AndExpression.AndExpression_1_0 returns AndExpression
	 *     UntilExpression returns AndExpression
	 *     UntilExpression.UntilExpression_1_0 returns AndExpression
	 *     FutureGloballyExpression returns AndExpression
	 *     NextExpression returns AndExpression
	 *     PrimaryExpression returns AndExpression
	 *
	 * Constraint:
	 *     (leftOperand=AndExpression_AndExpression_1_0 rightOperand=UntilExpression)
	 */
	protected void sequence_AndExpression(ISerializationContext context, AndExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LtlPackage.Literals.BINARY_EXPRESSION__LEFT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LtlPackage.Literals.BINARY_EXPRESSION__LEFT_OPERAND));
			if (transientValues.isValueTransient(semanticObject, LtlPackage.Literals.BINARY_EXPRESSION__RIGHT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LtlPackage.Literals.BINARY_EXPRESSION__RIGHT_OPERAND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAndExpressionAccess().getAndExpressionLeftOperandAction_1_0(), semanticObject.getLeftOperand());
		feeder.accept(grammarAccess.getAndExpressionAccess().getRightOperandUntilExpressionParserRuleCall_1_2_0(), semanticObject.getRightOperand());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LTLExpression returns EquivalenceExpression
	 *     ArrowExpression returns EquivalenceExpression
	 *     ArrowExpression.ImplyExpression_1_0_0 returns EquivalenceExpression
	 *     ArrowExpression.EquivalenceExpression_1_1_0 returns EquivalenceExpression
	 *     OrExpression returns EquivalenceExpression
	 *     OrExpression.OrExpression_1_0 returns EquivalenceExpression
	 *     AndExpression returns EquivalenceExpression
	 *     AndExpression.AndExpression_1_0 returns EquivalenceExpression
	 *     UntilExpression returns EquivalenceExpression
	 *     UntilExpression.UntilExpression_1_0 returns EquivalenceExpression
	 *     FutureGloballyExpression returns EquivalenceExpression
	 *     NextExpression returns EquivalenceExpression
	 *     PrimaryExpression returns EquivalenceExpression
	 *
	 * Constraint:
	 *     (leftOperand=ArrowExpression_EquivalenceExpression_1_1_0 rightOperand=ArrowExpression)
	 */
	protected void sequence_ArrowExpression(ISerializationContext context, EquivalenceExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LtlPackage.Literals.BINARY_EXPRESSION__LEFT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LtlPackage.Literals.BINARY_EXPRESSION__LEFT_OPERAND));
			if (transientValues.isValueTransient(semanticObject, LtlPackage.Literals.BINARY_EXPRESSION__RIGHT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LtlPackage.Literals.BINARY_EXPRESSION__RIGHT_OPERAND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getArrowExpressionAccess().getEquivalenceExpressionLeftOperandAction_1_1_0(), semanticObject.getLeftOperand());
		feeder.accept(grammarAccess.getArrowExpressionAccess().getRightOperandArrowExpressionParserRuleCall_1_1_2_0(), semanticObject.getRightOperand());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LTLExpression returns ImplyExpression
	 *     ArrowExpression returns ImplyExpression
	 *     ArrowExpression.ImplyExpression_1_0_0 returns ImplyExpression
	 *     ArrowExpression.EquivalenceExpression_1_1_0 returns ImplyExpression
	 *     OrExpression returns ImplyExpression
	 *     OrExpression.OrExpression_1_0 returns ImplyExpression
	 *     AndExpression returns ImplyExpression
	 *     AndExpression.AndExpression_1_0 returns ImplyExpression
	 *     UntilExpression returns ImplyExpression
	 *     UntilExpression.UntilExpression_1_0 returns ImplyExpression
	 *     FutureGloballyExpression returns ImplyExpression
	 *     NextExpression returns ImplyExpression
	 *     PrimaryExpression returns ImplyExpression
	 *
	 * Constraint:
	 *     (leftOperand=ArrowExpression_ImplyExpression_1_0_0 rightOperand=ArrowExpression)
	 */
	protected void sequence_ArrowExpression(ISerializationContext context, ImplyExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LtlPackage.Literals.BINARY_EXPRESSION__LEFT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LtlPackage.Literals.BINARY_EXPRESSION__LEFT_OPERAND));
			if (transientValues.isValueTransient(semanticObject, LtlPackage.Literals.BINARY_EXPRESSION__RIGHT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LtlPackage.Literals.BINARY_EXPRESSION__RIGHT_OPERAND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getArrowExpressionAccess().getImplyExpressionLeftOperandAction_1_0_0(), semanticObject.getLeftOperand());
		feeder.accept(grammarAccess.getArrowExpressionAccess().getRightOperandArrowExpressionParserRuleCall_1_0_2_0(), semanticObject.getRightOperand());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LTLExpression returns AtomicProposition
	 *     ArrowExpression returns AtomicProposition
	 *     ArrowExpression.ImplyExpression_1_0_0 returns AtomicProposition
	 *     ArrowExpression.EquivalenceExpression_1_1_0 returns AtomicProposition
	 *     OrExpression returns AtomicProposition
	 *     OrExpression.OrExpression_1_0 returns AtomicProposition
	 *     AndExpression returns AtomicProposition
	 *     AndExpression.AndExpression_1_0 returns AtomicProposition
	 *     UntilExpression returns AtomicProposition
	 *     UntilExpression.UntilExpression_1_0 returns AtomicProposition
	 *     FutureGloballyExpression returns AtomicProposition
	 *     NextExpression returns AtomicProposition
	 *     PrimaryExpression returns AtomicProposition
	 *     LiteralExpression returns AtomicProposition
	 *     AtomicProposition returns AtomicProposition
	 *
	 * Constraint:
	 *     proposition=EString
	 */
	protected void sequence_AtomicProposition(ISerializationContext context, AtomicProposition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LtlPackage.Literals.ATOMIC_PROPOSITION__PROPOSITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LtlPackage.Literals.ATOMIC_PROPOSITION__PROPOSITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicPropositionAccess().getPropositionEStringParserRuleCall_1_0(), semanticObject.getProposition());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LTLExpression returns FalseExpression
	 *     ArrowExpression returns FalseExpression
	 *     ArrowExpression.ImplyExpression_1_0_0 returns FalseExpression
	 *     ArrowExpression.EquivalenceExpression_1_1_0 returns FalseExpression
	 *     OrExpression returns FalseExpression
	 *     OrExpression.OrExpression_1_0 returns FalseExpression
	 *     AndExpression returns FalseExpression
	 *     AndExpression.AndExpression_1_0 returns FalseExpression
	 *     UntilExpression returns FalseExpression
	 *     UntilExpression.UntilExpression_1_0 returns FalseExpression
	 *     FutureGloballyExpression returns FalseExpression
	 *     NextExpression returns FalseExpression
	 *     PrimaryExpression returns FalseExpression
	 *     LiteralExpression returns FalseExpression
	 *     FalseExpression returns FalseExpression
	 *
	 * Constraint:
	 *     {FalseExpression}
	 */
	protected void sequence_FalseExpression(ISerializationContext context, FalseExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LTLExpression returns FutureExpression
	 *     ArrowExpression returns FutureExpression
	 *     ArrowExpression.ImplyExpression_1_0_0 returns FutureExpression
	 *     ArrowExpression.EquivalenceExpression_1_1_0 returns FutureExpression
	 *     OrExpression returns FutureExpression
	 *     OrExpression.OrExpression_1_0 returns FutureExpression
	 *     AndExpression returns FutureExpression
	 *     AndExpression.AndExpression_1_0 returns FutureExpression
	 *     UntilExpression returns FutureExpression
	 *     UntilExpression.UntilExpression_1_0 returns FutureExpression
	 *     FutureGloballyExpression returns FutureExpression
	 *     NextExpression returns FutureExpression
	 *     PrimaryExpression returns FutureExpression
	 *
	 * Constraint:
	 *     operand=NextExpression
	 */
	protected void sequence_FutureGloballyExpression(ISerializationContext context, FutureExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LtlPackage.Literals.UNARY_EXPRESSION__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LtlPackage.Literals.UNARY_EXPRESSION__OPERAND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFutureGloballyExpressionAccess().getOperandNextExpressionParserRuleCall_0_2_0(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LTLExpression returns GloballyExpression
	 *     ArrowExpression returns GloballyExpression
	 *     ArrowExpression.ImplyExpression_1_0_0 returns GloballyExpression
	 *     ArrowExpression.EquivalenceExpression_1_1_0 returns GloballyExpression
	 *     OrExpression returns GloballyExpression
	 *     OrExpression.OrExpression_1_0 returns GloballyExpression
	 *     AndExpression returns GloballyExpression
	 *     AndExpression.AndExpression_1_0 returns GloballyExpression
	 *     UntilExpression returns GloballyExpression
	 *     UntilExpression.UntilExpression_1_0 returns GloballyExpression
	 *     FutureGloballyExpression returns GloballyExpression
	 *     NextExpression returns GloballyExpression
	 *     PrimaryExpression returns GloballyExpression
	 *
	 * Constraint:
	 *     operand=NextExpression
	 */
	protected void sequence_FutureGloballyExpression(ISerializationContext context, GloballyExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LtlPackage.Literals.UNARY_EXPRESSION__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LtlPackage.Literals.UNARY_EXPRESSION__OPERAND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFutureGloballyExpressionAccess().getOperandNextExpressionParserRuleCall_1_2_0(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LTLExpression returns NextExpression
	 *     ArrowExpression returns NextExpression
	 *     ArrowExpression.ImplyExpression_1_0_0 returns NextExpression
	 *     ArrowExpression.EquivalenceExpression_1_1_0 returns NextExpression
	 *     OrExpression returns NextExpression
	 *     OrExpression.OrExpression_1_0 returns NextExpression
	 *     AndExpression returns NextExpression
	 *     AndExpression.AndExpression_1_0 returns NextExpression
	 *     UntilExpression returns NextExpression
	 *     UntilExpression.UntilExpression_1_0 returns NextExpression
	 *     FutureGloballyExpression returns NextExpression
	 *     NextExpression returns NextExpression
	 *     PrimaryExpression returns NextExpression
	 *
	 * Constraint:
	 *     operand=PrimaryExpression
	 */
	protected void sequence_NextExpression(ISerializationContext context, NextExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LtlPackage.Literals.UNARY_EXPRESSION__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LtlPackage.Literals.UNARY_EXPRESSION__OPERAND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNextExpressionAccess().getOperandPrimaryExpressionParserRuleCall_0_2_0(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LTLExpression returns OrExpression
	 *     ArrowExpression returns OrExpression
	 *     ArrowExpression.ImplyExpression_1_0_0 returns OrExpression
	 *     ArrowExpression.EquivalenceExpression_1_1_0 returns OrExpression
	 *     OrExpression returns OrExpression
	 *     OrExpression.OrExpression_1_0 returns OrExpression
	 *     AndExpression returns OrExpression
	 *     AndExpression.AndExpression_1_0 returns OrExpression
	 *     UntilExpression returns OrExpression
	 *     UntilExpression.UntilExpression_1_0 returns OrExpression
	 *     FutureGloballyExpression returns OrExpression
	 *     NextExpression returns OrExpression
	 *     PrimaryExpression returns OrExpression
	 *
	 * Constraint:
	 *     (leftOperand=OrExpression_OrExpression_1_0 rightOperand=AndExpression)
	 */
	protected void sequence_OrExpression(ISerializationContext context, OrExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LtlPackage.Literals.BINARY_EXPRESSION__LEFT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LtlPackage.Literals.BINARY_EXPRESSION__LEFT_OPERAND));
			if (transientValues.isValueTransient(semanticObject, LtlPackage.Literals.BINARY_EXPRESSION__RIGHT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LtlPackage.Literals.BINARY_EXPRESSION__RIGHT_OPERAND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOrExpressionAccess().getOrExpressionLeftOperandAction_1_0(), semanticObject.getLeftOperand());
		feeder.accept(grammarAccess.getOrExpressionAccess().getRightOperandAndExpressionParserRuleCall_1_2_0(), semanticObject.getRightOperand());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LTLExpression returns NotExpression
	 *     ArrowExpression returns NotExpression
	 *     ArrowExpression.ImplyExpression_1_0_0 returns NotExpression
	 *     ArrowExpression.EquivalenceExpression_1_1_0 returns NotExpression
	 *     OrExpression returns NotExpression
	 *     OrExpression.OrExpression_1_0 returns NotExpression
	 *     AndExpression returns NotExpression
	 *     AndExpression.AndExpression_1_0 returns NotExpression
	 *     UntilExpression returns NotExpression
	 *     UntilExpression.UntilExpression_1_0 returns NotExpression
	 *     FutureGloballyExpression returns NotExpression
	 *     NextExpression returns NotExpression
	 *     PrimaryExpression returns NotExpression
	 *
	 * Constraint:
	 *     operand=PrimaryExpression
	 */
	protected void sequence_PrimaryExpression(ISerializationContext context, NotExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LtlPackage.Literals.UNARY_EXPRESSION__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LtlPackage.Literals.UNARY_EXPRESSION__OPERAND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getOperandPrimaryExpressionParserRuleCall_1_2_0(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LTLExpression returns TrueExpression
	 *     ArrowExpression returns TrueExpression
	 *     ArrowExpression.ImplyExpression_1_0_0 returns TrueExpression
	 *     ArrowExpression.EquivalenceExpression_1_1_0 returns TrueExpression
	 *     OrExpression returns TrueExpression
	 *     OrExpression.OrExpression_1_0 returns TrueExpression
	 *     AndExpression returns TrueExpression
	 *     AndExpression.AndExpression_1_0 returns TrueExpression
	 *     UntilExpression returns TrueExpression
	 *     UntilExpression.UntilExpression_1_0 returns TrueExpression
	 *     FutureGloballyExpression returns TrueExpression
	 *     NextExpression returns TrueExpression
	 *     PrimaryExpression returns TrueExpression
	 *     LiteralExpression returns TrueExpression
	 *     TrueExpression returns TrueExpression
	 *
	 * Constraint:
	 *     {TrueExpression}
	 */
	protected void sequence_TrueExpression(ISerializationContext context, TrueExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LTLExpression returns UntilExpression
	 *     ArrowExpression returns UntilExpression
	 *     ArrowExpression.ImplyExpression_1_0_0 returns UntilExpression
	 *     ArrowExpression.EquivalenceExpression_1_1_0 returns UntilExpression
	 *     OrExpression returns UntilExpression
	 *     OrExpression.OrExpression_1_0 returns UntilExpression
	 *     AndExpression returns UntilExpression
	 *     AndExpression.AndExpression_1_0 returns UntilExpression
	 *     UntilExpression returns UntilExpression
	 *     UntilExpression.UntilExpression_1_0 returns UntilExpression
	 *     FutureGloballyExpression returns UntilExpression
	 *     NextExpression returns UntilExpression
	 *     PrimaryExpression returns UntilExpression
	 *
	 * Constraint:
	 *     (leftOperand=UntilExpression_UntilExpression_1_0 rightOperand=UntilExpression)
	 */
	protected void sequence_UntilExpression(ISerializationContext context, UntilExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LtlPackage.Literals.BINARY_EXPRESSION__LEFT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LtlPackage.Literals.BINARY_EXPRESSION__LEFT_OPERAND));
			if (transientValues.isValueTransient(semanticObject, LtlPackage.Literals.BINARY_EXPRESSION__RIGHT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LtlPackage.Literals.BINARY_EXPRESSION__RIGHT_OPERAND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUntilExpressionAccess().getUntilExpressionLeftOperandAction_1_0(), semanticObject.getLeftOperand());
		feeder.accept(grammarAccess.getUntilExpressionAccess().getRightOperandUntilExpressionParserRuleCall_1_2_0(), semanticObject.getRightOperand());
		feeder.finish();
	}
	
	
}
