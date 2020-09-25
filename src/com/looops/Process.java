package com.looops;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Process {

	private int id;

	private StimulusInterpretation reactionJugdement = new StimulusInterpretation();
	private ReactionChooser        reactionChooser   = new ReactionChooser();



	List<Action> ticStimulsResponse(Person person, Context ignoreContext, List<Stimulus> stimuli){
		


		BiFunction<Context, List<RatedAction>, List<Action>> actionChooser = person.getActionChooser();


		// no modulation
        List<Action> actions = actionChooser.apply(context, action);


		return actions;
	}



	void doProcess(Person person, List<Stimulus> stimuli, List<InternalSituation> internals) {

		// 1. saliencing (unconsciously modulation by internal factors)
		stimuli = StimulusPerception.saliencing(person, stimuli, internals);

		// 2. Beginne mit der Handlungsvorbereitung


		// progronsiziere wahrscheinlichte Zukunft und bereite alles vor

		// Simuli aktivieren Gedanken , wünsche absichten ziele




		Context context = new Context();
		List<Action> tools = new ArrayList<>();

		// Bewertung
		List<RatedAction> jugdedTools = reactionJugdement.interprete(person, context, tools);

		// Handlungs-Vorbereitung
		List<Action> choosenTools = reactionChooser.chooseTool(person, context, jugdedTools);

		// handlung (automatisch)
		
		// Interaktion mit anderen Personen/ Situationen


	}

	// Contingenz  Verknüpfung / Regelhaftigkeit

	// Es geht ein Strom von Situationen ein -> parallelInformation, von möglichen Ursachen (einfach mustererkennung == Kontingenz, neuartigkeit
}
