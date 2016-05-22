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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Page'", "'{'", "'}'", "'Link'", "'to'", "'Graph'", "'label='", "'Datasource'", "'Dimensions'", "':'", "','", "'Formula'", "'and'", "'using'", "'['", "']'", "'as'", "'PostPoint'", "'url'", "'use Schema'", "'GetPoint'", "'json'", "'Headers'", "'Schema'", "'SchemaType'", "'='", "'Selector as '", "' -> '", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'XML'", "'CSV'", "'JSON'"
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
    public static final int T__46=46;
    public static final int T__47=47;
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
                case 18:
                case 28:
                case 31:
                    {
                    alt1=2;
                    }
                    break;
                case 34:
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
    // InternalVizualizer.g:312:1: ruleGraph returns [EObject current=null] : (otherlv_0= 'Graph' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'label=' ( (lv_lael_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleGraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_lael_4_0=null;


        	enterRule();

        try {
            // InternalVizualizer.g:318:2: ( (otherlv_0= 'Graph' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'label=' ( (lv_lael_4_0= RULE_STRING ) ) )? ) )
            // InternalVizualizer.g:319:2: (otherlv_0= 'Graph' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'label=' ( (lv_lael_4_0= RULE_STRING ) ) )? )
            {
            // InternalVizualizer.g:319:2: (otherlv_0= 'Graph' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'label=' ( (lv_lael_4_0= RULE_STRING ) ) )? )
            // InternalVizualizer.g:320:3: otherlv_0= 'Graph' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'label=' ( (lv_lael_4_0= RULE_STRING ) ) )?
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
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_2, grammarAccess.getGraphAccess().getSourceDatasourceCrossReference_2_0());
            				

            }


            }

            // InternalVizualizer.g:355:3: (otherlv_3= 'label=' ( (lv_lael_4_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalVizualizer.g:356:4: otherlv_3= 'label=' ( (lv_lael_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getGraphAccess().getLabelKeyword_3_0());
                    			
                    // InternalVizualizer.g:360:4: ( (lv_lael_4_0= RULE_STRING ) )
                    // InternalVizualizer.g:361:5: (lv_lael_4_0= RULE_STRING )
                    {
                    // InternalVizualizer.g:361:5: (lv_lael_4_0= RULE_STRING )
                    // InternalVizualizer.g:362:6: lv_lael_4_0= RULE_STRING
                    {
                    lv_lael_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_lael_4_0, grammarAccess.getGraphAccess().getLaelSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGraphRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"lael",
                    							lv_lael_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

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
    // $ANTLR end "ruleGraph"


    // $ANTLR start "entryRuleDatasource"
    // InternalVizualizer.g:383:1: entryRuleDatasource returns [EObject current=null] : iv_ruleDatasource= ruleDatasource EOF ;
    public final EObject entryRuleDatasource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasource = null;


        try {
            // InternalVizualizer.g:383:51: (iv_ruleDatasource= ruleDatasource EOF )
            // InternalVizualizer.g:384:2: iv_ruleDatasource= ruleDatasource EOF
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
    // InternalVizualizer.g:390:1: ruleDatasource returns [EObject current=null] : (otherlv_0= 'Datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Dimensions' otherlv_4= ':' ( (lv_dimensions_5_0= ruleDimension ) ) (otherlv_6= ',' ( (lv_dimensions_7_0= ruleDimension ) ) )* otherlv_8= '}' ) ;
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
            // InternalVizualizer.g:396:2: ( (otherlv_0= 'Datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Dimensions' otherlv_4= ':' ( (lv_dimensions_5_0= ruleDimension ) ) (otherlv_6= ',' ( (lv_dimensions_7_0= ruleDimension ) ) )* otherlv_8= '}' ) )
            // InternalVizualizer.g:397:2: (otherlv_0= 'Datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Dimensions' otherlv_4= ':' ( (lv_dimensions_5_0= ruleDimension ) ) (otherlv_6= ',' ( (lv_dimensions_7_0= ruleDimension ) ) )* otherlv_8= '}' )
            {
            // InternalVizualizer.g:397:2: (otherlv_0= 'Datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Dimensions' otherlv_4= ':' ( (lv_dimensions_5_0= ruleDimension ) ) (otherlv_6= ',' ( (lv_dimensions_7_0= ruleDimension ) ) )* otherlv_8= '}' )
            // InternalVizualizer.g:398:3: otherlv_0= 'Datasource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Dimensions' otherlv_4= ':' ( (lv_dimensions_5_0= ruleDimension ) ) (otherlv_6= ',' ( (lv_dimensions_7_0= ruleDimension ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDatasourceAccess().getDatasourceKeyword_0());
            		
            // InternalVizualizer.g:402:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVizualizer.g:403:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVizualizer.g:403:4: (lv_name_1_0= RULE_ID )
            // InternalVizualizer.g:404:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDatasourceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getDatasourceAccess().getDimensionsKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getDatasourceAccess().getColonKeyword_4());
            		
            // InternalVizualizer.g:432:3: ( (lv_dimensions_5_0= ruleDimension ) )
            // InternalVizualizer.g:433:4: (lv_dimensions_5_0= ruleDimension )
            {
            // InternalVizualizer.g:433:4: (lv_dimensions_5_0= ruleDimension )
            // InternalVizualizer.g:434:5: lv_dimensions_5_0= ruleDimension
            {

            					newCompositeNode(grammarAccess.getDatasourceAccess().getDimensionsDimensionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalVizualizer.g:451:3: (otherlv_6= ',' ( (lv_dimensions_7_0= ruleDimension ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalVizualizer.g:452:4: otherlv_6= ',' ( (lv_dimensions_7_0= ruleDimension ) )
            	    {
            	    otherlv_6=(Token)match(input,21,FOLLOW_12); 

            	    				newLeafNode(otherlv_6, grammarAccess.getDatasourceAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalVizualizer.g:456:4: ( (lv_dimensions_7_0= ruleDimension ) )
            	    // InternalVizualizer.g:457:5: (lv_dimensions_7_0= ruleDimension )
            	    {
            	    // InternalVizualizer.g:457:5: (lv_dimensions_7_0= ruleDimension )
            	    // InternalVizualizer.g:458:6: lv_dimensions_7_0= ruleDimension
            	    {

            	    						newCompositeNode(grammarAccess.getDatasourceAccess().getDimensionsDimensionParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
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
            	    break loop5;
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
    // InternalVizualizer.g:484:1: entryRuleDimension returns [EObject current=null] : iv_ruleDimension= ruleDimension EOF ;
    public final EObject entryRuleDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimension = null;


        try {
            // InternalVizualizer.g:484:50: (iv_ruleDimension= ruleDimension EOF )
            // InternalVizualizer.g:485:2: iv_ruleDimension= ruleDimension EOF
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
    // InternalVizualizer.g:491:1: ruleDimension returns [EObject current=null] : (otherlv_0= 'Formula' ( (lv_name_1_0= ruleFormula ) ) ( (lv_sourceSelectors_2_0= ruleDimensionSelector ) ) (otherlv_3= 'and' ( (lv_sourceSelectors_4_0= ruleDimensionSelector ) ) )* ) ;
    public final EObject ruleDimension() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_sourceSelectors_2_0 = null;

        EObject lv_sourceSelectors_4_0 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:497:2: ( (otherlv_0= 'Formula' ( (lv_name_1_0= ruleFormula ) ) ( (lv_sourceSelectors_2_0= ruleDimensionSelector ) ) (otherlv_3= 'and' ( (lv_sourceSelectors_4_0= ruleDimensionSelector ) ) )* ) )
            // InternalVizualizer.g:498:2: (otherlv_0= 'Formula' ( (lv_name_1_0= ruleFormula ) ) ( (lv_sourceSelectors_2_0= ruleDimensionSelector ) ) (otherlv_3= 'and' ( (lv_sourceSelectors_4_0= ruleDimensionSelector ) ) )* )
            {
            // InternalVizualizer.g:498:2: (otherlv_0= 'Formula' ( (lv_name_1_0= ruleFormula ) ) ( (lv_sourceSelectors_2_0= ruleDimensionSelector ) ) (otherlv_3= 'and' ( (lv_sourceSelectors_4_0= ruleDimensionSelector ) ) )* )
            // InternalVizualizer.g:499:3: otherlv_0= 'Formula' ( (lv_name_1_0= ruleFormula ) ) ( (lv_sourceSelectors_2_0= ruleDimensionSelector ) ) (otherlv_3= 'and' ( (lv_sourceSelectors_4_0= ruleDimensionSelector ) ) )*
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDimensionAccess().getFormulaKeyword_0());
            		
            // InternalVizualizer.g:503:3: ( (lv_name_1_0= ruleFormula ) )
            // InternalVizualizer.g:504:4: (lv_name_1_0= ruleFormula )
            {
            // InternalVizualizer.g:504:4: (lv_name_1_0= ruleFormula )
            // InternalVizualizer.g:505:5: lv_name_1_0= ruleFormula
            {

            					newCompositeNode(grammarAccess.getDimensionAccess().getNameFormulaParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalVizualizer.g:522:3: ( (lv_sourceSelectors_2_0= ruleDimensionSelector ) )
            // InternalVizualizer.g:523:4: (lv_sourceSelectors_2_0= ruleDimensionSelector )
            {
            // InternalVizualizer.g:523:4: (lv_sourceSelectors_2_0= ruleDimensionSelector )
            // InternalVizualizer.g:524:5: lv_sourceSelectors_2_0= ruleDimensionSelector
            {

            					newCompositeNode(grammarAccess.getDimensionAccess().getSourceSelectorsDimensionSelectorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
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

            // InternalVizualizer.g:541:3: (otherlv_3= 'and' ( (lv_sourceSelectors_4_0= ruleDimensionSelector ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalVizualizer.g:542:4: otherlv_3= 'and' ( (lv_sourceSelectors_4_0= ruleDimensionSelector ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_14); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDimensionAccess().getAndKeyword_3_0());
            	    			
            	    // InternalVizualizer.g:546:4: ( (lv_sourceSelectors_4_0= ruleDimensionSelector ) )
            	    // InternalVizualizer.g:547:5: (lv_sourceSelectors_4_0= ruleDimensionSelector )
            	    {
            	    // InternalVizualizer.g:547:5: (lv_sourceSelectors_4_0= ruleDimensionSelector )
            	    // InternalVizualizer.g:548:6: lv_sourceSelectors_4_0= ruleDimensionSelector
            	    {

            	    						newCompositeNode(grammarAccess.getDimensionAccess().getSourceSelectorsDimensionSelectorParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
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
            	    break loop6;
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
    // InternalVizualizer.g:570:1: entryRuleDimensionSelector returns [EObject current=null] : iv_ruleDimensionSelector= ruleDimensionSelector EOF ;
    public final EObject entryRuleDimensionSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimensionSelector = null;


        try {
            // InternalVizualizer.g:570:58: (iv_ruleDimensionSelector= ruleDimensionSelector EOF )
            // InternalVizualizer.g:571:2: iv_ruleDimensionSelector= ruleDimensionSelector EOF
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
    // InternalVizualizer.g:577:1: ruleDimensionSelector returns [EObject current=null] : (otherlv_0= 'using' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_selectVar_3_0= ruleNoQuotesString ) ) otherlv_4= ']' otherlv_5= 'as' ( (lv_name_6_0= RULE_ID ) ) ) ;
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
            // InternalVizualizer.g:583:2: ( (otherlv_0= 'using' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_selectVar_3_0= ruleNoQuotesString ) ) otherlv_4= ']' otherlv_5= 'as' ( (lv_name_6_0= RULE_ID ) ) ) )
            // InternalVizualizer.g:584:2: (otherlv_0= 'using' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_selectVar_3_0= ruleNoQuotesString ) ) otherlv_4= ']' otherlv_5= 'as' ( (lv_name_6_0= RULE_ID ) ) )
            {
            // InternalVizualizer.g:584:2: (otherlv_0= 'using' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_selectVar_3_0= ruleNoQuotesString ) ) otherlv_4= ']' otherlv_5= 'as' ( (lv_name_6_0= RULE_ID ) ) )
            // InternalVizualizer.g:585:3: otherlv_0= 'using' ( (otherlv_1= RULE_ID ) ) otherlv_2= '[' ( (lv_selectVar_3_0= ruleNoQuotesString ) ) otherlv_4= ']' otherlv_5= 'as' ( (lv_name_6_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDimensionSelectorAccess().getUsingKeyword_0());
            		
            // InternalVizualizer.g:589:3: ( (otherlv_1= RULE_ID ) )
            // InternalVizualizer.g:590:4: (otherlv_1= RULE_ID )
            {
            // InternalVizualizer.g:590:4: (otherlv_1= RULE_ID )
            // InternalVizualizer.g:591:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDimensionSelectorRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_1, grammarAccess.getDimensionSelectorAccess().getSourceSourceCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDimensionSelectorAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalVizualizer.g:606:3: ( (lv_selectVar_3_0= ruleNoQuotesString ) )
            // InternalVizualizer.g:607:4: (lv_selectVar_3_0= ruleNoQuotesString )
            {
            // InternalVizualizer.g:607:4: (lv_selectVar_3_0= ruleNoQuotesString )
            // InternalVizualizer.g:608:5: lv_selectVar_3_0= ruleNoQuotesString
            {

            					newCompositeNode(grammarAccess.getDimensionSelectorAccess().getSelectVarNoQuotesStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_4=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getDimensionSelectorAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getDimensionSelectorAccess().getAsKeyword_5());
            		
            // InternalVizualizer.g:633:3: ( (lv_name_6_0= RULE_ID ) )
            // InternalVizualizer.g:634:4: (lv_name_6_0= RULE_ID )
            {
            // InternalVizualizer.g:634:4: (lv_name_6_0= RULE_ID )
            // InternalVizualizer.g:635:5: lv_name_6_0= RULE_ID
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
    // InternalVizualizer.g:655:1: entryRuleNoQuotesString returns [EObject current=null] : iv_ruleNoQuotesString= ruleNoQuotesString EOF ;
    public final EObject entryRuleNoQuotesString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoQuotesString = null;


        try {
            // InternalVizualizer.g:655:55: (iv_ruleNoQuotesString= ruleNoQuotesString EOF )
            // InternalVizualizer.g:656:2: iv_ruleNoQuotesString= ruleNoQuotesString EOF
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
    // InternalVizualizer.g:662:1: ruleNoQuotesString returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleNoQuotesString() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalVizualizer.g:668:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalVizualizer.g:669:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalVizualizer.g:669:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalVizualizer.g:670:3: (lv_name_0_0= RULE_ID )
            {
            // InternalVizualizer.g:670:3: (lv_name_0_0= RULE_ID )
            // InternalVizualizer.g:671:4: lv_name_0_0= RULE_ID
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
    // InternalVizualizer.g:690:1: entryRuleSource returns [EObject current=null] : iv_ruleSource= ruleSource EOF ;
    public final EObject entryRuleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource = null;


        try {
            // InternalVizualizer.g:690:47: (iv_ruleSource= ruleSource EOF )
            // InternalVizualizer.g:691:2: iv_ruleSource= ruleSource EOF
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
    // InternalVizualizer.g:697:1: ruleSource returns [EObject current=null] : (this_EndPoint_0= ruleEndPoint | this_Datasource_1= ruleDatasource ) ;
    public final EObject ruleSource() throws RecognitionException {
        EObject current = null;

        EObject this_EndPoint_0 = null;

        EObject this_Datasource_1 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:703:2: ( (this_EndPoint_0= ruleEndPoint | this_Datasource_1= ruleDatasource ) )
            // InternalVizualizer.g:704:2: (this_EndPoint_0= ruleEndPoint | this_Datasource_1= ruleDatasource )
            {
            // InternalVizualizer.g:704:2: (this_EndPoint_0= ruleEndPoint | this_Datasource_1= ruleDatasource )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28||LA7_0==31) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalVizualizer.g:705:3: this_EndPoint_0= ruleEndPoint
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
                    // InternalVizualizer.g:714:3: this_Datasource_1= ruleDatasource
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
    // InternalVizualizer.g:726:1: entryRuleEndPoint returns [EObject current=null] : iv_ruleEndPoint= ruleEndPoint EOF ;
    public final EObject entryRuleEndPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndPoint = null;


        try {
            // InternalVizualizer.g:726:49: (iv_ruleEndPoint= ruleEndPoint EOF )
            // InternalVizualizer.g:727:2: iv_ruleEndPoint= ruleEndPoint EOF
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
    // InternalVizualizer.g:733:1: ruleEndPoint returns [EObject current=null] : (this_GetEndPoint_0= ruleGetEndPoint | this_PostEndPoint_1= rulePostEndPoint ) ;
    public final EObject ruleEndPoint() throws RecognitionException {
        EObject current = null;

        EObject this_GetEndPoint_0 = null;

        EObject this_PostEndPoint_1 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:739:2: ( (this_GetEndPoint_0= ruleGetEndPoint | this_PostEndPoint_1= rulePostEndPoint ) )
            // InternalVizualizer.g:740:2: (this_GetEndPoint_0= ruleGetEndPoint | this_PostEndPoint_1= rulePostEndPoint )
            {
            // InternalVizualizer.g:740:2: (this_GetEndPoint_0= ruleGetEndPoint | this_PostEndPoint_1= rulePostEndPoint )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            else if ( (LA8_0==28) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalVizualizer.g:741:3: this_GetEndPoint_0= ruleGetEndPoint
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
                    // InternalVizualizer.g:750:3: this_PostEndPoint_1= rulePostEndPoint
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
    // InternalVizualizer.g:762:1: entryRulePostEndPoint returns [EObject current=null] : iv_rulePostEndPoint= rulePostEndPoint EOF ;
    public final EObject entryRulePostEndPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostEndPoint = null;


        try {
            // InternalVizualizer.g:762:53: (iv_rulePostEndPoint= rulePostEndPoint EOF )
            // InternalVizualizer.g:763:2: iv_rulePostEndPoint= rulePostEndPoint EOF
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
    // InternalVizualizer.g:769:1: rulePostEndPoint returns [EObject current=null] : (otherlv_0= 'PostPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= 'use Schema' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' ) ;
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
            // InternalVizualizer.g:775:2: ( (otherlv_0= 'PostPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= 'use Schema' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' ) )
            // InternalVizualizer.g:776:2: (otherlv_0= 'PostPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= 'use Schema' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' )
            {
            // InternalVizualizer.g:776:2: (otherlv_0= 'PostPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= 'use Schema' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}' )
            // InternalVizualizer.g:777:3: otherlv_0= 'PostPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) otherlv_5= 'use Schema' ( (otherlv_6= RULE_ID ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPostEndPointAccess().getPostPointKeyword_0());
            		
            // InternalVizualizer.g:781:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVizualizer.g:782:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVizualizer.g:782:4: (lv_name_1_0= RULE_ID )
            // InternalVizualizer.g:783:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getPostEndPointAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getPostEndPointAccess().getUrlKeyword_3());
            		
            // InternalVizualizer.g:807:3: ( (lv_url_4_0= RULE_STRING ) )
            // InternalVizualizer.g:808:4: (lv_url_4_0= RULE_STRING )
            {
            // InternalVizualizer.g:808:4: (lv_url_4_0= RULE_STRING )
            // InternalVizualizer.g:809:5: lv_url_4_0= RULE_STRING
            {
            lv_url_4_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

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

            otherlv_5=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getPostEndPointAccess().getUseSchemaKeyword_5());
            		
            // InternalVizualizer.g:829:3: ( (otherlv_6= RULE_ID ) )
            // InternalVizualizer.g:830:4: (otherlv_6= RULE_ID )
            {
            // InternalVizualizer.g:830:4: (otherlv_6= RULE_ID )
            // InternalVizualizer.g:831:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPostEndPointRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_21); 

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
    // InternalVizualizer.g:850:1: entryRuleGetEndPoint returns [EObject current=null] : iv_ruleGetEndPoint= ruleGetEndPoint EOF ;
    public final EObject entryRuleGetEndPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetEndPoint = null;


        try {
            // InternalVizualizer.g:850:52: (iv_ruleGetEndPoint= ruleGetEndPoint EOF )
            // InternalVizualizer.g:851:2: iv_ruleGetEndPoint= ruleGetEndPoint EOF
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
    // InternalVizualizer.g:857:1: ruleGetEndPoint returns [EObject current=null] : (otherlv_0= 'GetPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) (otherlv_5= 'json' ( (lv_json_6_0= RULE_STRING ) ) )? otherlv_7= 'Headers' otherlv_8= '{' ( (lv_headers_9_0= ruleHeader ) ) (otherlv_10= ',' ( (lv_headers_11_0= ruleHeader ) ) )* otherlv_12= '}' otherlv_13= 'use Schema' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}' ) ;
    public final EObject ruleGetEndPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_url_4_0=null;
        Token otherlv_5=null;
        Token lv_json_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_headers_9_0 = null;

        EObject lv_headers_11_0 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:863:2: ( (otherlv_0= 'GetPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) (otherlv_5= 'json' ( (lv_json_6_0= RULE_STRING ) ) )? otherlv_7= 'Headers' otherlv_8= '{' ( (lv_headers_9_0= ruleHeader ) ) (otherlv_10= ',' ( (lv_headers_11_0= ruleHeader ) ) )* otherlv_12= '}' otherlv_13= 'use Schema' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}' ) )
            // InternalVizualizer.g:864:2: (otherlv_0= 'GetPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) (otherlv_5= 'json' ( (lv_json_6_0= RULE_STRING ) ) )? otherlv_7= 'Headers' otherlv_8= '{' ( (lv_headers_9_0= ruleHeader ) ) (otherlv_10= ',' ( (lv_headers_11_0= ruleHeader ) ) )* otherlv_12= '}' otherlv_13= 'use Schema' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}' )
            {
            // InternalVizualizer.g:864:2: (otherlv_0= 'GetPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) (otherlv_5= 'json' ( (lv_json_6_0= RULE_STRING ) ) )? otherlv_7= 'Headers' otherlv_8= '{' ( (lv_headers_9_0= ruleHeader ) ) (otherlv_10= ',' ( (lv_headers_11_0= ruleHeader ) ) )* otherlv_12= '}' otherlv_13= 'use Schema' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}' )
            // InternalVizualizer.g:865:3: otherlv_0= 'GetPoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'url' ( (lv_url_4_0= RULE_STRING ) ) (otherlv_5= 'json' ( (lv_json_6_0= RULE_STRING ) ) )? otherlv_7= 'Headers' otherlv_8= '{' ( (lv_headers_9_0= ruleHeader ) ) (otherlv_10= ',' ( (lv_headers_11_0= ruleHeader ) ) )* otherlv_12= '}' otherlv_13= 'use Schema' ( (otherlv_14= RULE_ID ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGetEndPointAccess().getGetPointKeyword_0());
            		
            // InternalVizualizer.g:869:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVizualizer.g:870:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVizualizer.g:870:4: (lv_name_1_0= RULE_ID )
            // InternalVizualizer.g:871:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getGetEndPointAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getGetEndPointAccess().getUrlKeyword_3());
            		
            // InternalVizualizer.g:895:3: ( (lv_url_4_0= RULE_STRING ) )
            // InternalVizualizer.g:896:4: (lv_url_4_0= RULE_STRING )
            {
            // InternalVizualizer.g:896:4: (lv_url_4_0= RULE_STRING )
            // InternalVizualizer.g:897:5: lv_url_4_0= RULE_STRING
            {
            lv_url_4_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

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

            // InternalVizualizer.g:913:3: (otherlv_5= 'json' ( (lv_json_6_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalVizualizer.g:914:4: otherlv_5= 'json' ( (lv_json_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getGetEndPointAccess().getJsonKeyword_5_0());
                    			
                    // InternalVizualizer.g:918:4: ( (lv_json_6_0= RULE_STRING ) )
                    // InternalVizualizer.g:919:5: (lv_json_6_0= RULE_STRING )
                    {
                    // InternalVizualizer.g:919:5: (lv_json_6_0= RULE_STRING )
                    // InternalVizualizer.g:920:6: lv_json_6_0= RULE_STRING
                    {
                    lv_json_6_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

                    						newLeafNode(lv_json_6_0, grammarAccess.getGetEndPointAccess().getJsonSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGetEndPointRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"json",
                    							lv_json_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getGetEndPointAccess().getHeadersKeyword_6());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getGetEndPointAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalVizualizer.g:945:3: ( (lv_headers_9_0= ruleHeader ) )
            // InternalVizualizer.g:946:4: (lv_headers_9_0= ruleHeader )
            {
            // InternalVizualizer.g:946:4: (lv_headers_9_0= ruleHeader )
            // InternalVizualizer.g:947:5: lv_headers_9_0= ruleHeader
            {

            					newCompositeNode(grammarAccess.getGetEndPointAccess().getHeadersHeaderParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalVizualizer.g:964:3: (otherlv_10= ',' ( (lv_headers_11_0= ruleHeader ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalVizualizer.g:965:4: otherlv_10= ',' ( (lv_headers_11_0= ruleHeader ) )
            	    {
            	    otherlv_10=(Token)match(input,21,FOLLOW_9); 

            	    				newLeafNode(otherlv_10, grammarAccess.getGetEndPointAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalVizualizer.g:969:4: ( (lv_headers_11_0= ruleHeader ) )
            	    // InternalVizualizer.g:970:5: (lv_headers_11_0= ruleHeader )
            	    {
            	    // InternalVizualizer.g:970:5: (lv_headers_11_0= ruleHeader )
            	    // InternalVizualizer.g:971:6: lv_headers_11_0= ruleHeader
            	    {

            	    						newCompositeNode(grammarAccess.getGetEndPointAccess().getHeadersHeaderParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_headers_11_0=ruleHeader();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGetEndPointRule());
            	    						}
            	    						add(
            	    							current,
            	    							"headers",
            	    							lv_headers_11_0,
            	    							"org.xtext.sdu.iotvizualizerlanguage.Vizualizer.Header");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_12=(Token)match(input,13,FOLLOW_20); 

            			newLeafNode(otherlv_12, grammarAccess.getGetEndPointAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_13=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getGetEndPointAccess().getUseSchemaKeyword_11());
            		
            // InternalVizualizer.g:997:3: ( (otherlv_14= RULE_ID ) )
            // InternalVizualizer.g:998:4: (otherlv_14= RULE_ID )
            {
            // InternalVizualizer.g:998:4: (otherlv_14= RULE_ID )
            // InternalVizualizer.g:999:5: otherlv_14= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGetEndPointRule());
            					}
            				
            otherlv_14=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_14, grammarAccess.getGetEndPointAccess().getParserSchemaParserCrossReference_12_0());
            				

            }


            }

            otherlv_15=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getGetEndPointAccess().getRightCurlyBracketKeyword_13());
            		

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
    // InternalVizualizer.g:1018:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalVizualizer.g:1018:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalVizualizer.g:1019:2: iv_ruleHeader= ruleHeader EOF
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
    // InternalVizualizer.g:1025:1: ruleHeader returns [EObject current=null] : ( ( (lv_keyword_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalVizualizer.g:1031:2: ( ( ( (lv_keyword_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalVizualizer.g:1032:2: ( ( (lv_keyword_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalVizualizer.g:1032:2: ( ( (lv_keyword_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalVizualizer.g:1033:3: ( (lv_keyword_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalVizualizer.g:1033:3: ( (lv_keyword_0_0= RULE_STRING ) )
            // InternalVizualizer.g:1034:4: (lv_keyword_0_0= RULE_STRING )
            {
            // InternalVizualizer.g:1034:4: (lv_keyword_0_0= RULE_STRING )
            // InternalVizualizer.g:1035:5: lv_keyword_0_0= RULE_STRING
            {
            lv_keyword_0_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

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

            otherlv_1=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getHeaderAccess().getColonKeyword_1());
            		
            // InternalVizualizer.g:1055:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalVizualizer.g:1056:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalVizualizer.g:1056:4: (lv_value_2_0= RULE_STRING )
            // InternalVizualizer.g:1057:5: lv_value_2_0= RULE_STRING
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
    // InternalVizualizer.g:1077:1: entryRuleSchemaParser returns [EObject current=null] : iv_ruleSchemaParser= ruleSchemaParser EOF ;
    public final EObject entryRuleSchemaParser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemaParser = null;


        try {
            // InternalVizualizer.g:1077:53: (iv_ruleSchemaParser= ruleSchemaParser EOF )
            // InternalVizualizer.g:1078:2: iv_ruleSchemaParser= ruleSchemaParser EOF
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
    // InternalVizualizer.g:1084:1: ruleSchemaParser returns [EObject current=null] : (otherlv_0= 'Schema' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'SchemaType' otherlv_4= '=' ( (lv_schemaType_5_0= ruleSchemaType ) ) ( (lv_selectors_6_0= ruleSelector ) )+ otherlv_7= '}' ) ;
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
            // InternalVizualizer.g:1090:2: ( (otherlv_0= 'Schema' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'SchemaType' otherlv_4= '=' ( (lv_schemaType_5_0= ruleSchemaType ) ) ( (lv_selectors_6_0= ruleSelector ) )+ otherlv_7= '}' ) )
            // InternalVizualizer.g:1091:2: (otherlv_0= 'Schema' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'SchemaType' otherlv_4= '=' ( (lv_schemaType_5_0= ruleSchemaType ) ) ( (lv_selectors_6_0= ruleSelector ) )+ otherlv_7= '}' )
            {
            // InternalVizualizer.g:1091:2: (otherlv_0= 'Schema' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'SchemaType' otherlv_4= '=' ( (lv_schemaType_5_0= ruleSchemaType ) ) ( (lv_selectors_6_0= ruleSelector ) )+ otherlv_7= '}' )
            // InternalVizualizer.g:1092:3: otherlv_0= 'Schema' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'SchemaType' otherlv_4= '=' ( (lv_schemaType_5_0= ruleSchemaType ) ) ( (lv_selectors_6_0= ruleSelector ) )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSchemaParserAccess().getSchemaKeyword_0());
            		
            // InternalVizualizer.g:1096:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVizualizer.g:1097:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVizualizer.g:1097:4: (lv_name_1_0= RULE_ID )
            // InternalVizualizer.g:1098:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getSchemaParserAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getSchemaParserAccess().getSchemaTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,36,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getSchemaParserAccess().getEqualsSignKeyword_4());
            		
            // InternalVizualizer.g:1126:3: ( (lv_schemaType_5_0= ruleSchemaType ) )
            // InternalVizualizer.g:1127:4: (lv_schemaType_5_0= ruleSchemaType )
            {
            // InternalVizualizer.g:1127:4: (lv_schemaType_5_0= ruleSchemaType )
            // InternalVizualizer.g:1128:5: lv_schemaType_5_0= ruleSchemaType
            {

            					newCompositeNode(grammarAccess.getSchemaParserAccess().getSchemaTypeSchemaTypeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalVizualizer.g:1145:3: ( (lv_selectors_6_0= ruleSelector ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==37) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalVizualizer.g:1146:4: (lv_selectors_6_0= ruleSelector )
            	    {
            	    // InternalVizualizer.g:1146:4: (lv_selectors_6_0= ruleSelector )
            	    // InternalVizualizer.g:1147:5: lv_selectors_6_0= ruleSelector
            	    {

            	    					newCompositeNode(grammarAccess.getSchemaParserAccess().getSelectorsSelectorParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_28);
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
    // InternalVizualizer.g:1172:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalVizualizer.g:1172:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalVizualizer.g:1173:2: iv_ruleSelector= ruleSelector EOF
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
    // InternalVizualizer.g:1179:1: ruleSelector returns [EObject current=null] : (otherlv_0= 'Selector as ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_steps_3_0= RULE_STRING ) ) (otherlv_4= ' -> ' ( (lv_steps_5_0= RULE_STRING ) ) )+ otherlv_6= '}' ) ;
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
            // InternalVizualizer.g:1185:2: ( (otherlv_0= 'Selector as ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_steps_3_0= RULE_STRING ) ) (otherlv_4= ' -> ' ( (lv_steps_5_0= RULE_STRING ) ) )+ otherlv_6= '}' ) )
            // InternalVizualizer.g:1186:2: (otherlv_0= 'Selector as ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_steps_3_0= RULE_STRING ) ) (otherlv_4= ' -> ' ( (lv_steps_5_0= RULE_STRING ) ) )+ otherlv_6= '}' )
            {
            // InternalVizualizer.g:1186:2: (otherlv_0= 'Selector as ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_steps_3_0= RULE_STRING ) ) (otherlv_4= ' -> ' ( (lv_steps_5_0= RULE_STRING ) ) )+ otherlv_6= '}' )
            // InternalVizualizer.g:1187:3: otherlv_0= 'Selector as ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_steps_3_0= RULE_STRING ) ) (otherlv_4= ' -> ' ( (lv_steps_5_0= RULE_STRING ) ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectorAccess().getSelectorAsKeyword_0());
            		
            // InternalVizualizer.g:1191:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVizualizer.g:1192:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVizualizer.g:1192:4: (lv_name_1_0= RULE_ID )
            // InternalVizualizer.g:1193:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalVizualizer.g:1213:3: ( (lv_steps_3_0= RULE_STRING ) )
            // InternalVizualizer.g:1214:4: (lv_steps_3_0= RULE_STRING )
            {
            // InternalVizualizer.g:1214:4: (lv_steps_3_0= RULE_STRING )
            // InternalVizualizer.g:1215:5: lv_steps_3_0= RULE_STRING
            {
            lv_steps_3_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

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

            // InternalVizualizer.g:1231:3: (otherlv_4= ' -> ' ( (lv_steps_5_0= RULE_STRING ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==38) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalVizualizer.g:1232:4: otherlv_4= ' -> ' ( (lv_steps_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,38,FOLLOW_9); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSelectorAccess().getSpaceHyphenMinusGreaterThanSignSpaceKeyword_4_0());
            	    			
            	    // InternalVizualizer.g:1236:4: ( (lv_steps_5_0= RULE_STRING ) )
            	    // InternalVizualizer.g:1237:5: (lv_steps_5_0= RULE_STRING )
            	    {
            	    // InternalVizualizer.g:1237:5: (lv_steps_5_0= RULE_STRING )
            	    // InternalVizualizer.g:1238:6: lv_steps_5_0= RULE_STRING
            	    {
            	    lv_steps_5_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // InternalVizualizer.g:1263:1: entryRuleFormula returns [EObject current=null] : iv_ruleFormula= ruleFormula EOF ;
    public final EObject entryRuleFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormula = null;


        try {
            // InternalVizualizer.g:1263:48: (iv_ruleFormula= ruleFormula EOF )
            // InternalVizualizer.g:1264:2: iv_ruleFormula= ruleFormula EOF
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
    // InternalVizualizer.g:1270:1: ruleFormula returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= '=' ( (lv_exp_7_0= ruleExpression ) ) ) ;
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
            // InternalVizualizer.g:1276:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= '=' ( (lv_exp_7_0= ruleExpression ) ) ) )
            // InternalVizualizer.g:1277:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= '=' ( (lv_exp_7_0= ruleExpression ) ) )
            {
            // InternalVizualizer.g:1277:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= '=' ( (lv_exp_7_0= ruleExpression ) ) )
            // InternalVizualizer.g:1278:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= '=' ( (lv_exp_7_0= ruleExpression ) )
            {
            // InternalVizualizer.g:1278:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalVizualizer.g:1279:4: (lv_name_0_0= RULE_ID )
            {
            // InternalVizualizer.g:1279:4: (lv_name_0_0= RULE_ID )
            // InternalVizualizer.g:1280:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_31); 

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

            otherlv_1=(Token)match(input,39,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getFormulaAccess().getLeftParenthesisKeyword_1());
            		
            // InternalVizualizer.g:1300:3: ( ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalVizualizer.g:1301:4: ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )*
                    {
                    // InternalVizualizer.g:1301:4: ( (lv_vars_2_0= ruleVariable ) )
                    // InternalVizualizer.g:1302:5: (lv_vars_2_0= ruleVariable )
                    {
                    // InternalVizualizer.g:1302:5: (lv_vars_2_0= ruleVariable )
                    // InternalVizualizer.g:1303:6: lv_vars_2_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getFormulaAccess().getVarsVariableParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_33);
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

                    // InternalVizualizer.g:1320:4: (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==21) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalVizualizer.g:1321:5: otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFormulaAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalVizualizer.g:1325:5: ( (lv_vars_4_0= ruleVariable ) )
                    	    // InternalVizualizer.g:1326:6: (lv_vars_4_0= ruleVariable )
                    	    {
                    	    // InternalVizualizer.g:1326:6: (lv_vars_4_0= ruleVariable )
                    	    // InternalVizualizer.g:1327:7: lv_vars_4_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getFormulaAccess().getVarsVariableParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
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
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,40,FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getFormulaAccess().getRightParenthesisKeyword_3());
            		
            otherlv_6=(Token)match(input,36,FOLLOW_34); 

            			newLeafNode(otherlv_6, grammarAccess.getFormulaAccess().getEqualsSignKeyword_4());
            		
            // InternalVizualizer.g:1354:3: ( (lv_exp_7_0= ruleExpression ) )
            // InternalVizualizer.g:1355:4: (lv_exp_7_0= ruleExpression )
            {
            // InternalVizualizer.g:1355:4: (lv_exp_7_0= ruleExpression )
            // InternalVizualizer.g:1356:5: lv_exp_7_0= ruleExpression
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
    // InternalVizualizer.g:1377:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalVizualizer.g:1377:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalVizualizer.g:1378:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalVizualizer.g:1384:1: ruleExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleFactor ) ) ( ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:1390:2: ( ( ( (lv_left_0_0= ruleFactor ) ) ( ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) ) )? ) )
            // InternalVizualizer.g:1391:2: ( ( (lv_left_0_0= ruleFactor ) ) ( ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) ) )? )
            {
            // InternalVizualizer.g:1391:2: ( ( (lv_left_0_0= ruleFactor ) ) ( ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) ) )? )
            // InternalVizualizer.g:1392:3: ( (lv_left_0_0= ruleFactor ) ) ( ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) ) )?
            {
            // InternalVizualizer.g:1392:3: ( (lv_left_0_0= ruleFactor ) )
            // InternalVizualizer.g:1393:4: (lv_left_0_0= ruleFactor )
            {
            // InternalVizualizer.g:1393:4: (lv_left_0_0= ruleFactor )
            // InternalVizualizer.g:1394:5: lv_left_0_0= ruleFactor
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getLeftFactorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_35);
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

            // InternalVizualizer.g:1411:3: ( ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=41 && LA15_0<=42)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalVizualizer.g:1412:4: ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) )
                    {
                    // InternalVizualizer.g:1412:4: ( (lv_op_1_0= ruleOp1 ) )
                    // InternalVizualizer.g:1413:5: (lv_op_1_0= ruleOp1 )
                    {
                    // InternalVizualizer.g:1413:5: (lv_op_1_0= ruleOp1 )
                    // InternalVizualizer.g:1414:6: lv_op_1_0= ruleOp1
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getOpOp1ParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_34);
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

                    // InternalVizualizer.g:1431:4: ( (lv_right_2_0= ruleExpression ) )
                    // InternalVizualizer.g:1432:5: (lv_right_2_0= ruleExpression )
                    {
                    // InternalVizualizer.g:1432:5: (lv_right_2_0= ruleExpression )
                    // InternalVizualizer.g:1433:6: lv_right_2_0= ruleExpression
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
    // InternalVizualizer.g:1455:1: entryRuleOp1 returns [String current=null] : iv_ruleOp1= ruleOp1 EOF ;
    public final String entryRuleOp1() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOp1 = null;


        try {
            // InternalVizualizer.g:1455:43: (iv_ruleOp1= ruleOp1 EOF )
            // InternalVizualizer.g:1456:2: iv_ruleOp1= ruleOp1 EOF
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
    // InternalVizualizer.g:1462:1: ruleOp1 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOp1() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVizualizer.g:1468:2: ( (kw= '+' | kw= '-' ) )
            // InternalVizualizer.g:1469:2: (kw= '+' | kw= '-' )
            {
            // InternalVizualizer.g:1469:2: (kw= '+' | kw= '-' )
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
                    // InternalVizualizer.g:1470:3: kw= '+'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOp1Access().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:1476:3: kw= '-'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

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
    // InternalVizualizer.g:1485:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalVizualizer.g:1485:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalVizualizer.g:1486:2: iv_ruleFactor= ruleFactor EOF
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
    // InternalVizualizer.g:1492:1: ruleFactor returns [EObject current=null] : ( ( (lv_left_0_0= rulePrimitive ) ) ( ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) ) )? ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:1498:2: ( ( ( (lv_left_0_0= rulePrimitive ) ) ( ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) ) )? ) )
            // InternalVizualizer.g:1499:2: ( ( (lv_left_0_0= rulePrimitive ) ) ( ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) ) )? )
            {
            // InternalVizualizer.g:1499:2: ( ( (lv_left_0_0= rulePrimitive ) ) ( ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) ) )? )
            // InternalVizualizer.g:1500:3: ( (lv_left_0_0= rulePrimitive ) ) ( ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) ) )?
            {
            // InternalVizualizer.g:1500:3: ( (lv_left_0_0= rulePrimitive ) )
            // InternalVizualizer.g:1501:4: (lv_left_0_0= rulePrimitive )
            {
            // InternalVizualizer.g:1501:4: (lv_left_0_0= rulePrimitive )
            // InternalVizualizer.g:1502:5: lv_left_0_0= rulePrimitive
            {

            					newCompositeNode(grammarAccess.getFactorAccess().getLeftPrimitiveParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
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

            // InternalVizualizer.g:1519:3: ( ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=43 && LA17_0<=44)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalVizualizer.g:1520:4: ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) )
                    {
                    // InternalVizualizer.g:1520:4: ( (lv_op_1_0= ruleOp2 ) )
                    // InternalVizualizer.g:1521:5: (lv_op_1_0= ruleOp2 )
                    {
                    // InternalVizualizer.g:1521:5: (lv_op_1_0= ruleOp2 )
                    // InternalVizualizer.g:1522:6: lv_op_1_0= ruleOp2
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getOpOp2ParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_34);
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

                    // InternalVizualizer.g:1539:4: ( (lv_right_2_0= ruleFactor ) )
                    // InternalVizualizer.g:1540:5: (lv_right_2_0= ruleFactor )
                    {
                    // InternalVizualizer.g:1540:5: (lv_right_2_0= ruleFactor )
                    // InternalVizualizer.g:1541:6: lv_right_2_0= ruleFactor
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
    // InternalVizualizer.g:1563:1: entryRuleOp2 returns [String current=null] : iv_ruleOp2= ruleOp2 EOF ;
    public final String entryRuleOp2() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOp2 = null;


        try {
            // InternalVizualizer.g:1563:43: (iv_ruleOp2= ruleOp2 EOF )
            // InternalVizualizer.g:1564:2: iv_ruleOp2= ruleOp2 EOF
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
    // InternalVizualizer.g:1570:1: ruleOp2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleOp2() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVizualizer.g:1576:2: ( (kw= '*' | kw= '/' ) )
            // InternalVizualizer.g:1577:2: (kw= '*' | kw= '/' )
            {
            // InternalVizualizer.g:1577:2: (kw= '*' | kw= '/' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==43) ) {
                alt18=1;
            }
            else if ( (LA18_0==44) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalVizualizer.g:1578:3: kw= '*'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOp2Access().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:1584:3: kw= '/'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

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
    // InternalVizualizer.g:1593:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalVizualizer.g:1593:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalVizualizer.g:1594:2: iv_rulePrimitive= rulePrimitive EOF
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
    // InternalVizualizer.g:1600:1: rulePrimitive returns [EObject current=null] : (this_Number_0= ruleNumber | this_Variable_1= ruleVariable | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Number_0 = null;

        EObject this_Variable_1 = null;

        EObject this_Expression_3 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:1606:2: ( (this_Number_0= ruleNumber | this_Variable_1= ruleVariable | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) ) )
            // InternalVizualizer.g:1607:2: (this_Number_0= ruleNumber | this_Variable_1= ruleVariable | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) )
            {
            // InternalVizualizer.g:1607:2: (this_Number_0= ruleNumber | this_Variable_1= ruleVariable | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt19=1;
                }
                break;
            case RULE_ID:
                {
                alt19=2;
                }
                break;
            case 39:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalVizualizer.g:1608:3: this_Number_0= ruleNumber
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
                    // InternalVizualizer.g:1617:3: this_Variable_1= ruleVariable
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
                    // InternalVizualizer.g:1626:3: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    {
                    // InternalVizualizer.g:1626:3: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    // InternalVizualizer.g:1627:4: otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_34); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimitiveAccess().getExpressionParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_37);
                    this_Expression_3=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,40,FOLLOW_2); 

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
    // InternalVizualizer.g:1648:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalVizualizer.g:1648:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalVizualizer.g:1649:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalVizualizer.g:1655:1: ruleNumber returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalVizualizer.g:1661:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalVizualizer.g:1662:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalVizualizer.g:1662:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalVizualizer.g:1663:3: (lv_val_0_0= RULE_INT )
            {
            // InternalVizualizer.g:1663:3: (lv_val_0_0= RULE_INT )
            // InternalVizualizer.g:1664:4: lv_val_0_0= RULE_INT
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
    // InternalVizualizer.g:1683:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalVizualizer.g:1683:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalVizualizer.g:1684:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalVizualizer.g:1690:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalVizualizer.g:1696:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalVizualizer.g:1697:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalVizualizer.g:1697:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalVizualizer.g:1698:3: (lv_name_0_0= RULE_ID )
            {
            // InternalVizualizer.g:1698:3: (lv_name_0_0= RULE_ID )
            // InternalVizualizer.g:1699:4: lv_name_0_0= RULE_ID
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
    // InternalVizualizer.g:1718:1: ruleSchemaType returns [Enumerator current=null] : ( (enumLiteral_0= 'XML' ) | (enumLiteral_1= 'CSV' ) | (enumLiteral_2= 'JSON' ) ) ;
    public final Enumerator ruleSchemaType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalVizualizer.g:1724:2: ( ( (enumLiteral_0= 'XML' ) | (enumLiteral_1= 'CSV' ) | (enumLiteral_2= 'JSON' ) ) )
            // InternalVizualizer.g:1725:2: ( (enumLiteral_0= 'XML' ) | (enumLiteral_1= 'CSV' ) | (enumLiteral_2= 'JSON' ) )
            {
            // InternalVizualizer.g:1725:2: ( (enumLiteral_0= 'XML' ) | (enumLiteral_1= 'CSV' ) | (enumLiteral_2= 'JSON' ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt20=1;
                }
                break;
            case 46:
                {
                alt20=2;
                }
                break;
            case 47:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalVizualizer.g:1726:3: (enumLiteral_0= 'XML' )
                    {
                    // InternalVizualizer.g:1726:3: (enumLiteral_0= 'XML' )
                    // InternalVizualizer.g:1727:4: enumLiteral_0= 'XML'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getSchemaTypeAccess().getXMLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSchemaTypeAccess().getXMLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:1734:3: (enumLiteral_1= 'CSV' )
                    {
                    // InternalVizualizer.g:1734:3: (enumLiteral_1= 'CSV' )
                    // InternalVizualizer.g:1735:4: enumLiteral_1= 'CSV'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getSchemaTypeAccess().getCSVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSchemaTypeAccess().getCSVEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVizualizer.g:1742:3: (enumLiteral_2= 'JSON' )
                    {
                    // InternalVizualizer.g:1742:3: (enumLiteral_2= 'JSON' )
                    // InternalVizualizer.g:1743:4: enumLiteral_2= 'JSON'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000490040802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000E00000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000002000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000200000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000050L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000000L});

}