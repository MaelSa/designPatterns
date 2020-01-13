package DesignPattern.systemsolar;

public class Planet {

	String name;
	
	public Planet() {
		name = "lol";
	}
	
	public Planet(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
