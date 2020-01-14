package DesignPattern.Fabrique;

public abstract class Combat<G extends Gentil,M extends Mechant>{

	final G g;
	final M m;
	
	public Combat(G g, M m) {
		this.g = g;
		this.m = m;
	}
	
	@Override
	public String toString() {
		return "Combat [g=" + g.toString() + ", m=" + m.toString() + "]";
	}
}
