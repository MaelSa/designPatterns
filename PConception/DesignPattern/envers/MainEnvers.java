package DesignPattern.envers;

public class MainEnvers {

	public static void main(String[] args) {
		FactoryEnvers e = new FactoryEnvers();
		e.creatEnvers("hello w").afficher();
		e.creatEnvers("hello the world it's test").afficher();
	}

}
