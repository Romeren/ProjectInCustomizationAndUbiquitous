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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Page'", "'{'", "'}'", "'Link'", "'to'", "'Graph'", "'Datasource'", "'Dimensions'", "':'", "','", "'Formula'", "'and'", "'using'", "'['", "']'", "'as'", "'PostPoint'", "'url'", "'use Schema'", "'GetPoint'", "'Headers'", "'Schema'", "'SchemaType'", "'='", "'Selector as '", "' -> '", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'XML'", "'CSV'", "'JSON'"
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
                case 27:
                case 30:
                    {
                    alt1=2;
                    }
                    break;
                case 32:
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
    // InternalVizualizer.g:366:1: ruleDatasource returns [EObject current=null] : (otherlv_0= 'Datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Dimensions' otherlv_4= ':' ( (lv_dimensions_5_0= ruleDimension ) ) (otherlv_6= ',' ( (lv_dimensions_7_0= ruleDimension ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleDatasource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_dimensions_5_0 = null;

        EObject lv_dimensions_7_0 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:372:2: ( (otherlv_0= 'Datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Dimensions' otherlv_4= ':' ( (lv_dimensions_5_0= ruleDimension ) ) (otherlv_6= ',' ( (lv_dimensions_7_0= ruleDimension ) ) )* otherlv_8= '}' ) )
            // InternalVizualizer.g:373:2: (otherlv_0= 'Datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Dimensions' otherlv_4= ':' ( (lv_dimensions_5_0= ruleDimension ) ) (otherlv_6= ',' ( (lv_dimensions_7_0= ruleDimension ) ) )* otherlv_8= '}' )
            {
            // InternalVizualizer.g:373:2: (otherlv_0= 'Datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Dimensions' otherlv_4= ':' ( (lv_dimensions_5_0= ruleDimension ) ) (otherlv_6= ',' ( (lv_dimensions_7_0= ruleDimension ) ) )* otherlv_8= '}' )
            // InternalVizualizer.g:374:3: otherlv_0= 'Datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Dimensions' otherlv_4= ':' ( (lv_dimensions_5_0= ruleDimension ) ) (otherlv_6= ',' ( (lv_dimensions_7_0= ruleDimension ) ) )* otherlv_8= '}'
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
            		
            otherlv_3=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getDatasourceAccess().getDimensionsKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getDatasourceAccess().getColonKeyword_4());
            		
            // InternalVizualizer.g:408:3: ( (lv_dimensions_5_0= ruleDimension ) )
            // InternalVizualizer.g:409:4: (lv_dimensions_5_0= ruleDimension )
            {
            // InternalVizualizer.g:409:4: (lv_dimensions_5_0= ruleDimension )
            // InternalVizualizer.g:410:5: lv_dimensions_5_0= ruleDimension
            {

            					newCompositeNode(grammarAccess.getDatasourceAccess().getDimensionsDimensionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_dimensions_5_0=ruleDimension();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatasourceRule());
            					}
            					add(
            						current,
            						"dimensions",
            						lv_dimensions_5_0,
            						"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.Dimension");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVizualizer.g:427:3: (otherlv_6= ',' ( (lv_dimensions_7_0= ruleDimension ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalVizualizer.g:428:4: otherlv_6= ',' ( (lv_dimensions_7_0= ruleDimension ) )
            	    {
            	    otherlv_6=(Token)match(input,20,FOLLOW_10); 

            	    				newLeafNode(otherlv_6, grammarAccess.getDatasourceAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalVizualizer.g:432:4: ( (lv_dimensions_7_0= ruleDimension ) )
            	    // InternalVizualizer.g:433:5: (lv_dimensions_7_0= ruleDimension )
            	    {
            	    // InternalVizualizer.g:433:5: (lv_dimensions_7_0= ruleDimension )
            	    // InternalVizualizer.g:434:6: lv_dimensions_7_0= ruleDimension
            	    {

            	    						newCompositeNode(grammarAccess.getDatasourceAccess().getDimensionsDimensionParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
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


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDatasourceAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalVizualizer.g:460:1: entryRuleDimension returns [EObject current=null] : iv_ruleDimension= ruleDimension EOF ;
    public final EObject entryRuleDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimension = null;


        try {
            // InternalVizualizer.g:460:50: (iv_ruleDimension= ruleDimension EOF )
            // InternalVizualizer.g:461:2: iv_ruleDimension= ruleDimension EOF
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
    // InternalVizualizer.g:467:1: ruleDimension returns [EObject current=null] : (otherlv_0= 'Formula' ( (lv_name_1_0= ruleFormula ) ) ( (lv_sourceSelectors_2_0= ruleDimensionSelector ) ) (otherlv_3= 'and' ( (lv_sourceSelectors_4_0= ruleDimensionSelector ) ) )* ) ;
    public final EObject ruleDimension() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_sourceSelectors_2_0 = null;

        EObject lv_sourceSelectors_4_0 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:473:2: ( (otherlv_0= 'Formula' ( (lv_name_1_0= ruleFormula ) ) ( (lv_sourceSelectors_2_0= ruleDimensionSelector ) ) (otherlv_3= 'and' ( (lv_sourceSelectors_4_0= ruleDimensionSelector ) ) )* ) )
            // InternalVizualizer.g:474:2: (otherlv_0= 'Formula' ( (lv_name_1_0= ruleFormula ) ) ( (lv_sourceSelectors_2_0= ruleDimensionSelector ) ) (otherlv_3= 'and' ( (lv_sourceSelectors_4_0= ruleDimensionSelector ) ) )* )
            {
            // InternalVizualizer.g:474:2: (otherlv_0= 'Formula' ( (lv_name_1_0= ruleFormula ) ) ( (lv_sourceSelectors_2_0= ruleDimensionSelector ) ) (otherlv_3= 'and' ( (lv_sourceSelectors_4_0= ruleDimensionSelector ) ) )* )
            // InternalVizualizer.g:475:3: otherlv_0= 'Formula' ( (lv_name_1_0= ruleFormula ) ) ( (lv_sourceSelectors_2_0= ruleDimensionSelector ) ) (otherlv_3= 'and' ( (lv_sourceSelectors_4_0= ruleDimensionSelector ) ) )*
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDimensionAccess().getFormulaKeyword_0());
            		
            // InternalVizualizer.g:479:3: ( (lv_name_1_0= ruleFormula ) )
            // InternalVizualizer.g:480:4: (lv_name_1_0= ruleFormula )
            {
            // InternalVizualizer.g:480:4: (lv_name_1_0= ruleFormula )
            // InternalVizualizer.g:481:5: lv_name_1_0= ruleFormula
            {

            					newCompositeNode(grammarAccess.getDimensionAccess().getNameFormulaParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDimensionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.sdu.formularzlanguage.Formular.Formula");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVizualizer.g:498:3: ( (lv_sourceSelectors_2_0= ruleDimensionSelector ) )
            // InternalVizualizer.g:499:4: (lv_sourceSelectors_2_0= ruleDimensionSelector )
            {
            // InternalVizualizer.g:499:4: (lv_sourceSelectors_2_0= ruleDimensionSelector )
            // InternalVizualizer.g:500:5: lv_sourceSelectors_2_0= ruleDimensionSelector
            {

            					newCompositeNode(grammarAccess.getDimensionAccess().getSourceSelectorsDimensionSelectorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_sourceSelectors_2_0=ruleDimensionSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDimensionRule());
            					}
            					add(
            						current,
            						"sourceSelectors",
            						lv_sourceSelectors_2_0,
            						"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.DimensionSelector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVizualizer.g:517:3: (otherlv_3= 'and' ( (lv_sourceSelectors_4_0= ruleDimensionSelector ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalVizualizer.g:518:4: otherlv_3= 'and' ( (lv_sourceSelectors_4_0= ruleDimensionSelector ) )
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_12); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDimensionAccess().getAndKeyword_3_0());
            	    			
            	    // InternalVizualizer.g:522:4: ( (lv_sourceSelectors_4_0= ruleDimensionSelector ) )
            	    // InternalVizualizer.g:523:5: (lv_sourceSelectors_4_0= ruleDimensionSelector )
            	    {
            	    // InternalVizualizer.g:523:5: (lv_sourceSelectors_4_0= ruleDimensionSelector )
            	    // InternalVizualizer.g:524:6: lv_sourceSelectors_4_0= ruleDimensionSelector
            	    {

            	    						newCompositeNode(grammarAccess.getDimensionAccess().getSourceSelectorsDimensionSelectorParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_sourceSelectors_4_0=ruleDimensionSelector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDimensionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sourceSelectors",
            	    							lv_sourceSelectors_4_0,
            	    							"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.DimensionSelector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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


    // $ANTLR start "entryRuleDimensionSelector"
    // InternalVizualizer.g:546:1: entryRuleDimensionSelector returns [EObject current=null] : iv_ruleDimensionSelector= ruleDimensionSelector EOF ;
    public final EObject entryRuleDimensionSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimensionSelector = null;


        try {
            // InternalVizualizer.g:546:58: (iv_ruleDimensionSelector= ruleDimensionSelector EOF )
            // InternalVizualizer.g:547:2: iv_ruleDimensionSelector= ruleDimensionSelector EOF
            {
             newCompositeNode(grammarAccess.getDimensionSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDimensionSelector=ruleDimensionSelector();

            state._fsp--;

             current =iv_ruleDimensionSelector; 
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
    // $ANTLR end "entryRuleDimensionSelector"


    // $ANTLR start "ruleDimensionSelector"
    // InternalVizualizer.g:553:1: ruleDimensionSelector returns [EObject current=null] : (otherlv_0= 'using' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_selectVar_3_0= ruleNoQuotesString ) ) otherlv_4= ']' otherlv_5= 'as' ( (lv_name_6_0= RULE_ID ) ) ) ;
    public final EObject ruleDimensionSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        EObject lv_selectVar_3_0 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:559:2: ( (otherlv_0= 'using' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_selectVar_3_0= ruleNoQuotesString ) ) otherlv_4= ']' otherlv_5= 'as' ( (lv_name_6_0= RULE_ID ) ) ) )
            // InternalVizualizer.g:560:2: (otherlv_0= 'using' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_selectVar_3_0= ruleNoQuotesString ) ) otherlv_4= ']' otherlv_5= 'as' ( (lv_name_6_0= RULE_ID ) ) )
            {
            // InternalVizualizer.g:560:2: (otherlv_0= 'using' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_selectVar_3_0= ruleNoQuotesString ) ) otherlv_4= ']' otherlv_5= 'as' ( (lv_name_6_0= RULE_ID ) ) )
            // InternalVizualizer.g:561:3: otherlv_0= 'using' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_selectVar_3_0= ruleNoQuotesString ) ) otherlv_4= ']' otherlv_5= 'as' ( (lv_name_6_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDimensionSelectorAccess().getUsingKeyword_0());
            		
            // InternalVizualizer.g:565:3: ( (otherlv_1= RULE_ID ) )
            // InternalVizualizer.g:566:4: (otherlv_1= RULE_ID )
            {
            // InternalVizualizer.g:566:4: (otherlv_1= RULE_ID )
            // InternalVizualizer.g:567:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDimensionSelectorRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_1, grammarAccess.getDimensionSelectorAccess().getSourceSourceCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDimensionSelectorAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalVizualizer.g:582:3: ( (lv_selectVar_3_0= ruleNoQuotesString ) )
            // InternalVizualizer.g:583:4: (lv_selectVar_3_0= ruleNoQuotesString )
            {
            // InternalVizualizer.g:583:4: (lv_selectVar_3_0= ruleNoQuotesString )
            // InternalVizualizer.g:584:5: lv_selectVar_3_0= ruleNoQuotesString
            {

            					newCompositeNode(grammarAccess.getDimensionSelectorAccess().getSelectVarNoQuotesStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_selectVar_3_0=ruleNoQuotesString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDimensionSelectorRule());
            					}
            					set(
            						current,
            						"selectVar",
            						lv_selectVar_3_0,
            						"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.NoQuotesString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getDimensionSelectorAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getDimensionSelectorAccess().getAsKeyword_5());
            		
            // InternalVizualizer.g:609:3: ( (lv_name_6_0= RULE_ID ) )
            // InternalVizualizer.g:610:4: (lv_name_6_0= RULE_ID )
            {
            // InternalVizualizer.g:610:4: (lv_name_6_0= RULE_ID )
            // InternalVizualizer.g:611:5: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_6_0, grammarAccess.getDimensionSelectorAccess().getNameIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDimensionSelectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleDimensionSelector"


    // $ANTLR start "entryRuleNoQuotesString"
    // InternalVizualizer.g:631:1: entryRuleNoQuotesString returns [EObject current=null] : iv_ruleNoQuotesString= ruleNoQuotesString EOF ;
    public final EObject entryRuleNoQuotesString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoQuotesString = null;


        try {
            // InternalVizualizer.g:631:55: (iv_ruleNoQuotesString= ruleNoQuotesString EOF )
            // InternalVizualizer.g:632:2: iv_ruleNoQuotesString= ruleNoQuotesString EOF
            {
             newCompositeNode(grammarAccess.getNoQuotesStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNoQuotesString=ruleNoQuotesString();

            state._fsp--;

             current =iv_ruleNoQuotesString; 
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
    // $ANTLR end "entryRuleNoQuotesString"


    // $ANTLR start "ruleNoQuotesString"
    // InternalVizualizer.g:638:1: ruleNoQuotesString returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleNoQuotesString() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalVizualizer.g:644:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalVizualizer.g:645:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalVizualizer.g:645:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalVizualizer.g:646:3: (lv_name_0_0= RULE_ID )
            {
            // InternalVizualizer.g:646:3: (lv_name_0_0= RULE_ID )
            // InternalVizualizer.g:647:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getNoQuotesStringAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNoQuotesStringRule());
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
    // $ANTLR end "ruleNoQuotesString"


    // $ANTLR start "entryRuleSource"
    // InternalVizualizer.g:666:1: entryRuleSource returns [EObject current=null] : iv_ruleSource= ruleSource EOF ;
    public final EObject entryRuleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource = null;


        try {
            // InternalVizualizer.g:666:47: (iv_ruleSource= ruleSource EOF )
            // InternalVizualizer.g:667:2: iv_ruleSource= ruleSource EOF
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
    // InternalVizualizer.g:673:1: ruleSource returns [EObject current=null] : (this_EndPoint_0= ruleEndPoint | this_Datasource_1= ruleDatasource ) ;
    public final EObject ruleSource() throws RecognitionException {
        EObject current = null;

        EObject this_EndPoint_0 = null;

        EObject this_Datasource_1 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:679:2: ( (this_EndPoint_0= ruleEndPoint | this_Datasource_1= ruleDatasource ) )
            // InternalVizualizer.g:680:2: (this_EndPoint_0= ruleEndPoint | this_Datasource_1= ruleDatasource )
            {
            // InternalVizualizer.g:680:2: (this_EndPoint_0= ruleEndPoint | this_Datasource_1= ruleDatasource )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27||LA6_0==30) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalVizualizer.g:681:3: this_EndPoint_0= ruleEndPoint
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
                    // InternalVizualizer.g:690:3: this_Datasource_1= ruleDatasource
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
    // InternalVizualizer.g:702:1: entryRuleEndPoint returns [EObject current=null] : iv_ruleEndPoint= ruleEndPoint EOF ;
    public final EObject entryRuleEndPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndPoint = null;


        try {
            // InternalVizualizer.g:702:49: (iv_ruleEndPoint= ruleEndPoint EOF )
            // InternalVizualizer.g:703:2: iv_ruleEndPoint= ruleEndPoint EOF
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
    // InternalVizualizer.g:709:1: ruleEndPoint returns [EObject current=null] : (this_GetEndPoint_0= ruleGetEndPoint | this_PostEndPoint_1= rulePostEndPoint ) ;
    public final EObject ruleEndPoint() throws RecognitionException {
        EObject current = null;

        EObject this_GetEndPoint_0 = null;

        EObject this_PostEndPoint_1 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:715:2: ( (this_GetEndPoint_0= ruleGetEndPoint | this_PostEndPoint_1= rulePostEndPoint ) )
            // InternalVizualizer.g:716:2: (this_GetEndPoint_0= ruleGetEndPoint | this_PostEndPoint_1= rulePostEndPoint )
            {
            // InternalVizualizer.g:716:2: (this_GetEndPoint_0= ruleGetEndPoint | this_PostEndPoint_1= rulePostEndPoint )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            else if ( (LA7_0==27) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalVizualizer.g:717:3: this_GetEndPoint_0= ruleGetEndPoint
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
                    // InternalVizualizer.g:726:3: this_PostEndPoint_1= rulePostEndPoint
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
    // InternalVizualizer.g:738:1: entryRulePostEndPoint returns [EObject current=null] : iv_rulePostEndPoint= rulePostEndPoint EOF ;
    public final EObject entryRulePostEndPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostEndPoint = null;


        try {
            // InternalVizualizer.g:738:53: (iv_rulePostEndPoint= rulePostEndPoint EOF )
            // InternalVizualizer.g:739:2: iv_rulePostEndPoint= rulePostEndPoint EOF
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
    // InternalVizualizer.g:745:1: rulePostEndPoint returns [EObject current=null] : (otherlv_0= 'PostPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= 'use Schema' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' ) ;
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
            // InternalVizualizer.g:751:2: ( (otherlv_0= 'PostPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= 'use Schema' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' ) )
            // InternalVizualizer.g:752:2: (otherlv_0= 'PostPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= 'use Schema' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' )
            {
            // InternalVizualizer.g:752:2: (otherlv_0= 'PostPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= 'use Schema' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' )
            // InternalVizualizer.g:753:3: otherlv_0= 'PostPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= 'use Schema' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPostEndPointAccess().getPostPointKeyword_0());
            		
            // InternalVizualizer.g:757:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVizualizer.g:758:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVizualizer.g:758:4: (lv_name_1_0= RULE_ID )
            // InternalVizualizer.g:759:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getPostEndPointAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getPostEndPointAccess().getUrlKeyword_3());
            		
            // InternalVizualizer.g:783:3: ( (lv_url_4_0= RULE_STRING ) )
            // InternalVizualizer.g:784:4: (lv_url_4_0= RULE_STRING )
            {
            // InternalVizualizer.g:784:4: (lv_url_4_0= RULE_STRING )
            // InternalVizualizer.g:785:5: lv_url_4_0= RULE_STRING
            {
            lv_url_4_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

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

            otherlv_5=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getPostEndPointAccess().getUseSchemaKeyword_5());
            		
            // InternalVizualizer.g:805:3: ( (otherlv_6= RULE_ID ) )
            // InternalVizualizer.g:806:4: (otherlv_6= RULE_ID )
            {
            // InternalVizualizer.g:806:4: (otherlv_6= RULE_ID )
            // InternalVizualizer.g:807:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPostEndPointRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_20); 

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
    // InternalVizualizer.g:826:1: entryRuleGetEndPoint returns [EObject current=null] : iv_ruleGetEndPoint= ruleGetEndPoint EOF ;
    public final EObject entryRuleGetEndPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetEndPoint = null;


        try {
            // InternalVizualizer.g:826:52: (iv_ruleGetEndPoint= ruleGetEndPoint EOF )
            // InternalVizualizer.g:827:2: iv_ruleGetEndPoint= ruleGetEndPoint EOF
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
    // InternalVizualizer.g:833:1: ruleGetEndPoint returns [EObject current=null] : (otherlv_0= 'GetPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= 'Headers' otherlv_6= '{' ( (lv_headers_7_0= ruleHeader ) ) (otherlv_8= ',' ( (lv_headers_9_0= ruleHeader ) ) )* otherlv_10= '}' otherlv_11= 'use Schema' ( (otherlv_12= RULE_ID ) ) otherlv_13= '}' ) ;
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
            // InternalVizualizer.g:839:2: ( (otherlv_0= 'GetPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= 'Headers' otherlv_6= '{' ( (lv_headers_7_0= ruleHeader ) ) (otherlv_8= ',' ( (lv_headers_9_0= ruleHeader ) ) )* otherlv_10= '}' otherlv_11= 'use Schema' ( (otherlv_12= RULE_ID ) ) otherlv_13= '}' ) )
            // InternalVizualizer.g:840:2: (otherlv_0= 'GetPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= 'Headers' otherlv_6= '{' ( (lv_headers_7_0= ruleHeader ) ) (otherlv_8= ',' ( (lv_headers_9_0= ruleHeader ) ) )* otherlv_10= '}' otherlv_11= 'use Schema' ( (otherlv_12= RULE_ID ) ) otherlv_13= '}' )
            {
            // InternalVizualizer.g:840:2: (otherlv_0= 'GetPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= 'Headers' otherlv_6= '{' ( (lv_headers_7_0= ruleHeader ) ) (otherlv_8= ',' ( (lv_headers_9_0= ruleHeader ) ) )* otherlv_10= '}' otherlv_11= 'use Schema' ( (otherlv_12= RULE_ID ) ) otherlv_13= '}' )
            // InternalVizualizer.g:841:3: otherlv_0= 'GetPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= 'Headers' otherlv_6= '{' ( (lv_headers_7_0= ruleHeader ) ) (otherlv_8= ',' ( (lv_headers_9_0= ruleHeader ) ) )* otherlv_10= '}' otherlv_11= 'use Schema' ( (otherlv_12= RULE_ID ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGetEndPointAccess().getGetPointKeyword_0());
            		
            // InternalVizualizer.g:845:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVizualizer.g:846:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVizualizer.g:846:4: (lv_name_1_0= RULE_ID )
            // InternalVizualizer.g:847:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getGetEndPointAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getGetEndPointAccess().getUrlKeyword_3());
            		
            // InternalVizualizer.g:871:3: ( (lv_url_4_0= RULE_STRING ) )
            // InternalVizualizer.g:872:4: (lv_url_4_0= RULE_STRING )
            {
            // InternalVizualizer.g:872:4: (lv_url_4_0= RULE_STRING )
            // InternalVizualizer.g:873:5: lv_url_4_0= RULE_STRING
            {
            lv_url_4_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

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

            otherlv_5=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getGetEndPointAccess().getHeadersKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_6, grammarAccess.getGetEndPointAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalVizualizer.g:897:3: ( (lv_headers_7_0= ruleHeader ) )
            // InternalVizualizer.g:898:4: (lv_headers_7_0= ruleHeader )
            {
            // InternalVizualizer.g:898:4: (lv_headers_7_0= ruleHeader )
            // InternalVizualizer.g:899:5: lv_headers_7_0= ruleHeader
            {

            					newCompositeNode(grammarAccess.getGetEndPointAccess().getHeadersHeaderParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalVizualizer.g:916:3: (otherlv_8= ',' ( (lv_headers_9_0= ruleHeader ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalVizualizer.g:917:4: otherlv_8= ',' ( (lv_headers_9_0= ruleHeader ) )
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_18); 

            	    				newLeafNode(otherlv_8, grammarAccess.getGetEndPointAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalVizualizer.g:921:4: ( (lv_headers_9_0= ruleHeader ) )
            	    // InternalVizualizer.g:922:5: (lv_headers_9_0= ruleHeader )
            	    {
            	    // InternalVizualizer.g:922:5: (lv_headers_9_0= ruleHeader )
            	    // InternalVizualizer.g:923:6: lv_headers_9_0= ruleHeader
            	    {

            	    						newCompositeNode(grammarAccess.getGetEndPointAccess().getHeadersHeaderParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
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
            	    break loop8;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_10, grammarAccess.getGetEndPointAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_11=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getGetEndPointAccess().getUseSchemaKeyword_10());
            		
            // InternalVizualizer.g:949:3: ( (otherlv_12= RULE_ID ) )
            // InternalVizualizer.g:950:4: (otherlv_12= RULE_ID )
            {
            // InternalVizualizer.g:950:4: (otherlv_12= RULE_ID )
            // InternalVizualizer.g:951:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGetEndPointRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_20); 

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
    // InternalVizualizer.g:970:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalVizualizer.g:970:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalVizualizer.g:971:2: iv_ruleHeader= ruleHeader EOF
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
    // InternalVizualizer.g:977:1: ruleHeader returns [EObject current=null] : ( ( (lv_keyword_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalVizualizer.g:983:2: ( ( ( (lv_keyword_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalVizualizer.g:984:2: ( ( (lv_keyword_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalVizualizer.g:984:2: ( ( (lv_keyword_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalVizualizer.g:985:3: ( (lv_keyword_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalVizualizer.g:985:3: ( (lv_keyword_0_0= RULE_STRING ) )
            // InternalVizualizer.g:986:4: (lv_keyword_0_0= RULE_STRING )
            {
            // InternalVizualizer.g:986:4: (lv_keyword_0_0= RULE_STRING )
            // InternalVizualizer.g:987:5: lv_keyword_0_0= RULE_STRING
            {
            lv_keyword_0_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

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

            otherlv_1=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getHeaderAccess().getColonKeyword_1());
            		
            // InternalVizualizer.g:1007:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalVizualizer.g:1008:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalVizualizer.g:1008:4: (lv_value_2_0= RULE_STRING )
            // InternalVizualizer.g:1009:5: lv_value_2_0= RULE_STRING
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
    // InternalVizualizer.g:1029:1: entryRuleSchemaParser returns [EObject current=null] : iv_ruleSchemaParser= ruleSchemaParser EOF ;
    public final EObject entryRuleSchemaParser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemaParser = null;


        try {
            // InternalVizualizer.g:1029:53: (iv_ruleSchemaParser= ruleSchemaParser EOF )
            // InternalVizualizer.g:1030:2: iv_ruleSchemaParser= ruleSchemaParser EOF
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
    // InternalVizualizer.g:1036:1: ruleSchemaParser returns [EObject current=null] : (otherlv_0= 'Schema' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'SchemaType' otherlv_4= '=' ( (lv_schemaType_5_0= ruleSchemaType ) ) ( (lv_selectors_6_0= ruleSelector ) )+ otherlv_7= '}' ) ;
    public final EObject ruleSchemaParser() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Enumerator lv_schemaType_5_0 = null;

        EObject lv_selectors_6_0 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:1042:2: ( (otherlv_0= 'Schema' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'SchemaType' otherlv_4= '=' ( (lv_schemaType_5_0= ruleSchemaType ) ) ( (lv_selectors_6_0= ruleSelector ) )+ otherlv_7= '}' ) )
            // InternalVizualizer.g:1043:2: (otherlv_0= 'Schema' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'SchemaType' otherlv_4= '=' ( (lv_schemaType_5_0= ruleSchemaType ) ) ( (lv_selectors_6_0= ruleSelector ) )+ otherlv_7= '}' )
            {
            // InternalVizualizer.g:1043:2: (otherlv_0= 'Schema' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'SchemaType' otherlv_4= '=' ( (lv_schemaType_5_0= ruleSchemaType ) ) ( (lv_selectors_6_0= ruleSelector ) )+ otherlv_7= '}' )
            // InternalVizualizer.g:1044:3: otherlv_0= 'Schema' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'SchemaType' otherlv_4= '=' ( (lv_schemaType_5_0= ruleSchemaType ) ) ( (lv_selectors_6_0= ruleSelector ) )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSchemaParserAccess().getSchemaKeyword_0());
            		
            // InternalVizualizer.g:1048:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVizualizer.g:1049:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVizualizer.g:1049:4: (lv_name_1_0= RULE_ID )
            // InternalVizualizer.g:1050:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getSchemaParserAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,33,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getSchemaParserAccess().getSchemaTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,34,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getSchemaParserAccess().getEqualsSignKeyword_4());
            		
            // InternalVizualizer.g:1078:3: ( (lv_schemaType_5_0= ruleSchemaType ) )
            // InternalVizualizer.g:1079:4: (lv_schemaType_5_0= ruleSchemaType )
            {
            // InternalVizualizer.g:1079:4: (lv_schemaType_5_0= ruleSchemaType )
            // InternalVizualizer.g:1080:5: lv_schemaType_5_0= ruleSchemaType
            {

            					newCompositeNode(grammarAccess.getSchemaParserAccess().getSchemaTypeSchemaTypeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_25);
            lv_schemaType_5_0=ruleSchemaType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSchemaParserRule());
            					}
            					set(
            						current,
            						"schemaType",
            						lv_schemaType_5_0,
            						"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.SchemaType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVizualizer.g:1097:3: ( (lv_selectors_6_0= ruleSelector ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==35) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalVizualizer.g:1098:4: (lv_selectors_6_0= ruleSelector )
            	    {
            	    // InternalVizualizer.g:1098:4: (lv_selectors_6_0= ruleSelector )
            	    // InternalVizualizer.g:1099:5: lv_selectors_6_0= ruleSelector
            	    {

            	    					newCompositeNode(grammarAccess.getSchemaParserAccess().getSelectorsSelectorParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_selectors_6_0=ruleSelector();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSchemaParserRule());
            	    					}
            	    					add(
            	    						current,
            	    						"selectors",
            	    						lv_selectors_6_0,
            	    						"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.Selector");
            	    					afterParserOrEnumRuleCall();
            	    				

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

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSchemaParserAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalVizualizer.g:1124:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalVizualizer.g:1124:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalVizualizer.g:1125:2: iv_ruleSelector= ruleSelector EOF
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
    // InternalVizualizer.g:1131:1: ruleSelector returns [EObject current=null] : (otherlv_0= 'Selector as ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_steps_3_0= RULE_STRING ) ) (otherlv_4= ' -> ' ( (lv_steps_5_0= RULE_STRING ) ) )+ otherlv_6= '}' ) ;
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
            // InternalVizualizer.g:1137:2: ( (otherlv_0= 'Selector as ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_steps_3_0= RULE_STRING ) ) (otherlv_4= ' -> ' ( (lv_steps_5_0= RULE_STRING ) ) )+ otherlv_6= '}' ) )
            // InternalVizualizer.g:1138:2: (otherlv_0= 'Selector as ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_steps_3_0= RULE_STRING ) ) (otherlv_4= ' -> ' ( (lv_steps_5_0= RULE_STRING ) ) )+ otherlv_6= '}' )
            {
            // InternalVizualizer.g:1138:2: (otherlv_0= 'Selector as ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_steps_3_0= RULE_STRING ) ) (otherlv_4= ' -> ' ( (lv_steps_5_0= RULE_STRING ) ) )+ otherlv_6= '}' )
            // InternalVizualizer.g:1139:3: otherlv_0= 'Selector as ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_steps_3_0= RULE_STRING ) ) (otherlv_4= ' -> ' ( (lv_steps_5_0= RULE_STRING ) ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectorAccess().getSelectorAsKeyword_0());
            		
            // InternalVizualizer.g:1143:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVizualizer.g:1144:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVizualizer.g:1144:4: (lv_name_1_0= RULE_ID )
            // InternalVizualizer.g:1145:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalVizualizer.g:1165:3: ( (lv_steps_3_0= RULE_STRING ) )
            // InternalVizualizer.g:1166:4: (lv_steps_3_0= RULE_STRING )
            {
            // InternalVizualizer.g:1166:4: (lv_steps_3_0= RULE_STRING )
            // InternalVizualizer.g:1167:5: lv_steps_3_0= RULE_STRING
            {
            lv_steps_3_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

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

            // InternalVizualizer.g:1183:3: (otherlv_4= ' -> ' ( (lv_steps_5_0= RULE_STRING ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==36) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalVizualizer.g:1184:4: otherlv_4= ' -> ' ( (lv_steps_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,36,FOLLOW_18); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSelectorAccess().getSpaceHyphenMinusGreaterThanSignSpaceKeyword_4_0());
            	    			
            	    // InternalVizualizer.g:1188:4: ( (lv_steps_5_0= RULE_STRING ) )
            	    // InternalVizualizer.g:1189:5: (lv_steps_5_0= RULE_STRING )
            	    {
            	    // InternalVizualizer.g:1189:5: (lv_steps_5_0= RULE_STRING )
            	    // InternalVizualizer.g:1190:6: lv_steps_5_0= RULE_STRING
            	    {
            	    lv_steps_5_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
    // InternalVizualizer.g:1215:1: entryRuleFormula returns [EObject current=null] : iv_ruleFormula= ruleFormula EOF ;
    public final EObject entryRuleFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormula = null;


        try {
            // InternalVizualizer.g:1215:48: (iv_ruleFormula= ruleFormula EOF )
            // InternalVizualizer.g:1216:2: iv_ruleFormula= ruleFormula EOF
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
    // InternalVizualizer.g:1222:1: ruleFormula returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= '=' ( (lv_exp_7_0= ruleExpression ) ) ) ;
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
            // InternalVizualizer.g:1228:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= '=' ( (lv_exp_7_0= ruleExpression ) ) ) )
            // InternalVizualizer.g:1229:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= '=' ( (lv_exp_7_0= ruleExpression ) ) )
            {
            // InternalVizualizer.g:1229:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= '=' ( (lv_exp_7_0= ruleExpression ) ) )
            // InternalVizualizer.g:1230:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= '=' ( (lv_exp_7_0= ruleExpression ) )
            {
            // InternalVizualizer.g:1230:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalVizualizer.g:1231:4: (lv_name_0_0= RULE_ID )
            {
            // InternalVizualizer.g:1231:4: (lv_name_0_0= RULE_ID )
            // InternalVizualizer.g:1232:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_29); 

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

            otherlv_1=(Token)match(input,37,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getFormulaAccess().getLeftParenthesisKeyword_1());
            		
            // InternalVizualizer.g:1252:3: ( ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalVizualizer.g:1253:4: ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )*
                    {
                    // InternalVizualizer.g:1253:4: ( (lv_vars_2_0= ruleVariable ) )
                    // InternalVizualizer.g:1254:5: (lv_vars_2_0= ruleVariable )
                    {
                    // InternalVizualizer.g:1254:5: (lv_vars_2_0= ruleVariable )
                    // InternalVizualizer.g:1255:6: lv_vars_2_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getFormulaAccess().getVarsVariableParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_31);
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

                    // InternalVizualizer.g:1272:4: (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==20) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalVizualizer.g:1273:5: otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) )
                    	    {
                    	    otherlv_3=(Token)match(input,20,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFormulaAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalVizualizer.g:1277:5: ( (lv_vars_4_0= ruleVariable ) )
                    	    // InternalVizualizer.g:1278:6: (lv_vars_4_0= ruleVariable )
                    	    {
                    	    // InternalVizualizer.g:1278:6: (lv_vars_4_0= ruleVariable )
                    	    // InternalVizualizer.g:1279:7: lv_vars_4_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getFormulaAccess().getVarsVariableParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
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
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,38,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getFormulaAccess().getRightParenthesisKeyword_3());
            		
            otherlv_6=(Token)match(input,34,FOLLOW_32); 

            			newLeafNode(otherlv_6, grammarAccess.getFormulaAccess().getEqualsSignKeyword_4());
            		
            // InternalVizualizer.g:1306:3: ( (lv_exp_7_0= ruleExpression ) )
            // InternalVizualizer.g:1307:4: (lv_exp_7_0= ruleExpression )
            {
            // InternalVizualizer.g:1307:4: (lv_exp_7_0= ruleExpression )
            // InternalVizualizer.g:1308:5: lv_exp_7_0= ruleExpression
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
    // InternalVizualizer.g:1329:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalVizualizer.g:1329:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalVizualizer.g:1330:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalVizualizer.g:1336:1: ruleExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleFactor ) ) ( ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:1342:2: ( ( ( (lv_left_0_0= ruleFactor ) ) ( ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) ) )? ) )
            // InternalVizualizer.g:1343:2: ( ( (lv_left_0_0= ruleFactor ) ) ( ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) ) )? )
            {
            // InternalVizualizer.g:1343:2: ( ( (lv_left_0_0= ruleFactor ) ) ( ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) ) )? )
            // InternalVizualizer.g:1344:3: ( (lv_left_0_0= ruleFactor ) ) ( ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) ) )?
            {
            // InternalVizualizer.g:1344:3: ( (lv_left_0_0= ruleFactor ) )
            // InternalVizualizer.g:1345:4: (lv_left_0_0= ruleFactor )
            {
            // InternalVizualizer.g:1345:4: (lv_left_0_0= ruleFactor )
            // InternalVizualizer.g:1346:5: lv_left_0_0= ruleFactor
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getLeftFactorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
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

            // InternalVizualizer.g:1363:3: ( ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=39 && LA13_0<=40)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalVizualizer.g:1364:4: ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) )
                    {
                    // InternalVizualizer.g:1364:4: ( (lv_op_1_0= ruleOp1 ) )
                    // InternalVizualizer.g:1365:5: (lv_op_1_0= ruleOp1 )
                    {
                    // InternalVizualizer.g:1365:5: (lv_op_1_0= ruleOp1 )
                    // InternalVizualizer.g:1366:6: lv_op_1_0= ruleOp1
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getOpOp1ParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_32);
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

                    // InternalVizualizer.g:1383:4: ( (lv_right_2_0= ruleExpression ) )
                    // InternalVizualizer.g:1384:5: (lv_right_2_0= ruleExpression )
                    {
                    // InternalVizualizer.g:1384:5: (lv_right_2_0= ruleExpression )
                    // InternalVizualizer.g:1385:6: lv_right_2_0= ruleExpression
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
    // InternalVizualizer.g:1407:1: entryRuleOp1 returns [String current=null] : iv_ruleOp1= ruleOp1 EOF ;
    public final String entryRuleOp1() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOp1 = null;


        try {
            // InternalVizualizer.g:1407:43: (iv_ruleOp1= ruleOp1 EOF )
            // InternalVizualizer.g:1408:2: iv_ruleOp1= ruleOp1 EOF
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
    // InternalVizualizer.g:1414:1: ruleOp1 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOp1() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVizualizer.g:1420:2: ( (kw= '+' | kw= '-' ) )
            // InternalVizualizer.g:1421:2: (kw= '+' | kw= '-' )
            {
            // InternalVizualizer.g:1421:2: (kw= '+' | kw= '-' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==39) ) {
                alt14=1;
            }
            else if ( (LA14_0==40) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalVizualizer.g:1422:3: kw= '+'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOp1Access().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:1428:3: kw= '-'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

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
    // InternalVizualizer.g:1437:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalVizualizer.g:1437:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalVizualizer.g:1438:2: iv_ruleFactor= ruleFactor EOF
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
    // InternalVizualizer.g:1444:1: ruleFactor returns [EObject current=null] : ( ( (lv_left_0_0= rulePrimitive ) ) ( ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) ) )? ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:1450:2: ( ( ( (lv_left_0_0= rulePrimitive ) ) ( ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) ) )? ) )
            // InternalVizualizer.g:1451:2: ( ( (lv_left_0_0= rulePrimitive ) ) ( ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) ) )? )
            {
            // InternalVizualizer.g:1451:2: ( ( (lv_left_0_0= rulePrimitive ) ) ( ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) ) )? )
            // InternalVizualizer.g:1452:3: ( (lv_left_0_0= rulePrimitive ) ) ( ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) ) )?
            {
            // InternalVizualizer.g:1452:3: ( (lv_left_0_0= rulePrimitive ) )
            // InternalVizualizer.g:1453:4: (lv_left_0_0= rulePrimitive )
            {
            // InternalVizualizer.g:1453:4: (lv_left_0_0= rulePrimitive )
            // InternalVizualizer.g:1454:5: lv_left_0_0= rulePrimitive
            {

            					newCompositeNode(grammarAccess.getFactorAccess().getLeftPrimitiveParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_34);
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

            // InternalVizualizer.g:1471:3: ( ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=41 && LA15_0<=42)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalVizualizer.g:1472:4: ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) )
                    {
                    // InternalVizualizer.g:1472:4: ( (lv_op_1_0= ruleOp2 ) )
                    // InternalVizualizer.g:1473:5: (lv_op_1_0= ruleOp2 )
                    {
                    // InternalVizualizer.g:1473:5: (lv_op_1_0= ruleOp2 )
                    // InternalVizualizer.g:1474:6: lv_op_1_0= ruleOp2
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getOpOp2ParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_32);
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

                    // InternalVizualizer.g:1491:4: ( (lv_right_2_0= ruleFactor ) )
                    // InternalVizualizer.g:1492:5: (lv_right_2_0= ruleFactor )
                    {
                    // InternalVizualizer.g:1492:5: (lv_right_2_0= ruleFactor )
                    // InternalVizualizer.g:1493:6: lv_right_2_0= ruleFactor
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
    // InternalVizualizer.g:1515:1: entryRuleOp2 returns [String current=null] : iv_ruleOp2= ruleOp2 EOF ;
    public final String entryRuleOp2() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOp2 = null;


        try {
            // InternalVizualizer.g:1515:43: (iv_ruleOp2= ruleOp2 EOF )
            // InternalVizualizer.g:1516:2: iv_ruleOp2= ruleOp2 EOF
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
    // InternalVizualizer.g:1522:1: ruleOp2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleOp2() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVizualizer.g:1528:2: ( (kw= '*' | kw= '/' ) )
            // InternalVizualizer.g:1529:2: (kw= '*' | kw= '/' )
            {
            // InternalVizualizer.g:1529:2: (kw= '*' | kw= '/' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==41) ) {
                alt16=1;
            }
            else if ( (LA16_0==42) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalVizualizer.g:1530:3: kw= '*'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOp2Access().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:1536:3: kw= '/'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

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
    // InternalVizualizer.g:1545:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalVizualizer.g:1545:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalVizualizer.g:1546:2: iv_rulePrimitive= rulePrimitive EOF
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
    // InternalVizualizer.g:1552:1: rulePrimitive returns [EObject current=null] : (this_Number_0= ruleNumber | this_Variable_1= ruleVariable | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Number_0 = null;

        EObject this_Variable_1 = null;

        EObject this_Expression_3 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:1558:2: ( (this_Number_0= ruleNumber | this_Variable_1= ruleVariable | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) ) )
            // InternalVizualizer.g:1559:2: (this_Number_0= ruleNumber | this_Variable_1= ruleVariable | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) )
            {
            // InternalVizualizer.g:1559:2: (this_Number_0= ruleNumber | this_Variable_1= ruleVariable | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt17=1;
                }
                break;
            case RULE_ID:
                {
                alt17=2;
                }
                break;
            case 37:
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
                    // InternalVizualizer.g:1560:3: this_Number_0= ruleNumber
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
                    // InternalVizualizer.g:1569:3: this_Variable_1= ruleVariable
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
                    // InternalVizualizer.g:1578:3: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    {
                    // InternalVizualizer.g:1578:3: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    // InternalVizualizer.g:1579:4: otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_32); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimitiveAccess().getExpressionParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_35);
                    this_Expression_3=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,38,FOLLOW_2); 

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
    // InternalVizualizer.g:1600:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalVizualizer.g:1600:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalVizualizer.g:1601:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalVizualizer.g:1607:1: ruleNumber returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalVizualizer.g:1613:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalVizualizer.g:1614:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalVizualizer.g:1614:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalVizualizer.g:1615:3: (lv_val_0_0= RULE_INT )
            {
            // InternalVizualizer.g:1615:3: (lv_val_0_0= RULE_INT )
            // InternalVizualizer.g:1616:4: lv_val_0_0= RULE_INT
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
    // InternalVizualizer.g:1635:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalVizualizer.g:1635:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalVizualizer.g:1636:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalVizualizer.g:1642:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalVizualizer.g:1648:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalVizualizer.g:1649:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalVizualizer.g:1649:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalVizualizer.g:1650:3: (lv_name_0_0= RULE_ID )
            {
            // InternalVizualizer.g:1650:3: (lv_name_0_0= RULE_ID )
            // InternalVizualizer.g:1651:4: lv_name_0_0= RULE_ID
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
    // InternalVizualizer.g:1670:1: ruleSchemaType returns [Enumerator current=null] : ( (enumLiteral_0= 'XML' ) | (enumLiteral_1= 'CSV' ) | (enumLiteral_2= 'JSON' ) ) ;
    public final Enumerator ruleSchemaType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalVizualizer.g:1676:2: ( ( (enumLiteral_0= 'XML' ) | (enumLiteral_1= 'CSV' ) | (enumLiteral_2= 'JSON' ) ) )
            // InternalVizualizer.g:1677:2: ( (enumLiteral_0= 'XML' ) | (enumLiteral_1= 'CSV' ) | (enumLiteral_2= 'JSON' ) )
            {
            // InternalVizualizer.g:1677:2: ( (enumLiteral_0= 'XML' ) | (enumLiteral_1= 'CSV' ) | (enumLiteral_2= 'JSON' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt18=1;
                }
                break;
            case 44:
                {
                alt18=2;
                }
                break;
            case 45:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalVizualizer.g:1678:3: (enumLiteral_0= 'XML' )
                    {
                    // InternalVizualizer.g:1678:3: (enumLiteral_0= 'XML' )
                    // InternalVizualizer.g:1679:4: enumLiteral_0= 'XML'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getSchemaTypeAccess().getXMLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSchemaTypeAccess().getXMLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:1686:3: (enumLiteral_1= 'CSV' )
                    {
                    // InternalVizualizer.g:1686:3: (enumLiteral_1= 'CSV' )
                    // InternalVizualizer.g:1687:4: enumLiteral_1= 'CSV'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getSchemaTypeAccess().getCSVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSchemaTypeAccess().getCSVEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVizualizer.g:1694:3: (enumLiteral_2= 'JSON' )
                    {
                    // InternalVizualizer.g:1694:3: (enumLiteral_2= 'JSON' )
                    // InternalVizualizer.g:1695:4: enumLiteral_2= 'JSON'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000148020802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000380000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800002000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000002000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000100000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000050L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});

}