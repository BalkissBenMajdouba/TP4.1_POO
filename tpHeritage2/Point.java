package tpHeritage2;

public class Point {
	char nom; 
	int abscisse;
	int ordonnee;
	 Point(char nom, int abscisse,int ordonnee) {
		this.nom=nom;
		this.abscisse=abscisse;
		this.ordonnee=ordonnee;
	}
	 Point(){
		 this.nom='O';
		 this.abscisse=0;
		 this.ordonnee=0;}
	 Point(Point p){
		 abscisse=p.abscisse;
		 ordonnee=p.ordonnee;
		 nom=p.nom;
	 }
	void afficher() {
		System.out.println("le point : " + nom + "("+abscisse + ","+ordonnee+")");
	}
	void deplacer(int a, int z) {
		abscisse+=a;
		ordonnee+=z;
	}
	void reset() {
		abscisse=0;
		ordonnee=0;
		nom='O';
	}
	@Override
	public String toString() {
		return "Point [nom=" + nom + ", abscisse=" + abscisse + ", ordonnee=" + ordonnee + "]";
	}
	boolean Coincide_v1(Point p) {
		
		if ((this.abscisse==p.abscisse )&& (this.ordonnee==p.ordonnee))
		{
			return true;
			
		}
		else 
			return false;
		
	}
	static boolean Coincide_v2(Point a,Point b ) {
	if ((a.abscisse==b.abscisse )&& (a.ordonnee==b.ordonnee))
	{
		return true;
		
	}
	else 
		return false;
	
}
}
