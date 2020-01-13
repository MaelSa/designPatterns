package DesignPattern.systemsolar;

import java.util.ArrayList;
import java.util.List;

public class Star {

	List<Planet> ps;
	
	public Star() {
		this.ps = new ArrayList<Planet>();
	}
	
	public Star addPlanet(Planet p) {
		this.ps.add(p);
		return this;
	}
	
	@Override
	public String toString() {
		return ps.toString();
	}
}
