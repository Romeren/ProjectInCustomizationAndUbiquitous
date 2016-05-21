/*
 * generated by Xtext 2.9.2
 */
grammar InternalVizualizer;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.sdu.iotvizualizerlanguage.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.sdu.iotvizualizerlanguage.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.sdu.iotvizualizerlanguage.services.VizualizerGrammarAccess;

}

@parser::members {

 	private VizualizerGrammarAccess grammarAccess;

    public InternalVizualizerParser(TokenStream input, VizualizerGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "System";
   	}

   	@Override
   	protected VizualizerGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleSystem
entryRuleSystem returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSystemRule()); }
	iv_ruleSystem=ruleSystem
	{ $current=$iv_ruleSystem.current; }
	EOF;

// Rule System
ruleSystem returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getSystemAccess().getPagesPageParserRuleCall_0_0());
				}
				lv_pages_0_0=rulePage
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSystemRule());
					}
					add(
						$current,
						"pages",
						lv_pages_0_0,
						"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.Page");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getSystemAccess().getSourcesSourceParserRuleCall_1_0());
				}
				lv_sources_1_0=ruleSource
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSystemRule());
					}
					add(
						$current,
						"sources",
						lv_sources_1_0,
						"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.Source");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getSystemAccess().getSchemasSchemaParserParserRuleCall_2_0());
				}
				lv_schemas_2_0=ruleSchemaParser
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSystemRule());
					}
					add(
						$current,
						"schemas",
						lv_schemas_2_0,
						"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.SchemaParser");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)*
;

// Entry rule entryRulePage
entryRulePage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPageRule()); }
	iv_rulePage=rulePage
	{ $current=$iv_rulePage.current; }
	EOF;

// Rule Page
rulePage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Page'
		{
			newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPageRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPageAccess().getTilesTileParserRuleCall_3_0());
				}
				lv_tiles_3_0=ruleTile
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPageRule());
					}
					add(
						$current,
						"tiles",
						lv_tiles_3_0,
						"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.Tile");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleTile
entryRuleTile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTileRule()); }
	iv_ruleTile=ruleTile
	{ $current=$iv_ruleTile.current; }
	EOF;

// Rule Tile
ruleTile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTileAccess().getLinkParserRuleCall_0());
		}
		this_Link_0=ruleLink
		{
			$current = $this_Link_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTileAccess().getGraphParserRuleCall_1());
		}
		this_Graph_1=ruleGraph
		{
			$current = $this_Graph_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleLink
entryRuleLink returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLinkRule()); }
	iv_ruleLink=ruleLink
	{ $current=$iv_ruleLink.current; }
	EOF;

// Rule Link
ruleLink returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Link'
		{
			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLinkRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='to'
		{
			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getToKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLinkRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getPagePageCrossReference_3_0());
				}
			)
		)
	)
;

// Entry rule entryRuleGraph
entryRuleGraph returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGraphRule()); }
	iv_ruleGraph=ruleGraph
	{ $current=$iv_ruleGraph.current; }
	EOF;

// Rule Graph
ruleGraph returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Graph'
		{
			newLeafNode(otherlv_0, grammarAccess.getGraphAccess().getGraphKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getGraphAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGraphRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGraphRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getGraphAccess().getSourceDatasourceCrossReference_2_0());
				}
			)
		)
	)
;

// Entry rule entryRuleDatasource
entryRuleDatasource returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDatasourceRule()); }
	iv_ruleDatasource=ruleDatasource
	{ $current=$iv_ruleDatasource.current; }
	EOF;

// Rule Datasource
ruleDatasource returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Datasource'
		{
			newLeafNode(otherlv_0, grammarAccess.getDatasourceAccess().getDatasourceKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDatasourceAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDatasourceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getDatasourceAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='Dimensions'
		{
			newLeafNode(otherlv_3, grammarAccess.getDatasourceAccess().getDimensionsKeyword_3());
		}
		otherlv_4=':'
		{
			newLeafNode(otherlv_4, grammarAccess.getDatasourceAccess().getColonKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDatasourceAccess().getDimensionsDimensionParserRuleCall_5_0());
				}
				lv_dimensions_5_0=ruleDimension
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDatasourceRule());
					}
					add(
						$current,
						"dimensions",
						lv_dimensions_5_0,
						"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.Dimension");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6=','
			{
				newLeafNode(otherlv_6, grammarAccess.getDatasourceAccess().getCommaKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDatasourceAccess().getDimensionsDimensionParserRuleCall_6_1_0());
					}
					lv_dimensions_7_0=ruleDimension
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDatasourceRule());
						}
						add(
							$current,
							"dimensions",
							lv_dimensions_7_0,
							"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.Dimension");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getDatasourceAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleDimension
