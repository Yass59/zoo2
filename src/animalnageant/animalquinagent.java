package animalnageant;

import fr.aberwag.zoo.animal.Animal;

public class animalquinagent extends Animal {

	public animalquinagent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public animalquinagent(String nom, String race, int poids, int age, String couleur, boolean griffes) {
		super(nom, race, poids, age, couleur, griffes);
		// TODO Auto-generated constructor stub
	}

	public void nager() {
		System.out.println("Je peux nager!!");
	}

}
