package TpHeritage;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] A= new Animal[3];
		A[0]= new Animal("red",20);
		A[1]= new Chat("red",20,false);
		A[2]= new Chien("red",20,"caniche");
		for (int i = 0; i < A.length; i++) {
			if (A[i] != null)
			A[i].decrisToi();
			 if (A[i] instanceof Chien) {
                 System.out.println("C'est un Chien ! ");
             } else
             {
                 System.out.println("C'est une Chat !");
             }
		}
		
	}

}
