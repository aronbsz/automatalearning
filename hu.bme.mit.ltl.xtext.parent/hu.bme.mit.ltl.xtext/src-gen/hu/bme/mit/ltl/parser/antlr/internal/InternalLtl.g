/*
 * generated by Xtext 2.20.0
 */
grammar InternalLtl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package hu.bme.mit.ltl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package hu.bme.mit.ltl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hu.bme.mit.ltl.services.LtlGrammarAccess;

}

@parser::members {

 	private LtlGrammarAccess grammarAccess;

    public InternalLtlParser(TokenStream input, LtlGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "LTLExpression";
   	}

   	@Override
   	protected LtlGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleLTLExpression
entryRuleLTLExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLTLExpressionRule()); }
	iv_ruleLTLExpression=ruleLTLExpression
	{ $current=$iv_ruleLTLExpression.current; }
	EOF;

// Rule LTLExpression
ruleLTLExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getLTLExpressionAccess().getArrowExpressionParserRuleCall());
	}
	this_ArrowExpression_0=ruleArrowExpression
	{
		$current = $this_ArrowExpression_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleArrowExpression
entryRuleArrowExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getArrowExpressionRule()); }
	iv_ruleArrowExpression=ruleArrowExpression
	{ $current=$iv_ruleArrowExpression.current; }
	EOF;

// Rule ArrowExpression
ruleArrowExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getArrowExpressionAccess().getOrExpressionParserRuleCall_0());
		}
		this_OrExpression_0=ruleOrExpression
		{
			$current = $this_OrExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getArrowExpressionAccess().getImplyExpressionLeftOperandAction_1_0_0(),
							$current);
					}
				)
				otherlv_2='->'
				{
					newLeafNode(otherlv_2, grammarAccess.getArrowExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_0_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getArrowExpressionAccess().getRightOperandArrowExpressionParserRuleCall_1_0_2_0());
						}
						lv_rightOperand_3_0=ruleArrowExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getArrowExpressionRule());
							}
							set(
								$current,
								"rightOperand",
								lv_rightOperand_3_0,
								"hu.bme.mit.ltl.Ltl.ArrowExpression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getArrowExpressionAccess().getEquivalenceExpressionLeftOperandAction_1_1_0(),
							$current);
					}
				)
				otherlv_5='<->'
				{
					newLeafNode(otherlv_5, grammarAccess.getArrowExpressionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_1_1_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getArrowExpressionAccess().getRightOperandArrowExpressionParserRuleCall_1_1_2_0());
						}
						lv_rightOperand_6_0=ruleArrowExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getArrowExpressionRule());
							}
							set(
								$current,
								"rightOperand",
								lv_rightOperand_6_0,
								"hu.bme.mit.ltl.Ltl.ArrowExpression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)?
	)
;

// Entry rule entryRuleOrExpression
entryRuleOrExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOrExpressionRule()); }
	iv_ruleOrExpression=ruleOrExpression
	{ $current=$iv_ruleOrExpression.current; }
	EOF;

// Rule OrExpression
ruleOrExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
		}
		this_AndExpression_0=ruleAndExpression
		{
			$current = $this_AndExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getOrExpressionAccess().getOrExpressionLeftOperandAction_1_0(),
						$current);
				}
			)
			otherlv_2='|'
			{
				newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getVerticalLineKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightOperandAndExpressionParserRuleCall_1_2_0());
					}
					lv_rightOperand_3_0=ruleAndExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOrExpressionRule());
						}
						set(
							$current,
							"rightOperand",
							lv_rightOperand_3_0,
							"hu.bme.mit.ltl.Ltl.AndExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAndExpression
entryRuleAndExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAndExpressionRule()); }
	iv_ruleAndExpression=ruleAndExpression
	{ $current=$iv_ruleAndExpression.current; }
	EOF;

