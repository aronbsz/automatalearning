package hu.bme.mit.mealeymodel.dhc.teacher;

import java.util.Collection;
import java.util.List;

import hu.bme.mit.mealeymodel.dhc.adapter.StringSequenceToMealeyAdapter;
import hu.bme.mit.mealeymodel.dhc.hypothesis.MealeyMachineHypothesis;

public class MealeyMachineTeacherStringSequenceImpl extends MealeyMachineTeacher{
	
	StringSequenceToMealeyAdapter adapter;
	
	public MealeyMachineTeacherStringSequenceImpl(StringSequenceToMealeyAdapter adapter) {
		this.adapter = adapter;
	}

	@Override
	public String membershipQuery(Collection<? extends String> sequence) {
		return adapter.membershipQuery(sequence);
	}

	@Override
	public List<? extends String> equivalenceQuery(MealeyMachineHypothesis hypothesis, Collection<? extends String> alphabet) {
		return adapter.equivalenceQuery(hypothesis, alphabet);
	}

}