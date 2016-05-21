package org.xtext.sdu.formularzlanguage.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.sdu.formularzlanguage.services.FormularGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFormularParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "','", "'='"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=4;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalFormularParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFormularParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFormularParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFormular.g"; }



     	private FormularGrammarAccess grammarAccess;

        public InternalFormularParser(TokenStream input, FormularGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Math";
       	}

       	@Override
       	protected FormularGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMath"
    // InternalFormular.g:64:1: entryRuleMath returns [EObject current=null] : iv_ruleMath= ruleMath EOF ;
    public final EObject entryRuleMath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMath = null;


        try {
            // InternalFormular.g:64:45: (iv_ruleMath= ruleMath EOF )
            // InternalFormular.g:65:2: iv_ruleMath= ruleMath EOF
            {
             newCompositeNode(grammarAccess.getMathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMath=ruleMath();

            state._fsp--;

             current =iv_ruleMath; 
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
    // $ANTLR end "entryRuleMath"


    // $ANTLR start "ruleMath"
    // InternalFormular.g:71:1: ruleMath returns [EObject current=null] : ( (lv_formulars_0_0= ruleFormula ) )* ;
    public final EObject ruleMath() throws RecognitionException {
        EObject current = null;

        EObject lv_formulars_0_0 = null;



        	enterRule();

        try {
            // InternalFormular.g:77:2: ( ( (lv_formulars_0_0= ruleFormula ) )* )
            // InternalFormular.g:78:2: ( (lv_formulars_0_0= ruleFormula ) )*
            {
            // InternalFormular.g:78:2: ( (lv_formulars_0_0= ruleFormula ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFormular.g:79:3: (lv_formulars_0_0= ruleFormula )
            	    {
            	    // InternalFormular.g:79:3: (lv_formulars_0_0= ruleFormula )
            	    // InternalFormular.g:80:4: lv_formulars_0_0= ruleFormula
            	    {

            	    				newCompositeNode(grammarAccess.getMathAccess().getFormularsFormulaParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_formulars_0_0=ruleFormula();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getMathRule());
            	    				}
            	    				add(
            	    					current,
            	    					"formulars",
            	    					lv_formulars_0_0,
            	    					"org.xtext.sdu.formularzlanguage.Formular.Formula");
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
    // $ANTLR end "ruleMath"


    // $ANTLR start "entryRuleExpression"
    // InternalFormular.g:100:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalFormular.g:100:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalFormular.g:101:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalFormular.g:107:1: ruleExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleFactor ) ) ( ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalFormular.g:113:2: ( ( ( (lv_left_0_0= ruleFactor ) ) ( ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) ) )? ) )
            // InternalFormular.g:114:2: ( ( (lv_left_0_0= ruleFactor ) ) ( ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) ) )? )
            {
            // InternalFormular.g:114:2: ( ( (lv_left_0_0= ruleFactor ) ) ( ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) ) )? )
            // InternalFormular.g:115:3: ( (lv_left_0_0= ruleFactor ) ) ( ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) ) )?
            {
            // InternalFormular.g:115:3: ( (lv_left_0_0= ruleFactor ) )
            // InternalFormular.g:116:4: (lv_left_0_0= ruleFactor )
            {
            // InternalFormular.g:116:4: (lv_left_0_0= ruleFactor )
            // InternalFormular.g:117:5: lv_left_0_0= ruleFactor
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getLeftFactorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
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

            // InternalFormular.g:134:3: ( ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=11 && LA2_0<=12)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalFormular.g:135:4: ( (lv_op_1_0= ruleOp1 ) ) ( (lv_right_2_0= ruleExpression ) )
                    {
                    // InternalFormular.g:135:4: ( (lv_op_1_0= ruleOp1 ) )
                    // InternalFormular.g:136:5: (lv_op_1_0= ruleOp1 )
                    {
                    // InternalFormular.g:136:5: (lv_op_1_0= ruleOp1 )
                    // InternalFormular.g:137:6: lv_op_1_0= ruleOp1
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getOpOp1ParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_5);
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

                    // InternalFormular.g:154:4: ( (lv_right_2_0= ruleExpression ) )
                    // InternalFormular.g:155:5: (lv_right_2_0= ruleExpression )
                    {
                    // InternalFormular.g:155:5: (lv_right_2_0= ruleExpression )
                    // InternalFormular.g:156:6: lv_right_2_0= ruleExpression
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
    // InternalFormular.g:178:1: entryRuleOp1 returns [String current=null] : iv_ruleOp1= ruleOp1 EOF ;
    public final String entryRuleOp1() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOp1 = null;


        try {
            // InternalFormular.g:178:43: (iv_ruleOp1= ruleOp1 EOF )
            // InternalFormular.g:179:2: iv_ruleOp1= ruleOp1 EOF
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
    // InternalFormular.g:185:1: ruleOp1 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOp1() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalFormular.g:191:2: ( (kw= '+' | kw= '-' ) )
            // InternalFormular.g:192:2: (kw= '+' | kw= '-' )
            {
            // InternalFormular.g:192:2: (kw= '+' | kw= '-' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFormular.g:193:3: kw= '+'
                    {
                    kw=(Token)match(input,11,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOp1Access().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFormular.g:199:3: kw= '-'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

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
    // InternalFormular.g:208:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalFormular.g:208:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalFormular.g:209:2: iv_ruleFactor= ruleFactor EOF
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
    // InternalFormular.g:215:1: ruleFactor returns [EObject current=null] : ( ( (lv_left_0_0= rulePrimitive ) ) ( ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) ) )? ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalFormular.g:221:2: ( ( ( (lv_left_0_0= rulePrimitive ) ) ( ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) ) )? ) )
            // InternalFormular.g:222:2: ( ( (lv_left_0_0= rulePrimitive ) ) ( ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) ) )? )
            {
            // InternalFormular.g:222:2: ( ( (lv_left_0_0= rulePrimitive ) ) ( ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) ) )? )
            // InternalFormular.g:223:3: ( (lv_left_0_0= rulePrimitive ) ) ( ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) ) )?
            {
            // InternalFormular.g:223:3: ( (lv_left_0_0= rulePrimitive ) )
            // InternalFormular.g:224:4: (lv_left_0_0= rulePrimitive )
            {
            // InternalFormular.g:224:4: (lv_left_0_0= rulePrimitive )
            // InternalFormular.g:225:5: lv_left_0_0= rulePrimitive
            {

            					newCompositeNode(grammarAccess.getFactorAccess().getLeftPrimitiveParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
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

            // InternalFormular.g:242:3: ( ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=13 && LA4_0<=14)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalFormular.g:243:4: ( (lv_op_1_0= ruleOp2 ) ) ( (lv_right_2_0= ruleFactor ) )
                    {
                    // InternalFormular.g:243:4: ( (lv_op_1_0= ruleOp2 ) )
                    // InternalFormular.g:244:5: (lv_op_1_0= ruleOp2 )
                    {
                    // InternalFormular.g:244:5: (lv_op_1_0= ruleOp2 )
                    // InternalFormular.g:245:6: lv_op_1_0= ruleOp2
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getOpOp2ParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_5);
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

                    // InternalFormular.g:262:4: ( (lv_right_2_0= ruleFactor ) )
                    // InternalFormular.g:263:5: (lv_right_2_0= ruleFactor )
                    {
                    // InternalFormular.g:263:5: (lv_right_2_0= ruleFactor )
                    // InternalFormular.g:264:6: lv_right_2_0= ruleFactor
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
    // InternalFormular.g:286:1: entryRuleOp2 returns [String current=null] : iv_ruleOp2= ruleOp2 EOF ;
    public final String entryRuleOp2() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOp2 = null;


        try {
            // InternalFormular.g:286:43: (iv_ruleOp2= ruleOp2 EOF )
            // InternalFormular.g:287:2: iv_ruleOp2= ruleOp2 EOF
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
    // InternalFormular.g:293:1: ruleOp2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleOp2() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalFormular.g:299:2: ( (kw= '*' | kw= '/' ) )
            // InternalFormular.g:300:2: (kw= '*' | kw= '/' )
            {
            // InternalFormular.g:300:2: (kw= '*' | kw= '/' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalFormular.g:301:3: kw= '*'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOp2Access().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFormular.g:307:3: kw= '/'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

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
    // InternalFormular.g:316:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalFormular.g:316:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalFormular.g:317:2: iv_rulePrimitive= rulePrimitive EOF
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
    // InternalFormular.g:323:1: rulePrimitive returns [EObject current=null] : (this_Number_0= ruleNumber | this_Variable_1= ruleVariable | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Number_0 = null;

        EObject this_Variable_1 = null;

        EObject this_Expression_3 = null;



        	enterRule();

        try {
            // InternalFormular.g:329:2: ( (this_Number_0= ruleNumber | this_Variable_1= ruleVariable | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) ) )
            // InternalFormular.g:330:2: (this_Number_0= ruleNumber | this_Variable_1= ruleVariable | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) )
            {
            // InternalFormular.g:330:2: (this_Number_0= ruleNumber | this_Variable_1= ruleVariable | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalFormular.g:331:3: this_Number_0= ruleNumber
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
                    // InternalFormular.g:340:3: this_Variable_1= ruleVariable
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
                    // InternalFormular.g:349:3: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    {
                    // InternalFormular.g:349:3: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    // InternalFormular.g:350:4: otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimitiveAccess().getExpressionParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_7);
                    this_Expression_3=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalFormular.g:371:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalFormular.g:371:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalFormular.g:372:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalFormular.g:378:1: ruleNumber returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalFormular.g:384:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalFormular.g:385:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalFormular.g:385:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalFormular.g:386:3: (lv_val_0_0= RULE_INT )
            {
            // InternalFormular.g:386:3: (lv_val_0_0= RULE_INT )
            // InternalFormular.g:387:4: lv_val_0_0= RULE_INT
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
    // InternalFormular.g:406:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalFormular.g:406:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalFormular.g:407:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalFormular.g:413:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalFormular.g:419:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalFormular.g:420:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalFormular.g:420:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalFormular.g:421:3: (lv_name_0_0= RULE_ID )
            {
            // InternalFormular.g:421:3: (lv_name_0_0= RULE_ID )
            // InternalFormular.g:422:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRuleFormula"
    // InternalFormular.g:441:1: entryRuleFormula returns [EObject current=null] : iv_ruleFormula= ruleFormula EOF ;
    public final EObject entryRuleFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormula = null;


        try {
            // InternalFormular.g:441:48: (iv_ruleFormula= ruleFormula EOF )
            // InternalFormular.g:442:2: iv_ruleFormula= ruleFormula EOF
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
    // InternalFormular.g:448:1: ruleFormula returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= '=' ( (lv_exp_7_0= ruleExpression ) ) ) ;
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
            // InternalFormular.g:454:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= '=' ( (lv_exp_7_0= ruleExpression ) ) ) )
            // InternalFormular.g:455:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= '=' ( (lv_exp_7_0= ruleExpression ) ) )
            {
            // InternalFormular.g:455:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= '=' ( (lv_exp_7_0= ruleExpression ) ) )
            // InternalFormular.g:456:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= '=' ( (lv_exp_7_0= ruleExpression ) )
            {
            // InternalFormular.g:456:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalFormular.g:457:4: (lv_name_0_0= RULE_ID )
            {
            // InternalFormular.g:457:4: (lv_name_0_0= RULE_ID )
            // InternalFormular.g:458:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getFormulaAccess().getLeftParenthesisKeyword_1());
            		
            // InternalFormular.g:478:3: ( ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFormular.g:479:4: ( (lv_vars_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )*
                    {
                    // InternalFormular.g:479:4: ( (lv_vars_2_0= ruleVariable ) )
                    // InternalFormular.g:480:5: (lv_vars_2_0= ruleVariable )
                    {
                    // InternalFormular.g:480:5: (lv_vars_2_0= ruleVariable )
                    // InternalFormular.g:481:6: lv_vars_2_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getFormulaAccess().getVarsVariableParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_10);
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

                    // InternalFormular.g:498:4: (otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==17) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalFormular.g:499:5: otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FOLLOW_11); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFormulaAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalFormular.g:503:5: ( (lv_vars_4_0= ruleVariable ) )
                    	    // InternalFormular.g:504:6: (lv_vars_4_0= ruleVariable )
                    	    {
                    	    // InternalFormular.g:504:6: (lv_vars_4_0= ruleVariable )
                    	    // InternalFormular.g:505:7: lv_vars_4_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getFormulaAccess().getVarsVariableParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
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
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getFormulaAccess().getRightParenthesisKeyword_3());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getFormulaAccess().getEqualsSignKeyword_4());
            		
            // InternalFormular.g:532:3: ( (lv_exp_7_0= ruleExpression ) )
            // InternalFormular.g:533:4: (lv_exp_7_0= ruleExpression )
            {
            // InternalFormular.g:533:4: (lv_exp_7_0= ruleExpression )
            // InternalFormular.g:534:5: lv_exp_7_0= ruleExpression
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});

}