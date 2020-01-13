package DesignPattern.envers;

public class Envers10 extends Envers {

	public Envers10(String s) {
		super(s);
	}

	@Override
	public void afficher() {
		System.out.println(buildStr(str.toCharArray(),str.length()-1));
	}
	
	private String buildStr(char[] c, int index) {
		if(index == 0) return c[0]+"";
		else return c[index] + buildStr(c, index-1); //new StringBuffer().append(buildStr(c, index--)).append(c[index]).toString();
	}
}