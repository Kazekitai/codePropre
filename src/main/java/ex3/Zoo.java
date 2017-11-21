package ex3;

import java.util.HashMap;

public class Zoo {

	private HashMap<String, IZone> zones = new HashMap<String, IZone>();
	private String nom;

	public Zoo(String nom) {
		this.nom = nom;
		zones.put("aquarium", new Aquarium());
		zones.put("carnivore", new ZoneCarnivore());
		zones.put("savane", new SavaneAfricaine());
		zones.put("reptile", new FermeReptile());
	}

	/* METHODES */

	/**
	 * Ajoute un animal dans la zone qui lui ait attribuées selon des critères
	 * d'acceptations
	 * 
	 * @param animal
	 */
	public void addAnimal(Animal animal) {
		zones.entrySet().stream().forEach(z -> z.getValue().addAnimal(animal));
	}

	/**
	 * Affiche la liste des animaux
	 */
	public void afficherListeAnimaux() {
		System.out.println("\n ****** liste des animaux ******");
		zones.entrySet().stream().forEach(z -> z.getValue().afficherListeAnimaux());
	}

	/**
	 * Getter pour le nom de l'animal (espèce)
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            le nom de l'animal (espèce)
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