// Rule AndExpression
ruleAndExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAndExpressionAccess().getUntilExpressionParserRuleCall_0());
		}
		this_UntilExpression_0=ruleUntilExpression
		{
			$current = $this_UntilExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAndExpressionAccess().getAndExpressionLeftOperandAction_1_0(),
						$current);
				}
			)
			otherlv_2='&'
			{
				newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAmpersandKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightOperandUntilExpressionParserRuleCall_1_2_0());
					}
					lv_rightOperand_3_0=ruleUntilExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAndExpressionRule());
						}
						set(
							$current,
							"rightOperand",
							lv_rightOperand_3_0,
							"hu.bme.mit.ltl.Ltl.UntilExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleUntilExpression
entryRuleUntilExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUntilExpressionRule()); }
	iv_ruleUntilExpression=ruleUntilExpression
	{ $current=$iv_ruleUntilExpression.current; }
	EOF;

// Rule UntilExpression
ruleUntilExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getUntilExpressionAccess().getFutureGloballyExpressionParserRuleCall_0());
		}
		this_FutureGloballyExpression_0=ruleFutureGloballyExpression
		{
			$current = $this_FutureGloballyExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getUntilExpressionAccess().getUntilExpressionLeftOperandAction_1_0(),
						$current);
				}
			)
			otherlv_2='U'
			{
				newLeafNode(otherlv_2, grammarAccess.getUntilExpressionAccess().getUKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getUntilExpressionAccess().getRightOperandUntilExpressionParserRuleCall_1_2_0());
					}
					lv_rightOperand_3_0=ruleUntilExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getUntilExpressionRule());
						}
						set(
							$current,
							"rightOperand",
							lv_rightOperand_3_0,
							"hu.bme.mit.ltl.Ltl.UntilExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleFutureGloballyExpression
entryRuleFutureGloballyExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFutureGloballyExpressionRule()); }
	iv_ruleFutureGloballyExpression=ruleFutureGloballyExpression
	{ $current=$iv_ruleFutureGloballyExpression.current; }
	EOF;

// Rule FutureGloballyExpression
ruleFutureGloballyExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='F'
			{
				newLeafNode(otherlv_0, grammarAccess.getFutureGloballyExpressionAccess().getFKeyword_0_0());
			}
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getFutureGloballyExpressionAccess().getFutureExpressionAction_0_1(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getFutureGloballyExpressionAccess().getOperandNextExpressionParserRuleCall_0_2_0());
					}
					lv_operand_2_0=ruleNextExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFutureGloballyExpressionRule());
						}
						set(
							$current,
							"operand",
							lv_operand_2_0,
							"hu.bme.mit.ltl.Ltl.NextExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_3='G'
			{
				newLeafNode(otherlv_3, grammarAccess.getFutureGloballyExpressionAccess().getGKeyword_1_0());
			}
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getFutureGloballyExpressionAccess().getGloballyExpressionAction_1_1(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getFutureGloballyExpressionAccess().getOperandNextExpressionParserRuleCall_1_2_0());
					}
					lv_operand_5_0=ruleNextExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFutureGloballyExpressionRule());
						}
						set(
							$current,
							"operand",
							lv_operand_5_0,
							"hu.bme.mit.ltl.Ltl.NextExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		{
			newCompositeNode(grammarAccess.getFutureGloballyExpressionAccess().getNextExpressionParserRuleCall_2());
		}
		this_NextExpression_6=ruleNextExpression
		{
			$current = $this_NextExpression_6.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleNextExpression
entryRuleNextExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNextExpressionRule()); }
	iv_ruleNextExpression=ruleNextExpression
	{ $current=$iv_ruleNextExpression.current; }
	EOF;

