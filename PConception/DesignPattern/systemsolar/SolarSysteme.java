package DesignPattern.systemsolar;

public class SolarSysteme {

	Star sun;
	
	public SolarSysteme(Star sun) {
		this.sun = sun;
	}
	
	@Override
	public String toString() {
		return this.sun.toString();
	}
}
