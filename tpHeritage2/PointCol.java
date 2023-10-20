package tpHeritage2;

public class PointCol extends Point {
	public String couleur;
	public PointCol() {
		super();
	}
	public PointCol(char nom, int abscisse,int ordonnee,String couleur) {
		super(nom,abscisse,ordonnee);
		this.couleur=couleur;
		
	}
	public void setCouleur(String couleur) {
		this.couleur=couleur;
	}
	
	/*public String toString() {
		return( "Le point"+super.nom+"["+super.abscisse+","+ super.ordonnee+" est de couleur : "+couleur+")");
	}*/
	public void AfficherPoint() {
		super.afficher();
		System.out.println("elle est de couleur: "+couleur);
		
	}
}
