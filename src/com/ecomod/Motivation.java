package com.ecomod;

import java.util.List;

import com.ecomod.innerer_faktor.InnererFaktor;

/**
 * Die Motivation ist ein nicht direkt beobachtbares psychologisches Konstrukt, das die Bereitschaft eines Menschen beschreibt, Zeit,
 * Energie und Arbeit zu investieren, um ein bestimmtes Ziel zu erreichen. Wer hoch motiviert ist, strengt sich mehr an, ist ausdauernder,
 * nimmt eher Schmerzen in Kauf und hält auch nach Rückschlägen an seinen Zielen fest.
 * <p>
 * Abzugrenzen ist die Motivation von Motiven. Während die Motivation auf ein bestimmtes Ziel gerichtet ist, von äußeren Faktoren beeinflusst wird,
 * z.B. von einer in Aussicht gestellten Belohnung, und sich schnell ändern kann, wird unter einem Motiv die stabile Neigung einer Person verstanden,
 * ihrem Leben eine bestimmte Richtung zu geben und z.B. bestimmte Lebenssituationen aufzusuchen oder zu meiden. Die Tiefenpsychologie (Psychoanalyse)
 * nimmt an, dass viele grundlegende Motive unbewusst sind, während die Motivation dem Bewusstsein grundsätzlich zugänglich ist.
 *
 * Menschen können entweder intrinsisch (aus sich selbst heraus) oder extrinsisch (durch äußere Anreize) motiviert sein. Intrinsisch motivierte Menschen
 * strengen sich im Durchschnitt mehr an und arbeiten länger an der Erreichung ihrer Ziele.
 *
 * Besonders hoch ist die Motivation bei Menschen, die an den Erfolg der eigenen Handlungen glauben. Auch bei Misserfolgen gelingt es ihnen, die Motivation
 * aufrecht zu erhalten, weil sie die Ursachen für Misserfolg eher im Zufall sehen.
 */
public class Motivation implements NichtBeobachtbar {

	private Mensch  ich;
	private Zeit    zeitBereitschaft;
	private Energie arbeitsBereicthschaft;

	private Ziel                  ziel;
	private List<AeussererFaktor> aeußereFaktoren;
	private List<InnererFaktor>   innererFaktoren;
}
