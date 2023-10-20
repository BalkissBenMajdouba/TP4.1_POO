package TpHeritage;

public class Chien extends Animal{
	private String race;
	public Chien() {
		super();
	}
	public Chien(String couleur, int poids,String race ) {
		super( couleur,poids);
		this.race=race;
		
	}
	public void decrisToi() {
		super.decrisToi();
		System.out.println(" il est de couleur: "+couleur);
	}
}
