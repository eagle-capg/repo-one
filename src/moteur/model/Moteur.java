package moteur.model;

public class Moteur {

	
	private String nome;
	private int puissance;

	
	
	
	/**
	 * Default constructeur
	 */
	public Moteur() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

}
