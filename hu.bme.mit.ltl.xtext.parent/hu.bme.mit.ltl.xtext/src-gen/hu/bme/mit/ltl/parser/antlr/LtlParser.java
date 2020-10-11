/*
 * generated by Xtext 2.23.0
 */
package hu.bme.mit.ltl.parser.antlr;

import com.google.inject.Inject;
import hu.bme.mit.ltl.parser.antlr.internal.InternalLtlParser;
import hu.bme.mit.ltl.services.LtlGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class LtlParser extends AbstractAntlrParser {

	@Inject
	private LtlGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalLtlParser createParser(XtextTokenStream stream) {
		return new InternalLtlParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "LTLExpression";
	}

	public LtlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LtlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
