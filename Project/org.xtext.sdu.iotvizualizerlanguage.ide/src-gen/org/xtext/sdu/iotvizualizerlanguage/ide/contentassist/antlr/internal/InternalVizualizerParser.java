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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'XML'", "'CSV'", "'JSON'", "'Page'", "'{'", "'}'", "'Link'", "'to'", "'Graph'", "'Datasource'", "'Source'", "'Dimension'", "'as'", "'Formula'", "'URI'", "'url'", "'use Schema'", "'Schema'", "'SchemaType = '", "'Selector as '", "' -> '", "'('", "')'", "'='", "','"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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

                if ( (LA1_0==18||LA1_0==24||LA1_0==29||LA1_0==32) ) {
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


    // $ANTLR start "entryRuleDimensionalData"
    // InternalVizualizer.g:203:1: entryRuleDimensionalData : ruleDimensionalData EOF ;
    public final void entryRuleDimensionalData() throws RecognitionException {
        try {
            // InternalVizualizer.g:204:1: ( ruleDimensionalData EOF )
            // InternalVizualizer.g:205:1: ruleDimensionalData EOF
            {
             before(grammarAccess.getDimensionalDataRule()); 
            pushFollow(FOLLOW_1);
            ruleDimensionalData();

            state._fsp--;

             after(grammarAccess.getDimensionalDataRule()); 
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
    // $ANTLR end "entryRuleDimensionalData"


    // $ANTLR start "ruleDimensionalData"
    // InternalVizualizer.g:212:1: ruleDimensionalData : ( ( rule__DimensionalData__Group__0 ) ) ;
    public final void ruleDimensionalData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:216:2: ( ( ( rule__DimensionalData__Group__0 ) ) )
            // InternalVizualizer.g:217:2: ( ( rule__DimensionalData__Group__0 ) )
            {
            // InternalVizualizer.g:217:2: ( ( rule__DimensionalData__Group__0 ) )
            // InternalVizualizer.g:218:3: ( rule__DimensionalData__Group__0 )
            {
             before(grammarAccess.getDimensionalDataAccess().getGroup()); 
            // InternalVizualizer.g:219:3: ( rule__DimensionalData__Group__0 )
            // InternalVizualizer.g:219:4: rule__DimensionalData__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DimensionalData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDimensionalDataAccess().getGroup()); 

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
    // $ANTLR end "ruleDimensionalData"


    // $ANTLR start "entryRuleSource"
    // InternalVizualizer.g:228:1: entryRuleSource : ruleSource EOF ;
    public final void entryRuleSource() throws RecognitionException {
        try {
            // InternalVizualizer.g:229:1: ( ruleSource EOF )
            // InternalVizualizer.g:230:1: ruleSource EOF
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
    // InternalVizualizer.g:237:1: ruleSource : ( ( rule__Source__Alternatives ) ) ;
    public final void ruleSource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:241:2: ( ( ( rule__Source__Alternatives ) ) )
            // InternalVizualizer.g:242:2: ( ( rule__Source__Alternatives ) )
            {
            // InternalVizualizer.g:242:2: ( ( rule__Source__Alternatives ) )
            // InternalVizualizer.g:243:3: ( rule__Source__Alternatives )
            {
             before(grammarAccess.getSourceAccess().getAlternatives()); 
            // InternalVizualizer.g:244:3: ( rule__Source__Alternatives )
            // InternalVizualizer.g:244:4: rule__Source__Alternatives
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


    // $ANTLR start "entryRuleURI"
    // InternalVizualizer.g:253:1: entryRuleURI : ruleURI EOF ;
    public final void entryRuleURI() throws RecognitionException {
        try {
            // InternalVizualizer.g:254:1: ( ruleURI EOF )
            // InternalVizualizer.g:255:1: ruleURI EOF
            {
             before(grammarAccess.getURIRule()); 
            pushFollow(FOLLOW_1);
            ruleURI();

            state._fsp--;

             after(grammarAccess.getURIRule()); 
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
    // $ANTLR end "entryRuleURI"


    // $ANTLR start "ruleURI"
    // InternalVizualizer.g:262:1: ruleURI : ( ( rule__URI__Group__0 ) ) ;
    public final void ruleURI() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:266:2: ( ( ( rule__URI__Group__0 ) ) )
            // InternalVizualizer.g:267:2: ( ( rule__URI__Group__0 ) )
            {
            // InternalVizualizer.g:267:2: ( ( rule__URI__Group__0 ) )
            // InternalVizualizer.g:268:3: ( rule__URI__Group__0 )
            {
             before(grammarAccess.getURIAccess().getGroup()); 
            // InternalVizualizer.g:269:3: ( rule__URI__Group__0 )
            // InternalVizualizer.g:269:4: rule__URI__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__URI__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getURIAccess().getGroup()); 

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
    // $ANTLR end "ruleURI"


    // $ANTLR start "entryRuleSchemaParser"
    // InternalVizualizer.g:278:1: entryRuleSchemaParser : ruleSchemaParser EOF ;
    public final void entryRuleSchemaParser() throws RecognitionException {
        try {
            // InternalVizualizer.g:279:1: ( ruleSchemaParser EOF )
            // InternalVizualizer.g:280:1: ruleSchemaParser EOF
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
    // InternalVizualizer.g:287:1: ruleSchemaParser : ( ( rule__SchemaParser__Group__0 ) ) ;
    public final void ruleSchemaParser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:291:2: ( ( ( rule__SchemaParser__Group__0 ) ) )
            // InternalVizualizer.g:292:2: ( ( rule__SchemaParser__Group__0 ) )
            {
            // InternalVizualizer.g:292:2: ( ( rule__SchemaParser__Group__0 ) )
            // InternalVizualizer.g:293:3: ( rule__SchemaParser__Group__0 )
            {
             before(grammarAccess.getSchemaParserAccess().getGroup()); 
            // InternalVizualizer.g:294:3: ( rule__SchemaParser__Group__0 )
            // InternalVizualizer.g:294:4: rule__SchemaParser__Group__0
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
    // InternalVizualizer.g:303:1: entryRuleSelector : ruleSelector EOF ;
    public final void entryRuleSelector() throws RecognitionException {
        try {
            // InternalVizualizer.g:304:1: ( ruleSelector EOF )
            // InternalVizualizer.g:305:1: ruleSelector EOF
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
    // InternalVizualizer.g:312:1: ruleSelector : ( ( rule__Selector__Group__0 ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:316:2: ( ( ( rule__Selector__Group__0 ) ) )
            // InternalVizualizer.g:317:2: ( ( rule__Selector__Group__0 ) )
            {
            // InternalVizualizer.g:317:2: ( ( rule__Selector__Group__0 ) )
            // InternalVizualizer.g:318:3: ( rule__Selector__Group__0 )
            {
             before(grammarAccess.getSelectorAccess().getGroup()); 
            // InternalVizualizer.g:319:3: ( rule__Selector__Group__0 )
            // InternalVizualizer.g:319:4: rule__Selector__Group__0
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
    // InternalVizualizer.g:328:1: entryRuleFormula : ruleFormula EOF ;
    public final void entryRuleFormula() throws RecognitionException {
        try {
            // InternalVizualizer.g:329:1: ( ruleFormula EOF )
            // InternalVizualizer.g:330:1: ruleFormula EOF
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
    // InternalVizualizer.g:337:1: ruleFormula : ( ( rule__Formula__Group__0 ) ) ;
    public final void ruleFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:341:2: ( ( ( rule__Formula__Group__0 ) ) )
            // InternalVizualizer.g:342:2: ( ( rule__Formula__Group__0 ) )
            {
            // InternalVizualizer.g:342:2: ( ( rule__Formula__Group__0 ) )
            // InternalVizualizer.g:343:3: ( rule__Formula__Group__0 )
            {
             before(grammarAccess.getFormulaAccess().getGroup()); 
            // InternalVizualizer.g:344:3: ( rule__Formula__Group__0 )
            // InternalVizualizer.g:344:4: rule__Formula__Group__0
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
    // InternalVizualizer.g:353:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalVizualizer.g:354:1: ( ruleExpression EOF )
            // InternalVizualizer.g:355:1: ruleExpression EOF
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
    // InternalVizualizer.g:362:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:366:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalVizualizer.g:367:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalVizualizer.g:367:2: ( ( rule__Expression__Group__0 ) )
            // InternalVizualizer.g:368:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalVizualizer.g:369:3: ( rule__Expression__Group__0 )
            // InternalVizualizer.g:369:4: rule__Expression__Group__0
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
    // InternalVizualizer.g:378:1: entryRuleOp1 : ruleOp1 EOF ;
    public final void entryRuleOp1() throws RecognitionException {
        try {
            // InternalVizualizer.g:379:1: ( ruleOp1 EOF )
            // InternalVizualizer.g:380:1: ruleOp1 EOF
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
    // InternalVizualizer.g:387:1: ruleOp1 : ( ( rule__Op1__Alternatives ) ) ;
    public final void ruleOp1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:391:2: ( ( ( rule__Op1__Alternatives ) ) )
            // InternalVizualizer.g:392:2: ( ( rule__Op1__Alternatives ) )
            {
            // InternalVizualizer.g:392:2: ( ( rule__Op1__Alternatives ) )
            // InternalVizualizer.g:393:3: ( rule__Op1__Alternatives )
            {
             before(grammarAccess.getOp1Access().getAlternatives()); 
            // InternalVizualizer.g:394:3: ( rule__Op1__Alternatives )
            // InternalVizualizer.g:394:4: rule__Op1__Alternatives
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
    // InternalVizualizer.g:403:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // InternalVizualizer.g:404:1: ( ruleFactor EOF )
            // InternalVizualizer.g:405:1: ruleFactor EOF
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
    // InternalVizualizer.g:412:1: ruleFactor : ( ( rule__Factor__Group__0 ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:416:2: ( ( ( rule__Factor__Group__0 ) ) )
            // InternalVizualizer.g:417:2: ( ( rule__Factor__Group__0 ) )
            {
            // InternalVizualizer.g:417:2: ( ( rule__Factor__Group__0 ) )
            // InternalVizualizer.g:418:3: ( rule__Factor__Group__0 )
            {
             before(grammarAccess.getFactorAccess().getGroup()); 
            // InternalVizualizer.g:419:3: ( rule__Factor__Group__0 )
            // InternalVizualizer.g:419:4: rule__Factor__Group__0
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
    // InternalVizualizer.g:428:1: entryRuleOp2 : ruleOp2 EOF ;
    public final void entryRuleOp2() throws RecognitionException {
        try {
            // InternalVizualizer.g:429:1: ( ruleOp2 EOF )
            // InternalVizualizer.g:430:1: ruleOp2 EOF
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
    // InternalVizualizer.g:437:1: ruleOp2 : ( ( rule__Op2__Alternatives ) ) ;
    public final void ruleOp2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:441:2: ( ( ( rule__Op2__Alternatives ) ) )
            // InternalVizualizer.g:442:2: ( ( rule__Op2__Alternatives ) )
            {
            // InternalVizualizer.g:442:2: ( ( rule__Op2__Alternatives ) )
            // InternalVizualizer.g:443:3: ( rule__Op2__Alternatives )
            {
             before(grammarAccess.getOp2Access().getAlternatives()); 
            // InternalVizualizer.g:444:3: ( rule__Op2__Alternatives )
            // InternalVizualizer.g:444:4: rule__Op2__Alternatives
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
    // InternalVizualizer.g:453:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // InternalVizualizer.g:454:1: ( rulePrimitive EOF )
            // InternalVizualizer.g:455:1: rulePrimitive EOF
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
    // InternalVizualizer.g:462:1: rulePrimitive : ( ( rule__Primitive__Alternatives ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:466:2: ( ( ( rule__Primitive__Alternatives ) ) )
            // InternalVizualizer.g:467:2: ( ( rule__Primitive__Alternatives ) )
            {
            // InternalVizualizer.g:467:2: ( ( rule__Primitive__Alternatives ) )
            // InternalVizualizer.g:468:3: ( rule__Primitive__Alternatives )
            {
             before(grammarAccess.getPrimitiveAccess().getAlternatives()); 
            // InternalVizualizer.g:469:3: ( rule__Primitive__Alternatives )
            // InternalVizualizer.g:469:4: rule__Primitive__Alternatives
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
    // InternalVizualizer.g:478:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalVizualizer.g:479:1: ( ruleNumber EOF )
            // InternalVizualizer.g:480:1: ruleNumber EOF
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
    // InternalVizualizer.g:487:1: ruleNumber : ( ( rule__Number__ValAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:491:2: ( ( ( rule__Number__ValAssignment ) ) )
            // InternalVizualizer.g:492:2: ( ( rule__Number__ValAssignment ) )
            {
            // InternalVizualizer.g:492:2: ( ( rule__Number__ValAssignment ) )
            // InternalVizualizer.g:493:3: ( rule__Number__ValAssignment )
            {
             before(grammarAccess.getNumberAccess().getValAssignment()); 
            // InternalVizualizer.g:494:3: ( rule__Number__ValAssignment )
            // InternalVizualizer.g:494:4: rule__Number__ValAssignment
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
    // InternalVizualizer.g:503:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalVizualizer.g:504:1: ( ruleVariable EOF )
            // InternalVizualizer.g:505:1: ruleVariable EOF
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
    // InternalVizualizer.g:512:1: ruleVariable : ( ( rule__Variable__NameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:516:2: ( ( ( rule__Variable__NameAssignment ) ) )
            // InternalVizualizer.g:517:2: ( ( rule__Variable__NameAssignment ) )
            {
            // InternalVizualizer.g:517:2: ( ( rule__Variable__NameAssignment ) )
            // InternalVizualizer.g:518:3: ( rule__Variable__NameAssignment )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment()); 
            // InternalVizualizer.g:519:3: ( rule__Variable__NameAssignment )
            // InternalVizualizer.g:519:4: rule__Variable__NameAssignment
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
    // InternalVizualizer.g:528:1: ruleSchemaType : ( ( rule__SchemaType__Alternatives ) ) ;
    public final void ruleSchemaType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:532:1: ( ( ( rule__SchemaType__Alternatives ) ) )
            // InternalVizualizer.g:533:2: ( ( rule__SchemaType__Alternatives ) )
            {
            // InternalVizualizer.g:533:2: ( ( rule__SchemaType__Alternatives ) )
            // InternalVizualizer.g:534:3: ( rule__SchemaType__Alternatives )
            {
             before(grammarAccess.getSchemaTypeAccess().getAlternatives()); 
            // InternalVizualizer.g:535:3: ( rule__SchemaType__Alternatives )
            // InternalVizualizer.g:535:4: rule__SchemaType__Alternatives
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
    // InternalVizualizer.g:543:1: rule__System__Alternatives : ( ( ( rule__System__PagesAssignment_0 ) ) | ( ( rule__System__SourcesAssignment_1 ) ) | ( ( rule__System__SchemasAssignment_2 ) ) );
    public final void rule__System__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:547:1: ( ( ( rule__System__PagesAssignment_0 ) ) | ( ( rule__System__SourcesAssignment_1 ) ) | ( ( rule__System__SchemasAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 24:
            case 29:
                {
                alt2=2;
                }
                break;
            case 32:
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
                    // InternalVizualizer.g:548:2: ( ( rule__System__PagesAssignment_0 ) )
                    {
                    // InternalVizualizer.g:548:2: ( ( rule__System__PagesAssignment_0 ) )
                    // InternalVizualizer.g:549:3: ( rule__System__PagesAssignment_0 )
                    {
                     before(grammarAccess.getSystemAccess().getPagesAssignment_0()); 
                    // InternalVizualizer.g:550:3: ( rule__System__PagesAssignment_0 )
                    // InternalVizualizer.g:550:4: rule__System__PagesAssignment_0
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
                    // InternalVizualizer.g:554:2: ( ( rule__System__SourcesAssignment_1 ) )
                    {
                    // InternalVizualizer.g:554:2: ( ( rule__System__SourcesAssignment_1 ) )
                    // InternalVizualizer.g:555:3: ( rule__System__SourcesAssignment_1 )
                    {
                     before(grammarAccess.getSystemAccess().getSourcesAssignment_1()); 
                    // InternalVizualizer.g:556:3: ( rule__System__SourcesAssignment_1 )
                    // InternalVizualizer.g:556:4: rule__System__SourcesAssignment_1
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
                    // InternalVizualizer.g:560:2: ( ( rule__System__SchemasAssignment_2 ) )
                    {
                    // InternalVizualizer.g:560:2: ( ( rule__System__SchemasAssignment_2 ) )
                    // InternalVizualizer.g:561:3: ( rule__System__SchemasAssignment_2 )
                    {
                     before(grammarAccess.getSystemAccess().getSchemasAssignment_2()); 
                    // InternalVizualizer.g:562:3: ( rule__System__SchemasAssignment_2 )
                    // InternalVizualizer.g:562:4: rule__System__SchemasAssignment_2
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
    // InternalVizualizer.g:570:1: rule__Tile__Alternatives : ( ( ruleLink ) | ( ruleGraph ) );
    public final void rule__Tile__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:574:1: ( ( ruleLink ) | ( ruleGraph ) )
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
                    // InternalVizualizer.g:575:2: ( ruleLink )
                    {
                    // InternalVizualizer.g:575:2: ( ruleLink )
                    // InternalVizualizer.g:576:3: ruleLink
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
                    // InternalVizualizer.g:581:2: ( ruleGraph )
                    {
                    // InternalVizualizer.g:581:2: ( ruleGraph )
                    // InternalVizualizer.g:582:3: ruleGraph
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
    // InternalVizualizer.g:591:1: rule__Source__Alternatives : ( ( ruleURI ) | ( ruleDatasource ) );
    public final void rule__Source__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:595:1: ( ( ruleURI ) | ( ruleDatasource ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
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
                    // InternalVizualizer.g:596:2: ( ruleURI )
                    {
                    // InternalVizualizer.g:596:2: ( ruleURI )
                    // InternalVizualizer.g:597:3: ruleURI
                    {
                     before(grammarAccess.getSourceAccess().getURIParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleURI();

                    state._fsp--;

                     after(grammarAccess.getSourceAccess().getURIParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:602:2: ( ruleDatasource )
                    {
                    // InternalVizualizer.g:602:2: ( ruleDatasource )
                    // InternalVizualizer.g:603:3: ruleDatasource
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


    // $ANTLR start "rule__Op1__Alternatives"
    // InternalVizualizer.g:612:1: rule__Op1__Alternatives : ( ( '+' ) | ( '-' ) );
    public final void rule__Op1__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:616:1: ( ( '+' ) | ( '-' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalVizualizer.g:617:2: ( '+' )
                    {
                    // InternalVizualizer.g:617:2: ( '+' )
                    // InternalVizualizer.g:618:3: '+'
                    {
                     before(grammarAccess.getOp1Access().getPlusSignKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getOp1Access().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:623:2: ( '-' )
                    {
                    // InternalVizualizer.g:623:2: ( '-' )
                    // InternalVizualizer.g:624:3: '-'
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
    // InternalVizualizer.g:633:1: rule__Op2__Alternatives : ( ( '*' ) | ( '/' ) );
    public final void rule__Op2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:637:1: ( ( '*' ) | ( '/' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalVizualizer.g:638:2: ( '*' )
                    {
                    // InternalVizualizer.g:638:2: ( '*' )
                    // InternalVizualizer.g:639:3: '*'
                    {
                     before(grammarAccess.getOp2Access().getAsteriskKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getOp2Access().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:644:2: ( '/' )
                    {
                    // InternalVizualizer.g:644:2: ( '/' )
                    // InternalVizualizer.g:645:3: '/'
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
    // InternalVizualizer.g:654:1: rule__Primitive__Alternatives : ( ( ruleNumber ) | ( ruleVariable ) | ( ( rule__Primitive__Group_2__0 ) ) );
    public final void rule__Primitive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:658:1: ( ( ruleNumber ) | ( ruleVariable ) | ( ( rule__Primitive__Group_2__0 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
                {
                alt7=2;
                }
                break;
            case 36:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalVizualizer.g:659:2: ( ruleNumber )
                    {
                    // InternalVizualizer.g:659:2: ( ruleNumber )
                    // InternalVizualizer.g:660:3: ruleNumber
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
                    // InternalVizualizer.g:665:2: ( ruleVariable )
                    {
                    // InternalVizualizer.g:665:2: ( ruleVariable )
                    // InternalVizualizer.g:666:3: ruleVariable
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
                    // InternalVizualizer.g:671:2: ( ( rule__Primitive__Group_2__0 ) )
                    {
                    // InternalVizualizer.g:671:2: ( ( rule__Primitive__Group_2__0 ) )
                    // InternalVizualizer.g:672:3: ( rule__Primitive__Group_2__0 )
                    {
                     before(grammarAccess.getPrimitiveAccess().getGroup_2()); 
                    // InternalVizualizer.g:673:3: ( rule__Primitive__Group_2__0 )
                    // InternalVizualizer.g:673:4: rule__Primitive__Group_2__0
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
    // InternalVizualizer.g:681:1: rule__SchemaType__Alternatives : ( ( ( 'XML' ) ) | ( ( 'CSV' ) ) | ( ( 'JSON' ) ) );
    public final void rule__SchemaType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:685:1: ( ( ( 'XML' ) ) | ( ( 'CSV' ) ) | ( ( 'JSON' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt8=1;
                }
                break;
            case 16:
                {
                alt8=2;
                }
                break;
            case 17:
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
                    // InternalVizualizer.g:686:2: ( ( 'XML' ) )
                    {
                    // InternalVizualizer.g:686:2: ( ( 'XML' ) )
                    // InternalVizualizer.g:687:3: ( 'XML' )
                    {
                     before(grammarAccess.getSchemaTypeAccess().getXMLEnumLiteralDeclaration_0()); 
                    // InternalVizualizer.g:688:3: ( 'XML' )
                    // InternalVizualizer.g:688:4: 'XML'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getSchemaTypeAccess().getXMLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:692:2: ( ( 'CSV' ) )
                    {
                    // InternalVizualizer.g:692:2: ( ( 'CSV' ) )
                    // InternalVizualizer.g:693:3: ( 'CSV' )
                    {
                     before(grammarAccess.getSchemaTypeAccess().getCSVEnumLiteralDeclaration_1()); 
                    // InternalVizualizer.g:694:3: ( 'CSV' )
                    // InternalVizualizer.g:694:4: 'CSV'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getSchemaTypeAccess().getCSVEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVizualizer.g:698:2: ( ( 'JSON' ) )
                    {
                    // InternalVizualizer.g:698:2: ( ( 'JSON' ) )
                    // InternalVizualizer.g:699:3: ( 'JSON' )
                    {
                     before(grammarAccess.getSchemaTypeAccess().getJSONEnumLiteralDeclaration_2()); 
                    // InternalVizualizer.g:700:3: ( 'JSON' )
                    // InternalVizualizer.g:700:4: 'JSON'
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
    // InternalVizualizer.g:708:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:712:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // InternalVizualizer.g:713:2: rule__Page__Group__0__Impl rule__Page__Group__1
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
    // InternalVizualizer.g:720:1: rule__Page__Group__0__Impl : ( 'Page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:724:1: ( ( 'Page' ) )
            // InternalVizualizer.g:725:1: ( 'Page' )
            {
            // InternalVizualizer.g:725:1: ( 'Page' )
            // InternalVizualizer.g:726:2: 'Page'
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
    // InternalVizualizer.g:735:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:739:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // InternalVizualizer.g:740:2: rule__Page__Group__1__Impl rule__Page__Group__2
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
    // InternalVizualizer.g:747:1: rule__Page__Group__1__Impl : ( ( rule__Page__NameAssignment_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:751:1: ( ( ( rule__Page__NameAssignment_1 ) ) )
            // InternalVizualizer.g:752:1: ( ( rule__Page__NameAssignment_1 ) )
            {
            // InternalVizualizer.g:752:1: ( ( rule__Page__NameAssignment_1 ) )
            // InternalVizualizer.g:753:2: ( rule__Page__NameAssignment_1 )
            {
             before(grammarAccess.getPageAccess().getNameAssignment_1()); 
            // InternalVizualizer.g:754:2: ( rule__Page__NameAssignment_1 )
            // InternalVizualizer.g:754:3: rule__Page__NameAssignment_1
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
    // InternalVizualizer.g:762:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:766:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // InternalVizualizer.g:767:2: rule__Page__Group__2__Impl rule__Page__Group__3
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
    // InternalVizualizer.g:774:1: rule__Page__Group__2__Impl : ( '{' ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:778:1: ( ( '{' ) )
            // InternalVizualizer.g:779:1: ( '{' )
            {
            // InternalVizualizer.g:779:1: ( '{' )
            // InternalVizualizer.g:780:2: '{'
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
    // InternalVizualizer.g:789:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:793:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // InternalVizualizer.g:794:2: rule__Page__Group__3__Impl rule__Page__Group__4
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
    // InternalVizualizer.g:801:1: rule__Page__Group__3__Impl : ( ( rule__Page__TilesAssignment_3 )* ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:805:1: ( ( ( rule__Page__TilesAssignment_3 )* ) )
            // InternalVizualizer.g:806:1: ( ( rule__Page__TilesAssignment_3 )* )
            {
            // InternalVizualizer.g:806:1: ( ( rule__Page__TilesAssignment_3 )* )
            // InternalVizualizer.g:807:2: ( rule__Page__TilesAssignment_3 )*
            {
             before(grammarAccess.getPageAccess().getTilesAssignment_3()); 
            // InternalVizualizer.g:808:2: ( rule__Page__TilesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21||LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalVizualizer.g:808:3: rule__Page__TilesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Page__TilesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalVizualizer.g:816:1: rule__Page__Group__4 : rule__Page__Group__4__Impl ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:820:1: ( rule__Page__Group__4__Impl )
            // InternalVizualizer.g:821:2: rule__Page__Group__4__Impl
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
    // InternalVizualizer.g:827:1: rule__Page__Group__4__Impl : ( '}' ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:831:1: ( ( '}' ) )
            // InternalVizualizer.g:832:1: ( '}' )
            {
            // InternalVizualizer.g:832:1: ( '}' )
            // InternalVizualizer.g:833:2: '}'
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
    // InternalVizualizer.g:843:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:847:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalVizualizer.g:848:2: rule__Link__Group__0__Impl rule__Link__Group__1
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
    // InternalVizualizer.g:855:1: rule__Link__Group__0__Impl : ( 'Link' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:859:1: ( ( 'Link' ) )
            // InternalVizualizer.g:860:1: ( 'Link' )
            {
            // InternalVizualizer.g:860:1: ( 'Link' )
            // InternalVizualizer.g:861:2: 'Link'
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
    // InternalVizualizer.g:870:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:874:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalVizualizer.g:875:2: rule__Link__Group__1__Impl rule__Link__Group__2
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
    // InternalVizualizer.g:882:1: rule__Link__Group__1__Impl : ( ( rule__Link__NameAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:886:1: ( ( ( rule__Link__NameAssignment_1 ) ) )
            // InternalVizualizer.g:887:1: ( ( rule__Link__NameAssignment_1 ) )
            {
            // InternalVizualizer.g:887:1: ( ( rule__Link__NameAssignment_1 ) )
            // InternalVizualizer.g:888:2: ( rule__Link__NameAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_1()); 
            // InternalVizualizer.g:889:2: ( rule__Link__NameAssignment_1 )
            // InternalVizualizer.g:889:3: rule__Link__NameAssignment_1
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
    // InternalVizualizer.g:897:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:901:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalVizualizer.g:902:2: rule__Link__Group__2__Impl rule__Link__Group__3
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
    // InternalVizualizer.g:909:1: rule__Link__Group__2__Impl : ( 'to' ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:913:1: ( ( 'to' ) )
            // InternalVizualizer.g:914:1: ( 'to' )
            {
            // InternalVizualizer.g:914:1: ( 'to' )
            // InternalVizualizer.g:915:2: 'to'
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
    // InternalVizualizer.g:924:1: rule__Link__Group__3 : rule__Link__Group__3__Impl ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:928:1: ( rule__Link__Group__3__Impl )
            // InternalVizualizer.g:929:2: rule__Link__Group__3__Impl
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
    // InternalVizualizer.g:935:1: rule__Link__Group__3__Impl : ( ( rule__Link__PageAssignment_3 ) ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:939:1: ( ( ( rule__Link__PageAssignment_3 ) ) )
            // InternalVizualizer.g:940:1: ( ( rule__Link__PageAssignment_3 ) )
            {
            // InternalVizualizer.g:940:1: ( ( rule__Link__PageAssignment_3 ) )
            // InternalVizualizer.g:941:2: ( rule__Link__PageAssignment_3 )
            {
             before(grammarAccess.getLinkAccess().getPageAssignment_3()); 
            // InternalVizualizer.g:942:2: ( rule__Link__PageAssignment_3 )
            // InternalVizualizer.g:942:3: rule__Link__PageAssignment_3
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
    // InternalVizualizer.g:951:1: rule__Graph__Group__0 : rule__Graph__Group__0__Impl rule__Graph__Group__1 ;
    public final void rule__Graph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:955:1: ( rule__Graph__Group__0__Impl rule__Graph__Group__1 )
            // InternalVizualizer.g:956:2: rule__Graph__Group__0__Impl rule__Graph__Group__1
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
    // InternalVizualizer.g:963:1: rule__Graph__Group__0__Impl : ( 'Graph' ) ;
    public final void rule__Graph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:967:1: ( ( 'Graph' ) )
            // InternalVizualizer.g:968:1: ( 'Graph' )
            {
            // InternalVizualizer.g:968:1: ( 'Graph' )
            // InternalVizualizer.g:969:2: 'Graph'
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
    // InternalVizualizer.g:978:1: rule__Graph__Group__1 : rule__Graph__Group__1__Impl rule__Graph__Group__2 ;
    public final void rule__Graph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:982:1: ( rule__Graph__Group__1__Impl rule__Graph__Group__2 )
            // InternalVizualizer.g:983:2: rule__Graph__Group__1__Impl rule__Graph__Group__2
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
    // InternalVizualizer.g:990:1: rule__Graph__Group__1__Impl : ( ( rule__Graph__NameAssignment_1 ) ) ;
    public final void rule__Graph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:994:1: ( ( ( rule__Graph__NameAssignment_1 ) ) )
            // InternalVizualizer.g:995:1: ( ( rule__Graph__NameAssignment_1 ) )
            {
            // InternalVizualizer.g:995:1: ( ( rule__Graph__NameAssignment_1 ) )
            // InternalVizualizer.g:996:2: ( rule__Graph__NameAssignment_1 )
            {
             before(grammarAccess.getGraphAccess().getNameAssignment_1()); 
            // InternalVizualizer.g:997:2: ( rule__Graph__NameAssignment_1 )
            // InternalVizualizer.g:997:3: rule__Graph__NameAssignment_1
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
    // InternalVizualizer.g:1005:1: rule__Graph__Group__2 : rule__Graph__Group__2__Impl ;
    public final void rule__Graph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1009:1: ( rule__Graph__Group__2__Impl )
            // InternalVizualizer.g:1010:2: rule__Graph__Group__2__Impl
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
    // InternalVizualizer.g:1016:1: rule__Graph__Group__2__Impl : ( ( rule__Graph__SourceAssignment_2 ) ) ;
    public final void rule__Graph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1020:1: ( ( ( rule__Graph__SourceAssignment_2 ) ) )
            // InternalVizualizer.g:1021:1: ( ( rule__Graph__SourceAssignment_2 ) )
            {
            // InternalVizualizer.g:1021:1: ( ( rule__Graph__SourceAssignment_2 ) )
            // InternalVizualizer.g:1022:2: ( rule__Graph__SourceAssignment_2 )
            {
             before(grammarAccess.getGraphAccess().getSourceAssignment_2()); 
            // InternalVizualizer.g:1023:2: ( rule__Graph__SourceAssignment_2 )
            // InternalVizualizer.g:1023:3: rule__Graph__SourceAssignment_2
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
    // InternalVizualizer.g:1032:1: rule__Datasource__Group__0 : rule__Datasource__Group__0__Impl rule__Datasource__Group__1 ;
    public final void rule__Datasource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1036:1: ( rule__Datasource__Group__0__Impl rule__Datasource__Group__1 )
            // InternalVizualizer.g:1037:2: rule__Datasource__Group__0__Impl rule__Datasource__Group__1
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
    // InternalVizualizer.g:1044:1: rule__Datasource__Group__0__Impl : ( 'Datasource' ) ;
    public final void rule__Datasource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1048:1: ( ( 'Datasource' ) )
            // InternalVizualizer.g:1049:1: ( 'Datasource' )
            {
            // InternalVizualizer.g:1049:1: ( 'Datasource' )
            // InternalVizualizer.g:1050:2: 'Datasource'
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
    // InternalVizualizer.g:1059:1: rule__Datasource__Group__1 : rule__Datasource__Group__1__Impl rule__Datasource__Group__2 ;
    public final void rule__Datasource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1063:1: ( rule__Datasource__Group__1__Impl rule__Datasource__Group__2 )
            // InternalVizualizer.g:1064:2: rule__Datasource__Group__1__Impl rule__Datasource__Group__2
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
    // InternalVizualizer.g:1071:1: rule__Datasource__Group__1__Impl : ( ( rule__Datasource__NameAssignment_1 ) ) ;
    public final void rule__Datasource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1075:1: ( ( ( rule__Datasource__NameAssignment_1 ) ) )
            // InternalVizualizer.g:1076:1: ( ( rule__Datasource__NameAssignment_1 ) )
            {
            // InternalVizualizer.g:1076:1: ( ( rule__Datasource__NameAssignment_1 ) )
            // InternalVizualizer.g:1077:2: ( rule__Datasource__NameAssignment_1 )
            {
             before(grammarAccess.getDatasourceAccess().getNameAssignment_1()); 
            // InternalVizualizer.g:1078:2: ( rule__Datasource__NameAssignment_1 )
            // InternalVizualizer.g:1078:3: rule__Datasource__NameAssignment_1
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
    // InternalVizualizer.g:1086:1: rule__Datasource__Group__2 : rule__Datasource__Group__2__Impl rule__Datasource__Group__3 ;
    public final void rule__Datasource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1090:1: ( rule__Datasource__Group__2__Impl rule__Datasource__Group__3 )
            // InternalVizualizer.g:1091:2: rule__Datasource__Group__2__Impl rule__Datasource__Group__3
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
    // InternalVizualizer.g:1098:1: rule__Datasource__Group__2__Impl : ( '{' ) ;
    public final void rule__Datasource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1102:1: ( ( '{' ) )
            // InternalVizualizer.g:1103:1: ( '{' )
            {
            // InternalVizualizer.g:1103:1: ( '{' )
            // InternalVizualizer.g:1104:2: '{'
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
    // InternalVizualizer.g:1113:1: rule__Datasource__Group__3 : rule__Datasource__Group__3__Impl rule__Datasource__Group__4 ;
    public final void rule__Datasource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1117:1: ( rule__Datasource__Group__3__Impl rule__Datasource__Group__4 )
            // InternalVizualizer.g:1118:2: rule__Datasource__Group__3__Impl rule__Datasource__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalVizualizer.g:1125:1: rule__Datasource__Group__3__Impl : ( 'Source' ) ;
    public final void rule__Datasource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1129:1: ( ( 'Source' ) )
            // InternalVizualizer.g:1130:1: ( 'Source' )
            {
            // InternalVizualizer.g:1130:1: ( 'Source' )
            // InternalVizualizer.g:1131:2: 'Source'
            {
             before(grammarAccess.getDatasourceAccess().getSourceKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDatasourceAccess().getSourceKeyword_3()); 

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
    // InternalVizualizer.g:1140:1: rule__Datasource__Group__4 : rule__Datasource__Group__4__Impl rule__Datasource__Group__5 ;
    public final void rule__Datasource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1144:1: ( rule__Datasource__Group__4__Impl rule__Datasource__Group__5 )
            // InternalVizualizer.g:1145:2: rule__Datasource__Group__4__Impl rule__Datasource__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalVizualizer.g:1152:1: rule__Datasource__Group__4__Impl : ( ( rule__Datasource__SourceAssignment_4 ) ) ;
    public final void rule__Datasource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1156:1: ( ( ( rule__Datasource__SourceAssignment_4 ) ) )
            // InternalVizualizer.g:1157:1: ( ( rule__Datasource__SourceAssignment_4 ) )
            {
            // InternalVizualizer.g:1157:1: ( ( rule__Datasource__SourceAssignment_4 ) )
            // InternalVizualizer.g:1158:2: ( rule__Datasource__SourceAssignment_4 )
            {
             before(grammarAccess.getDatasourceAccess().getSourceAssignment_4()); 
            // InternalVizualizer.g:1159:2: ( rule__Datasource__SourceAssignment_4 )
            // InternalVizualizer.g:1159:3: rule__Datasource__SourceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Datasource__SourceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDatasourceAccess().getSourceAssignment_4()); 

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
    // InternalVizualizer.g:1167:1: rule__Datasource__Group__5 : rule__Datasource__Group__5__Impl rule__Datasource__Group__6 ;
    public final void rule__Datasource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1171:1: ( rule__Datasource__Group__5__Impl rule__Datasource__Group__6 )
            // InternalVizualizer.g:1172:2: rule__Datasource__Group__5__Impl rule__Datasource__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalVizualizer.g:1179:1: rule__Datasource__Group__5__Impl : ( ( ( rule__Datasource__DimensionsAssignment_5 ) ) ( ( rule__Datasource__DimensionsAssignment_5 )* ) ) ;
    public final void rule__Datasource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1183:1: ( ( ( ( rule__Datasource__DimensionsAssignment_5 ) ) ( ( rule__Datasource__DimensionsAssignment_5 )* ) ) )
            // InternalVizualizer.g:1184:1: ( ( ( rule__Datasource__DimensionsAssignment_5 ) ) ( ( rule__Datasource__DimensionsAssignment_5 )* ) )
            {
            // InternalVizualizer.g:1184:1: ( ( ( rule__Datasource__DimensionsAssignment_5 ) ) ( ( rule__Datasource__DimensionsAssignment_5 )* ) )
            // InternalVizualizer.g:1185:2: ( ( rule__Datasource__DimensionsAssignment_5 ) ) ( ( rule__Datasource__DimensionsAssignment_5 )* )
            {
            // InternalVizualizer.g:1185:2: ( ( rule__Datasource__DimensionsAssignment_5 ) )
            // InternalVizualizer.g:1186:3: ( rule__Datasource__DimensionsAssignment_5 )
            {
             before(grammarAccess.getDatasourceAccess().getDimensionsAssignment_5()); 
            // InternalVizualizer.g:1187:3: ( rule__Datasource__DimensionsAssignment_5 )
            // InternalVizualizer.g:1187:4: rule__Datasource__DimensionsAssignment_5
            {
            pushFollow(FOLLOW_12);
            rule__Datasource__DimensionsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDatasourceAccess().getDimensionsAssignment_5()); 

            }

            // InternalVizualizer.g:1190:2: ( ( rule__Datasource__DimensionsAssignment_5 )* )
            // InternalVizualizer.g:1191:3: ( rule__Datasource__DimensionsAssignment_5 )*
            {
             before(grammarAccess.getDatasourceAccess().getDimensionsAssignment_5()); 
            // InternalVizualizer.g:1192:3: ( rule__Datasource__DimensionsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalVizualizer.g:1192:4: rule__Datasource__DimensionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Datasource__DimensionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getDatasourceAccess().getDimensionsAssignment_5()); 

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
    // $ANTLR end "rule__Datasource__Group__5__Impl"


    // $ANTLR start "rule__Datasource__Group__6"
    // InternalVizualizer.g:1201:1: rule__Datasource__Group__6 : rule__Datasource__Group__6__Impl ;
    public final void rule__Datasource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1205:1: ( rule__Datasource__Group__6__Impl )
            // InternalVizualizer.g:1206:2: rule__Datasource__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Datasource__Group__6__Impl();

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
    // InternalVizualizer.g:1212:1: rule__Datasource__Group__6__Impl : ( '}' ) ;
    public final void rule__Datasource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1216:1: ( ( '}' ) )
            // InternalVizualizer.g:1217:1: ( '}' )
            {
            // InternalVizualizer.g:1217:1: ( '}' )
            // InternalVizualizer.g:1218:2: '}'
            {
             before(grammarAccess.getDatasourceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDatasourceAccess().getRightCurlyBracketKeyword_6()); 

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


    // $ANTLR start "rule__DimensionalData__Group__0"
    // InternalVizualizer.g:1228:1: rule__DimensionalData__Group__0 : rule__DimensionalData__Group__0__Impl rule__DimensionalData__Group__1 ;
    public final void rule__DimensionalData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1232:1: ( rule__DimensionalData__Group__0__Impl rule__DimensionalData__Group__1 )
            // InternalVizualizer.g:1233:2: rule__DimensionalData__Group__0__Impl rule__DimensionalData__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DimensionalData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DimensionalData__Group__1();

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
    // $ANTLR end "rule__DimensionalData__Group__0"


    // $ANTLR start "rule__DimensionalData__Group__0__Impl"
    // InternalVizualizer.g:1240:1: rule__DimensionalData__Group__0__Impl : ( 'Dimension' ) ;
    public final void rule__DimensionalData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1244:1: ( ( 'Dimension' ) )
            // InternalVizualizer.g:1245:1: ( 'Dimension' )
            {
            // InternalVizualizer.g:1245:1: ( 'Dimension' )
            // InternalVizualizer.g:1246:2: 'Dimension'
            {
             before(grammarAccess.getDimensionalDataAccess().getDimensionKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDimensionalDataAccess().getDimensionKeyword_0()); 

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
    // $ANTLR end "rule__DimensionalData__Group__0__Impl"


    // $ANTLR start "rule__DimensionalData__Group__1"
    // InternalVizualizer.g:1255:1: rule__DimensionalData__Group__1 : rule__DimensionalData__Group__1__Impl rule__DimensionalData__Group__2 ;
    public final void rule__DimensionalData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1259:1: ( rule__DimensionalData__Group__1__Impl rule__DimensionalData__Group__2 )
            // InternalVizualizer.g:1260:2: rule__DimensionalData__Group__1__Impl rule__DimensionalData__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__DimensionalData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DimensionalData__Group__2();

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
    // $ANTLR end "rule__DimensionalData__Group__1"


    // $ANTLR start "rule__DimensionalData__Group__1__Impl"
    // InternalVizualizer.g:1267:1: rule__DimensionalData__Group__1__Impl : ( ( rule__DimensionalData__DimAssignment_1 ) ) ;
    public final void rule__DimensionalData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1271:1: ( ( ( rule__DimensionalData__DimAssignment_1 ) ) )
            // InternalVizualizer.g:1272:1: ( ( rule__DimensionalData__DimAssignment_1 ) )
            {
            // InternalVizualizer.g:1272:1: ( ( rule__DimensionalData__DimAssignment_1 ) )
            // InternalVizualizer.g:1273:2: ( rule__DimensionalData__DimAssignment_1 )
            {
             before(grammarAccess.getDimensionalDataAccess().getDimAssignment_1()); 
            // InternalVizualizer.g:1274:2: ( rule__DimensionalData__DimAssignment_1 )
            // InternalVizualizer.g:1274:3: rule__DimensionalData__DimAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DimensionalData__DimAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDimensionalDataAccess().getDimAssignment_1()); 

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
    // $ANTLR end "rule__DimensionalData__Group__1__Impl"


    // $ANTLR start "rule__DimensionalData__Group__2"
    // InternalVizualizer.g:1282:1: rule__DimensionalData__Group__2 : rule__DimensionalData__Group__2__Impl rule__DimensionalData__Group__3 ;
    public final void rule__DimensionalData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1286:1: ( rule__DimensionalData__Group__2__Impl rule__DimensionalData__Group__3 )
            // InternalVizualizer.g:1287:2: rule__DimensionalData__Group__2__Impl rule__DimensionalData__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__DimensionalData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DimensionalData__Group__3();

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
    // $ANTLR end "rule__DimensionalData__Group__2"


    // $ANTLR start "rule__DimensionalData__Group__2__Impl"
    // InternalVizualizer.g:1294:1: rule__DimensionalData__Group__2__Impl : ( 'as' ) ;
    public final void rule__DimensionalData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1298:1: ( ( 'as' ) )
            // InternalVizualizer.g:1299:1: ( 'as' )
            {
            // InternalVizualizer.g:1299:1: ( 'as' )
            // InternalVizualizer.g:1300:2: 'as'
            {
             before(grammarAccess.getDimensionalDataAccess().getAsKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDimensionalDataAccess().getAsKeyword_2()); 

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
    // $ANTLR end "rule__DimensionalData__Group__2__Impl"


    // $ANTLR start "rule__DimensionalData__Group__3"
    // InternalVizualizer.g:1309:1: rule__DimensionalData__Group__3 : rule__DimensionalData__Group__3__Impl rule__DimensionalData__Group__4 ;
    public final void rule__DimensionalData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1313:1: ( rule__DimensionalData__Group__3__Impl rule__DimensionalData__Group__4 )
            // InternalVizualizer.g:1314:2: rule__DimensionalData__Group__3__Impl rule__DimensionalData__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__DimensionalData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DimensionalData__Group__4();

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
    // $ANTLR end "rule__DimensionalData__Group__3"


    // $ANTLR start "rule__DimensionalData__Group__3__Impl"
    // InternalVizualizer.g:1321:1: rule__DimensionalData__Group__3__Impl : ( 'Formula' ) ;
    public final void rule__DimensionalData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1325:1: ( ( 'Formula' ) )
            // InternalVizualizer.g:1326:1: ( 'Formula' )
            {
            // InternalVizualizer.g:1326:1: ( 'Formula' )
            // InternalVizualizer.g:1327:2: 'Formula'
            {
             before(grammarAccess.getDimensionalDataAccess().getFormulaKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDimensionalDataAccess().getFormulaKeyword_3()); 

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
    // $ANTLR end "rule__DimensionalData__Group__3__Impl"


    // $ANTLR start "rule__DimensionalData__Group__4"
    // InternalVizualizer.g:1336:1: rule__DimensionalData__Group__4 : rule__DimensionalData__Group__4__Impl ;
    public final void rule__DimensionalData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1340:1: ( rule__DimensionalData__Group__4__Impl )
            // InternalVizualizer.g:1341:2: rule__DimensionalData__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DimensionalData__Group__4__Impl();

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
    // $ANTLR end "rule__DimensionalData__Group__4"


    // $ANTLR start "rule__DimensionalData__Group__4__Impl"
    // InternalVizualizer.g:1347:1: rule__DimensionalData__Group__4__Impl : ( ( rule__DimensionalData__FormulaAssignment_4 ) ) ;
    public final void rule__DimensionalData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1351:1: ( ( ( rule__DimensionalData__FormulaAssignment_4 ) ) )
            // InternalVizualizer.g:1352:1: ( ( rule__DimensionalData__FormulaAssignment_4 ) )
            {
            // InternalVizualizer.g:1352:1: ( ( rule__DimensionalData__FormulaAssignment_4 ) )
            // InternalVizualizer.g:1353:2: ( rule__DimensionalData__FormulaAssignment_4 )
            {
             before(grammarAccess.getDimensionalDataAccess().getFormulaAssignment_4()); 
            // InternalVizualizer.g:1354:2: ( rule__DimensionalData__FormulaAssignment_4 )
            // InternalVizualizer.g:1354:3: rule__DimensionalData__FormulaAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DimensionalData__FormulaAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDimensionalDataAccess().getFormulaAssignment_4()); 

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
    // $ANTLR end "rule__DimensionalData__Group__4__Impl"


    // $ANTLR start "rule__URI__Group__0"
    // InternalVizualizer.g:1363:1: rule__URI__Group__0 : rule__URI__Group__0__Impl rule__URI__Group__1 ;
    public final void rule__URI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1367:1: ( rule__URI__Group__0__Impl rule__URI__Group__1 )
            // InternalVizualizer.g:1368:2: rule__URI__Group__0__Impl rule__URI__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__URI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__URI__Group__1();

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
    // $ANTLR end "rule__URI__Group__0"


    // $ANTLR start "rule__URI__Group__0__Impl"
    // InternalVizualizer.g:1375:1: rule__URI__Group__0__Impl : ( 'URI' ) ;
    public final void rule__URI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1379:1: ( ( 'URI' ) )
            // InternalVizualizer.g:1380:1: ( 'URI' )
            {
            // InternalVizualizer.g:1380:1: ( 'URI' )
            // InternalVizualizer.g:1381:2: 'URI'
            {
             before(grammarAccess.getURIAccess().getURIKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getURIAccess().getURIKeyword_0()); 

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
    // $ANTLR end "rule__URI__Group__0__Impl"


    // $ANTLR start "rule__URI__Group__1"
    // InternalVizualizer.g:1390:1: rule__URI__Group__1 : rule__URI__Group__1__Impl rule__URI__Group__2 ;
    public final void rule__URI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1394:1: ( rule__URI__Group__1__Impl rule__URI__Group__2 )
            // InternalVizualizer.g:1395:2: rule__URI__Group__1__Impl rule__URI__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__URI__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__URI__Group__2();

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
    // $ANTLR end "rule__URI__Group__1"


    // $ANTLR start "rule__URI__Group__1__Impl"
    // InternalVizualizer.g:1402:1: rule__URI__Group__1__Impl : ( ( rule__URI__NameAssignment_1 ) ) ;
    public final void rule__URI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1406:1: ( ( ( rule__URI__NameAssignment_1 ) ) )
            // InternalVizualizer.g:1407:1: ( ( rule__URI__NameAssignment_1 ) )
            {
            // InternalVizualizer.g:1407:1: ( ( rule__URI__NameAssignment_1 ) )
            // InternalVizualizer.g:1408:2: ( rule__URI__NameAssignment_1 )
            {
             before(grammarAccess.getURIAccess().getNameAssignment_1()); 
            // InternalVizualizer.g:1409:2: ( rule__URI__NameAssignment_1 )
            // InternalVizualizer.g:1409:3: rule__URI__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__URI__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getURIAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__URI__Group__1__Impl"


    // $ANTLR start "rule__URI__Group__2"
    // InternalVizualizer.g:1417:1: rule__URI__Group__2 : rule__URI__Group__2__Impl rule__URI__Group__3 ;
    public final void rule__URI__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1421:1: ( rule__URI__Group__2__Impl rule__URI__Group__3 )
            // InternalVizualizer.g:1422:2: rule__URI__Group__2__Impl rule__URI__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__URI__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__URI__Group__3();

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
    // $ANTLR end "rule__URI__Group__2"


    // $ANTLR start "rule__URI__Group__2__Impl"
    // InternalVizualizer.g:1429:1: rule__URI__Group__2__Impl : ( '{' ) ;
    public final void rule__URI__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1433:1: ( ( '{' ) )
            // InternalVizualizer.g:1434:1: ( '{' )
            {
            // InternalVizualizer.g:1434:1: ( '{' )
            // InternalVizualizer.g:1435:2: '{'
            {
             before(grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__URI__Group__2__Impl"


    // $ANTLR start "rule__URI__Group__3"
    // InternalVizualizer.g:1444:1: rule__URI__Group__3 : rule__URI__Group__3__Impl rule__URI__Group__4 ;
    public final void rule__URI__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1448:1: ( rule__URI__Group__3__Impl rule__URI__Group__4 )
            // InternalVizualizer.g:1449:2: rule__URI__Group__3__Impl rule__URI__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__URI__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__URI__Group__4();

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
    // $ANTLR end "rule__URI__Group__3"


    // $ANTLR start "rule__URI__Group__3__Impl"
    // InternalVizualizer.g:1456:1: rule__URI__Group__3__Impl : ( 'url' ) ;
    public final void rule__URI__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1460:1: ( ( 'url' ) )
            // InternalVizualizer.g:1461:1: ( 'url' )
            {
            // InternalVizualizer.g:1461:1: ( 'url' )
            // InternalVizualizer.g:1462:2: 'url'
            {
             before(grammarAccess.getURIAccess().getUrlKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getURIAccess().getUrlKeyword_3()); 

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
    // $ANTLR end "rule__URI__Group__3__Impl"


    // $ANTLR start "rule__URI__Group__4"
    // InternalVizualizer.g:1471:1: rule__URI__Group__4 : rule__URI__Group__4__Impl rule__URI__Group__5 ;
    public final void rule__URI__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1475:1: ( rule__URI__Group__4__Impl rule__URI__Group__5 )
            // InternalVizualizer.g:1476:2: rule__URI__Group__4__Impl rule__URI__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__URI__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__URI__Group__5();

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
    // $ANTLR end "rule__URI__Group__4"


    // $ANTLR start "rule__URI__Group__4__Impl"
    // InternalVizualizer.g:1483:1: rule__URI__Group__4__Impl : ( ( rule__URI__UriAssignment_4 ) ) ;
    public final void rule__URI__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1487:1: ( ( ( rule__URI__UriAssignment_4 ) ) )
            // InternalVizualizer.g:1488:1: ( ( rule__URI__UriAssignment_4 ) )
            {
            // InternalVizualizer.g:1488:1: ( ( rule__URI__UriAssignment_4 ) )
            // InternalVizualizer.g:1489:2: ( rule__URI__UriAssignment_4 )
            {
             before(grammarAccess.getURIAccess().getUriAssignment_4()); 
            // InternalVizualizer.g:1490:2: ( rule__URI__UriAssignment_4 )
            // InternalVizualizer.g:1490:3: rule__URI__UriAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__URI__UriAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getURIAccess().getUriAssignment_4()); 

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
    // $ANTLR end "rule__URI__Group__4__Impl"


    // $ANTLR start "rule__URI__Group__5"
    // InternalVizualizer.g:1498:1: rule__URI__Group__5 : rule__URI__Group__5__Impl rule__URI__Group__6 ;
    public final void rule__URI__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1502:1: ( rule__URI__Group__5__Impl rule__URI__Group__6 )
            // InternalVizualizer.g:1503:2: rule__URI__Group__5__Impl rule__URI__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__URI__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__URI__Group__6();

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
    // $ANTLR end "rule__URI__Group__5"


    // $ANTLR start "rule__URI__Group__5__Impl"
    // InternalVizualizer.g:1510:1: rule__URI__Group__5__Impl : ( 'use Schema' ) ;
    public final void rule__URI__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1514:1: ( ( 'use Schema' ) )
            // InternalVizualizer.g:1515:1: ( 'use Schema' )
            {
            // InternalVizualizer.g:1515:1: ( 'use Schema' )
            // InternalVizualizer.g:1516:2: 'use Schema'
            {
             before(grammarAccess.getURIAccess().getUseSchemaKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getURIAccess().getUseSchemaKeyword_5()); 

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
    // $ANTLR end "rule__URI__Group__5__Impl"


    // $ANTLR start "rule__URI__Group__6"
    // InternalVizualizer.g:1525:1: rule__URI__Group__6 : rule__URI__Group__6__Impl rule__URI__Group__7 ;
    public final void rule__URI__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1529:1: ( rule__URI__Group__6__Impl rule__URI__Group__7 )
            // InternalVizualizer.g:1530:2: rule__URI__Group__6__Impl rule__URI__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__URI__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__URI__Group__7();

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
    // $ANTLR end "rule__URI__Group__6"


    // $ANTLR start "rule__URI__Group__6__Impl"
    // InternalVizualizer.g:1537:1: rule__URI__Group__6__Impl : ( ( rule__URI__ParserAssignment_6 ) ) ;
    public final void rule__URI__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1541:1: ( ( ( rule__URI__ParserAssignment_6 ) ) )
            // InternalVizualizer.g:1542:1: ( ( rule__URI__ParserAssignment_6 ) )
            {
            // InternalVizualizer.g:1542:1: ( ( rule__URI__ParserAssignment_6 ) )
            // InternalVizualizer.g:1543:2: ( rule__URI__ParserAssignment_6 )
            {
             before(grammarAccess.getURIAccess().getParserAssignment_6()); 
            // InternalVizualizer.g:1544:2: ( rule__URI__ParserAssignment_6 )
            // InternalVizualizer.g:1544:3: rule__URI__ParserAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__URI__ParserAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getURIAccess().getParserAssignment_6()); 

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
    // $ANTLR end "rule__URI__Group__6__Impl"


    // $ANTLR start "rule__URI__Group__7"
    // InternalVizualizer.g:1552:1: rule__URI__Group__7 : rule__URI__Group__7__Impl ;
    public final void rule__URI__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1556:1: ( rule__URI__Group__7__Impl )
            // InternalVizualizer.g:1557:2: rule__URI__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__URI__Group__7__Impl();

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
    // $ANTLR end "rule__URI__Group__7"


    // $ANTLR start "rule__URI__Group__7__Impl"
    // InternalVizualizer.g:1563:1: rule__URI__Group__7__Impl : ( '}' ) ;
    public final void rule__URI__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1567:1: ( ( '}' ) )
            // InternalVizualizer.g:1568:1: ( '}' )
            {
            // InternalVizualizer.g:1568:1: ( '}' )
            // InternalVizualizer.g:1569:2: '}'
            {
             before(grammarAccess.getURIAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getURIAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__URI__Group__7__Impl"


    // $ANTLR start "rule__SchemaParser__Group__0"
    // InternalVizualizer.g:1579:1: rule__SchemaParser__Group__0 : rule__SchemaParser__Group__0__Impl rule__SchemaParser__Group__1 ;
    public final void rule__SchemaParser__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1583:1: ( rule__SchemaParser__Group__0__Impl rule__SchemaParser__Group__1 )
            // InternalVizualizer.g:1584:2: rule__SchemaParser__Group__0__Impl rule__SchemaParser__Group__1
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
    // InternalVizualizer.g:1591:1: rule__SchemaParser__Group__0__Impl : ( 'Schema' ) ;
    public final void rule__SchemaParser__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1595:1: ( ( 'Schema' ) )
            // InternalVizualizer.g:1596:1: ( 'Schema' )
            {
            // InternalVizualizer.g:1596:1: ( 'Schema' )
            // InternalVizualizer.g:1597:2: 'Schema'
            {
             before(grammarAccess.getSchemaParserAccess().getSchemaKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalVizualizer.g:1606:1: rule__SchemaParser__Group__1 : rule__SchemaParser__Group__1__Impl rule__SchemaParser__Group__2 ;
    public final void rule__SchemaParser__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1610:1: ( rule__SchemaParser__Group__1__Impl rule__SchemaParser__Group__2 )
            // InternalVizualizer.g:1611:2: rule__SchemaParser__Group__1__Impl rule__SchemaParser__Group__2
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
    // InternalVizualizer.g:1618:1: rule__SchemaParser__Group__1__Impl : ( ( rule__SchemaParser__NameAssignment_1 ) ) ;
    public final void rule__SchemaParser__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1622:1: ( ( ( rule__SchemaParser__NameAssignment_1 ) ) )
            // InternalVizualizer.g:1623:1: ( ( rule__SchemaParser__NameAssignment_1 ) )
            {
            // InternalVizualizer.g:1623:1: ( ( rule__SchemaParser__NameAssignment_1 ) )
            // InternalVizualizer.g:1624:2: ( rule__SchemaParser__NameAssignment_1 )
            {
             before(grammarAccess.getSchemaParserAccess().getNameAssignment_1()); 
            // InternalVizualizer.g:1625:2: ( rule__SchemaParser__NameAssignment_1 )
            // InternalVizualizer.g:1625:3: rule__SchemaParser__NameAssignment_1
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
    // InternalVizualizer.g:1633:1: rule__SchemaParser__Group__2 : rule__SchemaParser__Group__2__Impl rule__SchemaParser__Group__3 ;
    public final void rule__SchemaParser__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1637:1: ( rule__SchemaParser__Group__2__Impl rule__SchemaParser__Group__3 )
            // InternalVizualizer.g:1638:2: rule__SchemaParser__Group__2__Impl rule__SchemaParser__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalVizualizer.g:1645:1: rule__SchemaParser__Group__2__Impl : ( '{' ) ;
    public final void rule__SchemaParser__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1649:1: ( ( '{' ) )
            // InternalVizualizer.g:1650:1: ( '{' )
            {
            // InternalVizualizer.g:1650:1: ( '{' )
            // InternalVizualizer.g:1651:2: '{'
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
    // InternalVizualizer.g:1660:1: rule__SchemaParser__Group__3 : rule__SchemaParser__Group__3__Impl rule__SchemaParser__Group__4 ;
    public final void rule__SchemaParser__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1664:1: ( rule__SchemaParser__Group__3__Impl rule__SchemaParser__Group__4 )
            // InternalVizualizer.g:1665:2: rule__SchemaParser__Group__3__Impl rule__SchemaParser__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalVizualizer.g:1672:1: rule__SchemaParser__Group__3__Impl : ( 'SchemaType = ' ) ;
    public final void rule__SchemaParser__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1676:1: ( ( 'SchemaType = ' ) )
            // InternalVizualizer.g:1677:1: ( 'SchemaType = ' )
            {
            // InternalVizualizer.g:1677:1: ( 'SchemaType = ' )
            // InternalVizualizer.g:1678:2: 'SchemaType = '
            {
             before(grammarAccess.getSchemaParserAccess().getSchemaTypeKeyword_3()); 
            match(input,33,FOLLOW_2); 
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
    // InternalVizualizer.g:1687:1: rule__SchemaParser__Group__4 : rule__SchemaParser__Group__4__Impl rule__SchemaParser__Group__5 ;
    public final void rule__SchemaParser__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1691:1: ( rule__SchemaParser__Group__4__Impl rule__SchemaParser__Group__5 )
            // InternalVizualizer.g:1692:2: rule__SchemaParser__Group__4__Impl rule__SchemaParser__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalVizualizer.g:1699:1: rule__SchemaParser__Group__4__Impl : ( ( rule__SchemaParser__SchemaTypeAssignment_4 ) ) ;
    public final void rule__SchemaParser__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1703:1: ( ( ( rule__SchemaParser__SchemaTypeAssignment_4 ) ) )
            // InternalVizualizer.g:1704:1: ( ( rule__SchemaParser__SchemaTypeAssignment_4 ) )
            {
            // InternalVizualizer.g:1704:1: ( ( rule__SchemaParser__SchemaTypeAssignment_4 ) )
            // InternalVizualizer.g:1705:2: ( rule__SchemaParser__SchemaTypeAssignment_4 )
            {
             before(grammarAccess.getSchemaParserAccess().getSchemaTypeAssignment_4()); 
            // InternalVizualizer.g:1706:2: ( rule__SchemaParser__SchemaTypeAssignment_4 )
            // InternalVizualizer.g:1706:3: rule__SchemaParser__SchemaTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SchemaParser__SchemaTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSchemaParserAccess().getSchemaTypeAssignment_4()); 

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
    // InternalVizualizer.g:1714:1: rule__SchemaParser__Group__5 : rule__SchemaParser__Group__5__Impl rule__SchemaParser__Group__6 ;
    public final void rule__SchemaParser__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1718:1: ( rule__SchemaParser__Group__5__Impl rule__SchemaParser__Group__6 )
            // InternalVizualizer.g:1719:2: rule__SchemaParser__Group__5__Impl rule__SchemaParser__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalVizualizer.g:1726:1: rule__SchemaParser__Group__5__Impl : ( ( ( rule__SchemaParser__SelectorsAssignment_5 ) ) ( ( rule__SchemaParser__SelectorsAssignment_5 )* ) ) ;
    public final void rule__SchemaParser__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1730:1: ( ( ( ( rule__SchemaParser__SelectorsAssignment_5 ) ) ( ( rule__SchemaParser__SelectorsAssignment_5 )* ) ) )
            // InternalVizualizer.g:1731:1: ( ( ( rule__SchemaParser__SelectorsAssignment_5 ) ) ( ( rule__SchemaParser__SelectorsAssignment_5 )* ) )
            {
            // InternalVizualizer.g:1731:1: ( ( ( rule__SchemaParser__SelectorsAssignment_5 ) ) ( ( rule__SchemaParser__SelectorsAssignment_5 )* ) )
            // InternalVizualizer.g:1732:2: ( ( rule__SchemaParser__SelectorsAssignment_5 ) ) ( ( rule__SchemaParser__SelectorsAssignment_5 )* )
            {
            // InternalVizualizer.g:1732:2: ( ( rule__SchemaParser__SelectorsAssignment_5 ) )
            // InternalVizualizer.g:1733:3: ( rule__SchemaParser__SelectorsAssignment_5 )
            {
             before(grammarAccess.getSchemaParserAccess().getSelectorsAssignment_5()); 
            // InternalVizualizer.g:1734:3: ( rule__SchemaParser__SelectorsAssignment_5 )
            // InternalVizualizer.g:1734:4: rule__SchemaParser__SelectorsAssignment_5
            {
            pushFollow(FOLLOW_21);
            rule__SchemaParser__SelectorsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSchemaParserAccess().getSelectorsAssignment_5()); 

            }

            // InternalVizualizer.g:1737:2: ( ( rule__SchemaParser__SelectorsAssignment_5 )* )
            // InternalVizualizer.g:1738:3: ( rule__SchemaParser__SelectorsAssignment_5 )*
            {
             before(grammarAccess.getSchemaParserAccess().getSelectorsAssignment_5()); 
            // InternalVizualizer.g:1739:3: ( rule__SchemaParser__SelectorsAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==34) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalVizualizer.g:1739:4: rule__SchemaParser__SelectorsAssignment_5
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__SchemaParser__SelectorsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getSchemaParserAccess().getSelectorsAssignment_5()); 

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
    // $ANTLR end "rule__SchemaParser__Group__5__Impl"


    // $ANTLR start "rule__SchemaParser__Group__6"
    // InternalVizualizer.g:1748:1: rule__SchemaParser__Group__6 : rule__SchemaParser__Group__6__Impl ;
    public final void rule__SchemaParser__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1752:1: ( rule__SchemaParser__Group__6__Impl )
            // InternalVizualizer.g:1753:2: rule__SchemaParser__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SchemaParser__Group__6__Impl();

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
    // InternalVizualizer.g:1759:1: rule__SchemaParser__Group__6__Impl : ( '}' ) ;
    public final void rule__SchemaParser__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1763:1: ( ( '}' ) )
            // InternalVizualizer.g:1764:1: ( '}' )
            {
            // InternalVizualizer.g:1764:1: ( '}' )
            // InternalVizualizer.g:1765:2: '}'
            {
             before(grammarAccess.getSchemaParserAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSchemaParserAccess().getRightCurlyBracketKeyword_6()); 

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


    // $ANTLR start "rule__Selector__Group__0"
    // InternalVizualizer.g:1775:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1779:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // InternalVizualizer.g:1780:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
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
    // InternalVizualizer.g:1787:1: rule__Selector__Group__0__Impl : ( 'Selector as ' ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1791:1: ( ( 'Selector as ' ) )
            // InternalVizualizer.g:1792:1: ( 'Selector as ' )
            {
            // InternalVizualizer.g:1792:1: ( 'Selector as ' )
            // InternalVizualizer.g:1793:2: 'Selector as '
            {
             before(grammarAccess.getSelectorAccess().getSelectorAsKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalVizualizer.g:1802:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl rule__Selector__Group__2 ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1806:1: ( rule__Selector__Group__1__Impl rule__Selector__Group__2 )
            // InternalVizualizer.g:1807:2: rule__Selector__Group__1__Impl rule__Selector__Group__2
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
    // InternalVizualizer.g:1814:1: rule__Selector__Group__1__Impl : ( ( rule__Selector__VarnameAssignment_1 ) ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1818:1: ( ( ( rule__Selector__VarnameAssignment_1 ) ) )
            // InternalVizualizer.g:1819:1: ( ( rule__Selector__VarnameAssignment_1 ) )
            {
            // InternalVizualizer.g:1819:1: ( ( rule__Selector__VarnameAssignment_1 ) )
            // InternalVizualizer.g:1820:2: ( rule__Selector__VarnameAssignment_1 )
            {
             before(grammarAccess.getSelectorAccess().getVarnameAssignment_1()); 
            // InternalVizualizer.g:1821:2: ( rule__Selector__VarnameAssignment_1 )
            // InternalVizualizer.g:1821:3: rule__Selector__VarnameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Selector__VarnameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getVarnameAssignment_1()); 

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
    // InternalVizualizer.g:1829:1: rule__Selector__Group__2 : rule__Selector__Group__2__Impl rule__Selector__Group__3 ;
    public final void rule__Selector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1833:1: ( rule__Selector__Group__2__Impl rule__Selector__Group__3 )
            // InternalVizualizer.g:1834:2: rule__Selector__Group__2__Impl rule__Selector__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalVizualizer.g:1841:1: rule__Selector__Group__2__Impl : ( '{' ) ;
    public final void rule__Selector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1845:1: ( ( '{' ) )
            // InternalVizualizer.g:1846:1: ( '{' )
            {
            // InternalVizualizer.g:1846:1: ( '{' )
            // InternalVizualizer.g:1847:2: '{'
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
    // InternalVizualizer.g:1856:1: rule__Selector__Group__3 : rule__Selector__Group__3__Impl rule__Selector__Group__4 ;
    public final void rule__Selector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1860:1: ( rule__Selector__Group__3__Impl rule__Selector__Group__4 )
            // InternalVizualizer.g:1861:2: rule__Selector__Group__3__Impl rule__Selector__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalVizualizer.g:1868:1: rule__Selector__Group__3__Impl : ( ( rule__Selector__StepsAssignment_3 ) ) ;
    public final void rule__Selector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1872:1: ( ( ( rule__Selector__StepsAssignment_3 ) ) )
            // InternalVizualizer.g:1873:1: ( ( rule__Selector__StepsAssignment_3 ) )
            {
            // InternalVizualizer.g:1873:1: ( ( rule__Selector__StepsAssignment_3 ) )
            // InternalVizualizer.g:1874:2: ( rule__Selector__StepsAssignment_3 )
            {
             before(grammarAccess.getSelectorAccess().getStepsAssignment_3()); 
            // InternalVizualizer.g:1875:2: ( rule__Selector__StepsAssignment_3 )
            // InternalVizualizer.g:1875:3: rule__Selector__StepsAssignment_3
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
    // InternalVizualizer.g:1883:1: rule__Selector__Group__4 : rule__Selector__Group__4__Impl rule__Selector__Group__5 ;
    public final void rule__Selector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1887:1: ( rule__Selector__Group__4__Impl rule__Selector__Group__5 )
            // InternalVizualizer.g:1888:2: rule__Selector__Group__4__Impl rule__Selector__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalVizualizer.g:1895:1: rule__Selector__Group__4__Impl : ( ( ( rule__Selector__Group_4__0 ) ) ( ( rule__Selector__Group_4__0 )* ) ) ;
    public final void rule__Selector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1899:1: ( ( ( ( rule__Selector__Group_4__0 ) ) ( ( rule__Selector__Group_4__0 )* ) ) )
            // InternalVizualizer.g:1900:1: ( ( ( rule__Selector__Group_4__0 ) ) ( ( rule__Selector__Group_4__0 )* ) )
            {
            // InternalVizualizer.g:1900:1: ( ( ( rule__Selector__Group_4__0 ) ) ( ( rule__Selector__Group_4__0 )* ) )
            // InternalVizualizer.g:1901:2: ( ( rule__Selector__Group_4__0 ) ) ( ( rule__Selector__Group_4__0 )* )
            {
            // InternalVizualizer.g:1901:2: ( ( rule__Selector__Group_4__0 ) )
            // InternalVizualizer.g:1902:3: ( rule__Selector__Group_4__0 )
            {
             before(grammarAccess.getSelectorAccess().getGroup_4()); 
            // InternalVizualizer.g:1903:3: ( rule__Selector__Group_4__0 )
            // InternalVizualizer.g:1903:4: rule__Selector__Group_4__0
            {
            pushFollow(FOLLOW_23);
            rule__Selector__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getGroup_4()); 

            }

            // InternalVizualizer.g:1906:2: ( ( rule__Selector__Group_4__0 )* )
            // InternalVizualizer.g:1907:3: ( rule__Selector__Group_4__0 )*
            {
             before(grammarAccess.getSelectorAccess().getGroup_4()); 
            // InternalVizualizer.g:1908:3: ( rule__Selector__Group_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==35) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalVizualizer.g:1908:4: rule__Selector__Group_4__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Selector__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalVizualizer.g:1917:1: rule__Selector__Group__5 : rule__Selector__Group__5__Impl ;
    public final void rule__Selector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1921:1: ( rule__Selector__Group__5__Impl )
            // InternalVizualizer.g:1922:2: rule__Selector__Group__5__Impl
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
    // InternalVizualizer.g:1928:1: rule__Selector__Group__5__Impl : ( '}' ) ;
    public final void rule__Selector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1932:1: ( ( '}' ) )
            // InternalVizualizer.g:1933:1: ( '}' )
            {
            // InternalVizualizer.g:1933:1: ( '}' )
            // InternalVizualizer.g:1934:2: '}'
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
    // InternalVizualizer.g:1944:1: rule__Selector__Group_4__0 : rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1 ;
    public final void rule__Selector__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1948:1: ( rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1 )
            // InternalVizualizer.g:1949:2: rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalVizualizer.g:1956:1: rule__Selector__Group_4__0__Impl : ( ' -> ' ) ;
    public final void rule__Selector__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1960:1: ( ( ' -> ' ) )
            // InternalVizualizer.g:1961:1: ( ' -> ' )
            {
            // InternalVizualizer.g:1961:1: ( ' -> ' )
            // InternalVizualizer.g:1962:2: ' -> '
            {
             before(grammarAccess.getSelectorAccess().getSpaceHyphenMinusGreaterThanSignSpaceKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalVizualizer.g:1971:1: rule__Selector__Group_4__1 : rule__Selector__Group_4__1__Impl ;
    public final void rule__Selector__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1975:1: ( rule__Selector__Group_4__1__Impl )
            // InternalVizualizer.g:1976:2: rule__Selector__Group_4__1__Impl
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
    // InternalVizualizer.g:1982:1: rule__Selector__Group_4__1__Impl : ( ( rule__Selector__StepsAssignment_4_1 ) ) ;
    public final void rule__Selector__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1986:1: ( ( ( rule__Selector__StepsAssignment_4_1 ) ) )
            // InternalVizualizer.g:1987:1: ( ( rule__Selector__StepsAssignment_4_1 ) )
            {
            // InternalVizualizer.g:1987:1: ( ( rule__Selector__StepsAssignment_4_1 ) )
            // InternalVizualizer.g:1988:2: ( rule__Selector__StepsAssignment_4_1 )
            {
             before(grammarAccess.getSelectorAccess().getStepsAssignment_4_1()); 
            // InternalVizualizer.g:1989:2: ( rule__Selector__StepsAssignment_4_1 )
            // InternalVizualizer.g:1989:3: rule__Selector__StepsAssignment_4_1
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
    // InternalVizualizer.g:1998:1: rule__Formula__Group__0 : rule__Formula__Group__0__Impl rule__Formula__Group__1 ;
    public final void rule__Formula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2002:1: ( rule__Formula__Group__0__Impl rule__Formula__Group__1 )
            // InternalVizualizer.g:2003:2: rule__Formula__Group__0__Impl rule__Formula__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalVizualizer.g:2010:1: rule__Formula__Group__0__Impl : ( ( rule__Formula__NameAssignment_0 ) ) ;
    public final void rule__Formula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2014:1: ( ( ( rule__Formula__NameAssignment_0 ) ) )
            // InternalVizualizer.g:2015:1: ( ( rule__Formula__NameAssignment_0 ) )
            {
            // InternalVizualizer.g:2015:1: ( ( rule__Formula__NameAssignment_0 ) )
            // InternalVizualizer.g:2016:2: ( rule__Formula__NameAssignment_0 )
            {
             before(grammarAccess.getFormulaAccess().getNameAssignment_0()); 
            // InternalVizualizer.g:2017:2: ( rule__Formula__NameAssignment_0 )
            // InternalVizualizer.g:2017:3: rule__Formula__NameAssignment_0
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
    // InternalVizualizer.g:2025:1: rule__Formula__Group__1 : rule__Formula__Group__1__Impl rule__Formula__Group__2 ;
    public final void rule__Formula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2029:1: ( rule__Formula__Group__1__Impl rule__Formula__Group__2 )
            // InternalVizualizer.g:2030:2: rule__Formula__Group__1__Impl rule__Formula__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalVizualizer.g:2037:1: rule__Formula__Group__1__Impl : ( '(' ) ;
    public final void rule__Formula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2041:1: ( ( '(' ) )
            // InternalVizualizer.g:2042:1: ( '(' )
            {
            // InternalVizualizer.g:2042:1: ( '(' )
            // InternalVizualizer.g:2043:2: '('
            {
             before(grammarAccess.getFormulaAccess().getLeftParenthesisKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalVizualizer.g:2052:1: rule__Formula__Group__2 : rule__Formula__Group__2__Impl rule__Formula__Group__3 ;
    public final void rule__Formula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2056:1: ( rule__Formula__Group__2__Impl rule__Formula__Group__3 )
            // InternalVizualizer.g:2057:2: rule__Formula__Group__2__Impl rule__Formula__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalVizualizer.g:2064:1: rule__Formula__Group__2__Impl : ( ( rule__Formula__Group_2__0 )? ) ;
    public final void rule__Formula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2068:1: ( ( ( rule__Formula__Group_2__0 )? ) )
            // InternalVizualizer.g:2069:1: ( ( rule__Formula__Group_2__0 )? )
            {
            // InternalVizualizer.g:2069:1: ( ( rule__Formula__Group_2__0 )? )
            // InternalVizualizer.g:2070:2: ( rule__Formula__Group_2__0 )?
            {
             before(grammarAccess.getFormulaAccess().getGroup_2()); 
            // InternalVizualizer.g:2071:2: ( rule__Formula__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalVizualizer.g:2071:3: rule__Formula__Group_2__0
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
    // InternalVizualizer.g:2079:1: rule__Formula__Group__3 : rule__Formula__Group__3__Impl rule__Formula__Group__4 ;
    public final void rule__Formula__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2083:1: ( rule__Formula__Group__3__Impl rule__Formula__Group__4 )
            // InternalVizualizer.g:2084:2: rule__Formula__Group__3__Impl rule__Formula__Group__4
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
    // InternalVizualizer.g:2091:1: rule__Formula__Group__3__Impl : ( ')' ) ;
    public final void rule__Formula__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2095:1: ( ( ')' ) )
            // InternalVizualizer.g:2096:1: ( ')' )
            {
            // InternalVizualizer.g:2096:1: ( ')' )
            // InternalVizualizer.g:2097:2: ')'
            {
             before(grammarAccess.getFormulaAccess().getRightParenthesisKeyword_3()); 
            match(input,37,FOLLOW_2); 
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
    // InternalVizualizer.g:2106:1: rule__Formula__Group__4 : rule__Formula__Group__4__Impl rule__Formula__Group__5 ;
    public final void rule__Formula__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2110:1: ( rule__Formula__Group__4__Impl rule__Formula__Group__5 )
            // InternalVizualizer.g:2111:2: rule__Formula__Group__4__Impl rule__Formula__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalVizualizer.g:2118:1: rule__Formula__Group__4__Impl : ( '=' ) ;
    public final void rule__Formula__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2122:1: ( ( '=' ) )
            // InternalVizualizer.g:2123:1: ( '=' )
            {
            // InternalVizualizer.g:2123:1: ( '=' )
            // InternalVizualizer.g:2124:2: '='
            {
             before(grammarAccess.getFormulaAccess().getEqualsSignKeyword_4()); 
            match(input,38,FOLLOW_2); 
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
    // InternalVizualizer.g:2133:1: rule__Formula__Group__5 : rule__Formula__Group__5__Impl ;
    public final void rule__Formula__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2137:1: ( rule__Formula__Group__5__Impl )
            // InternalVizualizer.g:2138:2: rule__Formula__Group__5__Impl
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
    // InternalVizualizer.g:2144:1: rule__Formula__Group__5__Impl : ( ( rule__Formula__ExpAssignment_5 ) ) ;
    public final void rule__Formula__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2148:1: ( ( ( rule__Formula__ExpAssignment_5 ) ) )
            // InternalVizualizer.g:2149:1: ( ( rule__Formula__ExpAssignment_5 ) )
            {
            // InternalVizualizer.g:2149:1: ( ( rule__Formula__ExpAssignment_5 ) )
            // InternalVizualizer.g:2150:2: ( rule__Formula__ExpAssignment_5 )
            {
             before(grammarAccess.getFormulaAccess().getExpAssignment_5()); 
            // InternalVizualizer.g:2151:2: ( rule__Formula__ExpAssignment_5 )
            // InternalVizualizer.g:2151:3: rule__Formula__ExpAssignment_5
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
    // InternalVizualizer.g:2160:1: rule__Formula__Group_2__0 : rule__Formula__Group_2__0__Impl rule__Formula__Group_2__1 ;
    public final void rule__Formula__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2164:1: ( rule__Formula__Group_2__0__Impl rule__Formula__Group_2__1 )
            // InternalVizualizer.g:2165:2: rule__Formula__Group_2__0__Impl rule__Formula__Group_2__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalVizualizer.g:2172:1: rule__Formula__Group_2__0__Impl : ( ( rule__Formula__VarsAssignment_2_0 ) ) ;
    public final void rule__Formula__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2176:1: ( ( ( rule__Formula__VarsAssignment_2_0 ) ) )
            // InternalVizualizer.g:2177:1: ( ( rule__Formula__VarsAssignment_2_0 ) )
            {
            // InternalVizualizer.g:2177:1: ( ( rule__Formula__VarsAssignment_2_0 ) )
            // InternalVizualizer.g:2178:2: ( rule__Formula__VarsAssignment_2_0 )
            {
             before(grammarAccess.getFormulaAccess().getVarsAssignment_2_0()); 
            // InternalVizualizer.g:2179:2: ( rule__Formula__VarsAssignment_2_0 )
            // InternalVizualizer.g:2179:3: rule__Formula__VarsAssignment_2_0
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
    // InternalVizualizer.g:2187:1: rule__Formula__Group_2__1 : rule__Formula__Group_2__1__Impl ;
    public final void rule__Formula__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2191:1: ( rule__Formula__Group_2__1__Impl )
            // InternalVizualizer.g:2192:2: rule__Formula__Group_2__1__Impl
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
    // InternalVizualizer.g:2198:1: rule__Formula__Group_2__1__Impl : ( ( rule__Formula__Group_2_1__0 )* ) ;
    public final void rule__Formula__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2202:1: ( ( ( rule__Formula__Group_2_1__0 )* ) )
            // InternalVizualizer.g:2203:1: ( ( rule__Formula__Group_2_1__0 )* )
            {
            // InternalVizualizer.g:2203:1: ( ( rule__Formula__Group_2_1__0 )* )
            // InternalVizualizer.g:2204:2: ( rule__Formula__Group_2_1__0 )*
            {
             before(grammarAccess.getFormulaAccess().getGroup_2_1()); 
            // InternalVizualizer.g:2205:2: ( rule__Formula__Group_2_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==39) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalVizualizer.g:2205:3: rule__Formula__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Formula__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalVizualizer.g:2214:1: rule__Formula__Group_2_1__0 : rule__Formula__Group_2_1__0__Impl rule__Formula__Group_2_1__1 ;
    public final void rule__Formula__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2218:1: ( rule__Formula__Group_2_1__0__Impl rule__Formula__Group_2_1__1 )
            // InternalVizualizer.g:2219:2: rule__Formula__Group_2_1__0__Impl rule__Formula__Group_2_1__1
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
    // InternalVizualizer.g:2226:1: rule__Formula__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Formula__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2230:1: ( ( ',' ) )
            // InternalVizualizer.g:2231:1: ( ',' )
            {
            // InternalVizualizer.g:2231:1: ( ',' )
            // InternalVizualizer.g:2232:2: ','
            {
             before(grammarAccess.getFormulaAccess().getCommaKeyword_2_1_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalVizualizer.g:2241:1: rule__Formula__Group_2_1__1 : rule__Formula__Group_2_1__1__Impl ;
    public final void rule__Formula__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2245:1: ( rule__Formula__Group_2_1__1__Impl )
            // InternalVizualizer.g:2246:2: rule__Formula__Group_2_1__1__Impl
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
    // InternalVizualizer.g:2252:1: rule__Formula__Group_2_1__1__Impl : ( ( rule__Formula__VarsAssignment_2_1_1 ) ) ;
    public final void rule__Formula__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2256:1: ( ( ( rule__Formula__VarsAssignment_2_1_1 ) ) )
            // InternalVizualizer.g:2257:1: ( ( rule__Formula__VarsAssignment_2_1_1 ) )
            {
            // InternalVizualizer.g:2257:1: ( ( rule__Formula__VarsAssignment_2_1_1 ) )
            // InternalVizualizer.g:2258:2: ( rule__Formula__VarsAssignment_2_1_1 )
            {
             before(grammarAccess.getFormulaAccess().getVarsAssignment_2_1_1()); 
            // InternalVizualizer.g:2259:2: ( rule__Formula__VarsAssignment_2_1_1 )
            // InternalVizualizer.g:2259:3: rule__Formula__VarsAssignment_2_1_1
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
    // InternalVizualizer.g:2268:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2272:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalVizualizer.g:2273:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalVizualizer.g:2280:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__LeftAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2284:1: ( ( ( rule__Expression__LeftAssignment_0 ) ) )
            // InternalVizualizer.g:2285:1: ( ( rule__Expression__LeftAssignment_0 ) )
            {
            // InternalVizualizer.g:2285:1: ( ( rule__Expression__LeftAssignment_0 ) )
            // InternalVizualizer.g:2286:2: ( rule__Expression__LeftAssignment_0 )
            {
             before(grammarAccess.getExpressionAccess().getLeftAssignment_0()); 
            // InternalVizualizer.g:2287:2: ( rule__Expression__LeftAssignment_0 )
            // InternalVizualizer.g:2287:3: rule__Expression__LeftAssignment_0
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
    // InternalVizualizer.g:2295:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2299:1: ( rule__Expression__Group__1__Impl )
            // InternalVizualizer.g:2300:2: rule__Expression__Group__1__Impl
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
    // InternalVizualizer.g:2306:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2310:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // InternalVizualizer.g:2311:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // InternalVizualizer.g:2311:1: ( ( rule__Expression__Group_1__0 )? )
            // InternalVizualizer.g:2312:2: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalVizualizer.g:2313:2: ( rule__Expression__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=11 && LA15_0<=12)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalVizualizer.g:2313:3: rule__Expression__Group_1__0
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
    // InternalVizualizer.g:2322:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2326:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalVizualizer.g:2327:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalVizualizer.g:2334:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__OpAssignment_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2338:1: ( ( ( rule__Expression__OpAssignment_1_0 ) ) )
            // InternalVizualizer.g:2339:1: ( ( rule__Expression__OpAssignment_1_0 ) )
            {
            // InternalVizualizer.g:2339:1: ( ( rule__Expression__OpAssignment_1_0 ) )
            // InternalVizualizer.g:2340:2: ( rule__Expression__OpAssignment_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getOpAssignment_1_0()); 
            // InternalVizualizer.g:2341:2: ( rule__Expression__OpAssignment_1_0 )
            // InternalVizualizer.g:2341:3: rule__Expression__OpAssignment_1_0
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
    // InternalVizualizer.g:2349:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2353:1: ( rule__Expression__Group_1__1__Impl )
            // InternalVizualizer.g:2354:2: rule__Expression__Group_1__1__Impl
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
    // InternalVizualizer.g:2360:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__RightAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2364:1: ( ( ( rule__Expression__RightAssignment_1_1 ) ) )
            // InternalVizualizer.g:2365:1: ( ( rule__Expression__RightAssignment_1_1 ) )
            {
            // InternalVizualizer.g:2365:1: ( ( rule__Expression__RightAssignment_1_1 ) )
            // InternalVizualizer.g:2366:2: ( rule__Expression__RightAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_1()); 
            // InternalVizualizer.g:2367:2: ( rule__Expression__RightAssignment_1_1 )
            // InternalVizualizer.g:2367:3: rule__Expression__RightAssignment_1_1
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
    // InternalVizualizer.g:2376:1: rule__Factor__Group__0 : rule__Factor__Group__0__Impl rule__Factor__Group__1 ;
    public final void rule__Factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2380:1: ( rule__Factor__Group__0__Impl rule__Factor__Group__1 )
            // InternalVizualizer.g:2381:2: rule__Factor__Group__0__Impl rule__Factor__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalVizualizer.g:2388:1: rule__Factor__Group__0__Impl : ( ( rule__Factor__LeftAssignment_0 ) ) ;
    public final void rule__Factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2392:1: ( ( ( rule__Factor__LeftAssignment_0 ) ) )
            // InternalVizualizer.g:2393:1: ( ( rule__Factor__LeftAssignment_0 ) )
            {
            // InternalVizualizer.g:2393:1: ( ( rule__Factor__LeftAssignment_0 ) )
            // InternalVizualizer.g:2394:2: ( rule__Factor__LeftAssignment_0 )
            {
             before(grammarAccess.getFactorAccess().getLeftAssignment_0()); 
            // InternalVizualizer.g:2395:2: ( rule__Factor__LeftAssignment_0 )
            // InternalVizualizer.g:2395:3: rule__Factor__LeftAssignment_0
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
    // InternalVizualizer.g:2403:1: rule__Factor__Group__1 : rule__Factor__Group__1__Impl ;
    public final void rule__Factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2407:1: ( rule__Factor__Group__1__Impl )
            // InternalVizualizer.g:2408:2: rule__Factor__Group__1__Impl
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
    // InternalVizualizer.g:2414:1: rule__Factor__Group__1__Impl : ( ( rule__Factor__Group_1__0 )? ) ;
    public final void rule__Factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2418:1: ( ( ( rule__Factor__Group_1__0 )? ) )
            // InternalVizualizer.g:2419:1: ( ( rule__Factor__Group_1__0 )? )
            {
            // InternalVizualizer.g:2419:1: ( ( rule__Factor__Group_1__0 )? )
            // InternalVizualizer.g:2420:2: ( rule__Factor__Group_1__0 )?
            {
             before(grammarAccess.getFactorAccess().getGroup_1()); 
            // InternalVizualizer.g:2421:2: ( rule__Factor__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=13 && LA16_0<=14)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalVizualizer.g:2421:3: rule__Factor__Group_1__0
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
    // InternalVizualizer.g:2430:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2434:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // InternalVizualizer.g:2435:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalVizualizer.g:2442:1: rule__Factor__Group_1__0__Impl : ( ( rule__Factor__OpAssignment_1_0 ) ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2446:1: ( ( ( rule__Factor__OpAssignment_1_0 ) ) )
            // InternalVizualizer.g:2447:1: ( ( rule__Factor__OpAssignment_1_0 ) )
            {
            // InternalVizualizer.g:2447:1: ( ( rule__Factor__OpAssignment_1_0 ) )
            // InternalVizualizer.g:2448:2: ( rule__Factor__OpAssignment_1_0 )
            {
             before(grammarAccess.getFactorAccess().getOpAssignment_1_0()); 
            // InternalVizualizer.g:2449:2: ( rule__Factor__OpAssignment_1_0 )
            // InternalVizualizer.g:2449:3: rule__Factor__OpAssignment_1_0
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
    // InternalVizualizer.g:2457:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2461:1: ( rule__Factor__Group_1__1__Impl )
            // InternalVizualizer.g:2462:2: rule__Factor__Group_1__1__Impl
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
    // InternalVizualizer.g:2468:1: rule__Factor__Group_1__1__Impl : ( ( rule__Factor__RightAssignment_1_1 ) ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2472:1: ( ( ( rule__Factor__RightAssignment_1_1 ) ) )
            // InternalVizualizer.g:2473:1: ( ( rule__Factor__RightAssignment_1_1 ) )
            {
            // InternalVizualizer.g:2473:1: ( ( rule__Factor__RightAssignment_1_1 ) )
            // InternalVizualizer.g:2474:2: ( rule__Factor__RightAssignment_1_1 )
            {
             before(grammarAccess.getFactorAccess().getRightAssignment_1_1()); 
            // InternalVizualizer.g:2475:2: ( rule__Factor__RightAssignment_1_1 )
            // InternalVizualizer.g:2475:3: rule__Factor__RightAssignment_1_1
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
    // InternalVizualizer.g:2484:1: rule__Primitive__Group_2__0 : rule__Primitive__Group_2__0__Impl rule__Primitive__Group_2__1 ;
    public final void rule__Primitive__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2488:1: ( rule__Primitive__Group_2__0__Impl rule__Primitive__Group_2__1 )
            // InternalVizualizer.g:2489:2: rule__Primitive__Group_2__0__Impl rule__Primitive__Group_2__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalVizualizer.g:2496:1: rule__Primitive__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primitive__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2500:1: ( ( '(' ) )
            // InternalVizualizer.g:2501:1: ( '(' )
            {
            // InternalVizualizer.g:2501:1: ( '(' )
            // InternalVizualizer.g:2502:2: '('
            {
             before(grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalVizualizer.g:2511:1: rule__Primitive__Group_2__1 : rule__Primitive__Group_2__1__Impl rule__Primitive__Group_2__2 ;
    public final void rule__Primitive__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2515:1: ( rule__Primitive__Group_2__1__Impl rule__Primitive__Group_2__2 )
            // InternalVizualizer.g:2516:2: rule__Primitive__Group_2__1__Impl rule__Primitive__Group_2__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalVizualizer.g:2523:1: rule__Primitive__Group_2__1__Impl : ( ruleExpression ) ;
    public final void rule__Primitive__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2527:1: ( ( ruleExpression ) )
            // InternalVizualizer.g:2528:1: ( ruleExpression )
            {
            // InternalVizualizer.g:2528:1: ( ruleExpression )
            // InternalVizualizer.g:2529:2: ruleExpression
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
    // InternalVizualizer.g:2538:1: rule__Primitive__Group_2__2 : rule__Primitive__Group_2__2__Impl ;
    public final void rule__Primitive__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2542:1: ( rule__Primitive__Group_2__2__Impl )
            // InternalVizualizer.g:2543:2: rule__Primitive__Group_2__2__Impl
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
    // InternalVizualizer.g:2549:1: rule__Primitive__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primitive__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2553:1: ( ( ')' ) )
            // InternalVizualizer.g:2554:1: ( ')' )
            {
            // InternalVizualizer.g:2554:1: ( ')' )
            // InternalVizualizer.g:2555:2: ')'
            {
             before(grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_2_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalVizualizer.g:2565:1: rule__System__PagesAssignment_0 : ( rulePage ) ;
    public final void rule__System__PagesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2569:1: ( ( rulePage ) )
            // InternalVizualizer.g:2570:2: ( rulePage )
            {
            // InternalVizualizer.g:2570:2: ( rulePage )
            // InternalVizualizer.g:2571:3: rulePage
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
    // InternalVizualizer.g:2580:1: rule__System__SourcesAssignment_1 : ( ruleSource ) ;
    public final void rule__System__SourcesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2584:1: ( ( ruleSource ) )
            // InternalVizualizer.g:2585:2: ( ruleSource )
            {
            // InternalVizualizer.g:2585:2: ( ruleSource )
            // InternalVizualizer.g:2586:3: ruleSource
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
    // InternalVizualizer.g:2595:1: rule__System__SchemasAssignment_2 : ( ruleSchemaParser ) ;
    public final void rule__System__SchemasAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2599:1: ( ( ruleSchemaParser ) )
            // InternalVizualizer.g:2600:2: ( ruleSchemaParser )
            {
            // InternalVizualizer.g:2600:2: ( ruleSchemaParser )
            // InternalVizualizer.g:2601:3: ruleSchemaParser
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
    // InternalVizualizer.g:2610:1: rule__Page__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Page__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2614:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:2615:2: ( RULE_ID )
            {
            // InternalVizualizer.g:2615:2: ( RULE_ID )
            // InternalVizualizer.g:2616:3: RULE_ID
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
    // InternalVizualizer.g:2625:1: rule__Page__TilesAssignment_3 : ( ruleTile ) ;
    public final void rule__Page__TilesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2629:1: ( ( ruleTile ) )
            // InternalVizualizer.g:2630:2: ( ruleTile )
            {
            // InternalVizualizer.g:2630:2: ( ruleTile )
            // InternalVizualizer.g:2631:3: ruleTile
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
    // InternalVizualizer.g:2640:1: rule__Link__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Link__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2644:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:2645:2: ( RULE_ID )
            {
            // InternalVizualizer.g:2645:2: ( RULE_ID )
            // InternalVizualizer.g:2646:3: RULE_ID
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
    // InternalVizualizer.g:2655:1: rule__Link__PageAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Link__PageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2659:1: ( ( ( RULE_ID ) ) )
            // InternalVizualizer.g:2660:2: ( ( RULE_ID ) )
            {
            // InternalVizualizer.g:2660:2: ( ( RULE_ID ) )
            // InternalVizualizer.g:2661:3: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getPagePageCrossReference_3_0()); 
            // InternalVizualizer.g:2662:3: ( RULE_ID )
            // InternalVizualizer.g:2663:4: RULE_ID
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
    // InternalVizualizer.g:2674:1: rule__Graph__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Graph__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2678:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:2679:2: ( RULE_ID )
            {
            // InternalVizualizer.g:2679:2: ( RULE_ID )
            // InternalVizualizer.g:2680:3: RULE_ID
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
    // InternalVizualizer.g:2689:1: rule__Graph__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Graph__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2693:1: ( ( ( RULE_ID ) ) )
            // InternalVizualizer.g:2694:2: ( ( RULE_ID ) )
            {
            // InternalVizualizer.g:2694:2: ( ( RULE_ID ) )
            // InternalVizualizer.g:2695:3: ( RULE_ID )
            {
             before(grammarAccess.getGraphAccess().getSourceDatasourceCrossReference_2_0()); 
            // InternalVizualizer.g:2696:3: ( RULE_ID )
            // InternalVizualizer.g:2697:4: RULE_ID
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
    // InternalVizualizer.g:2708:1: rule__Datasource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Datasource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2712:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:2713:2: ( RULE_ID )
            {
            // InternalVizualizer.g:2713:2: ( RULE_ID )
            // InternalVizualizer.g:2714:3: RULE_ID
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


    // $ANTLR start "rule__Datasource__SourceAssignment_4"
    // InternalVizualizer.g:2723:1: rule__Datasource__SourceAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Datasource__SourceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2727:1: ( ( ( RULE_ID ) ) )
            // InternalVizualizer.g:2728:2: ( ( RULE_ID ) )
            {
            // InternalVizualizer.g:2728:2: ( ( RULE_ID ) )
            // InternalVizualizer.g:2729:3: ( RULE_ID )
            {
             before(grammarAccess.getDatasourceAccess().getSourceSourceCrossReference_4_0()); 
            // InternalVizualizer.g:2730:3: ( RULE_ID )
            // InternalVizualizer.g:2731:4: RULE_ID
            {
             before(grammarAccess.getDatasourceAccess().getSourceSourceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDatasourceAccess().getSourceSourceIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getDatasourceAccess().getSourceSourceCrossReference_4_0()); 

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
    // $ANTLR end "rule__Datasource__SourceAssignment_4"


    // $ANTLR start "rule__Datasource__DimensionsAssignment_5"
    // InternalVizualizer.g:2742:1: rule__Datasource__DimensionsAssignment_5 : ( ruleDimensionalData ) ;
    public final void rule__Datasource__DimensionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2746:1: ( ( ruleDimensionalData ) )
            // InternalVizualizer.g:2747:2: ( ruleDimensionalData )
            {
            // InternalVizualizer.g:2747:2: ( ruleDimensionalData )
            // InternalVizualizer.g:2748:3: ruleDimensionalData
            {
             before(grammarAccess.getDatasourceAccess().getDimensionsDimensionalDataParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDimensionalData();

            state._fsp--;

             after(grammarAccess.getDatasourceAccess().getDimensionsDimensionalDataParserRuleCall_5_0()); 

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


    // $ANTLR start "rule__DimensionalData__DimAssignment_1"
    // InternalVizualizer.g:2757:1: rule__DimensionalData__DimAssignment_1 : ( RULE_ID ) ;
    public final void rule__DimensionalData__DimAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2761:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:2762:2: ( RULE_ID )
            {
            // InternalVizualizer.g:2762:2: ( RULE_ID )
            // InternalVizualizer.g:2763:3: RULE_ID
            {
             before(grammarAccess.getDimensionalDataAccess().getDimIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDimensionalDataAccess().getDimIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DimensionalData__DimAssignment_1"


    // $ANTLR start "rule__DimensionalData__FormulaAssignment_4"
    // InternalVizualizer.g:2772:1: rule__DimensionalData__FormulaAssignment_4 : ( ruleFormula ) ;
    public final void rule__DimensionalData__FormulaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2776:1: ( ( ruleFormula ) )
            // InternalVizualizer.g:2777:2: ( ruleFormula )
            {
            // InternalVizualizer.g:2777:2: ( ruleFormula )
            // InternalVizualizer.g:2778:3: ruleFormula
            {
             before(grammarAccess.getDimensionalDataAccess().getFormulaFormulaParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFormula();

            state._fsp--;

             after(grammarAccess.getDimensionalDataAccess().getFormulaFormulaParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__DimensionalData__FormulaAssignment_4"


    // $ANTLR start "rule__URI__NameAssignment_1"
    // InternalVizualizer.g:2787:1: rule__URI__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__URI__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2791:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:2792:2: ( RULE_ID )
            {
            // InternalVizualizer.g:2792:2: ( RULE_ID )
            // InternalVizualizer.g:2793:3: RULE_ID
            {
             before(grammarAccess.getURIAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getURIAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__URI__NameAssignment_1"


    // $ANTLR start "rule__URI__UriAssignment_4"
    // InternalVizualizer.g:2802:1: rule__URI__UriAssignment_4 : ( RULE_STRING ) ;
    public final void rule__URI__UriAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2806:1: ( ( RULE_STRING ) )
            // InternalVizualizer.g:2807:2: ( RULE_STRING )
            {
            // InternalVizualizer.g:2807:2: ( RULE_STRING )
            // InternalVizualizer.g:2808:3: RULE_STRING
            {
             before(grammarAccess.getURIAccess().getUriSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getURIAccess().getUriSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__URI__UriAssignment_4"


    // $ANTLR start "rule__URI__ParserAssignment_6"
    // InternalVizualizer.g:2817:1: rule__URI__ParserAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__URI__ParserAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2821:1: ( ( ( RULE_ID ) ) )
            // InternalVizualizer.g:2822:2: ( ( RULE_ID ) )
            {
            // InternalVizualizer.g:2822:2: ( ( RULE_ID ) )
            // InternalVizualizer.g:2823:3: ( RULE_ID )
            {
             before(grammarAccess.getURIAccess().getParserSchemaParserCrossReference_6_0()); 
            // InternalVizualizer.g:2824:3: ( RULE_ID )
            // InternalVizualizer.g:2825:4: RULE_ID
            {
             before(grammarAccess.getURIAccess().getParserSchemaParserIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getURIAccess().getParserSchemaParserIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getURIAccess().getParserSchemaParserCrossReference_6_0()); 

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
    // $ANTLR end "rule__URI__ParserAssignment_6"


    // $ANTLR start "rule__SchemaParser__NameAssignment_1"
    // InternalVizualizer.g:2836:1: rule__SchemaParser__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SchemaParser__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2840:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:2841:2: ( RULE_ID )
            {
            // InternalVizualizer.g:2841:2: ( RULE_ID )
            // InternalVizualizer.g:2842:3: RULE_ID
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


    // $ANTLR start "rule__SchemaParser__SchemaTypeAssignment_4"
    // InternalVizualizer.g:2851:1: rule__SchemaParser__SchemaTypeAssignment_4 : ( ruleSchemaType ) ;
    public final void rule__SchemaParser__SchemaTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2855:1: ( ( ruleSchemaType ) )
            // InternalVizualizer.g:2856:2: ( ruleSchemaType )
            {
            // InternalVizualizer.g:2856:2: ( ruleSchemaType )
            // InternalVizualizer.g:2857:3: ruleSchemaType
            {
             before(grammarAccess.getSchemaParserAccess().getSchemaTypeSchemaTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSchemaType();

            state._fsp--;

             after(grammarAccess.getSchemaParserAccess().getSchemaTypeSchemaTypeEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__SchemaParser__SchemaTypeAssignment_4"


    // $ANTLR start "rule__SchemaParser__SelectorsAssignment_5"
    // InternalVizualizer.g:2866:1: rule__SchemaParser__SelectorsAssignment_5 : ( ruleSelector ) ;
    public final void rule__SchemaParser__SelectorsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2870:1: ( ( ruleSelector ) )
            // InternalVizualizer.g:2871:2: ( ruleSelector )
            {
            // InternalVizualizer.g:2871:2: ( ruleSelector )
            // InternalVizualizer.g:2872:3: ruleSelector
            {
             before(grammarAccess.getSchemaParserAccess().getSelectorsSelectorParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSchemaParserAccess().getSelectorsSelectorParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__SchemaParser__SelectorsAssignment_5"


    // $ANTLR start "rule__Selector__VarnameAssignment_1"
    // InternalVizualizer.g:2881:1: rule__Selector__VarnameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Selector__VarnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2885:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:2886:2: ( RULE_ID )
            {
            // InternalVizualizer.g:2886:2: ( RULE_ID )
            // InternalVizualizer.g:2887:3: RULE_ID
            {
             before(grammarAccess.getSelectorAccess().getVarnameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectorAccess().getVarnameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Selector__VarnameAssignment_1"


    // $ANTLR start "rule__Selector__StepsAssignment_3"
    // InternalVizualizer.g:2896:1: rule__Selector__StepsAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Selector__StepsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2900:1: ( ( RULE_STRING ) )
            // InternalVizualizer.g:2901:2: ( RULE_STRING )
            {
            // InternalVizualizer.g:2901:2: ( RULE_STRING )
            // InternalVizualizer.g:2902:3: RULE_STRING
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
    // InternalVizualizer.g:2911:1: rule__Selector__StepsAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Selector__StepsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2915:1: ( ( RULE_STRING ) )
            // InternalVizualizer.g:2916:2: ( RULE_STRING )
            {
            // InternalVizualizer.g:2916:2: ( RULE_STRING )
            // InternalVizualizer.g:2917:3: RULE_STRING
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
    // InternalVizualizer.g:2926:1: rule__Formula__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Formula__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2930:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:2931:2: ( RULE_ID )
            {
            // InternalVizualizer.g:2931:2: ( RULE_ID )
            // InternalVizualizer.g:2932:3: RULE_ID
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
    // InternalVizualizer.g:2941:1: rule__Formula__VarsAssignment_2_0 : ( ruleVariable ) ;
    public final void rule__Formula__VarsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2945:1: ( ( ruleVariable ) )
            // InternalVizualizer.g:2946:2: ( ruleVariable )
            {
            // InternalVizualizer.g:2946:2: ( ruleVariable )
            // InternalVizualizer.g:2947:3: ruleVariable
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
    // InternalVizualizer.g:2956:1: rule__Formula__VarsAssignment_2_1_1 : ( ruleVariable ) ;
    public final void rule__Formula__VarsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2960:1: ( ( ruleVariable ) )
            // InternalVizualizer.g:2961:2: ( ruleVariable )
            {
            // InternalVizualizer.g:2961:2: ( ruleVariable )
            // InternalVizualizer.g:2962:3: ruleVariable
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
    // InternalVizualizer.g:2971:1: rule__Formula__ExpAssignment_5 : ( ruleExpression ) ;
    public final void rule__Formula__ExpAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2975:1: ( ( ruleExpression ) )
            // InternalVizualizer.g:2976:2: ( ruleExpression )
            {
            // InternalVizualizer.g:2976:2: ( ruleExpression )
            // InternalVizualizer.g:2977:3: ruleExpression
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
    // InternalVizualizer.g:2986:1: rule__Expression__LeftAssignment_0 : ( ruleFactor ) ;
    public final void rule__Expression__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2990:1: ( ( ruleFactor ) )
            // InternalVizualizer.g:2991:2: ( ruleFactor )
            {
            // InternalVizualizer.g:2991:2: ( ruleFactor )
            // InternalVizualizer.g:2992:3: ruleFactor
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
    // InternalVizualizer.g:3001:1: rule__Expression__OpAssignment_1_0 : ( ruleOp1 ) ;
    public final void rule__Expression__OpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3005:1: ( ( ruleOp1 ) )
            // InternalVizualizer.g:3006:2: ( ruleOp1 )
            {
            // InternalVizualizer.g:3006:2: ( ruleOp1 )
            // InternalVizualizer.g:3007:3: ruleOp1
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
    // InternalVizualizer.g:3016:1: rule__Expression__RightAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__Expression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3020:1: ( ( ruleExpression ) )
            // InternalVizualizer.g:3021:2: ( ruleExpression )
            {
            // InternalVizualizer.g:3021:2: ( ruleExpression )
            // InternalVizualizer.g:3022:3: ruleExpression
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
    // InternalVizualizer.g:3031:1: rule__Factor__LeftAssignment_0 : ( rulePrimitive ) ;
    public final void rule__Factor__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3035:1: ( ( rulePrimitive ) )
            // InternalVizualizer.g:3036:2: ( rulePrimitive )
            {
            // InternalVizualizer.g:3036:2: ( rulePrimitive )
            // InternalVizualizer.g:3037:3: rulePrimitive
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
    // InternalVizualizer.g:3046:1: rule__Factor__OpAssignment_1_0 : ( ruleOp2 ) ;
    public final void rule__Factor__OpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3050:1: ( ( ruleOp2 ) )
            // InternalVizualizer.g:3051:2: ( ruleOp2 )
            {
            // InternalVizualizer.g:3051:2: ( ruleOp2 )
            // InternalVizualizer.g:3052:3: ruleOp2
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
    // InternalVizualizer.g:3061:1: rule__Factor__RightAssignment_1_1 : ( ruleFactor ) ;
    public final void rule__Factor__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3065:1: ( ( ruleFactor ) )
            // InternalVizualizer.g:3066:2: ( ruleFactor )
            {
            // InternalVizualizer.g:3066:2: ( ruleFactor )
            // InternalVizualizer.g:3067:3: ruleFactor
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
    // InternalVizualizer.g:3076:1: rule__Number__ValAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3080:1: ( ( RULE_INT ) )
            // InternalVizualizer.g:3081:2: ( RULE_INT )
            {
            // InternalVizualizer.g:3081:2: ( RULE_INT )
            // InternalVizualizer.g:3082:3: RULE_INT
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
    // InternalVizualizer.g:3091:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3095:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:3096:2: ( RULE_ID )
            {
            // InternalVizualizer.g:3096:2: ( RULE_ID )
            // InternalVizualizer.g:3097:3: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000121040002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000B00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000050L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});

}