entryRuleDimension returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDimensionRule()); }
	iv_ruleDimension=ruleDimension
	{ $current=$iv_ruleDimension.current; }
	EOF;

// Rule Dimension
ruleDimension returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Formula'
		{
			newLeafNode(otherlv_0, grammarAccess.getDimensionAccess().getFormulaKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDimensionAccess().getNameFormulaParserRuleCall_1_0());
				}
				lv_name_1_0=ruleFormula
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDimensionRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.sdu.formularzlanguage.Formular.Formula");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDimensionAccess().getSourceSelectorsDimensionSelectorParserRuleCall_2_0());
				}
				lv_sourceSelectors_2_0=ruleDimensionSelector
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDimensionRule());
					}
					add(
						$current,
						"sourceSelectors",
						lv_sourceSelectors_2_0,
						"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.DimensionSelector");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3='and'
			{
				newLeafNode(otherlv_3, grammarAccess.getDimensionAccess().getAndKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDimensionAccess().getSourceSelectorsDimensionSelectorParserRuleCall_3_1_0());
					}
					lv_sourceSelectors_4_0=ruleDimensionSelector
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDimensionRule());
						}
						add(
							$current,
							"sourceSelectors",
							lv_sourceSelectors_4_0,
							"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.DimensionSelector");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleDimensionSelector
entryRuleDimensionSelector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDimensionSelectorRule()); }
	iv_ruleDimensionSelector=ruleDimensionSelector
	{ $current=$iv_ruleDimensionSelector.current; }
	EOF;

// Rule DimensionSelector
ruleDimensionSelector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='using'
		{
			newLeafNode(otherlv_0, grammarAccess.getDimensionSelectorAccess().getUsingKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDimensionSelectorRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getDimensionSelectorAccess().getSourceSourceCrossReference_1_0());
				}
			)
		)
		otherlv_2='['
		{
			newLeafNode(otherlv_2, grammarAccess.getDimensionSelectorAccess().getLeftSquareBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDimensionSelectorAccess().getSelectVarNoQuotesStringParserRuleCall_3_0());
				}
				lv_selectVar_3_0=ruleNoQuotesString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDimensionSelectorRule());
					}
					set(
						$current,
						"selectVar",
						lv_selectVar_3_0,
						"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.NoQuotesString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=']'
		{
			newLeafNode(otherlv_4, grammarAccess.getDimensionSelectorAccess().getRightSquareBracketKeyword_4());
		}
		otherlv_5='as'
		{
			newLeafNode(otherlv_5, grammarAccess.getDimensionSelectorAccess().getAsKeyword_5());
		}
		(
			(
				lv_name_6_0=RULE_ID
				{
					newLeafNode(lv_name_6_0, grammarAccess.getDimensionSelectorAccess().getNameIDTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDimensionSelectorRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_6_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleNoQuotesString
entryRuleNoQuotesString returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNoQuotesStringRule()); }
	iv_ruleNoQuotesString=ruleNoQuotesString
	{ $current=$iv_ruleNoQuotesString.current; }
	EOF;

// Rule NoQuotesString
ruleNoQuotesString returns [EObject current=null]
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
				newLeafNode(lv_name_0_0, grammarAccess.getNoQuotesStringAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getNoQuotesStringRule());
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

// Entry rule entryRuleSource
entryRuleSource returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSourceRule()); }
	iv_ruleSource=ruleSource
	{ $current=$iv_ruleSource.current; }
	EOF;

// Rule Source
ruleSource returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getSourceAccess().getEndPointParserRuleCall_0());
		}
		this_EndPoint_0=ruleEndPoint
		{
			$current = $this_EndPoint_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSourceAccess().getDatasourceParserRuleCall_1());
		}
		this_Datasource_1=ruleDatasource
		{
			$current = $this_Datasource_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEndPoint
entryRuleEndPoint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEndPointRule()); }
	iv_ruleEndPoint=ruleEndPoint
	{ $current=$iv_ruleEndPoint.current; }
	EOF;

