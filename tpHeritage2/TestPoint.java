package tpHeritage2;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PointCol p=new PointCol('A',2 , 3, "red");
		p.AfficherPoint();
		p.setCouleur("blue");
		System.out.println("apres la modification : ");
		p.AfficherPoint();
	}

}
