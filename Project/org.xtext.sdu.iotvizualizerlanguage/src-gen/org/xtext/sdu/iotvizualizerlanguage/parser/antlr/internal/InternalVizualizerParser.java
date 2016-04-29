package org.xtext.sdu.iotvizualizerlanguage.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Page'", "'{'", "'}'", "'Link'", "'to'", "'Graph'", "'+'", "'-'", "'*'", "'/'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

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
    // InternalVizualizer.g:64:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalVizualizer.g:64:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalVizualizer.g:65:2: iv_ruleSystem= ruleSystem EOF
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
    // InternalVizualizer.g:71:1: ruleSystem returns [EObject current=null] : ( (lv_pages_0_0= rulePage ) )* ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        EObject lv_pages_0_0 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:77:2: ( ( (lv_pages_0_0= rulePage ) )* )
            // InternalVizualizer.g:78:2: ( (lv_pages_0_0= rulePage ) )*
            {
            // InternalVizualizer.g:78:2: ( (lv_pages_0_0= rulePage ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVizualizer.g:79:3: (lv_pages_0_0= rulePage )
            	    {
            	    // InternalVizualizer.g:79:3: (lv_pages_0_0= rulePage )
            	    // InternalVizualizer.g:80:4: lv_pages_0_0= rulePage
            	    {

            	    				newCompositeNode(grammarAccess.getSystemAccess().getPagesPageParserRuleCall_0());
            	    			
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
    // InternalVizualizer.g:100:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // InternalVizualizer.g:100:45: (iv_rulePage= rulePage EOF )
            // InternalVizualizer.g:101:2: iv_rulePage= rulePage EOF
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
    // InternalVizualizer.g:107:1: rulePage returns [EObject current=null] : (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tiles_3_0= ruleTile ) )* otherlv_4= '}' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_tiles_3_0 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:113:2: ( (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tiles_3_0= ruleTile ) )* otherlv_4= '}' ) )
            // InternalVizualizer.g:114:2: (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tiles_3_0= ruleTile ) )* otherlv_4= '}' )
            {
            // InternalVizualizer.g:114:2: (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tiles_3_0= ruleTile ) )* otherlv_4= '}' )
            // InternalVizualizer.g:115:3: otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tiles_3_0= ruleTile ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
            		
            // InternalVizualizer.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVizualizer.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVizualizer.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalVizualizer.g:121:5: lv_name_1_0= RULE_ID
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
            		
            // InternalVizualizer.g:141:3: ( (lv_tiles_3_0= ruleTile ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14||LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalVizualizer.g:142:4: (lv_tiles_3_0= ruleTile )
            	    {
            	    // InternalVizualizer.g:142:4: (lv_tiles_3_0= ruleTile )
            	    // InternalVizualizer.g:143:5: lv_tiles_3_0= ruleTile
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
    // InternalVizualizer.g:168:1: entryRuleTile returns [EObject current=null] : iv_ruleTile= ruleTile EOF ;
    public final EObject entryRuleTile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTile = null;


        try {
            // InternalVizualizer.g:168:45: (iv_ruleTile= ruleTile EOF )
            // InternalVizualizer.g:169:2: iv_ruleTile= ruleTile EOF
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
    // InternalVizualizer.g:175:1: ruleTile returns [EObject current=null] : (this_Link_0= ruleLink | this_Graph_1= ruleGraph ) ;
    public final EObject ruleTile() throws RecognitionException {
        EObject current = null;

        EObject this_Link_0 = null;

        EObject this_Graph_1 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:181:2: ( (this_Link_0= ruleLink | this_Graph_1= ruleGraph ) )
            // InternalVizualizer.g:182:2: (this_Link_0= ruleLink | this_Graph_1= ruleGraph )
            {
            // InternalVizualizer.g:182:2: (this_Link_0= ruleLink | this_Graph_1= ruleGraph )
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
                    // InternalVizualizer.g:183:3: this_Link_0= ruleLink
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
                    // InternalVizualizer.g:192:3: this_Graph_1= ruleGraph
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
    // InternalVizualizer.g:204:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalVizualizer.g:204:45: (iv_ruleLink= ruleLink EOF )
            // InternalVizualizer.g:205:2: iv_ruleLink= ruleLink EOF
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
    // InternalVizualizer.g:211:1: ruleLink returns [EObject current=null] : (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVizualizer.g:217:2: ( (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalVizualizer.g:218:2: (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalVizualizer.g:218:2: (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) )
            // InternalVizualizer.g:219:3: otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalVizualizer.g:223:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVizualizer.g:224:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVizualizer.g:224:4: (lv_name_1_0= RULE_ID )
            // InternalVizualizer.g:225:5: lv_name_1_0= RULE_ID
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
            		
            // InternalVizualizer.g:245:3: ( (otherlv_3= RULE_ID ) )
            // InternalVizualizer.g:246:4: (otherlv_3= RULE_ID )
            {
            // InternalVizualizer.g:246:4: (otherlv_3= RULE_ID )
            // InternalVizualizer.g:247:5: otherlv_3= RULE_ID
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
    // InternalVizualizer.g:262:1: entryRuleGraph returns [EObject current=null] : iv_ruleGraph= ruleGraph EOF ;
    public final EObject entryRuleGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraph = null;


        try {
            // InternalVizualizer.g:262:46: (iv_ruleGraph= ruleGraph EOF )
            // InternalVizualizer.g:263:2: iv_ruleGraph= ruleGraph EOF
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
    // InternalVizualizer.g:269:1: ruleGraph returns [EObject current=null] : (otherlv_0= 'Graph' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleGraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalVizualizer.g:275:2: ( (otherlv_0= 'Graph' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalVizualizer.g:276:2: (otherlv_0= 'Graph' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalVizualizer.g:276:2: (otherlv_0= 'Graph' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalVizualizer.g:277:3: otherlv_0= 'Graph' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphAccess().getGraphKeyword_0());
            		
            // InternalVizualizer.g:281:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVizualizer.g:282:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVizualizer.g:282:4: (lv_name_1_0= RULE_ID )
            // InternalVizualizer.g:283:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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


    // $ANTLR start "entryRuleExpression"
    // InternalVizualizer.g:303:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalVizualizer.g:303:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalVizualizer.g:304:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalVizualizer.g:310:1: ruleExpression returns [EObject current=null] : ( ( () ruleNumber ) | this_Variable_2= ruleVariable | ( ruleOperator this_Expression_4= ruleExpression ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_2 = null;

        EObject this_Expression_4 = null;



        	enterRule();

        try {
            // InternalVizualizer.g:316:2: ( ( ( () ruleNumber ) | this_Variable_2= ruleVariable | ( ruleOperator this_Expression_4= ruleExpression ) ) )
            // InternalVizualizer.g:317:2: ( ( () ruleNumber ) | this_Variable_2= ruleVariable | ( ruleOperator this_Expression_4= ruleExpression ) )
            {
            // InternalVizualizer.g:317:2: ( ( () ruleNumber ) | this_Variable_2= ruleVariable | ( ruleOperator this_Expression_4= ruleExpression ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case 17:
            case 18:
            case 19:
            case 20:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalVizualizer.g:318:3: ( () ruleNumber )
                    {
                    // InternalVizualizer.g:318:3: ( () ruleNumber )
                    // InternalVizualizer.g:319:4: () ruleNumber
                    {
                    // InternalVizualizer.g:319:4: ()
                    // InternalVizualizer.g:320:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpressionAccess().getExpreessionAction_0_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getExpressionAccess().getNumberParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleNumber();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:335:3: this_Variable_2= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_2=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalVizualizer.g:344:3: ( ruleOperator this_Expression_4= ruleExpression )
                    {
                    // InternalVizualizer.g:344:3: ( ruleOperator this_Expression_4= ruleExpression )
                    // InternalVizualizer.g:345:4: ruleOperator this_Expression_4= ruleExpression
                    {

                    				newCompositeNode(grammarAccess.getExpressionAccess().getOperatorParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_8);
                    ruleOperator();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Expression_4=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_4;
                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleNumber"
    // InternalVizualizer.g:365:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalVizualizer.g:365:46: (iv_ruleNumber= ruleNumber EOF )
            // InternalVizualizer.g:366:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
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
    // InternalVizualizer.g:372:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalVizualizer.g:378:2: (this_INT_0= RULE_INT )
            // InternalVizualizer.g:379:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall());
            	

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
    // InternalVizualizer.g:389:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalVizualizer.g:389:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalVizualizer.g:390:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalVizualizer.g:396:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalVizualizer.g:402:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalVizualizer.g:403:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalVizualizer.g:403:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalVizualizer.g:404:3: (lv_name_0_0= RULE_ID )
            {
            // InternalVizualizer.g:404:3: (lv_name_0_0= RULE_ID )
            // InternalVizualizer.g:405:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRuleOperator"
    // InternalVizualizer.g:424:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // InternalVizualizer.g:424:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalVizualizer.g:425:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator.getText(); 
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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalVizualizer.g:431:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVizualizer.g:437:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' ) )
            // InternalVizualizer.g:438:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            {
            // InternalVizualizer.g:438:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            case 20:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalVizualizer.g:439:3: kw= '+'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalVizualizer.g:445:3: kw= '-'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalVizualizer.g:451:3: kw= '*'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalVizualizer.g:457:3: kw= '/'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getSolidusKeyword_3());
                    		

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
    // $ANTLR end "ruleOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001E0030L});

}