// Rule EndPoint
ruleEndPoint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getEndPointAccess().getGetEndPointParserRuleCall_0());
		}
		this_GetEndPoint_0=ruleGetEndPoint
		{
			$current = $this_GetEndPoint_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getEndPointAccess().getPostEndPointParserRuleCall_1());
		}
		this_PostEndPoint_1=rulePostEndPoint
		{
			$current = $this_PostEndPoint_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePostEndPoint
entryRulePostEndPoint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPostEndPointRule()); }
	iv_rulePostEndPoint=rulePostEndPoint
	{ $current=$iv_rulePostEndPoint.current; }
	EOF;

// Rule PostEndPoint
rulePostEndPoint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='PostPoint'
		{
			newLeafNode(otherlv_0, grammarAccess.getPostEndPointAccess().getPostPointKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPostEndPointAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPostEndPointRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getPostEndPointAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='url'
		{
			newLeafNode(otherlv_3, grammarAccess.getPostEndPointAccess().getUrlKeyword_3());
		}
		(
			(
				lv_url_4_0=RULE_STRING
				{
					newLeafNode(lv_url_4_0, grammarAccess.getPostEndPointAccess().getUrlSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPostEndPointRule());
					}
					setWithLastConsumed(
						$current,
						"url",
						lv_url_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_5='use Schema'
		{
			newLeafNode(otherlv_5, grammarAccess.getPostEndPointAccess().getUseSchemaKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPostEndPointRule());
					}
				}
				otherlv_6=RULE_ID
				{
					newLeafNode(otherlv_6, grammarAccess.getPostEndPointAccess().getParserSchemaParserCrossReference_6_0());
				}
			)
		)
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getPostEndPointAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleGetEndPoint
entryRuleGetEndPoint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGetEndPointRule()); }
	iv_ruleGetEndPoint=ruleGetEndPoint
	{ $current=$iv_ruleGetEndPoint.current; }
	EOF;

// Rule GetEndPoint
ruleGetEndPoint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GetPoint'
		{
			newLeafNode(otherlv_0, grammarAccess.getGetEndPointAccess().getGetPointKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getGetEndPointAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGetEndPointRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getGetEndPointAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='url'
		{
			newLeafNode(otherlv_3, grammarAccess.getGetEndPointAccess().getUrlKeyword_3());
		}
		(
			(
				lv_url_4_0=RULE_STRING
				{
					newLeafNode(lv_url_4_0, grammarAccess.getGetEndPointAccess().getUrlSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGetEndPointRule());
					}
					setWithLastConsumed(
						$current,
						"url",
						lv_url_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_5='Headers'
		{
			newLeafNode(otherlv_5, grammarAccess.getGetEndPointAccess().getHeadersKeyword_5());
		}
		otherlv_6='{'
		{
			newLeafNode(otherlv_6, grammarAccess.getGetEndPointAccess().getLeftCurlyBracketKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGetEndPointAccess().getHeadersHeaderParserRuleCall_7_0());
				}
				lv_headers_7_0=ruleHeader
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGetEndPointRule());
					}
					add(
						$current,
						"headers",
						lv_headers_7_0,
						"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.Header");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_8=','
			{
				newLeafNode(otherlv_8, grammarAccess.getGetEndPointAccess().getCommaKeyword_8_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGetEndPointAccess().getHeadersHeaderParserRuleCall_8_1_0());
					}
					lv_headers_9_0=ruleHeader
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGetEndPointRule());
						}
						add(
							$current,
							"headers",
							lv_headers_9_0,
							"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.Header");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getGetEndPointAccess().getRightCurlyBracketKeyword_9());
		}
		otherlv_11='use Schema'
		{
			newLeafNode(otherlv_11, grammarAccess.getGetEndPointAccess().getUseSchemaKeyword_10());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGetEndPointRule());
					}
				}
				otherlv_12=RULE_ID
				{
					newLeafNode(otherlv_12, grammarAccess.getGetEndPointAccess().getParserSchemaParserCrossReference_11_0());
				}
			)
		)
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getGetEndPointAccess().getRightCurlyBracketKeyword_12());
		}
	)
