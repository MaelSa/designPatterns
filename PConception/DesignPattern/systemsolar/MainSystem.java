package DesignPattern.systemsolar;

public class MainSystem {

	public static void main(String[] args) {
		SolarSysteme s = new SolarSystemBuilder().setStar(new Star()).addPlanet(new Planet()).addPlanet(new Planet("test")).build();
		System.out.println(s.toString());
	}
}
