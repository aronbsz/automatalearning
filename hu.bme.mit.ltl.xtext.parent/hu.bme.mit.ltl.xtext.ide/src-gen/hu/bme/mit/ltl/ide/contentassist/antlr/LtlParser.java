/*
 * generated by Xtext 2.20.0
 */
package hu.bme.mit.ltl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import hu.bme.mit.ltl.ide.contentassist.antlr.internal.InternalLtlParser;
import hu.bme.mit.ltl.services.LtlGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class LtlParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(LtlGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, LtlGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getArrowExpressionAccess().getAlternatives_1(), "rule__ArrowExpression__Alternatives_1");
			builder.put(grammarAccess.getFutureGloballyExpressionAccess().getAlternatives(), "rule__FutureGloballyExpression__Alternatives");
			builder.put(grammarAccess.getNextExpressionAccess().getAlternatives(), "rule__NextExpression__Alternatives");
			builder.put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
			builder.put(grammarAccess.getLiteralExpressionAccess().getAlternatives(), "rule__LiteralExpression__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getArrowExpressionAccess().getGroup(), "rule__ArrowExpression__Group__0");
			builder.put(grammarAccess.getArrowExpressionAccess().getGroup_1_0(), "rule__ArrowExpression__Group_1_0__0");
			builder.put(grammarAccess.getArrowExpressionAccess().getGroup_1_1(), "rule__ArrowExpression__Group_1_1__0");
			builder.put(grammarAccess.getOrExpressionAccess().getGroup(), "rule__OrExpression__Group__0");
			builder.put(grammarAccess.getOrExpressionAccess().getGroup_1(), "rule__OrExpression__Group_1__0");
			builder.put(grammarAccess.getAndExpressionAccess().getGroup(), "rule__AndExpression__Group__0");
			builder.put(grammarAccess.getAndExpressionAccess().getGroup_1(), "rule__AndExpression__Group_1__0");
			builder.put(grammarAccess.getUntilExpressionAccess().getGroup(), "rule__UntilExpression__Group__0");
			builder.put(grammarAccess.getUntilExpressionAccess().getGroup_1(), "rule__UntilExpression__Group_1__0");
			builder.put(grammarAccess.getFutureGloballyExpressionAccess().getGroup_0(), "rule__FutureGloballyExpression__Group_0__0");
			builder.put(grammarAccess.getFutureGloballyExpressionAccess().getGroup_1(), "rule__FutureGloballyExpression__Group_1__0");
			builder.put(grammarAccess.getNextExpressionAccess().getGroup_0(), "rule__NextExpression__Group_0__0");
			builder.put(grammarAccess.getPrimaryExpressionAccess().getGroup_0(), "rule__PrimaryExpression__Group_0__0");
			builder.put(grammarAccess.getPrimaryExpressionAccess().getGroup_1(), "rule__PrimaryExpression__Group_1__0");
			builder.put(grammarAccess.getFalseExpressionAccess().getGroup(), "rule__FalseExpression__Group__0");
			builder.put(grammarAccess.getTrueExpressionAccess().getGroup(), "rule__TrueExpression__Group__0");
			builder.put(grammarAccess.getAtomicPropositionAccess().getGroup(), "rule__AtomicProposition__Group__0");
			builder.put(grammarAccess.getArrowExpressionAccess().getRightOperandAssignment_1_0_2(), "rule__ArrowExpression__RightOperandAssignment_1_0_2");
			builder.put(grammarAccess.getArrowExpressionAccess().getRightOperandAssignment_1_1_2(), "rule__ArrowExpression__RightOperandAssignment_1_1_2");
			builder.put(grammarAccess.getOrExpressionAccess().getRightOperandAssignment_1_2(), "rule__OrExpression__RightOperandAssignment_1_2");
			builder.put(grammarAccess.getAndExpressionAccess().getRightOperandAssignment_1_2(), "rule__AndExpression__RightOperandAssignment_1_2");
			builder.put(grammarAccess.getUntilExpressionAccess().getRightOperandAssignment_1_2(), "rule__UntilExpression__RightOperandAssignment_1_2");
			builder.put(grammarAccess.getFutureGloballyExpressionAccess().getOperandAssignment_0_2(), "rule__FutureGloballyExpression__OperandAssignment_0_2");
			builder.put(grammarAccess.getFutureGloballyExpressionAccess().getOperandAssignment_1_2(), "rule__FutureGloballyExpression__OperandAssignment_1_2");
			builder.put(grammarAccess.getNextExpressionAccess().getOperandAssignment_0_2(), "rule__NextExpression__OperandAssignment_0_2");
			builder.put(grammarAccess.getPrimaryExpressionAccess().getOperandAssignment_1_2(), "rule__PrimaryExpression__OperandAssignment_1_2");
			builder.put(grammarAccess.getAtomicPropositionAccess().getPropositionAssignment_1(), "rule__AtomicProposition__PropositionAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private LtlGrammarAccess grammarAccess;

	@Override
	protected InternalLtlParser createParser() {
		InternalLtlParser result = new InternalLtlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public LtlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LtlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
