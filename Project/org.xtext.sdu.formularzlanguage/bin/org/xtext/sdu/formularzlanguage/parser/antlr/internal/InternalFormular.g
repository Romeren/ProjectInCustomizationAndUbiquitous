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
    	return "Expression";
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
					$current = forceCreateModelElement(
						grammarAccess.getExpressionAccess().getExpreessionAction_0_0(),
						$current);
				}
			)
			{
				newCompositeNode(grammarAccess.getExpressionAccess().getNumberParserRuleCall_0_1());
			}
			ruleNumber
			{
				afterParserOrEnumRuleCall();
			}
		)
		    |
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getVariableParserRuleCall_1());
		}
		this_Variable_2=ruleVariable
		{
			$current = $this_Variable_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			{
				newCompositeNode(grammarAccess.getExpressionAccess().getOperatorParserRuleCall_2_0());
			}
			ruleOperator
			{
				afterParserOrEnumRuleCall();
			}
			{
				newCompositeNode(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_2_1());
			}
			this_Expression_4=ruleExpression
			{
				$current = $this_Expression_4.current;
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleNumber
entryRuleNumber returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNumberRule()); }
	iv_ruleNumber=ruleNumber
	{ $current=$iv_ruleNumber.current.getText(); }
	EOF;

// Rule Number
ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_INT_0=RULE_INT
	{
		$current.merge(this_INT_0);
	}
	{
		newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall());
	}
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

// Entry rule entryRuleOperator
entryRuleOperator returns [String current=null]:
	{ newCompositeNode(grammarAccess.getOperatorRule()); }
	iv_ruleOperator=ruleOperator
	{ $current=$iv_ruleOperator.current.getText(); }
	EOF;

// Rule Operator
ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
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
			newLeafNode(kw, grammarAccess.getOperatorAccess().getPlusSignKeyword_0());
		}
		    |
		kw='-'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1());
		}
		    |
		kw='*'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOperatorAccess().getAsteriskKeyword_2());
		}
		    |
		kw='/'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOperatorAccess().getSolidusKeyword_3());
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
