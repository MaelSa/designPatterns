package DesignPattern.envers;

public class FactoryEnvers {

	public Envers creatEnvers(String str) {
		if(str.length() > 10) return new EnversS(str);
		else return new Envers10(str);
	}
}
