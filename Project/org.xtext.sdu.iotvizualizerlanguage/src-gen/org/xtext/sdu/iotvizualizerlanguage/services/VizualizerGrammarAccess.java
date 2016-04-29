/*
 * generated by Xtext 2.9.2
 */
package org.xtext.sdu.iotvizualizerlanguage.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;
import org.xtext.sdu.formularzlanguage.services.FormularGrammarAccess;

@Singleton
public class VizualizerGrammarAccess extends AbstractGrammarElementFinder {
	
	public class SystemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.sdu.iotvizualizerlanguage.Vizualizer.System");
		private final Assignment cPagesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cPagesPageParserRuleCall_0 = (RuleCall)cPagesAssignment.eContents().get(0);
		
		//System:
		//	pages+=Page*;
		@Override public ParserRule getRule() { return rule; }
		
		//pages+=Page*
		public Assignment getPagesAssignment() { return cPagesAssignment; }
		
		//Page
		public RuleCall getPagesPageParserRuleCall_0() { return cPagesPageParserRuleCall_0; }
	}
	public class PageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.sdu.iotvizualizerlanguage.Vizualizer.Page");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTilesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTilesTileParserRuleCall_3_0 = (RuleCall)cTilesAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Page:
		//	'Page' name=ID
		//	'{'
		//	tiles+=Tile*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Page' name=ID '{' tiles+=Tile* '}'
		public Group getGroup() { return cGroup; }
		
		//'Page'
		public Keyword getPageKeyword_0() { return cPageKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//tiles+=Tile*
		public Assignment getTilesAssignment_3() { return cTilesAssignment_3; }
		
		//Tile
		public RuleCall getTilesTileParserRuleCall_3_0() { return cTilesTileParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class TileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.sdu.iotvizualizerlanguage.Vizualizer.Tile");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cLinkParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cGraphParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Tile:
		//	Link | Graph;
		@Override public ParserRule getRule() { return rule; }
		
		//Link | Graph
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Link
		public RuleCall getLinkParserRuleCall_0() { return cLinkParserRuleCall_0; }
		
		//Graph
		public RuleCall getGraphParserRuleCall_1() { return cGraphParserRuleCall_1; }
	}
	public class LinkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.sdu.iotvizualizerlanguage.Vizualizer.Link");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLinkKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cToKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPageAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cPagePageCrossReference_3_0 = (CrossReference)cPageAssignment_3.eContents().get(0);
		private final RuleCall cPagePageIDTerminalRuleCall_3_0_1 = (RuleCall)cPagePageCrossReference_3_0.eContents().get(1);
		
		//Link:
		//	'Link' name=ID 'to' page=[Page];
		@Override public ParserRule getRule() { return rule; }
		
		//'Link' name=ID 'to' page=[Page]
		public Group getGroup() { return cGroup; }
		
		//'Link'
		public Keyword getLinkKeyword_0() { return cLinkKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'to'
		public Keyword getToKeyword_2() { return cToKeyword_2; }
		
		//page=[Page]
		public Assignment getPageAssignment_3() { return cPageAssignment_3; }
		
		//[Page]
		public CrossReference getPagePageCrossReference_3_0() { return cPagePageCrossReference_3_0; }
		
		//ID
		public RuleCall getPagePageIDTerminalRuleCall_3_0_1() { return cPagePageIDTerminalRuleCall_3_0_1; }
	}
	public class GraphElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.sdu.iotvizualizerlanguage.Vizualizer.Graph");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGraphKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Graph:
		//	'Graph' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'Graph' name=ID
		public Group getGroup() { return cGroup; }
		
		//'Graph'
		public Keyword getGraphKeyword_0() { return cGraphKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	
	
	private final SystemElements pSystem;
	private final PageElements pPage;
	private final TileElements pTile;
	private final LinkElements pLink;
	private final GraphElements pGraph;
	
	private final Grammar grammar;
	
	private final FormularGrammarAccess gaFormular;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public VizualizerGrammarAccess(GrammarProvider grammarProvider,
			FormularGrammarAccess gaFormular,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaFormular = gaFormular;
		this.gaTerminals = gaTerminals;
		this.pSystem = new SystemElements();
		this.pPage = new PageElements();
		this.pTile = new TileElements();
		this.pLink = new LinkElements();
		this.pGraph = new GraphElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.sdu.iotvizualizerlanguage.Vizualizer".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public FormularGrammarAccess getFormularGrammarAccess() {
		return gaFormular;
	}
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//System:
	//	pages+=Page*;
	public SystemElements getSystemAccess() {
		return pSystem;
	}
	
	public ParserRule getSystemRule() {
		return getSystemAccess().getRule();
	}
	
	//Page:
	//	'Page' name=ID
	//	'{'
	//	tiles+=Tile*
	//	'}';
	public PageElements getPageAccess() {
		return pPage;
	}
	
	public ParserRule getPageRule() {
		return getPageAccess().getRule();
	}
	
	//Tile:
	//	Link | Graph;
	public TileElements getTileAccess() {
		return pTile;
	}
	
	public ParserRule getTileRule() {
		return getTileAccess().getRule();
	}
	
	//Link:
	//	'Link' name=ID 'to' page=[Page];
	public LinkElements getLinkAccess() {
		return pLink;
	}
	
	public ParserRule getLinkRule() {
		return getLinkAccess().getRule();
	}
	
	//Graph:
	//	'Graph' name=ID;
	public GraphElements getGraphAccess() {
		return pGraph;
	}
	
	public ParserRule getGraphRule() {
		return getGraphAccess().getRule();
	}
	
	//Expression:
	//	{Expreession} Number | Variable | Operator Expression;
	public FormularGrammarAccess.ExpressionElements getExpressionAccess() {
		return gaFormular.getExpressionAccess();
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//Number:
	//	INT;
	public FormularGrammarAccess.NumberElements getNumberAccess() {
		return gaFormular.getNumberAccess();
	}
	
	public ParserRule getNumberRule() {
		return getNumberAccess().getRule();
	}
	
	//Variable:
	//	name=ID;
	public FormularGrammarAccess.VariableElements getVariableAccess() {
		return gaFormular.getVariableAccess();
	}
	
	public ParserRule getVariableRule() {
		return getVariableAccess().getRule();
	}
	
	//Operator:
	//	'+' | '-' | '*' | '/';
	public FormularGrammarAccess.OperatorElements getOperatorAccess() {
		return gaFormular.getOperatorAccess();
	}
	
	public ParserRule getOperatorRule() {
		return getOperatorAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
