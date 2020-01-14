package DesignPattern.algebreboole;

public enum ValVeriter {
	Vrai, Faux;
	
	public Bool getBool() {
		return new Bool(this);
	}
}
