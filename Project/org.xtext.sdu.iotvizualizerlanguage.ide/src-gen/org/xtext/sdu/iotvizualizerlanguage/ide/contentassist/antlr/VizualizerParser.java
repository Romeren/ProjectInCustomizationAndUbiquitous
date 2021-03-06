/*
 * generated by Xtext 2.9.2
 */
package org.xtext.sdu.iotvizualizerlanguage.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.sdu.iotvizualizerlanguage.ide.contentassist.antlr.internal.InternalVizualizerParser;
import org.xtext.sdu.iotvizualizerlanguage.services.VizualizerGrammarAccess;

public class VizualizerParser extends AbstractContentAssistParser {

	@Inject
	private VizualizerGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalVizualizerParser createParser() {
		InternalVizualizerParser result = new InternalVizualizerParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSystemAccess().getAlternatives(), "rule__System__Alternatives");
					put(grammarAccess.getTileAccess().getAlternatives(), "rule__Tile__Alternatives");
					put(grammarAccess.getSourceAccess().getAlternatives(), "rule__Source__Alternatives");
					put(grammarAccess.getEndPointAccess().getAlternatives(), "rule__EndPoint__Alternatives");
					put(grammarAccess.getOp1Access().getAlternatives(), "rule__Op1__Alternatives");
					put(grammarAccess.getOp2Access().getAlternatives(), "rule__Op2__Alternatives");
					put(grammarAccess.getPrimitiveAccess().getAlternatives(), "rule__Primitive__Alternatives");
					put(grammarAccess.getSchemaTypeAccess().getAlternatives(), "rule__SchemaType__Alternatives");
					put(grammarAccess.getPageAccess().getGroup(), "rule__Page__Group__0");
					put(grammarAccess.getLinkAccess().getGroup(), "rule__Link__Group__0");
					put(grammarAccess.getGraphAccess().getGroup(), "rule__Graph__Group__0");
					put(grammarAccess.getGraphAccess().getGroup_3(), "rule__Graph__Group_3__0");
					put(grammarAccess.getDatasourceAccess().getGroup(), "rule__Datasource__Group__0");
					put(grammarAccess.getDatasourceAccess().getGroup_6(), "rule__Datasource__Group_6__0");
					put(grammarAccess.getDimensionAccess().getGroup(), "rule__Dimension__Group__0");
					put(grammarAccess.getDimensionAccess().getGroup_3(), "rule__Dimension__Group_3__0");
					put(grammarAccess.getDimensionSelectorAccess().getGroup(), "rule__DimensionSelector__Group__0");
					put(grammarAccess.getPostEndPointAccess().getGroup(), "rule__PostEndPoint__Group__0");
					put(grammarAccess.getGetEndPointAccess().getGroup(), "rule__GetEndPoint__Group__0");
					put(grammarAccess.getGetEndPointAccess().getGroup_5(), "rule__GetEndPoint__Group_5__0");
					put(grammarAccess.getGetEndPointAccess().getGroup_9(), "rule__GetEndPoint__Group_9__0");
					put(grammarAccess.getHeaderAccess().getGroup(), "rule__Header__Group__0");
					put(grammarAccess.getSchemaParserAccess().getGroup(), "rule__SchemaParser__Group__0");
					put(grammarAccess.getSelectorAccess().getGroup(), "rule__Selector__Group__0");
					put(grammarAccess.getSelectorAccess().getGroup_4(), "rule__Selector__Group_4__0");
					put(grammarAccess.getFormulaAccess().getGroup(), "rule__Formula__Group__0");
					put(grammarAccess.getFormulaAccess().getGroup_2(), "rule__Formula__Group_2__0");
					put(grammarAccess.getFormulaAccess().getGroup_2_1(), "rule__Formula__Group_2_1__0");
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
					put(grammarAccess.getFactorAccess().getGroup(), "rule__Factor__Group__0");
					put(grammarAccess.getFactorAccess().getGroup_1(), "rule__Factor__Group_1__0");
					put(grammarAccess.getPrimitiveAccess().getGroup_2(), "rule__Primitive__Group_2__0");
					put(grammarAccess.getSystemAccess().getPagesAssignment_0(), "rule__System__PagesAssignment_0");
					put(grammarAccess.getSystemAccess().getSourcesAssignment_1(), "rule__System__SourcesAssignment_1");
					put(grammarAccess.getSystemAccess().getSchemasAssignment_2(), "rule__System__SchemasAssignment_2");
					put(grammarAccess.getPageAccess().getNameAssignment_1(), "rule__Page__NameAssignment_1");
					put(grammarAccess.getPageAccess().getTilesAssignment_3(), "rule__Page__TilesAssignment_3");
					put(grammarAccess.getLinkAccess().getNameAssignment_1(), "rule__Link__NameAssignment_1");
					put(grammarAccess.getLinkAccess().getPageAssignment_3(), "rule__Link__PageAssignment_3");
					put(grammarAccess.getGraphAccess().getNameAssignment_1(), "rule__Graph__NameAssignment_1");
					put(grammarAccess.getGraphAccess().getSourceAssignment_2(), "rule__Graph__SourceAssignment_2");
					put(grammarAccess.getGraphAccess().getLaelAssignment_3_1(), "rule__Graph__LaelAssignment_3_1");
					put(grammarAccess.getDatasourceAccess().getNameAssignment_1(), "rule__Datasource__NameAssignment_1");
					put(grammarAccess.getDatasourceAccess().getDimensionsAssignment_5(), "rule__Datasource__DimensionsAssignment_5");
					put(grammarAccess.getDatasourceAccess().getDimensionsAssignment_6_1(), "rule__Datasource__DimensionsAssignment_6_1");
					put(grammarAccess.getDimensionAccess().getNameAssignment_1(), "rule__Dimension__NameAssignment_1");
					put(grammarAccess.getDimensionAccess().getSourceSelectorsAssignment_2(), "rule__Dimension__SourceSelectorsAssignment_2");
					put(grammarAccess.getDimensionAccess().getSourceSelectorsAssignment_3_1(), "rule__Dimension__SourceSelectorsAssignment_3_1");
					put(grammarAccess.getDimensionSelectorAccess().getSourceAssignment_1(), "rule__DimensionSelector__SourceAssignment_1");
					put(grammarAccess.getDimensionSelectorAccess().getSelectVarAssignment_3(), "rule__DimensionSelector__SelectVarAssignment_3");
					put(grammarAccess.getDimensionSelectorAccess().getNameAssignment_6(), "rule__DimensionSelector__NameAssignment_6");
					put(grammarAccess.getNoQuotesStringAccess().getNameAssignment(), "rule__NoQuotesString__NameAssignment");
					put(grammarAccess.getPostEndPointAccess().getNameAssignment_1(), "rule__PostEndPoint__NameAssignment_1");
					put(grammarAccess.getPostEndPointAccess().getUrlAssignment_4(), "rule__PostEndPoint__UrlAssignment_4");
					put(grammarAccess.getPostEndPointAccess().getParserAssignment_6(), "rule__PostEndPoint__ParserAssignment_6");
					put(grammarAccess.getGetEndPointAccess().getNameAssignment_1(), "rule__GetEndPoint__NameAssignment_1");
					put(grammarAccess.getGetEndPointAccess().getUrlAssignment_4(), "rule__GetEndPoint__UrlAssignment_4");
					put(grammarAccess.getGetEndPointAccess().getJsonAssignment_5_1(), "rule__GetEndPoint__JsonAssignment_5_1");
					put(grammarAccess.getGetEndPointAccess().getHeadersAssignment_8(), "rule__GetEndPoint__HeadersAssignment_8");
					put(grammarAccess.getGetEndPointAccess().getHeadersAssignment_9_1(), "rule__GetEndPoint__HeadersAssignment_9_1");
					put(grammarAccess.getGetEndPointAccess().getParserAssignment_12(), "rule__GetEndPoint__ParserAssignment_12");
					put(grammarAccess.getHeaderAccess().getKeywordAssignment_0(), "rule__Header__KeywordAssignment_0");
					put(grammarAccess.getHeaderAccess().getValueAssignment_2(), "rule__Header__ValueAssignment_2");
					put(grammarAccess.getSchemaParserAccess().getNameAssignment_1(), "rule__SchemaParser__NameAssignment_1");
					put(grammarAccess.getSchemaParserAccess().getSchemaTypeAssignment_5(), "rule__SchemaParser__SchemaTypeAssignment_5");
					put(grammarAccess.getSchemaParserAccess().getSelectorsAssignment_6(), "rule__SchemaParser__SelectorsAssignment_6");
					put(grammarAccess.getSelectorAccess().getNameAssignment_1(), "rule__Selector__NameAssignment_1");
					put(grammarAccess.getSelectorAccess().getStepsAssignment_3(), "rule__Selector__StepsAssignment_3");
					put(grammarAccess.getSelectorAccess().getStepsAssignment_4_1(), "rule__Selector__StepsAssignment_4_1");
					put(grammarAccess.getFormulaAccess().getNameAssignment_0(), "rule__Formula__NameAssignment_0");
					put(grammarAccess.getFormulaAccess().getVarsAssignment_2_0(), "rule__Formula__VarsAssignment_2_0");
					put(grammarAccess.getFormulaAccess().getVarsAssignment_2_1_1(), "rule__Formula__VarsAssignment_2_1_1");
					put(grammarAccess.getFormulaAccess().getExpAssignment_5(), "rule__Formula__ExpAssignment_5");
					put(grammarAccess.getExpressionAccess().getLeftAssignment_0(), "rule__Expression__LeftAssignment_0");
					put(grammarAccess.getExpressionAccess().getOpAssignment_1_0(), "rule__Expression__OpAssignment_1_0");
					put(grammarAccess.getExpressionAccess().getRightAssignment_1_1(), "rule__Expression__RightAssignment_1_1");
					put(grammarAccess.getFactorAccess().getLeftAssignment_0(), "rule__Factor__LeftAssignment_0");
					put(grammarAccess.getFactorAccess().getOpAssignment_1_0(), "rule__Factor__OpAssignment_1_0");
					put(grammarAccess.getFactorAccess().getRightAssignment_1_1(), "rule__Factor__RightAssignment_1_1");
					put(grammarAccess.getNumberAccess().getValAssignment(), "rule__Number__ValAssignment");
					put(grammarAccess.getVariableAccess().getNameAssignment(), "rule__Variable__NameAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalVizualizerParser typedParser = (InternalVizualizerParser) parser;
			typedParser.entryRuleSystem();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public VizualizerGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(VizualizerGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
