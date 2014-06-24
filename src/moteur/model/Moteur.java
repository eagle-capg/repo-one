package moteur.model;

public class Moteur {

	
	private String nome;
	private String model;
	private int puissance;

	private String color;  
	
	
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


	public String getColor (){
		return   color; 
	}

	public String  toString(){
		return ("name :"+nome+" , model :"+model+" , puissance :"+puissance);
	} 


}
