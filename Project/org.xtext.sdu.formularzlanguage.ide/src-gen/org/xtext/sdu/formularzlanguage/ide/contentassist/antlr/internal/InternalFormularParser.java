package org.xtext.sdu.formularzlanguage.ide.contentassist.antlr.internal;

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
import org.xtext.sdu.formularzlanguage.services.FormularGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFormularParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(FormularGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleExpression"
    // InternalFormular.g:53:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalFormular.g:54:1: ( ruleExpression EOF )
            // InternalFormular.g:55:1: ruleExpression EOF
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
    // InternalFormular.g:62:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:66:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalFormular.g:67:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalFormular.g:67:2: ( ( rule__Expression__Alternatives ) )
            // InternalFormular.g:68:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalFormular.g:69:3: ( rule__Expression__Alternatives )
            // InternalFormular.g:69:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleNumber"
    // InternalFormular.g:78:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalFormular.g:79:1: ( ruleNumber EOF )
            // InternalFormular.g:80:1: ruleNumber EOF
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
    // InternalFormular.g:87:1: ruleNumber : ( RULE_INT ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:91:2: ( ( RULE_INT ) )
            // InternalFormular.g:92:2: ( RULE_INT )
            {
            // InternalFormular.g:92:2: ( RULE_INT )
            // InternalFormular.g:93:3: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getINTTerminalRuleCall()); 

            }


            }

        }
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
    // InternalFormular.g:103:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalFormular.g:104:1: ( ruleVariable EOF )
            // InternalFormular.g:105:1: ruleVariable EOF
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
    // InternalFormular.g:112:1: ruleVariable : ( ( rule__Variable__NameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:116:2: ( ( ( rule__Variable__NameAssignment ) ) )
            // InternalFormular.g:117:2: ( ( rule__Variable__NameAssignment ) )
            {
            // InternalFormular.g:117:2: ( ( rule__Variable__NameAssignment ) )
            // InternalFormular.g:118:3: ( rule__Variable__NameAssignment )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment()); 
            // InternalFormular.g:119:3: ( rule__Variable__NameAssignment )
            // InternalFormular.g:119:4: rule__Variable__NameAssignment
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


    // $ANTLR start "entryRuleOperator"
    // InternalFormular.g:128:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // InternalFormular.g:129:1: ( ruleOperator EOF )
            // InternalFormular.g:130:1: ruleOperator EOF
            {
             before(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOperatorRule()); 
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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalFormular.g:137:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:141:2: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalFormular.g:142:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalFormular.g:142:2: ( ( rule__Operator__Alternatives ) )
            // InternalFormular.g:143:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalFormular.g:144:3: ( rule__Operator__Alternatives )
            // InternalFormular.g:144:4: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalFormular.g:152:1: rule__Expression__Alternatives : ( ( ( rule__Expression__Group_0__0 ) ) | ( ruleVariable ) | ( ( rule__Expression__Group_2__0 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:156:1: ( ( ( rule__Expression__Group_0__0 ) ) | ( ruleVariable ) | ( ( rule__Expression__Group_2__0 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt1=1;
                }
                break;
            case RULE_ID:
                {
                alt1=2;
                }
                break;
            case 11:
            case 12:
            case 13:
            case 14:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalFormular.g:157:2: ( ( rule__Expression__Group_0__0 ) )
                    {
                    // InternalFormular.g:157:2: ( ( rule__Expression__Group_0__0 ) )
                    // InternalFormular.g:158:3: ( rule__Expression__Group_0__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_0()); 
                    // InternalFormular.g:159:3: ( rule__Expression__Group_0__0 )
                    // InternalFormular.g:159:4: rule__Expression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFormular.g:163:2: ( ruleVariable )
                    {
                    // InternalFormular.g:163:2: ( ruleVariable )
                    // InternalFormular.g:164:3: ruleVariable
                    {
                     before(grammarAccess.getExpressionAccess().getVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getVariableParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFormular.g:169:2: ( ( rule__Expression__Group_2__0 ) )
                    {
                    // InternalFormular.g:169:2: ( ( rule__Expression__Group_2__0 ) )
                    // InternalFormular.g:170:3: ( rule__Expression__Group_2__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_2()); 
                    // InternalFormular.g:171:3: ( rule__Expression__Group_2__0 )
                    // InternalFormular.g:171:4: rule__Expression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalFormular.g:179:1: rule__Operator__Alternatives : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:183:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalFormular.g:184:2: ( '+' )
                    {
                    // InternalFormular.g:184:2: ( '+' )
                    // InternalFormular.g:185:3: '+'
                    {
                     before(grammarAccess.getOperatorAccess().getPlusSignKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFormular.g:190:2: ( '-' )
                    {
                    // InternalFormular.g:190:2: ( '-' )
                    // InternalFormular.g:191:3: '-'
                    {
                     before(grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFormular.g:196:2: ( '*' )
                    {
                    // InternalFormular.g:196:2: ( '*' )
                    // InternalFormular.g:197:3: '*'
                    {
                     before(grammarAccess.getOperatorAccess().getAsteriskKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getAsteriskKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFormular.g:202:2: ( '/' )
                    {
                    // InternalFormular.g:202:2: ( '/' )
                    // InternalFormular.g:203:3: '/'
                    {
                     before(grammarAccess.getOperatorAccess().getSolidusKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getSolidusKeyword_3()); 

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
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__Expression__Group_0__0"
    // InternalFormular.g:212:1: rule__Expression__Group_0__0 : rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1 ;
    public final void rule__Expression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:216:1: ( rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1 )
            // InternalFormular.g:217:2: rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Expression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__0"


    // $ANTLR start "rule__Expression__Group_0__0__Impl"
    // InternalFormular.g:224:1: rule__Expression__Group_0__0__Impl : ( () ) ;
    public final void rule__Expression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:228:1: ( ( () ) )
            // InternalFormular.g:229:1: ( () )
            {
            // InternalFormular.g:229:1: ( () )
            // InternalFormular.g:230:2: ()
            {
             before(grammarAccess.getExpressionAccess().getExpreessionAction_0_0()); 
            // InternalFormular.g:231:2: ()
            // InternalFormular.g:231:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getExpreessionAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__0__Impl"


    // $ANTLR start "rule__Expression__Group_0__1"
    // InternalFormular.g:239:1: rule__Expression__Group_0__1 : rule__Expression__Group_0__1__Impl ;
    public final void rule__Expression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:243:1: ( rule__Expression__Group_0__1__Impl )
            // InternalFormular.g:244:2: rule__Expression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__1"


    // $ANTLR start "rule__Expression__Group_0__1__Impl"
    // InternalFormular.g:250:1: rule__Expression__Group_0__1__Impl : ( ruleNumber ) ;
    public final void rule__Expression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:254:1: ( ( ruleNumber ) )
            // InternalFormular.g:255:1: ( ruleNumber )
            {
            // InternalFormular.g:255:1: ( ruleNumber )
            // InternalFormular.g:256:2: ruleNumber
            {
             before(grammarAccess.getExpressionAccess().getNumberParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getNumberParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_0__1__Impl"


    // $ANTLR start "rule__Expression__Group_2__0"
    // InternalFormular.g:266:1: rule__Expression__Group_2__0 : rule__Expression__Group_2__0__Impl rule__Expression__Group_2__1 ;
    public final void rule__Expression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:270:1: ( rule__Expression__Group_2__0__Impl rule__Expression__Group_2__1 )
            // InternalFormular.g:271:2: rule__Expression__Group_2__0__Impl rule__Expression__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Expression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_2__0"


    // $ANTLR start "rule__Expression__Group_2__0__Impl"
    // InternalFormular.g:278:1: rule__Expression__Group_2__0__Impl : ( ruleOperator ) ;
    public final void rule__Expression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:282:1: ( ( ruleOperator ) )
            // InternalFormular.g:283:1: ( ruleOperator )
            {
            // InternalFormular.g:283:1: ( ruleOperator )
            // InternalFormular.g:284:2: ruleOperator
            {
             before(grammarAccess.getExpressionAccess().getOperatorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOperatorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_2__0__Impl"


    // $ANTLR start "rule__Expression__Group_2__1"
    // InternalFormular.g:293:1: rule__Expression__Group_2__1 : rule__Expression__Group_2__1__Impl ;
    public final void rule__Expression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:297:1: ( rule__Expression__Group_2__1__Impl )
            // InternalFormular.g:298:2: rule__Expression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_2__1"


    // $ANTLR start "rule__Expression__Group_2__1__Impl"
    // InternalFormular.g:304:1: rule__Expression__Group_2__1__Impl : ( ruleExpression ) ;
    public final void rule__Expression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:308:1: ( ( ruleExpression ) )
            // InternalFormular.g:309:1: ( ruleExpression )
            {
            // InternalFormular.g:309:1: ( ruleExpression )
            // InternalFormular.g:310:2: ruleExpression
            {
             before(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExpressionParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_2__1__Impl"


    // $ANTLR start "rule__Variable__NameAssignment"
    // InternalFormular.g:320:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:324:1: ( ( RULE_ID ) )
            // InternalFormular.g:325:2: ( RULE_ID )
            {
            // InternalFormular.g:325:2: ( RULE_ID )
            // InternalFormular.g:326:3: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000007830L});

}