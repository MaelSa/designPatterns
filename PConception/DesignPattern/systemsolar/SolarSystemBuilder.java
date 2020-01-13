package DesignPattern.systemsolar;

import java.util.ArrayList;
import java.util.List;

public class SolarSystemBuilder {
	
	private Star sun;
	private List<Planet> ps;
	
	public SolarSystemBuilder() {
		this.ps = new ArrayList<Planet>();
	}
	
	public SolarSystemBuilder setStar(Star s) {
		this.sun = s;
		return this;
	}
	
	public SolarSystemBuilder addPlanet(Planet p) {
		ps.add(p);
		return this;
	}

	public SolarSysteme build() {
		SolarSysteme solarSysteme = new SolarSysteme(sun);
		for(Planet p:ps) sun.addPlanet(p);
		return solarSysteme;
	}
}
