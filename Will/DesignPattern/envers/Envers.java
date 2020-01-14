package DesignPattern.envers;

public abstract class Envers {

	protected String str;
	
	public Envers(String s) {
		this.str = s;
	}
	
	public abstract void afficher();
}
