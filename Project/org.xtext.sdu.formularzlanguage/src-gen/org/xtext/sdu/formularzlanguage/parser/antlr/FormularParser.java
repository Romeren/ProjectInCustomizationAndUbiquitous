/*
 * generated by Xtext 2.9.2
 */
package org.xtext.sdu.formularzlanguage.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.sdu.formularzlanguage.parser.antlr.internal.InternalFormularParser;
import org.xtext.sdu.formularzlanguage.services.FormularGrammarAccess;

public class FormularParser extends AbstractAntlrParser {

	@Inject
	private FormularGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalFormularParser createParser(XtextTokenStream stream) {
		return new InternalFormularParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Formula";
	}

	public FormularGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FormularGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
