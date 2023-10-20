package TpHeritage;

public class Chat extends Animal{
	private boolean sauvage;
	public Chat() {
		super();
	}
	public Chat(String couleur, int poids,boolean sauvage ) {
		super( couleur,poids);
		this.sauvage=sauvage;
		
	}
	public void decrisToi() {
		super.decrisToi();
		System.out.println(" sauvage "+sauvage);
	}
}
