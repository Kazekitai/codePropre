package ex3;

import java.util.ArrayList;
import java.util.List;

public class ZoneCarnivore implements IZone {

	/* ATTRIBUTS */

	/**
	 * Liste des animaux dans la zone des carnivores
	 */
	private List<Animal> liste = new ArrayList<Animal>();

	/* CONSTRUCTEUR */

	/**
	 * Constructeur par défaut
	 */
	public ZoneCarnivore() {
	}

	/* METHODES */

	/**
	 * Ajoute un animal dans la zone des carnivores
	 */
	public void addAnimal(Animal animal) {
		if (animal.getType() == Type.MAMMIFERE && animal.getComportement() == Comportement.CARNIVORE) {
			liste.add(animal);
		}
	}

	/**
	 * Affiche la liste des animaux présents dans l'aquarium
	 */
	public void afficherListeAnimaux() {
		System.out.println("\n**** Les animaux de la zone des carnivores ****");
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
