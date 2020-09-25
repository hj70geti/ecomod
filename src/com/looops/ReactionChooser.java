package com.looops;

import java.util.List;
import java.util.function.BiFunction;

public class ReactionChooser {

	public List<Action> chooseTool(Person person, Context context, List<RatedAction> availableTools) {

		BiFunction<Context,List<RatedAction>,List<Action>> chooser = person.getActionChooser();

		return chooser.apply(context,availableTools);
	}
}
