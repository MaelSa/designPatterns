package DesignPattern.envers;

public class EnversS extends Envers {

	public EnversS(String s) {
		super(s);
	}
	
	@Override
	public void afficher() {
		StringBuffer buff = new StringBuffer();
		for(int i = str.length()-1; i >= 0; i--) buff.append(str.charAt(i));
		System.out.println(buff.toString());
	}

}
