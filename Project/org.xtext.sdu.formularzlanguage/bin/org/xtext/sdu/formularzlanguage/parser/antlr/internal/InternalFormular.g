/*
 * generated by Xtext 2.9.2
 */
grammar InternalFormular;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.sdu.formularzlanguage.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.sdu.formularzlanguage.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.sdu.formularzlanguage.services.FormularGrammarAccess;

}

@parser::members {

 	private FormularGrammarAccess grammarAccess;

    public InternalFormularParser(TokenStream input, FormularGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Math";
   	}

   	@Override
   	protected FormularGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleMath
entryRuleMath returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMathRule()); }
	iv_ruleMath=ruleMath
	{ $current=$iv_ruleMath.current; }
	EOF;

// Rule Math
ruleMath returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getMathAccess().getFormularsFormulaParserRuleCall_0());
			}
			lv_formulars_0_0=ruleFormula
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getMathRule());
				}
				add(
					$current,
					"formulars",
					lv_formulars_0_0,
					"org.xtext.sdu.formularzlanguage.Formular.Formula");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getExpressionAccess().getLeftFactorParserRuleCall_0_0());
				}
				lv_left_0_0=ruleFactor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExpressionRule());
					}
					set(
						$current,
						"left",
						lv_left_0_0,
						"org.xtext.sdu.formularzlanguage.Formular.Factor");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getExpressionAccess().getOpOp1ParserRuleCall_1_0_0());
					}
					lv_op_1_0=ruleOp1
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpressionRule());
						}
						set(
							$current,
							"op",
							lv_op_1_0,
							"org.xtext.sdu.formularzlanguage.Formular.Op1");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_1_0());
					}
					lv_right_2_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_2_0,
							"org.xtext.sdu.formularzlanguage.Formular.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleOp1
entryRuleOp1 returns [String current=null]:
	{ newCompositeNode(grammarAccess.getOp1Rule()); }
	iv_ruleOp1=ruleOp1
	{ $current=$iv_ruleOp1.current.getText(); }
	EOF;

// Rule Op1
ruleOp1 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='+'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOp1Access().getPlusSignKeyword_0());
		}
		    |
		kw='-'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOp1Access().getHyphenMinusKeyword_1());
		}
	)
;

// Entry rule entryRuleFactor
entryRuleFactor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFactorRule()); }
	iv_ruleFactor=ruleFactor
	{ $current=$iv_ruleFactor.current; }
	EOF;

// Rule Factor
ruleFactor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getFactorAccess().getLeftPrimitiveParserRuleCall_0_0());
				}
				lv_left_0_0=rulePrimitive
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFactorRule());
					}
					set(
						$current,
						"left",
						lv_left_0_0,
						"org.xtext.sdu.formularzlanguage.Formular.Primitive");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getFactorAccess().getOpOp2ParserRuleCall_1_0_0());
					}
					lv_op_1_0=ruleOp2
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFactorRule());
						}
						set(
							$current,
							"op",
							lv_op_1_0,
							"org.xtext.sdu.formularzlanguage.Formular.Op2");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getFactorAccess().getRightFactorParserRuleCall_1_1_0());
					}
					lv_right_2_0=ruleFactor
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFactorRule());
						}
						set(
							$current,
							"right",
							lv_right_2_0,
							"org.xtext.sdu.formularzlanguage.Formular.Factor");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleOp2
entryRuleOp2 returns [String current=null]:
	{ newCompositeNode(grammarAccess.getOp2Rule()); }
	iv_ruleOp2=ruleOp2
	{ $current=$iv_ruleOp2.current.getText(); }
	EOF;

// Rule Op2
ruleOp2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='*'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOp2Access().getAsteriskKeyword_0());
		}
		    |
		kw='/'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOp2Access().getSolidusKeyword_1());
		}
	)
;

// Entry rule entryRulePrimitive
entryRulePrimitive returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimitiveRule()); }
	iv_rulePrimitive=rulePrimitive
	{ $current=$iv_rulePrimitive.current; }
	EOF;

// Rule Primitive
rulePrimitive returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPrimitiveAccess().getNumberParserRuleCall_0());
		}
		this_Number_0=ruleNumber
		{
			$current = $this_Number_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimitiveAccess().getVariableParserRuleCall_1());
		}
		this_Variable_1=ruleVariable
		{
			$current = $this_Variable_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			otherlv_2='('
			{
				newLeafNode(otherlv_2, grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_2_0());
			}
			{
				newCompositeNode(grammarAccess.getPrimitiveAccess().getExpressionParserRuleCall_2_1());
			}
			this_Expression_3=ruleExpression
			{
				$current = $this_Expression_3.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_4=')'
			{
				newLeafNode(otherlv_4, grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_2_2());
			}
		)
	)
;

// Entry rule entryRuleNumber
entryRuleNumber returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNumberRule()); }
	iv_ruleNumber=ruleNumber
	{ $current=$iv_ruleNumber.current; }
	EOF;

// Rule Number
ruleNumber returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_val_0_0=RULE_INT
			{
				newLeafNode(lv_val_0_0, grammarAccess.getNumberAccess().getValINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getNumberRule());
				}
				setWithLastConsumed(
					$current,
					"val",
					lv_val_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	iv_ruleVariable=ruleVariable
	{ $current=$iv_ruleVariable.current; }
	EOF;

// Rule Variable
ruleVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getVariableRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleFormula
entryRuleFormula returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFormulaRule()); }
	iv_ruleFormula=ruleFormula
	{ $current=$iv_ruleFormula.current; }
	EOF;

// Rule Formula
ruleFormula returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getFormulaAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFormulaRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getFormulaAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getFormulaAccess().getVarsVariableParserRuleCall_2_0_0());
					}
					lv_vars_2_0=ruleVariable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFormulaRule());
						}
						add(
							$current,
							"vars",
							lv_vars_2_0,
							"org.xtext.sdu.formularzlanguage.Formular.Variable");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3=','
				{
					newLeafNode(otherlv_3, grammarAccess.getFormulaAccess().getCommaKeyword_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getFormulaAccess().getVarsVariableParserRuleCall_2_1_1_0());
						}
						lv_vars_4_0=ruleVariable
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFormulaRule());
							}
							add(
								$current,
								"vars",
								lv_vars_4_0,
								"org.xtext.sdu.formularzlanguage.Formular.Variable");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getFormulaAccess().getRightParenthesisKeyword_3());
		}
		otherlv_6='='
		{
			newLeafNode(otherlv_6, grammarAccess.getFormulaAccess().getEqualsSignKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFormulaAccess().getExpExpressionParserRuleCall_5_0());
				}
				lv_exp_7_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFormulaRule());
					}
					set(
						$current,
						"exp",
						lv_exp_7_0,
						"org.xtext.sdu.formularzlanguage.Formular.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
