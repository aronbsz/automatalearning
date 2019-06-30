package hu.bme.mit.mealeymodel.dhc.teacher;

import java.util.Collection;
import java.util.List;

/**
 * 
 * @author Aron B.-Szabo
 *
 * @param <HI>	The input type of the Hypothesis
 * @param <HO>	The output type of the Hypothesis
 * @param <H>	The Hypothesis
 */
public abstract class Teacher <HI, HO, H>{
	 
	
	public abstract HO membershipQuery(Collection<? extends HI> sequence);

	public abstract List<? extends String> equivalenceQuery(H hypothesis, Collection<? extends HI> alphabet);
	
}