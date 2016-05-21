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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'XML'", "'CSV'", "'JSON'", "'Page'", "'{'", "'}'", "'Link'", "'to'", "'Graph'", "'Datasource'", "'Source'", "'Dimensions'", "':'", "','", "'Dimension'", "'as'", "'Formula'", "'PostPoint'", "'url'", "'use Schema'", "'GetPoint'", "'Headers'", "'Schema'", "'SchemaType = '", "'Selector as '", "' -> '", "'('", "')'", "'='"
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

                if ( (LA1_0==18||LA1_0==24||LA1_0==32||LA1_0==35||LA1_0==37) ) {
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


    // $ANTLR start "entryRuleEndPoint"
    // InternalVizualizer.g:253:1: entryRuleEndPoint : ruleEndPoint EOF ;
    public final void entryRuleEndPoint() throws RecognitionException {
        try {
            // InternalVizualizer.g:254:1: ( ruleEndPoint EOF )
            // InternalVizualizer.g:255:1: ruleEndPoint EOF
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
    // InternalVizualizer.g:262:1: ruleEndPoint : ( ( rule__EndPoint__Alternatives ) ) ;
    public final void ruleEndPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:266:2: ( ( ( rule__EndPoint__Alternatives ) ) )
            // InternalVizualizer.g:267:2: ( ( rule__EndPoint__Alternatives ) )
            {
            // InternalVizualizer.g:267:2: ( ( rule__EndPoint__Alternatives ) )
            // InternalVizualizer.g:268:3: ( rule__EndPoint__Alternatives )
            {
             before(grammarAccess.getEndPointAccess().getAlternatives()); 
            // InternalVizualizer.g:269:3: ( rule__EndPoint__Alternatives )
            // InternalVizualizer.g:269:4: rule__EndPoint__Alternatives
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
    // InternalVizualizer.g:278:1: entryRulePostEndPoint : rulePostEndPoint EOF ;
    public final void entryRulePostEndPoint() throws RecognitionException {
        try {
            // InternalVizualizer.g:279:1: ( rulePostEndPoint EOF )
            // InternalVizualizer.g:280:1: rulePostEndPoint EOF
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
    // InternalVizualizer.g:287:1: rulePostEndPoint : ( ( rule__PostEndPoint__Group__0 ) ) ;
    public final void rulePostEndPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:291:2: ( ( ( rule__PostEndPoint__Group__0 ) ) )
            // InternalVizualizer.g:292:2: ( ( rule__PostEndPoint__Group__0 ) )
            {
            // InternalVizualizer.g:292:2: ( ( rule__PostEndPoint__Group__0 ) )
            // InternalVizualizer.g:293:3: ( rule__PostEndPoint__Group__0 )
            {
             before(grammarAccess.getPostEndPointAccess().getGroup()); 
            // InternalVizualizer.g:294:3: ( rule__PostEndPoint__Group__0 )
            // InternalVizualizer.g:294:4: rule__PostEndPoint__Group__0
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
    // InternalVizualizer.g:303:1: entryRuleGetEndPoint : ruleGetEndPoint EOF ;
    public final void entryRuleGetEndPoint() throws RecognitionException {
        try {
            // InternalVizualizer.g:304:1: ( ruleGetEndPoint EOF )
            // InternalVizualizer.g:305:1: ruleGetEndPoint EOF
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
    // InternalVizualizer.g:312:1: ruleGetEndPoint : ( ( rule__GetEndPoint__Group__0 ) ) ;
    public final void ruleGetEndPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:316:2: ( ( ( rule__GetEndPoint__Group__0 ) ) )
            // InternalVizualizer.g:317:2: ( ( rule__GetEndPoint__Group__0 ) )
            {
            // InternalVizualizer.g:317:2: ( ( rule__GetEndPoint__Group__0 ) )
            // InternalVizualizer.g:318:3: ( rule__GetEndPoint__Group__0 )
            {
             before(grammarAccess.getGetEndPointAccess().getGroup()); 
            // InternalVizualizer.g:319:3: ( rule__GetEndPoint__Group__0 )
            // InternalVizualizer.g:319:4: rule__GetEndPoint__Group__0
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
    // InternalVizualizer.g:328:1: entryRuleHeader : ruleHeader EOF ;
    public final void entryRuleHeader() throws RecognitionException {
        try {
            // InternalVizualizer.g:329:1: ( ruleHeader EOF )
            // InternalVizualizer.g:330:1: ruleHeader EOF
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
    // InternalVizualizer.g:337:1: ruleHeader : ( ( rule__Header__Group__0 ) ) ;
    public final void ruleHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:341:2: ( ( ( rule__Header__Group__0 ) ) )
            // InternalVizualizer.g:342:2: ( ( rule__Header__Group__0 ) )
            {
            // InternalVizualizer.g:342:2: ( ( rule__Header__Group__0 ) )
            // InternalVizualizer.g:343:3: ( rule__Header__Group__0 )
            {
             before(grammarAccess.getHeaderAccess().getGroup()); 
            // InternalVizualizer.g:344:3: ( rule__Header__Group__0 )
            // InternalVizualizer.g:344:4: rule__Header__Group__0
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
    // InternalVizualizer.g:353:1: entryRuleSchemaParser : ruleSchemaParser EOF ;
    public final void entryRuleSchemaParser() throws RecognitionException {
        try {
            // InternalVizualizer.g:354:1: ( ruleSchemaParser EOF )
            // InternalVizualizer.g:355:1: ruleSchemaParser EOF
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
    // InternalVizualizer.g:362:1: ruleSchemaParser : ( ( rule__SchemaParser__Group__0 ) ) ;
    public final void ruleSchemaParser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:366:2: ( ( ( rule__SchemaParser__Group__0 ) ) )
            // InternalVizualizer.g:367:2: ( ( rule__SchemaParser__Group__0 ) )
            {
            // InternalVizualizer.g:367:2: ( ( rule__SchemaParser__Group__0 ) )
            // InternalVizualizer.g:368:3: ( rule__SchemaParser__Group__0 )
            {
             before(grammarAccess.getSchemaParserAccess().getGroup()); 
            // InternalVizualizer.g:369:3: ( rule__SchemaParser__Group__0 )
            // InternalVizualizer.g:369:4: rule__SchemaParser__Group__0
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
    // InternalVizualizer.g:378:1: entryRuleSelector : ruleSelector EOF ;
    public final void entryRuleSelector() throws RecognitionException {
        try {
            // InternalVizualizer.g:379:1: ( ruleSelector EOF )
            // InternalVizualizer.g:380:1: ruleSelector EOF
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
    // InternalVizualizer.g:387:1: ruleSelector : ( ( rule__Selector__Group__0 ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:391:2: ( ( ( rule__Selector__Group__0 ) ) )
            // InternalVizualizer.g:392:2: ( ( rule__Selector__Group__0 ) )
            {
            // InternalVizualizer.g:392:2: ( ( rule__Selector__Group__0 ) )
            // InternalVizualizer.g:393:3: ( rule__Selector__Group__0 )
            {
             before(grammarAccess.getSelectorAccess().getGroup()); 
            // InternalVizualizer.g:394:3: ( rule__Selector__Group__0 )
            // InternalVizualizer.g:394:4: rule__Selector__Group__0
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
    // InternalVizualizer.g:403:1: entryRuleFormula : ruleFormula EOF ;
    public final void entryRuleFormula() throws RecognitionException {
        try {
            // InternalVizualizer.g:404:1: ( ruleFormula EOF )
            // InternalVizualizer.g:405:1: ruleFormula EOF
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
    // InternalVizualizer.g:412:1: ruleFormula : ( ( rule__Formula__Group__0 ) ) ;
    public final void ruleFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:416:2: ( ( ( rule__Formula__Group__0 ) ) )
            // InternalVizualizer.g:417:2: ( ( rule__Formula__Group__0 ) )
            {
            // InternalVizualizer.g:417:2: ( ( rule__Formula__Group__0 ) )
            // InternalVizualizer.g:418:3: ( rule__Formula__Group__0 )
            {
             before(grammarAccess.getFormulaAccess().getGroup()); 
            // InternalVizualizer.g:419:3: ( rule__Formula__Group__0 )
            // InternalVizualizer.g:419:4: rule__Formula__Group__0
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
    // InternalVizualizer.g:428:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalVizualizer.g:429:1: ( ruleExpression EOF )
            // InternalVizualizer.g:430:1: ruleExpression EOF
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
    // InternalVizualizer.g:437:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:441:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalVizualizer.g:442:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalVizualizer.g:442:2: ( ( rule__Expression__Group__0 ) )
            // InternalVizualizer.g:443:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalVizualizer.g:444:3: ( rule__Expression__Group__0 )
            // InternalVizualizer.g:444:4: rule__Expression__Group__0
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
    // InternalVizualizer.g:453:1: entryRuleOp1 : ruleOp1 EOF ;
    public final void entryRuleOp1() throws RecognitionException {
        try {
            // InternalVizualizer.g:454:1: ( ruleOp1 EOF )
            // InternalVizualizer.g:455:1: ruleOp1 EOF
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
    // InternalVizualizer.g:462:1: ruleOp1 : ( ( rule__Op1__Alternatives ) ) ;
    public final void ruleOp1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:466:2: ( ( ( rule__Op1__Alternatives ) ) )
            // InternalVizualizer.g:467:2: ( ( rule__Op1__Alternatives ) )
            {
            // InternalVizualizer.g:467:2: ( ( rule__Op1__Alternatives ) )
            // InternalVizualizer.g:468:3: ( rule__Op1__Alternatives )
            {
             before(grammarAccess.getOp1Access().getAlternatives()); 
            // InternalVizualizer.g:469:3: ( rule__Op1__Alternatives )
            // InternalVizualizer.g:469:4: rule__Op1__Alternatives
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
    // InternalVizualizer.g:478:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // InternalVizualizer.g:479:1: ( ruleFactor EOF )
            // InternalVizualizer.g:480:1: ruleFactor EOF
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
    // InternalVizualizer.g:487:1: ruleFactor : ( ( rule__Factor__Group__0 ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:491:2: ( ( ( rule__Factor__Group__0 ) ) )
            // InternalVizualizer.g:492:2: ( ( rule__Factor__Group__0 ) )
            {
            // InternalVizualizer.g:492:2: ( ( rule__Factor__Group__0 ) )
            // InternalVizualizer.g:493:3: ( rule__Factor__Group__0 )
            {
             before(grammarAccess.getFactorAccess().getGroup()); 
            // InternalVizualizer.g:494:3: ( rule__Factor__Group__0 )
            // InternalVizualizer.g:494:4: rule__Factor__Group__0
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
    // InternalVizualizer.g:503:1: entryRuleOp2 : ruleOp2 EOF ;
    public final void entryRuleOp2() throws RecognitionException {
        try {
            // InternalVizualizer.g:504:1: ( ruleOp2 EOF )
            // InternalVizualizer.g:505:1: ruleOp2 EOF
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
    // InternalVizualizer.g:512:1: ruleOp2 : ( ( rule__Op2__Alternatives ) ) ;
    public final void ruleOp2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:516:2: ( ( ( rule__Op2__Alternatives ) ) )
            // InternalVizualizer.g:517:2: ( ( rule__Op2__Alternatives ) )
            {
            // InternalVizualizer.g:517:2: ( ( rule__Op2__Alternatives ) )
            // InternalVizualizer.g:518:3: ( rule__Op2__Alternatives )
            {
             before(grammarAccess.getOp2Access().getAlternatives()); 
            // InternalVizualizer.g:519:3: ( rule__Op2__Alternatives )
            // InternalVizualizer.g:519:4: rule__Op2__Alternatives
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
    // InternalVizualizer.g:528:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // InternalVizualizer.g:529:1: ( rulePrimitive EOF )
            // InternalVizualizer.g:530:1: rulePrimitive EOF
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
    // InternalVizualizer.g:537:1: rulePrimitive : ( ( rule__Primitive__Alternatives ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:541:2: ( ( ( rule__Primitive__Alternatives ) ) )
            // InternalVizualizer.g:542:2: ( ( rule__Primitive__Alternatives ) )
            {
            // InternalVizualizer.g:542:2: ( ( rule__Primitive__Alternatives ) )
            // InternalVizualizer.g:543:3: ( rule__Primitive__Alternatives )
            {
             before(grammarAccess.getPrimitiveAccess().getAlternatives()); 
            // InternalVizualizer.g:544:3: ( rule__Primitive__Alternatives )
            // InternalVizualizer.g:544:4: rule__Primitive__Alternatives
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
    // InternalVizualizer.g:553:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalVizualizer.g:554:1: ( ruleNumber EOF )
            // InternalVizualizer.g:555:1: ruleNumber EOF
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
    // InternalVizualizer.g:562:1: ruleNumber : ( ( rule__Number__ValAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:566:2: ( ( ( rule__Number__ValAssignment ) ) )
            // InternalVizualizer.g:567:2: ( ( rule__Number__ValAssignment ) )
            {
            // InternalVizualizer.g:567:2: ( ( rule__Number__ValAssignment ) )
            // InternalVizualizer.g:568:3: ( rule__Number__ValAssignment )
            {
             before(grammarAccess.getNumberAccess().getValAssignment()); 
            // InternalVizualizer.g:569:3: ( rule__Number__ValAssignment )
            // InternalVizualizer.g:569:4: rule__Number__ValAssignment
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
    // InternalVizualizer.g:578:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalVizualizer.g:579:1: ( ruleVariable EOF )
            // InternalVizualizer.g:580:1: ruleVariable EOF
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
    // InternalVizualizer.g:587:1: ruleVariable : ( ( rule__Variable__NameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:591:2: ( ( ( rule__Variable__NameAssignment ) ) )
            // InternalVizualizer.g:592:2: ( ( rule__Variable__NameAssignment ) )
            {
            // InternalVizualizer.g:592:2: ( ( rule__Variable__NameAssignment ) )
            // InternalVizualizer.g:593:3: ( rule__Variable__NameAssignment )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment()); 
            // InternalVizualizer.g:594:3: ( rule__Variable__NameAssignment )
            // InternalVizualizer.g:594:4: rule__Variable__NameAssignment
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
    // InternalVizualizer.g:603:1: ruleSchemaType : ( ( rule__SchemaType__Alternatives ) ) ;
    public final void ruleSchemaType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:607:1: ( ( ( rule__SchemaType__Alternatives ) ) )
            // InternalVizualizer.g:608:2: ( ( rule__SchemaType__Alternatives ) )
            {
            // InternalVizualizer.g:608:2: ( ( rule__SchemaType__Alternatives ) )
            // InternalVizualizer.g:609:3: ( rule__SchemaType__Alternatives )
            {
             before(grammarAccess.getSchemaTypeAccess().getAlternatives()); 
            // InternalVizualizer.g:610:3: ( rule__SchemaType__Alternatives )
            // InternalVizualizer.g:610:4: rule__SchemaType__Alternatives
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
    // InternalVizualizer.g:618:1: rule__System__Alternatives : ( ( ( rule__System__PagesAssignment_0 ) ) | ( ( rule__System__SourcesAssignment_1 ) ) | ( ( rule__System__SchemasAssignment_2 ) ) );
    public final void rule__System__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:622:1: ( ( ( rule__System__PagesAssignment_0 ) ) | ( ( rule__System__SourcesAssignment_1 ) ) | ( ( rule__System__SchemasAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 24:
            case 32:
            case 35:
                {
                alt2=2;
                }
                break;
            case 37:
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
                    // InternalVizualizer.g:623:2: ( ( rule__System__PagesAssignment_0 ) )
                    {
                    // InternalVizualizer.g:623:2: ( ( rule__System__PagesAssignment_0 ) )
                    // InternalVizualizer.g:624:3: ( rule__System__PagesAssignment_0 )
                    {
                     before(grammarAccess.getSystemAccess().getPagesAssignment_0()); 
                    // InternalVizualizer.g:625:3: ( rule__System__PagesAssignment_0 )
                    // InternalVizualizer.g:625:4: rule__System__PagesAssignment_0
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
                    // InternalVizualizer.g:629:2: ( ( rule__System__SourcesAssignment_1 ) )
                    {
                    // InternalVizualizer.g:629:2: ( ( rule__System__SourcesAssignment_1 ) )
                    // InternalVizualizer.g:630:3: ( rule__System__SourcesAssignment_1 )
                    {
                     before(grammarAccess.getSystemAccess().getSourcesAssignment_1()); 
                    // InternalVizualizer.g:631:3: ( rule__System__SourcesAssignment_1 )
                    // InternalVizualizer.g:631:4: rule__System__SourcesAssignment_1
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
                    // InternalVizualizer.g:635:2: ( ( rule__System__SchemasAssignment_2 ) )
                    {
                    // InternalVizualizer.g:635:2: ( ( rule__System__SchemasAssignment_2 ) )
                    // InternalVizualizer.g:636:3: ( rule__System__SchemasAssignment_2 )
                    {
                     before(grammarAccess.getSystemAccess().getSchemasAssignment_2()); 
                    // InternalVizualizer.g:637:3: ( rule__System__SchemasAssignment_2 )
                    // InternalVizualizer.g:637:4: rule__System__SchemasAssignment_2
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
    // InternalVizualizer.g:645:1: rule__Tile__Alternatives : ( ( ruleLink ) | ( ruleGraph ) );
    public final void rule__Tile__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:649:1: ( ( ruleLink ) | ( ruleGraph ) )
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
                    // InternalVizualizer.g:650:2: ( ruleLink )
                    {
                    // InternalVizualizer.g:650:2: ( ruleLink )
                    // InternalVizualizer.g:651:3: ruleLink
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
                    // InternalVizualizer.g:656:2: ( ruleGraph )
                    {
                    // InternalVizualizer.g:656:2: ( ruleGraph )
                    // InternalVizualizer.g:657:3: ruleGraph
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
    // InternalVizualizer.g:666:1: rule__Source__Alternatives : ( ( ruleEndPoint ) | ( ruleDatasource ) );
    public final void rule__Source__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:670:1: ( ( ruleEndPoint ) | ( ruleDatasource ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==32||LA4_0==35) ) {
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
                    // InternalVizualizer.g:671:2: ( ruleEndPoint )
                    {
                    // InternalVizualizer.g:671:2: ( ruleEndPoint )
                    // InternalVizualizer.g:672:3: ruleEndPoint
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
                    // InternalVizualizer.g:677:2: ( ruleDatasource )
                    {
                    // InternalVizualizer.g:677:2: ( ruleDatasource )
                    // InternalVizualizer.g:678:3: ruleDatasource
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
    // InternalVizualizer.g:687:1: rule__EndPoint__Alternatives : ( ( ruleGetEndPoint ) | ( rulePostEndPoint ) );
    public final void rule__EndPoint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:691:1: ( ( ruleGetEndPoint ) | ( rulePostEndPoint ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==35) ) {
                alt5=1;
            }
            else if ( (LA5_0==32) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalVizualizer.g:692:2: ( ruleGetEndPoint )
                    {
                    // InternalVizualizer.g:692:2: ( ruleGetEndPoint )
                    // InternalVizualizer.g:693:3: ruleGetEndPoint
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
                    // InternalVizualizer.g:698:2: ( rulePostEndPoint )
                    {
                    // InternalVizualizer.g:698:2: ( rulePostEndPoint )
                    // InternalVizualizer.g:699:3: rulePostEndPoint
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
    // InternalVizualizer.g:708:1: rule__Op1__Alternatives : ( ( '+' ) | ( '-' ) );
    public final void rule__Op1__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:712:1: ( ( '+' ) | ( '-' ) )
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
                    // InternalVizualizer.g:713:2: ( '+' )
                    {
                    // InternalVizualizer.g:713:2: ( '+' )
                    // InternalVizualizer.g:714:3: '+'
                    {
                     before(grammarAccess.getOp1Access().getPlusSignKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getOp1Access().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:719:2: ( '-' )
                    {
                    // InternalVizualizer.g:719:2: ( '-' )
                    // InternalVizualizer.g:720:3: '-'
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
    // InternalVizualizer.g:729:1: rule__Op2__Alternatives : ( ( '*' ) | ( '/' ) );
    public final void rule__Op2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:733:1: ( ( '*' ) | ( '/' ) )
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
                    // InternalVizualizer.g:734:2: ( '*' )
                    {
                    // InternalVizualizer.g:734:2: ( '*' )
                    // InternalVizualizer.g:735:3: '*'
                    {
                     before(grammarAccess.getOp2Access().getAsteriskKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getOp2Access().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:740:2: ( '/' )
                    {
                    // InternalVizualizer.g:740:2: ( '/' )
                    // InternalVizualizer.g:741:3: '/'
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
    // InternalVizualizer.g:750:1: rule__Primitive__Alternatives : ( ( ruleNumber ) | ( ruleVariable ) | ( ( rule__Primitive__Group_2__0 ) ) );
    public final void rule__Primitive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:754:1: ( ( ruleNumber ) | ( ruleVariable ) | ( ( rule__Primitive__Group_2__0 ) ) )
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
            case 41:
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
                    // InternalVizualizer.g:755:2: ( ruleNumber )
                    {
                    // InternalVizualizer.g:755:2: ( ruleNumber )
                    // InternalVizualizer.g:756:3: ruleNumber
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
                    // InternalVizualizer.g:761:2: ( ruleVariable )
                    {
                    // InternalVizualizer.g:761:2: ( ruleVariable )
                    // InternalVizualizer.g:762:3: ruleVariable
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
                    // InternalVizualizer.g:767:2: ( ( rule__Primitive__Group_2__0 ) )
                    {
                    // InternalVizualizer.g:767:2: ( ( rule__Primitive__Group_2__0 ) )
                    // InternalVizualizer.g:768:3: ( rule__Primitive__Group_2__0 )
                    {
                     before(grammarAccess.getPrimitiveAccess().getGroup_2()); 
                    // InternalVizualizer.g:769:3: ( rule__Primitive__Group_2__0 )
                    // InternalVizualizer.g:769:4: rule__Primitive__Group_2__0
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
    // InternalVizualizer.g:777:1: rule__SchemaType__Alternatives : ( ( ( 'XML' ) ) | ( ( 'CSV' ) ) | ( ( 'JSON' ) ) );
    public final void rule__SchemaType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:781:1: ( ( ( 'XML' ) ) | ( ( 'CSV' ) ) | ( ( 'JSON' ) ) )
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
                    // InternalVizualizer.g:782:2: ( ( 'XML' ) )
                    {
                    // InternalVizualizer.g:782:2: ( ( 'XML' ) )
                    // InternalVizualizer.g:783:3: ( 'XML' )
                    {
                     before(grammarAccess.getSchemaTypeAccess().getXMLEnumLiteralDeclaration_0()); 
                    // InternalVizualizer.g:784:3: ( 'XML' )
                    // InternalVizualizer.g:784:4: 'XML'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getSchemaTypeAccess().getXMLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:788:2: ( ( 'CSV' ) )
                    {
                    // InternalVizualizer.g:788:2: ( ( 'CSV' ) )
                    // InternalVizualizer.g:789:3: ( 'CSV' )
                    {
                     before(grammarAccess.getSchemaTypeAccess().getCSVEnumLiteralDeclaration_1()); 
                    // InternalVizualizer.g:790:3: ( 'CSV' )
                    // InternalVizualizer.g:790:4: 'CSV'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getSchemaTypeAccess().getCSVEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVizualizer.g:794:2: ( ( 'JSON' ) )
                    {
                    // InternalVizualizer.g:794:2: ( ( 'JSON' ) )
                    // InternalVizualizer.g:795:3: ( 'JSON' )
                    {
                     before(grammarAccess.getSchemaTypeAccess().getJSONEnumLiteralDeclaration_2()); 
                    // InternalVizualizer.g:796:3: ( 'JSON' )
                    // InternalVizualizer.g:796:4: 'JSON'
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
    // InternalVizualizer.g:804:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:808:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // InternalVizualizer.g:809:2: rule__Page__Group__0__Impl rule__Page__Group__1
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
    // InternalVizualizer.g:816:1: rule__Page__Group__0__Impl : ( 'Page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:820:1: ( ( 'Page' ) )
            // InternalVizualizer.g:821:1: ( 'Page' )
            {
            // InternalVizualizer.g:821:1: ( 'Page' )
            // InternalVizualizer.g:822:2: 'Page'
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
    // InternalVizualizer.g:831:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:835:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // InternalVizualizer.g:836:2: rule__Page__Group__1__Impl rule__Page__Group__2
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
    // InternalVizualizer.g:843:1: rule__Page__Group__1__Impl : ( ( rule__Page__NameAssignment_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:847:1: ( ( ( rule__Page__NameAssignment_1 ) ) )
            // InternalVizualizer.g:848:1: ( ( rule__Page__NameAssignment_1 ) )
            {
            // InternalVizualizer.g:848:1: ( ( rule__Page__NameAssignment_1 ) )
            // InternalVizualizer.g:849:2: ( rule__Page__NameAssignment_1 )
            {
             before(grammarAccess.getPageAccess().getNameAssignment_1()); 
            // InternalVizualizer.g:850:2: ( rule__Page__NameAssignment_1 )
            // InternalVizualizer.g:850:3: rule__Page__NameAssignment_1
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
    // InternalVizualizer.g:858:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:862:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // InternalVizualizer.g:863:2: rule__Page__Group__2__Impl rule__Page__Group__3
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
    // InternalVizualizer.g:870:1: rule__Page__Group__2__Impl : ( '{' ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:874:1: ( ( '{' ) )
            // InternalVizualizer.g:875:1: ( '{' )
            {
            // InternalVizualizer.g:875:1: ( '{' )
            // InternalVizualizer.g:876:2: '{'
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
    // InternalVizualizer.g:885:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:889:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // InternalVizualizer.g:890:2: rule__Page__Group__3__Impl rule__Page__Group__4
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
    // InternalVizualizer.g:897:1: rule__Page__Group__3__Impl : ( ( rule__Page__TilesAssignment_3 )* ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:901:1: ( ( ( rule__Page__TilesAssignment_3 )* ) )
            // InternalVizualizer.g:902:1: ( ( rule__Page__TilesAssignment_3 )* )
            {
            // InternalVizualizer.g:902:1: ( ( rule__Page__TilesAssignment_3 )* )
            // InternalVizualizer.g:903:2: ( rule__Page__TilesAssignment_3 )*
            {
             before(grammarAccess.getPageAccess().getTilesAssignment_3()); 
            // InternalVizualizer.g:904:2: ( rule__Page__TilesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21||LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalVizualizer.g:904:3: rule__Page__TilesAssignment_3
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
    // InternalVizualizer.g:912:1: rule__Page__Group__4 : rule__Page__Group__4__Impl ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:916:1: ( rule__Page__Group__4__Impl )
            // InternalVizualizer.g:917:2: rule__Page__Group__4__Impl
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
    // InternalVizualizer.g:923:1: rule__Page__Group__4__Impl : ( '}' ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:927:1: ( ( '}' ) )
            // InternalVizualizer.g:928:1: ( '}' )
            {
            // InternalVizualizer.g:928:1: ( '}' )
            // InternalVizualizer.g:929:2: '}'
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
    // InternalVizualizer.g:939:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:943:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalVizualizer.g:944:2: rule__Link__Group__0__Impl rule__Link__Group__1
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
    // InternalVizualizer.g:951:1: rule__Link__Group__0__Impl : ( 'Link' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:955:1: ( ( 'Link' ) )
            // InternalVizualizer.g:956:1: ( 'Link' )
            {
            // InternalVizualizer.g:956:1: ( 'Link' )
            // InternalVizualizer.g:957:2: 'Link'
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
    // InternalVizualizer.g:966:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:970:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalVizualizer.g:971:2: rule__Link__Group__1__Impl rule__Link__Group__2
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
    // InternalVizualizer.g:978:1: rule__Link__Group__1__Impl : ( ( rule__Link__NameAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:982:1: ( ( ( rule__Link__NameAssignment_1 ) ) )
            // InternalVizualizer.g:983:1: ( ( rule__Link__NameAssignment_1 ) )
            {
            // InternalVizualizer.g:983:1: ( ( rule__Link__NameAssignment_1 ) )
            // InternalVizualizer.g:984:2: ( rule__Link__NameAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_1()); 
            // InternalVizualizer.g:985:2: ( rule__Link__NameAssignment_1 )
            // InternalVizualizer.g:985:3: rule__Link__NameAssignment_1
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
    // InternalVizualizer.g:993:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:997:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalVizualizer.g:998:2: rule__Link__Group__2__Impl rule__Link__Group__3
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
    // InternalVizualizer.g:1005:1: rule__Link__Group__2__Impl : ( 'to' ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1009:1: ( ( 'to' ) )
            // InternalVizualizer.g:1010:1: ( 'to' )
            {
            // InternalVizualizer.g:1010:1: ( 'to' )
            // InternalVizualizer.g:1011:2: 'to'
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
    // InternalVizualizer.g:1020:1: rule__Link__Group__3 : rule__Link__Group__3__Impl ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1024:1: ( rule__Link__Group__3__Impl )
            // InternalVizualizer.g:1025:2: rule__Link__Group__3__Impl
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
    // InternalVizualizer.g:1031:1: rule__Link__Group__3__Impl : ( ( rule__Link__PageAssignment_3 ) ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1035:1: ( ( ( rule__Link__PageAssignment_3 ) ) )
            // InternalVizualizer.g:1036:1: ( ( rule__Link__PageAssignment_3 ) )
            {
            // InternalVizualizer.g:1036:1: ( ( rule__Link__PageAssignment_3 ) )
            // InternalVizualizer.g:1037:2: ( rule__Link__PageAssignment_3 )
            {
             before(grammarAccess.getLinkAccess().getPageAssignment_3()); 
            // InternalVizualizer.g:1038:2: ( rule__Link__PageAssignment_3 )
            // InternalVizualizer.g:1038:3: rule__Link__PageAssignment_3
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
    // InternalVizualizer.g:1047:1: rule__Graph__Group__0 : rule__Graph__Group__0__Impl rule__Graph__Group__1 ;
    public final void rule__Graph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1051:1: ( rule__Graph__Group__0__Impl rule__Graph__Group__1 )
            // InternalVizualizer.g:1052:2: rule__Graph__Group__0__Impl rule__Graph__Group__1
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
    // InternalVizualizer.g:1059:1: rule__Graph__Group__0__Impl : ( 'Graph' ) ;
    public final void rule__Graph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1063:1: ( ( 'Graph' ) )
            // InternalVizualizer.g:1064:1: ( 'Graph' )
            {
            // InternalVizualizer.g:1064:1: ( 'Graph' )
            // InternalVizualizer.g:1065:2: 'Graph'
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
    // InternalVizualizer.g:1074:1: rule__Graph__Group__1 : rule__Graph__Group__1__Impl rule__Graph__Group__2 ;
    public final void rule__Graph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1078:1: ( rule__Graph__Group__1__Impl rule__Graph__Group__2 )
            // InternalVizualizer.g:1079:2: rule__Graph__Group__1__Impl rule__Graph__Group__2
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
    // InternalVizualizer.g:1086:1: rule__Graph__Group__1__Impl : ( ( rule__Graph__NameAssignment_1 ) ) ;
    public final void rule__Graph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1090:1: ( ( ( rule__Graph__NameAssignment_1 ) ) )
            // InternalVizualizer.g:1091:1: ( ( rule__Graph__NameAssignment_1 ) )
            {
            // InternalVizualizer.g:1091:1: ( ( rule__Graph__NameAssignment_1 ) )
            // InternalVizualizer.g:1092:2: ( rule__Graph__NameAssignment_1 )
            {
             before(grammarAccess.getGraphAccess().getNameAssignment_1()); 
            // InternalVizualizer.g:1093:2: ( rule__Graph__NameAssignment_1 )
            // InternalVizualizer.g:1093:3: rule__Graph__NameAssignment_1
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
    // InternalVizualizer.g:1101:1: rule__Graph__Group__2 : rule__Graph__Group__2__Impl ;
    public final void rule__Graph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1105:1: ( rule__Graph__Group__2__Impl )
            // InternalVizualizer.g:1106:2: rule__Graph__Group__2__Impl
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
    // InternalVizualizer.g:1112:1: rule__Graph__Group__2__Impl : ( ( rule__Graph__SourceAssignment_2 ) ) ;
    public final void rule__Graph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1116:1: ( ( ( rule__Graph__SourceAssignment_2 ) ) )
            // InternalVizualizer.g:1117:1: ( ( rule__Graph__SourceAssignment_2 ) )
            {
            // InternalVizualizer.g:1117:1: ( ( rule__Graph__SourceAssignment_2 ) )
            // InternalVizualizer.g:1118:2: ( rule__Graph__SourceAssignment_2 )
            {
             before(grammarAccess.getGraphAccess().getSourceAssignment_2()); 
            // InternalVizualizer.g:1119:2: ( rule__Graph__SourceAssignment_2 )
            // InternalVizualizer.g:1119:3: rule__Graph__SourceAssignment_2
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
    // InternalVizualizer.g:1128:1: rule__Datasource__Group__0 : rule__Datasource__Group__0__Impl rule__Datasource__Group__1 ;
    public final void rule__Datasource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1132:1: ( rule__Datasource__Group__0__Impl rule__Datasource__Group__1 )
            // InternalVizualizer.g:1133:2: rule__Datasource__Group__0__Impl rule__Datasource__Group__1
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
    // InternalVizualizer.g:1140:1: rule__Datasource__Group__0__Impl : ( 'Datasource' ) ;
    public final void rule__Datasource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1144:1: ( ( 'Datasource' ) )
            // InternalVizualizer.g:1145:1: ( 'Datasource' )
            {
            // InternalVizualizer.g:1145:1: ( 'Datasource' )
            // InternalVizualizer.g:1146:2: 'Datasource'
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
    // InternalVizualizer.g:1155:1: rule__Datasource__Group__1 : rule__Datasource__Group__1__Impl rule__Datasource__Group__2 ;
    public final void rule__Datasource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1159:1: ( rule__Datasource__Group__1__Impl rule__Datasource__Group__2 )
            // InternalVizualizer.g:1160:2: rule__Datasource__Group__1__Impl rule__Datasource__Group__2
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
    // InternalVizualizer.g:1167:1: rule__Datasource__Group__1__Impl : ( ( rule__Datasource__NameAssignment_1 ) ) ;
    public final void rule__Datasource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1171:1: ( ( ( rule__Datasource__NameAssignment_1 ) ) )
            // InternalVizualizer.g:1172:1: ( ( rule__Datasource__NameAssignment_1 ) )
            {
            // InternalVizualizer.g:1172:1: ( ( rule__Datasource__NameAssignment_1 ) )
            // InternalVizualizer.g:1173:2: ( rule__Datasource__NameAssignment_1 )
            {
             before(grammarAccess.getDatasourceAccess().getNameAssignment_1()); 
            // InternalVizualizer.g:1174:2: ( rule__Datasource__NameAssignment_1 )
            // InternalVizualizer.g:1174:3: rule__Datasource__NameAssignment_1
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
    // InternalVizualizer.g:1182:1: rule__Datasource__Group__2 : rule__Datasource__Group__2__Impl rule__Datasource__Group__3 ;
    public final void rule__Datasource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1186:1: ( rule__Datasource__Group__2__Impl rule__Datasource__Group__3 )
            // InternalVizualizer.g:1187:2: rule__Datasource__Group__2__Impl rule__Datasource__Group__3
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
    // InternalVizualizer.g:1194:1: rule__Datasource__Group__2__Impl : ( '{' ) ;
    public final void rule__Datasource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1198:1: ( ( '{' ) )
            // InternalVizualizer.g:1199:1: ( '{' )
            {
            // InternalVizualizer.g:1199:1: ( '{' )
            // InternalVizualizer.g:1200:2: '{'
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
    // InternalVizualizer.g:1209:1: rule__Datasource__Group__3 : rule__Datasource__Group__3__Impl rule__Datasource__Group__4 ;
    public final void rule__Datasource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1213:1: ( rule__Datasource__Group__3__Impl rule__Datasource__Group__4 )
            // InternalVizualizer.g:1214:2: rule__Datasource__Group__3__Impl rule__Datasource__Group__4
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
    // InternalVizualizer.g:1221:1: rule__Datasource__Group__3__Impl : ( 'Source' ) ;
    public final void rule__Datasource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1225:1: ( ( 'Source' ) )
            // InternalVizualizer.g:1226:1: ( 'Source' )
            {
            // InternalVizualizer.g:1226:1: ( 'Source' )
            // InternalVizualizer.g:1227:2: 'Source'
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
    // InternalVizualizer.g:1236:1: rule__Datasource__Group__4 : rule__Datasource__Group__4__Impl rule__Datasource__Group__5 ;
    public final void rule__Datasource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1240:1: ( rule__Datasource__Group__4__Impl rule__Datasource__Group__5 )
            // InternalVizualizer.g:1241:2: rule__Datasource__Group__4__Impl rule__Datasource__Group__5
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
    // InternalVizualizer.g:1248:1: rule__Datasource__Group__4__Impl : ( ( rule__Datasource__SourceAssignment_4 ) ) ;
    public final void rule__Datasource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1252:1: ( ( ( rule__Datasource__SourceAssignment_4 ) ) )
            // InternalVizualizer.g:1253:1: ( ( rule__Datasource__SourceAssignment_4 ) )
            {
            // InternalVizualizer.g:1253:1: ( ( rule__Datasource__SourceAssignment_4 ) )
            // InternalVizualizer.g:1254:2: ( rule__Datasource__SourceAssignment_4 )
            {
             before(grammarAccess.getDatasourceAccess().getSourceAssignment_4()); 
            // InternalVizualizer.g:1255:2: ( rule__Datasource__SourceAssignment_4 )
            // InternalVizualizer.g:1255:3: rule__Datasource__SourceAssignment_4
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
    // InternalVizualizer.g:1263:1: rule__Datasource__Group__5 : rule__Datasource__Group__5__Impl rule__Datasource__Group__6 ;
    public final void rule__Datasource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1267:1: ( rule__Datasource__Group__5__Impl rule__Datasource__Group__6 )
            // InternalVizualizer.g:1268:2: rule__Datasource__Group__5__Impl rule__Datasource__Group__6
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
    // InternalVizualizer.g:1275:1: rule__Datasource__Group__5__Impl : ( 'Dimensions' ) ;
    public final void rule__Datasource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1279:1: ( ( 'Dimensions' ) )
            // InternalVizualizer.g:1280:1: ( 'Dimensions' )
            {
            // InternalVizualizer.g:1280:1: ( 'Dimensions' )
            // InternalVizualizer.g:1281:2: 'Dimensions'
            {
             before(grammarAccess.getDatasourceAccess().getDimensionsKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDatasourceAccess().getDimensionsKeyword_5()); 

            }


            }

        }
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
    // InternalVizualizer.g:1290:1: rule__Datasource__Group__6 : rule__Datasource__Group__6__Impl rule__Datasource__Group__7 ;
    public final void rule__Datasource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1294:1: ( rule__Datasource__Group__6__Impl rule__Datasource__Group__7 )
            // InternalVizualizer.g:1295:2: rule__Datasource__Group__6__Impl rule__Datasource__Group__7
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
    // InternalVizualizer.g:1302:1: rule__Datasource__Group__6__Impl : ( ':' ) ;
    public final void rule__Datasource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1306:1: ( ( ':' ) )
            // InternalVizualizer.g:1307:1: ( ':' )
            {
            // InternalVizualizer.g:1307:1: ( ':' )
            // InternalVizualizer.g:1308:2: ':'
            {
             before(grammarAccess.getDatasourceAccess().getColonKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDatasourceAccess().getColonKeyword_6()); 

            }


            }

        }
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
    // InternalVizualizer.g:1317:1: rule__Datasource__Group__7 : rule__Datasource__Group__7__Impl rule__Datasource__Group__8 ;
    public final void rule__Datasource__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1321:1: ( rule__Datasource__Group__7__Impl rule__Datasource__Group__8 )
            // InternalVizualizer.g:1322:2: rule__Datasource__Group__7__Impl rule__Datasource__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Datasource__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Datasource__Group__8();

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
    // InternalVizualizer.g:1329:1: rule__Datasource__Group__7__Impl : ( ( rule__Datasource__DimensionsAssignment_7 ) ) ;
    public final void rule__Datasource__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1333:1: ( ( ( rule__Datasource__DimensionsAssignment_7 ) ) )
            // InternalVizualizer.g:1334:1: ( ( rule__Datasource__DimensionsAssignment_7 ) )
            {
            // InternalVizualizer.g:1334:1: ( ( rule__Datasource__DimensionsAssignment_7 ) )
            // InternalVizualizer.g:1335:2: ( rule__Datasource__DimensionsAssignment_7 )
            {
             before(grammarAccess.getDatasourceAccess().getDimensionsAssignment_7()); 
            // InternalVizualizer.g:1336:2: ( rule__Datasource__DimensionsAssignment_7 )
            // InternalVizualizer.g:1336:3: rule__Datasource__DimensionsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Datasource__DimensionsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDatasourceAccess().getDimensionsAssignment_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Datasource__Group__8"
    // InternalVizualizer.g:1344:1: rule__Datasource__Group__8 : rule__Datasource__Group__8__Impl rule__Datasource__Group__9 ;
    public final void rule__Datasource__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1348:1: ( rule__Datasource__Group__8__Impl rule__Datasource__Group__9 )
            // InternalVizualizer.g:1349:2: rule__Datasource__Group__8__Impl rule__Datasource__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__Datasource__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Datasource__Group__9();

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
    // $ANTLR end "rule__Datasource__Group__8"


    // $ANTLR start "rule__Datasource__Group__8__Impl"
    // InternalVizualizer.g:1356:1: rule__Datasource__Group__8__Impl : ( ( rule__Datasource__Group_8__0 )* ) ;
    public final void rule__Datasource__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1360:1: ( ( ( rule__Datasource__Group_8__0 )* ) )
            // InternalVizualizer.g:1361:1: ( ( rule__Datasource__Group_8__0 )* )
            {
            // InternalVizualizer.g:1361:1: ( ( rule__Datasource__Group_8__0 )* )
            // InternalVizualizer.g:1362:2: ( rule__Datasource__Group_8__0 )*
            {
             before(grammarAccess.getDatasourceAccess().getGroup_8()); 
            // InternalVizualizer.g:1363:2: ( rule__Datasource__Group_8__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalVizualizer.g:1363:3: rule__Datasource__Group_8__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Datasource__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getDatasourceAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Group__8__Impl"


    // $ANTLR start "rule__Datasource__Group__9"
    // InternalVizualizer.g:1371:1: rule__Datasource__Group__9 : rule__Datasource__Group__9__Impl ;
    public final void rule__Datasource__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1375:1: ( rule__Datasource__Group__9__Impl )
            // InternalVizualizer.g:1376:2: rule__Datasource__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Datasource__Group__9__Impl();

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
    // $ANTLR end "rule__Datasource__Group__9"


    // $ANTLR start "rule__Datasource__Group__9__Impl"
    // InternalVizualizer.g:1382:1: rule__Datasource__Group__9__Impl : ( '}' ) ;
    public final void rule__Datasource__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1386:1: ( ( '}' ) )
            // InternalVizualizer.g:1387:1: ( '}' )
            {
            // InternalVizualizer.g:1387:1: ( '}' )
            // InternalVizualizer.g:1388:2: '}'
            {
             before(grammarAccess.getDatasourceAccess().getRightCurlyBracketKeyword_9()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDatasourceAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Group__9__Impl"


    // $ANTLR start "rule__Datasource__Group_8__0"
    // InternalVizualizer.g:1398:1: rule__Datasource__Group_8__0 : rule__Datasource__Group_8__0__Impl rule__Datasource__Group_8__1 ;
    public final void rule__Datasource__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1402:1: ( rule__Datasource__Group_8__0__Impl rule__Datasource__Group_8__1 )
            // InternalVizualizer.g:1403:2: rule__Datasource__Group_8__0__Impl rule__Datasource__Group_8__1
            {
            pushFollow(FOLLOW_12);
            rule__Datasource__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Datasource__Group_8__1();

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
    // $ANTLR end "rule__Datasource__Group_8__0"


    // $ANTLR start "rule__Datasource__Group_8__0__Impl"
    // InternalVizualizer.g:1410:1: rule__Datasource__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Datasource__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1414:1: ( ( ',' ) )
            // InternalVizualizer.g:1415:1: ( ',' )
            {
            // InternalVizualizer.g:1415:1: ( ',' )
            // InternalVizualizer.g:1416:2: ','
            {
             before(grammarAccess.getDatasourceAccess().getCommaKeyword_8_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDatasourceAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Group_8__0__Impl"


    // $ANTLR start "rule__Datasource__Group_8__1"
    // InternalVizualizer.g:1425:1: rule__Datasource__Group_8__1 : rule__Datasource__Group_8__1__Impl ;
    public final void rule__Datasource__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1429:1: ( rule__Datasource__Group_8__1__Impl )
            // InternalVizualizer.g:1430:2: rule__Datasource__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Datasource__Group_8__1__Impl();

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
    // $ANTLR end "rule__Datasource__Group_8__1"


    // $ANTLR start "rule__Datasource__Group_8__1__Impl"
    // InternalVizualizer.g:1436:1: rule__Datasource__Group_8__1__Impl : ( ( rule__Datasource__DimensionsAssignment_8_1 ) ) ;
    public final void rule__Datasource__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1440:1: ( ( ( rule__Datasource__DimensionsAssignment_8_1 ) ) )
            // InternalVizualizer.g:1441:1: ( ( rule__Datasource__DimensionsAssignment_8_1 ) )
            {
            // InternalVizualizer.g:1441:1: ( ( rule__Datasource__DimensionsAssignment_8_1 ) )
            // InternalVizualizer.g:1442:2: ( rule__Datasource__DimensionsAssignment_8_1 )
            {
             before(grammarAccess.getDatasourceAccess().getDimensionsAssignment_8_1()); 
            // InternalVizualizer.g:1443:2: ( rule__Datasource__DimensionsAssignment_8_1 )
            // InternalVizualizer.g:1443:3: rule__Datasource__DimensionsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Datasource__DimensionsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getDatasourceAccess().getDimensionsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__Group_8__1__Impl"


    // $ANTLR start "rule__Dimension__Group__0"
    // InternalVizualizer.g:1452:1: rule__Dimension__Group__0 : rule__Dimension__Group__0__Impl rule__Dimension__Group__1 ;
    public final void rule__Dimension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1456:1: ( rule__Dimension__Group__0__Impl rule__Dimension__Group__1 )
            // InternalVizualizer.g:1457:2: rule__Dimension__Group__0__Impl rule__Dimension__Group__1
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
    // InternalVizualizer.g:1464:1: rule__Dimension__Group__0__Impl : ( 'Dimension' ) ;
    public final void rule__Dimension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1468:1: ( ( 'Dimension' ) )
            // InternalVizualizer.g:1469:1: ( 'Dimension' )
            {
            // InternalVizualizer.g:1469:1: ( 'Dimension' )
            // InternalVizualizer.g:1470:2: 'Dimension'
            {
             before(grammarAccess.getDimensionAccess().getDimensionKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDimensionAccess().getDimensionKeyword_0()); 

            }


            }

        }
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
    // InternalVizualizer.g:1479:1: rule__Dimension__Group__1 : rule__Dimension__Group__1__Impl rule__Dimension__Group__2 ;
    public final void rule__Dimension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1483:1: ( rule__Dimension__Group__1__Impl rule__Dimension__Group__2 )
            // InternalVizualizer.g:1484:2: rule__Dimension__Group__1__Impl rule__Dimension__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalVizualizer.g:1491:1: rule__Dimension__Group__1__Impl : ( ( rule__Dimension__NameAssignment_1 ) ) ;
    public final void rule__Dimension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1495:1: ( ( ( rule__Dimension__NameAssignment_1 ) ) )
            // InternalVizualizer.g:1496:1: ( ( rule__Dimension__NameAssignment_1 ) )
            {
            // InternalVizualizer.g:1496:1: ( ( rule__Dimension__NameAssignment_1 ) )
            // InternalVizualizer.g:1497:2: ( rule__Dimension__NameAssignment_1 )
            {
             before(grammarAccess.getDimensionAccess().getNameAssignment_1()); 
            // InternalVizualizer.g:1498:2: ( rule__Dimension__NameAssignment_1 )
            // InternalVizualizer.g:1498:3: rule__Dimension__NameAssignment_1
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
    // InternalVizualizer.g:1506:1: rule__Dimension__Group__2 : rule__Dimension__Group__2__Impl rule__Dimension__Group__3 ;
    public final void rule__Dimension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1510:1: ( rule__Dimension__Group__2__Impl rule__Dimension__Group__3 )
            // InternalVizualizer.g:1511:2: rule__Dimension__Group__2__Impl rule__Dimension__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalVizualizer.g:1518:1: rule__Dimension__Group__2__Impl : ( 'as' ) ;
    public final void rule__Dimension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1522:1: ( ( 'as' ) )
            // InternalVizualizer.g:1523:1: ( 'as' )
            {
            // InternalVizualizer.g:1523:1: ( 'as' )
            // InternalVizualizer.g:1524:2: 'as'
            {
             before(grammarAccess.getDimensionAccess().getAsKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDimensionAccess().getAsKeyword_2()); 

            }


            }

        }
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
    // InternalVizualizer.g:1533:1: rule__Dimension__Group__3 : rule__Dimension__Group__3__Impl rule__Dimension__Group__4 ;
    public final void rule__Dimension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1537:1: ( rule__Dimension__Group__3__Impl rule__Dimension__Group__4 )
            // InternalVizualizer.g:1538:2: rule__Dimension__Group__3__Impl rule__Dimension__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Dimension__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dimension__Group__4();

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
    // InternalVizualizer.g:1545:1: rule__Dimension__Group__3__Impl : ( 'Formula' ) ;
    public final void rule__Dimension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1549:1: ( ( 'Formula' ) )
            // InternalVizualizer.g:1550:1: ( 'Formula' )
            {
            // InternalVizualizer.g:1550:1: ( 'Formula' )
            // InternalVizualizer.g:1551:2: 'Formula'
            {
             before(grammarAccess.getDimensionAccess().getFormulaKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDimensionAccess().getFormulaKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Dimension__Group__4"
    // InternalVizualizer.g:1560:1: rule__Dimension__Group__4 : rule__Dimension__Group__4__Impl ;
    public final void rule__Dimension__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1564:1: ( rule__Dimension__Group__4__Impl )
            // InternalVizualizer.g:1565:2: rule__Dimension__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dimension__Group__4__Impl();

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
    // $ANTLR end "rule__Dimension__Group__4"


    // $ANTLR start "rule__Dimension__Group__4__Impl"
    // InternalVizualizer.g:1571:1: rule__Dimension__Group__4__Impl : ( ( rule__Dimension__FormulaAssignment_4 ) ) ;
    public final void rule__Dimension__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1575:1: ( ( ( rule__Dimension__FormulaAssignment_4 ) ) )
            // InternalVizualizer.g:1576:1: ( ( rule__Dimension__FormulaAssignment_4 ) )
            {
            // InternalVizualizer.g:1576:1: ( ( rule__Dimension__FormulaAssignment_4 ) )
            // InternalVizualizer.g:1577:2: ( rule__Dimension__FormulaAssignment_4 )
            {
             before(grammarAccess.getDimensionAccess().getFormulaAssignment_4()); 
            // InternalVizualizer.g:1578:2: ( rule__Dimension__FormulaAssignment_4 )
            // InternalVizualizer.g:1578:3: rule__Dimension__FormulaAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Dimension__FormulaAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDimensionAccess().getFormulaAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__4__Impl"


    // $ANTLR start "rule__PostEndPoint__Group__0"
    // InternalVizualizer.g:1587:1: rule__PostEndPoint__Group__0 : rule__PostEndPoint__Group__0__Impl rule__PostEndPoint__Group__1 ;
    public final void rule__PostEndPoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1591:1: ( rule__PostEndPoint__Group__0__Impl rule__PostEndPoint__Group__1 )
            // InternalVizualizer.g:1592:2: rule__PostEndPoint__Group__0__Impl rule__PostEndPoint__Group__1
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
    // InternalVizualizer.g:1599:1: rule__PostEndPoint__Group__0__Impl : ( 'PostPoint' ) ;
    public final void rule__PostEndPoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1603:1: ( ( 'PostPoint' ) )
            // InternalVizualizer.g:1604:1: ( 'PostPoint' )
            {
            // InternalVizualizer.g:1604:1: ( 'PostPoint' )
            // InternalVizualizer.g:1605:2: 'PostPoint'
            {
             before(grammarAccess.getPostEndPointAccess().getPostPointKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalVizualizer.g:1614:1: rule__PostEndPoint__Group__1 : rule__PostEndPoint__Group__1__Impl rule__PostEndPoint__Group__2 ;
    public final void rule__PostEndPoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1618:1: ( rule__PostEndPoint__Group__1__Impl rule__PostEndPoint__Group__2 )
            // InternalVizualizer.g:1619:2: rule__PostEndPoint__Group__1__Impl rule__PostEndPoint__Group__2
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
    // InternalVizualizer.g:1626:1: rule__PostEndPoint__Group__1__Impl : ( ( rule__PostEndPoint__NameAssignment_1 ) ) ;
    public final void rule__PostEndPoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1630:1: ( ( ( rule__PostEndPoint__NameAssignment_1 ) ) )
            // InternalVizualizer.g:1631:1: ( ( rule__PostEndPoint__NameAssignment_1 ) )
            {
            // InternalVizualizer.g:1631:1: ( ( rule__PostEndPoint__NameAssignment_1 ) )
            // InternalVizualizer.g:1632:2: ( rule__PostEndPoint__NameAssignment_1 )
            {
             before(grammarAccess.getPostEndPointAccess().getNameAssignment_1()); 
            // InternalVizualizer.g:1633:2: ( rule__PostEndPoint__NameAssignment_1 )
            // InternalVizualizer.g:1633:3: rule__PostEndPoint__NameAssignment_1
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
    // InternalVizualizer.g:1641:1: rule__PostEndPoint__Group__2 : rule__PostEndPoint__Group__2__Impl rule__PostEndPoint__Group__3 ;
    public final void rule__PostEndPoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1645:1: ( rule__PostEndPoint__Group__2__Impl rule__PostEndPoint__Group__3 )
            // InternalVizualizer.g:1646:2: rule__PostEndPoint__Group__2__Impl rule__PostEndPoint__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalVizualizer.g:1653:1: rule__PostEndPoint__Group__2__Impl : ( '{' ) ;
    public final void rule__PostEndPoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1657:1: ( ( '{' ) )
            // InternalVizualizer.g:1658:1: ( '{' )
            {
            // InternalVizualizer.g:1658:1: ( '{' )
            // InternalVizualizer.g:1659:2: '{'
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
    // InternalVizualizer.g:1668:1: rule__PostEndPoint__Group__3 : rule__PostEndPoint__Group__3__Impl rule__PostEndPoint__Group__4 ;
    public final void rule__PostEndPoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1672:1: ( rule__PostEndPoint__Group__3__Impl rule__PostEndPoint__Group__4 )
            // InternalVizualizer.g:1673:2: rule__PostEndPoint__Group__3__Impl rule__PostEndPoint__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalVizualizer.g:1680:1: rule__PostEndPoint__Group__3__Impl : ( 'url' ) ;
    public final void rule__PostEndPoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1684:1: ( ( 'url' ) )
            // InternalVizualizer.g:1685:1: ( 'url' )
            {
            // InternalVizualizer.g:1685:1: ( 'url' )
            // InternalVizualizer.g:1686:2: 'url'
            {
             before(grammarAccess.getPostEndPointAccess().getUrlKeyword_3()); 
            match(input,33,FOLLOW_2); 
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
    // InternalVizualizer.g:1695:1: rule__PostEndPoint__Group__4 : rule__PostEndPoint__Group__4__Impl rule__PostEndPoint__Group__5 ;
    public final void rule__PostEndPoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1699:1: ( rule__PostEndPoint__Group__4__Impl rule__PostEndPoint__Group__5 )
            // InternalVizualizer.g:1700:2: rule__PostEndPoint__Group__4__Impl rule__PostEndPoint__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalVizualizer.g:1707:1: rule__PostEndPoint__Group__4__Impl : ( ( rule__PostEndPoint__UrlAssignment_4 ) ) ;
    public final void rule__PostEndPoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1711:1: ( ( ( rule__PostEndPoint__UrlAssignment_4 ) ) )
            // InternalVizualizer.g:1712:1: ( ( rule__PostEndPoint__UrlAssignment_4 ) )
            {
            // InternalVizualizer.g:1712:1: ( ( rule__PostEndPoint__UrlAssignment_4 ) )
            // InternalVizualizer.g:1713:2: ( rule__PostEndPoint__UrlAssignment_4 )
            {
             before(grammarAccess.getPostEndPointAccess().getUrlAssignment_4()); 
            // InternalVizualizer.g:1714:2: ( rule__PostEndPoint__UrlAssignment_4 )
            // InternalVizualizer.g:1714:3: rule__PostEndPoint__UrlAssignment_4
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
    // InternalVizualizer.g:1722:1: rule__PostEndPoint__Group__5 : rule__PostEndPoint__Group__5__Impl rule__PostEndPoint__Group__6 ;
    public final void rule__PostEndPoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1726:1: ( rule__PostEndPoint__Group__5__Impl rule__PostEndPoint__Group__6 )
            // InternalVizualizer.g:1727:2: rule__PostEndPoint__Group__5__Impl rule__PostEndPoint__Group__6
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
    // InternalVizualizer.g:1734:1: rule__PostEndPoint__Group__5__Impl : ( 'use Schema' ) ;
    public final void rule__PostEndPoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1738:1: ( ( 'use Schema' ) )
            // InternalVizualizer.g:1739:1: ( 'use Schema' )
            {
            // InternalVizualizer.g:1739:1: ( 'use Schema' )
            // InternalVizualizer.g:1740:2: 'use Schema'
            {
             before(grammarAccess.getPostEndPointAccess().getUseSchemaKeyword_5()); 
            match(input,34,FOLLOW_2); 
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
    // InternalVizualizer.g:1749:1: rule__PostEndPoint__Group__6 : rule__PostEndPoint__Group__6__Impl rule__PostEndPoint__Group__7 ;
    public final void rule__PostEndPoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1753:1: ( rule__PostEndPoint__Group__6__Impl rule__PostEndPoint__Group__7 )
            // InternalVizualizer.g:1754:2: rule__PostEndPoint__Group__6__Impl rule__PostEndPoint__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalVizualizer.g:1761:1: rule__PostEndPoint__Group__6__Impl : ( ( rule__PostEndPoint__ParserAssignment_6 ) ) ;
    public final void rule__PostEndPoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1765:1: ( ( ( rule__PostEndPoint__ParserAssignment_6 ) ) )
            // InternalVizualizer.g:1766:1: ( ( rule__PostEndPoint__ParserAssignment_6 ) )
            {
            // InternalVizualizer.g:1766:1: ( ( rule__PostEndPoint__ParserAssignment_6 ) )
            // InternalVizualizer.g:1767:2: ( rule__PostEndPoint__ParserAssignment_6 )
            {
             before(grammarAccess.getPostEndPointAccess().getParserAssignment_6()); 
            // InternalVizualizer.g:1768:2: ( rule__PostEndPoint__ParserAssignment_6 )
            // InternalVizualizer.g:1768:3: rule__PostEndPoint__ParserAssignment_6
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
    // InternalVizualizer.g:1776:1: rule__PostEndPoint__Group__7 : rule__PostEndPoint__Group__7__Impl ;
    public final void rule__PostEndPoint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1780:1: ( rule__PostEndPoint__Group__7__Impl )
            // InternalVizualizer.g:1781:2: rule__PostEndPoint__Group__7__Impl
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
    // InternalVizualizer.g:1787:1: rule__PostEndPoint__Group__7__Impl : ( '}' ) ;
    public final void rule__PostEndPoint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1791:1: ( ( '}' ) )
            // InternalVizualizer.g:1792:1: ( '}' )
            {
            // InternalVizualizer.g:1792:1: ( '}' )
            // InternalVizualizer.g:1793:2: '}'
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
    // InternalVizualizer.g:1803:1: rule__GetEndPoint__Group__0 : rule__GetEndPoint__Group__0__Impl rule__GetEndPoint__Group__1 ;
    public final void rule__GetEndPoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1807:1: ( rule__GetEndPoint__Group__0__Impl rule__GetEndPoint__Group__1 )
            // InternalVizualizer.g:1808:2: rule__GetEndPoint__Group__0__Impl rule__GetEndPoint__Group__1
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
    // InternalVizualizer.g:1815:1: rule__GetEndPoint__Group__0__Impl : ( 'GetPoint' ) ;
    public final void rule__GetEndPoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1819:1: ( ( 'GetPoint' ) )
            // InternalVizualizer.g:1820:1: ( 'GetPoint' )
            {
            // InternalVizualizer.g:1820:1: ( 'GetPoint' )
            // InternalVizualizer.g:1821:2: 'GetPoint'
            {
             before(grammarAccess.getGetEndPointAccess().getGetPointKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalVizualizer.g:1830:1: rule__GetEndPoint__Group__1 : rule__GetEndPoint__Group__1__Impl rule__GetEndPoint__Group__2 ;
    public final void rule__GetEndPoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1834:1: ( rule__GetEndPoint__Group__1__Impl rule__GetEndPoint__Group__2 )
            // InternalVizualizer.g:1835:2: rule__GetEndPoint__Group__1__Impl rule__GetEndPoint__Group__2
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
    // InternalVizualizer.g:1842:1: rule__GetEndPoint__Group__1__Impl : ( ( rule__GetEndPoint__NameAssignment_1 ) ) ;
    public final void rule__GetEndPoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1846:1: ( ( ( rule__GetEndPoint__NameAssignment_1 ) ) )
            // InternalVizualizer.g:1847:1: ( ( rule__GetEndPoint__NameAssignment_1 ) )
            {
            // InternalVizualizer.g:1847:1: ( ( rule__GetEndPoint__NameAssignment_1 ) )
            // InternalVizualizer.g:1848:2: ( rule__GetEndPoint__NameAssignment_1 )
            {
             before(grammarAccess.getGetEndPointAccess().getNameAssignment_1()); 
            // InternalVizualizer.g:1849:2: ( rule__GetEndPoint__NameAssignment_1 )
            // InternalVizualizer.g:1849:3: rule__GetEndPoint__NameAssignment_1
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
    // InternalVizualizer.g:1857:1: rule__GetEndPoint__Group__2 : rule__GetEndPoint__Group__2__Impl rule__GetEndPoint__Group__3 ;
    public final void rule__GetEndPoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1861:1: ( rule__GetEndPoint__Group__2__Impl rule__GetEndPoint__Group__3 )
            // InternalVizualizer.g:1862:2: rule__GetEndPoint__Group__2__Impl rule__GetEndPoint__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalVizualizer.g:1869:1: rule__GetEndPoint__Group__2__Impl : ( '{' ) ;
    public final void rule__GetEndPoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1873:1: ( ( '{' ) )
            // InternalVizualizer.g:1874:1: ( '{' )
            {
            // InternalVizualizer.g:1874:1: ( '{' )
            // InternalVizualizer.g:1875:2: '{'
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
    // InternalVizualizer.g:1884:1: rule__GetEndPoint__Group__3 : rule__GetEndPoint__Group__3__Impl rule__GetEndPoint__Group__4 ;
    public final void rule__GetEndPoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1888:1: ( rule__GetEndPoint__Group__3__Impl rule__GetEndPoint__Group__4 )
            // InternalVizualizer.g:1889:2: rule__GetEndPoint__Group__3__Impl rule__GetEndPoint__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalVizualizer.g:1896:1: rule__GetEndPoint__Group__3__Impl : ( 'url' ) ;
    public final void rule__GetEndPoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1900:1: ( ( 'url' ) )
            // InternalVizualizer.g:1901:1: ( 'url' )
            {
            // InternalVizualizer.g:1901:1: ( 'url' )
            // InternalVizualizer.g:1902:2: 'url'
            {
             before(grammarAccess.getGetEndPointAccess().getUrlKeyword_3()); 
            match(input,33,FOLLOW_2); 
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
    // InternalVizualizer.g:1911:1: rule__GetEndPoint__Group__4 : rule__GetEndPoint__Group__4__Impl rule__GetEndPoint__Group__5 ;
    public final void rule__GetEndPoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1915:1: ( rule__GetEndPoint__Group__4__Impl rule__GetEndPoint__Group__5 )
            // InternalVizualizer.g:1916:2: rule__GetEndPoint__Group__4__Impl rule__GetEndPoint__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalVizualizer.g:1923:1: rule__GetEndPoint__Group__4__Impl : ( ( rule__GetEndPoint__UrlAssignment_4 ) ) ;
    public final void rule__GetEndPoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1927:1: ( ( ( rule__GetEndPoint__UrlAssignment_4 ) ) )
            // InternalVizualizer.g:1928:1: ( ( rule__GetEndPoint__UrlAssignment_4 ) )
            {
            // InternalVizualizer.g:1928:1: ( ( rule__GetEndPoint__UrlAssignment_4 ) )
            // InternalVizualizer.g:1929:2: ( rule__GetEndPoint__UrlAssignment_4 )
            {
             before(grammarAccess.getGetEndPointAccess().getUrlAssignment_4()); 
            // InternalVizualizer.g:1930:2: ( rule__GetEndPoint__UrlAssignment_4 )
            // InternalVizualizer.g:1930:3: rule__GetEndPoint__UrlAssignment_4
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
    // InternalVizualizer.g:1938:1: rule__GetEndPoint__Group__5 : rule__GetEndPoint__Group__5__Impl rule__GetEndPoint__Group__6 ;
    public final void rule__GetEndPoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1942:1: ( rule__GetEndPoint__Group__5__Impl rule__GetEndPoint__Group__6 )
            // InternalVizualizer.g:1943:2: rule__GetEndPoint__Group__5__Impl rule__GetEndPoint__Group__6
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
    // InternalVizualizer.g:1950:1: rule__GetEndPoint__Group__5__Impl : ( 'Headers' ) ;
    public final void rule__GetEndPoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1954:1: ( ( 'Headers' ) )
            // InternalVizualizer.g:1955:1: ( 'Headers' )
            {
            // InternalVizualizer.g:1955:1: ( 'Headers' )
            // InternalVizualizer.g:1956:2: 'Headers'
            {
             before(grammarAccess.getGetEndPointAccess().getHeadersKeyword_5()); 
            match(input,36,FOLLOW_2); 
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
    // InternalVizualizer.g:1965:1: rule__GetEndPoint__Group__6 : rule__GetEndPoint__Group__6__Impl rule__GetEndPoint__Group__7 ;
    public final void rule__GetEndPoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1969:1: ( rule__GetEndPoint__Group__6__Impl rule__GetEndPoint__Group__7 )
            // InternalVizualizer.g:1970:2: rule__GetEndPoint__Group__6__Impl rule__GetEndPoint__Group__7
            {
            pushFollow(FOLLOW_18);
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
    // InternalVizualizer.g:1977:1: rule__GetEndPoint__Group__6__Impl : ( '{' ) ;
    public final void rule__GetEndPoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1981:1: ( ( '{' ) )
            // InternalVizualizer.g:1982:1: ( '{' )
            {
            // InternalVizualizer.g:1982:1: ( '{' )
            // InternalVizualizer.g:1983:2: '{'
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
    // InternalVizualizer.g:1992:1: rule__GetEndPoint__Group__7 : rule__GetEndPoint__Group__7__Impl rule__GetEndPoint__Group__8 ;
    public final void rule__GetEndPoint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:1996:1: ( rule__GetEndPoint__Group__7__Impl rule__GetEndPoint__Group__8 )
            // InternalVizualizer.g:1997:2: rule__GetEndPoint__Group__7__Impl rule__GetEndPoint__Group__8
            {
            pushFollow(FOLLOW_13);
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
    // InternalVizualizer.g:2004:1: rule__GetEndPoint__Group__7__Impl : ( ( rule__GetEndPoint__HeadersAssignment_7 ) ) ;
    public final void rule__GetEndPoint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2008:1: ( ( ( rule__GetEndPoint__HeadersAssignment_7 ) ) )
            // InternalVizualizer.g:2009:1: ( ( rule__GetEndPoint__HeadersAssignment_7 ) )
            {
            // InternalVizualizer.g:2009:1: ( ( rule__GetEndPoint__HeadersAssignment_7 ) )
            // InternalVizualizer.g:2010:2: ( rule__GetEndPoint__HeadersAssignment_7 )
            {
             before(grammarAccess.getGetEndPointAccess().getHeadersAssignment_7()); 
            // InternalVizualizer.g:2011:2: ( rule__GetEndPoint__HeadersAssignment_7 )
            // InternalVizualizer.g:2011:3: rule__GetEndPoint__HeadersAssignment_7
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
    // InternalVizualizer.g:2019:1: rule__GetEndPoint__Group__8 : rule__GetEndPoint__Group__8__Impl rule__GetEndPoint__Group__9 ;
    public final void rule__GetEndPoint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2023:1: ( rule__GetEndPoint__Group__8__Impl rule__GetEndPoint__Group__9 )
            // InternalVizualizer.g:2024:2: rule__GetEndPoint__Group__8__Impl rule__GetEndPoint__Group__9
            {
            pushFollow(FOLLOW_13);
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
    // InternalVizualizer.g:2031:1: rule__GetEndPoint__Group__8__Impl : ( ( rule__GetEndPoint__Group_8__0 )* ) ;
    public final void rule__GetEndPoint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2035:1: ( ( ( rule__GetEndPoint__Group_8__0 )* ) )
            // InternalVizualizer.g:2036:1: ( ( rule__GetEndPoint__Group_8__0 )* )
            {
            // InternalVizualizer.g:2036:1: ( ( rule__GetEndPoint__Group_8__0 )* )
            // InternalVizualizer.g:2037:2: ( rule__GetEndPoint__Group_8__0 )*
            {
             before(grammarAccess.getGetEndPointAccess().getGroup_8()); 
            // InternalVizualizer.g:2038:2: ( rule__GetEndPoint__Group_8__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalVizualizer.g:2038:3: rule__GetEndPoint__Group_8__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__GetEndPoint__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalVizualizer.g:2046:1: rule__GetEndPoint__Group__9 : rule__GetEndPoint__Group__9__Impl rule__GetEndPoint__Group__10 ;
    public final void rule__GetEndPoint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2050:1: ( rule__GetEndPoint__Group__9__Impl rule__GetEndPoint__Group__10 )
            // InternalVizualizer.g:2051:2: rule__GetEndPoint__Group__9__Impl rule__GetEndPoint__Group__10
            {
            pushFollow(FOLLOW_19);
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
    // InternalVizualizer.g:2058:1: rule__GetEndPoint__Group__9__Impl : ( '}' ) ;
    public final void rule__GetEndPoint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2062:1: ( ( '}' ) )
            // InternalVizualizer.g:2063:1: ( '}' )
            {
            // InternalVizualizer.g:2063:1: ( '}' )
            // InternalVizualizer.g:2064:2: '}'
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
    // InternalVizualizer.g:2073:1: rule__GetEndPoint__Group__10 : rule__GetEndPoint__Group__10__Impl rule__GetEndPoint__Group__11 ;
    public final void rule__GetEndPoint__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2077:1: ( rule__GetEndPoint__Group__10__Impl rule__GetEndPoint__Group__11 )
            // InternalVizualizer.g:2078:2: rule__GetEndPoint__Group__10__Impl rule__GetEndPoint__Group__11
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
    // InternalVizualizer.g:2085:1: rule__GetEndPoint__Group__10__Impl : ( 'use Schema' ) ;
    public final void rule__GetEndPoint__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2089:1: ( ( 'use Schema' ) )
            // InternalVizualizer.g:2090:1: ( 'use Schema' )
            {
            // InternalVizualizer.g:2090:1: ( 'use Schema' )
            // InternalVizualizer.g:2091:2: 'use Schema'
            {
             before(grammarAccess.getGetEndPointAccess().getUseSchemaKeyword_10()); 
            match(input,34,FOLLOW_2); 
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
    // InternalVizualizer.g:2100:1: rule__GetEndPoint__Group__11 : rule__GetEndPoint__Group__11__Impl rule__GetEndPoint__Group__12 ;
    public final void rule__GetEndPoint__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2104:1: ( rule__GetEndPoint__Group__11__Impl rule__GetEndPoint__Group__12 )
            // InternalVizualizer.g:2105:2: rule__GetEndPoint__Group__11__Impl rule__GetEndPoint__Group__12
            {
            pushFollow(FOLLOW_20);
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
    // InternalVizualizer.g:2112:1: rule__GetEndPoint__Group__11__Impl : ( ( rule__GetEndPoint__ParserAssignment_11 ) ) ;
    public final void rule__GetEndPoint__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2116:1: ( ( ( rule__GetEndPoint__ParserAssignment_11 ) ) )
            // InternalVizualizer.g:2117:1: ( ( rule__GetEndPoint__ParserAssignment_11 ) )
            {
            // InternalVizualizer.g:2117:1: ( ( rule__GetEndPoint__ParserAssignment_11 ) )
            // InternalVizualizer.g:2118:2: ( rule__GetEndPoint__ParserAssignment_11 )
            {
             before(grammarAccess.getGetEndPointAccess().getParserAssignment_11()); 
            // InternalVizualizer.g:2119:2: ( rule__GetEndPoint__ParserAssignment_11 )
            // InternalVizualizer.g:2119:3: rule__GetEndPoint__ParserAssignment_11
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
    // InternalVizualizer.g:2127:1: rule__GetEndPoint__Group__12 : rule__GetEndPoint__Group__12__Impl ;
    public final void rule__GetEndPoint__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2131:1: ( rule__GetEndPoint__Group__12__Impl )
            // InternalVizualizer.g:2132:2: rule__GetEndPoint__Group__12__Impl
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
    // InternalVizualizer.g:2138:1: rule__GetEndPoint__Group__12__Impl : ( '}' ) ;
    public final void rule__GetEndPoint__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2142:1: ( ( '}' ) )
            // InternalVizualizer.g:2143:1: ( '}' )
            {
            // InternalVizualizer.g:2143:1: ( '}' )
            // InternalVizualizer.g:2144:2: '}'
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
    // InternalVizualizer.g:2154:1: rule__GetEndPoint__Group_8__0 : rule__GetEndPoint__Group_8__0__Impl rule__GetEndPoint__Group_8__1 ;
    public final void rule__GetEndPoint__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2158:1: ( rule__GetEndPoint__Group_8__0__Impl rule__GetEndPoint__Group_8__1 )
            // InternalVizualizer.g:2159:2: rule__GetEndPoint__Group_8__0__Impl rule__GetEndPoint__Group_8__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalVizualizer.g:2166:1: rule__GetEndPoint__Group_8__0__Impl : ( ',' ) ;
    public final void rule__GetEndPoint__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2170:1: ( ( ',' ) )
            // InternalVizualizer.g:2171:1: ( ',' )
            {
            // InternalVizualizer.g:2171:1: ( ',' )
            // InternalVizualizer.g:2172:2: ','
            {
             before(grammarAccess.getGetEndPointAccess().getCommaKeyword_8_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalVizualizer.g:2181:1: rule__GetEndPoint__Group_8__1 : rule__GetEndPoint__Group_8__1__Impl ;
    public final void rule__GetEndPoint__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2185:1: ( rule__GetEndPoint__Group_8__1__Impl )
            // InternalVizualizer.g:2186:2: rule__GetEndPoint__Group_8__1__Impl
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
    // InternalVizualizer.g:2192:1: rule__GetEndPoint__Group_8__1__Impl : ( ( rule__GetEndPoint__HeadersAssignment_8_1 ) ) ;
    public final void rule__GetEndPoint__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2196:1: ( ( ( rule__GetEndPoint__HeadersAssignment_8_1 ) ) )
            // InternalVizualizer.g:2197:1: ( ( rule__GetEndPoint__HeadersAssignment_8_1 ) )
            {
            // InternalVizualizer.g:2197:1: ( ( rule__GetEndPoint__HeadersAssignment_8_1 ) )
            // InternalVizualizer.g:2198:2: ( rule__GetEndPoint__HeadersAssignment_8_1 )
            {
             before(grammarAccess.getGetEndPointAccess().getHeadersAssignment_8_1()); 
            // InternalVizualizer.g:2199:2: ( rule__GetEndPoint__HeadersAssignment_8_1 )
            // InternalVizualizer.g:2199:3: rule__GetEndPoint__HeadersAssignment_8_1
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
    // InternalVizualizer.g:2208:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2212:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // InternalVizualizer.g:2213:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalVizualizer.g:2220:1: rule__Header__Group__0__Impl : ( ( rule__Header__KeywordAssignment_0 ) ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2224:1: ( ( ( rule__Header__KeywordAssignment_0 ) ) )
            // InternalVizualizer.g:2225:1: ( ( rule__Header__KeywordAssignment_0 ) )
            {
            // InternalVizualizer.g:2225:1: ( ( rule__Header__KeywordAssignment_0 ) )
            // InternalVizualizer.g:2226:2: ( rule__Header__KeywordAssignment_0 )
            {
             before(grammarAccess.getHeaderAccess().getKeywordAssignment_0()); 
            // InternalVizualizer.g:2227:2: ( rule__Header__KeywordAssignment_0 )
            // InternalVizualizer.g:2227:3: rule__Header__KeywordAssignment_0
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
    // InternalVizualizer.g:2235:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2239:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // InternalVizualizer.g:2240:2: rule__Header__Group__1__Impl rule__Header__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalVizualizer.g:2247:1: rule__Header__Group__1__Impl : ( ':' ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2251:1: ( ( ':' ) )
            // InternalVizualizer.g:2252:1: ( ':' )
            {
            // InternalVizualizer.g:2252:1: ( ':' )
            // InternalVizualizer.g:2253:2: ':'
            {
             before(grammarAccess.getHeaderAccess().getColonKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalVizualizer.g:2262:1: rule__Header__Group__2 : rule__Header__Group__2__Impl ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2266:1: ( rule__Header__Group__2__Impl )
            // InternalVizualizer.g:2267:2: rule__Header__Group__2__Impl
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
    // InternalVizualizer.g:2273:1: rule__Header__Group__2__Impl : ( ( rule__Header__ValueAssignment_2 ) ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2277:1: ( ( ( rule__Header__ValueAssignment_2 ) ) )
            // InternalVizualizer.g:2278:1: ( ( rule__Header__ValueAssignment_2 ) )
            {
            // InternalVizualizer.g:2278:1: ( ( rule__Header__ValueAssignment_2 ) )
            // InternalVizualizer.g:2279:2: ( rule__Header__ValueAssignment_2 )
            {
             before(grammarAccess.getHeaderAccess().getValueAssignment_2()); 
            // InternalVizualizer.g:2280:2: ( rule__Header__ValueAssignment_2 )
            // InternalVizualizer.g:2280:3: rule__Header__ValueAssignment_2
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
    // InternalVizualizer.g:2289:1: rule__SchemaParser__Group__0 : rule__SchemaParser__Group__0__Impl rule__SchemaParser__Group__1 ;
    public final void rule__SchemaParser__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2293:1: ( rule__SchemaParser__Group__0__Impl rule__SchemaParser__Group__1 )
            // InternalVizualizer.g:2294:2: rule__SchemaParser__Group__0__Impl rule__SchemaParser__Group__1
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
    // InternalVizualizer.g:2301:1: rule__SchemaParser__Group__0__Impl : ( 'Schema' ) ;
    public final void rule__SchemaParser__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2305:1: ( ( 'Schema' ) )
            // InternalVizualizer.g:2306:1: ( 'Schema' )
            {
            // InternalVizualizer.g:2306:1: ( 'Schema' )
            // InternalVizualizer.g:2307:2: 'Schema'
            {
             before(grammarAccess.getSchemaParserAccess().getSchemaKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalVizualizer.g:2316:1: rule__SchemaParser__Group__1 : rule__SchemaParser__Group__1__Impl rule__SchemaParser__Group__2 ;
    public final void rule__SchemaParser__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2320:1: ( rule__SchemaParser__Group__1__Impl rule__SchemaParser__Group__2 )
            // InternalVizualizer.g:2321:2: rule__SchemaParser__Group__1__Impl rule__SchemaParser__Group__2
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
    // InternalVizualizer.g:2328:1: rule__SchemaParser__Group__1__Impl : ( ( rule__SchemaParser__NameAssignment_1 ) ) ;
    public final void rule__SchemaParser__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2332:1: ( ( ( rule__SchemaParser__NameAssignment_1 ) ) )
            // InternalVizualizer.g:2333:1: ( ( rule__SchemaParser__NameAssignment_1 ) )
            {
            // InternalVizualizer.g:2333:1: ( ( rule__SchemaParser__NameAssignment_1 ) )
            // InternalVizualizer.g:2334:2: ( rule__SchemaParser__NameAssignment_1 )
            {
             before(grammarAccess.getSchemaParserAccess().getNameAssignment_1()); 
            // InternalVizualizer.g:2335:2: ( rule__SchemaParser__NameAssignment_1 )
            // InternalVizualizer.g:2335:3: rule__SchemaParser__NameAssignment_1
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
    // InternalVizualizer.g:2343:1: rule__SchemaParser__Group__2 : rule__SchemaParser__Group__2__Impl rule__SchemaParser__Group__3 ;
    public final void rule__SchemaParser__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2347:1: ( rule__SchemaParser__Group__2__Impl rule__SchemaParser__Group__3 )
            // InternalVizualizer.g:2348:2: rule__SchemaParser__Group__2__Impl rule__SchemaParser__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalVizualizer.g:2355:1: rule__SchemaParser__Group__2__Impl : ( '{' ) ;
    public final void rule__SchemaParser__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2359:1: ( ( '{' ) )
            // InternalVizualizer.g:2360:1: ( '{' )
            {
            // InternalVizualizer.g:2360:1: ( '{' )
            // InternalVizualizer.g:2361:2: '{'
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
    // InternalVizualizer.g:2370:1: rule__SchemaParser__Group__3 : rule__SchemaParser__Group__3__Impl rule__SchemaParser__Group__4 ;
    public final void rule__SchemaParser__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2374:1: ( rule__SchemaParser__Group__3__Impl rule__SchemaParser__Group__4 )
            // InternalVizualizer.g:2375:2: rule__SchemaParser__Group__3__Impl rule__SchemaParser__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalVizualizer.g:2382:1: rule__SchemaParser__Group__3__Impl : ( 'SchemaType = ' ) ;
    public final void rule__SchemaParser__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2386:1: ( ( 'SchemaType = ' ) )
            // InternalVizualizer.g:2387:1: ( 'SchemaType = ' )
            {
            // InternalVizualizer.g:2387:1: ( 'SchemaType = ' )
            // InternalVizualizer.g:2388:2: 'SchemaType = '
            {
             before(grammarAccess.getSchemaParserAccess().getSchemaTypeKeyword_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalVizualizer.g:2397:1: rule__SchemaParser__Group__4 : rule__SchemaParser__Group__4__Impl rule__SchemaParser__Group__5 ;
    public final void rule__SchemaParser__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2401:1: ( rule__SchemaParser__Group__4__Impl rule__SchemaParser__Group__5 )
            // InternalVizualizer.g:2402:2: rule__SchemaParser__Group__4__Impl rule__SchemaParser__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalVizualizer.g:2409:1: rule__SchemaParser__Group__4__Impl : ( ( rule__SchemaParser__SchemaTypeAssignment_4 ) ) ;
    public final void rule__SchemaParser__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2413:1: ( ( ( rule__SchemaParser__SchemaTypeAssignment_4 ) ) )
            // InternalVizualizer.g:2414:1: ( ( rule__SchemaParser__SchemaTypeAssignment_4 ) )
            {
            // InternalVizualizer.g:2414:1: ( ( rule__SchemaParser__SchemaTypeAssignment_4 ) )
            // InternalVizualizer.g:2415:2: ( rule__SchemaParser__SchemaTypeAssignment_4 )
            {
             before(grammarAccess.getSchemaParserAccess().getSchemaTypeAssignment_4()); 
            // InternalVizualizer.g:2416:2: ( rule__SchemaParser__SchemaTypeAssignment_4 )
            // InternalVizualizer.g:2416:3: rule__SchemaParser__SchemaTypeAssignment_4
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
    // InternalVizualizer.g:2424:1: rule__SchemaParser__Group__5 : rule__SchemaParser__Group__5__Impl rule__SchemaParser__Group__6 ;
    public final void rule__SchemaParser__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2428:1: ( rule__SchemaParser__Group__5__Impl rule__SchemaParser__Group__6 )
            // InternalVizualizer.g:2429:2: rule__SchemaParser__Group__5__Impl rule__SchemaParser__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalVizualizer.g:2436:1: rule__SchemaParser__Group__5__Impl : ( ( ( rule__SchemaParser__SelectorsAssignment_5 ) ) ( ( rule__SchemaParser__SelectorsAssignment_5 )* ) ) ;
    public final void rule__SchemaParser__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2440:1: ( ( ( ( rule__SchemaParser__SelectorsAssignment_5 ) ) ( ( rule__SchemaParser__SelectorsAssignment_5 )* ) ) )
            // InternalVizualizer.g:2441:1: ( ( ( rule__SchemaParser__SelectorsAssignment_5 ) ) ( ( rule__SchemaParser__SelectorsAssignment_5 )* ) )
            {
            // InternalVizualizer.g:2441:1: ( ( ( rule__SchemaParser__SelectorsAssignment_5 ) ) ( ( rule__SchemaParser__SelectorsAssignment_5 )* ) )
            // InternalVizualizer.g:2442:2: ( ( rule__SchemaParser__SelectorsAssignment_5 ) ) ( ( rule__SchemaParser__SelectorsAssignment_5 )* )
            {
            // InternalVizualizer.g:2442:2: ( ( rule__SchemaParser__SelectorsAssignment_5 ) )
            // InternalVizualizer.g:2443:3: ( rule__SchemaParser__SelectorsAssignment_5 )
            {
             before(grammarAccess.getSchemaParserAccess().getSelectorsAssignment_5()); 
            // InternalVizualizer.g:2444:3: ( rule__SchemaParser__SelectorsAssignment_5 )
            // InternalVizualizer.g:2444:4: rule__SchemaParser__SelectorsAssignment_5
            {
            pushFollow(FOLLOW_25);
            rule__SchemaParser__SelectorsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSchemaParserAccess().getSelectorsAssignment_5()); 

            }

            // InternalVizualizer.g:2447:2: ( ( rule__SchemaParser__SelectorsAssignment_5 )* )
            // InternalVizualizer.g:2448:3: ( rule__SchemaParser__SelectorsAssignment_5 )*
            {
             before(grammarAccess.getSchemaParserAccess().getSelectorsAssignment_5()); 
            // InternalVizualizer.g:2449:3: ( rule__SchemaParser__SelectorsAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==39) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalVizualizer.g:2449:4: rule__SchemaParser__SelectorsAssignment_5
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__SchemaParser__SelectorsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalVizualizer.g:2458:1: rule__SchemaParser__Group__6 : rule__SchemaParser__Group__6__Impl ;
    public final void rule__SchemaParser__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2462:1: ( rule__SchemaParser__Group__6__Impl )
            // InternalVizualizer.g:2463:2: rule__SchemaParser__Group__6__Impl
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
    // InternalVizualizer.g:2469:1: rule__SchemaParser__Group__6__Impl : ( '}' ) ;
    public final void rule__SchemaParser__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2473:1: ( ( '}' ) )
            // InternalVizualizer.g:2474:1: ( '}' )
            {
            // InternalVizualizer.g:2474:1: ( '}' )
            // InternalVizualizer.g:2475:2: '}'
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
    // InternalVizualizer.g:2485:1: rule__Selector__Group__0 : rule__Selector__Group__0__Impl rule__Selector__Group__1 ;
    public final void rule__Selector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2489:1: ( rule__Selector__Group__0__Impl rule__Selector__Group__1 )
            // InternalVizualizer.g:2490:2: rule__Selector__Group__0__Impl rule__Selector__Group__1
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
    // InternalVizualizer.g:2497:1: rule__Selector__Group__0__Impl : ( 'Selector as ' ) ;
    public final void rule__Selector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2501:1: ( ( 'Selector as ' ) )
            // InternalVizualizer.g:2502:1: ( 'Selector as ' )
            {
            // InternalVizualizer.g:2502:1: ( 'Selector as ' )
            // InternalVizualizer.g:2503:2: 'Selector as '
            {
             before(grammarAccess.getSelectorAccess().getSelectorAsKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalVizualizer.g:2512:1: rule__Selector__Group__1 : rule__Selector__Group__1__Impl rule__Selector__Group__2 ;
    public final void rule__Selector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2516:1: ( rule__Selector__Group__1__Impl rule__Selector__Group__2 )
            // InternalVizualizer.g:2517:2: rule__Selector__Group__1__Impl rule__Selector__Group__2
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
    // InternalVizualizer.g:2524:1: rule__Selector__Group__1__Impl : ( ( rule__Selector__NameAssignment_1 ) ) ;
    public final void rule__Selector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2528:1: ( ( ( rule__Selector__NameAssignment_1 ) ) )
            // InternalVizualizer.g:2529:1: ( ( rule__Selector__NameAssignment_1 ) )
            {
            // InternalVizualizer.g:2529:1: ( ( rule__Selector__NameAssignment_1 ) )
            // InternalVizualizer.g:2530:2: ( rule__Selector__NameAssignment_1 )
            {
             before(grammarAccess.getSelectorAccess().getNameAssignment_1()); 
            // InternalVizualizer.g:2531:2: ( rule__Selector__NameAssignment_1 )
            // InternalVizualizer.g:2531:3: rule__Selector__NameAssignment_1
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
    // InternalVizualizer.g:2539:1: rule__Selector__Group__2 : rule__Selector__Group__2__Impl rule__Selector__Group__3 ;
    public final void rule__Selector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2543:1: ( rule__Selector__Group__2__Impl rule__Selector__Group__3 )
            // InternalVizualizer.g:2544:2: rule__Selector__Group__2__Impl rule__Selector__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalVizualizer.g:2551:1: rule__Selector__Group__2__Impl : ( '{' ) ;
    public final void rule__Selector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2555:1: ( ( '{' ) )
            // InternalVizualizer.g:2556:1: ( '{' )
            {
            // InternalVizualizer.g:2556:1: ( '{' )
            // InternalVizualizer.g:2557:2: '{'
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
    // InternalVizualizer.g:2566:1: rule__Selector__Group__3 : rule__Selector__Group__3__Impl rule__Selector__Group__4 ;
    public final void rule__Selector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2570:1: ( rule__Selector__Group__3__Impl rule__Selector__Group__4 )
            // InternalVizualizer.g:2571:2: rule__Selector__Group__3__Impl rule__Selector__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalVizualizer.g:2578:1: rule__Selector__Group__3__Impl : ( ( rule__Selector__StepsAssignment_3 ) ) ;
    public final void rule__Selector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2582:1: ( ( ( rule__Selector__StepsAssignment_3 ) ) )
            // InternalVizualizer.g:2583:1: ( ( rule__Selector__StepsAssignment_3 ) )
            {
            // InternalVizualizer.g:2583:1: ( ( rule__Selector__StepsAssignment_3 ) )
            // InternalVizualizer.g:2584:2: ( rule__Selector__StepsAssignment_3 )
            {
             before(grammarAccess.getSelectorAccess().getStepsAssignment_3()); 
            // InternalVizualizer.g:2585:2: ( rule__Selector__StepsAssignment_3 )
            // InternalVizualizer.g:2585:3: rule__Selector__StepsAssignment_3
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
    // InternalVizualizer.g:2593:1: rule__Selector__Group__4 : rule__Selector__Group__4__Impl rule__Selector__Group__5 ;
    public final void rule__Selector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2597:1: ( rule__Selector__Group__4__Impl rule__Selector__Group__5 )
            // InternalVizualizer.g:2598:2: rule__Selector__Group__4__Impl rule__Selector__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalVizualizer.g:2605:1: rule__Selector__Group__4__Impl : ( ( ( rule__Selector__Group_4__0 ) ) ( ( rule__Selector__Group_4__0 )* ) ) ;
    public final void rule__Selector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2609:1: ( ( ( ( rule__Selector__Group_4__0 ) ) ( ( rule__Selector__Group_4__0 )* ) ) )
            // InternalVizualizer.g:2610:1: ( ( ( rule__Selector__Group_4__0 ) ) ( ( rule__Selector__Group_4__0 )* ) )
            {
            // InternalVizualizer.g:2610:1: ( ( ( rule__Selector__Group_4__0 ) ) ( ( rule__Selector__Group_4__0 )* ) )
            // InternalVizualizer.g:2611:2: ( ( rule__Selector__Group_4__0 ) ) ( ( rule__Selector__Group_4__0 )* )
            {
            // InternalVizualizer.g:2611:2: ( ( rule__Selector__Group_4__0 ) )
            // InternalVizualizer.g:2612:3: ( rule__Selector__Group_4__0 )
            {
             before(grammarAccess.getSelectorAccess().getGroup_4()); 
            // InternalVizualizer.g:2613:3: ( rule__Selector__Group_4__0 )
            // InternalVizualizer.g:2613:4: rule__Selector__Group_4__0
            {
            pushFollow(FOLLOW_27);
            rule__Selector__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getGroup_4()); 

            }

            // InternalVizualizer.g:2616:2: ( ( rule__Selector__Group_4__0 )* )
            // InternalVizualizer.g:2617:3: ( rule__Selector__Group_4__0 )*
            {
             before(grammarAccess.getSelectorAccess().getGroup_4()); 
            // InternalVizualizer.g:2618:3: ( rule__Selector__Group_4__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==40) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalVizualizer.g:2618:4: rule__Selector__Group_4__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Selector__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalVizualizer.g:2627:1: rule__Selector__Group__5 : rule__Selector__Group__5__Impl ;
    public final void rule__Selector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2631:1: ( rule__Selector__Group__5__Impl )
            // InternalVizualizer.g:2632:2: rule__Selector__Group__5__Impl
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
    // InternalVizualizer.g:2638:1: rule__Selector__Group__5__Impl : ( '}' ) ;
    public final void rule__Selector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2642:1: ( ( '}' ) )
            // InternalVizualizer.g:2643:1: ( '}' )
            {
            // InternalVizualizer.g:2643:1: ( '}' )
            // InternalVizualizer.g:2644:2: '}'
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
    // InternalVizualizer.g:2654:1: rule__Selector__Group_4__0 : rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1 ;
    public final void rule__Selector__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2658:1: ( rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1 )
            // InternalVizualizer.g:2659:2: rule__Selector__Group_4__0__Impl rule__Selector__Group_4__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalVizualizer.g:2666:1: rule__Selector__Group_4__0__Impl : ( ' -> ' ) ;
    public final void rule__Selector__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2670:1: ( ( ' -> ' ) )
            // InternalVizualizer.g:2671:1: ( ' -> ' )
            {
            // InternalVizualizer.g:2671:1: ( ' -> ' )
            // InternalVizualizer.g:2672:2: ' -> '
            {
             before(grammarAccess.getSelectorAccess().getSpaceHyphenMinusGreaterThanSignSpaceKeyword_4_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalVizualizer.g:2681:1: rule__Selector__Group_4__1 : rule__Selector__Group_4__1__Impl ;
    public final void rule__Selector__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2685:1: ( rule__Selector__Group_4__1__Impl )
            // InternalVizualizer.g:2686:2: rule__Selector__Group_4__1__Impl
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
    // InternalVizualizer.g:2692:1: rule__Selector__Group_4__1__Impl : ( ( rule__Selector__StepsAssignment_4_1 ) ) ;
    public final void rule__Selector__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2696:1: ( ( ( rule__Selector__StepsAssignment_4_1 ) ) )
            // InternalVizualizer.g:2697:1: ( ( rule__Selector__StepsAssignment_4_1 ) )
            {
            // InternalVizualizer.g:2697:1: ( ( rule__Selector__StepsAssignment_4_1 ) )
            // InternalVizualizer.g:2698:2: ( rule__Selector__StepsAssignment_4_1 )
            {
             before(grammarAccess.getSelectorAccess().getStepsAssignment_4_1()); 
            // InternalVizualizer.g:2699:2: ( rule__Selector__StepsAssignment_4_1 )
            // InternalVizualizer.g:2699:3: rule__Selector__StepsAssignment_4_1
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
    // InternalVizualizer.g:2708:1: rule__Formula__Group__0 : rule__Formula__Group__0__Impl rule__Formula__Group__1 ;
    public final void rule__Formula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2712:1: ( rule__Formula__Group__0__Impl rule__Formula__Group__1 )
            // InternalVizualizer.g:2713:2: rule__Formula__Group__0__Impl rule__Formula__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalVizualizer.g:2720:1: rule__Formula__Group__0__Impl : ( ( rule__Formula__NameAssignment_0 ) ) ;
    public final void rule__Formula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2724:1: ( ( ( rule__Formula__NameAssignment_0 ) ) )
            // InternalVizualizer.g:2725:1: ( ( rule__Formula__NameAssignment_0 ) )
            {
            // InternalVizualizer.g:2725:1: ( ( rule__Formula__NameAssignment_0 ) )
            // InternalVizualizer.g:2726:2: ( rule__Formula__NameAssignment_0 )
            {
             before(grammarAccess.getFormulaAccess().getNameAssignment_0()); 
            // InternalVizualizer.g:2727:2: ( rule__Formula__NameAssignment_0 )
            // InternalVizualizer.g:2727:3: rule__Formula__NameAssignment_0
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
    // InternalVizualizer.g:2735:1: rule__Formula__Group__1 : rule__Formula__Group__1__Impl rule__Formula__Group__2 ;
    public final void rule__Formula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2739:1: ( rule__Formula__Group__1__Impl rule__Formula__Group__2 )
            // InternalVizualizer.g:2740:2: rule__Formula__Group__1__Impl rule__Formula__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalVizualizer.g:2747:1: rule__Formula__Group__1__Impl : ( '(' ) ;
    public final void rule__Formula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2751:1: ( ( '(' ) )
            // InternalVizualizer.g:2752:1: ( '(' )
            {
            // InternalVizualizer.g:2752:1: ( '(' )
            // InternalVizualizer.g:2753:2: '('
            {
             before(grammarAccess.getFormulaAccess().getLeftParenthesisKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalVizualizer.g:2762:1: rule__Formula__Group__2 : rule__Formula__Group__2__Impl rule__Formula__Group__3 ;
    public final void rule__Formula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2766:1: ( rule__Formula__Group__2__Impl rule__Formula__Group__3 )
            // InternalVizualizer.g:2767:2: rule__Formula__Group__2__Impl rule__Formula__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalVizualizer.g:2774:1: rule__Formula__Group__2__Impl : ( ( rule__Formula__Group_2__0 )? ) ;
    public final void rule__Formula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2778:1: ( ( ( rule__Formula__Group_2__0 )? ) )
            // InternalVizualizer.g:2779:1: ( ( rule__Formula__Group_2__0 )? )
            {
            // InternalVizualizer.g:2779:1: ( ( rule__Formula__Group_2__0 )? )
            // InternalVizualizer.g:2780:2: ( rule__Formula__Group_2__0 )?
            {
             before(grammarAccess.getFormulaAccess().getGroup_2()); 
            // InternalVizualizer.g:2781:2: ( rule__Formula__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalVizualizer.g:2781:3: rule__Formula__Group_2__0
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
    // InternalVizualizer.g:2789:1: rule__Formula__Group__3 : rule__Formula__Group__3__Impl rule__Formula__Group__4 ;
    public final void rule__Formula__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2793:1: ( rule__Formula__Group__3__Impl rule__Formula__Group__4 )
            // InternalVizualizer.g:2794:2: rule__Formula__Group__3__Impl rule__Formula__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalVizualizer.g:2801:1: rule__Formula__Group__3__Impl : ( ')' ) ;
    public final void rule__Formula__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2805:1: ( ( ')' ) )
            // InternalVizualizer.g:2806:1: ( ')' )
            {
            // InternalVizualizer.g:2806:1: ( ')' )
            // InternalVizualizer.g:2807:2: ')'
            {
             before(grammarAccess.getFormulaAccess().getRightParenthesisKeyword_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalVizualizer.g:2816:1: rule__Formula__Group__4 : rule__Formula__Group__4__Impl rule__Formula__Group__5 ;
    public final void rule__Formula__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2820:1: ( rule__Formula__Group__4__Impl rule__Formula__Group__5 )
            // InternalVizualizer.g:2821:2: rule__Formula__Group__4__Impl rule__Formula__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalVizualizer.g:2828:1: rule__Formula__Group__4__Impl : ( '=' ) ;
    public final void rule__Formula__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2832:1: ( ( '=' ) )
            // InternalVizualizer.g:2833:1: ( '=' )
            {
            // InternalVizualizer.g:2833:1: ( '=' )
            // InternalVizualizer.g:2834:2: '='
            {
             before(grammarAccess.getFormulaAccess().getEqualsSignKeyword_4()); 
            match(input,43,FOLLOW_2); 
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
    // InternalVizualizer.g:2843:1: rule__Formula__Group__5 : rule__Formula__Group__5__Impl ;
    public final void rule__Formula__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2847:1: ( rule__Formula__Group__5__Impl )
            // InternalVizualizer.g:2848:2: rule__Formula__Group__5__Impl
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
    // InternalVizualizer.g:2854:1: rule__Formula__Group__5__Impl : ( ( rule__Formula__ExpAssignment_5 ) ) ;
    public final void rule__Formula__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2858:1: ( ( ( rule__Formula__ExpAssignment_5 ) ) )
            // InternalVizualizer.g:2859:1: ( ( rule__Formula__ExpAssignment_5 ) )
            {
            // InternalVizualizer.g:2859:1: ( ( rule__Formula__ExpAssignment_5 ) )
            // InternalVizualizer.g:2860:2: ( rule__Formula__ExpAssignment_5 )
            {
             before(grammarAccess.getFormulaAccess().getExpAssignment_5()); 
            // InternalVizualizer.g:2861:2: ( rule__Formula__ExpAssignment_5 )
            // InternalVizualizer.g:2861:3: rule__Formula__ExpAssignment_5
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
    // InternalVizualizer.g:2870:1: rule__Formula__Group_2__0 : rule__Formula__Group_2__0__Impl rule__Formula__Group_2__1 ;
    public final void rule__Formula__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2874:1: ( rule__Formula__Group_2__0__Impl rule__Formula__Group_2__1 )
            // InternalVizualizer.g:2875:2: rule__Formula__Group_2__0__Impl rule__Formula__Group_2__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalVizualizer.g:2882:1: rule__Formula__Group_2__0__Impl : ( ( rule__Formula__VarsAssignment_2_0 ) ) ;
    public final void rule__Formula__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2886:1: ( ( ( rule__Formula__VarsAssignment_2_0 ) ) )
            // InternalVizualizer.g:2887:1: ( ( rule__Formula__VarsAssignment_2_0 ) )
            {
            // InternalVizualizer.g:2887:1: ( ( rule__Formula__VarsAssignment_2_0 ) )
            // InternalVizualizer.g:2888:2: ( rule__Formula__VarsAssignment_2_0 )
            {
             before(grammarAccess.getFormulaAccess().getVarsAssignment_2_0()); 
            // InternalVizualizer.g:2889:2: ( rule__Formula__VarsAssignment_2_0 )
            // InternalVizualizer.g:2889:3: rule__Formula__VarsAssignment_2_0
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
    // InternalVizualizer.g:2897:1: rule__Formula__Group_2__1 : rule__Formula__Group_2__1__Impl ;
    public final void rule__Formula__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2901:1: ( rule__Formula__Group_2__1__Impl )
            // InternalVizualizer.g:2902:2: rule__Formula__Group_2__1__Impl
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
    // InternalVizualizer.g:2908:1: rule__Formula__Group_2__1__Impl : ( ( rule__Formula__Group_2_1__0 )* ) ;
    public final void rule__Formula__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2912:1: ( ( ( rule__Formula__Group_2_1__0 )* ) )
            // InternalVizualizer.g:2913:1: ( ( rule__Formula__Group_2_1__0 )* )
            {
            // InternalVizualizer.g:2913:1: ( ( rule__Formula__Group_2_1__0 )* )
            // InternalVizualizer.g:2914:2: ( rule__Formula__Group_2_1__0 )*
            {
             before(grammarAccess.getFormulaAccess().getGroup_2_1()); 
            // InternalVizualizer.g:2915:2: ( rule__Formula__Group_2_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalVizualizer.g:2915:3: rule__Formula__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Formula__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalVizualizer.g:2924:1: rule__Formula__Group_2_1__0 : rule__Formula__Group_2_1__0__Impl rule__Formula__Group_2_1__1 ;
    public final void rule__Formula__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2928:1: ( rule__Formula__Group_2_1__0__Impl rule__Formula__Group_2_1__1 )
            // InternalVizualizer.g:2929:2: rule__Formula__Group_2_1__0__Impl rule__Formula__Group_2_1__1
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
    // InternalVizualizer.g:2936:1: rule__Formula__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Formula__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2940:1: ( ( ',' ) )
            // InternalVizualizer.g:2941:1: ( ',' )
            {
            // InternalVizualizer.g:2941:1: ( ',' )
            // InternalVizualizer.g:2942:2: ','
            {
             before(grammarAccess.getFormulaAccess().getCommaKeyword_2_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalVizualizer.g:2951:1: rule__Formula__Group_2_1__1 : rule__Formula__Group_2_1__1__Impl ;
    public final void rule__Formula__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2955:1: ( rule__Formula__Group_2_1__1__Impl )
            // InternalVizualizer.g:2956:2: rule__Formula__Group_2_1__1__Impl
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
    // InternalVizualizer.g:2962:1: rule__Formula__Group_2_1__1__Impl : ( ( rule__Formula__VarsAssignment_2_1_1 ) ) ;
    public final void rule__Formula__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2966:1: ( ( ( rule__Formula__VarsAssignment_2_1_1 ) ) )
            // InternalVizualizer.g:2967:1: ( ( rule__Formula__VarsAssignment_2_1_1 ) )
            {
            // InternalVizualizer.g:2967:1: ( ( rule__Formula__VarsAssignment_2_1_1 ) )
            // InternalVizualizer.g:2968:2: ( rule__Formula__VarsAssignment_2_1_1 )
            {
             before(grammarAccess.getFormulaAccess().getVarsAssignment_2_1_1()); 
            // InternalVizualizer.g:2969:2: ( rule__Formula__VarsAssignment_2_1_1 )
            // InternalVizualizer.g:2969:3: rule__Formula__VarsAssignment_2_1_1
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
    // InternalVizualizer.g:2978:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2982:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalVizualizer.g:2983:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalVizualizer.g:2990:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__LeftAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:2994:1: ( ( ( rule__Expression__LeftAssignment_0 ) ) )
            // InternalVizualizer.g:2995:1: ( ( rule__Expression__LeftAssignment_0 ) )
            {
            // InternalVizualizer.g:2995:1: ( ( rule__Expression__LeftAssignment_0 ) )
            // InternalVizualizer.g:2996:2: ( rule__Expression__LeftAssignment_0 )
            {
             before(grammarAccess.getExpressionAccess().getLeftAssignment_0()); 
            // InternalVizualizer.g:2997:2: ( rule__Expression__LeftAssignment_0 )
            // InternalVizualizer.g:2997:3: rule__Expression__LeftAssignment_0
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
    // InternalVizualizer.g:3005:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3009:1: ( rule__Expression__Group__1__Impl )
            // InternalVizualizer.g:3010:2: rule__Expression__Group__1__Impl
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
    // InternalVizualizer.g:3016:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3020:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // InternalVizualizer.g:3021:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // InternalVizualizer.g:3021:1: ( ( rule__Expression__Group_1__0 )? )
            // InternalVizualizer.g:3022:2: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalVizualizer.g:3023:2: ( rule__Expression__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=11 && LA17_0<=12)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalVizualizer.g:3023:3: rule__Expression__Group_1__0
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
    // InternalVizualizer.g:3032:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3036:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalVizualizer.g:3037:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalVizualizer.g:3044:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__OpAssignment_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3048:1: ( ( ( rule__Expression__OpAssignment_1_0 ) ) )
            // InternalVizualizer.g:3049:1: ( ( rule__Expression__OpAssignment_1_0 ) )
            {
            // InternalVizualizer.g:3049:1: ( ( rule__Expression__OpAssignment_1_0 ) )
            // InternalVizualizer.g:3050:2: ( rule__Expression__OpAssignment_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getOpAssignment_1_0()); 
            // InternalVizualizer.g:3051:2: ( rule__Expression__OpAssignment_1_0 )
            // InternalVizualizer.g:3051:3: rule__Expression__OpAssignment_1_0
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
    // InternalVizualizer.g:3059:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3063:1: ( rule__Expression__Group_1__1__Impl )
            // InternalVizualizer.g:3064:2: rule__Expression__Group_1__1__Impl
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
    // InternalVizualizer.g:3070:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__RightAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3074:1: ( ( ( rule__Expression__RightAssignment_1_1 ) ) )
            // InternalVizualizer.g:3075:1: ( ( rule__Expression__RightAssignment_1_1 ) )
            {
            // InternalVizualizer.g:3075:1: ( ( rule__Expression__RightAssignment_1_1 ) )
            // InternalVizualizer.g:3076:2: ( rule__Expression__RightAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_1()); 
            // InternalVizualizer.g:3077:2: ( rule__Expression__RightAssignment_1_1 )
            // InternalVizualizer.g:3077:3: rule__Expression__RightAssignment_1_1
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
    // InternalVizualizer.g:3086:1: rule__Factor__Group__0 : rule__Factor__Group__0__Impl rule__Factor__Group__1 ;
    public final void rule__Factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3090:1: ( rule__Factor__Group__0__Impl rule__Factor__Group__1 )
            // InternalVizualizer.g:3091:2: rule__Factor__Group__0__Impl rule__Factor__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalVizualizer.g:3098:1: rule__Factor__Group__0__Impl : ( ( rule__Factor__LeftAssignment_0 ) ) ;
    public final void rule__Factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3102:1: ( ( ( rule__Factor__LeftAssignment_0 ) ) )
            // InternalVizualizer.g:3103:1: ( ( rule__Factor__LeftAssignment_0 ) )
            {
            // InternalVizualizer.g:3103:1: ( ( rule__Factor__LeftAssignment_0 ) )
            // InternalVizualizer.g:3104:2: ( rule__Factor__LeftAssignment_0 )
            {
             before(grammarAccess.getFactorAccess().getLeftAssignment_0()); 
            // InternalVizualizer.g:3105:2: ( rule__Factor__LeftAssignment_0 )
            // InternalVizualizer.g:3105:3: rule__Factor__LeftAssignment_0
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
    // InternalVizualizer.g:3113:1: rule__Factor__Group__1 : rule__Factor__Group__1__Impl ;
    public final void rule__Factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3117:1: ( rule__Factor__Group__1__Impl )
            // InternalVizualizer.g:3118:2: rule__Factor__Group__1__Impl
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
    // InternalVizualizer.g:3124:1: rule__Factor__Group__1__Impl : ( ( rule__Factor__Group_1__0 )? ) ;
    public final void rule__Factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3128:1: ( ( ( rule__Factor__Group_1__0 )? ) )
            // InternalVizualizer.g:3129:1: ( ( rule__Factor__Group_1__0 )? )
            {
            // InternalVizualizer.g:3129:1: ( ( rule__Factor__Group_1__0 )? )
            // InternalVizualizer.g:3130:2: ( rule__Factor__Group_1__0 )?
            {
             before(grammarAccess.getFactorAccess().getGroup_1()); 
            // InternalVizualizer.g:3131:2: ( rule__Factor__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=13 && LA18_0<=14)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalVizualizer.g:3131:3: rule__Factor__Group_1__0
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
    // InternalVizualizer.g:3140:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3144:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // InternalVizualizer.g:3145:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalVizualizer.g:3152:1: rule__Factor__Group_1__0__Impl : ( ( rule__Factor__OpAssignment_1_0 ) ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3156:1: ( ( ( rule__Factor__OpAssignment_1_0 ) ) )
            // InternalVizualizer.g:3157:1: ( ( rule__Factor__OpAssignment_1_0 ) )
            {
            // InternalVizualizer.g:3157:1: ( ( rule__Factor__OpAssignment_1_0 ) )
            // InternalVizualizer.g:3158:2: ( rule__Factor__OpAssignment_1_0 )
            {
             before(grammarAccess.getFactorAccess().getOpAssignment_1_0()); 
            // InternalVizualizer.g:3159:2: ( rule__Factor__OpAssignment_1_0 )
            // InternalVizualizer.g:3159:3: rule__Factor__OpAssignment_1_0
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
    // InternalVizualizer.g:3167:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3171:1: ( rule__Factor__Group_1__1__Impl )
            // InternalVizualizer.g:3172:2: rule__Factor__Group_1__1__Impl
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
    // InternalVizualizer.g:3178:1: rule__Factor__Group_1__1__Impl : ( ( rule__Factor__RightAssignment_1_1 ) ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3182:1: ( ( ( rule__Factor__RightAssignment_1_1 ) ) )
            // InternalVizualizer.g:3183:1: ( ( rule__Factor__RightAssignment_1_1 ) )
            {
            // InternalVizualizer.g:3183:1: ( ( rule__Factor__RightAssignment_1_1 ) )
            // InternalVizualizer.g:3184:2: ( rule__Factor__RightAssignment_1_1 )
            {
             before(grammarAccess.getFactorAccess().getRightAssignment_1_1()); 
            // InternalVizualizer.g:3185:2: ( rule__Factor__RightAssignment_1_1 )
            // InternalVizualizer.g:3185:3: rule__Factor__RightAssignment_1_1
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
    // InternalVizualizer.g:3194:1: rule__Primitive__Group_2__0 : rule__Primitive__Group_2__0__Impl rule__Primitive__Group_2__1 ;
    public final void rule__Primitive__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3198:1: ( rule__Primitive__Group_2__0__Impl rule__Primitive__Group_2__1 )
            // InternalVizualizer.g:3199:2: rule__Primitive__Group_2__0__Impl rule__Primitive__Group_2__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalVizualizer.g:3206:1: rule__Primitive__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primitive__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3210:1: ( ( '(' ) )
            // InternalVizualizer.g:3211:1: ( '(' )
            {
            // InternalVizualizer.g:3211:1: ( '(' )
            // InternalVizualizer.g:3212:2: '('
            {
             before(grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalVizualizer.g:3221:1: rule__Primitive__Group_2__1 : rule__Primitive__Group_2__1__Impl rule__Primitive__Group_2__2 ;
    public final void rule__Primitive__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3225:1: ( rule__Primitive__Group_2__1__Impl rule__Primitive__Group_2__2 )
            // InternalVizualizer.g:3226:2: rule__Primitive__Group_2__1__Impl rule__Primitive__Group_2__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalVizualizer.g:3233:1: rule__Primitive__Group_2__1__Impl : ( ruleExpression ) ;
    public final void rule__Primitive__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3237:1: ( ( ruleExpression ) )
            // InternalVizualizer.g:3238:1: ( ruleExpression )
            {
            // InternalVizualizer.g:3238:1: ( ruleExpression )
            // InternalVizualizer.g:3239:2: ruleExpression
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
    // InternalVizualizer.g:3248:1: rule__Primitive__Group_2__2 : rule__Primitive__Group_2__2__Impl ;
    public final void rule__Primitive__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3252:1: ( rule__Primitive__Group_2__2__Impl )
            // InternalVizualizer.g:3253:2: rule__Primitive__Group_2__2__Impl
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
    // InternalVizualizer.g:3259:1: rule__Primitive__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primitive__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3263:1: ( ( ')' ) )
            // InternalVizualizer.g:3264:1: ( ')' )
            {
            // InternalVizualizer.g:3264:1: ( ')' )
            // InternalVizualizer.g:3265:2: ')'
            {
             before(grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_2_2()); 
            match(input,42,FOLLOW_2); 
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
    // InternalVizualizer.g:3275:1: rule__System__PagesAssignment_0 : ( rulePage ) ;
    public final void rule__System__PagesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3279:1: ( ( rulePage ) )
            // InternalVizualizer.g:3280:2: ( rulePage )
            {
            // InternalVizualizer.g:3280:2: ( rulePage )
            // InternalVizualizer.g:3281:3: rulePage
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
    // InternalVizualizer.g:3290:1: rule__System__SourcesAssignment_1 : ( ruleSource ) ;
    public final void rule__System__SourcesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3294:1: ( ( ruleSource ) )
            // InternalVizualizer.g:3295:2: ( ruleSource )
            {
            // InternalVizualizer.g:3295:2: ( ruleSource )
            // InternalVizualizer.g:3296:3: ruleSource
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
    // InternalVizualizer.g:3305:1: rule__System__SchemasAssignment_2 : ( ruleSchemaParser ) ;
    public final void rule__System__SchemasAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3309:1: ( ( ruleSchemaParser ) )
            // InternalVizualizer.g:3310:2: ( ruleSchemaParser )
            {
            // InternalVizualizer.g:3310:2: ( ruleSchemaParser )
            // InternalVizualizer.g:3311:3: ruleSchemaParser
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
    // InternalVizualizer.g:3320:1: rule__Page__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Page__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3324:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:3325:2: ( RULE_ID )
            {
            // InternalVizualizer.g:3325:2: ( RULE_ID )
            // InternalVizualizer.g:3326:3: RULE_ID
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
    // InternalVizualizer.g:3335:1: rule__Page__TilesAssignment_3 : ( ruleTile ) ;
    public final void rule__Page__TilesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3339:1: ( ( ruleTile ) )
            // InternalVizualizer.g:3340:2: ( ruleTile )
            {
            // InternalVizualizer.g:3340:2: ( ruleTile )
            // InternalVizualizer.g:3341:3: ruleTile
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
    // InternalVizualizer.g:3350:1: rule__Link__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Link__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3354:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:3355:2: ( RULE_ID )
            {
            // InternalVizualizer.g:3355:2: ( RULE_ID )
            // InternalVizualizer.g:3356:3: RULE_ID
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
    // InternalVizualizer.g:3365:1: rule__Link__PageAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Link__PageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3369:1: ( ( ( RULE_ID ) ) )
            // InternalVizualizer.g:3370:2: ( ( RULE_ID ) )
            {
            // InternalVizualizer.g:3370:2: ( ( RULE_ID ) )
            // InternalVizualizer.g:3371:3: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getPagePageCrossReference_3_0()); 
            // InternalVizualizer.g:3372:3: ( RULE_ID )
            // InternalVizualizer.g:3373:4: RULE_ID
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
    // InternalVizualizer.g:3384:1: rule__Graph__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Graph__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3388:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:3389:2: ( RULE_ID )
            {
            // InternalVizualizer.g:3389:2: ( RULE_ID )
            // InternalVizualizer.g:3390:3: RULE_ID
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
    // InternalVizualizer.g:3399:1: rule__Graph__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Graph__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3403:1: ( ( ( RULE_ID ) ) )
            // InternalVizualizer.g:3404:2: ( ( RULE_ID ) )
            {
            // InternalVizualizer.g:3404:2: ( ( RULE_ID ) )
            // InternalVizualizer.g:3405:3: ( RULE_ID )
            {
             before(grammarAccess.getGraphAccess().getSourceDatasourceCrossReference_2_0()); 
            // InternalVizualizer.g:3406:3: ( RULE_ID )
            // InternalVizualizer.g:3407:4: RULE_ID
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
    // InternalVizualizer.g:3418:1: rule__Datasource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Datasource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3422:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:3423:2: ( RULE_ID )
            {
            // InternalVizualizer.g:3423:2: ( RULE_ID )
            // InternalVizualizer.g:3424:3: RULE_ID
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
    // InternalVizualizer.g:3433:1: rule__Datasource__SourceAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Datasource__SourceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3437:1: ( ( ( RULE_ID ) ) )
            // InternalVizualizer.g:3438:2: ( ( RULE_ID ) )
            {
            // InternalVizualizer.g:3438:2: ( ( RULE_ID ) )
            // InternalVizualizer.g:3439:3: ( RULE_ID )
            {
             before(grammarAccess.getDatasourceAccess().getSourceSourceCrossReference_4_0()); 
            // InternalVizualizer.g:3440:3: ( RULE_ID )
            // InternalVizualizer.g:3441:4: RULE_ID
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


    // $ANTLR start "rule__Datasource__DimensionsAssignment_7"
    // InternalVizualizer.g:3452:1: rule__Datasource__DimensionsAssignment_7 : ( ruleDimension ) ;
    public final void rule__Datasource__DimensionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3456:1: ( ( ruleDimension ) )
            // InternalVizualizer.g:3457:2: ( ruleDimension )
            {
            // InternalVizualizer.g:3457:2: ( ruleDimension )
            // InternalVizualizer.g:3458:3: ruleDimension
            {
             before(grammarAccess.getDatasourceAccess().getDimensionsDimensionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleDimension();

            state._fsp--;

             after(grammarAccess.getDatasourceAccess().getDimensionsDimensionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__DimensionsAssignment_7"


    // $ANTLR start "rule__Datasource__DimensionsAssignment_8_1"
    // InternalVizualizer.g:3467:1: rule__Datasource__DimensionsAssignment_8_1 : ( ruleDimension ) ;
    public final void rule__Datasource__DimensionsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3471:1: ( ( ruleDimension ) )
            // InternalVizualizer.g:3472:2: ( ruleDimension )
            {
            // InternalVizualizer.g:3472:2: ( ruleDimension )
            // InternalVizualizer.g:3473:3: ruleDimension
            {
             before(grammarAccess.getDatasourceAccess().getDimensionsDimensionParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDimension();

            state._fsp--;

             after(grammarAccess.getDatasourceAccess().getDimensionsDimensionParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Datasource__DimensionsAssignment_8_1"


    // $ANTLR start "rule__Dimension__NameAssignment_1"
    // InternalVizualizer.g:3482:1: rule__Dimension__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Dimension__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3486:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:3487:2: ( RULE_ID )
            {
            // InternalVizualizer.g:3487:2: ( RULE_ID )
            // InternalVizualizer.g:3488:3: RULE_ID
            {
             before(grammarAccess.getDimensionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDimensionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Dimension__FormulaAssignment_4"
    // InternalVizualizer.g:3497:1: rule__Dimension__FormulaAssignment_4 : ( ruleFormula ) ;
    public final void rule__Dimension__FormulaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3501:1: ( ( ruleFormula ) )
            // InternalVizualizer.g:3502:2: ( ruleFormula )
            {
            // InternalVizualizer.g:3502:2: ( ruleFormula )
            // InternalVizualizer.g:3503:3: ruleFormula
            {
             before(grammarAccess.getDimensionAccess().getFormulaFormulaParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFormula();

            state._fsp--;

             after(grammarAccess.getDimensionAccess().getFormulaFormulaParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__FormulaAssignment_4"


    // $ANTLR start "rule__PostEndPoint__NameAssignment_1"
    // InternalVizualizer.g:3512:1: rule__PostEndPoint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PostEndPoint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3516:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:3517:2: ( RULE_ID )
            {
            // InternalVizualizer.g:3517:2: ( RULE_ID )
            // InternalVizualizer.g:3518:3: RULE_ID
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
    // InternalVizualizer.g:3527:1: rule__PostEndPoint__UrlAssignment_4 : ( RULE_STRING ) ;
    public final void rule__PostEndPoint__UrlAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3531:1: ( ( RULE_STRING ) )
            // InternalVizualizer.g:3532:2: ( RULE_STRING )
            {
            // InternalVizualizer.g:3532:2: ( RULE_STRING )
            // InternalVizualizer.g:3533:3: RULE_STRING
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
    // InternalVizualizer.g:3542:1: rule__PostEndPoint__ParserAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__PostEndPoint__ParserAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3546:1: ( ( ( RULE_ID ) ) )
            // InternalVizualizer.g:3547:2: ( ( RULE_ID ) )
            {
            // InternalVizualizer.g:3547:2: ( ( RULE_ID ) )
            // InternalVizualizer.g:3548:3: ( RULE_ID )
            {
             before(grammarAccess.getPostEndPointAccess().getParserSchemaParserCrossReference_6_0()); 
            // InternalVizualizer.g:3549:3: ( RULE_ID )
            // InternalVizualizer.g:3550:4: RULE_ID
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
    // InternalVizualizer.g:3561:1: rule__GetEndPoint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GetEndPoint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3565:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:3566:2: ( RULE_ID )
            {
            // InternalVizualizer.g:3566:2: ( RULE_ID )
            // InternalVizualizer.g:3567:3: RULE_ID
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
    // InternalVizualizer.g:3576:1: rule__GetEndPoint__UrlAssignment_4 : ( RULE_STRING ) ;
    public final void rule__GetEndPoint__UrlAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3580:1: ( ( RULE_STRING ) )
            // InternalVizualizer.g:3581:2: ( RULE_STRING )
            {
            // InternalVizualizer.g:3581:2: ( RULE_STRING )
            // InternalVizualizer.g:3582:3: RULE_STRING
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
    // InternalVizualizer.g:3591:1: rule__GetEndPoint__HeadersAssignment_7 : ( ruleHeader ) ;
    public final void rule__GetEndPoint__HeadersAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3595:1: ( ( ruleHeader ) )
            // InternalVizualizer.g:3596:2: ( ruleHeader )
            {
            // InternalVizualizer.g:3596:2: ( ruleHeader )
            // InternalVizualizer.g:3597:3: ruleHeader
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
    // InternalVizualizer.g:3606:1: rule__GetEndPoint__HeadersAssignment_8_1 : ( ruleHeader ) ;
    public final void rule__GetEndPoint__HeadersAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3610:1: ( ( ruleHeader ) )
            // InternalVizualizer.g:3611:2: ( ruleHeader )
            {
            // InternalVizualizer.g:3611:2: ( ruleHeader )
            // InternalVizualizer.g:3612:3: ruleHeader
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
    // InternalVizualizer.g:3621:1: rule__GetEndPoint__ParserAssignment_11 : ( ( RULE_ID ) ) ;
    public final void rule__GetEndPoint__ParserAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3625:1: ( ( ( RULE_ID ) ) )
            // InternalVizualizer.g:3626:2: ( ( RULE_ID ) )
            {
            // InternalVizualizer.g:3626:2: ( ( RULE_ID ) )
            // InternalVizualizer.g:3627:3: ( RULE_ID )
            {
             before(grammarAccess.getGetEndPointAccess().getParserSchemaParserCrossReference_11_0()); 
            // InternalVizualizer.g:3628:3: ( RULE_ID )
            // InternalVizualizer.g:3629:4: RULE_ID
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
    // InternalVizualizer.g:3640:1: rule__Header__KeywordAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Header__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3644:1: ( ( RULE_STRING ) )
            // InternalVizualizer.g:3645:2: ( RULE_STRING )
            {
            // InternalVizualizer.g:3645:2: ( RULE_STRING )
            // InternalVizualizer.g:3646:3: RULE_STRING
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
    // InternalVizualizer.g:3655:1: rule__Header__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Header__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3659:1: ( ( RULE_STRING ) )
            // InternalVizualizer.g:3660:2: ( RULE_STRING )
            {
            // InternalVizualizer.g:3660:2: ( RULE_STRING )
            // InternalVizualizer.g:3661:3: RULE_STRING
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
    // InternalVizualizer.g:3670:1: rule__SchemaParser__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SchemaParser__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3674:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:3675:2: ( RULE_ID )
            {
            // InternalVizualizer.g:3675:2: ( RULE_ID )
            // InternalVizualizer.g:3676:3: RULE_ID
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
    // InternalVizualizer.g:3685:1: rule__SchemaParser__SchemaTypeAssignment_4 : ( ruleSchemaType ) ;
    public final void rule__SchemaParser__SchemaTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3689:1: ( ( ruleSchemaType ) )
            // InternalVizualizer.g:3690:2: ( ruleSchemaType )
            {
            // InternalVizualizer.g:3690:2: ( ruleSchemaType )
            // InternalVizualizer.g:3691:3: ruleSchemaType
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
    // InternalVizualizer.g:3700:1: rule__SchemaParser__SelectorsAssignment_5 : ( ruleSelector ) ;
    public final void rule__SchemaParser__SelectorsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3704:1: ( ( ruleSelector ) )
            // InternalVizualizer.g:3705:2: ( ruleSelector )
            {
            // InternalVizualizer.g:3705:2: ( ruleSelector )
            // InternalVizualizer.g:3706:3: ruleSelector
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


    // $ANTLR start "rule__Selector__NameAssignment_1"
    // InternalVizualizer.g:3715:1: rule__Selector__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Selector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3719:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:3720:2: ( RULE_ID )
            {
            // InternalVizualizer.g:3720:2: ( RULE_ID )
            // InternalVizualizer.g:3721:3: RULE_ID
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
    // InternalVizualizer.g:3730:1: rule__Selector__StepsAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Selector__StepsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3734:1: ( ( RULE_STRING ) )
            // InternalVizualizer.g:3735:2: ( RULE_STRING )
            {
            // InternalVizualizer.g:3735:2: ( RULE_STRING )
            // InternalVizualizer.g:3736:3: RULE_STRING
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
    // InternalVizualizer.g:3745:1: rule__Selector__StepsAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Selector__StepsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3749:1: ( ( RULE_STRING ) )
            // InternalVizualizer.g:3750:2: ( RULE_STRING )
            {
            // InternalVizualizer.g:3750:2: ( RULE_STRING )
            // InternalVizualizer.g:3751:3: RULE_STRING
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
    // InternalVizualizer.g:3760:1: rule__Formula__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Formula__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3764:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:3765:2: ( RULE_ID )
            {
            // InternalVizualizer.g:3765:2: ( RULE_ID )
            // InternalVizualizer.g:3766:3: RULE_ID
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
    // InternalVizualizer.g:3775:1: rule__Formula__VarsAssignment_2_0 : ( ruleVariable ) ;
    public final void rule__Formula__VarsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3779:1: ( ( ruleVariable ) )
            // InternalVizualizer.g:3780:2: ( ruleVariable )
            {
            // InternalVizualizer.g:3780:2: ( ruleVariable )
            // InternalVizualizer.g:3781:3: ruleVariable
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
    // InternalVizualizer.g:3790:1: rule__Formula__VarsAssignment_2_1_1 : ( ruleVariable ) ;
    public final void rule__Formula__VarsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3794:1: ( ( ruleVariable ) )
            // InternalVizualizer.g:3795:2: ( ruleVariable )
            {
            // InternalVizualizer.g:3795:2: ( ruleVariable )
            // InternalVizualizer.g:3796:3: ruleVariable
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
    // InternalVizualizer.g:3805:1: rule__Formula__ExpAssignment_5 : ( ruleExpression ) ;
    public final void rule__Formula__ExpAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3809:1: ( ( ruleExpression ) )
            // InternalVizualizer.g:3810:2: ( ruleExpression )
            {
            // InternalVizualizer.g:3810:2: ( ruleExpression )
            // InternalVizualizer.g:3811:3: ruleExpression
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
    // InternalVizualizer.g:3820:1: rule__Expression__LeftAssignment_0 : ( ruleFactor ) ;
    public final void rule__Expression__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3824:1: ( ( ruleFactor ) )
            // InternalVizualizer.g:3825:2: ( ruleFactor )
            {
            // InternalVizualizer.g:3825:2: ( ruleFactor )
            // InternalVizualizer.g:3826:3: ruleFactor
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
    // InternalVizualizer.g:3835:1: rule__Expression__OpAssignment_1_0 : ( ruleOp1 ) ;
    public final void rule__Expression__OpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3839:1: ( ( ruleOp1 ) )
            // InternalVizualizer.g:3840:2: ( ruleOp1 )
            {
            // InternalVizualizer.g:3840:2: ( ruleOp1 )
            // InternalVizualizer.g:3841:3: ruleOp1
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
    // InternalVizualizer.g:3850:1: rule__Expression__RightAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__Expression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3854:1: ( ( ruleExpression ) )
            // InternalVizualizer.g:3855:2: ( ruleExpression )
            {
            // InternalVizualizer.g:3855:2: ( ruleExpression )
            // InternalVizualizer.g:3856:3: ruleExpression
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
    // InternalVizualizer.g:3865:1: rule__Factor__LeftAssignment_0 : ( rulePrimitive ) ;
    public final void rule__Factor__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3869:1: ( ( rulePrimitive ) )
            // InternalVizualizer.g:3870:2: ( rulePrimitive )
            {
            // InternalVizualizer.g:3870:2: ( rulePrimitive )
            // InternalVizualizer.g:3871:3: rulePrimitive
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
    // InternalVizualizer.g:3880:1: rule__Factor__OpAssignment_1_0 : ( ruleOp2 ) ;
    public final void rule__Factor__OpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3884:1: ( ( ruleOp2 ) )
            // InternalVizualizer.g:3885:2: ( ruleOp2 )
            {
            // InternalVizualizer.g:3885:2: ( ruleOp2 )
            // InternalVizualizer.g:3886:3: ruleOp2
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
    // InternalVizualizer.g:3895:1: rule__Factor__RightAssignment_1_1 : ( ruleFactor ) ;
    public final void rule__Factor__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3899:1: ( ( ruleFactor ) )
            // InternalVizualizer.g:3900:2: ( ruleFactor )
            {
            // InternalVizualizer.g:3900:2: ( ruleFactor )
            // InternalVizualizer.g:3901:3: ruleFactor
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
    // InternalVizualizer.g:3910:1: rule__Number__ValAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3914:1: ( ( RULE_INT ) )
            // InternalVizualizer.g:3915:2: ( RULE_INT )
            {
            // InternalVizualizer.g:3915:2: ( RULE_INT )
            // InternalVizualizer.g:3916:3: RULE_INT
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
    // InternalVizualizer.g:3925:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVizualizer.g:3929:1: ( ( RULE_ID ) )
            // InternalVizualizer.g:3930:2: ( RULE_ID )
            {
            // InternalVizualizer.g:3930:2: ( RULE_ID )
            // InternalVizualizer.g:3931:3: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000002901040002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000B00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000050L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});

}