// Rule NextExpression
ruleNextExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='X'
			{
				newLeafNode(otherlv_0, grammarAccess.getNextExpressionAccess().getXKeyword_0_0());
			}
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getNextExpressionAccess().getNextExpressionAction_0_1(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getNextExpressionAccess().getOperandPrimaryExpressionParserRuleCall_0_2_0());
					}
					lv_operand_2_0=rulePrimaryExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNextExpressionRule());
						}
						set(
							$current,
							"operand",
							lv_operand_2_0,
							"hu.bme.mit.ltl.Ltl.PrimaryExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		{
			newCompositeNode(grammarAccess.getNextExpressionAccess().getPrimaryExpressionParserRuleCall_1());
		}
		this_PrimaryExpression_3=rulePrimaryExpression
		{
			$current = $this_PrimaryExpression_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePrimaryExpression
entryRulePrimaryExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryExpressionRule()); }
	iv_rulePrimaryExpression=rulePrimaryExpression
	{ $current=$iv_rulePrimaryExpression.current; }
	EOF;

// Rule PrimaryExpression
rulePrimaryExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='('
			{
				newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
			}
			{
				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLTLExpressionParserRuleCall_0_1());
			}
			this_LTLExpression_1=ruleLTLExpression
			{
				$current = $this_LTLExpression_1.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_2=')'
			{
				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimaryExpressionAccess().getNotExpressionAction_1_0(),
						$current);
				}
			)
			otherlv_4='!'
			{
				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getExclamationMarkKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOperandPrimaryExpressionParserRuleCall_1_2_0());
					}
					lv_operand_5_0=rulePrimaryExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
						}
						set(
							$current,
							"operand",
							lv_operand_5_0,
							"hu.bme.mit.ltl.Ltl.PrimaryExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralExpressionParserRuleCall_2());
		}
		this_LiteralExpression_6=ruleLiteralExpression
		{
			$current = $this_LiteralExpression_6.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleLiteralExpression
entryRuleLiteralExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLiteralExpressionRule()); }
	iv_ruleLiteralExpression=ruleLiteralExpression
	{ $current=$iv_ruleLiteralExpression.current; }
	EOF;

// Rule LiteralExpression
ruleLiteralExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getAtomicPropositionParserRuleCall_0());
		}
		this_AtomicProposition_0=ruleAtomicProposition
		{
			$current = $this_AtomicProposition_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getTrueExpressionParserRuleCall_1());
		}
		this_TrueExpression_1=ruleTrueExpression
		{
			$current = $this_TrueExpression_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getFalseExpressionParserRuleCall_2());
		}
		this_FalseExpression_2=ruleFalseExpression
		{
			$current = $this_FalseExpression_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFalseExpression
entryRuleFalseExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFalseExpressionRule()); }
	iv_ruleFalseExpression=ruleFalseExpression
	{ $current=$iv_ruleFalseExpression.current; }
	EOF;

// Rule FalseExpression
ruleFalseExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFalseExpressionAccess().getFalseExpressionAction_0(),
					$current);
			}
		)
		otherlv_1='false'
		{
			newLeafNode(otherlv_1, grammarAccess.getFalseExpressionAccess().getFalseKeyword_1());
		}
	)
;

// Entry rule entryRuleTrueExpression
entryRuleTrueExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTrueExpressionRule()); }
	iv_ruleTrueExpression=ruleTrueExpression
	{ $current=$iv_ruleTrueExpression.current; }
	EOF;

// Rule TrueExpression
ruleTrueExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTrueExpressionAccess().getTrueExpressionAction_0(),
					$current);
			}
		)
		otherlv_1='true'
		{
			newLeafNode(otherlv_1, grammarAccess.getTrueExpressionAccess().getTrueKeyword_1());
		}
	)
;

// Entry rule entryRuleAtomicProposition
entryRuleAtomicProposition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAtomicPropositionRule()); }
	iv_ruleAtomicProposition=ruleAtomicProposition
	{ $current=$iv_ruleAtomicProposition.current; }
	EOF;

// Rule AtomicProposition
ruleAtomicProposition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getAtomicPropositionAccess().getAtomicPropositionAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAtomicPropositionAccess().getPropositionEStringParserRuleCall_1_0());
				}
				lv_proposition_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAtomicPropositionRule());
					}
					set(
						$current,
						"proposition",
						lv_proposition_1_0,
						"hu.bme.mit.ltl.Ltl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
