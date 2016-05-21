package org.xtext.sdu.iotvizualizerlanguage.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.sdu.iotvizualizerlanguage.services.VizualizerGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVizualizerParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'XML'", "'CSV'", "'JSON'", "'Page'", "'{'", "'}'", "'Link'", "'to'", "'Graph'", "'Datasource'", "'Dimensions'", "':'", "','", "'Formula'", "'and'", "'using'", "'['", "']'", "'as'", "'PostPoint'", "'url'", "'use Schema'", "'GetPoint'", "'Headers'", "'Schema'", "'SchemaType'", "'='", "'Selector as '", "' -> '", "'('", "')'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalVizualizerParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVizualizerParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVizualizerParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVizualizer.g"; }


    	private VizualizerGrammarAccess grammarAccess;

    	public void setGrammarAccess(VizualizerGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleSystem"
    // InternalVizualizer.g:53:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // InternalVizualizer.g:54:1: ( ruleSystem EOF )
            // InternalVizualizer.g:55:1: ruleSystem EOF
            {
             before(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalVizualizer.g:62:1: ruleSystem : ( ( rule__System__Alternatives )* ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:66:2: ( ( ( rule__System__Alternatives )* ) )
            // InternalVizualizer.g:67:2: ( ( rule__System__Alternatives )* )
            {
            // InternalVizualizer.g:67:2: ( ( rule__System__Alternatives )* )
            // InternalVizualizer.g:68:3: ( rule__System__Alternatives )*
            {
             before(grammarAccess.getSystemAccess().getAlternatives()); 
            // InternalVizualizer.g:69:3: ( rule__System__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18||LA1_0==24||LA1_0==34||LA1_0==37||LA1_0==39) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVizualizer.g:69:4: rule__System__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__System__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRulePage"
    // InternalVizualizer.g:78:1: entryRulePage : rulePage EOF ;
    public final void entryRulePage() throws RecognitionException {
        try {
            // InternalVizualizer.g:79:1: ( rulePage EOF )
            // InternalVizualizer.g:80:1: rulePage EOF
            {
             before(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_1);
            rulePage();

            state._fsp--;

             after(grammarAccess.getPageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // InternalVizualizer.g:87:1: rulePage : ( ( rule__Page__Group__0 ) ) ;
    public final void rulePage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:91:2: ( ( ( rule__Page__Group__0 ) ) )
            // InternalVizualizer.g:92:2: ( ( rule__Page__Group__0 ) )
            {
            // InternalVizualizer.g:92:2: ( ( rule__Page__Group__0 ) )
            // InternalVizualizer.g:93:3: ( rule__Page__Group__0 )
            {
             before(grammarAccess.getPageAccess().getGroup()); 
            // InternalVizualizer.g:94:3: ( rule__Page__Group__0 )
            // InternalVizualizer.g:94:4: rule__Page__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleTile"
    // InternalVizualizer.g:103:1: entryRuleTile : ruleTile EOF ;
    public final void entryRuleTile() throws RecognitionException {
        try {
            // InternalVizualizer.g:104:1: ( ruleTile EOF )
            // InternalVizualizer.g:105:1: ruleTile EOF
            {
             before(grammarAccess.getTileRule()); 
            pushFollow(FOLLOW_1);
            ruleTile();

            state._fsp--;

             after(grammarAccess.getTileRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTile"


    // $ANTLR start "ruleTile"
    // InternalVizualizer.g:112:1: ruleTile : ( ( rule__Tile__Alternatives ) ) ;
    public final void ruleTile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:116:2: ( ( ( rule__Tile__Alternatives ) ) )
            // InternalVizualizer.g:117:2: ( ( rule__Tile__Alternatives ) )
            {
            // InternalVizualizer.g:117:2: ( ( rule__Tile__Alternatives ) )
            // InternalVizualizer.g:118:3: ( rule__Tile__Alternatives )
            {
             before(grammarAccess.getTileAccess().getAlternatives()); 
            // InternalVizualizer.g:119:3: ( rule__Tile__Alternatives )
            // InternalVizualizer.g:119:4: rule__Tile__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Tile__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTileAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTile"


    // $ANTLR start "entryRuleLink"
    // InternalVizualizer.g:128:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalVizualizer.g:129:1: ( ruleLink EOF )
            // InternalVizualizer.g:130:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalVizualizer.g:137:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:141:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalVizualizer.g:142:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalVizualizer.g:142:2: ( ( rule__Link__Group__0 ) )
            // InternalVizualizer.g:143:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalVizualizer.g:144:3: ( rule__Link__Group__0 )
            // InternalVizualizer.g:144:4: rule__Link__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleGraph"
    // InternalVizualizer.g:153:1: entryRuleGraph : ruleGraph EOF ;
    public final void entryRuleGraph() throws RecognitionException {
        try {
            // InternalVizualizer.g:154:1: ( ruleGraph EOF )
            // InternalVizualizer.g:155:1: ruleGraph EOF
            {
             before(grammarAccess.getGraphRule()); 
            pushFollow(FOLLOW_1);
            ruleGraph();

            state._fsp--;

             after(grammarAccess.getGraphRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraph"


    // $ANTLR start "ruleGraph"
    // InternalVizualizer.g:162:1: ruleGraph : ( ( rule__Graph__Group__0 ) ) ;
    public final void ruleGraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:166:2: ( ( ( rule__Graph__Group__0 ) ) )
            // InternalVizualizer.g:167:2: ( ( rule__Graph__Group__0 ) )
            {
            // InternalVizualizer.g:167:2: ( ( rule__Graph__Group__0 ) )
            // InternalVizualizer.g:168:3: ( rule__Graph__Group__0 )
            {
             before(grammarAccess.getGraphAccess().getGroup()); 
            // InternalVizualizer.g:169:3: ( rule__Graph__Group__0 )
            // InternalVizualizer.g:169:4: rule__Graph__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Graph__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraph"


    // $ANTLR start "entryRuleDatasource"
    // InternalVizualizer.g:178:1: entryRuleDatasource : ruleDatasource EOF ;
    public final void entryRuleDatasource() throws RecognitionException {
        try {
            // InternalVizualizer.g:179:1: ( ruleDatasource EOF )
            // InternalVizualizer.g:180:1: ruleDatasource EOF
            {
             before(grammarAccess.getDatasourceRule()); 
            pushFollow(FOLLOW_1);
            ruleDatasource();

            state._fsp--;

             after(grammarAccess.getDatasourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDatasource"


    // $ANTLR start "ruleDatasource"
    // InternalVizualizer.g:187:1: ruleDatasource : ( ( rule__Datasource__Group__0 ) ) ;
    public final void ruleDatasource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:191:2: ( ( ( rule__Datasource__Group__0 ) ) )
            // InternalVizualizer.g:192:2: ( ( rule__Datasource__Group__0 ) )
            {
            // InternalVizualizer.g:192:2: ( ( rule__Datasource__Group__0 ) )
            // InternalVizualizer.g:193:3: ( rule__Datasource__Group__0 )
            {
             before(grammarAccess.getDatasourceAccess().getGroup()); 
            // InternalVizualizer.g:194:3: ( rule__Datasource__Group__0 )
            // InternalVizualizer.g:194:4: rule__Datasource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Datasource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatasourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatasource"


    // $ANTLR start "entryRuleDimension"
    // InternalVizualizer.g:203:1: entryRuleDimension : ruleDimension EOF ;
    public final void entryRuleDimension() throws RecognitionException {
        try {
            // InternalVizualizer.g:204:1: ( ruleDimension EOF )
            // InternalVizualizer.g:205:1: ruleDimension EOF
            {
             before(grammarAccess.getDimensionRule()); 
            pushFollow(FOLLOW_1);
            ruleDimension();

            state._fsp--;

             after(grammarAccess.getDimensionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDimension"


    // $ANTLR start "ruleDimension"
    // InternalVizualizer.g:212:1: ruleDimension : ( ( rule__Dimension__Group__0 ) ) ;
    public final void ruleDimension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:216:2: ( ( ( rule__Dimension__Group__0 ) ) )
            // InternalVizualizer.g:217:2: ( ( rule__Dimension__Group__0 ) )
            {
            // InternalVizualizer.g:217:2: ( ( rule__Dimension__Group__0 ) )
            // InternalVizualizer.g:218:3: ( rule__Dimension__Group__0 )
            {
             before(grammarAccess.getDimensionAccess().getGroup()); 
            // InternalVizualizer.g:219:3: ( rule__Dimension__Group__0 )
            // InternalVizualizer.g:219:4: rule__Dimension__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dimension__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDimensionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDimension"


    // $ANTLR start "entryRuleDimensionSelector"
    // InternalVizualizer.g:228:1: entryRuleDimensionSelector : ruleDimensionSelector EOF ;
    public final void entryRuleDimensionSelector() throws RecognitionException {
        try {
            // InternalVizualizer.g:229:1: ( ruleDimensionSelector EOF )
            // InternalVizualizer.g:230:1: ruleDimensionSelector EOF
            {
             before(grammarAccess.getDimensionSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleDimensionSelector();

            state._fsp--;

             after(grammarAccess.getDimensionSelectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDimensionSelector"


    // $ANTLR start "ruleDimensionSelector"
    // InternalVizualizer.g:237:1: ruleDimensionSelector : ( ( rule__DimensionSelector__Group__0 ) ) ;
    public final void ruleDimensionSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:241:2: ( ( ( rule__DimensionSelector__Group__0 ) ) )
            // InternalVizualizer.g:242:2: ( ( rule__DimensionSelector__Group__0 ) )
            {
            // InternalVizualizer.g:242:2: ( ( rule__DimensionSelector__Group__0 ) )
            // InternalVizualizer.g:243:3: ( rule__DimensionSelector__Group__0 )
            {
             before(grammarAccess.getDimensionSelectorAccess().getGroup()); 
            // InternalVizualizer.g:244:3: ( rule__DimensionSelector__Group__0 )
            // InternalVizualizer.g:244:4: rule__DimensionSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DimensionSelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDimensionSelectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDimensionSelector"


    // $ANTLR start "entryRuleNoQuotesString"
    // InternalVizualizer.g:253:1: entryRuleNoQuotesString : ruleNoQuotesString EOF ;
    public final void entryRuleNoQuotesString() throws RecognitionException {
        try {
            // InternalVizualizer.g:254:1: ( ruleNoQuotesString EOF )
            // InternalVizualizer.g:255:1: ruleNoQuotesString EOF
            {
             before(grammarAccess.getNoQuotesStringRule()); 
            pushFollow(FOLLOW_1);
            ruleNoQuotesString();

            state._fsp--;

             after(grammarAccess.getNoQuotesStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNoQuotesString"


    // $ANTLR start "ruleNoQuotesString"
    // InternalVizualizer.g:262:1: ruleNoQuotesString : ( ( rule__NoQuotesString__NameAssignment ) ) ;
    public final void ruleNoQuotesString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:266:2: ( ( ( rule__NoQuotesString__NameAssignment ) ) )
            // InternalVizualizer.g:267:2: ( ( rule__NoQuotesString__NameAssignment ) )
            {
            // InternalVizualizer.g:267:2: ( ( rule__NoQuotesString__NameAssignment ) )
            // InternalVizualizer.g:268:3: ( rule__NoQuotesString__NameAssignment )
            {
             before(grammarAccess.getNoQuotesStringAccess().getNameAssignment()); 
            // InternalVizualizer.g:269:3: ( rule__NoQuotesString__NameAssignment )
            // InternalVizualizer.g:269:4: rule__NoQuotesString__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NoQuotesString__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNoQuotesStringAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoQuotesString"


    // $ANTLR start "entryRuleSource"
    // InternalVizualizer.g:278:1: entryRuleSource : ruleSource EOF ;
    public final void entryRuleSource() throws RecognitionException {
        try {
            // InternalVizualizer.g:279:1: ( ruleSource EOF )
            // InternalVizualizer.g:280:1: ruleSource EOF
            {
             before(grammarAccess.getSourceRule()); 
            pushFollow(FOLLOW_1);
            ruleSource();

            state._fsp--;

             after(grammarAccess.getSourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSource"


    // $ANTLR start "ruleSource"
    // InternalVizualizer.g:287:1: ruleSource : ( ( rule__Source__Alternatives ) ) ;
    public final void ruleSource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:291:2: ( ( ( rule__Source__Alternatives ) ) )
            // InternalVizualizer.g:292:2: ( ( rule__Source__Alternatives ) )
            {
            // InternalVizualizer.g:292:2: ( ( rule__Source__Alternatives ) )
            // InternalVizualizer.g:293:3: ( rule__Source__Alternatives )
            {
             before(grammarAccess.getSourceAccess().getAlternatives()); 
            // InternalVizualizer.g:294:3: ( rule__Source__Alternatives )
            // InternalVizualizer.g:294:4: rule__Source__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Source__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSource"


    // $ANTLR start "entryRuleEndPoint"
    // InternalVizualizer.g:303:1: entryRuleEndPoint : ruleEndPoint EOF ;
    public final void entryRuleEndPoint() throws RecognitionException {
        try {
            // InternalVizualizer.g:304:1: ( ruleEndPoint EOF )
            // InternalVizualizer.g:305:1: ruleEndPoint EOF
            {
             before(grammarAccess.getEndPointRule()); 
            pushFollow(FOLLOW_1);
            ruleEndPoint();

            state._fsp--;

             after(grammarAccess.getEndPointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEndPoint"


    // $ANTLR start "ruleEndPoint"
    // InternalVizualizer.g:312:1: ruleEndPoint : ( ( rule__EndPoint__Alternatives ) ) ;
    public final void ruleEndPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:316:2: ( ( ( rule__EndPoint__Alternatives ) ) )
            // InternalVizualizer.g:317:2: ( ( rule__EndPoint__Alternatives ) )
            {
            // InternalVizualizer.g:317:2: ( ( rule__EndPoint__Alternatives ) )
            // InternalVizualizer.g:318:3: ( rule__EndPoint__Alternatives )
            {
             before(grammarAccess.getEndPointAccess().getAlternatives()); 
            // InternalVizualizer.g:319:3: ( rule__EndPoint__Alternatives )
            // InternalVizualizer.g:319:4: rule__EndPoint__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EndPoint__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEndPointAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEndPoint"


    // $ANTLR start "entryRulePostEndPoint"
    // InternalVizualizer.g:328:1: entryRulePostEndPoint : rulePostEndPoint EOF ;
    public final void entryRulePostEndPoint() throws RecognitionException {
        try {
            // InternalVizualizer.g:329:1: ( rulePostEndPoint EOF )
            // InternalVizualizer.g:330:1: rulePostEndPoint EOF
            {
             before(grammarAccess.getPostEndPointRule()); 
            pushFollow(FOLLOW_1);
            rulePostEndPoint();

            state._fsp--;

             after(grammarAccess.getPostEndPointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePostEndPoint"


    // $ANTLR start "rulePostEndPoint"
    // InternalVizualizer.g:337:1: rulePostEndPoint : ( ( rule__PostEndPoint__Group__0 ) ) ;
    public final void rulePostEndPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:341:2: ( ( ( rule__PostEndPoint__Group__0 ) ) )
            // InternalVizualizer.g:342:2: ( ( rule__PostEndPoint__Group__0 ) )
            {
            // InternalVizualizer.g:342:2: ( ( rule__PostEndPoint__Group__0 ) )
            // InternalVizualizer.g:343:3: ( rule__PostEndPoint__Group__0 )
            {
             before(grammarAccess.getPostEndPointAccess().getGroup()); 
            // InternalVizualizer.g:344:3: ( rule__PostEndPoint__Group__0 )
            // InternalVizualizer.g:344:4: rule__PostEndPoint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PostEndPoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPostEndPointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePostEndPoint"


    // $ANTLR start "entryRuleGetEndPoint"
    // InternalVizualizer.g:353:1: entryRuleGetEndPoint : ruleGetEndPoint EOF ;
    public final void entryRuleGetEndPoint() throws RecognitionException {
        try {
            // InternalVizualizer.g:354:1: ( ruleGetEndPoint EOF )
            // InternalVizualizer.g:355:1: ruleGetEndPoint EOF
            {
             before(grammarAccess.getGetEndPointRule()); 
            pushFollow(FOLLOW_1);
            ruleGetEndPoint();

            state._fsp--;

             after(grammarAccess.getGetEndPointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGetEndPoint"


    // $ANTLR start "ruleGetEndPoint"
    // InternalVizualizer.g:362:1: ruleGetEndPoint : ( ( rule__GetEndPoint__Group__0 ) ) ;
    public final void ruleGetEndPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:366:2: ( ( ( rule__GetEndPoint__Group__0 ) ) )
            // InternalVizualizer.g:367:2: ( ( rule__GetEndPoint__Group__0 ) )
            {
            // InternalVizualizer.g:367:2: ( ( rule__GetEndPoint__Group__0 ) )
            // InternalVizualizer.g:368:3: ( rule__GetEndPoint__Group__0 )
            {
             before(grammarAccess.getGetEndPointAccess().getGroup()); 
            // InternalVizualizer.g:369:3: ( rule__GetEndPoint__Group__0 )
            // InternalVizualizer.g:369:4: rule__GetEndPoint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GetEndPoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGetEndPointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGetEndPoint"


    // $ANTLR start "entryRuleHeader"
    // InternalVizualizer.g:378:1: entryRuleHeader : ruleHeader EOF ;
    public final void entryRuleHeader() throws RecognitionException {
        try {
            // InternalVizualizer.g:379:1: ( ruleHeader EOF )
            // InternalVizualizer.g:380:1: ruleHeader EOF
            {
             before(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getHeaderRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalVizualizer.g:387:1: ruleHeader : ( ( rule__Header__Group__0 ) ) ;
    public final void ruleHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:391:2: ( ( ( rule__Header__Group__0 ) ) )
            // InternalVizualizer.g:392:2: ( ( rule__Header__Group__0 ) )
            {
            // InternalVizualizer.g:392:2: ( ( rule__Header__Group__0 ) )
            // InternalVizualizer.g:393:3: ( rule__Header__Group__0 )
            {
             before(grammarAccess.getHeaderAccess().getGroup()); 
            // InternalVizualizer.g:394:3: ( rule__Header__Group__0 )
            // InternalVizualizer.g:394:4: rule__Header__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleSchemaParser"
    // InternalVizualizer.g:403:1: entryRuleSchemaParser : ruleSchemaParser EOF ;
    public final void entryRuleSchemaParser() throws RecognitionException {
        try {
            // InternalVizualizer.g:404:1: ( ruleSchemaParser EOF )
            // InternalVizualizer.g:405:1: ruleSchemaParser EOF
            {
             before(grammarAccess.getSchemaParserRule()); 
            pushFollow(FOLLOW_1);
            ruleSchemaParser();

            state._fsp--;

             after(grammarAccess.getSchemaParserRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSchemaParser"


    // $ANTLR start "ruleSchemaParser"
    // InternalVizualizer.g:412:1: ruleSchemaParser : ( ( rule__SchemaParser__Group__0 ) ) ;
    public final void ruleSchemaParser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:416:2: ( ( ( rule__SchemaParser__Group__0 ) ) )
            // InternalVizualizer.g:417:2: ( ( rule__SchemaParser__Group__0 ) )
            {
            // InternalVizualizer.g:417:2: ( ( rule__SchemaParser__Group__0 ) )
            // InternalVizualizer.g:418:3: ( rule__SchemaParser__Group__0 )
            {
             before(grammarAccess.getSchemaParserAccess().getGroup()); 
            // InternalVizualizer.g:419:3: ( rule__SchemaParser__Group__0 )
            // InternalVizualizer.g:419:4: rule__SchemaParser__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SchemaParser__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSchemaParserAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSchemaParser"


    // $ANTLR start "entryRuleSelector"
    // InternalVizualizer.g:428:1: entryRuleSelector : ruleSelector EOF ;
    public final void entryRuleSelector() throws RecognitionException {
        try {
            // InternalVizualizer.g:429:1: ( ruleSelector EOF )
            // InternalVizualizer.g:430:1: ruleSelector EOF
            {
             before(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSelectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalVizualizer.g:437:1: ruleSelector : ( ( rule__Selector__Group__0 ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:441:2: ( ( ( rule__Selector__Group__0 ) ) )
            // InternalVizualizer.g:442:2: ( ( rule__Selector__Group__0 ) )
            {
            // InternalVizualizer.g:442:2: ( ( rule__Selector__Group__0 ) )
            // InternalVizualizer.g:443:3: ( rule__Selector__Group__0 )
            {
             before(grammarAccess.getSelectorAccess().getGroup()); 
            // InternalVizualizer.g:444:3: ( rule__Selector__Group__0 )
            // InternalVizualizer.g:444:4: rule__Selector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleFormula"
    // InternalVizualizer.g:453:1: entryRuleFormula : ruleFormula EOF ;
    public final void entryRuleFormula() throws RecognitionException {
        try {
            // InternalVizualizer.g:454:1: ( ruleFormula EOF )
            // InternalVizualizer.g:455:1: ruleFormula EOF
            {
             before(grammarAccess.getFormulaRule()); 
            pushFollow(FOLLOW_1);
            ruleFormula();

            state._fsp--;

             after(grammarAccess.getFormulaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormula"


    // $ANTLR start "ruleFormula"
    // InternalVizualizer.g:462:1: ruleFormula : ( ( rule__Formula__Group__0 ) ) ;
    public final void ruleFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:466:2: ( ( ( rule__Formula__Group__0 ) ) )
            // InternalVizualizer.g:467:2: ( ( rule__Formula__Group__0 ) )
            {
            // InternalVizualizer.g:467:2: ( ( rule__Formula__Group__0 ) )
            // InternalVizualizer.g:468:3: ( rule__Formula__Group__0 )
            {
             before(grammarAccess.getFormulaAccess().getGroup()); 
            // InternalVizualizer.g:469:3: ( rule__Formula__Group__0 )
            // InternalVizualizer.g:469:4: rule__Formula__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Formula__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormulaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormula"


    // $ANTLR start "entryRuleExpression"
    // InternalVizualizer.g:478:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalVizualizer.g:479:1: ( ruleExpression EOF )
            // InternalVizualizer.g:480:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalVizualizer.g:487:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:491:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalVizualizer.g:492:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalVizualizer.g:492:2: ( ( rule__Expression__Group__0 ) )
            // InternalVizualizer.g:493:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalVizualizer.g:494:3: ( rule__Expression__Group__0 )
            // InternalVizualizer.g:494:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOp1"
    // InternalVizualizer.g:503:1: entryRuleOp1 : ruleOp1 EOF ;
    public final void entryRuleOp1() throws RecognitionException {
        try {
            // InternalVizualizer.g:504:1: ( ruleOp1 EOF )
            // InternalVizualizer.g:505:1: ruleOp1 EOF
            {
             before(grammarAccess.getOp1Rule()); 
            pushFollow(FOLLOW_1);
            ruleOp1();

            state._fsp--;

             after(grammarAccess.getOp1Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOp1"


    // $ANTLR start "ruleOp1"
    // InternalVizualizer.g:512:1: ruleOp1 : ( ( rule__Op1__Alternatives ) ) ;
    public final void ruleOp1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:516:2: ( ( ( rule__Op1__Alternatives ) ) )
            // InternalVizualizer.g:517:2: ( ( rule__Op1__Alternatives ) )
            {
            // InternalVizualizer.g:517:2: ( ( rule__Op1__Alternatives ) )
            // InternalVizualizer.g:518:3: ( rule__Op1__Alternatives )
            {
             before(grammarAccess.getOp1Access().getAlternatives()); 
            // InternalVizualizer.g:519:3: ( rule__Op1__Alternatives )
            // InternalVizualizer.g:519:4: rule__Op1__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Op1__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOp1Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOp1"


    // $ANTLR start "entryRuleFactor"
    // InternalVizualizer.g:528:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // InternalVizualizer.g:529:1: ( ruleFactor EOF )
            // InternalVizualizer.g:530:1: ruleFactor EOF
            {
             before(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getFactorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalVizualizer.g:537:1: ruleFactor : ( ( rule__Factor__Group__0 ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:541:2: ( ( ( rule__Factor__Group__0 ) ) )
            // InternalVizualizer.g:542:2: ( ( rule__Factor__Group__0 ) )
            {
            // InternalVizualizer.g:542:2: ( ( rule__Factor__Group__0 ) )
            // InternalVizualizer.g:543:3: ( rule__Factor__Group__0 )
            {
             before(grammarAccess.getFactorAccess().getGroup()); 
            // InternalVizualizer.g:544:3: ( rule__Factor__Group__0 )
            // InternalVizualizer.g:544:4: rule__Factor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleOp2"
    // InternalVizualizer.g:553:1: entryRuleOp2 : ruleOp2 EOF ;
    public final void entryRuleOp2() throws RecognitionException {
        try {
            // InternalVizualizer.g:554:1: ( ruleOp2 EOF )
            // InternalVizualizer.g:555:1: ruleOp2 EOF
            {
             before(grammarAccess.getOp2Rule()); 
            pushFollow(FOLLOW_1);
            ruleOp2();

            state._fsp--;

             after(grammarAccess.getOp2Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOp2"


    // $ANTLR start "ruleOp2"
    // InternalVizualizer.g:562:1: ruleOp2 : ( ( rule__Op2__Alternatives ) ) ;
    public final void ruleOp2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:566:2: ( ( ( rule__Op2__Alternatives ) ) )
            // InternalVizualizer.g:567:2: ( ( rule__Op2__Alternatives ) )
            {
            // InternalVizualizer.g:567:2: ( ( rule__Op2__Alternatives ) )
            // InternalVizualizer.g:568:3: ( rule__Op2__Alternatives )
            {
             before(grammarAccess.getOp2Access().getAlternatives()); 
            // InternalVizualizer.g:569:3: ( rule__Op2__Alternatives )
            // InternalVizualizer.g:569:4: rule__Op2__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Op2__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOp2Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOp2"


    // $ANTLR start "entryRulePrimitive"
    // InternalVizualizer.g:578:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // InternalVizualizer.g:579:1: ( rulePrimitive EOF )
            // InternalVizualizer.g:580:1: rulePrimitive EOF
            {
             before(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getPrimitiveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // InternalVizualizer.g:587:1: rulePrimitive : ( ( rule__Primitive__Alternatives ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:591:2: ( ( ( rule__Primitive__Alternatives ) ) )
            // InternalVizualizer.g:592:2: ( ( rule__Primitive__Alternatives ) )
            {
            // InternalVizualizer.g:592:2: ( ( rule__Primitive__Alternatives ) )
            // InternalVizualizer.g:593:3: ( rule__Primitive__Alternatives )
            {
             before(grammarAccess.getPrimitiveAccess().getAlternatives()); 
            // InternalVizualizer.g:594:3: ( rule__Primitive__Alternatives )
            // InternalVizualizer.g:594:4: rule__Primitive__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleNumber"
    // InternalVizualizer.g:603:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalVizualizer.g:604:1: ( ruleNumber EOF )
            // InternalVizualizer.g:605:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalVizualizer.g:612:1: ruleNumber : ( ( rule__Number__ValAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:616:2: ( ( ( rule__Number__ValAssignment ) ) )
            // InternalVizualizer.g:617:2: ( ( rule__Number__ValAssignment ) )
            {
            // InternalVizualizer.g:617:2: ( ( rule__Number__ValAssignment ) )
            // InternalVizualizer.g:618:3: ( rule__Number__ValAssignment )
            {
             before(grammarAccess.getNumberAccess().getValAssignment()); 
            // InternalVizualizer.g:619:3: ( rule__Number__ValAssignment )
            // InternalVizualizer.g:619:4: rule__Number__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Number__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleVariable"
    // InternalVizualizer.g:628:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalVizualizer.g:629:1: ( ruleVariable EOF )
            // InternalVizualizer.g:630:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalVizualizer.g:637:1: ruleVariable : ( ( rule__Variable__NameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:641:2: ( ( ( rule__Variable__NameAssignment ) ) )
            // InternalVizualizer.g:642:2: ( ( rule__Variable__NameAssignment ) )
            {
            // InternalVizualizer.g:642:2: ( ( rule__Variable__NameAssignment ) )
            // InternalVizualizer.g:643:3: ( rule__Variable__NameAssignment )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment()); 
            // InternalVizualizer.g:644:3: ( rule__Variable__NameAssignment )
            // InternalVizualizer.g:644:4: rule__Variable__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "ruleSchemaType"
    // InternalVizualizer.g:653:1: ruleSchemaType : ( ( rule__SchemaType__Alternatives ) ) ;
    public final void ruleSchemaType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:657:1: ( ( ( rule__SchemaType__Alternatives ) ) )
            // InternalVizualizer.g:658:2: ( ( rule__SchemaType__Alternatives ) )
            {
            // InternalVizualizer.g:658:2: ( ( rule__SchemaType__Alternatives ) )
            // InternalVizualizer.g:659:3: ( rule__SchemaType__Alternatives )
            {
             before(grammarAccess.getSchemaTypeAccess().getAlternatives()); 
            // InternalVizualizer.g:660:3: ( rule__SchemaType__Alternatives )
            // InternalVizualizer.g:660:4: rule__SchemaType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SchemaType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSchemaTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSchemaType"


    // $ANTLR start "rule__System__Alternatives"
    // InternalVizualizer.g:668:1: rule__System__Alternatives : ( ( ( rule__System__PagesAssignment_0 ) ) | ( ( rule__System__SourcesAssignment_1 ) ) | ( ( rule__System__SchemasAssignment_2 ) ) );
    public final void rule__System__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:672:1: ( ( ( rule__System__PagesAssignment_0 ) ) | ( ( rule__System__SourcesAssignment_1 ) ) | ( ( rule__System__SchemasAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 24:
            case 34:
            case 37:
                {
                alt2=2;
                }
                break;
            case 39:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalVizualizer.g:673:2: ( ( rule__System__PagesAssignment_0 ) )
                    {
                    // InternalVizualizer.g:673:2: ( ( rule__System__PagesAssignment_0 ) )
                    // InternalVizualizer.g:674:3: ( rule__System__PagesAssignment_0 )
                    {
                     before(grammarAccess.getSystemAccess().getPagesAssignment_0()); 
                    // InternalVizualizer.g:675:3: ( rule__System__PagesAssignment_0 )
                    // InternalVizualizer.g:675:4: rule__System__PagesAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__System__PagesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSystemAccess().getPagesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:679:2: ( ( rule__System__SourcesAssignment_1 ) )
                    {
                    // InternalVizualizer.g:679:2: ( ( rule__System__SourcesAssignment_1 ) )
                    // InternalVizualizer.g:680:3: ( rule__System__SourcesAssignment_1 )
                    {
                     before(grammarAccess.getSystemAccess().getSourcesAssignment_1()); 
                    // InternalVizualizer.g:681:3: ( rule__System__SourcesAssignment_1 )
                    // InternalVizualizer.g:681:4: rule__System__SourcesAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__System__SourcesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSystemAccess().getSourcesAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVizualizer.g:685:2: ( ( rule__System__SchemasAssignment_2 ) )
                    {
                    // InternalVizualizer.g:685:2: ( ( rule__System__SchemasAssignment_2 ) )
                    // InternalVizualizer.g:686:3: ( rule__System__SchemasAssignment_2 )
                    {
                     before(grammarAccess.getSystemAccess().getSchemasAssignment_2()); 
                    // InternalVizualizer.g:687:3: ( rule__System__SchemasAssignment_2 )
                    // InternalVizualizer.g:687:4: rule__System__SchemasAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__System__SchemasAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSystemAccess().getSchemasAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Alternatives"


    // $ANTLR start "rule__Tile__Alternatives"
    // InternalVizualizer.g:695:1: rule__Tile__Alternatives : ( ( ruleLink ) | ( ruleGraph ) );
    public final void rule__Tile__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:699:1: ( ( ruleLink ) | ( ruleGraph ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            else if ( (LA3_0==23) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalVizualizer.g:700:2: ( ruleLink )
                    {
                    // InternalVizualizer.g:700:2: ( ruleLink )
                    // InternalVizualizer.g:701:3: ruleLink
                    {
                     before(grammarAccess.getTileAccess().getLinkParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLink();

                    state._fsp--;

                     after(grammarAccess.getTileAccess().getLinkParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:706:2: ( ruleGraph )
                    {
                    // InternalVizualizer.g:706:2: ( ruleGraph )
                    // InternalVizualizer.g:707:3: ruleGraph
                    {
                     before(grammarAccess.getTileAccess().getGraphParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGraph();

                    state._fsp--;

                     after(grammarAccess.getTileAccess().getGraphParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tile__Alternatives"


    // $ANTLR start "rule__Source__Alternatives"
    // InternalVizualizer.g:716:1: rule__Source__Alternatives : ( ( ruleEndPoint ) | ( ruleDatasource ) );
    public final void rule__Source__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:720:1: ( ( ruleEndPoint ) | ( ruleDatasource ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==34||LA4_0==37) ) {
                alt4=1;
            }
            else if ( (LA4_0==24) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalVizualizer.g:721:2: ( ruleEndPoint )
                    {
                    // InternalVizualizer.g:721:2: ( ruleEndPoint )
                    // InternalVizualizer.g:722:3: ruleEndPoint
                    {
                     before(grammarAccess.getSourceAccess().getEndPointParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEndPoint();

                    state._fsp--;

                     after(grammarAccess.getSourceAccess().getEndPointParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:727:2: ( ruleDatasource )
                    {
                    // InternalVizualizer.g:727:2: ( ruleDatasource )
                    // InternalVizualizer.g:728:3: ruleDatasource
                    {
                     before(grammarAccess.getSourceAccess().getDatasourceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDatasource();

                    state._fsp--;

                     after(grammarAccess.getSourceAccess().getDatasourceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Source__Alternatives"


    // $ANTLR start "rule__EndPoint__Alternatives"
    // InternalVizualizer.g:737:1: rule__EndPoint__Alternatives : ( ( ruleGetEndPoint ) | ( rulePostEndPoint ) );
    public final void rule__EndPoint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:741:1: ( ( ruleGetEndPoint ) | ( rulePostEndPoint ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==37) ) {
                alt5=1;
            }
            else if ( (LA5_0==34) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalVizualizer.g:742:2: ( ruleGetEndPoint )
                    {
                    // InternalVizualizer.g:742:2: ( ruleGetEndPoint )
                    // InternalVizualizer.g:743:3: ruleGetEndPoint
                    {
                     before(grammarAccess.getEndPointAccess().getGetEndPointParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGetEndPoint();

                    state._fsp--;

                     after(grammarAccess.getEndPointAccess().getGetEndPointParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:748:2: ( rulePostEndPoint )
                    {
                    // InternalVizualizer.g:748:2: ( rulePostEndPoint )
                    // InternalVizualizer.g:749:3: rulePostEndPoint
                    {
                     before(grammarAccess.getEndPointAccess().getPostEndPointParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePostEndPoint();

                    state._fsp--;

                     after(grammarAccess.getEndPointAccess().getPostEndPointParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndPoint__Alternatives"


    // $ANTLR start "rule__Op1__Alternatives"
    // InternalVizualizer.g:758:1: rule__Op1__Alternatives : ( ( '+' ) | ( '-' ) );
    public final void rule__Op1__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:762:1: ( ( '+' ) | ( '-' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalVizualizer.g:763:2: ( '+' )
                    {
                    // InternalVizualizer.g:763:2: ( '+' )
                    // InternalVizualizer.g:764:3: '+'
                    {
                     before(grammarAccess.getOp1Access().getPlusSignKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getOp1Access().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:769:2: ( '-' )
                    {
                    // InternalVizualizer.g:769:2: ( '-' )
                    // InternalVizualizer.g:770:3: '-'
                    {
                     before(grammarAccess.getOp1Access().getHyphenMinusKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getOp1Access().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Op1__Alternatives"


    // $ANTLR start "rule__Op2__Alternatives"
    // InternalVizualizer.g:779:1: rule__Op2__Alternatives : ( ( '*' ) | ( '/' ) );
    public final void rule__Op2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:783:1: ( ( '*' ) | ( '/' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            else if ( (LA7_0==14) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalVizualizer.g:784:2: ( '*' )
                    {
                    // InternalVizualizer.g:784:2: ( '*' )
                    // InternalVizualizer.g:785:3: '*'
                    {
                     before(grammarAccess.getOp2Access().getAsteriskKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getOp2Access().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:790:2: ( '/' )
                    {
                    // InternalVizualizer.g:790:2: ( '/' )
                    // InternalVizualizer.g:791:3: '/'
                    {
                     before(grammarAccess.getOp2Access().getSolidusKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getOp2Access().getSolidusKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Op2__Alternatives"


    // $ANTLR start "rule__Primitive__Alternatives"
    // InternalVizualizer.g:800:1: rule__Primitive__Alternatives : ( ( ruleNumber ) | ( ruleVariable ) | ( ( rule__Primitive__Group_2__0 ) ) );
    public final void rule__Primitive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:804:1: ( ( ruleNumber ) | ( ruleVariable ) | ( ( rule__Primitive__Group_2__0 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                alt8=2;
                }
                break;
            case 44:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalVizualizer.g:805:2: ( ruleNumber )
                    {
                    // InternalVizualizer.g:805:2: ( ruleNumber )
                    // InternalVizualizer.g:806:3: ruleNumber
                    {
                     before(grammarAccess.getPrimitiveAccess().getNumberParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getNumberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:811:2: ( ruleVariable )
                    {
                    // InternalVizualizer.g:811:2: ( ruleVariable )
                    // InternalVizualizer.g:812:3: ruleVariable
                    {
                     before(grammarAccess.getPrimitiveAccess().getVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveAccess().getVariableParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVizualizer.g:817:2: ( ( rule__Primitive__Group_2__0 ) )
                    {
                    // InternalVizualizer.g:817:2: ( ( rule__Primitive__Group_2__0 ) )
                    // InternalVizualizer.g:818:3: ( rule__Primitive__Group_2__0 )
                    {
                     before(grammarAccess.getPrimitiveAccess().getGroup_2()); 
                    // InternalVizualizer.g:819:3: ( rule__Primitive__Group_2__0 )
                    // InternalVizualizer.g:819:4: rule__Primitive__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primitive__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Alternatives"


    // $ANTLR start "rule__SchemaType__Alternatives"
    // InternalVizualizer.g:827:1: rule__SchemaType__Alternatives : ( ( ( 'XML' ) ) | ( ( 'CSV' ) ) | ( ( 'JSON' ) ) );
    public final void rule__SchemaType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:831:1: ( ( ( 'XML' ) ) | ( ( 'CSV' ) ) | ( ( 'JSON' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt9=1;
                }
                break;
            case 16:
                {
                alt9=2;
                }
                break;
            case 17:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalVizualizer.g:832:2: ( ( 'XML' ) )
                    {
                    // InternalVizualizer.g:832:2: ( ( 'XML' ) )
                    // InternalVizualizer.g:833:3: ( 'XML' )
                    {
                     before(grammarAccess.getSchemaTypeAccess().getXMLEnumLiteralDeclaration_0()); 
                    // InternalVizualizer.g:834:3: ( 'XML' )
                    // InternalVizualizer.g:834:4: 'XML'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getSchemaTypeAccess().getXMLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:838:2: ( ( 'CSV' ) )
                    {
                    // InternalVizualizer.g:838:2: ( ( 'CSV' ) )
                    // InternalVizualizer.g:839:3: ( 'CSV' )
                    {
                     before(grammarAccess.getSchemaTypeAccess().getCSVEnumLiteralDeclaration_1()); 
                    // InternalVizualizer.g:840:3: ( 'CSV' )
                    // InternalVizualizer.g:840:4: 'CSV'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getSchemaTypeAccess().getCSVEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVizualizer.g:844:2: ( ( 'JSON' ) )
                    {
                    // InternalVizualizer.g:844:2: ( ( 'JSON' ) )
                    // InternalVizualizer.g:845:3: ( 'JSON' )
                    {
                     before(grammarAccess.getSchemaTypeAccess().getJSONEnumLiteralDeclaration_2()); 
                    // InternalVizualizer.g:846:3: ( 'JSON' )
                    // InternalVizualizer.g:846:4: 'JSON'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getSchemaTypeAccess().getJSONEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaType__Alternatives"


    // $ANTLR start "rule__Page__Group__0"
    // InternalVizualizer.g:854:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:858:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // InternalVizualizer.g:859:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Page__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0"


    // $ANTLR start "rule__Page__Group__0__Impl"
    // InternalVizualizer.g:866:1: rule__Page__Group__0__Impl : ( 'Page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:870:1: ( ( 'Page' ) )
            // InternalVizualizer.g:871:1: ( 'Page' )
            {
            // InternalVizualizer.g:871:1: ( 'Page' )
            // InternalVizualizer.g:872:2: 'Page'
            {
             before(grammarAccess.getPageAccess().getPageKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getPageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0__Impl"


    // $ANTLR start "rule__Page__Group__1"
    // InternalVizualizer.g:881:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:885:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // InternalVizualizer.g:886:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Page__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1"


    // $ANTLR start "rule__Page__Group__1__Impl"
    // InternalVizualizer.g:893:1: rule__Page__Group__1__Impl : ( ( rule__Page__NameAssignment_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:897:1: ( ( ( rule__Page__NameAssignment_1 ) ) )
            // InternalVizualizer.g:898:1: ( ( rule__Page__NameAssignment_1 ) )
            {
            // InternalVizualizer.g:898:1: ( ( rule__Page__NameAssignment_1 ) )
            // InternalVizualizer.g:899:2: ( rule__Page__NameAssignment_1 )
            {
             before(grammarAccess.getPageAccess().getNameAssignment_1()); 
            // InternalVizualizer.g:900:2: ( rule__Page__NameAssignment_1 )
            // InternalVizualizer.g:900:3: rule__Page__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Page__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1__Impl"


    // $ANTLR start "rule__Page__Group__2"
    // InternalVizualizer.g:908:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:912:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // InternalVizualizer.g:913:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Page__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2"


    // $ANTLR start "rule__Page__Group__2__Impl"
    // InternalVizualizer.g:920:1: rule__Page__Group__2__Impl : ( '{' ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:924:1: ( ( '{' ) )
            // InternalVizualizer.g:925:1: ( '{' )
            {
            // InternalVizualizer.g:925:1: ( '{' )
            // InternalVizualizer.g:926:2: '{'
            {
             before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2__Impl"


    // $ANTLR start "rule__Page__Group__3"
    // InternalVizualizer.g:935:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:939:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // InternalVizualizer.g:940:2: rule__Page__Group__3__Impl rule__Page__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Page__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__3"


    // $ANTLR start "rule__Page__Group__3__Impl"
    // InternalVizualizer.g:947:1: rule__Page__Group__3__Impl : ( ( rule__Page__TilesAssignment_3 )* ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:951:1: ( ( ( rule__Page__TilesAssignment_3 )* ) )
            // InternalVizualizer.g:952:1: ( ( rule__Page__TilesAssignment_3 )* )
            {
            // InternalVizualizer.g:952:1: ( ( rule__Page__TilesAssignment_3 )* )
            // InternalVizualizer.g:953:2: ( rule__Page__TilesAssignment_3 )*
            {
             before(grammarAccess.getPageAccess().getTilesAssignment_3()); 
            // InternalVizualizer.g:954:2: ( rule__Page__TilesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21||LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalVizualizer.g:954:3: rule__Page__TilesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Page__TilesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getPageAccess().getTilesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__3__Impl"


    // $ANTLR start "rule__Page__Group__4"
    // InternalVizualizer.g:962:1: rule__Page__Group__4 : rule__Page__Group__4__Impl ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:966:1: ( rule__Page__Group__4__Impl )
            // InternalVizualizer.g:967:2: rule__Page__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__4"


    // $ANTLR start "rule__Page__Group__4__Impl"
    // InternalVizualizer.g:973:1: rule__Page__Group__4__Impl : ( '}' ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:977:1: ( ( '}' ) )
            // InternalVizualizer.g:978:1: ( '}' )
            {
            // InternalVizualizer.g:978:1: ( '}' )
            // InternalVizualizer.g:979:2: '}'
            {
             before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__4__Impl"


    // $ANTLR start "rule__Link__Group__0"
    // InternalVizualizer.g:989:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:993:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalVizualizer.g:994:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Link__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0"


    // $ANTLR start "rule__Link__Group__0__Impl"
    // InternalVizualizer.g:1001:1: rule__Link__Group__0__Impl : ( 'Link' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1005:1: ( ( 'Link' ) )
            // InternalVizualizer.g:1006:1: ( 'Link' )
            {
            // InternalVizualizer.g:1006:1: ( 'Link' )
            // InternalVizualizer.g:1007:2: 'Link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLinkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0__Impl"


    // $ANTLR start "rule__Link__Group__1"
    // InternalVizualizer.g:1016:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1020:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalVizualizer.g:1021:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Link__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1"


    // $ANTLR start "rule__Link__Group__1__Impl"
    // InternalVizualizer.g:1028:1: rule__Link__Group__1__Impl : ( ( rule__Link__NameAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1032:1: ( ( ( rule__Link__NameAssignment_1 ) ) )
            // InternalVizualizer.g:1033:1: ( ( rule__Link__NameAssignment_1 ) )
            {
            // InternalVizualizer.g:1033:1: ( ( rule__Link__NameAssignment_1 ) )
            // InternalVizualizer.g:1034:2: ( rule__Link__NameAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_1()); 
            // InternalVizualizer.g:1035:2: ( rule__Link__NameAssignment_1 )
            // InternalVizualizer.g:1035:3: rule__Link__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1__Impl"


    // $ANTLR start "rule__Link__Group__2"
    // InternalVizualizer.g:1043:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1047:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalVizualizer.g:1048:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Link__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2"


    // $ANTLR start "rule__Link__Group__2__Impl"
    // InternalVizualizer.g:1055:1: rule__Link__Group__2__Impl : ( 'to' ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1059:1: ( ( 'to' ) )
            // InternalVizualizer.g:1060:1: ( 'to' )
            {
            // InternalVizualizer.g:1060:1: ( 'to' )
            // InternalVizualizer.g:1061:2: 'to'
            {
             before(grammarAccess.getLinkAccess().getToKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2__Impl"


    // $ANTLR start "rule__Link__Group__3"
    // InternalVizualizer.g:1070:1: rule__Link__Group__3 : rule__Link__Group__3__Impl ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1074:1: ( rule__Link__Group__3__Impl )
            // InternalVizualizer.g:1075:2: rule__Link__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__3"


    // $ANTLR start "rule__Link__Group__3__Impl"
    // InternalVizualizer.g:1081:1: rule__Link__Group__3__Impl : ( ( rule__Link__PageAssignment_3 ) ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1085:1: ( ( ( rule__Link__PageAssignment_3 ) ) )
            // InternalVizualizer.g:1086:1: ( ( rule__Link__PageAssignment_3 ) )
            {
            // InternalVizualizer.g:1086:1: ( ( rule__Link__PageAssignment_3 ) )
            // InternalVizualizer.g:1087:2: ( rule__Link__PageAssignment_3 )
            {
             before(grammarAccess.getLinkAccess().getPageAssignment_3()); 
            // InternalVizualizer.g:1088:2: ( rule__Link__PageAssignment_3 )
            // InternalVizualizer.g:1088:3: rule__Link__PageAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Link__PageAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getPageAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__3__Impl"


    // $ANTLR start "rule__Graph__Group__0"
    // InternalVizualizer.g:1097:1: rule__Graph__Group__0 : rule__Graph__Group__0__Impl rule__Graph__Group__1 ;
    public final void rule__Graph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1101:1: ( rule__Graph__Group__0__Impl rule__Graph__Group__1 )
            // InternalVizualizer.g:1102:2: rule__Graph__Group__0__Impl rule__Graph__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Graph__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__0"


    // $ANTLR start "rule__Graph__Group__0__Impl"
    // InternalVizualizer.g:1109:1: rule__Graph__Group__0__Impl : ( 'Graph' ) ;
    public final void rule__Graph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1113:1: ( ( 'Graph' ) )
            // InternalVizualizer.g:1114:1: ( 'Graph' )
            {
            // InternalVizualizer.g:1114:1: ( 'Graph' )
            // InternalVizualizer.g:1115:2: 'Graph'
            {
             before(grammarAccess.getGraphAccess().getGraphKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getGraphKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__0__Impl"


    // $ANTLR start "rule__Graph__Group__1"
    // InternalVizualizer.g:1124:1: rule__Graph__Group__1 : rule__Graph__Group__1__Impl rule__Graph__Group__2 ;
    public final void rule__Graph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1128:1: ( rule__Graph__Group__1__Impl rule__Graph__Group__2 )
            // InternalVizualizer.g:1129:2: rule__Graph__Group__1__Impl rule__Graph__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Graph__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graph__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__1"


    // $ANTLR start "rule__Graph__Group__1__Impl"
    // InternalVizualizer.g:1136:1: rule__Graph__Group__1__Impl : ( ( rule__Graph__NameAssignment_1 ) ) ;
    public final void rule__Graph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1140:1: ( ( ( rule__Graph__NameAssignment_1 ) ) )
            // InternalVizualizer.g:1141:1: ( ( rule__Graph__NameAssignment_1 ) )
            {
            // InternalVizualizer.g:1141:1: ( ( rule__Graph__NameAssignment_1 ) )
            // InternalVizualizer.g:1142:2: ( rule__Graph__NameAssignment_1 )
            {
             before(grammarAccess.getGraphAccess().getNameAssignment_1()); 
            // InternalVizualizer.g:1143:2: ( rule__Graph__NameAssignment_1 )
            // InternalVizualizer.g:1143:3: rule__Graph__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Graph__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__1__Impl"


    // $ANTLR start "rule__Graph__Group__2"
    // InternalVizualizer.g:1151:1: rule__Graph__Group__2 : rule__Graph__Group__2__Impl ;
    public final void rule__Graph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1155:1: ( rule__Graph__Group__2__Impl )
            // InternalVizualizer.g:1156:2: rule__Graph__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Graph__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__2"


    // $ANTLR start "rule__Graph__Group__2__Impl"
    // InternalVizualizer.g:1162:1: rule__Graph__Group__2__Impl : ( ( rule__Graph__SourceAssignment_2 ) ) ;
    public final void rule__Graph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1166:1: ( ( ( rule__Graph__SourceAssignment_2 ) ) )
            // InternalVizualizer.g:1167:1: ( ( rule__Graph__SourceAssignment_2 ) )
            {
            // InternalVizualizer.g:1167:1: ( ( rule__Graph__SourceAssignment_2 ) )
            // InternalVizualizer.g:1168:2: ( rule__Graph__SourceAssignment_2 )
            {
             before(grammarAccess.getGraphAccess().getSourceAssignment_2()); 
            // InternalVizualizer.g:1169:2: ( rule__Graph__SourceAssignment_2 )
            // InternalVizualizer.g:1169:3: rule__Graph__SourceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Graph__SourceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getSourceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__2__Impl"


    // $ANTLR start "rule__Datasource__Group__0"
    // InternalVizualizer.g:1178:1: rule__Datasource__Group__0 : rule__Datasource__Group__0__Impl rule__Datasource__Group__1 ;
    public final void rule__Datasource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1182:1: ( rule__Datasource__Group__0__Impl rule__Datasource__Group__1 )
            // InternalVizualizer.g:1183:2: rule__Datasource__Group__0__Impl rule__Datasource__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Datasource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Datasource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Group__0"


    // $ANTLR start "rule__Datasource__Group__0__Impl"
    // InternalVizualizer.g:1190:1: rule__Datasource__Group__0__Impl : ( 'Datasource' ) ;
    public final void rule__Datasource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1194:1: ( ( 'Datasource' ) )
            // InternalVizualizer.g:1195:1: ( 'Datasource' )
            {
            // InternalVizualizer.g:1195:1: ( 'Datasource' )
            // InternalVizualizer.g:1196:2: 'Datasource'
            {
             before(grammarAccess.getDatasourceAccess().getDatasourceKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDatasourceAccess().getDatasourceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Group__0__Impl"


    // $ANTLR start "rule__Datasource__Group__1"
    // InternalVizualizer.g:1205:1: rule__Datasource__Group__1 : rule__Datasource__Group__1__Impl rule__Datasource__Group__2 ;
    public final void rule__Datasource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1209:1: ( rule__Datasource__Group__1__Impl rule__Datasource__Group__2 )
            // InternalVizualizer.g:1210:2: rule__Datasource__Group__1__Impl rule__Datasource__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Datasource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Datasource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Group__1"


    // $ANTLR start "rule__Datasource__Group__1__Impl"
    // InternalVizualizer.g:1217:1: rule__Datasource__Group__1__Impl : ( ( rule__Datasource__NameAssignment_1 ) ) ;
    public final void rule__Datasource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1221:1: ( ( ( rule__Datasource__NameAssignment_1 ) ) )
            // InternalVizualizer.g:1222:1: ( ( rule__Datasource__NameAssignment_1 ) )
            {
            // InternalVizualizer.g:1222:1: ( ( rule__Datasource__NameAssignment_1 ) )
            // InternalVizualizer.g:1223:2: ( rule__Datasource__NameAssignment_1 )
            {
             before(grammarAccess.getDatasourceAccess().getNameAssignment_1()); 
            // InternalVizualizer.g:1224:2: ( rule__Datasource__NameAssignment_1 )
            // InternalVizualizer.g:1224:3: rule__Datasource__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Datasource__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDatasourceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Group__1__Impl"


    // $ANTLR start "rule__Datasource__Group__2"
    // InternalVizualizer.g:1232:1: rule__Datasource__Group__2 : rule__Datasource__Group__2__Impl rule__Datasource__Group__3 ;
    public final void rule__Datasource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1236:1: ( rule__Datasource__Group__2__Impl rule__Datasource__Group__3 )
            // InternalVizualizer.g:1237:2: rule__Datasource__Group__2__Impl rule__Datasource__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Datasource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Datasource__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Group__2"


    // $ANTLR start "rule__Datasource__Group__2__Impl"
    // InternalVizualizer.g:1244:1: rule__Datasource__Group__2__Impl : ( '{' ) ;
    public final void rule__Datasource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1248:1: ( ( '{' ) )
            // InternalVizualizer.g:1249:1: ( '{' )
            {
            // InternalVizualizer.g:1249:1: ( '{' )
            // InternalVizualizer.g:1250:2: '{'
            {
             before(grammarAccess.getDatasourceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDatasourceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Group__2__Impl"


    // $ANTLR start "rule__Datasource__Group__3"
    // InternalVizualizer.g:1259:1: rule__Datasource__Group__3 : rule__Datasource__Group__3__Impl rule__Datasource__Group__4 ;
    public final void rule__Datasource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1263:1: ( rule__Datasource__Group__3__Impl rule__Datasource__Group__4 )
            // InternalVizualizer.g:1264:2: rule__Datasource__Group__3__Impl rule__Datasource__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Datasource__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Datasource__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Group__3"


    // $ANTLR start "rule__Datasource__Group__3__Impl"
    // InternalVizualizer.g:1271:1: rule__Datasource__Group__3__Impl : ( 'Dimensions' ) ;
    public final void rule__Datasource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1275:1: ( ( 'Dimensions' ) )
            // InternalVizualizer.g:1276:1: ( 'Dimensions' )
            {
            // InternalVizualizer.g:1276:1: ( 'Dimensions' )
            // InternalVizualizer.g:1277:2: 'Dimensions'
            {
             before(grammarAccess.getDatasourceAccess().getDimensionsKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDatasourceAccess().getDimensionsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Group__3__Impl"


    // $ANTLR start "rule__Datasource__Group__4"
    // InternalVizualizer.g:1286:1: rule__Datasource__Group__4 : rule__Datasource__Group__4__Impl rule__Datasource__Group__5 ;
    public final void rule__Datasource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1290:1: ( rule__Datasource__Group__4__Impl rule__Datasource__Group__5 )
            // InternalVizualizer.g:1291:2: rule__Datasource__Group__4__Impl rule__Datasource__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Datasource__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Datasource__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Group__4"


    // $ANTLR start "rule__Datasource__Group__4__Impl"
    // InternalVizualizer.g:1298:1: rule__Datasource__Group__4__Impl : ( ':' ) ;
    public final void rule__Datasource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1302:1: ( ( ':' ) )
            // InternalVizualizer.g:1303:1: ( ':' )
            {
            // InternalVizualizer.g:1303:1: ( ':' )
            // InternalVizualizer.g:1304:2: ':'
            {
             before(grammarAccess.getDatasourceAccess().getColonKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDatasourceAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Group__4__Impl"


    // $ANTLR start "rule__Datasource__Group__5"
    // InternalVizualizer.g:1313:1: rule__Datasource__Group__5 : rule__Datasource__Group__5__Impl rule__Datasource__Group__6 ;
    public final void rule__Datasource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1317:1: ( rule__Datasource__Group__5__Impl rule__Datasource__Group__6 )
            // InternalVizualizer.g:1318:2: rule__Datasource__Group__5__Impl rule__Datasource__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Datasource__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Datasource__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Group__5"


    // $ANTLR start "rule__Datasource__Group__5__Impl"
    // InternalVizualizer.g:1325:1: rule__Datasource__Group__5__Impl : ( ( rule__Datasource__DimensionsAssignment_5 ) ) ;
    public final void rule__Datasource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1329:1: ( ( ( rule__Datasource__DimensionsAssignment_5 ) ) )
            // InternalVizualizer.g:1330:1: ( ( rule__Datasource__DimensionsAssignment_5 ) )
            {
            // InternalVizualizer.g:1330:1: ( ( rule__Datasource__DimensionsAssignment_5 ) )
            // InternalVizualizer.g:1331:2: ( rule__Datasource__DimensionsAssignment_5 )
            {
             before(grammarAccess.getDatasourceAccess().getDimensionsAssignment_5()); 
            // InternalVizualizer.g:1332:2: ( rule__Datasource__DimensionsAssignment_5 )
            // InternalVizualizer.g:1332:3: rule__Datasource__DimensionsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Datasource__DimensionsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDatasourceAccess().getDimensionsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Group__5__Impl"


    // $ANTLR start "rule__Datasource__Group__6"
    // InternalVizualizer.g:1340:1: rule__Datasource__Group__6 : rule__Datasource__Group__6__Impl rule__Datasource__Group__7 ;
    public final void rule__Datasource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1344:1: ( rule__Datasource__Group__6__Impl rule__Datasource__Group__7 )
            // InternalVizualizer.g:1345:2: rule__Datasource__Group__6__Impl rule__Datasource__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Datasource__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Datasource__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Group__6"


    // $ANTLR start "rule__Datasource__Group__6__Impl"
    // InternalVizualizer.g:1352:1: rule__Datasource__Group__6__Impl : ( ( rule__Datasource__Group_6__0 )* ) ;
    public final void rule__Datasource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1356:1: ( ( ( rule__Datasource__Group_6__0 )* ) )
            // InternalVizualizer.g:1357:1: ( ( rule__Datasource__Group_6__0 )* )
            {
            // InternalVizualizer.g:1357:1: ( ( rule__Datasource__Group_6__0 )* )
            // InternalVizualizer.g:1358:2: ( rule__Datasource__Group_6__0 )*
            {
             before(grammarAccess.getDatasourceAccess().getGroup_6()); 
            // InternalVizualizer.g:1359:2: ( rule__Datasource__Group_6__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalVizualizer.g:1359:3: rule__Datasource__Group_6__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Datasource__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getDatasourceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Group__6__Impl"


    // $ANTLR start "rule__Datasource__Group__7"
    // InternalVizualizer.g:1367:1: rule__Datasource__Group__7 : rule__Datasource__Group__7__Impl ;
    public final void rule__Datasource__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1371:1: ( rule__Datasource__Group__7__Impl )
            // InternalVizualizer.g:1372:2: rule__Datasource__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Datasource__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Group__7"


    // $ANTLR start "rule__Datasource__Group__7__Impl"
    // InternalVizualizer.g:1378:1: rule__Datasource__Group__7__Impl : ( '}' ) ;
    public final void rule__Datasource__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1382:1: ( ( '}' ) )
            // InternalVizualizer.g:1383:1: ( '}' )
            {
            // InternalVizualizer.g:1383:1: ( '}' )
            // InternalVizualizer.g:1384:2: '}'
            {
             before(grammarAccess.getDatasourceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDatasourceAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Group__7__Impl"


    // $ANTLR start "rule__Datasource__Group_6__0"
    // InternalVizualizer.g:1394:1: rule__Datasource__Group_6__0 : rule__Datasource__Group_6__0__Impl rule__Datasource__Group_6__1 ;
    public final void rule__Datasource__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1398:1: ( rule__Datasource__Group_6__0__Impl rule__Datasource__Group_6__1 )
            // InternalVizualizer.g:1399:2: rule__Datasource__Group_6__0__Impl rule__Datasource__Group_6__1
            {
            pushFollow(FOLLOW_11);
            rule__Datasource__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Datasource__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Group_6__0"


    // $ANTLR start "rule__Datasource__Group_6__0__Impl"
    // InternalVizualizer.g:1406:1: rule__Datasource__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Datasource__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1410:1: ( ( ',' ) )
            // InternalVizualizer.g:1411:1: ( ',' )
            {
            // InternalVizualizer.g:1411:1: ( ',' )
            // InternalVizualizer.g:1412:2: ','
            {
             before(grammarAccess.getDatasourceAccess().getCommaKeyword_6_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDatasourceAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Group_6__0__Impl"


    // $ANTLR start "rule__Datasource__Group_6__1"
    // InternalVizualizer.g:1421:1: rule__Datasource__Group_6__1 : rule__Datasource__Group_6__1__Impl ;
    public final void rule__Datasource__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1425:1: ( rule__Datasource__Group_6__1__Impl )
            // InternalVizualizer.g:1426:2: rule__Datasource__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Datasource__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Group_6__1"


    // $ANTLR start "rule__Datasource__Group_6__1__Impl"
    // InternalVizualizer.g:1432:1: rule__Datasource__Group_6__1__Impl : ( ( rule__Datasource__DimensionsAssignment_6_1 ) ) ;
    public final void rule__Datasource__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1436:1: ( ( ( rule__Datasource__DimensionsAssignment_6_1 ) ) )
            // InternalVizualizer.g:1437:1: ( ( rule__Datasource__DimensionsAssignment_6_1 ) )
            {
            // InternalVizualizer.g:1437:1: ( ( rule__Datasource__DimensionsAssignment_6_1 ) )
            // InternalVizualizer.g:1438:2: ( rule__Datasource__DimensionsAssignment_6_1 )
            {
             before(grammarAccess.getDatasourceAccess().getDimensionsAssignment_6_1()); 
            // InternalVizualizer.g:1439:2: ( rule__Datasource__DimensionsAssignment_6_1 )
            // InternalVizualizer.g:1439:3: rule__Datasource__DimensionsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Datasource__DimensionsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getDatasourceAccess().getDimensionsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Group_6__1__Impl"


    // $ANTLR start "rule__Dimension__Group__0"
    // InternalVizualizer.g:1448:1: rule__Dimension__Group__0 : rule__Dimension__Group__0__Impl rule__Dimension__Group__1 ;
    public final void rule__Dimension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1452:1: ( rule__Dimension__Group__0__Impl rule__Dimension__Group__1 )
            // InternalVizualizer.g:1453:2: rule__Dimension__Group__0__Impl rule__Dimension__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Dimension__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dimension__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__0"


    // $ANTLR start "rule__Dimension__Group__0__Impl"
    // InternalVizualizer.g:1460:1: rule__Dimension__Group__0__Impl : ( 'Formula' ) ;
    public final void rule__Dimension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1464:1: ( ( 'Formula' ) )
            // InternalVizualizer.g:1465:1: ( 'Formula' )
            {
            // InternalVizualizer.g:1465:1: ( 'Formula' )
            // InternalVizualizer.g:1466:2: 'Formula'
            {
             before(grammarAccess.getDimensionAccess().getFormulaKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDimensionAccess().getFormulaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__0__Impl"


    // $ANTLR start "rule__Dimension__Group__1"
    // InternalVizualizer.g:1475:1: rule__Dimension__Group__1 : rule__Dimension__Group__1__Impl rule__Dimension__Group__2 ;
    public final void rule__Dimension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1479:1: ( rule__Dimension__Group__1__Impl rule__Dimension__Group__2 )
            // InternalVizualizer.g:1480:2: rule__Dimension__Group__1__Impl rule__Dimension__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Dimension__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dimension__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__1"


    // $ANTLR start "rule__Dimension__Group__1__Impl"
    // InternalVizualizer.g:1487:1: rule__Dimension__Group__1__Impl : ( ( rule__Dimension__NameAssignment_1 ) ) ;
    public final void rule__Dimension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1491:1: ( ( ( rule__Dimension__NameAssignment_1 ) ) )
            // InternalVizualizer.g:1492:1: ( ( rule__Dimension__NameAssignment_1 ) )
            {
            // InternalVizualizer.g:1492:1: ( ( rule__Dimension__NameAssignment_1 ) )
            // InternalVizualizer.g:1493:2: ( rule__Dimension__NameAssignment_1 )
            {
             before(grammarAccess.getDimensionAccess().getNameAssignment_1()); 
            // InternalVizualizer.g:1494:2: ( rule__Dimension__NameAssignment_1 )
            // InternalVizualizer.g:1494:3: rule__Dimension__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Dimension__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDimensionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__1__Impl"


    // $ANTLR start "rule__Dimension__Group__2"
    // InternalVizualizer.g:1502:1: rule__Dimension__Group__2 : rule__Dimension__Group__2__Impl rule__Dimension__Group__3 ;
    public final void rule__Dimension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1506:1: ( rule__Dimension__Group__2__Impl rule__Dimension__Group__3 )
            // InternalVizualizer.g:1507:2: rule__Dimension__Group__2__Impl rule__Dimension__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Dimension__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dimension__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__2"


    // $ANTLR start "rule__Dimension__Group__2__Impl"
    // InternalVizualizer.g:1514:1: rule__Dimension__Group__2__Impl : ( ( rule__Dimension__SourceSelectorsAssignment_2 ) ) ;
    public final void rule__Dimension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1518:1: ( ( ( rule__Dimension__SourceSelectorsAssignment_2 ) ) )
            // InternalVizualizer.g:1519:1: ( ( rule__Dimension__SourceSelectorsAssignment_2 ) )
            {
            // InternalVizualizer.g:1519:1: ( ( rule__Dimension__SourceSelectorsAssignment_2 ) )
            // InternalVizualizer.g:1520:2: ( rule__Dimension__SourceSelectorsAssignment_2 )
            {
             before(grammarAccess.getDimensionAccess().getSourceSelectorsAssignment_2()); 
            // InternalVizualizer.g:1521:2: ( rule__Dimension__SourceSelectorsAssignment_2 )
            // InternalVizualizer.g:1521:3: rule__Dimension__SourceSelectorsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Dimension__SourceSelectorsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDimensionAccess().getSourceSelectorsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__2__Impl"


    // $ANTLR start "rule__Dimension__Group__3"
    // InternalVizualizer.g:1529:1: rule__Dimension__Group__3 : rule__Dimension__Group__3__Impl ;
    public final void rule__Dimension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1533:1: ( rule__Dimension__Group__3__Impl )
            // InternalVizualizer.g:1534:2: rule__Dimension__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dimension__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__3"


    // $ANTLR start "rule__Dimension__Group__3__Impl"
    // InternalVizualizer.g:1540:1: rule__Dimension__Group__3__Impl : ( ( rule__Dimension__Group_3__0 )* ) ;
    public final void rule__Dimension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1544:1: ( ( ( rule__Dimension__Group_3__0 )* ) )
            // InternalVizualizer.g:1545:1: ( ( rule__Dimension__Group_3__0 )* )
            {
            // InternalVizualizer.g:1545:1: ( ( rule__Dimension__Group_3__0 )* )
            // InternalVizualizer.g:1546:2: ( rule__Dimension__Group_3__0 )*
            {
             before(grammarAccess.getDimensionAccess().getGroup_3()); 
            // InternalVizualizer.g:1547:2: ( rule__Dimension__Group_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalVizualizer.g:1547:3: rule__Dimension__Group_3__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Dimension__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getDimensionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__3__Impl"


    // $ANTLR start "rule__Dimension__Group_3__0"
    // InternalVizualizer.g:1556:1: rule__Dimension__Group_3__0 : rule__Dimension__Group_3__0__Impl rule__Dimension__Group_3__1 ;
    public final void rule__Dimension__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1560:1: ( rule__Dimension__Group_3__0__Impl rule__Dimension__Group_3__1 )
            // InternalVizualizer.g:1561:2: rule__Dimension__Group_3__0__Impl rule__Dimension__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Dimension__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dimension__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group_3__0"


    // $ANTLR start "rule__Dimension__Group_3__0__Impl"
    // InternalVizualizer.g:1568:1: rule__Dimension__Group_3__0__Impl : ( 'and' ) ;
    public final void rule__Dimension__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1572:1: ( ( 'and' ) )
            // InternalVizualizer.g:1573:1: ( 'and' )
            {
            // InternalVizualizer.g:1573:1: ( 'and' )
            // InternalVizualizer.g:1574:2: 'and'
            {
             before(grammarAccess.getDimensionAccess().getAndKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDimensionAccess().getAndKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group_3__0__Impl"


    // $ANTLR start "rule__Dimension__Group_3__1"
    // InternalVizualizer.g:1583:1: rule__Dimension__Group_3__1 : rule__Dimension__Group_3__1__Impl ;
    public final void rule__Dimension__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1587:1: ( rule__Dimension__Group_3__1__Impl )
            // InternalVizualizer.g:1588:2: rule__Dimension__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dimension__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group_3__1"


    // $ANTLR start "rule__Dimension__Group_3__1__Impl"
    // InternalVizualizer.g:1594:1: rule__Dimension__Group_3__1__Impl : ( ( rule__Dimension__SourceSelectorsAssignment_3_1 ) ) ;
    public final void rule__Dimension__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1598:1: ( ( ( rule__Dimension__SourceSelectorsAssignment_3_1 ) ) )
            // InternalVizualizer.g:1599:1: ( ( rule__Dimension__SourceSelectorsAssignment_3_1 ) )
            {
            // InternalVizualizer.g:1599:1: ( ( rule__Dimension__SourceSelectorsAssignment_3_1 ) )
            // InternalVizualizer.g:1600:2: ( rule__Dimension__SourceSelectorsAssignment_3_1 )
            {
             before(grammarAccess.getDimensionAccess().getSourceSelectorsAssignment_3_1()); 
            // InternalVizualizer.g:1601:2: ( rule__Dimension__SourceSelectorsAssignment_3_1 )
            // InternalVizualizer.g:1601:3: rule__Dimension__SourceSelectorsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Dimension__SourceSelectorsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDimensionAccess().getSourceSelectorsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group_3__1__Impl"


    // $ANTLR start "rule__DimensionSelector__Group__0"
    // InternalVizualizer.g:1610:1: rule__DimensionSelector__Group__0 : rule__DimensionSelector__Group__0__Impl rule__DimensionSelector__Group__1 ;
    public final void rule__DimensionSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1614:1: ( rule__DimensionSelector__Group__0__Impl rule__DimensionSelector__Group__1 )
            // InternalVizualizer.g:1615:2: rule__DimensionSelector__Group__0__Impl rule__DimensionSelector__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DimensionSelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DimensionSelector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionSelector__Group__0"


    // $ANTLR start "rule__DimensionSelector__Group__0__Impl"
    // InternalVizualizer.g:1622:1: rule__DimensionSelector__Group__0__Impl : ( 'using' ) ;
    public final void rule__DimensionSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1626:1: ( ( 'using' ) )
            // InternalVizualizer.g:1627:1: ( 'using' )
            {
            // InternalVizualizer.g:1627:1: ( 'using' )
            // InternalVizualizer.g:1628:2: 'using'
            {
             before(grammarAccess.getDimensionSelectorAccess().getUsingKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDimensionSelectorAccess().getUsingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionSelector__Group__0__Impl"


    // $ANTLR start "rule__DimensionSelector__Group__1"
    // InternalVizualizer.g:1637:1: rule__DimensionSelector__Group__1 : rule__DimensionSelector__Group__1__Impl rule__DimensionSelector__Group__2 ;
    public final void rule__DimensionSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1641:1: ( rule__DimensionSelector__Group__1__Impl rule__DimensionSelector__Group__2 )
            // InternalVizualizer.g:1642:2: rule__DimensionSelector__Group__1__Impl rule__DimensionSelector__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__DimensionSelector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DimensionSelector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionSelector__Group__1"


    // $ANTLR start "rule__DimensionSelector__Group__1__Impl"
    // InternalVizualizer.g:1649:1: rule__DimensionSelector__Group__1__Impl : ( ( rule__DimensionSelector__SourceAssignment_1 ) ) ;
    public final void rule__DimensionSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1653:1: ( ( ( rule__DimensionSelector__SourceAssignment_1 ) ) )
            // InternalVizualizer.g:1654:1: ( ( rule__DimensionSelector__SourceAssignment_1 ) )
            {
            // InternalVizualizer.g:1654:1: ( ( rule__DimensionSelector__SourceAssignment_1 ) )
            // InternalVizualizer.g:1655:2: ( rule__DimensionSelector__SourceAssignment_1 )
            {
             before(grammarAccess.getDimensionSelectorAccess().getSourceAssignment_1()); 
            // InternalVizualizer.g:1656:2: ( rule__DimensionSelector__SourceAssignment_1 )
            // InternalVizualizer.g:1656:3: rule__DimensionSelector__SourceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DimensionSelector__SourceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDimensionSelectorAccess().getSourceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionSelector__Group__1__Impl"


    // $ANTLR start "rule__DimensionSelector__Group__2"
    // InternalVizualizer.g:1664:1: rule__DimensionSelector__Group__2 : rule__DimensionSelector__Group__2__Impl rule__DimensionSelector__Group__3 ;
    public final void rule__DimensionSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1668:1: ( rule__DimensionSelector__Group__2__Impl rule__DimensionSelector__Group__3 )
            // InternalVizualizer.g:1669:2: rule__DimensionSelector__Group__2__Impl rule__DimensionSelector__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__DimensionSelector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DimensionSelector__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionSelector__Group__2"


    // $ANTLR start "rule__DimensionSelector__Group__2__Impl"
    // InternalVizualizer.g:1676:1: rule__DimensionSelector__Group__2__Impl : ( '[' ) ;
    public final void rule__DimensionSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1680:1: ( ( '[' ) )
            // InternalVizualizer.g:1681:1: ( '[' )
            {
            // InternalVizualizer.g:1681:1: ( '[' )
            // InternalVizualizer.g:1682:2: '['
            {
             before(grammarAccess.getDimensionSelectorAccess().getLeftSquareBracketKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDimensionSelectorAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionSelector__Group__2__Impl"


    // $ANTLR start "rule__DimensionSelector__Group__3"
    // InternalVizualizer.g:1691:1: rule__DimensionSelector__Group__3 : rule__DimensionSelector__Group__3__Impl rule__DimensionSelector__Group__4 ;
    public final void rule__DimensionSelector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1695:1: ( rule__DimensionSelector__Group__3__Impl rule__DimensionSelector__Group__4 )
            // InternalVizualizer.g:1696:2: rule__DimensionSelector__Group__3__Impl rule__DimensionSelector__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__DimensionSelector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DimensionSelector__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionSelector__Group__3"


    // $ANTLR start "rule__DimensionSelector__Group__3__Impl"
    // InternalVizualizer.g:1703:1: rule__DimensionSelector__Group__3__Impl : ( ( rule__DimensionSelector__SelectVarAssignment_3 ) ) ;
    public final void rule__DimensionSelector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1707:1: ( ( ( rule__DimensionSelector__SelectVarAssignment_3 ) ) )
            // InternalVizualizer.g:1708:1: ( ( rule__DimensionSelector__SelectVarAssignment_3 ) )
            {
            // InternalVizualizer.g:1708:1: ( ( rule__DimensionSelector__SelectVarAssignment_3 ) )
            // InternalVizualizer.g:1709:2: ( rule__DimensionSelector__SelectVarAssignment_3 )
            {
             before(grammarAccess.getDimensionSelectorAccess().getSelectVarAssignment_3()); 
            // InternalVizualizer.g:1710:2: ( rule__DimensionSelector__SelectVarAssignment_3 )
            // InternalVizualizer.g:1710:3: rule__DimensionSelector__SelectVarAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DimensionSelector__SelectVarAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDimensionSelectorAccess().getSelectVarAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionSelector__Group__3__Impl"


    // $ANTLR start "rule__DimensionSelector__Group__4"
    // InternalVizualizer.g:1718:1: rule__DimensionSelector__Group__4 : rule__DimensionSelector__Group__4__Impl rule__DimensionSelector__Group__5 ;
    public final void rule__DimensionSelector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1722:1: ( rule__DimensionSelector__Group__4__Impl rule__DimensionSelector__Group__5 )
            // InternalVizualizer.g:1723:2: rule__DimensionSelector__Group__4__Impl rule__DimensionSelector__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__DimensionSelector__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DimensionSelector__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionSelector__Group__4"


    // $ANTLR start "rule__DimensionSelector__Group__4__Impl"
    // InternalVizualizer.g:1730:1: rule__DimensionSelector__Group__4__Impl : ( ']' ) ;
    public final void rule__DimensionSelector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1734:1: ( ( ']' ) )
            // InternalVizualizer.g:1735:1: ( ']' )
            {
            // InternalVizualizer.g:1735:1: ( ']' )
            // InternalVizualizer.g:1736:2: ']'
            {
             before(grammarAccess.getDimensionSelectorAccess().getRightSquareBracketKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDimensionSelectorAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionSelector__Group__4__Impl"


    // $ANTLR start "rule__DimensionSelector__Group__5"
    // InternalVizualizer.g:1745:1: rule__DimensionSelector__Group__5 : rule__DimensionSelector__Group__5__Impl rule__DimensionSelector__Group__6 ;
    public final void rule__DimensionSelector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1749:1: ( rule__DimensionSelector__Group__5__Impl rule__DimensionSelector__Group__6 )
            // InternalVizualizer.g:1750:2: rule__DimensionSelector__Group__5__Impl rule__DimensionSelector__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__DimensionSelector__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DimensionSelector__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionSelector__Group__5"


    // $ANTLR start "rule__DimensionSelector__Group__5__Impl"
    // InternalVizualizer.g:1757:1: rule__DimensionSelector__Group__5__Impl : ( 'as' ) ;
    public final void rule__DimensionSelector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1761:1: ( ( 'as' ) )
            // InternalVizualizer.g:1762:1: ( 'as' )
            {
            // InternalVizualizer.g:1762:1: ( 'as' )
            // InternalVizualizer.g:1763:2: 'as'
            {
             before(grammarAccess.getDimensionSelectorAccess().getAsKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDimensionSelectorAccess().getAsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionSelector__Group__5__Impl"


    // $ANTLR start "rule__DimensionSelector__Group__6"
    // InternalVizualizer.g:1772:1: rule__DimensionSelector__Group__6 : rule__DimensionSelector__Group__6__Impl ;
    public final void rule__DimensionSelector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1776:1: ( rule__DimensionSelector__Group__6__Impl )
            // InternalVizualizer.g:1777:2: rule__DimensionSelector__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DimensionSelector__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionSelector__Group__6"


    // $ANTLR start "rule__DimensionSelector__Group__6__Impl"
    // InternalVizualizer.g:1783:1: rule__DimensionSelector__Group__6__Impl : ( ( rule__DimensionSelector__NameAssignment_6 ) ) ;
    public final void rule__DimensionSelector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1787:1: ( ( ( rule__DimensionSelector__NameAssignment_6 ) ) )
            // InternalVizualizer.g:1788:1: ( ( rule__DimensionSelector__NameAssignment_6 ) )
            {
            // InternalVizualizer.g:1788:1: ( ( rule__DimensionSelector__NameAssignment_6 ) )
            // InternalVizualizer.g:1789:2: ( rule__DimensionSelector__NameAssignment_6 )
            {
             before(grammarAccess.getDimensionSelectorAccess().getNameAssignment_6()); 
            // InternalVizualizer.g:1790:2: ( rule__DimensionSelector__NameAssignment_6 )
            // InternalVizualizer.g:1790:3: rule__DimensionSelector__NameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__DimensionSelector__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDimensionSelectorAccess().getNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionSelector__Group__6__Impl"


    // $ANTLR start "rule__PostEndPoint__Group__0"
    // InternalVizualizer.g:1799:1: rule__PostEndPoint__Group__0 : rule__PostEndPoint__Group__0__Impl rule__PostEndPoint__Group__1 ;
    public final void rule__PostEndPoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1803:1: ( rule__PostEndPoint__Group__0__Impl rule__PostEndPoint__Group__1 )
            // InternalVizualizer.g:1804:2: rule__PostEndPoint__Group__0__Impl rule__PostEndPoint__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PostEndPoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PostEndPoint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostEndPoint__Group__0"


    // $ANTLR start "rule__PostEndPoint__Group__0__Impl"
    // InternalVizualizer.g:1811:1: rule__PostEndPoint__Group__0__Impl : ( 'PostPoint' ) ;
    public final void rule__PostEndPoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1815:1: ( ( 'PostPoint' ) )
            // InternalVizualizer.g:1816:1: ( 'PostPoint' )
            {
            // InternalVizualizer.g:1816:1: ( 'PostPoint' )
            // InternalVizualizer.g:1817:2: 'PostPoint'
            {
             before(grammarAccess.getPostEndPointAccess().getPostPointKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPostEndPointAccess().getPostPointKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostEndPoint__Group__0__Impl"


    // $ANTLR start "rule__PostEndPoint__Group__1"
    // InternalVizualizer.g:1826:1: rule__PostEndPoint__Group__1 : rule__PostEndPoint__Group__1__Impl rule__PostEndPoint__Group__2 ;
    public final void rule__PostEndPoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1830:1: ( rule__PostEndPoint__Group__1__Impl rule__PostEndPoint__Group__2 )
            // InternalVizualizer.g:1831:2: rule__PostEndPoint__Group__1__Impl rule__PostEndPoint__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PostEndPoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PostEndPoint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostEndPoint__Group__1"


    // $ANTLR start "rule__PostEndPoint__Group__1__Impl"
    // InternalVizualizer.g:1838:1: rule__PostEndPoint__Group__1__Impl : ( ( rule__PostEndPoint__NameAssignment_1 ) ) ;
    public final void rule__PostEndPoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1842:1: ( ( ( rule__PostEndPoint__NameAssignment_1 ) ) )
            // InternalVizualizer.g:1843:1: ( ( rule__PostEndPoint__NameAssignment_1 ) )
            {
            // InternalVizualizer.g:1843:1: ( ( rule__PostEndPoint__NameAssignment_1 ) )
            // InternalVizualizer.g:1844:2: ( rule__PostEndPoint__NameAssignment_1 )
            {
             before(grammarAccess.getPostEndPointAccess().getNameAssignment_1()); 
            // InternalVizualizer.g:1845:2: ( rule__PostEndPoint__NameAssignment_1 )
            // InternalVizualizer.g:1845:3: rule__PostEndPoint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PostEndPoint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPostEndPointAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostEndPoint__Group__1__Impl"


    // $ANTLR start "rule__PostEndPoint__Group__2"
    // InternalVizualizer.g:1853:1: rule__PostEndPoint__Group__2 : rule__PostEndPoint__Group__2__Impl rule__PostEndPoint__Group__3 ;
    public final void rule__PostEndPoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1857:1: ( rule__PostEndPoint__Group__2__Impl rule__PostEndPoint__Group__3 )
            // InternalVizualizer.g:1858:2: rule__PostEndPoint__Group__2__Impl rule__PostEndPoint__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__PostEndPoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PostEndPoint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostEndPoint__Group__2"


    // $ANTLR start "rule__PostEndPoint__Group__2__Impl"
    // InternalVizualizer.g:1865:1: rule__PostEndPoint__Group__2__Impl : ( '{' ) ;
    public final void rule__PostEndPoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1869:1: ( ( '{' ) )
            // InternalVizualizer.g:1870:1: ( '{' )
            {
            // InternalVizualizer.g:1870:1: ( '{' )
            // InternalVizualizer.g:1871:2: '{'
            {
             before(grammarAccess.getPostEndPointAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPostEndPointAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostEndPoint__Group__2__Impl"


    // $ANTLR start "rule__PostEndPoint__Group__3"
    // InternalVizualizer.g:1880:1: rule__PostEndPoint__Group__3 : rule__PostEndPoint__Group__3__Impl rule__PostEndPoint__Group__4 ;
    public final void rule__PostEndPoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1884:1: ( rule__PostEndPoint__Group__3__Impl rule__PostEndPoint__Group__4 )
            // InternalVizualizer.g:1885:2: rule__PostEndPoint__Group__3__Impl rule__PostEndPoint__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__PostEndPoint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PostEndPoint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostEndPoint__Group__3"


    // $ANTLR start "rule__PostEndPoint__Group__3__Impl"
    // InternalVizualizer.g:1892:1: rule__PostEndPoint__Group__3__Impl : ( 'url' ) ;
    public final void rule__PostEndPoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1896:1: ( ( 'url' ) )
            // InternalVizualizer.g:1897:1: ( 'url' )
            {
            // InternalVizualizer.g:1897:1: ( 'url' )
            // InternalVizualizer.g:1898:2: 'url'
            {
             before(grammarAccess.getPostEndPointAccess().getUrlKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPostEndPointAccess().getUrlKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostEndPoint__Group__3__Impl"


    // $ANTLR start "rule__PostEndPoint__Group__4"
    // InternalVizualizer.g:1907:1: rule__PostEndPoint__Group__4 : rule__PostEndPoint__Group__4__Impl rule__PostEndPoint__Group__5 ;
    public final void rule__PostEndPoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1911:1: ( rule__PostEndPoint__Group__4__Impl rule__PostEndPoint__Group__5 )
            // InternalVizualizer.g:1912:2: rule__PostEndPoint__Group__4__Impl rule__PostEndPoint__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__PostEndPoint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PostEndPoint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostEndPoint__Group__4"


    // $ANTLR start "rule__PostEndPoint__Group__4__Impl"
    // InternalVizualizer.g:1919:1: rule__PostEndPoint__Group__4__Impl : ( ( rule__PostEndPoint__UrlAssignment_4 ) ) ;
    public final void rule__PostEndPoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1923:1: ( ( ( rule__PostEndPoint__UrlAssignment_4 ) ) )
            // InternalVizualizer.g:1924:1: ( ( rule__PostEndPoint__UrlAssignment_4 ) )
            {
            // InternalVizualizer.g:1924:1: ( ( rule__PostEndPoint__UrlAssignment_4 ) )
            // InternalVizualizer.g:1925:2: ( rule__PostEndPoint__UrlAssignment_4 )
            {
             before(grammarAccess.getPostEndPointAccess().getUrlAssignment_4()); 
            // InternalVizualizer.g:1926:2: ( rule__PostEndPoint__UrlAssignment_4 )
            // InternalVizualizer.g:1926:3: rule__PostEndPoint__UrlAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PostEndPoint__UrlAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPostEndPointAccess().getUrlAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostEndPoint__Group__4__Impl"


    // $ANTLR start "rule__PostEndPoint__Group__5"
    // InternalVizualizer.g:1934:1: rule__PostEndPoint__Group__5 : rule__PostEndPoint__Group__5__Impl rule__PostEndPoint__Group__6 ;
    public final void rule__PostEndPoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1938:1: ( rule__PostEndPoint__Group__5__Impl rule__PostEndPoint__Group__6 )
            // InternalVizualizer.g:1939:2: rule__PostEndPoint__Group__5__Impl rule__PostEndPoint__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__PostEndPoint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PostEndPoint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostEndPoint__Group__5"


    // $ANTLR start "rule__PostEndPoint__Group__5__Impl"
    // InternalVizualizer.g:1946:1: rule__PostEndPoint__Group__5__Impl : ( 'use Schema' ) ;
    public final void rule__PostEndPoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1950:1: ( ( 'use Schema' ) )
            // InternalVizualizer.g:1951:1: ( 'use Schema' )
            {
            // InternalVizualizer.g:1951:1: ( 'use Schema' )
            // InternalVizualizer.g:1952:2: 'use Schema'
            {
             before(grammarAccess.getPostEndPointAccess().getUseSchemaKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPostEndPointAccess().getUseSchemaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostEndPoint__Group__5__Impl"


    // $ANTLR start "rule__PostEndPoint__Group__6"
    // InternalVizualizer.g:1961:1: rule__PostEndPoint__Group__6 : rule__PostEndPoint__Group__6__Impl rule__PostEndPoint__Group__7 ;
    public final void rule__PostEndPoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1965:1: ( rule__PostEndPoint__Group__6__Impl rule__PostEndPoint__Group__7 )
            // InternalVizualizer.g:1966:2: rule__PostEndPoint__Group__6__Impl rule__PostEndPoint__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__PostEndPoint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PostEndPoint__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostEndPoint__Group__6"


    // $ANTLR start "rule__PostEndPoint__Group__6__Impl"
    // InternalVizualizer.g:1973:1: rule__PostEndPoint__Group__6__Impl : ( ( rule__PostEndPoint__ParserAssignment_6 ) ) ;
    public final void rule__PostEndPoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1977:1: ( ( ( rule__PostEndPoint__ParserAssignment_6 ) ) )
            // InternalVizualizer.g:1978:1: ( ( rule__PostEndPoint__ParserAssignment_6 ) )
            {
            // InternalVizualizer.g:1978:1: ( ( rule__PostEndPoint__ParserAssignment_6 ) )
            // InternalVizualizer.g:1979:2: ( rule__PostEndPoint__ParserAssignment_6 )
            {
             before(grammarAccess.getPostEndPointAccess().getParserAssignment_6()); 
            // InternalVizualizer.g:1980:2: ( rule__PostEndPoint__ParserAssignment_6 )
            // InternalVizualizer.g:1980:3: rule__PostEndPoint__ParserAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__PostEndPoint__ParserAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPostEndPointAccess().getParserAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostEndPoint__Group__6__Impl"


    // $ANTLR start "rule__PostEndPoint__Group__7"
    // InternalVizualizer.g:1988:1: rule__PostEndPoint__Group__7 : rule__PostEndPoint__Group__7__Impl ;
    public final void rule__PostEndPoint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1992:1: ( rule__PostEndPoint__Group__7__Impl )
            // InternalVizualizer.g:1993:2: rule__PostEndPoint__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PostEndPoint__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostEndPoint__Group__7"


    // $ANTLR start "rule__PostEndPoint__Group__7__Impl"
    // InternalVizualizer.g:1999:1: rule__PostEndPoint__Group__7__Impl : ( '}' ) ;
    public final void rule__PostEndPoint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2003:1: ( ( '}' ) )
            // InternalVizualizer.g:2004:1: ( '}' )
            {
            // InternalVizualizer.g:2004:1: ( '}' )
            // InternalVizualizer.g:2005:2: '}'
            {
             before(grammarAccess.getPostEndPointAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPostEndPointAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostEndPoint__Group__7__Impl"


    // $ANTLR start "rule__GetEndPoint__Group__0"
    // InternalVizualizer.g:2015:1: rule__GetEndPoint__Group__0 : rule__GetEndPoint__Group__0__Impl rule__GetEndPoint__Group__1 ;
    public final void rule__GetEndPoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2019:1: ( rule__GetEndPoint__Group__0__Impl rule__GetEndPoint__Group__1 )
            // InternalVizualizer.g:2020:2: rule__GetEndPoint__Group__0__Impl rule__GetEndPoint__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__GetEndPoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetEndPoint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__Group__0"


    // $ANTLR start "rule__GetEndPoint__Group__0__Impl"
    // InternalVizualizer.g:2027:1: rule__GetEndPoint__Group__0__Impl : ( 'GetPoint' ) ;
    public final void rule__GetEndPoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2031:1: ( ( 'GetPoint' ) )
            // InternalVizualizer.g:2032:1: ( 'GetPoint' )
            {
            // InternalVizualizer.g:2032:1: ( 'GetPoint' )
            // InternalVizualizer.g:2033:2: 'GetPoint'
            {
             before(grammarAccess.getGetEndPointAccess().getGetPointKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getGetEndPointAccess().getGetPointKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__Group__0__Impl"


    // $ANTLR start "rule__GetEndPoint__Group__1"
    // InternalVizualizer.g:2042:1: rule__GetEndPoint__Group__1 : rule__GetEndPoint__Group__1__Impl rule__GetEndPoint__Group__2 ;
    public final void rule__GetEndPoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2046:1: ( rule__GetEndPoint__Group__1__Impl rule__GetEndPoint__Group__2 )
            // InternalVizualizer.g:2047:2: rule__GetEndPoint__Group__1__Impl rule__GetEndPoint__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__GetEndPoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetEndPoint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__Group__1"


    // $ANTLR start "rule__GetEndPoint__Group__1__Impl"
    // InternalVizualizer.g:2054:1: rule__GetEndPoint__Group__1__Impl : ( ( rule__GetEndPoint__NameAssignment_1 ) ) ;
    public final void rule__GetEndPoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2058:1: ( ( ( rule__GetEndPoint__NameAssignment_1 ) ) )
            // InternalVizualizer.g:2059:1: ( ( rule__GetEndPoint__NameAssignment_1 ) )
            {
            // InternalVizualizer.g:2059:1: ( ( rule__GetEndPoint__NameAssignment_1 ) )
            // InternalVizualizer.g:2060:2: ( rule__GetEndPoint__NameAssignment_1 )
            {
             before(grammarAccess.getGetEndPointAccess().getNameAssignment_1()); 
            // InternalVizualizer.g:2061:2: ( rule__GetEndPoint__NameAssignment_1 )
            // InternalVizualizer.g:2061:3: rule__GetEndPoint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GetEndPoint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGetEndPointAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__Group__1__Impl"


    // $ANTLR start "rule__GetEndPoint__Group__2"
    // InternalVizualizer.g:2069:1: rule__GetEndPoint__Group__2 : rule__GetEndPoint__Group__2__Impl rule__GetEndPoint__Group__3 ;
    public final void rule__GetEndPoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2073:1: ( rule__GetEndPoint__Group__2__Impl rule__GetEndPoint__Group__3 )
            // InternalVizualizer.g:2074:2: rule__GetEndPoint__Group__2__Impl rule__GetEndPoint__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__GetEndPoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetEndPoint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__Group__2"


    // $ANTLR start "rule__GetEndPoint__Group__2__Impl"
    // InternalVizualizer.g:2081:1: rule__GetEndPoint__Group__2__Impl : ( '{' ) ;
    public final void rule__GetEndPoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2085:1: ( ( '{' ) )
            // InternalVizualizer.g:2086:1: ( '{' )
            {
            // InternalVizualizer.g:2086:1: ( '{' )
            // InternalVizualizer.g:2087:2: '{'
            {
             before(grammarAccess.getGetEndPointAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGetEndPointAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__Group__2__Impl"


    // $ANTLR start "rule__GetEndPoint__Group__3"
    // InternalVizualizer.g:2096:1: rule__GetEndPoint__Group__3 : rule__GetEndPoint__Group__3__Impl rule__GetEndPoint__Group__4 ;
    public final void rule__GetEndPoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2100:1: ( rule__GetEndPoint__Group__3__Impl rule__GetEndPoint__Group__4 )
            // InternalVizualizer.g:2101:2: rule__GetEndPoint__Group__3__Impl rule__GetEndPoint__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__GetEndPoint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetEndPoint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__Group__3"


    // $ANTLR start "rule__GetEndPoint__Group__3__Impl"
    // InternalVizualizer.g:2108:1: rule__GetEndPoint__Group__3__Impl : ( 'url' ) ;
    public final void rule__GetEndPoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2112:1: ( ( 'url' ) )
            // InternalVizualizer.g:2113:1: ( 'url' )
            {
            // InternalVizualizer.g:2113:1: ( 'url' )
            // InternalVizualizer.g:2114:2: 'url'
            {
             before(grammarAccess.getGetEndPointAccess().getUrlKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getGetEndPointAccess().getUrlKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__Group__3__Impl"


    // $ANTLR start "rule__GetEndPoint__Group__4"
    // InternalVizualizer.g:2123:1: rule__GetEndPoint__Group__4 : rule__GetEndPoint__Group__4__Impl rule__GetEndPoint__Group__5 ;
    public final void rule__GetEndPoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2127:1: ( rule__GetEndPoint__Group__4__Impl rule__GetEndPoint__Group__5 )
            // InternalVizualizer.g:2128:2: rule__GetEndPoint__Group__4__Impl rule__GetEndPoint__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__GetEndPoint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetEndPoint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__Group__4"


    // $ANTLR start "rule__GetEndPoint__Group__4__Impl"
    // InternalVizualizer.g:2135:1: rule__GetEndPoint__Group__4__Impl : ( ( rule__GetEndPoint__UrlAssignment_4 ) ) ;
    public final void rule__GetEndPoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2139:1: ( ( ( rule__GetEndPoint__UrlAssignment_4 ) ) )
            // InternalVizualizer.g:2140:1: ( ( rule__GetEndPoint__UrlAssignment_4 ) )
            {
            // InternalVizualizer.g:2140:1: ( ( rule__GetEndPoint__UrlAssignment_4 ) )
            // InternalVizualizer.g:2141:2: ( rule__GetEndPoint__UrlAssignment_4 )
            {
             before(grammarAccess.getGetEndPointAccess().getUrlAssignment_4()); 
            // InternalVizualizer.g:2142:2: ( rule__GetEndPoint__UrlAssignment_4 )
            // InternalVizualizer.g:2142:3: rule__GetEndPoint__UrlAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__GetEndPoint__UrlAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGetEndPointAccess().getUrlAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__Group__4__Impl"


    // $ANTLR start "rule__GetEndPoint__Group__5"
    // InternalVizualizer.g:2150:1: rule__GetEndPoint__Group__5 : rule__GetEndPoint__Group__5__Impl rule__GetEndPoint__Group__6 ;
    public final void rule__GetEndPoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2154:1: ( rule__GetEndPoint__Group__5__Impl rule__GetEndPoint__Group__6 )
            // InternalVizualizer.g:2155:2: rule__GetEndPoint__Group__5__Impl rule__GetEndPoint__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__GetEndPoint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetEndPoint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__Group__5"


    // $ANTLR start "rule__GetEndPoint__Group__5__Impl"
    // InternalVizualizer.g:2162:1: rule__GetEndPoint__Group__5__Impl : ( 'Headers' ) ;
    public final void rule__GetEndPoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2166:1: ( ( 'Headers' ) )
            // InternalVizualizer.g:2167:1: ( 'Headers' )
            {
            // InternalVizualizer.g:2167:1: ( 'Headers' )
            // InternalVizualizer.g:2168:2: 'Headers'
            {
             before(grammarAccess.getGetEndPointAccess().getHeadersKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGetEndPointAccess().getHeadersKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__Group__5__Impl"


    // $ANTLR start "rule__GetEndPoint__Group__6"
    // InternalVizualizer.g:2177:1: rule__GetEndPoint__Group__6 : rule__GetEndPoint__Group__6__Impl rule__GetEndPoint__Group__7 ;
    public final void rule__GetEndPoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2181:1: ( rule__GetEndPoint__Group__6__Impl rule__GetEndPoint__Group__7 )
            // InternalVizualizer.g:2182:2: rule__GetEndPoint__Group__6__Impl rule__GetEndPoint__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__GetEndPoint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetEndPoint__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__Group__6"


    // $ANTLR start "rule__GetEndPoint__Group__6__Impl"
    // InternalVizualizer.g:2189:1: rule__GetEndPoint__Group__6__Impl : ( '{' ) ;
    public final void rule__GetEndPoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2193:1: ( ( '{' ) )
            // InternalVizualizer.g:2194:1: ( '{' )
            {
            // InternalVizualizer.g:2194:1: ( '{' )
            // InternalVizualizer.g:2195:2: '{'
            {
             before(grammarAccess.getGetEndPointAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGetEndPointAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__Group__6__Impl"


    // $ANTLR start "rule__GetEndPoint__Group__7"
    // InternalVizualizer.g:2204:1: rule__GetEndPoint__Group__7 : rule__GetEndPoint__Group__7__Impl rule__GetEndPoint__Group__8 ;
    public final void rule__GetEndPoint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2208:1: ( rule__GetEndPoint__Group__7__Impl rule__GetEndPoint__Group__8 )
            // InternalVizualizer.g:2209:2: rule__GetEndPoint__Group__7__Impl rule__GetEndPoint__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__GetEndPoint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetEndPoint__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__Group__7"


    // $ANTLR start "rule__GetEndPoint__Group__7__Impl"
    // InternalVizualizer.g:2216:1: rule__GetEndPoint__Group__7__Impl : ( ( rule__GetEndPoint__HeadersAssignment_7 ) ) ;
    public final void rule__GetEndPoint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2220:1: ( ( ( rule__GetEndPoint__HeadersAssignment_7 ) ) )
            // InternalVizualizer.g:2221:1: ( ( rule__GetEndPoint__HeadersAssignment_7 ) )
            {
            // InternalVizualizer.g:2221:1: ( ( rule__GetEndPoint__HeadersAssignment_7 ) )
            // InternalVizualizer.g:2222:2: ( rule__GetEndPoint__HeadersAssignment_7 )
            {
             before(grammarAccess.getGetEndPointAccess().getHeadersAssignment_7()); 
            // InternalVizualizer.g:2223:2: ( rule__GetEndPoint__HeadersAssignment_7 )
            // InternalVizualizer.g:2223:3: rule__GetEndPoint__HeadersAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__GetEndPoint__HeadersAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getGetEndPointAccess().getHeadersAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__Group__7__Impl"


    // $ANTLR start "rule__GetEndPoint__Group__8"
    // InternalVizualizer.g:2231:1: rule__GetEndPoint__Group__8 : rule__GetEndPoint__Group__8__Impl rule__GetEndPoint__Group__9 ;
    public final void rule__GetEndPoint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2235:1: ( rule__GetEndPoint__Group__8__Impl rule__GetEndPoint__Group__9 )
            // InternalVizualizer.g:2236:2: rule__GetEndPoint__Group__8__Impl rule__GetEndPoint__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__GetEndPoint__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetEndPoint__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__Group__8"


    // $ANTLR start "rule__GetEndPoint__Group__8__Impl"
    // InternalVizualizer.g:2243:1: rule__GetEndPoint__Group__8__Impl : ( ( rule__GetEndPoint__Group_8__0 )* ) ;
    public final void rule__GetEndPoint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2247:1: ( ( ( rule__GetEndPoint__Group_8__0 )* ) )
            // InternalVizualizer.g:2248:1: ( ( rule__GetEndPoint__Group_8__0 )* )
            {
            // InternalVizualizer.g:2248:1: ( ( rule__GetEndPoint__Group_8__0 )* )
            // InternalVizualizer.g:2249:2: ( rule__GetEndPoint__Group_8__0 )*
            {
             before(grammarAccess.getGetEndPointAccess().getGroup_8()); 
            // InternalVizualizer.g:2250:2: ( rule__GetEndPoint__Group_8__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalVizualizer.g:2250:3: rule__GetEndPoint__Group_8__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__GetEndPoint__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getGetEndPointAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__Group__8__Impl"


    // $ANTLR start "rule__GetEndPoint__Group__9"
    // InternalVizualizer.g:2258:1: rule__GetEndPoint__Group__9 : rule__GetEndPoint__Group__9__Impl rule__GetEndPoint__Group__10 ;
    public final void rule__GetEndPoint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2262:1: ( rule__GetEndPoint__Group__9__Impl rule__GetEndPoint__Group__10 )
            // InternalVizualizer.g:2263:2: rule__GetEndPoint__Group__9__Impl rule__GetEndPoint__Group__10
            {
            pushFollow(FOLLOW_22);
            rule__GetEndPoint__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetEndPoint__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__Group__9"


    // $ANTLR start "rule__GetEndPoint__Group__9__Impl"
    // InternalVizualizer.g:2270:1: rule__GetEndPoint__Group__9__Impl : ( '}' ) ;
    public final void rule__GetEndPoint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2274:1: ( ( '}' ) )
            // InternalVizualizer.g:2275:1: ( '}' )
            {
            // InternalVizualizer.g:2275:1: ( '}' )
            // InternalVizualizer.g:2276:2: '}'
            {
             before(grammarAccess.getGetEndPointAccess().getRightCurlyBracketKeyword_9()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getGetEndPointAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__Group__9__Impl"


    // $ANTLR start "rule__GetEndPoint__Group__10"
    // InternalVizualizer.g:2285:1: rule__GetEndPoint__Group__10 : rule__GetEndPoint__Group__10__Impl rule__GetEndPoint__Group__11 ;
    public final void rule__GetEndPoint__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2289:1: ( rule__GetEndPoint__Group__10__Impl rule__GetEndPoint__Group__11 )
            // InternalVizualizer.g:2290:2: rule__GetEndPoint__Group__10__Impl rule__GetEndPoint__Group__11
            {
            pushFollow(FOLLOW_4);
            rule__GetEndPoint__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetEndPoint__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__Group__10"


    // $ANTLR start "rule__GetEndPoint__Group__10__Impl"
    // InternalVizualizer.g:2297:1: rule__GetEndPoint__Group__10__Impl : ( 'use Schema' ) ;
    public final void rule__GetEndPoint__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2301:1: ( ( 'use Schema' ) )
            // InternalVizualizer.g:2302:1: ( 'use Schema' )
            {
            // InternalVizualizer.g:2302:1: ( 'use Schema' )
            // InternalVizualizer.g:2303:2: 'use Schema'
            {
             before(grammarAccess.getGetEndPointAccess().getUseSchemaKeyword_10()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getGetEndPointAccess().getUseSchemaKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__Group__10__Impl"


    // $ANTLR start "rule__GetEndPoint__Group__11"
    // InternalVizualizer.g:2312:1: rule__GetEndPoint__Group__11 : rule__GetEndPoint__Group__11__Impl rule__GetEndPoint__Group__12 ;
    public final void rule__GetEndPoint__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2316:1: ( rule__GetEndPoint__Group__11__Impl rule__GetEndPoint__Group__12 )
            // InternalVizualizer.g:2317:2: rule__GetEndPoint__Group__11__Impl rule__GetEndPoint__Group__12
            {
            pushFollow(FOLLOW_23);
            rule__GetEndPoint__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetEndPoint__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__Group__11"


    // $ANTLR start "rule__GetEndPoint__Group__11__Impl"
    // InternalVizualizer.g:2324:1: rule__GetEndPoint__Group__11__Impl : ( ( rule__GetEndPoint__ParserAssignment_11 ) ) ;
    public final void rule__GetEndPoint__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2328:1: ( ( ( rule__GetEndPoint__ParserAssignment_11 ) ) )
            // InternalVizualizer.g:2329:1: ( ( rule__GetEndPoint__ParserAssignment_11 ) )
            {
            // InternalVizualizer.g:2329:1: ( ( rule__GetEndPoint__ParserAssignment_11 ) )
            // InternalVizualizer.g:2330:2: ( rule__GetEndPoint__ParserAssignment_11 )
            {
             before(grammarAccess.getGetEndPointAccess().getParserAssignment_11()); 
            // InternalVizualizer.g:2331:2: ( rule__GetEndPoint__ParserAssignment_11 )
            // InternalVizualizer.g:2331:3: rule__GetEndPoint__ParserAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__GetEndPoint__ParserAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getGetEndPointAccess().getParserAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__Group__11__Impl"


    // $ANTLR start "rule__GetEndPoint__Group__12"
    // InternalVizualizer.g:2339:1: rule__GetEndPoint__Group__12 : rule__GetEndPoint__Group__12__Impl ;
    public final void rule__GetEndPoint__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2343:1: ( rule__GetEndPoint__Group__12__Impl )
            // InternalVizualizer.g:2344:2: rule__GetEndPoint__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GetEndPoint__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__Group__12"


    // $ANTLR start "rule__GetEndPoint__Group__12__Impl"
    // InternalVizualizer.g:2350:1: rule__GetEndPoint__Group__12__Impl : ( '}' ) ;
    public final void rule__GetEndPoint__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2354:1: ( ( '}' ) )
            // InternalVizualizer.g:2355:1: ( '}' )
            {
            // InternalVizualizer.g:2355:1: ( '}' )
            // InternalVizualizer.g:2356:2: '}'
            {
             before(grammarAccess.getGetEndPointAccess().getRightCurlyBracketKeyword_12()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getGetEndPointAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__Group__12__Impl"


    // $ANTLR start "rule__GetEndPoint__Group_8__0"
    // InternalVizualizer.g:2366:1: rule__GetEndPoint__Group_8__0 : rule__GetEndPoint__Group_8__0__Impl rule__GetEndPoint__Group_8__1 ;
    public final void rule__GetEndPoint__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2370:1: ( rule__GetEndPoint__Group_8__0__Impl rule__GetEndPoint__Group_8__1 )
            // InternalVizualizer.g:2371:2: rule__GetEndPoint__Group_8__0__Impl rule__GetEndPoint__Group_8__1
            {
            pushFollow(FOLLOW_21);
            rule__GetEndPoint__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetEndPoint__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__Group_8__0"


    // $ANTLR start "rule__GetEndPoint__Group_8__0__Impl"
    // InternalVizualizer.g:2378:1: rule__GetEndPoint__Group_8__0__Impl : ( ',' ) ;
    public final void rule__GetEndPoint__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2382:1: ( ( ',' ) )
            // InternalVizualizer.g:2383:1: ( ',' )
            {
            // InternalVizualizer.g:2383:1: ( ',' )
            // InternalVizualizer.g:2384:2: ','
            {
             before(grammarAccess.getGetEndPointAccess().getCommaKeyword_8_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGetEndPointAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__Group_8__0__Impl"


    // $ANTLR start "rule__GetEndPoint__Group_8__1"
    // InternalVizualizer.g:2393:1: rule__GetEndPoint__Group_8__1 : rule__GetEndPoint__Group_8__1__Impl ;
    public final void rule__GetEndPoint__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2397:1: ( rule__GetEndPoint__Group_8__1__Impl )
            // InternalVizualizer.g:2398:2: rule__GetEndPoint__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GetEndPoint__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__Group_8__1"


    // $ANTLR start "rule__GetEndPoint__Group_8__1__Impl"
    // InternalVizualizer.g:2404:1: rule__GetEndPoint__Group_8__1__Impl : ( ( rule__GetEndPoint__HeadersAssignment_8_1 ) ) ;
    public final void rule__GetEndPoint__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2408:1: ( ( ( rule__GetEndPoint__HeadersAssignment_8_1 ) ) )
            // InternalVizualizer.g:2409:1: ( ( rule__GetEndPoint__HeadersAssignment_8_1 ) )
            {
            // InternalVizualizer.g:2409:1: ( ( rule__GetEndPoint__HeadersAssignment_8_1 ) )
            // InternalVizualizer.g:2410:2: ( rule__GetEndPoint__HeadersAssignment_8_1 )
            {
             before(grammarAccess.getGetEndPointAccess().getHeadersAssignment_8_1()); 
            // InternalVizualizer.g:2411:2: ( rule__GetEndPoint__HeadersAssignment_8_1 )
            // InternalVizualizer.g:2411:3: rule__GetEndPoint__HeadersAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__GetEndPoint__HeadersAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getGetEndPointAccess().getHeadersAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__Group_8__1__Impl"


    // $ANTLR start "rule__Header__Group__0"
    // InternalVizualizer.g:2420:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2424:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // InternalVizualizer.g:2425:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Header__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__0"


    // $ANTLR start "rule__Header__Group__0__Impl"
    // InternalVizualizer.g:2432:1: rule__Header__Group__0__Impl : ( ( rule__Header__KeywordAssignment_0 ) ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2436:1: ( ( ( rule__Header__KeywordAssignment_0 ) ) )
            // InternalVizualizer.g:2437:1: ( ( rule__Header__KeywordAssignment_0 ) )
            {
            // InternalVizualizer.g:2437:1: ( ( rule__Header__KeywordAssignment_0 ) )
            // InternalVizualizer.g:2438:2: ( rule__Header__KeywordAssignment_0 )
            {
             before(grammarAccess.getHeaderAccess().getKeywordAssignment_0()); 
            // InternalVizualizer.g:2439:2: ( rule__Header__KeywordAssignment_0 )
            // InternalVizualizer.g:2439:3: rule__Header__KeywordAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Header__KeywordAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getKeywordAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__0__Impl"


    // $ANTLR start "rule__Header__Group__1"
    // InternalVizualizer.g:2447:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2451:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // InternalVizualizer.g:2452:2: rule__Header__Group__1__Impl rule__Header__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Header__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__1"


    // $ANTLR start "rule__Header__Group__1__Impl"
    // InternalVizualizer.g:2459:1: rule__Header__Group__1__Impl : ( ':' ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2463:1: ( ( ':' ) )
            // InternalVizualizer.g:2464:1: ( ':' )
            {
            // InternalVizualizer.g:2464:1: ( ':' )
            // InternalVizualizer.g:2465:2: ':'
            {
             before(grammarAccess.getHeaderAccess().getColonKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__1__Impl"


    // $ANTLR start "rule__Header__Group__2"
    // InternalVizualizer.g:2474:1: rule__Header__Group__2 : rule__Header__Group__2__Impl ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2478:1: ( rule__Header__Group__2__Impl )
            // InternalVizualizer.g:2479:2: rule__Header__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__2"


    // $ANTLR start "rule__Header__Group__2__Impl"
    // InternalVizualizer.g:2485:1: rule__Header__Group__2__Impl : ( ( rule__Header__ValueAssignment_2 ) ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2489:1: ( ( ( rule__Header__ValueAssignment_2 ) ) )
            // InternalVizualizer.g:2490:1: ( ( rule__Header__ValueAssignment_2 ) )
            {
            // InternalVizualizer.g:2490:1: ( ( rule__Header__ValueAssignment_2 ) )
            // InternalVizualizer.g:2491:2: ( rule__Header__ValueAssignment_2 )
            {
             before(grammarAccess.getHeaderAccess().getValueAssignment_2()); 
            // InternalVizualizer.g:2492:2: ( rule__Header__ValueAssignment_2 )
            // InternalVizualizer.g:2492:3: rule__Header__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Header__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__2__Impl"


    // $ANTLR start "rule__SchemaParser__Group__0"
    // InternalVizualizer.g:2501:1: rule__SchemaParser__Group__0 : rule__SchemaParser__Group__0__Impl rule__SchemaParser__Group__1 ;
    public final void rule__SchemaParser__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2505:1: ( rule__SchemaParser__Group__0__Impl rule__SchemaParser__Group__1 )
            // InternalVizualizer.g:2506:2: rule__SchemaParser__Group__0__Impl rule__SchemaParser__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SchemaParser__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SchemaParser__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaParser__Group__0"


    // $ANTLR start "rule__SchemaParser__Group__0__Impl"
    // InternalVizualizer.g:2513:1: rule__SchemaParser__Group__0__Impl : ( 'Schema' ) ;
    public final void rule__SchemaParser__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2517:1: ( ( 'Schema' ) )
            // InternalVizualizer.g:2518:1: ( 'Schema' )
            {
            // InternalVizualizer.g:2518:1: ( 'Schema' )
            // InternalVizualizer.g:2519:2: 'Schema'
            {
             before(grammarAccess.getSchemaParserAccess().getSchemaKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSchemaParserAccess().getSchemaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaParser__Group__0__Impl"


    // $ANTLR start "rule__SchemaParser__Group__1"
    // InternalVizualizer.g:2528:1: rule__SchemaParser__Group__1 : rule__SchemaParser__Group__1__Impl rule__SchemaParser__Group__2 ;
    public final void rule__SchemaParser__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2532:1: ( rule__SchemaParser__Group__1__Impl rule__SchemaParser__Group__2 )
            // InternalVizualizer.g:2533:2: rule__SchemaParser__Group__1__Impl rule__SchemaParser__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SchemaParser__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SchemaParser__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaParser__Group__1"


    // $ANTLR start "rule__SchemaParser__Group__1__Impl"
    // InternalVizualizer.g:2540:1: rule__SchemaParser__Group__1__Impl : ( ( rule__SchemaParser__NameAssignment_1 ) ) ;
    public final void rule__SchemaParser__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2544:1: ( ( ( rule__SchemaParser__NameAssignment_1 ) ) )
            // InternalVizualizer.g:2545:1: ( ( rule__SchemaParser__NameAssignment_1 ) )
            {
            // InternalVizualizer.g:2545:1: ( ( rule__SchemaParser__NameAssignment_1 ) )
            // InternalVizualizer.g:2546:2: ( rule__SchemaParser__NameAssignment_1 )
            {
             before(grammarAccess.getSchemaParserAccess().getNameAssignment_1()); 
            // InternalVizualizer.g:2547:2: ( rule__SchemaParser__NameAssignment_1 )
            // InternalVizualizer.g:2547:3: rule__SchemaParser__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SchemaParser__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSchemaParserAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaParser__Group__1__Impl"


    // $ANTLR start "rule__SchemaParser__Group__2"
    // InternalVizualizer.g:2555:1: rule__SchemaParser__Group__2 : rule__SchemaParser__Group__2__Impl rule__SchemaParser__Group__3 ;
    public final void rule__SchemaParser__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2559:1: ( rule__SchemaParser__Group__2__Impl rule__SchemaParser__Group__3 )
            // InternalVizualizer.g:2560:2: rule__SchemaParser__Group__2__Impl rule__SchemaParser__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__SchemaParser__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SchemaParser__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaParser__Group__2"


    // $ANTLR start "rule__SchemaParser__Group__2__Impl"
    // InternalVizualizer.g:2567:1: rule__SchemaParser__Group__2__Impl : ( '{' ) ;
    public final void rule__SchemaParser__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2571:1: ( ( '{' ) )
            // InternalVizualizer.g:2572:1: ( '{' )
            {
            // InternalVizualizer.g:2572:1: ( '{' )
            // InternalVizualizer.g:2573:2: '{'
            {
             before(grammarAccess.getSchemaParserAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSchemaParserAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaParser__Group__2__Impl"


    // $ANTLR start "rule__SchemaParser__Group__3"
    // InternalVizualizer.g:2582:1: rule__SchemaParser__Group__3 : rule__SchemaParser__Group__3__Impl rule__SchemaParser__Group__4 ;
    public final void rule__SchemaParser__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2586:1: ( rule__SchemaParser__Group__3__Impl rule__SchemaParser__Group__4 )
            // InternalVizualizer.g:2587:2: rule__SchemaParser__Group__3__Impl rule__SchemaParser__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__SchemaParser__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SchemaParser__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaParser__Group__3"


    // $ANTLR start "rule__SchemaParser__Group__3__Impl"
    // InternalVizualizer.g:2594:1: rule__SchemaParser__Group__3__Impl : ( 'SchemaType' ) ;
    public final void rule__SchemaParser__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2598:1: ( ( 'SchemaType' ) )
            // InternalVizualizer.g:2599:1: ( 'SchemaType' )
            {
            // InternalVizualizer.g:2599:1: ( 'SchemaType' )
            // InternalVizualizer.g:2600:2: 'SchemaType'
            {
             before(grammarAccess.getSchemaParserAccess().getSchemaTypeKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSchemaParserAccess().getSchemaTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaParser__Group__3__Impl"


    // $ANTLR start "rule__SchemaParser__Group__4"
    // InternalVizualizer.g:2609:1: rule__SchemaParser__Group__4 : rule__SchemaParser__Group__4__Impl rule__SchemaParser__Group__5 ;
    public final void rule__SchemaParser__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2613:1: ( rule__SchemaParser__Group__4__Impl rule__SchemaParser__Group__5 )
            // InternalVizualizer.g:2614:2: rule__SchemaParser__Group__4__Impl rule__SchemaParser__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__SchemaParser__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SchemaParser__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaParser__Group__4"


    // $ANTLR start "rule__SchemaParser__Group__4__Impl"
    // InternalVizualizer.g:2621:1: rule__SchemaParser__Group__4__Impl : ( '=' ) ;
    public final void rule__SchemaParser__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2625:1: ( ( '=' ) )
            // InternalVizualizer.g:2626:1: ( '=' )
            {
            // InternalVizualizer.g:2626:1: ( '=' )
            // InternalVizualizer.g:2627:2: '='
            {
             before(grammarAccess.getSchemaParserAccess().getEqualsSignKeyword_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSchemaParserAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaParser__Group__4__Impl"


    // $ANTLR start "rule__SchemaParser__Group__5"
    // InternalVizualizer.g:2636:1: rule__SchemaParser__Group__5 : rule__SchemaParser__Group__5__Impl rule__SchemaParser__Group__6 ;
    public final void rule__SchemaParser__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2640:1: ( rule__SchemaParser__Group__5__Impl rule__SchemaParser__Group__6 )
            // InternalVizualizer.g:2641:2: rule__SchemaParser__Group__5__Impl rule__SchemaParser__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__SchemaParser__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SchemaParser__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaParser__Group__5"


    // $ANTLR start "rule__SchemaParser__Group__5__Impl"
    // InternalVizualizer.g:2648:1: rule__SchemaParser__Group__5__Impl : ( ( rule__SchemaParser__SchemaTypeAssignment_5 ) ) ;
    public final void rule__SchemaParser__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2652:1: ( ( ( rule__SchemaParser__SchemaTypeAssignment_5 ) ) )
            // InternalVizualizer.g:2653:1: ( ( rule__SchemaParser__SchemaTypeAssignment_5 ) )
            {
            // InternalVizualizer.g:2653:1: ( ( rule__SchemaParser__SchemaTypeAssignment_5 ) )
            // InternalVizualizer.g:2654:2: ( rule__SchemaParser__SchemaTypeAssignment_5 )
            {
             before(grammarAccess.getSchemaParserAccess().getSchemaTypeAssignment_5()); 
            // InternalVizualizer.g:2655:2: ( rule__SchemaParser__SchemaTypeAssignment_5 )
            // InternalVizualizer.g:2655:3: rule__SchemaParser__SchemaTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SchemaParser__SchemaTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSchemaParserAccess().getSchemaTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaParser__Group__5__Impl"


    // $ANTLR start "rule__SchemaParser__Group__6"
    // InternalVizualizer.g:2663:1: rule__SchemaParser__Group__6 : rule__SchemaParser__Group__6__Impl rule__SchemaParser__Group__7 ;
    public final void rule__SchemaParser__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2667:1: ( rule__SchemaParser__Group__6__Impl rule__SchemaParser__Group__7 )
            // InternalVizualizer.g:2668:2: rule__SchemaParser__Group__6__Impl rule__SchemaParser__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__SchemaParser__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SchemaParser__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaParser__Group__6"


    // $ANTLR start "rule__SchemaParser__Group__6__Impl"
    // InternalVizualizer.g:2675:1: rule__SchemaParser__Group__6__Impl : ( ( ( rule__SchemaParser__SelectorsAssignment_6 ) ) ( ( rule__SchemaParser__SelectorsAssignment_6 )* ) ) ;
    public final void rule__SchemaParser__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2679:1: ( ( ( ( rule__SchemaParser__SelectorsAssignment_6 ) ) ( ( rule__SchemaParser__SelectorsAssignment_6 )* ) ) )
            // InternalVizualizer.g:2680:1: ( ( ( rule__SchemaParser__SelectorsAssignment_6 ) ) ( ( rule__SchemaParser__SelectorsAssignment_6 )* ) )
            {
            // InternalVizualizer.g:2680:1: ( ( ( rule__SchemaParser__SelectorsAssignment_6 ) ) ( ( rule__SchemaParser__SelectorsAssignment_6 )* ) )
            // InternalVizualizer.g:2681:2: ( ( rule__SchemaParser__SelectorsAssignment_6 ) ) ( ( rule__SchemaParser__SelectorsAssignment_6 )* )
            {
            // InternalVizualizer.g:2681:2: ( ( rule__SchemaParser__SelectorsAssignment_6 ) )
            // InternalVizualizer.g:2682:3: ( rule__SchemaParser__SelectorsAssignment_6 )
            {
             before(grammarAccess.getSchemaParserAccess().getSelectorsAssignment_6()); 
            // InternalVizualizer.g:2683:3: ( rule__SchemaParser__SelectorsAssignment_6 )
            // InternalVizualizer.g:2683:4: rule__SchemaParser__SelectorsAssignment_6
            {
            pushFollow(FOLLOW_29);
            rule__SchemaParser__SelectorsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSchemaParserAccess().getSelectorsAssignment_6()); 

            }

            // InternalVizualizer.g:2686:2: ( ( rule__SchemaParser__SelectorsAssignment_6 )* )
            // InternalVizualizer.g:2687:3: ( rule__SchemaParser__SelectorsAssignment_6 )*
            {
             before(grammarAccess.getSchemaParserAccess().getSelectorsAssignment_6()); 
            // InternalVizualizer.g:2688:3: ( rule__SchemaParser__SelectorsAssignment_6 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==42) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalVizualizer.g:2688:4: rule__SchemaParser__SelectorsAssignment_6
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__SchemaParser__SelectorsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSchemaParserAccess().getSelectorsAssignment_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaParser__Group__6__Impl"


    // $ANTLR start "rule__SchemaParser__Group__7"
    // InternalVizualizer.g:2697:1: rule__SchemaParser__Group__7 : rule__SchemaParser__Group__7__Impl ;
    public final void rule__SchemaParser__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2701:1: ( rule__SchemaParser__Group__7__Impl )
            // InternalVizualizer.g:2702:2: rule__SchemaParser__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SchemaParser__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaParser__Group__7"


    // $ANTLR start "rule__SchemaParser__Group__7__Impl"
    // InternalVizualizer.g:2708:1: rule__SchemaParser__Group__7__Impl : ( '}' ) ;
    public final void rule__SchemaParser__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2712:1: ( ( '}' ) )
            // InternalVizualizer.g:2713:1: ( '}' )
            {
            // InternalVizualizer.g:2713:1: ( '}' )
            // InternalVizualizer.g:2714:2: '}'
            {
             before(grammarAccess.getSchemaParserAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSchemaParserAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaParser__Group__7__Impl"


    // $ANTLR start "rule__Selector__Group__0"
    // InternalVizualizer.g:2724:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2728:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // InternalVizualizer.g:2729:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Selector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__0"


    // $ANTLR start "rule__Selector__Group__0__Impl"
    // InternalVizualizer.g:2736:1: rule__Selector__Group__0__Impl : ( 'Selector as ' ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2740:1: ( ( 'Selector as ' ) )
            // InternalVizualizer.g:2741:1: ( 'Selector as ' )
            {
            // InternalVizualizer.g:2741:1: ( 'Selector as ' )
            // InternalVizualizer.g:2742:2: 'Selector as '
            {
             before(grammarAccess.getSelectorAccess().getSelectorAsKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getSelectorAsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__0__Impl"


    // $ANTLR start "rule__Selector__Group__1"
    // InternalVizualizer.g:2751:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl rule__Selector__Group__2 ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2755:1: ( rule__Selector__Group__1__Impl rule__Selector__Group__2 )
            // InternalVizualizer.g:2756:2: rule__Selector__Group__1__Impl rule__Selector__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Selector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__1"


    // $ANTLR start "rule__Selector__Group__1__Impl"
    // InternalVizualizer.g:2763:1: rule__Selector__Group__1__Impl : ( ( rule__Selector__NameAssignment_1 ) ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2767:1: ( ( ( rule__Selector__NameAssignment_1 ) ) )
            // InternalVizualizer.g:2768:1: ( ( rule__Selector__NameAssignment_1 ) )
            {
            // InternalVizualizer.g:2768:1: ( ( rule__Selector__NameAssignment_1 ) )
            // InternalVizualizer.g:2769:2: ( rule__Selector__NameAssignment_1 )
            {
             before(grammarAccess.getSelectorAccess().getNameAssignment_1()); 
            // InternalVizualizer.g:2770:2: ( rule__Selector__NameAssignment_1 )
            // InternalVizualizer.g:2770:3: rule__Selector__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Selector__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__1__Impl"


    // $ANTLR start "rule__Selector__Group__2"
    // InternalVizualizer.g:2778:1: rule__Selector__Group__2 : rule__Selector__Group__2__Impl rule__Selector__Group__3 ;
    public final void rule__Selector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2782:1: ( rule__Selector__Group__2__Impl rule__Selector__Group__3 )
            // InternalVizualizer.g:2783:2: rule__Selector__Group__2__Impl rule__Selector__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Selector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__2"


    // $ANTLR start "rule__Selector__Group__2__Impl"
    // InternalVizualizer.g:2790:1: rule__Selector__Group__2__Impl : ( '{' ) ;
    public final void rule__Selector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2794:1: ( ( '{' ) )
            // InternalVizualizer.g:2795:1: ( '{' )
            {
            // InternalVizualizer.g:2795:1: ( '{' )
            // InternalVizualizer.g:2796:2: '{'
            {
             before(grammarAccess.getSelectorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__2__Impl"


    // $ANTLR start "rule__Selector__Group__3"
    // InternalVizualizer.g:2805:1: rule__Selector__Group__3 : rule__Selector__Group__3__Impl rule__Selector__Group__4 ;
    public final void rule__Selector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2809:1: ( rule__Selector__Group__3__Impl rule__Selector__Group__4 )
            // InternalVizualizer.g:2810:2: rule__Selector__Group__3__Impl rule__Selector__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__Selector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__3"


    // $ANTLR start "rule__Selector__Group__3__Impl"
    // InternalVizualizer.g:2817:1: rule__Selector__Group__3__Impl : ( ( rule__Selector__StepsAssignment_3 ) ) ;
    public final void rule__Selector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2821:1: ( ( ( rule__Selector__StepsAssignment_3 ) ) )
            // InternalVizualizer.g:2822:1: ( ( rule__Selector__StepsAssignment_3 ) )
            {
            // InternalVizualizer.g:2822:1: ( ( rule__Selector__StepsAssignment_3 ) )
            // InternalVizualizer.g:2823:2: ( rule__Selector__StepsAssignment_3 )
            {
             before(grammarAccess.getSelectorAccess().getStepsAssignment_3()); 
            // InternalVizualizer.g:2824:2: ( rule__Selector__StepsAssignment_3 )
            // InternalVizualizer.g:2824:3: rule__Selector__StepsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Selector__StepsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getStepsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__3__Impl"


    // $ANTLR start "rule__Selector__Group__4"
    // InternalVizualizer.g:2832:1: rule__Selector__Group__4 : rule__Selector__Group__4__Impl rule__Selector__Group__5 ;
    public final void rule__Selector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2836:1: ( rule__Selector__Group__4__Impl rule__Selector__Group__5 )
            // InternalVizualizer.g:2837:2: rule__Selector__Group__4__Impl rule__Selector__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Selector__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__4"


    // $ANTLR start "rule__Selector__Group__4__Impl"
    // InternalVizualizer.g:2844:1: rule__Selector__Group__4__Impl : ( ( ( rule__Selector__Group_4__0 ) ) ( ( rule__Selector__Group_4__0 )* ) ) ;
    public final void rule__Selector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2848:1: ( ( ( ( rule__Selector__Group_4__0 ) ) ( ( rule__Selector__Group_4__0 )* ) ) )
            // InternalVizualizer.g:2849:1: ( ( ( rule__Selector__Group_4__0 ) ) ( ( rule__Selector__Group_4__0 )* ) )
            {
            // InternalVizualizer.g:2849:1: ( ( ( rule__Selector__Group_4__0 ) ) ( ( rule__Selector__Group_4__0 )* ) )
            // InternalVizualizer.g:2850:2: ( ( rule__Selector__Group_4__0 ) ) ( ( rule__Selector__Group_4__0 )* )
            {
            // InternalVizualizer.g:2850:2: ( ( rule__Selector__Group_4__0 ) )
            // InternalVizualizer.g:2851:3: ( rule__Selector__Group_4__0 )
            {
             before(grammarAccess.getSelectorAccess().getGroup_4()); 
            // InternalVizualizer.g:2852:3: ( rule__Selector__Group_4__0 )
            // InternalVizualizer.g:2852:4: rule__Selector__Group_4__0
            {
            pushFollow(FOLLOW_31);
            rule__Selector__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getGroup_4()); 

            }

            // InternalVizualizer.g:2855:2: ( ( rule__Selector__Group_4__0 )* )
            // InternalVizualizer.g:2856:3: ( rule__Selector__Group_4__0 )*
            {
             before(grammarAccess.getSelectorAccess().getGroup_4()); 
            // InternalVizualizer.g:2857:3: ( rule__Selector__Group_4__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==43) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalVizualizer.g:2857:4: rule__Selector__Group_4__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Selector__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSelectorAccess().getGroup_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__4__Impl"


    // $ANTLR start "rule__Selector__Group__5"
    // InternalVizualizer.g:2866:1: rule__Selector__Group__5 : rule__Selector__Group__5__Impl ;
    public final void rule__Selector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2870:1: ( rule__Selector__Group__5__Impl )
            // InternalVizualizer.g:2871:2: rule__Selector__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__5"


    // $ANTLR start "rule__Selector__Group__5__Impl"
    // InternalVizualizer.g:2877:1: rule__Selector__Group__5__Impl : ( '}' ) ;
    public final void rule__Selector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2881:1: ( ( '}' ) )
            // InternalVizualizer.g:2882:1: ( '}' )
            {
            // InternalVizualizer.g:2882:1: ( '}' )
            // InternalVizualizer.g:2883:2: '}'
            {
             before(grammarAccess.getSelectorAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group__5__Impl"


    // $ANTLR start "rule__Selector__Group_4__0"
    // InternalVizualizer.g:2893:1: rule__Selector__Group_4__0 : rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1 ;
    public final void rule__Selector__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2897:1: ( rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1 )
            // InternalVizualizer.g:2898:2: rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1
            {
            pushFollow(FOLLOW_21);
            rule__Selector__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selector__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_4__0"


    // $ANTLR start "rule__Selector__Group_4__0__Impl"
    // InternalVizualizer.g:2905:1: rule__Selector__Group_4__0__Impl : ( ' -> ' ) ;
    public final void rule__Selector__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2909:1: ( ( ' -> ' ) )
            // InternalVizualizer.g:2910:1: ( ' -> ' )
            {
            // InternalVizualizer.g:2910:1: ( ' -> ' )
            // InternalVizualizer.g:2911:2: ' -> '
            {
             before(grammarAccess.getSelectorAccess().getSpaceHyphenMinusGreaterThanSignSpaceKeyword_4_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getSpaceHyphenMinusGreaterThanSignSpaceKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_4__0__Impl"


    // $ANTLR start "rule__Selector__Group_4__1"
    // InternalVizualizer.g:2920:1: rule__Selector__Group_4__1 : rule__Selector__Group_4__1__Impl ;
    public final void rule__Selector__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2924:1: ( rule__Selector__Group_4__1__Impl )
            // InternalVizualizer.g:2925:2: rule__Selector__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_4__1"


    // $ANTLR start "rule__Selector__Group_4__1__Impl"
    // InternalVizualizer.g:2931:1: rule__Selector__Group_4__1__Impl : ( ( rule__Selector__StepsAssignment_4_1 ) ) ;
    public final void rule__Selector__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2935:1: ( ( ( rule__Selector__StepsAssignment_4_1 ) ) )
            // InternalVizualizer.g:2936:1: ( ( rule__Selector__StepsAssignment_4_1 ) )
            {
            // InternalVizualizer.g:2936:1: ( ( rule__Selector__StepsAssignment_4_1 ) )
            // InternalVizualizer.g:2937:2: ( rule__Selector__StepsAssignment_4_1 )
            {
             before(grammarAccess.getSelectorAccess().getStepsAssignment_4_1()); 
            // InternalVizualizer.g:2938:2: ( rule__Selector__StepsAssignment_4_1 )
            // InternalVizualizer.g:2938:3: rule__Selector__StepsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Selector__StepsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getStepsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__Group_4__1__Impl"


    // $ANTLR start "rule__Formula__Group__0"
    // InternalVizualizer.g:2947:1: rule__Formula__Group__0 : rule__Formula__Group__0__Impl rule__Formula__Group__1 ;
    public final void rule__Formula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2951:1: ( rule__Formula__Group__0__Impl rule__Formula__Group__1 )
            // InternalVizualizer.g:2952:2: rule__Formula__Group__0__Impl rule__Formula__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Formula__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__0"


    // $ANTLR start "rule__Formula__Group__0__Impl"
    // InternalVizualizer.g:2959:1: rule__Formula__Group__0__Impl : ( ( rule__Formula__NameAssignment_0 ) ) ;
    public final void rule__Formula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2963:1: ( ( ( rule__Formula__NameAssignment_0 ) ) )
            // InternalVizualizer.g:2964:1: ( ( rule__Formula__NameAssignment_0 ) )
            {
            // InternalVizualizer.g:2964:1: ( ( rule__Formula__NameAssignment_0 ) )
            // InternalVizualizer.g:2965:2: ( rule__Formula__NameAssignment_0 )
            {
             before(grammarAccess.getFormulaAccess().getNameAssignment_0()); 
            // InternalVizualizer.g:2966:2: ( rule__Formula__NameAssignment_0 )
            // InternalVizualizer.g:2966:3: rule__Formula__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Formula__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFormulaAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__0__Impl"


    // $ANTLR start "rule__Formula__Group__1"
    // InternalVizualizer.g:2974:1: rule__Formula__Group__1 : rule__Formula__Group__1__Impl rule__Formula__Group__2 ;
    public final void rule__Formula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2978:1: ( rule__Formula__Group__1__Impl rule__Formula__Group__2 )
            // InternalVizualizer.g:2979:2: rule__Formula__Group__1__Impl rule__Formula__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__Formula__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__1"


    // $ANTLR start "rule__Formula__Group__1__Impl"
    // InternalVizualizer.g:2986:1: rule__Formula__Group__1__Impl : ( '(' ) ;
    public final void rule__Formula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2990:1: ( ( '(' ) )
            // InternalVizualizer.g:2991:1: ( '(' )
            {
            // InternalVizualizer.g:2991:1: ( '(' )
            // InternalVizualizer.g:2992:2: '('
            {
             before(grammarAccess.getFormulaAccess().getLeftParenthesisKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFormulaAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__1__Impl"


    // $ANTLR start "rule__Formula__Group__2"
    // InternalVizualizer.g:3001:1: rule__Formula__Group__2 : rule__Formula__Group__2__Impl rule__Formula__Group__3 ;
    public final void rule__Formula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3005:1: ( rule__Formula__Group__2__Impl rule__Formula__Group__3 )
            // InternalVizualizer.g:3006:2: rule__Formula__Group__2__Impl rule__Formula__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Formula__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__2"


    // $ANTLR start "rule__Formula__Group__2__Impl"
    // InternalVizualizer.g:3013:1: rule__Formula__Group__2__Impl : ( ( rule__Formula__Group_2__0 )? ) ;
    public final void rule__Formula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3017:1: ( ( ( rule__Formula__Group_2__0 )? ) )
            // InternalVizualizer.g:3018:1: ( ( rule__Formula__Group_2__0 )? )
            {
            // InternalVizualizer.g:3018:1: ( ( rule__Formula__Group_2__0 )? )
            // InternalVizualizer.g:3019:2: ( rule__Formula__Group_2__0 )?
            {
             before(grammarAccess.getFormulaAccess().getGroup_2()); 
            // InternalVizualizer.g:3020:2: ( rule__Formula__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalVizualizer.g:3020:3: rule__Formula__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formula__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormulaAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__2__Impl"


    // $ANTLR start "rule__Formula__Group__3"
    // InternalVizualizer.g:3028:1: rule__Formula__Group__3 : rule__Formula__Group__3__Impl rule__Formula__Group__4 ;
    public final void rule__Formula__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3032:1: ( rule__Formula__Group__3__Impl rule__Formula__Group__4 )
            // InternalVizualizer.g:3033:2: rule__Formula__Group__3__Impl rule__Formula__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Formula__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__3"


    // $ANTLR start "rule__Formula__Group__3__Impl"
    // InternalVizualizer.g:3040:1: rule__Formula__Group__3__Impl : ( ')' ) ;
    public final void rule__Formula__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3044:1: ( ( ')' ) )
            // InternalVizualizer.g:3045:1: ( ')' )
            {
            // InternalVizualizer.g:3045:1: ( ')' )
            // InternalVizualizer.g:3046:2: ')'
            {
             before(grammarAccess.getFormulaAccess().getRightParenthesisKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getFormulaAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__3__Impl"


    // $ANTLR start "rule__Formula__Group__4"
    // InternalVizualizer.g:3055:1: rule__Formula__Group__4 : rule__Formula__Group__4__Impl rule__Formula__Group__5 ;
    public final void rule__Formula__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3059:1: ( rule__Formula__Group__4__Impl rule__Formula__Group__5 )
            // InternalVizualizer.g:3060:2: rule__Formula__Group__4__Impl rule__Formula__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__Formula__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__4"


    // $ANTLR start "rule__Formula__Group__4__Impl"
    // InternalVizualizer.g:3067:1: rule__Formula__Group__4__Impl : ( '=' ) ;
    public final void rule__Formula__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3071:1: ( ( '=' ) )
            // InternalVizualizer.g:3072:1: ( '=' )
            {
            // InternalVizualizer.g:3072:1: ( '=' )
            // InternalVizualizer.g:3073:2: '='
            {
             before(grammarAccess.getFormulaAccess().getEqualsSignKeyword_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFormulaAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__4__Impl"


    // $ANTLR start "rule__Formula__Group__5"
    // InternalVizualizer.g:3082:1: rule__Formula__Group__5 : rule__Formula__Group__5__Impl ;
    public final void rule__Formula__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3086:1: ( rule__Formula__Group__5__Impl )
            // InternalVizualizer.g:3087:2: rule__Formula__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formula__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__5"


    // $ANTLR start "rule__Formula__Group__5__Impl"
    // InternalVizualizer.g:3093:1: rule__Formula__Group__5__Impl : ( ( rule__Formula__ExpAssignment_5 ) ) ;
    public final void rule__Formula__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3097:1: ( ( ( rule__Formula__ExpAssignment_5 ) ) )
            // InternalVizualizer.g:3098:1: ( ( rule__Formula__ExpAssignment_5 ) )
            {
            // InternalVizualizer.g:3098:1: ( ( rule__Formula__ExpAssignment_5 ) )
            // InternalVizualizer.g:3099:2: ( rule__Formula__ExpAssignment_5 )
            {
             before(grammarAccess.getFormulaAccess().getExpAssignment_5()); 
            // InternalVizualizer.g:3100:2: ( rule__Formula__ExpAssignment_5 )
            // InternalVizualizer.g:3100:3: rule__Formula__ExpAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Formula__ExpAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFormulaAccess().getExpAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__5__Impl"


    // $ANTLR start "rule__Formula__Group_2__0"
    // InternalVizualizer.g:3109:1: rule__Formula__Group_2__0 : rule__Formula__Group_2__0__Impl rule__Formula__Group_2__1 ;
    public final void rule__Formula__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3113:1: ( rule__Formula__Group_2__0__Impl rule__Formula__Group_2__1 )
            // InternalVizualizer.g:3114:2: rule__Formula__Group_2__0__Impl rule__Formula__Group_2__1
            {
            pushFollow(FOLLOW_35);
            rule__Formula__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_2__0"


    // $ANTLR start "rule__Formula__Group_2__0__Impl"
    // InternalVizualizer.g:3121:1: rule__Formula__Group_2__0__Impl : ( ( rule__Formula__VarsAssignment_2_0 ) ) ;
    public final void rule__Formula__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3125:1: ( ( ( rule__Formula__VarsAssignment_2_0 ) ) )
            // InternalVizualizer.g:3126:1: ( ( rule__Formula__VarsAssignment_2_0 ) )
            {
            // InternalVizualizer.g:3126:1: ( ( rule__Formula__VarsAssignment_2_0 ) )
            // InternalVizualizer.g:3127:2: ( rule__Formula__VarsAssignment_2_0 )
            {
             before(grammarAccess.getFormulaAccess().getVarsAssignment_2_0()); 
            // InternalVizualizer.g:3128:2: ( rule__Formula__VarsAssignment_2_0 )
            // InternalVizualizer.g:3128:3: rule__Formula__VarsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Formula__VarsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getFormulaAccess().getVarsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_2__0__Impl"


    // $ANTLR start "rule__Formula__Group_2__1"
    // InternalVizualizer.g:3136:1: rule__Formula__Group_2__1 : rule__Formula__Group_2__1__Impl ;
    public final void rule__Formula__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3140:1: ( rule__Formula__Group_2__1__Impl )
            // InternalVizualizer.g:3141:2: rule__Formula__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formula__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_2__1"


    // $ANTLR start "rule__Formula__Group_2__1__Impl"
    // InternalVizualizer.g:3147:1: rule__Formula__Group_2__1__Impl : ( ( rule__Formula__Group_2_1__0 )* ) ;
    public final void rule__Formula__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3151:1: ( ( ( rule__Formula__Group_2_1__0 )* ) )
            // InternalVizualizer.g:3152:1: ( ( rule__Formula__Group_2_1__0 )* )
            {
            // InternalVizualizer.g:3152:1: ( ( rule__Formula__Group_2_1__0 )* )
            // InternalVizualizer.g:3153:2: ( rule__Formula__Group_2_1__0 )*
            {
             before(grammarAccess.getFormulaAccess().getGroup_2_1()); 
            // InternalVizualizer.g:3154:2: ( rule__Formula__Group_2_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalVizualizer.g:3154:3: rule__Formula__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Formula__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getFormulaAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_2__1__Impl"


    // $ANTLR start "rule__Formula__Group_2_1__0"
    // InternalVizualizer.g:3163:1: rule__Formula__Group_2_1__0 : rule__Formula__Group_2_1__0__Impl rule__Formula__Group_2_1__1 ;
    public final void rule__Formula__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3167:1: ( rule__Formula__Group_2_1__0__Impl rule__Formula__Group_2_1__1 )
            // InternalVizualizer.g:3168:2: rule__Formula__Group_2_1__0__Impl rule__Formula__Group_2_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Formula__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_2_1__0"


    // $ANTLR start "rule__Formula__Group_2_1__0__Impl"
    // InternalVizualizer.g:3175:1: rule__Formula__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Formula__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3179:1: ( ( ',' ) )
            // InternalVizualizer.g:3180:1: ( ',' )
            {
            // InternalVizualizer.g:3180:1: ( ',' )
            // InternalVizualizer.g:3181:2: ','
            {
             before(grammarAccess.getFormulaAccess().getCommaKeyword_2_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFormulaAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_2_1__0__Impl"


    // $ANTLR start "rule__Formula__Group_2_1__1"
    // InternalVizualizer.g:3190:1: rule__Formula__Group_2_1__1 : rule__Formula__Group_2_1__1__Impl ;
    public final void rule__Formula__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3194:1: ( rule__Formula__Group_2_1__1__Impl )
            // InternalVizualizer.g:3195:2: rule__Formula__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formula__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_2_1__1"


    // $ANTLR start "rule__Formula__Group_2_1__1__Impl"
    // InternalVizualizer.g:3201:1: rule__Formula__Group_2_1__1__Impl : ( ( rule__Formula__VarsAssignment_2_1_1 ) ) ;
    public final void rule__Formula__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3205:1: ( ( ( rule__Formula__VarsAssignment_2_1_1 ) ) )
            // InternalVizualizer.g:3206:1: ( ( rule__Formula__VarsAssignment_2_1_1 ) )
            {
            // InternalVizualizer.g:3206:1: ( ( rule__Formula__VarsAssignment_2_1_1 ) )
            // InternalVizualizer.g:3207:2: ( rule__Formula__VarsAssignment_2_1_1 )
            {
             before(grammarAccess.getFormulaAccess().getVarsAssignment_2_1_1()); 
            // InternalVizualizer.g:3208:2: ( rule__Formula__VarsAssignment_2_1_1 )
            // InternalVizualizer.g:3208:3: rule__Formula__VarsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Formula__VarsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFormulaAccess().getVarsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_2_1__1__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalVizualizer.g:3217:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3221:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalVizualizer.g:3222:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalVizualizer.g:3229:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__LeftAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3233:1: ( ( ( rule__Expression__LeftAssignment_0 ) ) )
            // InternalVizualizer.g:3234:1: ( ( rule__Expression__LeftAssignment_0 ) )
            {
            // InternalVizualizer.g:3234:1: ( ( rule__Expression__LeftAssignment_0 ) )
            // InternalVizualizer.g:3235:2: ( rule__Expression__LeftAssignment_0 )
            {
             before(grammarAccess.getExpressionAccess().getLeftAssignment_0()); 
            // InternalVizualizer.g:3236:2: ( rule__Expression__LeftAssignment_0 )
            // InternalVizualizer.g:3236:3: rule__Expression__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalVizualizer.g:3244:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3248:1: ( rule__Expression__Group__1__Impl )
            // InternalVizualizer.g:3249:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalVizualizer.g:3255:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3259:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // InternalVizualizer.g:3260:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // InternalVizualizer.g:3260:1: ( ( rule__Expression__Group_1__0 )? )
            // InternalVizualizer.g:3261:2: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalVizualizer.g:3262:2: ( rule__Expression__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=11 && LA18_0<=12)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalVizualizer.g:3262:3: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalVizualizer.g:3271:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3275:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalVizualizer.g:3276:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalVizualizer.g:3283:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__OpAssignment_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3287:1: ( ( ( rule__Expression__OpAssignment_1_0 ) ) )
            // InternalVizualizer.g:3288:1: ( ( rule__Expression__OpAssignment_1_0 ) )
            {
            // InternalVizualizer.g:3288:1: ( ( rule__Expression__OpAssignment_1_0 ) )
            // InternalVizualizer.g:3289:2: ( rule__Expression__OpAssignment_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getOpAssignment_1_0()); 
            // InternalVizualizer.g:3290:2: ( rule__Expression__OpAssignment_1_0 )
            // InternalVizualizer.g:3290:3: rule__Expression__OpAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__OpAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getOpAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalVizualizer.g:3298:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3302:1: ( rule__Expression__Group_1__1__Impl )
            // InternalVizualizer.g:3303:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalVizualizer.g:3309:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__RightAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3313:1: ( ( ( rule__Expression__RightAssignment_1_1 ) ) )
            // InternalVizualizer.g:3314:1: ( ( rule__Expression__RightAssignment_1_1 ) )
            {
            // InternalVizualizer.g:3314:1: ( ( rule__Expression__RightAssignment_1_1 ) )
            // InternalVizualizer.g:3315:2: ( rule__Expression__RightAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_1()); 
            // InternalVizualizer.g:3316:2: ( rule__Expression__RightAssignment_1_1 )
            // InternalVizualizer.g:3316:3: rule__Expression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Factor__Group__0"
    // InternalVizualizer.g:3325:1: rule__Factor__Group__0 : rule__Factor__Group__0__Impl rule__Factor__Group__1 ;
    public final void rule__Factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3329:1: ( rule__Factor__Group__0__Impl rule__Factor__Group__1 )
            // InternalVizualizer.g:3330:2: rule__Factor__Group__0__Impl rule__Factor__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Factor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__0"


    // $ANTLR start "rule__Factor__Group__0__Impl"
    // InternalVizualizer.g:3337:1: rule__Factor__Group__0__Impl : ( ( rule__Factor__LeftAssignment_0 ) ) ;
    public final void rule__Factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3341:1: ( ( ( rule__Factor__LeftAssignment_0 ) ) )
            // InternalVizualizer.g:3342:1: ( ( rule__Factor__LeftAssignment_0 ) )
            {
            // InternalVizualizer.g:3342:1: ( ( rule__Factor__LeftAssignment_0 ) )
            // InternalVizualizer.g:3343:2: ( rule__Factor__LeftAssignment_0 )
            {
             before(grammarAccess.getFactorAccess().getLeftAssignment_0()); 
            // InternalVizualizer.g:3344:2: ( rule__Factor__LeftAssignment_0 )
            // InternalVizualizer.g:3344:3: rule__Factor__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Factor__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__0__Impl"


    // $ANTLR start "rule__Factor__Group__1"
    // InternalVizualizer.g:3352:1: rule__Factor__Group__1 : rule__Factor__Group__1__Impl ;
    public final void rule__Factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3356:1: ( rule__Factor__Group__1__Impl )
            // InternalVizualizer.g:3357:2: rule__Factor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__1"


    // $ANTLR start "rule__Factor__Group__1__Impl"
    // InternalVizualizer.g:3363:1: rule__Factor__Group__1__Impl : ( ( rule__Factor__Group_1__0 )? ) ;
    public final void rule__Factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3367:1: ( ( ( rule__Factor__Group_1__0 )? ) )
            // InternalVizualizer.g:3368:1: ( ( rule__Factor__Group_1__0 )? )
            {
            // InternalVizualizer.g:3368:1: ( ( rule__Factor__Group_1__0 )? )
            // InternalVizualizer.g:3369:2: ( rule__Factor__Group_1__0 )?
            {
             before(grammarAccess.getFactorAccess().getGroup_1()); 
            // InternalVizualizer.g:3370:2: ( rule__Factor__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=13 && LA19_0<=14)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalVizualizer.g:3370:3: rule__Factor__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFactorAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__1__Impl"


    // $ANTLR start "rule__Factor__Group_1__0"
    // InternalVizualizer.g:3379:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3383:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // InternalVizualizer.g:3384:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__Factor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__0"


    // $ANTLR start "rule__Factor__Group_1__0__Impl"
    // InternalVizualizer.g:3391:1: rule__Factor__Group_1__0__Impl : ( ( rule__Factor__OpAssignment_1_0 ) ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3395:1: ( ( ( rule__Factor__OpAssignment_1_0 ) ) )
            // InternalVizualizer.g:3396:1: ( ( rule__Factor__OpAssignment_1_0 ) )
            {
            // InternalVizualizer.g:3396:1: ( ( rule__Factor__OpAssignment_1_0 ) )
            // InternalVizualizer.g:3397:2: ( rule__Factor__OpAssignment_1_0 )
            {
             before(grammarAccess.getFactorAccess().getOpAssignment_1_0()); 
            // InternalVizualizer.g:3398:2: ( rule__Factor__OpAssignment_1_0 )
            // InternalVizualizer.g:3398:3: rule__Factor__OpAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Factor__OpAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getOpAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__0__Impl"


    // $ANTLR start "rule__Factor__Group_1__1"
    // InternalVizualizer.g:3406:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3410:1: ( rule__Factor__Group_1__1__Impl )
            // InternalVizualizer.g:3411:2: rule__Factor__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__1"


    // $ANTLR start "rule__Factor__Group_1__1__Impl"
    // InternalVizualizer.g:3417:1: rule__Factor__Group_1__1__Impl : ( ( rule__Factor__RightAssignment_1_1 ) ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3421:1: ( ( ( rule__Factor__RightAssignment_1_1 ) ) )
            // InternalVizualizer.g:3422:1: ( ( rule__Factor__RightAssignment_1_1 ) )
            {
            // InternalVizualizer.g:3422:1: ( ( rule__Factor__RightAssignment_1_1 ) )
            // InternalVizualizer.g:3423:2: ( rule__Factor__RightAssignment_1_1 )
            {
             before(grammarAccess.getFactorAccess().getRightAssignment_1_1()); 
            // InternalVizualizer.g:3424:2: ( rule__Factor__RightAssignment_1_1 )
            // InternalVizualizer.g:3424:3: rule__Factor__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__1__Impl"


    // $ANTLR start "rule__Primitive__Group_2__0"
    // InternalVizualizer.g:3433:1: rule__Primitive__Group_2__0 : rule__Primitive__Group_2__0__Impl rule__Primitive__Group_2__1 ;
    public final void rule__Primitive__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3437:1: ( rule__Primitive__Group_2__0__Impl rule__Primitive__Group_2__1 )
            // InternalVizualizer.g:3438:2: rule__Primitive__Group_2__0__Impl rule__Primitive__Group_2__1
            {
            pushFollow(FOLLOW_34);
            rule__Primitive__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitive__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group_2__0"


    // $ANTLR start "rule__Primitive__Group_2__0__Impl"
    // InternalVizualizer.g:3445:1: rule__Primitive__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primitive__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3449:1: ( ( '(' ) )
            // InternalVizualizer.g:3450:1: ( '(' )
            {
            // InternalVizualizer.g:3450:1: ( '(' )
            // InternalVizualizer.g:3451:2: '('
            {
             before(grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group_2__0__Impl"


    // $ANTLR start "rule__Primitive__Group_2__1"
    // InternalVizualizer.g:3460:1: rule__Primitive__Group_2__1 : rule__Primitive__Group_2__1__Impl rule__Primitive__Group_2__2 ;
    public final void rule__Primitive__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3464:1: ( rule__Primitive__Group_2__1__Impl rule__Primitive__Group_2__2 )
            // InternalVizualizer.g:3465:2: rule__Primitive__Group_2__1__Impl rule__Primitive__Group_2__2
            {
            pushFollow(FOLLOW_38);
            rule__Primitive__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitive__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group_2__1"


    // $ANTLR start "rule__Primitive__Group_2__1__Impl"
    // InternalVizualizer.g:3472:1: rule__Primitive__Group_2__1__Impl : ( ruleExpression ) ;
    public final void rule__Primitive__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3476:1: ( ( ruleExpression ) )
            // InternalVizualizer.g:3477:1: ( ruleExpression )
            {
            // InternalVizualizer.g:3477:1: ( ruleExpression )
            // InternalVizualizer.g:3478:2: ruleExpression
            {
             before(grammarAccess.getPrimitiveAccess().getExpressionParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimitiveAccess().getExpressionParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group_2__1__Impl"


    // $ANTLR start "rule__Primitive__Group_2__2"
    // InternalVizualizer.g:3487:1: rule__Primitive__Group_2__2 : rule__Primitive__Group_2__2__Impl ;
    public final void rule__Primitive__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3491:1: ( rule__Primitive__Group_2__2__Impl )
            // InternalVizualizer.g:3492:2: rule__Primitive__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group_2__2"


    // $ANTLR start "rule__Primitive__Group_2__2__Impl"
    // InternalVizualizer.g:3498:1: rule__Primitive__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primitive__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3502:1: ( ( ')' ) )
            // InternalVizualizer.g:3503:1: ( ')' )
            {
            // InternalVizualizer.g:3503:1: ( ')' )
            // InternalVizualizer.g:3504:2: ')'
            {
             before(grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_2_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group_2__2__Impl"


    // $ANTLR start "rule__System__PagesAssignment_0"
    // InternalVizualizer.g:3514:1: rule__System__PagesAssignment_0 : ( rulePage ) ;
    public final void rule__System__PagesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3518:1: ( ( rulePage ) )
            // InternalVizualizer.g:3519:2: ( rulePage )
            {
            // InternalVizualizer.g:3519:2: ( rulePage )
            // InternalVizualizer.g:3520:3: rulePage
            {
             before(grammarAccess.getSystemAccess().getPagesPageParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePage();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getPagesPageParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__PagesAssignment_0"


    // $ANTLR start "rule__System__SourcesAssignment_1"
    // InternalVizualizer.g:3529:1: rule__System__SourcesAssignment_1 : ( ruleSource ) ;
    public final void rule__System__SourcesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3533:1: ( ( ruleSource ) )
            // InternalVizualizer.g:3534:2: ( ruleSource )
            {
            // InternalVizualizer.g:3534:2: ( ruleSource )
            // InternalVizualizer.g:3535:3: ruleSource
            {
             before(grammarAccess.getSystemAccess().getSourcesSourceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSource();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getSourcesSourceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__SourcesAssignment_1"


    // $ANTLR start "rule__System__SchemasAssignment_2"
    // InternalVizualizer.g:3544:1: rule__System__SchemasAssignment_2 : ( ruleSchemaParser ) ;
    public final void rule__System__SchemasAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3548:1: ( ( ruleSchemaParser ) )
            // InternalVizualizer.g:3549:2: ( ruleSchemaParser )
            {
            // InternalVizualizer.g:3549:2: ( ruleSchemaParser )
            // InternalVizualizer.g:3550:3: ruleSchemaParser
            {
             before(grammarAccess.getSystemAccess().getSchemasSchemaParserParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSchemaParser();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getSchemasSchemaParserParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__SchemasAssignment_2"


    // $ANTLR start "rule__Page__NameAssignment_1"
    // InternalVizualizer.g:3559:1: rule__Page__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Page__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3563:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:3564:2: ( RULE_ID )
            {
            // InternalVizualizer.g:3564:2: ( RULE_ID )
            // InternalVizualizer.g:3565:3: RULE_ID
            {
             before(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__NameAssignment_1"


    // $ANTLR start "rule__Page__TilesAssignment_3"
    // InternalVizualizer.g:3574:1: rule__Page__TilesAssignment_3 : ( ruleTile ) ;
    public final void rule__Page__TilesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3578:1: ( ( ruleTile ) )
            // InternalVizualizer.g:3579:2: ( ruleTile )
            {
            // InternalVizualizer.g:3579:2: ( ruleTile )
            // InternalVizualizer.g:3580:3: ruleTile
            {
             before(grammarAccess.getPageAccess().getTilesTileParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTile();

            state._fsp--;

             after(grammarAccess.getPageAccess().getTilesTileParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__TilesAssignment_3"


    // $ANTLR start "rule__Link__NameAssignment_1"
    // InternalVizualizer.g:3589:1: rule__Link__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Link__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3593:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:3594:2: ( RULE_ID )
            {
            // InternalVizualizer.g:3594:2: ( RULE_ID )
            // InternalVizualizer.g:3595:3: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__NameAssignment_1"


    // $ANTLR start "rule__Link__PageAssignment_3"
    // InternalVizualizer.g:3604:1: rule__Link__PageAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Link__PageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3608:1: ( ( ( RULE_ID ) ) )
            // InternalVizualizer.g:3609:2: ( ( RULE_ID ) )
            {
            // InternalVizualizer.g:3609:2: ( ( RULE_ID ) )
            // InternalVizualizer.g:3610:3: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getPagePageCrossReference_3_0()); 
            // InternalVizualizer.g:3611:3: ( RULE_ID )
            // InternalVizualizer.g:3612:4: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getPagePageIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getPagePageIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getLinkAccess().getPagePageCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__PageAssignment_3"


    // $ANTLR start "rule__Graph__NameAssignment_1"
    // InternalVizualizer.g:3623:1: rule__Graph__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Graph__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3627:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:3628:2: ( RULE_ID )
            {
            // InternalVizualizer.g:3628:2: ( RULE_ID )
            // InternalVizualizer.g:3629:3: RULE_ID
            {
             before(grammarAccess.getGraphAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__NameAssignment_1"


    // $ANTLR start "rule__Graph__SourceAssignment_2"
    // InternalVizualizer.g:3638:1: rule__Graph__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Graph__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3642:1: ( ( ( RULE_ID ) ) )
            // InternalVizualizer.g:3643:2: ( ( RULE_ID ) )
            {
            // InternalVizualizer.g:3643:2: ( ( RULE_ID ) )
            // InternalVizualizer.g:3644:3: ( RULE_ID )
            {
             before(grammarAccess.getGraphAccess().getSourceDatasourceCrossReference_2_0()); 
            // InternalVizualizer.g:3645:3: ( RULE_ID )
            // InternalVizualizer.g:3646:4: RULE_ID
            {
             before(grammarAccess.getGraphAccess().getSourceDatasourceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGraphAccess().getSourceDatasourceIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getGraphAccess().getSourceDatasourceCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__SourceAssignment_2"


    // $ANTLR start "rule__Datasource__NameAssignment_1"
    // InternalVizualizer.g:3657:1: rule__Datasource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Datasource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3661:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:3662:2: ( RULE_ID )
            {
            // InternalVizualizer.g:3662:2: ( RULE_ID )
            // InternalVizualizer.g:3663:3: RULE_ID
            {
             before(grammarAccess.getDatasourceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDatasourceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__NameAssignment_1"


    // $ANTLR start "rule__Datasource__DimensionsAssignment_5"
    // InternalVizualizer.g:3672:1: rule__Datasource__DimensionsAssignment_5 : ( ruleDimension ) ;
    public final void rule__Datasource__DimensionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3676:1: ( ( ruleDimension ) )
            // InternalVizualizer.g:3677:2: ( ruleDimension )
            {
            // InternalVizualizer.g:3677:2: ( ruleDimension )
            // InternalVizualizer.g:3678:3: ruleDimension
            {
             before(grammarAccess.getDatasourceAccess().getDimensionsDimensionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDimension();

            state._fsp--;

             after(grammarAccess.getDatasourceAccess().getDimensionsDimensionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__DimensionsAssignment_5"


    // $ANTLR start "rule__Datasource__DimensionsAssignment_6_1"
    // InternalVizualizer.g:3687:1: rule__Datasource__DimensionsAssignment_6_1 : ( ruleDimension ) ;
    public final void rule__Datasource__DimensionsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3691:1: ( ( ruleDimension ) )
            // InternalVizualizer.g:3692:2: ( ruleDimension )
            {
            // InternalVizualizer.g:3692:2: ( ruleDimension )
            // InternalVizualizer.g:3693:3: ruleDimension
            {
             before(grammarAccess.getDatasourceAccess().getDimensionsDimensionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDimension();

            state._fsp--;

             after(grammarAccess.getDatasourceAccess().getDimensionsDimensionParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__DimensionsAssignment_6_1"


    // $ANTLR start "rule__Dimension__NameAssignment_1"
    // InternalVizualizer.g:3702:1: rule__Dimension__NameAssignment_1 : ( ruleFormula ) ;
    public final void rule__Dimension__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3706:1: ( ( ruleFormula ) )
            // InternalVizualizer.g:3707:2: ( ruleFormula )
            {
            // InternalVizualizer.g:3707:2: ( ruleFormula )
            // InternalVizualizer.g:3708:3: ruleFormula
            {
             before(grammarAccess.getDimensionAccess().getNameFormulaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFormula();

            state._fsp--;

             after(grammarAccess.getDimensionAccess().getNameFormulaParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__NameAssignment_1"


    // $ANTLR start "rule__Dimension__SourceSelectorsAssignment_2"
    // InternalVizualizer.g:3717:1: rule__Dimension__SourceSelectorsAssignment_2 : ( ruleDimensionSelector ) ;
    public final void rule__Dimension__SourceSelectorsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3721:1: ( ( ruleDimensionSelector ) )
            // InternalVizualizer.g:3722:2: ( ruleDimensionSelector )
            {
            // InternalVizualizer.g:3722:2: ( ruleDimensionSelector )
            // InternalVizualizer.g:3723:3: ruleDimensionSelector
            {
             before(grammarAccess.getDimensionAccess().getSourceSelectorsDimensionSelectorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDimensionSelector();

            state._fsp--;

             after(grammarAccess.getDimensionAccess().getSourceSelectorsDimensionSelectorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__SourceSelectorsAssignment_2"


    // $ANTLR start "rule__Dimension__SourceSelectorsAssignment_3_1"
    // InternalVizualizer.g:3732:1: rule__Dimension__SourceSelectorsAssignment_3_1 : ( ruleDimensionSelector ) ;
    public final void rule__Dimension__SourceSelectorsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3736:1: ( ( ruleDimensionSelector ) )
            // InternalVizualizer.g:3737:2: ( ruleDimensionSelector )
            {
            // InternalVizualizer.g:3737:2: ( ruleDimensionSelector )
            // InternalVizualizer.g:3738:3: ruleDimensionSelector
            {
             before(grammarAccess.getDimensionAccess().getSourceSelectorsDimensionSelectorParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDimensionSelector();

            state._fsp--;

             after(grammarAccess.getDimensionAccess().getSourceSelectorsDimensionSelectorParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__SourceSelectorsAssignment_3_1"


    // $ANTLR start "rule__DimensionSelector__SourceAssignment_1"
    // InternalVizualizer.g:3747:1: rule__DimensionSelector__SourceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DimensionSelector__SourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3751:1: ( ( ( RULE_ID ) ) )
            // InternalVizualizer.g:3752:2: ( ( RULE_ID ) )
            {
            // InternalVizualizer.g:3752:2: ( ( RULE_ID ) )
            // InternalVizualizer.g:3753:3: ( RULE_ID )
            {
             before(grammarAccess.getDimensionSelectorAccess().getSourceSourceCrossReference_1_0()); 
            // InternalVizualizer.g:3754:3: ( RULE_ID )
            // InternalVizualizer.g:3755:4: RULE_ID
            {
             before(grammarAccess.getDimensionSelectorAccess().getSourceSourceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDimensionSelectorAccess().getSourceSourceIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDimensionSelectorAccess().getSourceSourceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionSelector__SourceAssignment_1"


    // $ANTLR start "rule__DimensionSelector__SelectVarAssignment_3"
    // InternalVizualizer.g:3766:1: rule__DimensionSelector__SelectVarAssignment_3 : ( ruleNoQuotesString ) ;
    public final void rule__DimensionSelector__SelectVarAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3770:1: ( ( ruleNoQuotesString ) )
            // InternalVizualizer.g:3771:2: ( ruleNoQuotesString )
            {
            // InternalVizualizer.g:3771:2: ( ruleNoQuotesString )
            // InternalVizualizer.g:3772:3: ruleNoQuotesString
            {
             before(grammarAccess.getDimensionSelectorAccess().getSelectVarNoQuotesStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNoQuotesString();

            state._fsp--;

             after(grammarAccess.getDimensionSelectorAccess().getSelectVarNoQuotesStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionSelector__SelectVarAssignment_3"


    // $ANTLR start "rule__DimensionSelector__NameAssignment_6"
    // InternalVizualizer.g:3781:1: rule__DimensionSelector__NameAssignment_6 : ( RULE_ID ) ;
    public final void rule__DimensionSelector__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3785:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:3786:2: ( RULE_ID )
            {
            // InternalVizualizer.g:3786:2: ( RULE_ID )
            // InternalVizualizer.g:3787:3: RULE_ID
            {
             before(grammarAccess.getDimensionSelectorAccess().getNameIDTerminalRuleCall_6_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDimensionSelectorAccess().getNameIDTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionSelector__NameAssignment_6"


    // $ANTLR start "rule__NoQuotesString__NameAssignment"
    // InternalVizualizer.g:3796:1: rule__NoQuotesString__NameAssignment : ( RULE_ID ) ;
    public final void rule__NoQuotesString__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3800:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:3801:2: ( RULE_ID )
            {
            // InternalVizualizer.g:3801:2: ( RULE_ID )
            // InternalVizualizer.g:3802:3: RULE_ID
            {
             before(grammarAccess.getNoQuotesStringAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNoQuotesStringAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoQuotesString__NameAssignment"


    // $ANTLR start "rule__PostEndPoint__NameAssignment_1"
    // InternalVizualizer.g:3811:1: rule__PostEndPoint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PostEndPoint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3815:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:3816:2: ( RULE_ID )
            {
            // InternalVizualizer.g:3816:2: ( RULE_ID )
            // InternalVizualizer.g:3817:3: RULE_ID
            {
             before(grammarAccess.getPostEndPointAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPostEndPointAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostEndPoint__NameAssignment_1"


    // $ANTLR start "rule__PostEndPoint__UrlAssignment_4"
    // InternalVizualizer.g:3826:1: rule__PostEndPoint__UrlAssignment_4 : ( RULE_STRING ) ;
    public final void rule__PostEndPoint__UrlAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3830:1: ( ( RULE_STRING ) )
            // InternalVizualizer.g:3831:2: ( RULE_STRING )
            {
            // InternalVizualizer.g:3831:2: ( RULE_STRING )
            // InternalVizualizer.g:3832:3: RULE_STRING
            {
             before(grammarAccess.getPostEndPointAccess().getUrlSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPostEndPointAccess().getUrlSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostEndPoint__UrlAssignment_4"


    // $ANTLR start "rule__PostEndPoint__ParserAssignment_6"
    // InternalVizualizer.g:3841:1: rule__PostEndPoint__ParserAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__PostEndPoint__ParserAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3845:1: ( ( ( RULE_ID ) ) )
            // InternalVizualizer.g:3846:2: ( ( RULE_ID ) )
            {
            // InternalVizualizer.g:3846:2: ( ( RULE_ID ) )
            // InternalVizualizer.g:3847:3: ( RULE_ID )
            {
             before(grammarAccess.getPostEndPointAccess().getParserSchemaParserCrossReference_6_0()); 
            // InternalVizualizer.g:3848:3: ( RULE_ID )
            // InternalVizualizer.g:3849:4: RULE_ID
            {
             before(grammarAccess.getPostEndPointAccess().getParserSchemaParserIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPostEndPointAccess().getParserSchemaParserIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getPostEndPointAccess().getParserSchemaParserCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PostEndPoint__ParserAssignment_6"


    // $ANTLR start "rule__GetEndPoint__NameAssignment_1"
    // InternalVizualizer.g:3860:1: rule__GetEndPoint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GetEndPoint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3864:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:3865:2: ( RULE_ID )
            {
            // InternalVizualizer.g:3865:2: ( RULE_ID )
            // InternalVizualizer.g:3866:3: RULE_ID
            {
             before(grammarAccess.getGetEndPointAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGetEndPointAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__NameAssignment_1"


    // $ANTLR start "rule__GetEndPoint__UrlAssignment_4"
    // InternalVizualizer.g:3875:1: rule__GetEndPoint__UrlAssignment_4 : ( RULE_STRING ) ;
    public final void rule__GetEndPoint__UrlAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3879:1: ( ( RULE_STRING ) )
            // InternalVizualizer.g:3880:2: ( RULE_STRING )
            {
            // InternalVizualizer.g:3880:2: ( RULE_STRING )
            // InternalVizualizer.g:3881:3: RULE_STRING
            {
             before(grammarAccess.getGetEndPointAccess().getUrlSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGetEndPointAccess().getUrlSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__UrlAssignment_4"


    // $ANTLR start "rule__GetEndPoint__HeadersAssignment_7"
    // InternalVizualizer.g:3890:1: rule__GetEndPoint__HeadersAssignment_7 : ( ruleHeader ) ;
    public final void rule__GetEndPoint__HeadersAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3894:1: ( ( ruleHeader ) )
            // InternalVizualizer.g:3895:2: ( ruleHeader )
            {
            // InternalVizualizer.g:3895:2: ( ruleHeader )
            // InternalVizualizer.g:3896:3: ruleHeader
            {
             before(grammarAccess.getGetEndPointAccess().getHeadersHeaderParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getGetEndPointAccess().getHeadersHeaderParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__HeadersAssignment_7"


    // $ANTLR start "rule__GetEndPoint__HeadersAssignment_8_1"
    // InternalVizualizer.g:3905:1: rule__GetEndPoint__HeadersAssignment_8_1 : ( ruleHeader ) ;
    public final void rule__GetEndPoint__HeadersAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3909:1: ( ( ruleHeader ) )
            // InternalVizualizer.g:3910:2: ( ruleHeader )
            {
            // InternalVizualizer.g:3910:2: ( ruleHeader )
            // InternalVizualizer.g:3911:3: ruleHeader
            {
             before(grammarAccess.getGetEndPointAccess().getHeadersHeaderParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getGetEndPointAccess().getHeadersHeaderParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__HeadersAssignment_8_1"


    // $ANTLR start "rule__GetEndPoint__ParserAssignment_11"
    // InternalVizualizer.g:3920:1: rule__GetEndPoint__ParserAssignment_11 : ( ( RULE_ID ) ) ;
    public final void rule__GetEndPoint__ParserAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3924:1: ( ( ( RULE_ID ) ) )
            // InternalVizualizer.g:3925:2: ( ( RULE_ID ) )
            {
            // InternalVizualizer.g:3925:2: ( ( RULE_ID ) )
            // InternalVizualizer.g:3926:3: ( RULE_ID )
            {
             before(grammarAccess.getGetEndPointAccess().getParserSchemaParserCrossReference_11_0()); 
            // InternalVizualizer.g:3927:3: ( RULE_ID )
            // InternalVizualizer.g:3928:4: RULE_ID
            {
             before(grammarAccess.getGetEndPointAccess().getParserSchemaParserIDTerminalRuleCall_11_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGetEndPointAccess().getParserSchemaParserIDTerminalRuleCall_11_0_1()); 

            }

             after(grammarAccess.getGetEndPointAccess().getParserSchemaParserCrossReference_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetEndPoint__ParserAssignment_11"


    // $ANTLR start "rule__Header__KeywordAssignment_0"
    // InternalVizualizer.g:3939:1: rule__Header__KeywordAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Header__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3943:1: ( ( RULE_STRING ) )
            // InternalVizualizer.g:3944:2: ( RULE_STRING )
            {
            // InternalVizualizer.g:3944:2: ( RULE_STRING )
            // InternalVizualizer.g:3945:3: RULE_STRING
            {
             before(grammarAccess.getHeaderAccess().getKeywordSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getKeywordSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__KeywordAssignment_0"


    // $ANTLR start "rule__Header__ValueAssignment_2"
    // InternalVizualizer.g:3954:1: rule__Header__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Header__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3958:1: ( ( RULE_STRING ) )
            // InternalVizualizer.g:3959:2: ( RULE_STRING )
            {
            // InternalVizualizer.g:3959:2: ( RULE_STRING )
            // InternalVizualizer.g:3960:3: RULE_STRING
            {
             before(grammarAccess.getHeaderAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__ValueAssignment_2"


    // $ANTLR start "rule__SchemaParser__NameAssignment_1"
    // InternalVizualizer.g:3969:1: rule__SchemaParser__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SchemaParser__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3973:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:3974:2: ( RULE_ID )
            {
            // InternalVizualizer.g:3974:2: ( RULE_ID )
            // InternalVizualizer.g:3975:3: RULE_ID
            {
             before(grammarAccess.getSchemaParserAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSchemaParserAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaParser__NameAssignment_1"


    // $ANTLR start "rule__SchemaParser__SchemaTypeAssignment_5"
    // InternalVizualizer.g:3984:1: rule__SchemaParser__SchemaTypeAssignment_5 : ( ruleSchemaType ) ;
    public final void rule__SchemaParser__SchemaTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3988:1: ( ( ruleSchemaType ) )
            // InternalVizualizer.g:3989:2: ( ruleSchemaType )
            {
            // InternalVizualizer.g:3989:2: ( ruleSchemaType )
            // InternalVizualizer.g:3990:3: ruleSchemaType
            {
             before(grammarAccess.getSchemaParserAccess().getSchemaTypeSchemaTypeEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSchemaType();

            state._fsp--;

             after(grammarAccess.getSchemaParserAccess().getSchemaTypeSchemaTypeEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaParser__SchemaTypeAssignment_5"


    // $ANTLR start "rule__SchemaParser__SelectorsAssignment_6"
    // InternalVizualizer.g:3999:1: rule__SchemaParser__SelectorsAssignment_6 : ( ruleSelector ) ;
    public final void rule__SchemaParser__SelectorsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:4003:1: ( ( ruleSelector ) )
            // InternalVizualizer.g:4004:2: ( ruleSelector )
            {
            // InternalVizualizer.g:4004:2: ( ruleSelector )
            // InternalVizualizer.g:4005:3: ruleSelector
            {
             before(grammarAccess.getSchemaParserAccess().getSelectorsSelectorParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSchemaParserAccess().getSelectorsSelectorParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaParser__SelectorsAssignment_6"


    // $ANTLR start "rule__Selector__NameAssignment_1"
    // InternalVizualizer.g:4014:1: rule__Selector__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Selector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:4018:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:4019:2: ( RULE_ID )
            {
            // InternalVizualizer.g:4019:2: ( RULE_ID )
            // InternalVizualizer.g:4020:3: RULE_ID
            {
             before(grammarAccess.getSelectorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__NameAssignment_1"


    // $ANTLR start "rule__Selector__StepsAssignment_3"
    // InternalVizualizer.g:4029:1: rule__Selector__StepsAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Selector__StepsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:4033:1: ( ( RULE_STRING ) )
            // InternalVizualizer.g:4034:2: ( RULE_STRING )
            {
            // InternalVizualizer.g:4034:2: ( RULE_STRING )
            // InternalVizualizer.g:4035:3: RULE_STRING
            {
             before(grammarAccess.getSelectorAccess().getStepsSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getStepsSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__StepsAssignment_3"


    // $ANTLR start "rule__Selector__StepsAssignment_4_1"
    // InternalVizualizer.g:4044:1: rule__Selector__StepsAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Selector__StepsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:4048:1: ( ( RULE_STRING ) )
            // InternalVizualizer.g:4049:2: ( RULE_STRING )
            {
            // InternalVizualizer.g:4049:2: ( RULE_STRING )
            // InternalVizualizer.g:4050:3: RULE_STRING
            {
             before(grammarAccess.getSelectorAccess().getStepsSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getStepsSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selector__StepsAssignment_4_1"


    // $ANTLR start "rule__Formula__NameAssignment_0"
    // InternalVizualizer.g:4059:1: rule__Formula__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Formula__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:4063:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:4064:2: ( RULE_ID )
            {
            // InternalVizualizer.g:4064:2: ( RULE_ID )
            // InternalVizualizer.g:4065:3: RULE_ID
            {
             before(grammarAccess.getFormulaAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFormulaAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__NameAssignment_0"


    // $ANTLR start "rule__Formula__VarsAssignment_2_0"
    // InternalVizualizer.g:4074:1: rule__Formula__VarsAssignment_2_0 : ( ruleVariable ) ;
    public final void rule__Formula__VarsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:4078:1: ( ( ruleVariable ) )
            // InternalVizualizer.g:4079:2: ( ruleVariable )
            {
            // InternalVizualizer.g:4079:2: ( ruleVariable )
            // InternalVizualizer.g:4080:3: ruleVariable
            {
             before(grammarAccess.getFormulaAccess().getVarsVariableParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getFormulaAccess().getVarsVariableParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__VarsAssignment_2_0"


    // $ANTLR start "rule__Formula__VarsAssignment_2_1_1"
    // InternalVizualizer.g:4089:1: rule__Formula__VarsAssignment_2_1_1 : ( ruleVariable ) ;
    public final void rule__Formula__VarsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:4093:1: ( ( ruleVariable ) )
            // InternalVizualizer.g:4094:2: ( ruleVariable )
            {
            // InternalVizualizer.g:4094:2: ( ruleVariable )
            // InternalVizualizer.g:4095:3: ruleVariable
            {
             before(grammarAccess.getFormulaAccess().getVarsVariableParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getFormulaAccess().getVarsVariableParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__VarsAssignment_2_1_1"


    // $ANTLR start "rule__Formula__ExpAssignment_5"
    // InternalVizualizer.g:4104:1: rule__Formula__ExpAssignment_5 : ( ruleExpression ) ;
    public final void rule__Formula__ExpAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:4108:1: ( ( ruleExpression ) )
            // InternalVizualizer.g:4109:2: ( ruleExpression )
            {
            // InternalVizualizer.g:4109:2: ( ruleExpression )
            // InternalVizualizer.g:4110:3: ruleExpression
            {
             before(grammarAccess.getFormulaAccess().getExpExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFormulaAccess().getExpExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__ExpAssignment_5"


    // $ANTLR start "rule__Expression__LeftAssignment_0"
    // InternalVizualizer.g:4119:1: rule__Expression__LeftAssignment_0 : ( ruleFactor ) ;
    public final void rule__Expression__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:4123:1: ( ( ruleFactor ) )
            // InternalVizualizer.g:4124:2: ( ruleFactor )
            {
            // InternalVizualizer.g:4124:2: ( ruleFactor )
            // InternalVizualizer.g:4125:3: ruleFactor
            {
             before(grammarAccess.getExpressionAccess().getLeftFactorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getLeftFactorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__LeftAssignment_0"


    // $ANTLR start "rule__Expression__OpAssignment_1_0"
    // InternalVizualizer.g:4134:1: rule__Expression__OpAssignment_1_0 : ( ruleOp1 ) ;
    public final void rule__Expression__OpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:4138:1: ( ( ruleOp1 ) )
            // InternalVizualizer.g:4139:2: ( ruleOp1 )
            {
            // InternalVizualizer.g:4139:2: ( ruleOp1 )
            // InternalVizualizer.g:4140:3: ruleOp1
            {
             before(grammarAccess.getExpressionAccess().getOpOp1ParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOp1();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOpOp1ParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__OpAssignment_1_0"


    // $ANTLR start "rule__Expression__RightAssignment_1_1"
    // InternalVizualizer.g:4149:1: rule__Expression__RightAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__Expression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:4153:1: ( ( ruleExpression ) )
            // InternalVizualizer.g:4154:2: ( ruleExpression )
            {
            // InternalVizualizer.g:4154:2: ( ruleExpression )
            // InternalVizualizer.g:4155:3: ruleExpression
            {
             before(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__RightAssignment_1_1"


    // $ANTLR start "rule__Factor__LeftAssignment_0"
    // InternalVizualizer.g:4164:1: rule__Factor__LeftAssignment_0 : ( rulePrimitive ) ;
    public final void rule__Factor__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:4168:1: ( ( rulePrimitive ) )
            // InternalVizualizer.g:4169:2: ( rulePrimitive )
            {
            // InternalVizualizer.g:4169:2: ( rulePrimitive )
            // InternalVizualizer.g:4170:3: rulePrimitive
            {
             before(grammarAccess.getFactorAccess().getLeftPrimitiveParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getLeftPrimitiveParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__LeftAssignment_0"


    // $ANTLR start "rule__Factor__OpAssignment_1_0"
    // InternalVizualizer.g:4179:1: rule__Factor__OpAssignment_1_0 : ( ruleOp2 ) ;
    public final void rule__Factor__OpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:4183:1: ( ( ruleOp2 ) )
            // InternalVizualizer.g:4184:2: ( ruleOp2 )
            {
            // InternalVizualizer.g:4184:2: ( ruleOp2 )
            // InternalVizualizer.g:4185:3: ruleOp2
            {
             before(grammarAccess.getFactorAccess().getOpOp2ParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOp2();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getOpOp2ParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__OpAssignment_1_0"


    // $ANTLR start "rule__Factor__RightAssignment_1_1"
    // InternalVizualizer.g:4194:1: rule__Factor__RightAssignment_1_1 : ( ruleFactor ) ;
    public final void rule__Factor__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:4198:1: ( ( ruleFactor ) )
            // InternalVizualizer.g:4199:2: ( ruleFactor )
            {
            // InternalVizualizer.g:4199:2: ( ruleFactor )
            // InternalVizualizer.g:4200:3: ruleFactor
            {
             before(grammarAccess.getFactorAccess().getRightFactorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getRightFactorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__RightAssignment_1_1"


    // $ANTLR start "rule__Number__ValAssignment"
    // InternalVizualizer.g:4209:1: rule__Number__ValAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:4213:1: ( ( RULE_INT ) )
            // InternalVizualizer.g:4214:2: ( RULE_INT )
            {
            // InternalVizualizer.g:4214:2: ( RULE_INT )
            // InternalVizualizer.g:4215:3: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getValINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getValINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__ValAssignment"


    // $ANTLR start "rule__Variable__NameAssignment"
    // InternalVizualizer.g:4224:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:4228:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:4229:2: ( RULE_ID )
            {
            // InternalVizualizer.g:4229:2: ( RULE_ID )
            // InternalVizualizer.g:4230:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000A401040002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000B00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000050L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000000L});

}