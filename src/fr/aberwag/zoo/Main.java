


package fr.aberwag.zoo;

import animalnageant.requin;
import animalvolant.aigle;
import fr.aberwag.zoo.animal.Elephant;
import fr.aberwag.zoo.animal.animalsautant.Chat;
import fr.aberwag.zoo.animal.animalsautant.Cheval;
import fr.aberwag.zoo.animal.animalsautant.Chien;

public class Main {

	public static void main(String[] args) {
		Chien rex = 
				new Chien("Rex", "Berger", 15, 12, "Jaune", true);
		
		System.out.println(rex.getRace());
		
		Chat tom =
				new Chat("Tom", "Birman", 8, 6, "Rouge", true);
		System.out.println(tom.getNom());
	
	Cheval ch = 
			new Cheval("Cheval", "Cheval de course", 100, 20, "Gris", false);
	
	System.out.println(ch.getNom());
	
	ch.manger();

	ch.sauter();
	
	Elephant petitElephant = 
			new Elephant("Eleph", "Race des elephants", 1000, 120, "Gris", false);
	System.out.println("Animal: " + petitElephant.getNom());
	petitElephant.courir();
	System.out.println("TOM:");
	tom.sauter();

	
	
	
	// Aigle

		aigle petitAigle = 

				new aigle("grand coeur", "royal", 1, 12, "gris", true);

		

		System.out.println(petitAigle.getNom());

		

		petitAigle.manger();

		petitAigle.sauter();

		petitAigle.voler();

		
	//requin
		
		requin marteau =
				new requin("megalodon", "blanc", 120, 12, "blanc", false);
		
		System.out.println(marteau.getNom());
		
		
		marteau.manger();
	
	
	
	
	
	
	}

}
