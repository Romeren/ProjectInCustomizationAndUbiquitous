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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'='", "','"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
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



    // $ANTLR start "entryRuleFormula"
    // InternalFormular.g:53:1: entryRuleFormula : ruleFormula EOF ;
    public final void entryRuleFormula() throws RecognitionException {
        try {
            // InternalFormular.g:54:1: ( ruleFormula EOF )
            // InternalFormular.g:55:1: ruleFormula EOF
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
    // InternalFormular.g:62:1: ruleFormula : ( ( rule__Formula__Group__0 ) ) ;
    public final void ruleFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:66:2: ( ( ( rule__Formula__Group__0 ) ) )
            // InternalFormular.g:67:2: ( ( rule__Formula__Group__0 ) )
            {
            // InternalFormular.g:67:2: ( ( rule__Formula__Group__0 ) )
            // InternalFormular.g:68:3: ( rule__Formula__Group__0 )
            {
             before(grammarAccess.getFormulaAccess().getGroup()); 
            // InternalFormular.g:69:3: ( rule__Formula__Group__0 )
            // InternalFormular.g:69:4: rule__Formula__Group__0
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
    // InternalFormular.g:78:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalFormular.g:79:1: ( ruleExpression EOF )
            // InternalFormular.g:80:1: ruleExpression EOF
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
    // InternalFormular.g:87:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:91:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalFormular.g:92:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalFormular.g:92:2: ( ( rule__Expression__Group__0 ) )
            // InternalFormular.g:93:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalFormular.g:94:3: ( rule__Expression__Group__0 )
            // InternalFormular.g:94:4: rule__Expression__Group__0
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
    // InternalFormular.g:103:1: entryRuleOp1 : ruleOp1 EOF ;
    public final void entryRuleOp1() throws RecognitionException {
        try {
            // InternalFormular.g:104:1: ( ruleOp1 EOF )
            // InternalFormular.g:105:1: ruleOp1 EOF
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
    // InternalFormular.g:112:1: ruleOp1 : ( ( rule__Op1__Alternatives ) ) ;
    public final void ruleOp1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:116:2: ( ( ( rule__Op1__Alternatives ) ) )
            // InternalFormular.g:117:2: ( ( rule__Op1__Alternatives ) )
            {
            // InternalFormular.g:117:2: ( ( rule__Op1__Alternatives ) )
            // InternalFormular.g:118:3: ( rule__Op1__Alternatives )
            {
             before(grammarAccess.getOp1Access().getAlternatives()); 
            // InternalFormular.g:119:3: ( rule__Op1__Alternatives )
            // InternalFormular.g:119:4: rule__Op1__Alternatives
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
    // InternalFormular.g:128:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // InternalFormular.g:129:1: ( ruleFactor EOF )
            // InternalFormular.g:130:1: ruleFactor EOF
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
    // InternalFormular.g:137:1: ruleFactor : ( ( rule__Factor__Group__0 ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:141:2: ( ( ( rule__Factor__Group__0 ) ) )
            // InternalFormular.g:142:2: ( ( rule__Factor__Group__0 ) )
            {
            // InternalFormular.g:142:2: ( ( rule__Factor__Group__0 ) )
            // InternalFormular.g:143:3: ( rule__Factor__Group__0 )
            {
             before(grammarAccess.getFactorAccess().getGroup()); 
            // InternalFormular.g:144:3: ( rule__Factor__Group__0 )
            // InternalFormular.g:144:4: rule__Factor__Group__0
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
    // InternalFormular.g:153:1: entryRuleOp2 : ruleOp2 EOF ;
    public final void entryRuleOp2() throws RecognitionException {
        try {
            // InternalFormular.g:154:1: ( ruleOp2 EOF )
            // InternalFormular.g:155:1: ruleOp2 EOF
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
    // InternalFormular.g:162:1: ruleOp2 : ( ( rule__Op2__Alternatives ) ) ;
    public final void ruleOp2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:166:2: ( ( ( rule__Op2__Alternatives ) ) )
            // InternalFormular.g:167:2: ( ( rule__Op2__Alternatives ) )
            {
            // InternalFormular.g:167:2: ( ( rule__Op2__Alternatives ) )
            // InternalFormular.g:168:3: ( rule__Op2__Alternatives )
            {
             before(grammarAccess.getOp2Access().getAlternatives()); 
            // InternalFormular.g:169:3: ( rule__Op2__Alternatives )
            // InternalFormular.g:169:4: rule__Op2__Alternatives
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
    // InternalFormular.g:178:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // InternalFormular.g:179:1: ( rulePrimitive EOF )
            // InternalFormular.g:180:1: rulePrimitive EOF
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
    // InternalFormular.g:187:1: rulePrimitive : ( ( rule__Primitive__Alternatives ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:191:2: ( ( ( rule__Primitive__Alternatives ) ) )
            // InternalFormular.g:192:2: ( ( rule__Primitive__Alternatives ) )
            {
            // InternalFormular.g:192:2: ( ( rule__Primitive__Alternatives ) )
            // InternalFormular.g:193:3: ( rule__Primitive__Alternatives )
            {
             before(grammarAccess.getPrimitiveAccess().getAlternatives()); 
            // InternalFormular.g:194:3: ( rule__Primitive__Alternatives )
            // InternalFormular.g:194:4: rule__Primitive__Alternatives
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
    // InternalFormular.g:203:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalFormular.g:204:1: ( ruleNumber EOF )
            // InternalFormular.g:205:1: ruleNumber EOF
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
    // InternalFormular.g:212:1: ruleNumber : ( ( rule__Number__ValAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:216:2: ( ( ( rule__Number__ValAssignment ) ) )
            // InternalFormular.g:217:2: ( ( rule__Number__ValAssignment ) )
            {
            // InternalFormular.g:217:2: ( ( rule__Number__ValAssignment ) )
            // InternalFormular.g:218:3: ( rule__Number__ValAssignment )
            {
             before(grammarAccess.getNumberAccess().getValAssignment()); 
            // InternalFormular.g:219:3: ( rule__Number__ValAssignment )
            // InternalFormular.g:219:4: rule__Number__ValAssignment
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
    // InternalFormular.g:228:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalFormular.g:229:1: ( ruleVariable EOF )
            // InternalFormular.g:230:1: ruleVariable EOF
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
    // InternalFormular.g:237:1: ruleVariable : ( ( rule__Variable__NameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:241:2: ( ( ( rule__Variable__NameAssignment ) ) )
            // InternalFormular.g:242:2: ( ( rule__Variable__NameAssignment ) )
            {
            // InternalFormular.g:242:2: ( ( rule__Variable__NameAssignment ) )
            // InternalFormular.g:243:3: ( rule__Variable__NameAssignment )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment()); 
            // InternalFormular.g:244:3: ( rule__Variable__NameAssignment )
            // InternalFormular.g:244:4: rule__Variable__NameAssignment
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


    // $ANTLR start "rule__Op1__Alternatives"
    // InternalFormular.g:252:1: rule__Op1__Alternatives : ( ( '+' ) | ( '-' ) );
    public final void rule__Op1__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:256:1: ( ( '+' ) | ( '-' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalFormular.g:257:2: ( '+' )
                    {
                    // InternalFormular.g:257:2: ( '+' )
                    // InternalFormular.g:258:3: '+'
                    {
                     before(grammarAccess.getOp1Access().getPlusSignKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getOp1Access().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFormular.g:263:2: ( '-' )
                    {
                    // InternalFormular.g:263:2: ( '-' )
                    // InternalFormular.g:264:3: '-'
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
    // InternalFormular.g:273:1: rule__Op2__Alternatives : ( ( '*' ) | ( '/' ) );
    public final void rule__Op2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:277:1: ( ( '*' ) | ( '/' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalFormular.g:278:2: ( '*' )
                    {
                    // InternalFormular.g:278:2: ( '*' )
                    // InternalFormular.g:279:3: '*'
                    {
                     before(grammarAccess.getOp2Access().getAsteriskKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getOp2Access().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFormular.g:284:2: ( '/' )
                    {
                    // InternalFormular.g:284:2: ( '/' )
                    // InternalFormular.g:285:3: '/'
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
    // InternalFormular.g:294:1: rule__Primitive__Alternatives : ( ( ruleNumber ) | ( ruleVariable ) | ( ( rule__Primitive__Group_2__0 ) ) );
    public final void rule__Primitive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:298:1: ( ( ruleNumber ) | ( ruleVariable ) | ( ( rule__Primitive__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalFormular.g:299:2: ( ruleNumber )
                    {
                    // InternalFormular.g:299:2: ( ruleNumber )
                    // InternalFormular.g:300:3: ruleNumber
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
                    // InternalFormular.g:305:2: ( ruleVariable )
                    {
                    // InternalFormular.g:305:2: ( ruleVariable )
                    // InternalFormular.g:306:3: ruleVariable
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
                    // InternalFormular.g:311:2: ( ( rule__Primitive__Group_2__0 ) )
                    {
                    // InternalFormular.g:311:2: ( ( rule__Primitive__Group_2__0 ) )
                    // InternalFormular.g:312:3: ( rule__Primitive__Group_2__0 )
                    {
                     before(grammarAccess.getPrimitiveAccess().getGroup_2()); 
                    // InternalFormular.g:313:3: ( rule__Primitive__Group_2__0 )
                    // InternalFormular.g:313:4: rule__Primitive__Group_2__0
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


    // $ANTLR start "rule__Formula__Group__0"
    // InternalFormular.g:321:1: rule__Formula__Group__0 : rule__Formula__Group__0__Impl rule__Formula__Group__1 ;
    public final void rule__Formula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:325:1: ( rule__Formula__Group__0__Impl rule__Formula__Group__1 )
            // InternalFormular.g:326:2: rule__Formula__Group__0__Impl rule__Formula__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalFormular.g:333:1: rule__Formula__Group__0__Impl : ( ( rule__Formula__NameAssignment_0 ) ) ;
    public final void rule__Formula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:337:1: ( ( ( rule__Formula__NameAssignment_0 ) ) )
            // InternalFormular.g:338:1: ( ( rule__Formula__NameAssignment_0 ) )
            {
            // InternalFormular.g:338:1: ( ( rule__Formula__NameAssignment_0 ) )
            // InternalFormular.g:339:2: ( rule__Formula__NameAssignment_0 )
            {
             before(grammarAccess.getFormulaAccess().getNameAssignment_0()); 
            // InternalFormular.g:340:2: ( rule__Formula__NameAssignment_0 )
            // InternalFormular.g:340:3: rule__Formula__NameAssignment_0
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
    // InternalFormular.g:348:1: rule__Formula__Group__1 : rule__Formula__Group__1__Impl rule__Formula__Group__2 ;
    public final void rule__Formula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:352:1: ( rule__Formula__Group__1__Impl rule__Formula__Group__2 )
            // InternalFormular.g:353:2: rule__Formula__Group__1__Impl rule__Formula__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalFormular.g:360:1: rule__Formula__Group__1__Impl : ( '(' ) ;
    public final void rule__Formula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:364:1: ( ( '(' ) )
            // InternalFormular.g:365:1: ( '(' )
            {
            // InternalFormular.g:365:1: ( '(' )
            // InternalFormular.g:366:2: '('
            {
             before(grammarAccess.getFormulaAccess().getLeftParenthesisKeyword_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalFormular.g:375:1: rule__Formula__Group__2 : rule__Formula__Group__2__Impl rule__Formula__Group__3 ;
    public final void rule__Formula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:379:1: ( rule__Formula__Group__2__Impl rule__Formula__Group__3 )
            // InternalFormular.g:380:2: rule__Formula__Group__2__Impl rule__Formula__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalFormular.g:387:1: rule__Formula__Group__2__Impl : ( ( rule__Formula__Group_2__0 )? ) ;
    public final void rule__Formula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:391:1: ( ( ( rule__Formula__Group_2__0 )? ) )
            // InternalFormular.g:392:1: ( ( rule__Formula__Group_2__0 )? )
            {
            // InternalFormular.g:392:1: ( ( rule__Formula__Group_2__0 )? )
            // InternalFormular.g:393:2: ( rule__Formula__Group_2__0 )?
            {
             before(grammarAccess.getFormulaAccess().getGroup_2()); 
            // InternalFormular.g:394:2: ( rule__Formula__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalFormular.g:394:3: rule__Formula__Group_2__0
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
    // InternalFormular.g:402:1: rule__Formula__Group__3 : rule__Formula__Group__3__Impl rule__Formula__Group__4 ;
    public final void rule__Formula__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:406:1: ( rule__Formula__Group__3__Impl rule__Formula__Group__4 )
            // InternalFormular.g:407:2: rule__Formula__Group__3__Impl rule__Formula__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalFormular.g:414:1: rule__Formula__Group__3__Impl : ( ')' ) ;
    public final void rule__Formula__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:418:1: ( ( ')' ) )
            // InternalFormular.g:419:1: ( ')' )
            {
            // InternalFormular.g:419:1: ( ')' )
            // InternalFormular.g:420:2: ')'
            {
             before(grammarAccess.getFormulaAccess().getRightParenthesisKeyword_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalFormular.g:429:1: rule__Formula__Group__4 : rule__Formula__Group__4__Impl rule__Formula__Group__5 ;
    public final void rule__Formula__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:433:1: ( rule__Formula__Group__4__Impl rule__Formula__Group__5 )
            // InternalFormular.g:434:2: rule__Formula__Group__4__Impl rule__Formula__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalFormular.g:441:1: rule__Formula__Group__4__Impl : ( '=' ) ;
    public final void rule__Formula__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:445:1: ( ( '=' ) )
            // InternalFormular.g:446:1: ( '=' )
            {
            // InternalFormular.g:446:1: ( '=' )
            // InternalFormular.g:447:2: '='
            {
             before(grammarAccess.getFormulaAccess().getEqualsSignKeyword_4()); 
            match(input,17,FOLLOW_2); 
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
    // InternalFormular.g:456:1: rule__Formula__Group__5 : rule__Formula__Group__5__Impl ;
    public final void rule__Formula__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:460:1: ( rule__Formula__Group__5__Impl )
            // InternalFormular.g:461:2: rule__Formula__Group__5__Impl
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
    // InternalFormular.g:467:1: rule__Formula__Group__5__Impl : ( ( rule__Formula__ExpAssignment_5 ) ) ;
    public final void rule__Formula__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:471:1: ( ( ( rule__Formula__ExpAssignment_5 ) ) )
            // InternalFormular.g:472:1: ( ( rule__Formula__ExpAssignment_5 ) )
            {
            // InternalFormular.g:472:1: ( ( rule__Formula__ExpAssignment_5 ) )
            // InternalFormular.g:473:2: ( rule__Formula__ExpAssignment_5 )
            {
             before(grammarAccess.getFormulaAccess().getExpAssignment_5()); 
            // InternalFormular.g:474:2: ( rule__Formula__ExpAssignment_5 )
            // InternalFormular.g:474:3: rule__Formula__ExpAssignment_5
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
    // InternalFormular.g:483:1: rule__Formula__Group_2__0 : rule__Formula__Group_2__0__Impl rule__Formula__Group_2__1 ;
    public final void rule__Formula__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:487:1: ( rule__Formula__Group_2__0__Impl rule__Formula__Group_2__1 )
            // InternalFormular.g:488:2: rule__Formula__Group_2__0__Impl rule__Formula__Group_2__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalFormular.g:495:1: rule__Formula__Group_2__0__Impl : ( ( rule__Formula__VarsAssignment_2_0 ) ) ;
    public final void rule__Formula__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:499:1: ( ( ( rule__Formula__VarsAssignment_2_0 ) ) )
            // InternalFormular.g:500:1: ( ( rule__Formula__VarsAssignment_2_0 ) )
            {
            // InternalFormular.g:500:1: ( ( rule__Formula__VarsAssignment_2_0 ) )
            // InternalFormular.g:501:2: ( rule__Formula__VarsAssignment_2_0 )
            {
             before(grammarAccess.getFormulaAccess().getVarsAssignment_2_0()); 
            // InternalFormular.g:502:2: ( rule__Formula__VarsAssignment_2_0 )
            // InternalFormular.g:502:3: rule__Formula__VarsAssignment_2_0
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
    // InternalFormular.g:510:1: rule__Formula__Group_2__1 : rule__Formula__Group_2__1__Impl ;
    public final void rule__Formula__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:514:1: ( rule__Formula__Group_2__1__Impl )
            // InternalFormular.g:515:2: rule__Formula__Group_2__1__Impl
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
    // InternalFormular.g:521:1: rule__Formula__Group_2__1__Impl : ( ( rule__Formula__Group_2_1__0 )* ) ;
    public final void rule__Formula__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:525:1: ( ( ( rule__Formula__Group_2_1__0 )* ) )
            // InternalFormular.g:526:1: ( ( rule__Formula__Group_2_1__0 )* )
            {
            // InternalFormular.g:526:1: ( ( rule__Formula__Group_2_1__0 )* )
            // InternalFormular.g:527:2: ( rule__Formula__Group_2_1__0 )*
            {
             before(grammarAccess.getFormulaAccess().getGroup_2_1()); 
            // InternalFormular.g:528:2: ( rule__Formula__Group_2_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFormular.g:528:3: rule__Formula__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Formula__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalFormular.g:537:1: rule__Formula__Group_2_1__0 : rule__Formula__Group_2_1__0__Impl rule__Formula__Group_2_1__1 ;
    public final void rule__Formula__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:541:1: ( rule__Formula__Group_2_1__0__Impl rule__Formula__Group_2_1__1 )
            // InternalFormular.g:542:2: rule__Formula__Group_2_1__0__Impl rule__Formula__Group_2_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalFormular.g:549:1: rule__Formula__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Formula__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:553:1: ( ( ',' ) )
            // InternalFormular.g:554:1: ( ',' )
            {
            // InternalFormular.g:554:1: ( ',' )
            // InternalFormular.g:555:2: ','
            {
             before(grammarAccess.getFormulaAccess().getCommaKeyword_2_1_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalFormular.g:564:1: rule__Formula__Group_2_1__1 : rule__Formula__Group_2_1__1__Impl ;
    public final void rule__Formula__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:568:1: ( rule__Formula__Group_2_1__1__Impl )
            // InternalFormular.g:569:2: rule__Formula__Group_2_1__1__Impl
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
    // InternalFormular.g:575:1: rule__Formula__Group_2_1__1__Impl : ( ( rule__Formula__VarsAssignment_2_1_1 ) ) ;
    public final void rule__Formula__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:579:1: ( ( ( rule__Formula__VarsAssignment_2_1_1 ) ) )
            // InternalFormular.g:580:1: ( ( rule__Formula__VarsAssignment_2_1_1 ) )
            {
            // InternalFormular.g:580:1: ( ( rule__Formula__VarsAssignment_2_1_1 ) )
            // InternalFormular.g:581:2: ( rule__Formula__VarsAssignment_2_1_1 )
            {
             before(grammarAccess.getFormulaAccess().getVarsAssignment_2_1_1()); 
            // InternalFormular.g:582:2: ( rule__Formula__VarsAssignment_2_1_1 )
            // InternalFormular.g:582:3: rule__Formula__VarsAssignment_2_1_1
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
    // InternalFormular.g:591:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:595:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalFormular.g:596:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalFormular.g:603:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__LeftAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:607:1: ( ( ( rule__Expression__LeftAssignment_0 ) ) )
            // InternalFormular.g:608:1: ( ( rule__Expression__LeftAssignment_0 ) )
            {
            // InternalFormular.g:608:1: ( ( rule__Expression__LeftAssignment_0 ) )
            // InternalFormular.g:609:2: ( rule__Expression__LeftAssignment_0 )
            {
             before(grammarAccess.getExpressionAccess().getLeftAssignment_0()); 
            // InternalFormular.g:610:2: ( rule__Expression__LeftAssignment_0 )
            // InternalFormular.g:610:3: rule__Expression__LeftAssignment_0
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
    // InternalFormular.g:618:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:622:1: ( rule__Expression__Group__1__Impl )
            // InternalFormular.g:623:2: rule__Expression__Group__1__Impl
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
    // InternalFormular.g:629:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:633:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // InternalFormular.g:634:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // InternalFormular.g:634:1: ( ( rule__Expression__Group_1__0 )? )
            // InternalFormular.g:635:2: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalFormular.g:636:2: ( rule__Expression__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=11 && LA6_0<=12)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFormular.g:636:3: rule__Expression__Group_1__0
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
    // InternalFormular.g:645:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:649:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalFormular.g:650:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalFormular.g:657:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__OpAssignment_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:661:1: ( ( ( rule__Expression__OpAssignment_1_0 ) ) )
            // InternalFormular.g:662:1: ( ( rule__Expression__OpAssignment_1_0 ) )
            {
            // InternalFormular.g:662:1: ( ( rule__Expression__OpAssignment_1_0 ) )
            // InternalFormular.g:663:2: ( rule__Expression__OpAssignment_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getOpAssignment_1_0()); 
            // InternalFormular.g:664:2: ( rule__Expression__OpAssignment_1_0 )
            // InternalFormular.g:664:3: rule__Expression__OpAssignment_1_0
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
    // InternalFormular.g:672:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:676:1: ( rule__Expression__Group_1__1__Impl )
            // InternalFormular.g:677:2: rule__Expression__Group_1__1__Impl
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
    // InternalFormular.g:683:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__RightAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:687:1: ( ( ( rule__Expression__RightAssignment_1_1 ) ) )
            // InternalFormular.g:688:1: ( ( rule__Expression__RightAssignment_1_1 ) )
            {
            // InternalFormular.g:688:1: ( ( rule__Expression__RightAssignment_1_1 ) )
            // InternalFormular.g:689:2: ( rule__Expression__RightAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_1()); 
            // InternalFormular.g:690:2: ( rule__Expression__RightAssignment_1_1 )
            // InternalFormular.g:690:3: rule__Expression__RightAssignment_1_1
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
    // InternalFormular.g:699:1: rule__Factor__Group__0 : rule__Factor__Group__0__Impl rule__Factor__Group__1 ;
    public final void rule__Factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:703:1: ( rule__Factor__Group__0__Impl rule__Factor__Group__1 )
            // InternalFormular.g:704:2: rule__Factor__Group__0__Impl rule__Factor__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalFormular.g:711:1: rule__Factor__Group__0__Impl : ( ( rule__Factor__LeftAssignment_0 ) ) ;
    public final void rule__Factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:715:1: ( ( ( rule__Factor__LeftAssignment_0 ) ) )
            // InternalFormular.g:716:1: ( ( rule__Factor__LeftAssignment_0 ) )
            {
            // InternalFormular.g:716:1: ( ( rule__Factor__LeftAssignment_0 ) )
            // InternalFormular.g:717:2: ( rule__Factor__LeftAssignment_0 )
            {
             before(grammarAccess.getFactorAccess().getLeftAssignment_0()); 
            // InternalFormular.g:718:2: ( rule__Factor__LeftAssignment_0 )
            // InternalFormular.g:718:3: rule__Factor__LeftAssignment_0
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
    // InternalFormular.g:726:1: rule__Factor__Group__1 : rule__Factor__Group__1__Impl ;
    public final void rule__Factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:730:1: ( rule__Factor__Group__1__Impl )
            // InternalFormular.g:731:2: rule__Factor__Group__1__Impl
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
    // InternalFormular.g:737:1: rule__Factor__Group__1__Impl : ( ( rule__Factor__Group_1__0 )? ) ;
    public final void rule__Factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:741:1: ( ( ( rule__Factor__Group_1__0 )? ) )
            // InternalFormular.g:742:1: ( ( rule__Factor__Group_1__0 )? )
            {
            // InternalFormular.g:742:1: ( ( rule__Factor__Group_1__0 )? )
            // InternalFormular.g:743:2: ( rule__Factor__Group_1__0 )?
            {
             before(grammarAccess.getFactorAccess().getGroup_1()); 
            // InternalFormular.g:744:2: ( rule__Factor__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=13 && LA7_0<=14)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalFormular.g:744:3: rule__Factor__Group_1__0
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
    // InternalFormular.g:753:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:757:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // InternalFormular.g:758:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalFormular.g:765:1: rule__Factor__Group_1__0__Impl : ( ( rule__Factor__OpAssignment_1_0 ) ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:769:1: ( ( ( rule__Factor__OpAssignment_1_0 ) ) )
            // InternalFormular.g:770:1: ( ( rule__Factor__OpAssignment_1_0 ) )
            {
            // InternalFormular.g:770:1: ( ( rule__Factor__OpAssignment_1_0 ) )
            // InternalFormular.g:771:2: ( rule__Factor__OpAssignment_1_0 )
            {
             before(grammarAccess.getFactorAccess().getOpAssignment_1_0()); 
            // InternalFormular.g:772:2: ( rule__Factor__OpAssignment_1_0 )
            // InternalFormular.g:772:3: rule__Factor__OpAssignment_1_0
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
    // InternalFormular.g:780:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:784:1: ( rule__Factor__Group_1__1__Impl )
            // InternalFormular.g:785:2: rule__Factor__Group_1__1__Impl
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
    // InternalFormular.g:791:1: rule__Factor__Group_1__1__Impl : ( ( rule__Factor__RightAssignment_1_1 ) ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:795:1: ( ( ( rule__Factor__RightAssignment_1_1 ) ) )
            // InternalFormular.g:796:1: ( ( rule__Factor__RightAssignment_1_1 ) )
            {
            // InternalFormular.g:796:1: ( ( rule__Factor__RightAssignment_1_1 ) )
            // InternalFormular.g:797:2: ( rule__Factor__RightAssignment_1_1 )
            {
             before(grammarAccess.getFactorAccess().getRightAssignment_1_1()); 
            // InternalFormular.g:798:2: ( rule__Factor__RightAssignment_1_1 )
            // InternalFormular.g:798:3: rule__Factor__RightAssignment_1_1
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
    // InternalFormular.g:807:1: rule__Primitive__Group_2__0 : rule__Primitive__Group_2__0__Impl rule__Primitive__Group_2__1 ;
    public final void rule__Primitive__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:811:1: ( rule__Primitive__Group_2__0__Impl rule__Primitive__Group_2__1 )
            // InternalFormular.g:812:2: rule__Primitive__Group_2__0__Impl rule__Primitive__Group_2__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalFormular.g:819:1: rule__Primitive__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primitive__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:823:1: ( ( '(' ) )
            // InternalFormular.g:824:1: ( '(' )
            {
            // InternalFormular.g:824:1: ( '(' )
            // InternalFormular.g:825:2: '('
            {
             before(grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalFormular.g:834:1: rule__Primitive__Group_2__1 : rule__Primitive__Group_2__1__Impl rule__Primitive__Group_2__2 ;
    public final void rule__Primitive__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:838:1: ( rule__Primitive__Group_2__1__Impl rule__Primitive__Group_2__2 )
            // InternalFormular.g:839:2: rule__Primitive__Group_2__1__Impl rule__Primitive__Group_2__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalFormular.g:846:1: rule__Primitive__Group_2__1__Impl : ( ruleExpression ) ;
    public final void rule__Primitive__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:850:1: ( ( ruleExpression ) )
            // InternalFormular.g:851:1: ( ruleExpression )
            {
            // InternalFormular.g:851:1: ( ruleExpression )
            // InternalFormular.g:852:2: ruleExpression
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
    // InternalFormular.g:861:1: rule__Primitive__Group_2__2 : rule__Primitive__Group_2__2__Impl ;
    public final void rule__Primitive__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:865:1: ( rule__Primitive__Group_2__2__Impl )
            // InternalFormular.g:866:2: rule__Primitive__Group_2__2__Impl
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
    // InternalFormular.g:872:1: rule__Primitive__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primitive__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:876:1: ( ( ')' ) )
            // InternalFormular.g:877:1: ( ')' )
            {
            // InternalFormular.g:877:1: ( ')' )
            // InternalFormular.g:878:2: ')'
            {
             before(grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_2_2()); 
            match(input,16,FOLLOW_2); 
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


    // $ANTLR start "rule__Formula__NameAssignment_0"
    // InternalFormular.g:888:1: rule__Formula__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Formula__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:892:1: ( ( RULE_ID ) )
            // InternalFormular.g:893:2: ( RULE_ID )
            {
            // InternalFormular.g:893:2: ( RULE_ID )
            // InternalFormular.g:894:3: RULE_ID
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
    // InternalFormular.g:903:1: rule__Formula__VarsAssignment_2_0 : ( ruleVariable ) ;
    public final void rule__Formula__VarsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:907:1: ( ( ruleVariable ) )
            // InternalFormular.g:908:2: ( ruleVariable )
            {
            // InternalFormular.g:908:2: ( ruleVariable )
            // InternalFormular.g:909:3: ruleVariable
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
    // InternalFormular.g:918:1: rule__Formula__VarsAssignment_2_1_1 : ( ruleVariable ) ;
    public final void rule__Formula__VarsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:922:1: ( ( ruleVariable ) )
            // InternalFormular.g:923:2: ( ruleVariable )
            {
            // InternalFormular.g:923:2: ( ruleVariable )
            // InternalFormular.g:924:3: ruleVariable
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
    // InternalFormular.g:933:1: rule__Formula__ExpAssignment_5 : ( ruleExpression ) ;
    public final void rule__Formula__ExpAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:937:1: ( ( ruleExpression ) )
            // InternalFormular.g:938:2: ( ruleExpression )
            {
            // InternalFormular.g:938:2: ( ruleExpression )
            // InternalFormular.g:939:3: ruleExpression
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
    // InternalFormular.g:948:1: rule__Expression__LeftAssignment_0 : ( ruleFactor ) ;
    public final void rule__Expression__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:952:1: ( ( ruleFactor ) )
            // InternalFormular.g:953:2: ( ruleFactor )
            {
            // InternalFormular.g:953:2: ( ruleFactor )
            // InternalFormular.g:954:3: ruleFactor
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
    // InternalFormular.g:963:1: rule__Expression__OpAssignment_1_0 : ( ruleOp1 ) ;
    public final void rule__Expression__OpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:967:1: ( ( ruleOp1 ) )
            // InternalFormular.g:968:2: ( ruleOp1 )
            {
            // InternalFormular.g:968:2: ( ruleOp1 )
            // InternalFormular.g:969:3: ruleOp1
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
    // InternalFormular.g:978:1: rule__Expression__RightAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__Expression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:982:1: ( ( ruleExpression ) )
            // InternalFormular.g:983:2: ( ruleExpression )
            {
            // InternalFormular.g:983:2: ( ruleExpression )
            // InternalFormular.g:984:3: ruleExpression
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
    // InternalFormular.g:993:1: rule__Factor__LeftAssignment_0 : ( rulePrimitive ) ;
    public final void rule__Factor__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:997:1: ( ( rulePrimitive ) )
            // InternalFormular.g:998:2: ( rulePrimitive )
            {
            // InternalFormular.g:998:2: ( rulePrimitive )
            // InternalFormular.g:999:3: rulePrimitive
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
    // InternalFormular.g:1008:1: rule__Factor__OpAssignment_1_0 : ( ruleOp2 ) ;
    public final void rule__Factor__OpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:1012:1: ( ( ruleOp2 ) )
            // InternalFormular.g:1013:2: ( ruleOp2 )
            {
            // InternalFormular.g:1013:2: ( ruleOp2 )
            // InternalFormular.g:1014:3: ruleOp2
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
    // InternalFormular.g:1023:1: rule__Factor__RightAssignment_1_1 : ( ruleFactor ) ;
    public final void rule__Factor__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:1027:1: ( ( ruleFactor ) )
            // InternalFormular.g:1028:2: ( ruleFactor )
            {
            // InternalFormular.g:1028:2: ( ruleFactor )
            // InternalFormular.g:1029:3: ruleFactor
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
    // InternalFormular.g:1038:1: rule__Number__ValAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:1042:1: ( ( RULE_INT ) )
            // InternalFormular.g:1043:2: ( RULE_INT )
            {
            // InternalFormular.g:1043:2: ( RULE_INT )
            // InternalFormular.g:1044:3: RULE_INT
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
    // InternalFormular.g:1053:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormular.g:1057:1: ( ( RULE_ID ) )
            // InternalFormular.g:1058:2: ( RULE_ID )
            {
            // InternalFormular.g:1058:2: ( RULE_ID )
            // InternalFormular.g:1059:3: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});

}