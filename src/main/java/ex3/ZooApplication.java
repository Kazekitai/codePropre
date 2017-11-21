package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");

		zoo.addAnimal(new Animal("Gazelle", Type.MAMMIFERE, Comportement.HERBIVORE));
		zoo.addAnimal(new Animal("Zèbre", Type.MAMMIFERE, Comportement.HERBIVORE));
		zoo.addAnimal(new Animal("Lion", Type.MAMMIFERE, Comportement.CARNIVORE));
		zoo.addAnimal(new Animal("Panthère",Type.MAMMIFERE, Comportement.CARNIVORE));
		zoo.addAnimal(new Animal("Requin blanc", Type.POISSON, Comportement.HERBIVORE));
		zoo.addAnimal(new Animal("Truite dorée", Type.POISSON, Comportement.HERBIVORE));
		zoo.addAnimal(new Animal("Boa constrictor", Type.SERPENT, Comportement.CARNIVORE));
		zoo.addAnimal(new Animal("Python", Type.SERPENT, Comportement.CARNIVORE));

		zoo.afficherListeAnimaux();
	}

}
