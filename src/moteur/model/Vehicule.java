package moteur.model;

/**
 * 
 * @author Vehicule model
 * 
 */

public class Vehicule {

	private String name;
	private Moteur moteur;

	
	
	
	public Vehicule() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Moteur getMoteur() {
		return moteur;
	}

	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}

}
