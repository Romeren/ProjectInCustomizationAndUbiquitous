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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVizualizerParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Page'", "'{'", "'}'", "'Link'", "'to'", "'Graph'", "'Datasource'", "'Source'", "'Dimension'", "'as'", "'Formula'", "'URI'", "'url'", "'use Schema'", "'Schema'", "'SchemaType = '", "'Selector as '", "' -> '", "'('", "','", "')'", "'='", "'+'", "'-'", "'*'", "'/'", "'XML'", "'CSV'", "'JSON'"
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




    // $ANTLR start "entryRuleSystem"
    // InternalVizualizer.g:65:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalVizualizer.g:65:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalVizualizer.g:66:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalVizualizer.g:72:1: ruleSystem returns [EObject current=null] : ( ( (lv_pages_0_0= rulePage ) ) | ( (lv_sources_1_0= ruleSource ) ) | ( (lv_schemas_2_0= ruleSchemaParser ) ) )* ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        EObject lv_pages_0_0 = null;

        EObject lv_sources_1_0 = null;

        EObject lv_schemas_2_0 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:78:2: ( ( ( (lv_pages_0_0= rulePage ) ) | ( (lv_sources_1_0= ruleSource ) ) | ( (lv_schemas_2_0= ruleSchemaParser ) ) )* )
            // InternalVizualizer.g:79:2: ( ( (lv_pages_0_0= rulePage ) ) | ( (lv_sources_1_0= ruleSource ) ) | ( (lv_schemas_2_0= ruleSchemaParser ) ) )*
            {
            // InternalVizualizer.g:79:2: ( ( (lv_pages_0_0= rulePage ) ) | ( (lv_sources_1_0= ruleSource ) ) | ( (lv_schemas_2_0= ruleSchemaParser ) ) )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case 11:
                    {
                    alt1=1;
                    }
                    break;
                case 17:
                case 22:
                    {
                    alt1=2;
                    }
                    break;
                case 25:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalVizualizer.g:80:3: ( (lv_pages_0_0= rulePage ) )
            	    {
            	    // InternalVizualizer.g:80:3: ( (lv_pages_0_0= rulePage ) )
            	    // InternalVizualizer.g:81:4: (lv_pages_0_0= rulePage )
            	    {
            	    // InternalVizualizer.g:81:4: (lv_pages_0_0= rulePage )
            	    // InternalVizualizer.g:82:5: lv_pages_0_0= rulePage
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getPagesPageParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_pages_0_0=rulePage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"pages",
            	    						lv_pages_0_0,
            	    						"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.Page");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVizualizer.g:100:3: ( (lv_sources_1_0= ruleSource ) )
            	    {
            	    // InternalVizualizer.g:100:3: ( (lv_sources_1_0= ruleSource ) )
            	    // InternalVizualizer.g:101:4: (lv_sources_1_0= ruleSource )
            	    {
            	    // InternalVizualizer.g:101:4: (lv_sources_1_0= ruleSource )
            	    // InternalVizualizer.g:102:5: lv_sources_1_0= ruleSource
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getSourcesSourceParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_sources_1_0=ruleSource();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sources",
            	    						lv_sources_1_0,
            	    						"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.Source");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalVizualizer.g:120:3: ( (lv_schemas_2_0= ruleSchemaParser ) )
            	    {
            	    // InternalVizualizer.g:120:3: ( (lv_schemas_2_0= ruleSchemaParser ) )
            	    // InternalVizualizer.g:121:4: (lv_schemas_2_0= ruleSchemaParser )
            	    {
            	    // InternalVizualizer.g:121:4: (lv_schemas_2_0= ruleSchemaParser )
            	    // InternalVizualizer.g:122:5: lv_schemas_2_0= ruleSchemaParser
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getSchemasSchemaParserParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_schemas_2_0=ruleSchemaParser();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"schemas",
            	    						lv_schemas_2_0,
            	    						"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.SchemaParser");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRulePage"
    // InternalVizualizer.g:143:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // InternalVizualizer.g:143:45: (iv_rulePage= rulePage EOF )
            // InternalVizualizer.g:144:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // InternalVizualizer.g:150:1: rulePage returns [EObject current=null] : (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tiles_3_0= ruleTile ) )* otherlv_4= '}' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_tiles_3_0 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:156:2: ( (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tiles_3_0= ruleTile ) )* otherlv_4= '}' ) )
            // InternalVizualizer.g:157:2: (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tiles_3_0= ruleTile ) )* otherlv_4= '}' )
            {
            // InternalVizualizer.g:157:2: (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tiles_3_0= ruleTile ) )* otherlv_4= '}' )
            // InternalVizualizer.g:158:3: otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tiles_3_0= ruleTile ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
            		
            // InternalVizualizer.g:162:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVizualizer.g:163:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVizualizer.g:163:4: (lv_name_1_0= RULE_ID )
            // InternalVizualizer.g:164:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalVizualizer.g:184:3: ( (lv_tiles_3_0= ruleTile ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14||LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalVizualizer.g:185:4: (lv_tiles_3_0= ruleTile )
            	    {
            	    // InternalVizualizer.g:185:4: (lv_tiles_3_0= ruleTile )
            	    // InternalVizualizer.g:186:5: lv_tiles_3_0= ruleTile
            	    {

            	    					newCompositeNode(grammarAccess.getPageAccess().getTilesTileParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_tiles_3_0=ruleTile();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tiles",
            	    						lv_tiles_3_0,
            	    						"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.Tile");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleTile"
    // InternalVizualizer.g:211:1: entryRuleTile returns [EObject current=null] : iv_ruleTile= ruleTile EOF ;
    public final EObject entryRuleTile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTile = null;


        try {
            // InternalVizualizer.g:211:45: (iv_ruleTile= ruleTile EOF )
            // InternalVizualizer.g:212:2: iv_ruleTile= ruleTile EOF
            {
             newCompositeNode(grammarAccess.getTileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTile=ruleTile();

            state._fsp--;

             current =iv_ruleTile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTile"


    // $ANTLR start "ruleTile"
    // InternalVizualizer.g:218:1: ruleTile returns [EObject current=null] : (this_Link_0= ruleLink | this_Graph_1= ruleGraph ) ;
    public final EObject ruleTile() throws RecognitionException {
        EObject current = null;

        EObject this_Link_0 = null;

        EObject this_Graph_1 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:224:2: ( (this_Link_0= ruleLink | this_Graph_1= ruleGraph ) )
            // InternalVizualizer.g:225:2: (this_Link_0= ruleLink | this_Graph_1= ruleGraph )
            {
            // InternalVizualizer.g:225:2: (this_Link_0= ruleLink | this_Graph_1= ruleGraph )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalVizualizer.g:226:3: this_Link_0= ruleLink
                    {

                    			newCompositeNode(grammarAccess.getTileAccess().getLinkParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Link_0=ruleLink();

                    state._fsp--;


                    			current = this_Link_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:235:3: this_Graph_1= ruleGraph
                    {

                    			newCompositeNode(grammarAccess.getTileAccess().getGraphParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Graph_1=ruleGraph();

                    state._fsp--;


                    			current = this_Graph_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTile"


    // $ANTLR start "entryRuleLink"
    // InternalVizualizer.g:247:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalVizualizer.g:247:45: (iv_ruleLink= ruleLink EOF )
            // InternalVizualizer.g:248:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalVizualizer.g:254:1: ruleLink returns [EObject current=null] : (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVizualizer.g:260:2: ( (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalVizualizer.g:261:2: (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalVizualizer.g:261:2: (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) )
            // InternalVizualizer.g:262:3: otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalVizualizer.g:266:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVizualizer.g:267:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVizualizer.g:267:4: (lv_name_1_0= RULE_ID )
            // InternalVizualizer.g:268:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getToKeyword_2());
            		
            // InternalVizualizer.g:288:3: ( (otherlv_3= RULE_ID ) )
            // InternalVizualizer.g:289:4: (otherlv_3= RULE_ID )
            {
            // InternalVizualizer.g:289:4: (otherlv_3= RULE_ID )
            // InternalVizualizer.g:290:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getPagePageCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleGraph"
    // InternalVizualizer.g:305:1: entryRuleGraph returns [EObject current=null] : iv_ruleGraph= ruleGraph EOF ;
    public final EObject entryRuleGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraph = null;


        try {
            // InternalVizualizer.g:305:46: (iv_ruleGraph= ruleGraph EOF )
            // InternalVizualizer.g:306:2: iv_ruleGraph= ruleGraph EOF
            {
             newCompositeNode(grammarAccess.getGraphRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraph=ruleGraph();

            state._fsp--;

             current =iv_ruleGraph; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraph"


    // $ANTLR start "ruleGraph"
    // InternalVizualizer.g:312:1: ruleGraph returns [EObject current=null] : (otherlv_0= 'Graph' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleGraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalVizualizer.g:318:2: ( (otherlv_0= 'Graph' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // InternalVizualizer.g:319:2: (otherlv_0= 'Graph' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalVizualizer.g:319:2: (otherlv_0= 'Graph' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) )
            // InternalVizualizer.g:320:3: otherlv_0= 'Graph' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphAccess().getGraphKeyword_0());
            		
            // InternalVizualizer.g:324:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVizualizer.g:325:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVizualizer.g:325:4: (lv_name_1_0= RULE_ID )
            // InternalVizualizer.g:326:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGraphAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalVizualizer.g:342:3: ( (otherlv_2= RULE_ID ) )
            // InternalVizualizer.g:343:4: (otherlv_2= RULE_ID )
            {
            // InternalVizualizer.g:343:4: (otherlv_2= RULE_ID )
            // InternalVizualizer.g:344:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGraphRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getGraphAccess().getSourceDatasourceCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraph"


    // $ANTLR start "entryRuleDatasource"
    // InternalVizualizer.g:359:1: entryRuleDatasource returns [EObject current=null] : iv_ruleDatasource= ruleDatasource EOF ;
    public final EObject entryRuleDatasource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasource = null;


        try {
            // InternalVizualizer.g:359:51: (iv_ruleDatasource= ruleDatasource EOF )
            // InternalVizualizer.g:360:2: iv_ruleDatasource= ruleDatasource EOF
            {
             newCompositeNode(grammarAccess.getDatasourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatasource=ruleDatasource();

            state._fsp--;

             current =iv_ruleDatasource; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatasource"


    // $ANTLR start "ruleDatasource"
    // InternalVizualizer.g:366:1: ruleDatasource returns [EObject current=null] : (otherlv_0= 'Datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) ( (lv_dimensions_5_0= ruleDimensionalData ) )+ otherlv_6= '}' ) ;
    public final EObject ruleDatasource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_dimensions_5_0 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:372:2: ( (otherlv_0= 'Datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) ( (lv_dimensions_5_0= ruleDimensionalData ) )+ otherlv_6= '}' ) )
            // InternalVizualizer.g:373:2: (otherlv_0= 'Datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) ( (lv_dimensions_5_0= ruleDimensionalData ) )+ otherlv_6= '}' )
            {
            // InternalVizualizer.g:373:2: (otherlv_0= 'Datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) ( (lv_dimensions_5_0= ruleDimensionalData ) )+ otherlv_6= '}' )
            // InternalVizualizer.g:374:3: otherlv_0= 'Datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) ( (lv_dimensions_5_0= ruleDimensionalData ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDatasourceAccess().getDatasourceKeyword_0());
            		
            // InternalVizualizer.g:378:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVizualizer.g:379:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVizualizer.g:379:4: (lv_name_1_0= RULE_ID )
            // InternalVizualizer.g:380:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDatasourceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getDatasourceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getDatasourceAccess().getSourceKeyword_3());
            		
            // InternalVizualizer.g:404:3: ( (otherlv_4= RULE_ID ) )
            // InternalVizualizer.g:405:4: (otherlv_4= RULE_ID )
            {
            // InternalVizualizer.g:405:4: (otherlv_4= RULE_ID )
            // InternalVizualizer.g:406:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasourceRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_4, grammarAccess.getDatasourceAccess().getSourceSourceCrossReference_4_0());
            				

            }


            }

            // InternalVizualizer.g:417:3: ( (lv_dimensions_5_0= ruleDimensionalData ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalVizualizer.g:418:4: (lv_dimensions_5_0= ruleDimensionalData )
            	    {
            	    // InternalVizualizer.g:418:4: (lv_dimensions_5_0= ruleDimensionalData )
            	    // InternalVizualizer.g:419:5: lv_dimensions_5_0= ruleDimensionalData
            	    {

            	    					newCompositeNode(grammarAccess.getDatasourceAccess().getDimensionsDimensionalDataParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_dimensions_5_0=ruleDimensionalData();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDatasourceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dimensions",
            	    						lv_dimensions_5_0,
            	    						"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.DimensionalData");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDatasourceAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatasource"


    // $ANTLR start "entryRuleDimensionalData"
    // InternalVizualizer.g:444:1: entryRuleDimensionalData returns [EObject current=null] : iv_ruleDimensionalData= ruleDimensionalData EOF ;
    public final EObject entryRuleDimensionalData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimensionalData = null;


        try {
            // InternalVizualizer.g:444:56: (iv_ruleDimensionalData= ruleDimensionalData EOF )
            // InternalVizualizer.g:445:2: iv_ruleDimensionalData= ruleDimensionalData EOF
            {
             newCompositeNode(grammarAccess.getDimensionalDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDimensionalData=ruleDimensionalData();

            state._fsp--;

             current =iv_ruleDimensionalData; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDimensionalData"


    // $ANTLR start "ruleDimensionalData"
    // InternalVizualizer.g:451:1: ruleDimensionalData returns [EObject current=null] : (otherlv_0= 'Dimension' ( (lv_dim_1_0= RULE_ID ) ) otherlv_2= 'as' otherlv_3= 'Formula' ( (lv_formula_4_0= ruleFormula ) ) ) ;
    public final EObject ruleDimensionalData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_dim_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_formula_4_0 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:457:2: ( (otherlv_0= 'Dimension' ( (lv_dim_1_0= RULE_ID ) ) otherlv_2= 'as' otherlv_3= 'Formula' ( (lv_formula_4_0= ruleFormula ) ) ) )
            // InternalVizualizer.g:458:2: (otherlv_0= 'Dimension' ( (lv_dim_1_0= RULE_ID ) ) otherlv_2= 'as' otherlv_3= 'Formula' ( (lv_formula_4_0= ruleFormula ) ) )
            {
            // InternalVizualizer.g:458:2: (otherlv_0= 'Dimension' ( (lv_dim_1_0= RULE_ID ) ) otherlv_2= 'as' otherlv_3= 'Formula' ( (lv_formula_4_0= ruleFormula ) ) )
            // InternalVizualizer.g:459:3: otherlv_0= 'Dimension' ( (lv_dim_1_0= RULE_ID ) ) otherlv_2= 'as' otherlv_3= 'Formula' ( (lv_formula_4_0= ruleFormula ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDimensionalDataAccess().getDimensionKeyword_0());
            		
            // InternalVizualizer.g:463:3: ( (lv_dim_1_0= RULE_ID ) )
            // InternalVizualizer.g:464:4: (lv_dim_1_0= RULE_ID )
            {
            // InternalVizualizer.g:464:4: (lv_dim_1_0= RULE_ID )
            // InternalVizualizer.g:465:5: lv_dim_1_0= RULE_ID
            {
            lv_dim_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_dim_1_0, grammarAccess.getDimensionalDataAccess().getDimIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDimensionalDataRule());
            					}
            					addWithLastConsumed(
            						current,
            						"dim",
            						lv_dim_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getDimensionalDataAccess().getAsKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getDimensionalDataAccess().getFormulaKeyword_3());
            		
            // InternalVizualizer.g:489:3: ( (lv_formula_4_0= ruleFormula ) )
            // InternalVizualizer.g:490:4: (lv_formula_4_0= ruleFormula )
            {
            // InternalVizualizer.g:490:4: (lv_formula_4_0= ruleFormula )
            // InternalVizualizer.g:491:5: lv_formula_4_0= ruleFormula
            {

            					newCompositeNode(grammarAccess.getDimensionalDataAccess().getFormulaFormulaParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_formula_4_0=ruleFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDimensionalDataRule());
            					}
            					add(
            						current,
            						"formula",
            						lv_formula_4_0,
            						"org.xtext.sdu.formularzlanguage.Formular.Formula");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDimensionalData"


    // $ANTLR start "entryRuleSource"
    // InternalVizualizer.g:512:1: entryRuleSource returns [EObject current=null] : iv_ruleSource= ruleSource EOF ;
    public final EObject entryRuleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource = null;


        try {
            // InternalVizualizer.g:512:47: (iv_ruleSource= ruleSource EOF )
            // InternalVizualizer.g:513:2: iv_ruleSource= ruleSource EOF
            {
             newCompositeNode(grammarAccess.getSourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSource=ruleSource();

            state._fsp--;

             current =iv_ruleSource; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSource"


    // $ANTLR start "ruleSource"
    // InternalVizualizer.g:519:1: ruleSource returns [EObject current=null] : (this_URI_0= ruleURI | this_Datasource_1= ruleDatasource ) ;
    public final EObject ruleSource() throws RecognitionException {
        EObject current = null;

        EObject this_URI_0 = null;

        EObject this_Datasource_1 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:525:2: ( (this_URI_0= ruleURI | this_Datasource_1= ruleDatasource ) )
            // InternalVizualizer.g:526:2: (this_URI_0= ruleURI | this_Datasource_1= ruleDatasource )
            {
            // InternalVizualizer.g:526:2: (this_URI_0= ruleURI | this_Datasource_1= ruleDatasource )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalVizualizer.g:527:3: this_URI_0= ruleURI
                    {

                    			newCompositeNode(grammarAccess.getSourceAccess().getURIParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_URI_0=ruleURI();

                    state._fsp--;


                    			current = this_URI_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:536:3: this_Datasource_1= ruleDatasource
                    {

                    			newCompositeNode(grammarAccess.getSourceAccess().getDatasourceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Datasource_1=ruleDatasource();

                    state._fsp--;


                    			current = this_Datasource_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSource"


    // $ANTLR start "entryRuleURI"
    // InternalVizualizer.g:548:1: entryRuleURI returns [EObject current=null] : iv_ruleURI= ruleURI EOF ;
    public final EObject entryRuleURI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURI = null;


        try {
            // InternalVizualizer.g:548:44: (iv_ruleURI= ruleURI EOF )
            // InternalVizualizer.g:549:2: iv_ruleURI= ruleURI EOF
            {
             newCompositeNode(grammarAccess.getURIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleURI=ruleURI();

            state._fsp--;

             current =iv_ruleURI; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleURI"


    // $ANTLR start "ruleURI"
    // InternalVizualizer.g:555:1: ruleURI returns [EObject current=null] : (otherlv_0= 'URI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_uri_4_0= RULE_STRING ) ) otherlv_5= 'use Schema' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' ) ;
    public final EObject ruleURI() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_uri_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalVizualizer.g:561:2: ( (otherlv_0= 'URI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_uri_4_0= RULE_STRING ) ) otherlv_5= 'use Schema' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' ) )
            // InternalVizualizer.g:562:2: (otherlv_0= 'URI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_uri_4_0= RULE_STRING ) ) otherlv_5= 'use Schema' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' )
            {
            // InternalVizualizer.g:562:2: (otherlv_0= 'URI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_uri_4_0= RULE_STRING ) ) otherlv_5= 'use Schema' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' )
            // InternalVizualizer.g:563:3: otherlv_0= 'URI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_uri_4_0= RULE_STRING ) ) otherlv_5= 'use Schema' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getURIAccess().getURIKeyword_0());
            		
            // InternalVizualizer.g:567:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVizualizer.g:568:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVizualizer.g:568:4: (lv_name_1_0= RULE_ID )
            // InternalVizualizer.g:569:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getURIAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getURIRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getURIAccess().getUrlKeyword_3());
            		
            // InternalVizualizer.g:593:3: ( (lv_uri_4_0= RULE_STRING ) )
            // InternalVizualizer.g:594:4: (lv_uri_4_0= RULE_STRING )
            {
            // InternalVizualizer.g:594:4: (lv_uri_4_0= RULE_STRING )
            // InternalVizualizer.g:595:5: lv_uri_4_0= RULE_STRING
            {
            lv_uri_4_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_uri_4_0, grammarAccess.getURIAccess().getUriSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getURIRule());
            					}
            					setWithLastConsumed(
            						current,
            						"uri",
            						lv_uri_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getURIAccess().getUseSchemaKeyword_5());
            		
            // InternalVizualizer.g:615:3: ( (otherlv_6= RULE_ID ) )
            // InternalVizualizer.g:616:4: (otherlv_6= RULE_ID )
            {
            // InternalVizualizer.g:616:4: (otherlv_6= RULE_ID )
            // InternalVizualizer.g:617:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getURIRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_6, grammarAccess.getURIAccess().getParserSchemaParserCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getURIAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleURI"


    // $ANTLR start "entryRuleSchemaParser"
    // InternalVizualizer.g:636:1: entryRuleSchemaParser returns [EObject current=null] : iv_ruleSchemaParser= ruleSchemaParser EOF ;
    public final EObject entryRuleSchemaParser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemaParser = null;


        try {
            // InternalVizualizer.g:636:53: (iv_ruleSchemaParser= ruleSchemaParser EOF )
            // InternalVizualizer.g:637:2: iv_ruleSchemaParser= ruleSchemaParser EOF
            {
             newCompositeNode(grammarAccess.getSchemaParserRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchemaParser=ruleSchemaParser();

            state._fsp--;

             current =iv_ruleSchemaParser; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchemaParser"


    // $ANTLR start "ruleSchemaParser"
    // InternalVizualizer.g:643:1: ruleSchemaParser returns [EObject current=null] : (otherlv_0= 'Schema' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'SchemaType = ' ( (lv_schemaType_4_0= ruleSchemaType ) ) ( (lv_selectors_5_0= ruleSelector ) )+ otherlv_6= '}' ) ;
    public final EObject ruleSchemaParser() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Enumerator lv_schemaType_4_0 = null;

        EObject lv_selectors_5_0 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:649:2: ( (otherlv_0= 'Schema' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'SchemaType = ' ( (lv_schemaType_4_0= ruleSchemaType ) ) ( (lv_selectors_5_0= ruleSelector ) )+ otherlv_6= '}' ) )
            // InternalVizualizer.g:650:2: (otherlv_0= 'Schema' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'SchemaType = ' ( (lv_schemaType_4_0= ruleSchemaType ) ) ( (lv_selectors_5_0= ruleSelector ) )+ otherlv_6= '}' )
            {
            // InternalVizualizer.g:650:2: (otherlv_0= 'Schema' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'SchemaType = ' ( (lv_schemaType_4_0= ruleSchemaType ) ) ( (lv_selectors_5_0= ruleSelector ) )+ otherlv_6= '}' )
            // InternalVizualizer.g:651:3: otherlv_0= 'Schema' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'SchemaType = ' ( (lv_schemaType_4_0= ruleSchemaType ) ) ( (lv_selectors_5_0= ruleSelector ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSchemaParserAccess().getSchemaKeyword_0());
            		
            // InternalVizualizer.g:655:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVizualizer.g:656:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVizualizer.g:656:4: (lv_name_1_0= RULE_ID )
            // InternalVizualizer.g:657:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSchemaParserAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSchemaParserRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getSchemaParserAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getSchemaParserAccess().getSchemaTypeKeyword_3());
            		
            // InternalVizualizer.g:681:3: ( (lv_schemaType_4_0= ruleSchemaType ) )
            // InternalVizualizer.g:682:4: (lv_schemaType_4_0= ruleSchemaType )
            {
            // InternalVizualizer.g:682:4: (lv_schemaType_4_0= ruleSchemaType )
            // InternalVizualizer.g:683:5: lv_schemaType_4_0= ruleSchemaType
            {

            					newCompositeNode(grammarAccess.getSchemaParserAccess().getSchemaTypeSchemaTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
            lv_schemaType_4_0=ruleSchemaType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSchemaParserRule());
            					}
            					set(
            						current,
            						"schemaType",
            						lv_schemaType_4_0,
            						"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.SchemaType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVizualizer.g:700:3: ( (lv_selectors_5_0= ruleSelector ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalVizualizer.g:701:4: (lv_selectors_5_0= ruleSelector )
            	    {
            	    // InternalVizualizer.g:701:4: (lv_selectors_5_0= ruleSelector )
            	    // InternalVizualizer.g:702:5: lv_selectors_5_0= ruleSelector
            	    {

            	    					newCompositeNode(grammarAccess.getSchemaParserAccess().getSelectorsSelectorParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_selectors_5_0=ruleSelector();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSchemaParserRule());
            	    					}
            	    					add(
            	    						current,
            	    						"selectors",
            	    						lv_selectors_5_0,
            	    						"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.Selector");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSchemaParserAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchemaParser"


    // $ANTLR start "entryRuleSelector"
    // InternalVizualizer.g:727:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalVizualizer.g:727:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalVizualizer.g:728:2: iv_ruleSelector= ruleSelector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelector=ruleSelector();

            state._fsp--;

             current =iv_ruleSelector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalVizualizer.g:734:1: ruleSelector returns [EObject current=null] : (otherlv_0= 'Selector as ' ( (lv_varname_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_steps_3_0= RULE_STRING ) ) (otherlv_4= ' -> ' ( (lv_steps_5_0= RULE_STRING ) ) )+ otherlv_6= '}' ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varname_1_0=null;
        Token otherlv_2=null;
        Token lv_steps_3_0=null;
        Token otherlv_4=null;
        Token lv_steps_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalVizualizer.g:740:2: ( (otherlv_0= 'Selector as ' ( (lv_varname_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_steps_3_0= RULE_STRING ) ) (otherlv_4= ' -> ' ( (lv_steps_5_0= RULE_STRING ) ) )+ otherlv_6= '}' ) )
            // InternalVizualizer.g:741:2: (otherlv_0= 'Selector as ' ( (lv_varname_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_steps_3_0= RULE_STRING ) ) (otherlv_4= ' -> ' ( (lv_steps_5_0= RULE_STRING ) ) )+ otherlv_6= '}' )
            {
            // InternalVizualizer.g:741:2: (otherlv_0= 'Selector as ' ( (lv_varname_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_steps_3_0= RULE_STRING ) ) (otherlv_4= ' -> ' ( (lv_steps_5_0= RULE_STRING ) ) )+ otherlv_6= '}' )
            // InternalVizualizer.g:742:3: otherlv_0= 'Selector as ' ( (lv_varname_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_steps_3_0= RULE_STRING ) ) (otherlv_4= ' -> ' ( (lv_steps_5_0= RULE_STRING ) ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectorAccess().getSelectorAsKeyword_0());
            		
            // InternalVizualizer.g:746:3: ( (lv_varname_1_0= RULE_ID ) )
            // InternalVizualizer.g:747:4: (lv_varname_1_0= RULE_ID )
            {
            // InternalVizualizer.g:747:4: (lv_varname_1_0= RULE_ID )
            // InternalVizualizer.g:748:5: lv_varname_1_0= RULE_ID
            {
            lv_varname_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_varname_1_0, grammarAccess.getSelectorAccess().getVarnameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varname",
            						lv_varname_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalVizualizer.g:768:3: ( (lv_steps_3_0= RULE_STRING ) )
            // InternalVizualizer.g:769:4: (lv_steps_3_0= RULE_STRING )
            {
            // InternalVizualizer.g:769:4: (lv_steps_3_0= RULE_STRING )
            // InternalVizualizer.g:770:5: lv_steps_3_0= RULE_STRING
            {
            lv_steps_3_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_steps_3_0, grammarAccess.getSelectorAccess().getStepsSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectorRule());
            					}
            					addWithLastConsumed(
            						current,
            						"steps",
            						lv_steps_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalVizualizer.g:786:3: (otherlv_4= ' -> ' ( (lv_steps_5_0= RULE_STRING ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalVizualizer.g:787:4: otherlv_4= ' -> ' ( (lv_steps_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,28,FOLLOW_14); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSelectorAccess().getSpaceHyphenMinusGreaterThanSignSpaceKeyword_4_0());
            	    			
            	    // InternalVizualizer.g:791:4: ( (lv_steps_5_0= RULE_STRING ) )
            	    // InternalVizualizer.g:792:5: (lv_steps_5_0= RULE_STRING )
            	    {
            	    // InternalVizualizer.g:792:5: (lv_steps_5_0= RULE_STRING )
            	    // InternalVizualizer.g:793:6: lv_steps_5_0= RULE_STRING
            	    {
            	    lv_steps_5_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            	    						newLeafNode(lv_steps_5_0, grammarAccess.getSelectorAccess().getStepsSTRINGTerminalRuleCall_4_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSelectorRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"steps",
            	    							lv_steps_5_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSelectorAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleFormula"
    // InternalVizualizer.g:818:1: entryRuleFormula returns [EObject current=null] : iv_ruleFormula= ruleFormula EOF ;
    public final EObject entryRuleFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormula = null;


        try {
            // InternalVizualizer.g:818:48: (iv_ruleFormula= ruleFormula EOF )
            // InternalVizualizer.g:819:2: iv_ruleFormula= ruleFormula EOF
            {
             newCompositeNode(grammarAccess.getFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormula=ruleFormula();

            state._fsp--;

             current =iv_ruleFormula; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormula"


    // $ANTLR start "ruleFormula"
    // InternalVizualizer.g:825:1: ruleFormula returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= '=' ( (lv_exp_7_0= ruleExpression ) ) ) ;
    public final EObject ruleFormula() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_vars_2_0 = null;

        EObject lv_vars_4_0 = null;

        EObject lv_exp_7_0 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:831:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= '=' ( (lv_exp_7_0= ruleExpression ) ) ) )
            // InternalVizualizer.g:832:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= '=' ( (lv_exp_7_0= ruleExpression ) ) )
            {
            // InternalVizualizer.g:832:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= '=' ( (lv_exp_7_0= ruleExpression ) ) )
            // InternalVizualizer.g:833:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= '=' ( (lv_exp_7_0= ruleExpression ) )
            {
            // InternalVizualizer.g:833:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalVizualizer.g:834:4: (lv_name_0_0= RULE_ID )
            {
            // InternalVizualizer.g:834:4: (lv_name_0_0= RULE_ID )
            // InternalVizualizer.g:835:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFormulaAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormulaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getFormulaAccess().getLeftParenthesisKeyword_1());
            		
            // InternalVizualizer.g:855:3: ( ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalVizualizer.g:856:4: ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )*
                    {
                    // InternalVizualizer.g:856:4: ( (lv_vars_2_0= ruleVariable ) )
                    // InternalVizualizer.g:857:5: (lv_vars_2_0= ruleVariable )
                    {
                    // InternalVizualizer.g:857:5: (lv_vars_2_0= ruleVariable )
                    // InternalVizualizer.g:858:6: lv_vars_2_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getFormulaAccess().getVarsVariableParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_vars_2_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormulaRule());
                    						}
                    						add(
                    							current,
                    							"vars",
                    							lv_vars_2_0,
                    							"org.xtext.sdu.formularzlanguage.Formular.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVizualizer.g:875:4: (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==30) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalVizualizer.g:876:5: otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) )
                    	    {
                    	    otherlv_3=(Token)match(input,30,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFormulaAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalVizualizer.g:880:5: ( (lv_vars_4_0= ruleVariable ) )
                    	    // InternalVizualizer.g:881:6: (lv_vars_4_0= ruleVariable )
                    	    {
                    	    // InternalVizualizer.g:881:6: (lv_vars_4_0= ruleVariable )
                    	    // InternalVizualizer.g:882:7: lv_vars_4_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getFormulaAccess().getVarsVariableParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_vars_4_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFormulaRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"vars",
                    	    								lv_vars_4_0,
                    	    								"org.xtext.sdu.formularzlanguage.Formular.Variable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getFormulaAccess().getRightParenthesisKeyword_3());
            		
            otherlv_6=(Token)match(input,32,FOLLOW_27); 

            			newLeafNode(otherlv_6, grammarAccess.getFormulaAccess().getEqualsSignKeyword_4());
            		
            // InternalVizualizer.g:909:3: ( (lv_exp_7_0= ruleExpression ) )
            // InternalVizualizer.g:910:4: (lv_exp_7_0= ruleExpression )
            {
            // InternalVizualizer.g:910:4: (lv_exp_7_0= ruleExpression )
            // InternalVizualizer.g:911:5: lv_exp_7_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getFormulaAccess().getExpExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_7_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormulaRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_7_0,
            						"org.xtext.sdu.formularzlanguage.Formular.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormula"


    // $ANTLR start "entryRuleExpression"
    // InternalVizualizer.g:932:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalVizualizer.g:932:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalVizualizer.g:933:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalVizualizer.g:939:1: ruleExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleFactor ) ) ( ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:945:2: ( ( ( (lv_left_0_0= ruleFactor ) ) ( ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) ) )? ) )
            // InternalVizualizer.g:946:2: ( ( (lv_left_0_0= ruleFactor ) ) ( ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) ) )? )
            {
            // InternalVizualizer.g:946:2: ( ( (lv_left_0_0= ruleFactor ) ) ( ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) ) )? )
            // InternalVizualizer.g:947:3: ( (lv_left_0_0= ruleFactor ) ) ( ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) ) )?
            {
            // InternalVizualizer.g:947:3: ( (lv_left_0_0= ruleFactor ) )
            // InternalVizualizer.g:948:4: (lv_left_0_0= ruleFactor )
            {
            // InternalVizualizer.g:948:4: (lv_left_0_0= ruleFactor )
            // InternalVizualizer.g:949:5: lv_left_0_0= ruleFactor
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getLeftFactorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
            lv_left_0_0=ruleFactor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.xtext.sdu.formularzlanguage.Formular.Factor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVizualizer.g:966:3: ( ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=33 && LA10_0<=34)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalVizualizer.g:967:4: ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) )
                    {
                    // InternalVizualizer.g:967:4: ( (lv_op_1_0= ruleOp1 ) )
                    // InternalVizualizer.g:968:5: (lv_op_1_0= ruleOp1 )
                    {
                    // InternalVizualizer.g:968:5: (lv_op_1_0= ruleOp1 )
                    // InternalVizualizer.g:969:6: lv_op_1_0= ruleOp1
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getOpOp1ParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_op_1_0=ruleOp1();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_1_0,
                    							"org.xtext.sdu.formularzlanguage.Formular.Op1");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVizualizer.g:986:4: ( (lv_right_2_0= ruleExpression ) )
                    // InternalVizualizer.g:987:5: (lv_right_2_0= ruleExpression )
                    {
                    // InternalVizualizer.g:987:5: (lv_right_2_0= ruleExpression )
                    // InternalVizualizer.g:988:6: lv_right_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_2_0,
                    							"org.xtext.sdu.formularzlanguage.Formular.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOp1"
    // InternalVizualizer.g:1010:1: entryRuleOp1 returns [String current=null] : iv_ruleOp1= ruleOp1 EOF ;
    public final String entryRuleOp1() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOp1 = null;


        try {
            // InternalVizualizer.g:1010:43: (iv_ruleOp1= ruleOp1 EOF )
            // InternalVizualizer.g:1011:2: iv_ruleOp1= ruleOp1 EOF
            {
             newCompositeNode(grammarAccess.getOp1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOp1=ruleOp1();

            state._fsp--;

             current =iv_ruleOp1.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOp1"


    // $ANTLR start "ruleOp1"
    // InternalVizualizer.g:1017:1: ruleOp1 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOp1() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVizualizer.g:1023:2: ( (kw= '+' | kw= '-' ) )
            // InternalVizualizer.g:1024:2: (kw= '+' | kw= '-' )
            {
            // InternalVizualizer.g:1024:2: (kw= '+' | kw= '-' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            else if ( (LA11_0==34) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalVizualizer.g:1025:3: kw= '+'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOp1Access().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:1031:3: kw= '-'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOp1Access().getHyphenMinusKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOp1"


    // $ANTLR start "entryRuleFactor"
    // InternalVizualizer.g:1040:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalVizualizer.g:1040:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalVizualizer.g:1041:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalVizualizer.g:1047:1: ruleFactor returns [EObject current=null] : ( ( (lv_left_0_0= rulePrimitive ) ) ( ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) ) )? ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:1053:2: ( ( ( (lv_left_0_0= rulePrimitive ) ) ( ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) ) )? ) )
            // InternalVizualizer.g:1054:2: ( ( (lv_left_0_0= rulePrimitive ) ) ( ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) ) )? )
            {
            // InternalVizualizer.g:1054:2: ( ( (lv_left_0_0= rulePrimitive ) ) ( ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) ) )? )
            // InternalVizualizer.g:1055:3: ( (lv_left_0_0= rulePrimitive ) ) ( ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) ) )?
            {
            // InternalVizualizer.g:1055:3: ( (lv_left_0_0= rulePrimitive ) )
            // InternalVizualizer.g:1056:4: (lv_left_0_0= rulePrimitive )
            {
            // InternalVizualizer.g:1056:4: (lv_left_0_0= rulePrimitive )
            // InternalVizualizer.g:1057:5: lv_left_0_0= rulePrimitive
            {

            					newCompositeNode(grammarAccess.getFactorAccess().getLeftPrimitiveParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_29);
            lv_left_0_0=rulePrimitive();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFactorRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.xtext.sdu.formularzlanguage.Formular.Primitive");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVizualizer.g:1074:3: ( ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=35 && LA12_0<=36)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalVizualizer.g:1075:4: ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) )
                    {
                    // InternalVizualizer.g:1075:4: ( (lv_op_1_0= ruleOp2 ) )
                    // InternalVizualizer.g:1076:5: (lv_op_1_0= ruleOp2 )
                    {
                    // InternalVizualizer.g:1076:5: (lv_op_1_0= ruleOp2 )
                    // InternalVizualizer.g:1077:6: lv_op_1_0= ruleOp2
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getOpOp2ParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_op_1_0=ruleOp2();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactorRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_1_0,
                    							"org.xtext.sdu.formularzlanguage.Formular.Op2");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVizualizer.g:1094:4: ( (lv_right_2_0= ruleFactor ) )
                    // InternalVizualizer.g:1095:5: (lv_right_2_0= ruleFactor )
                    {
                    // InternalVizualizer.g:1095:5: (lv_right_2_0= ruleFactor )
                    // InternalVizualizer.g:1096:6: lv_right_2_0= ruleFactor
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getRightFactorParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=ruleFactor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactorRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_2_0,
                    							"org.xtext.sdu.formularzlanguage.Formular.Factor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleOp2"
    // InternalVizualizer.g:1118:1: entryRuleOp2 returns [String current=null] : iv_ruleOp2= ruleOp2 EOF ;
    public final String entryRuleOp2() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOp2 = null;


        try {
            // InternalVizualizer.g:1118:43: (iv_ruleOp2= ruleOp2 EOF )
            // InternalVizualizer.g:1119:2: iv_ruleOp2= ruleOp2 EOF
            {
             newCompositeNode(grammarAccess.getOp2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOp2=ruleOp2();

            state._fsp--;

             current =iv_ruleOp2.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOp2"


    // $ANTLR start "ruleOp2"
    // InternalVizualizer.g:1125:1: ruleOp2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleOp2() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVizualizer.g:1131:2: ( (kw= '*' | kw= '/' ) )
            // InternalVizualizer.g:1132:2: (kw= '*' | kw= '/' )
            {
            // InternalVizualizer.g:1132:2: (kw= '*' | kw= '/' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            else if ( (LA13_0==36) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalVizualizer.g:1133:3: kw= '*'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOp2Access().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:1139:3: kw= '/'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOp2Access().getSolidusKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOp2"


    // $ANTLR start "entryRulePrimitive"
    // InternalVizualizer.g:1148:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalVizualizer.g:1148:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalVizualizer.g:1149:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // InternalVizualizer.g:1155:1: rulePrimitive returns [EObject current=null] : (this_Number_0= ruleNumber | this_Variable_1= ruleVariable | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Number_0 = null;

        EObject this_Variable_1 = null;

        EObject this_Expression_3 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:1161:2: ( (this_Number_0= ruleNumber | this_Variable_1= ruleVariable | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) ) )
            // InternalVizualizer.g:1162:2: (this_Number_0= ruleNumber | this_Variable_1= ruleVariable | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) )
            {
            // InternalVizualizer.g:1162:2: (this_Number_0= ruleNumber | this_Variable_1= ruleVariable | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt14=1;
                }
                break;
            case RULE_ID:
                {
                alt14=2;
                }
                break;
            case 29:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalVizualizer.g:1163:3: this_Number_0= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveAccess().getNumberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_0=ruleNumber();

                    state._fsp--;


                    			current = this_Number_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:1172:3: this_Variable_1= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveAccess().getVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_1=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalVizualizer.g:1181:3: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    {
                    // InternalVizualizer.g:1181:3: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    // InternalVizualizer.g:1182:4: otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimitiveAccess().getExpressionParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_30);
                    this_Expression_3=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_2_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleNumber"
    // InternalVizualizer.g:1203:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalVizualizer.g:1203:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalVizualizer.g:1204:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalVizualizer.g:1210:1: ruleNumber returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalVizualizer.g:1216:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalVizualizer.g:1217:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalVizualizer.g:1217:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalVizualizer.g:1218:3: (lv_val_0_0= RULE_INT )
            {
            // InternalVizualizer.g:1218:3: (lv_val_0_0= RULE_INT )
            // InternalVizualizer.g:1219:4: lv_val_0_0= RULE_INT
            {
            lv_val_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getNumberAccess().getValINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumberRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleVariable"
    // InternalVizualizer.g:1238:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalVizualizer.g:1238:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalVizualizer.g:1239:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalVizualizer.g:1245:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalVizualizer.g:1251:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalVizualizer.g:1252:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalVizualizer.g:1252:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalVizualizer.g:1253:3: (lv_name_0_0= RULE_ID )
            {
            // InternalVizualizer.g:1253:3: (lv_name_0_0= RULE_ID )
            // InternalVizualizer.g:1254:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "ruleSchemaType"
    // InternalVizualizer.g:1273:1: ruleSchemaType returns [Enumerator current=null] : ( (enumLiteral_0= 'XML' ) | (enumLiteral_1= 'CSV' ) | (enumLiteral_2= 'JSON' ) ) ;
    public final Enumerator ruleSchemaType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalVizualizer.g:1279:2: ( ( (enumLiteral_0= 'XML' ) | (enumLiteral_1= 'CSV' ) | (enumLiteral_2= 'JSON' ) ) )
            // InternalVizualizer.g:1280:2: ( (enumLiteral_0= 'XML' ) | (enumLiteral_1= 'CSV' ) | (enumLiteral_2= 'JSON' ) )
            {
            // InternalVizualizer.g:1280:2: ( (enumLiteral_0= 'XML' ) | (enumLiteral_1= 'CSV' ) | (enumLiteral_2= 'JSON' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt15=1;
                }
                break;
            case 38:
                {
                alt15=2;
                }
                break;
            case 39:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalVizualizer.g:1281:3: (enumLiteral_0= 'XML' )
                    {
                    // InternalVizualizer.g:1281:3: (enumLiteral_0= 'XML' )
                    // InternalVizualizer.g:1282:4: enumLiteral_0= 'XML'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getSchemaTypeAccess().getXMLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSchemaTypeAccess().getXMLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:1289:3: (enumLiteral_1= 'CSV' )
                    {
                    // InternalVizualizer.g:1289:3: (enumLiteral_1= 'CSV' )
                    // InternalVizualizer.g:1290:4: enumLiteral_1= 'CSV'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getSchemaTypeAccess().getCSVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSchemaTypeAccess().getCSVEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVizualizer.g:1297:3: (enumLiteral_2= 'JSON' )
                    {
                    // InternalVizualizer.g:1297:3: (enumLiteral_2= 'JSON' )
                    // InternalVizualizer.g:1298:4: enumLiteral_2= 'JSON'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getSchemaTypeAccess().getJSONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSchemaTypeAccess().getJSONEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchemaType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002420802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000050L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000000L});

}