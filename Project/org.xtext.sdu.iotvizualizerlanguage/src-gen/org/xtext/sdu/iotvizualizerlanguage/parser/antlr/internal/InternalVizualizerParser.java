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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Page'", "'{'", "'}'", "'Link'", "'to'", "'Graph'", "'Datasource'", "'Source'", "'Dimensions'", "':'", "','", "'Dimension'", "'as'", "'Formula'", "'PostPoint'", "'url'", "'use Schema'", "'GetPoint'", "'Headers'", "'Schema'", "'SchemaType = '", "'Selector as '", "' -> '", "'('", "')'", "'='", "'+'", "'-'", "'*'", "'/'", "'XML'", "'CSV'", "'JSON'"
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
                case 25:
                case 28:
                    {
                    alt1=2;
                    }
                    break;
                case 30:
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
    // InternalVizualizer.g:366:1: ruleDatasource returns [EObject current=null] : (otherlv_0= 'Datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Dimensions' otherlv_6= ':' ( (lv_dimensions_7_0= ruleDimension ) ) (otherlv_8= ',' ( (lv_dimensions_9_0= ruleDimension ) ) )* otherlv_10= '}' ) ;
    public final EObject ruleDatasource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_dimensions_7_0 = null;

        EObject lv_dimensions_9_0 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:372:2: ( (otherlv_0= 'Datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Dimensions' otherlv_6= ':' ( (lv_dimensions_7_0= ruleDimension ) ) (otherlv_8= ',' ( (lv_dimensions_9_0= ruleDimension ) ) )* otherlv_10= '}' ) )
            // InternalVizualizer.g:373:2: (otherlv_0= 'Datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Dimensions' otherlv_6= ':' ( (lv_dimensions_7_0= ruleDimension ) ) (otherlv_8= ',' ( (lv_dimensions_9_0= ruleDimension ) ) )* otherlv_10= '}' )
            {
            // InternalVizualizer.g:373:2: (otherlv_0= 'Datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Dimensions' otherlv_6= ':' ( (lv_dimensions_7_0= ruleDimension ) ) (otherlv_8= ',' ( (lv_dimensions_9_0= ruleDimension ) ) )* otherlv_10= '}' )
            // InternalVizualizer.g:374:3: otherlv_0= 'Datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'Dimensions' otherlv_6= ':' ( (lv_dimensions_7_0= ruleDimension ) ) (otherlv_8= ',' ( (lv_dimensions_9_0= ruleDimension ) ) )* otherlv_10= '}'
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

            otherlv_5=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getDatasourceAccess().getDimensionsKeyword_5());
            		
            otherlv_6=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getDatasourceAccess().getColonKeyword_6());
            		
            // InternalVizualizer.g:425:3: ( (lv_dimensions_7_0= ruleDimension ) )
            // InternalVizualizer.g:426:4: (lv_dimensions_7_0= ruleDimension )
            {
            // InternalVizualizer.g:426:4: (lv_dimensions_7_0= ruleDimension )
            // InternalVizualizer.g:427:5: lv_dimensions_7_0= ruleDimension
            {

            					newCompositeNode(grammarAccess.getDatasourceAccess().getDimensionsDimensionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_12);
            lv_dimensions_7_0=ruleDimension();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatasourceRule());
            					}
            					add(
            						current,
            						"dimensions",
            						lv_dimensions_7_0,
            						"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.Dimension");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVizualizer.g:444:3: (otherlv_8= ',' ( (lv_dimensions_9_0= ruleDimension ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalVizualizer.g:445:4: otherlv_8= ',' ( (lv_dimensions_9_0= ruleDimension ) )
            	    {
            	    otherlv_8=(Token)match(input,21,FOLLOW_11); 

            	    				newLeafNode(otherlv_8, grammarAccess.getDatasourceAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalVizualizer.g:449:4: ( (lv_dimensions_9_0= ruleDimension ) )
            	    // InternalVizualizer.g:450:5: (lv_dimensions_9_0= ruleDimension )
            	    {
            	    // InternalVizualizer.g:450:5: (lv_dimensions_9_0= ruleDimension )
            	    // InternalVizualizer.g:451:6: lv_dimensions_9_0= ruleDimension
            	    {

            	    						newCompositeNode(grammarAccess.getDatasourceAccess().getDimensionsDimensionParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_dimensions_9_0=ruleDimension();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDatasourceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dimensions",
            	    							lv_dimensions_9_0,
            	    							"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.Dimension");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDatasourceAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleDimension"
    // InternalVizualizer.g:477:1: entryRuleDimension returns [EObject current=null] : iv_ruleDimension= ruleDimension EOF ;
    public final EObject entryRuleDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimension = null;


        try {
            // InternalVizualizer.g:477:50: (iv_ruleDimension= ruleDimension EOF )
            // InternalVizualizer.g:478:2: iv_ruleDimension= ruleDimension EOF
            {
             newCompositeNode(grammarAccess.getDimensionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDimension=ruleDimension();

            state._fsp--;

             current =iv_ruleDimension; 
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
    // $ANTLR end "entryRuleDimension"


    // $ANTLR start "ruleDimension"
    // InternalVizualizer.g:484:1: ruleDimension returns [EObject current=null] : (otherlv_0= 'Dimension' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' otherlv_3= 'Formula' ( (lv_formula_4_0= ruleFormula ) ) ) ;
    public final EObject ruleDimension() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_formula_4_0 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:490:2: ( (otherlv_0= 'Dimension' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' otherlv_3= 'Formula' ( (lv_formula_4_0= ruleFormula ) ) ) )
            // InternalVizualizer.g:491:2: (otherlv_0= 'Dimension' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' otherlv_3= 'Formula' ( (lv_formula_4_0= ruleFormula ) ) )
            {
            // InternalVizualizer.g:491:2: (otherlv_0= 'Dimension' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' otherlv_3= 'Formula' ( (lv_formula_4_0= ruleFormula ) ) )
            // InternalVizualizer.g:492:3: otherlv_0= 'Dimension' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' otherlv_3= 'Formula' ( (lv_formula_4_0= ruleFormula ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDimensionAccess().getDimensionKeyword_0());
            		
            // InternalVizualizer.g:496:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVizualizer.g:497:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVizualizer.g:497:4: (lv_name_1_0= RULE_ID )
            // InternalVizualizer.g:498:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDimensionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDimensionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getDimensionAccess().getAsKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getDimensionAccess().getFormulaKeyword_3());
            		
            // InternalVizualizer.g:522:3: ( (lv_formula_4_0= ruleFormula ) )
            // InternalVizualizer.g:523:4: (lv_formula_4_0= ruleFormula )
            {
            // InternalVizualizer.g:523:4: (lv_formula_4_0= ruleFormula )
            // InternalVizualizer.g:524:5: lv_formula_4_0= ruleFormula
            {

            					newCompositeNode(grammarAccess.getDimensionAccess().getFormulaFormulaParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_formula_4_0=ruleFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDimensionRule());
            					}
            					set(
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
    // $ANTLR end "ruleDimension"


    // $ANTLR start "entryRuleSource"
    // InternalVizualizer.g:545:1: entryRuleSource returns [EObject current=null] : iv_ruleSource= ruleSource EOF ;
    public final EObject entryRuleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource = null;


        try {
            // InternalVizualizer.g:545:47: (iv_ruleSource= ruleSource EOF )
            // InternalVizualizer.g:546:2: iv_ruleSource= ruleSource EOF
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
    // InternalVizualizer.g:552:1: ruleSource returns [EObject current=null] : (this_EndPoint_0= ruleEndPoint | this_Datasource_1= ruleDatasource ) ;
    public final EObject ruleSource() throws RecognitionException {
        EObject current = null;

        EObject this_EndPoint_0 = null;

        EObject this_Datasource_1 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:558:2: ( (this_EndPoint_0= ruleEndPoint | this_Datasource_1= ruleDatasource ) )
            // InternalVizualizer.g:559:2: (this_EndPoint_0= ruleEndPoint | this_Datasource_1= ruleDatasource )
            {
            // InternalVizualizer.g:559:2: (this_EndPoint_0= ruleEndPoint | this_Datasource_1= ruleDatasource )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25||LA5_0==28) ) {
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
                    // InternalVizualizer.g:560:3: this_EndPoint_0= ruleEndPoint
                    {

                    			newCompositeNode(grammarAccess.getSourceAccess().getEndPointParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EndPoint_0=ruleEndPoint();

                    state._fsp--;


                    			current = this_EndPoint_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:569:3: this_Datasource_1= ruleDatasource
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


    // $ANTLR start "entryRuleEndPoint"
    // InternalVizualizer.g:581:1: entryRuleEndPoint returns [EObject current=null] : iv_ruleEndPoint= ruleEndPoint EOF ;
    public final EObject entryRuleEndPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndPoint = null;


        try {
            // InternalVizualizer.g:581:49: (iv_ruleEndPoint= ruleEndPoint EOF )
            // InternalVizualizer.g:582:2: iv_ruleEndPoint= ruleEndPoint EOF
            {
             newCompositeNode(grammarAccess.getEndPointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndPoint=ruleEndPoint();

            state._fsp--;

             current =iv_ruleEndPoint; 
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
    // $ANTLR end "entryRuleEndPoint"


    // $ANTLR start "ruleEndPoint"
    // InternalVizualizer.g:588:1: ruleEndPoint returns [EObject current=null] : (this_GetEndPoint_0= ruleGetEndPoint | this_PostEndPoint_1= rulePostEndPoint ) ;
    public final EObject ruleEndPoint() throws RecognitionException {
        EObject current = null;

        EObject this_GetEndPoint_0 = null;

        EObject this_PostEndPoint_1 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:594:2: ( (this_GetEndPoint_0= ruleGetEndPoint | this_PostEndPoint_1= rulePostEndPoint ) )
            // InternalVizualizer.g:595:2: (this_GetEndPoint_0= ruleGetEndPoint | this_PostEndPoint_1= rulePostEndPoint )
            {
            // InternalVizualizer.g:595:2: (this_GetEndPoint_0= ruleGetEndPoint | this_PostEndPoint_1= rulePostEndPoint )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28) ) {
                alt6=1;
            }
            else if ( (LA6_0==25) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalVizualizer.g:596:3: this_GetEndPoint_0= ruleGetEndPoint
                    {

                    			newCompositeNode(grammarAccess.getEndPointAccess().getGetEndPointParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GetEndPoint_0=ruleGetEndPoint();

                    state._fsp--;


                    			current = this_GetEndPoint_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:605:3: this_PostEndPoint_1= rulePostEndPoint
                    {

                    			newCompositeNode(grammarAccess.getEndPointAccess().getPostEndPointParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PostEndPoint_1=rulePostEndPoint();

                    state._fsp--;


                    			current = this_PostEndPoint_1;
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
    // $ANTLR end "ruleEndPoint"


    // $ANTLR start "entryRulePostEndPoint"
    // InternalVizualizer.g:617:1: entryRulePostEndPoint returns [EObject current=null] : iv_rulePostEndPoint= rulePostEndPoint EOF ;
    public final EObject entryRulePostEndPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostEndPoint = null;


        try {
            // InternalVizualizer.g:617:53: (iv_rulePostEndPoint= rulePostEndPoint EOF )
            // InternalVizualizer.g:618:2: iv_rulePostEndPoint= rulePostEndPoint EOF
            {
             newCompositeNode(grammarAccess.getPostEndPointRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePostEndPoint=rulePostEndPoint();

            state._fsp--;

             current =iv_rulePostEndPoint; 
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
    // $ANTLR end "entryRulePostEndPoint"


    // $ANTLR start "rulePostEndPoint"
    // InternalVizualizer.g:624:1: rulePostEndPoint returns [EObject current=null] : (otherlv_0= 'PostPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= 'use Schema' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' ) ;
    public final EObject rulePostEndPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_url_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalVizualizer.g:630:2: ( (otherlv_0= 'PostPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= 'use Schema' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' ) )
            // InternalVizualizer.g:631:2: (otherlv_0= 'PostPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= 'use Schema' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' )
            {
            // InternalVizualizer.g:631:2: (otherlv_0= 'PostPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= 'use Schema' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' )
            // InternalVizualizer.g:632:3: otherlv_0= 'PostPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= 'use Schema' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPostEndPointAccess().getPostPointKeyword_0());
            		
            // InternalVizualizer.g:636:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVizualizer.g:637:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVizualizer.g:637:4: (lv_name_1_0= RULE_ID )
            // InternalVizualizer.g:638:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPostEndPointAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPostEndPointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getPostEndPointAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getPostEndPointAccess().getUrlKeyword_3());
            		
            // InternalVizualizer.g:662:3: ( (lv_url_4_0= RULE_STRING ) )
            // InternalVizualizer.g:663:4: (lv_url_4_0= RULE_STRING )
            {
            // InternalVizualizer.g:663:4: (lv_url_4_0= RULE_STRING )
            // InternalVizualizer.g:664:5: lv_url_4_0= RULE_STRING
            {
            lv_url_4_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_url_4_0, grammarAccess.getPostEndPointAccess().getUrlSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPostEndPointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getPostEndPointAccess().getUseSchemaKeyword_5());
            		
            // InternalVizualizer.g:684:3: ( (otherlv_6= RULE_ID ) )
            // InternalVizualizer.g:685:4: (otherlv_6= RULE_ID )
            {
            // InternalVizualizer.g:685:4: (otherlv_6= RULE_ID )
            // InternalVizualizer.g:686:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPostEndPointRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_6, grammarAccess.getPostEndPointAccess().getParserSchemaParserCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPostEndPointAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "rulePostEndPoint"


    // $ANTLR start "entryRuleGetEndPoint"
    // InternalVizualizer.g:705:1: entryRuleGetEndPoint returns [EObject current=null] : iv_ruleGetEndPoint= ruleGetEndPoint EOF ;
    public final EObject entryRuleGetEndPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetEndPoint = null;


        try {
            // InternalVizualizer.g:705:52: (iv_ruleGetEndPoint= ruleGetEndPoint EOF )
            // InternalVizualizer.g:706:2: iv_ruleGetEndPoint= ruleGetEndPoint EOF
            {
             newCompositeNode(grammarAccess.getGetEndPointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetEndPoint=ruleGetEndPoint();

            state._fsp--;

             current =iv_ruleGetEndPoint; 
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
    // $ANTLR end "entryRuleGetEndPoint"


    // $ANTLR start "ruleGetEndPoint"
    // InternalVizualizer.g:712:1: ruleGetEndPoint returns [EObject current=null] : (otherlv_0= 'GetPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= 'Headers' otherlv_6= '{' ( (lv_headers_7_0= ruleHeader ) ) (otherlv_8= ',' ( (lv_headers_9_0= ruleHeader ) ) )* otherlv_10= '}' otherlv_11= 'use Schema' ( (otherlv_12= RULE_ID ) ) otherlv_13= '}' ) ;
    public final EObject ruleGetEndPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_url_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_headers_7_0 = null;

        EObject lv_headers_9_0 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:718:2: ( (otherlv_0= 'GetPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= 'Headers' otherlv_6= '{' ( (lv_headers_7_0= ruleHeader ) ) (otherlv_8= ',' ( (lv_headers_9_0= ruleHeader ) ) )* otherlv_10= '}' otherlv_11= 'use Schema' ( (otherlv_12= RULE_ID ) ) otherlv_13= '}' ) )
            // InternalVizualizer.g:719:2: (otherlv_0= 'GetPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= 'Headers' otherlv_6= '{' ( (lv_headers_7_0= ruleHeader ) ) (otherlv_8= ',' ( (lv_headers_9_0= ruleHeader ) ) )* otherlv_10= '}' otherlv_11= 'use Schema' ( (otherlv_12= RULE_ID ) ) otherlv_13= '}' )
            {
            // InternalVizualizer.g:719:2: (otherlv_0= 'GetPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= 'Headers' otherlv_6= '{' ( (lv_headers_7_0= ruleHeader ) ) (otherlv_8= ',' ( (lv_headers_9_0= ruleHeader ) ) )* otherlv_10= '}' otherlv_11= 'use Schema' ( (otherlv_12= RULE_ID ) ) otherlv_13= '}' )
            // InternalVizualizer.g:720:3: otherlv_0= 'GetPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= 'Headers' otherlv_6= '{' ( (lv_headers_7_0= ruleHeader ) ) (otherlv_8= ',' ( (lv_headers_9_0= ruleHeader ) ) )* otherlv_10= '}' otherlv_11= 'use Schema' ( (otherlv_12= RULE_ID ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGetEndPointAccess().getGetPointKeyword_0());
            		
            // InternalVizualizer.g:724:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVizualizer.g:725:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVizualizer.g:725:4: (lv_name_1_0= RULE_ID )
            // InternalVizualizer.g:726:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGetEndPointAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGetEndPointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getGetEndPointAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getGetEndPointAccess().getUrlKeyword_3());
            		
            // InternalVizualizer.g:750:3: ( (lv_url_4_0= RULE_STRING ) )
            // InternalVizualizer.g:751:4: (lv_url_4_0= RULE_STRING )
            {
            // InternalVizualizer.g:751:4: (lv_url_4_0= RULE_STRING )
            // InternalVizualizer.g:752:5: lv_url_4_0= RULE_STRING
            {
            lv_url_4_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_url_4_0, grammarAccess.getGetEndPointAccess().getUrlSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGetEndPointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getGetEndPointAccess().getHeadersKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getGetEndPointAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalVizualizer.g:776:3: ( (lv_headers_7_0= ruleHeader ) )
            // InternalVizualizer.g:777:4: (lv_headers_7_0= ruleHeader )
            {
            // InternalVizualizer.g:777:4: (lv_headers_7_0= ruleHeader )
            // InternalVizualizer.g:778:5: lv_headers_7_0= ruleHeader
            {

            					newCompositeNode(grammarAccess.getGetEndPointAccess().getHeadersHeaderParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_12);
            lv_headers_7_0=ruleHeader();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGetEndPointRule());
            					}
            					add(
            						current,
            						"headers",
            						lv_headers_7_0,
            						"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.Header");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVizualizer.g:795:3: (otherlv_8= ',' ( (lv_headers_9_0= ruleHeader ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalVizualizer.g:796:4: otherlv_8= ',' ( (lv_headers_9_0= ruleHeader ) )
            	    {
            	    otherlv_8=(Token)match(input,21,FOLLOW_16); 

            	    				newLeafNode(otherlv_8, grammarAccess.getGetEndPointAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalVizualizer.g:800:4: ( (lv_headers_9_0= ruleHeader ) )
            	    // InternalVizualizer.g:801:5: (lv_headers_9_0= ruleHeader )
            	    {
            	    // InternalVizualizer.g:801:5: (lv_headers_9_0= ruleHeader )
            	    // InternalVizualizer.g:802:6: lv_headers_9_0= ruleHeader
            	    {

            	    						newCompositeNode(grammarAccess.getGetEndPointAccess().getHeadersHeaderParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_headers_9_0=ruleHeader();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGetEndPointRule());
            	    						}
            	    						add(
            	    							current,
            	    							"headers",
            	    							lv_headers_9_0,
            	    							"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.Header");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_10, grammarAccess.getGetEndPointAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_11=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getGetEndPointAccess().getUseSchemaKeyword_10());
            		
            // InternalVizualizer.g:828:3: ( (otherlv_12= RULE_ID ) )
            // InternalVizualizer.g:829:4: (otherlv_12= RULE_ID )
            {
            // InternalVizualizer.g:829:4: (otherlv_12= RULE_ID )
            // InternalVizualizer.g:830:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGetEndPointRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_12, grammarAccess.getGetEndPointAccess().getParserSchemaParserCrossReference_11_0());
            				

            }


            }

            otherlv_13=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getGetEndPointAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleGetEndPoint"


    // $ANTLR start "entryRuleHeader"
    // InternalVizualizer.g:849:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalVizualizer.g:849:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalVizualizer.g:850:2: iv_ruleHeader= ruleHeader EOF
            {
             newCompositeNode(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeader=ruleHeader();

            state._fsp--;

             current =iv_ruleHeader; 
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
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalVizualizer.g:856:1: ruleHeader returns [EObject current=null] : ( ( (lv_keyword_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalVizualizer.g:862:2: ( ( ( (lv_keyword_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalVizualizer.g:863:2: ( ( (lv_keyword_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalVizualizer.g:863:2: ( ( (lv_keyword_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalVizualizer.g:864:3: ( (lv_keyword_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalVizualizer.g:864:3: ( (lv_keyword_0_0= RULE_STRING ) )
            // InternalVizualizer.g:865:4: (lv_keyword_0_0= RULE_STRING )
            {
            // InternalVizualizer.g:865:4: (lv_keyword_0_0= RULE_STRING )
            // InternalVizualizer.g:866:5: lv_keyword_0_0= RULE_STRING
            {
            lv_keyword_0_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_keyword_0_0, grammarAccess.getHeaderAccess().getKeywordSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHeaderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"keyword",
            						lv_keyword_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getHeaderAccess().getColonKeyword_1());
            		
            // InternalVizualizer.g:886:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalVizualizer.g:887:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalVizualizer.g:887:4: (lv_value_2_0= RULE_STRING )
            // InternalVizualizer.g:888:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getHeaderAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHeaderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleSchemaParser"
    // InternalVizualizer.g:908:1: entryRuleSchemaParser returns [EObject current=null] : iv_ruleSchemaParser= ruleSchemaParser EOF ;
    public final EObject entryRuleSchemaParser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemaParser = null;


        try {
            // InternalVizualizer.g:908:53: (iv_ruleSchemaParser= ruleSchemaParser EOF )
            // InternalVizualizer.g:909:2: iv_ruleSchemaParser= ruleSchemaParser EOF
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
    // InternalVizualizer.g:915:1: ruleSchemaParser returns [EObject current=null] : (otherlv_0= 'Schema' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'SchemaType = ' ( (lv_schemaType_4_0= ruleSchemaType ) ) ( (lv_selectors_5_0= ruleSelector ) )+ otherlv_6= '}' ) ;
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
            // InternalVizualizer.g:921:2: ( (otherlv_0= 'Schema' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'SchemaType = ' ( (lv_schemaType_4_0= ruleSchemaType ) ) ( (lv_selectors_5_0= ruleSelector ) )+ otherlv_6= '}' ) )
            // InternalVizualizer.g:922:2: (otherlv_0= 'Schema' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'SchemaType = ' ( (lv_schemaType_4_0= ruleSchemaType ) ) ( (lv_selectors_5_0= ruleSelector ) )+ otherlv_6= '}' )
            {
            // InternalVizualizer.g:922:2: (otherlv_0= 'Schema' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'SchemaType = ' ( (lv_schemaType_4_0= ruleSchemaType ) ) ( (lv_selectors_5_0= ruleSelector ) )+ otherlv_6= '}' )
            // InternalVizualizer.g:923:3: otherlv_0= 'Schema' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'SchemaType = ' ( (lv_schemaType_4_0= ruleSchemaType ) ) ( (lv_selectors_5_0= ruleSelector ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSchemaParserAccess().getSchemaKeyword_0());
            		
            // InternalVizualizer.g:927:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVizualizer.g:928:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVizualizer.g:928:4: (lv_name_1_0= RULE_ID )
            // InternalVizualizer.g:929:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getSchemaParserAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getSchemaParserAccess().getSchemaTypeKeyword_3());
            		
            // InternalVizualizer.g:953:3: ( (lv_schemaType_4_0= ruleSchemaType ) )
            // InternalVizualizer.g:954:4: (lv_schemaType_4_0= ruleSchemaType )
            {
            // InternalVizualizer.g:954:4: (lv_schemaType_4_0= ruleSchemaType )
            // InternalVizualizer.g:955:5: lv_schemaType_4_0= ruleSchemaType
            {

            					newCompositeNode(grammarAccess.getSchemaParserAccess().getSchemaTypeSchemaTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalVizualizer.g:972:3: ( (lv_selectors_5_0= ruleSelector ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==32) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalVizualizer.g:973:4: (lv_selectors_5_0= ruleSelector )
            	    {
            	    // InternalVizualizer.g:973:4: (lv_selectors_5_0= ruleSelector )
            	    // InternalVizualizer.g:974:5: lv_selectors_5_0= ruleSelector
            	    {

            	    					newCompositeNode(grammarAccess.getSchemaParserAccess().getSelectorsSelectorParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_23);
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
    // InternalVizualizer.g:999:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalVizualizer.g:999:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalVizualizer.g:1000:2: iv_ruleSelector= ruleSelector EOF
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
    // InternalVizualizer.g:1006:1: ruleSelector returns [EObject current=null] : (otherlv_0= 'Selector as ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_steps_3_0= RULE_STRING ) ) (otherlv_4= ' -> ' ( (lv_steps_5_0= RULE_STRING ) ) )+ otherlv_6= '}' ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_steps_3_0=null;
        Token otherlv_4=null;
        Token lv_steps_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalVizualizer.g:1012:2: ( (otherlv_0= 'Selector as ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_steps_3_0= RULE_STRING ) ) (otherlv_4= ' -> ' ( (lv_steps_5_0= RULE_STRING ) ) )+ otherlv_6= '}' ) )
            // InternalVizualizer.g:1013:2: (otherlv_0= 'Selector as ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_steps_3_0= RULE_STRING ) ) (otherlv_4= ' -> ' ( (lv_steps_5_0= RULE_STRING ) ) )+ otherlv_6= '}' )
            {
            // InternalVizualizer.g:1013:2: (otherlv_0= 'Selector as ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_steps_3_0= RULE_STRING ) ) (otherlv_4= ' -> ' ( (lv_steps_5_0= RULE_STRING ) ) )+ otherlv_6= '}' )
            // InternalVizualizer.g:1014:3: otherlv_0= 'Selector as ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_steps_3_0= RULE_STRING ) ) (otherlv_4= ' -> ' ( (lv_steps_5_0= RULE_STRING ) ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectorAccess().getSelectorAsKeyword_0());
            		
            // InternalVizualizer.g:1018:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVizualizer.g:1019:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVizualizer.g:1019:4: (lv_name_1_0= RULE_ID )
            // InternalVizualizer.g:1020:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSelectorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalVizualizer.g:1040:3: ( (lv_steps_3_0= RULE_STRING ) )
            // InternalVizualizer.g:1041:4: (lv_steps_3_0= RULE_STRING )
            {
            // InternalVizualizer.g:1041:4: (lv_steps_3_0= RULE_STRING )
            // InternalVizualizer.g:1042:5: lv_steps_3_0= RULE_STRING
            {
            lv_steps_3_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

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

            // InternalVizualizer.g:1058:3: (otherlv_4= ' -> ' ( (lv_steps_5_0= RULE_STRING ) ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==33) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalVizualizer.g:1059:4: otherlv_4= ' -> ' ( (lv_steps_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,33,FOLLOW_16); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSelectorAccess().getSpaceHyphenMinusGreaterThanSignSpaceKeyword_4_0());
            	    			
            	    // InternalVizualizer.g:1063:4: ( (lv_steps_5_0= RULE_STRING ) )
            	    // InternalVizualizer.g:1064:5: (lv_steps_5_0= RULE_STRING )
            	    {
            	    // InternalVizualizer.g:1064:5: (lv_steps_5_0= RULE_STRING )
            	    // InternalVizualizer.g:1065:6: lv_steps_5_0= RULE_STRING
            	    {
            	    lv_steps_5_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
    // InternalVizualizer.g:1090:1: entryRuleFormula returns [EObject current=null] : iv_ruleFormula= ruleFormula EOF ;
    public final EObject entryRuleFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormula = null;


        try {
            // InternalVizualizer.g:1090:48: (iv_ruleFormula= ruleFormula EOF )
            // InternalVizualizer.g:1091:2: iv_ruleFormula= ruleFormula EOF
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
    // InternalVizualizer.g:1097:1: ruleFormula returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= '=' ( (lv_exp_7_0= ruleExpression ) ) ) ;
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
            // InternalVizualizer.g:1103:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= '=' ( (lv_exp_7_0= ruleExpression ) ) ) )
            // InternalVizualizer.g:1104:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= '=' ( (lv_exp_7_0= ruleExpression ) ) )
            {
            // InternalVizualizer.g:1104:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= '=' ( (lv_exp_7_0= ruleExpression ) ) )
            // InternalVizualizer.g:1105:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= '=' ( (lv_exp_7_0= ruleExpression ) )
            {
            // InternalVizualizer.g:1105:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalVizualizer.g:1106:4: (lv_name_0_0= RULE_ID )
            {
            // InternalVizualizer.g:1106:4: (lv_name_0_0= RULE_ID )
            // InternalVizualizer.g:1107:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            otherlv_1=(Token)match(input,34,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getFormulaAccess().getLeftParenthesisKeyword_1());
            		
            // InternalVizualizer.g:1127:3: ( ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalVizualizer.g:1128:4: ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )*
                    {
                    // InternalVizualizer.g:1128:4: ( (lv_vars_2_0= ruleVariable ) )
                    // InternalVizualizer.g:1129:5: (lv_vars_2_0= ruleVariable )
                    {
                    // InternalVizualizer.g:1129:5: (lv_vars_2_0= ruleVariable )
                    // InternalVizualizer.g:1130:6: lv_vars_2_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getFormulaAccess().getVarsVariableParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    // InternalVizualizer.g:1147:4: (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==21) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalVizualizer.g:1148:5: otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFormulaAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalVizualizer.g:1152:5: ( (lv_vars_4_0= ruleVariable ) )
                    	    // InternalVizualizer.g:1153:6: (lv_vars_4_0= ruleVariable )
                    	    {
                    	    // InternalVizualizer.g:1153:6: (lv_vars_4_0= ruleVariable )
                    	    // InternalVizualizer.g:1154:7: lv_vars_4_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getFormulaAccess().getVarsVariableParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
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
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,35,FOLLOW_29); 

            			newLeafNode(otherlv_5, grammarAccess.getFormulaAccess().getRightParenthesisKeyword_3());
            		
            otherlv_6=(Token)match(input,36,FOLLOW_30); 

            			newLeafNode(otherlv_6, grammarAccess.getFormulaAccess().getEqualsSignKeyword_4());
            		
            // InternalVizualizer.g:1181:3: ( (lv_exp_7_0= ruleExpression ) )
            // InternalVizualizer.g:1182:4: (lv_exp_7_0= ruleExpression )
            {
            // InternalVizualizer.g:1182:4: (lv_exp_7_0= ruleExpression )
            // InternalVizualizer.g:1183:5: lv_exp_7_0= ruleExpression
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
    // InternalVizualizer.g:1204:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalVizualizer.g:1204:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalVizualizer.g:1205:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalVizualizer.g:1211:1: ruleExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleFactor ) ) ( ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:1217:2: ( ( ( (lv_left_0_0= ruleFactor ) ) ( ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) ) )? ) )
            // InternalVizualizer.g:1218:2: ( ( (lv_left_0_0= ruleFactor ) ) ( ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) ) )? )
            {
            // InternalVizualizer.g:1218:2: ( ( (lv_left_0_0= ruleFactor ) ) ( ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) ) )? )
            // InternalVizualizer.g:1219:3: ( (lv_left_0_0= ruleFactor ) ) ( ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) ) )?
            {
            // InternalVizualizer.g:1219:3: ( (lv_left_0_0= ruleFactor ) )
            // InternalVizualizer.g:1220:4: (lv_left_0_0= ruleFactor )
            {
            // InternalVizualizer.g:1220:4: (lv_left_0_0= ruleFactor )
            // InternalVizualizer.g:1221:5: lv_left_0_0= ruleFactor
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getLeftFactorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
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

            // InternalVizualizer.g:1238:3: ( ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=37 && LA12_0<=38)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalVizualizer.g:1239:4: ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) )
                    {
                    // InternalVizualizer.g:1239:4: ( (lv_op_1_0= ruleOp1 ) )
                    // InternalVizualizer.g:1240:5: (lv_op_1_0= ruleOp1 )
                    {
                    // InternalVizualizer.g:1240:5: (lv_op_1_0= ruleOp1 )
                    // InternalVizualizer.g:1241:6: lv_op_1_0= ruleOp1
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getOpOp1ParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    // InternalVizualizer.g:1258:4: ( (lv_right_2_0= ruleExpression ) )
                    // InternalVizualizer.g:1259:5: (lv_right_2_0= ruleExpression )
                    {
                    // InternalVizualizer.g:1259:5: (lv_right_2_0= ruleExpression )
                    // InternalVizualizer.g:1260:6: lv_right_2_0= ruleExpression
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
    // InternalVizualizer.g:1282:1: entryRuleOp1 returns [String current=null] : iv_ruleOp1= ruleOp1 EOF ;
    public final String entryRuleOp1() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOp1 = null;


        try {
            // InternalVizualizer.g:1282:43: (iv_ruleOp1= ruleOp1 EOF )
            // InternalVizualizer.g:1283:2: iv_ruleOp1= ruleOp1 EOF
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
    // InternalVizualizer.g:1289:1: ruleOp1 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOp1() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVizualizer.g:1295:2: ( (kw= '+' | kw= '-' ) )
            // InternalVizualizer.g:1296:2: (kw= '+' | kw= '-' )
            {
            // InternalVizualizer.g:1296:2: (kw= '+' | kw= '-' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==37) ) {
                alt13=1;
            }
            else if ( (LA13_0==38) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalVizualizer.g:1297:3: kw= '+'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOp1Access().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:1303:3: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

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
    // InternalVizualizer.g:1312:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalVizualizer.g:1312:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalVizualizer.g:1313:2: iv_ruleFactor= ruleFactor EOF
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
    // InternalVizualizer.g:1319:1: ruleFactor returns [EObject current=null] : ( ( (lv_left_0_0= rulePrimitive ) ) ( ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) ) )? ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:1325:2: ( ( ( (lv_left_0_0= rulePrimitive ) ) ( ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) ) )? ) )
            // InternalVizualizer.g:1326:2: ( ( (lv_left_0_0= rulePrimitive ) ) ( ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) ) )? )
            {
            // InternalVizualizer.g:1326:2: ( ( (lv_left_0_0= rulePrimitive ) ) ( ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) ) )? )
            // InternalVizualizer.g:1327:3: ( (lv_left_0_0= rulePrimitive ) ) ( ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) ) )?
            {
            // InternalVizualizer.g:1327:3: ( (lv_left_0_0= rulePrimitive ) )
            // InternalVizualizer.g:1328:4: (lv_left_0_0= rulePrimitive )
            {
            // InternalVizualizer.g:1328:4: (lv_left_0_0= rulePrimitive )
            // InternalVizualizer.g:1329:5: lv_left_0_0= rulePrimitive
            {

            					newCompositeNode(grammarAccess.getFactorAccess().getLeftPrimitiveParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
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

            // InternalVizualizer.g:1346:3: ( ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=39 && LA14_0<=40)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalVizualizer.g:1347:4: ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) )
                    {
                    // InternalVizualizer.g:1347:4: ( (lv_op_1_0= ruleOp2 ) )
                    // InternalVizualizer.g:1348:5: (lv_op_1_0= ruleOp2 )
                    {
                    // InternalVizualizer.g:1348:5: (lv_op_1_0= ruleOp2 )
                    // InternalVizualizer.g:1349:6: lv_op_1_0= ruleOp2
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getOpOp2ParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    // InternalVizualizer.g:1366:4: ( (lv_right_2_0= ruleFactor ) )
                    // InternalVizualizer.g:1367:5: (lv_right_2_0= ruleFactor )
                    {
                    // InternalVizualizer.g:1367:5: (lv_right_2_0= ruleFactor )
                    // InternalVizualizer.g:1368:6: lv_right_2_0= ruleFactor
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
    // InternalVizualizer.g:1390:1: entryRuleOp2 returns [String current=null] : iv_ruleOp2= ruleOp2 EOF ;
    public final String entryRuleOp2() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOp2 = null;


        try {
            // InternalVizualizer.g:1390:43: (iv_ruleOp2= ruleOp2 EOF )
            // InternalVizualizer.g:1391:2: iv_ruleOp2= ruleOp2 EOF
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
    // InternalVizualizer.g:1397:1: ruleOp2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleOp2() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVizualizer.g:1403:2: ( (kw= '*' | kw= '/' ) )
            // InternalVizualizer.g:1404:2: (kw= '*' | kw= '/' )
            {
            // InternalVizualizer.g:1404:2: (kw= '*' | kw= '/' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            else if ( (LA15_0==40) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalVizualizer.g:1405:3: kw= '*'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOp2Access().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:1411:3: kw= '/'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

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
    // InternalVizualizer.g:1420:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalVizualizer.g:1420:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalVizualizer.g:1421:2: iv_rulePrimitive= rulePrimitive EOF
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
    // InternalVizualizer.g:1427:1: rulePrimitive returns [EObject current=null] : (this_Number_0= ruleNumber | this_Variable_1= ruleVariable | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Number_0 = null;

        EObject this_Variable_1 = null;

        EObject this_Expression_3 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:1433:2: ( (this_Number_0= ruleNumber | this_Variable_1= ruleVariable | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) ) )
            // InternalVizualizer.g:1434:2: (this_Number_0= ruleNumber | this_Variable_1= ruleVariable | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) )
            {
            // InternalVizualizer.g:1434:2: (this_Number_0= ruleNumber | this_Variable_1= ruleVariable | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt16=1;
                }
                break;
            case RULE_ID:
                {
                alt16=2;
                }
                break;
            case 34:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalVizualizer.g:1435:3: this_Number_0= ruleNumber
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
                    // InternalVizualizer.g:1444:3: this_Variable_1= ruleVariable
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
                    // InternalVizualizer.g:1453:3: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    {
                    // InternalVizualizer.g:1453:3: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    // InternalVizualizer.g:1454:4: otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_30); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimitiveAccess().getExpressionParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_33);
                    this_Expression_3=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,35,FOLLOW_2); 

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
    // InternalVizualizer.g:1475:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalVizualizer.g:1475:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalVizualizer.g:1476:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalVizualizer.g:1482:1: ruleNumber returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalVizualizer.g:1488:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalVizualizer.g:1489:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalVizualizer.g:1489:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalVizualizer.g:1490:3: (lv_val_0_0= RULE_INT )
            {
            // InternalVizualizer.g:1490:3: (lv_val_0_0= RULE_INT )
            // InternalVizualizer.g:1491:4: lv_val_0_0= RULE_INT
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
    // InternalVizualizer.g:1510:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalVizualizer.g:1510:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalVizualizer.g:1511:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalVizualizer.g:1517:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalVizualizer.g:1523:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalVizualizer.g:1524:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalVizualizer.g:1524:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalVizualizer.g:1525:3: (lv_name_0_0= RULE_ID )
            {
            // InternalVizualizer.g:1525:3: (lv_name_0_0= RULE_ID )
            // InternalVizualizer.g:1526:4: lv_name_0_0= RULE_ID
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
    // InternalVizualizer.g:1545:1: ruleSchemaType returns [Enumerator current=null] : ( (enumLiteral_0= 'XML' ) | (enumLiteral_1= 'CSV' ) | (enumLiteral_2= 'JSON' ) ) ;
    public final Enumerator ruleSchemaType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalVizualizer.g:1551:2: ( ( (enumLiteral_0= 'XML' ) | (enumLiteral_1= 'CSV' ) | (enumLiteral_2= 'JSON' ) ) )
            // InternalVizualizer.g:1552:2: ( (enumLiteral_0= 'XML' ) | (enumLiteral_1= 'CSV' ) | (enumLiteral_2= 'JSON' ) )
            {
            // InternalVizualizer.g:1552:2: ( (enumLiteral_0= 'XML' ) | (enumLiteral_1= 'CSV' ) | (enumLiteral_2= 'JSON' ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt17=1;
                }
                break;
            case 42:
                {
                alt17=2;
                }
                break;
            case 43:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalVizualizer.g:1553:3: (enumLiteral_0= 'XML' )
                    {
                    // InternalVizualizer.g:1553:3: (enumLiteral_0= 'XML' )
                    // InternalVizualizer.g:1554:4: enumLiteral_0= 'XML'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getSchemaTypeAccess().getXMLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSchemaTypeAccess().getXMLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:1561:3: (enumLiteral_1= 'CSV' )
                    {
                    // InternalVizualizer.g:1561:3: (enumLiteral_1= 'CSV' )
                    // InternalVizualizer.g:1562:4: enumLiteral_1= 'CSV'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getSchemaTypeAccess().getCSVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSchemaTypeAccess().getCSVEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVizualizer.g:1569:3: (enumLiteral_2= 'JSON' )
                    {
                    // InternalVizualizer.g:1569:3: (enumLiteral_2= 'JSON' )
                    // InternalVizualizer.g:1570:4: enumLiteral_2= 'JSON'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000052020802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100002000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000050L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});

}