;

// Entry rule entryRuleHeader
entryRuleHeader returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHeaderRule()); }
	iv_ruleHeader=ruleHeader
	{ $current=$iv_ruleHeader.current; }
	EOF;

// Rule Header
ruleHeader returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_keyword_0_0=RULE_STRING
				{
					newLeafNode(lv_keyword_0_0, grammarAccess.getHeaderAccess().getKeywordSTRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getHeaderRule());
					}
					setWithLastConsumed(
						$current,
						"keyword",
						lv_keyword_0_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getHeaderAccess().getColonKeyword_1());
		}
		(
			(
				lv_value_2_0=RULE_STRING
				{
					newLeafNode(lv_value_2_0, grammarAccess.getHeaderAccess().getValueSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getHeaderRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleSchemaParser
entryRuleSchemaParser returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSchemaParserRule()); }
	iv_ruleSchemaParser=ruleSchemaParser
	{ $current=$iv_ruleSchemaParser.current; }
	EOF;

// Rule SchemaParser
ruleSchemaParser returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Schema'
		{
			newLeafNode(otherlv_0, grammarAccess.getSchemaParserAccess().getSchemaKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSchemaParserAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSchemaParserRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getSchemaParserAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='SchemaType'
		{
			newLeafNode(otherlv_3, grammarAccess.getSchemaParserAccess().getSchemaTypeKeyword_3());
		}
		otherlv_4='='
		{
			newLeafNode(otherlv_4, grammarAccess.getSchemaParserAccess().getEqualsSignKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSchemaParserAccess().getSchemaTypeSchemaTypeEnumRuleCall_5_0());
				}
				lv_schemaType_5_0=ruleSchemaType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSchemaParserRule());
					}
					set(
						$current,
						"schemaType",
						lv_schemaType_5_0,
						"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.SchemaType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSchemaParserAccess().getSelectorsSelectorParserRuleCall_6_0());
				}
				lv_selectors_6_0=ruleSelector
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSchemaParserRule());
					}
					add(
						$current,
						"selectors",
						lv_selectors_6_0,
						"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.Selector");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getSchemaParserAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleSelector
entryRuleSelector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSelectorRule()); }
	iv_ruleSelector=ruleSelector
	{ $current=$iv_ruleSelector.current; }
	EOF;

// Rule Selector
ruleSelector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Selector as '
		{
			newLeafNode(otherlv_0, grammarAccess.getSelectorAccess().getSelectorAsKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSelectorAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSelectorRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getSelectorAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				lv_steps_3_0=RULE_STRING
				{
					newLeafNode(lv_steps_3_0, grammarAccess.getSelectorAccess().getStepsSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSelectorRule());
					}
					addWithLastConsumed(
						$current,
						"steps",
						lv_steps_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			otherlv_4=' -> '
			{
				newLeafNode(otherlv_4, grammarAccess.getSelectorAccess().getSpaceHyphenMinusGreaterThanSignSpaceKeyword_4_0());
			}
			(
				(
					lv_steps_5_0=RULE_STRING
					{
						newLeafNode(lv_steps_5_0, grammarAccess.getSelectorAccess().getStepsSTRINGTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSelectorRule());
						}
						addWithLastConsumed(
							$current,
							"steps",
							lv_steps_5_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)+
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getSelectorAccess().getRightCurlyBracketKeyword_5());
		}
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

// Rule SchemaType
ruleSchemaType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='XML'
			{
				$current = grammarAccess.getSchemaTypeAccess().getXMLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getSchemaTypeAccess().getXMLEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='CSV'
			{
				$current = grammarAccess.getSchemaTypeAccess().getCSVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getSchemaTypeAccess().getCSVEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='JSON'
			{
				$current = grammarAccess.getSchemaTypeAccess().getJSONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getSchemaTypeAccess().getJSONEnumLiteralDeclaration_2());
			}
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
