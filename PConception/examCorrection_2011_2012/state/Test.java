package examCorrection_2011_2012.state;

public class Test {
	public static void main(String[] args) {
		
		Telephone telephone = new Telephone();
		
		telephone.action();
		telephone.tempsInactionDepasse();
		telephone.eteindre();
		telephone.allumer();
		telephone.tempsInactionDepasse();
		telephone.eteindre();
		telephone.action();
		telephone.action();
		telephone.tempsInactionDepasse();
		telephone.allumer();
		telephone.action();
		telephone.eteindre();
	}
}
