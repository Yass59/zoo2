package animalvolant;


import fr.aberwag.zoo.animal.animalsautant.AnimalQuiPeutSauter;

public class animalquipeuvoler extends AnimalQuiPeutSauter {

	public animalquipeuvoler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public animalquipeuvoler(String nom, String race, int poids, int age, String couleur, boolean griffes) {
		super(nom, race, poids, age, couleur, griffes);
		// TODO Auto-generated constructor stub
	}
	
	
	public void voler() {
		System.out.println("Je peux voler!!");
	}


}
