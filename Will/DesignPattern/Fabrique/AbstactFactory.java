package DesignPattern.Fabrique;

public abstract class AbstactFactory<G extends Gentil,M extends Mechant> {

	public abstract Combat<G,M> creatVs();
}
