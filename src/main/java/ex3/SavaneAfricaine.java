package ex3;

import java.util.ArrayList;
import java.util.List;

public class SavaneAfricaine implements IZone {

	/* ATTRIBUTS */

	/**
	 * Liste des animaux dans l'aquarium
	 */
	private List<Animal> liste = new ArrayList<Animal>();

	/* CONSTRUCTEUR */

	/**
	 * Constructeur par défaut
	 */
	public SavaneAfricaine() {
	}

	/* METHODES */

	/**
	 * Ajoute un animal dans l'aquarium
	 */
	public void addAnimal(Animal animal) {
		if (animal.getType() == Type.MAMMIFERE && animal.getComportement() == Comportement.HERBIVORE) {
			liste.add(animal);
		}
	}

	/**
	 * Affiche la liste des animaux présents dans l'aquarium
	 */
	public void afficherListeAnimaux() {
		System.out.println("\n**** Les animaux de la savane africaine ****");
		if (liste != null) {
			liste.stream().forEach(a -> System.out.println(a.getNom()));
		}
	}

	/**
	 * Calcul le poids de la nourriture par jour (en Kgs)
	 */
	public double calculerKgsNourritureParJour() {
		return liste.size() * 10;
	}
}
