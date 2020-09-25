package com.ecomod.innerer_faktor;

import java.time.LocalDate;

/**
 * an den Erfolg der eigenen Handlungen glauben, wenn ein Handlung vollzogen wurde und das Ergebnis feststeht, wie sehr glaube ich, dass ich ursächlich war?
 * und nicht der Zufall oder andere Leute?*
 */
public class Selbstwirksamkeit implements InnererFaktor {

	private boolean beiErfolg;// oder bei misserfolg ==false
	private LocalDate zeitpunktVon;
	private LocalDate zeitpunktBis;

	/* -5 -4 -3 -2 -1 0 1 2 3 4 5 */
	private Integer durchschnittSelbstbericht;

	private Double durchschnittFremdbericht;

	private Double durchschnittGemessen;
}
