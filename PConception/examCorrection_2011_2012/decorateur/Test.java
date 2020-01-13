package examCorrection_2011_2012.decorateur;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RecetteChoucroute recetteAlsacienne = FactoryChoucroute.getChoucrouteAlsacienne();
		System.out.println(recetteAlsacienne);
		
		RecetteChoucroute recetteNavets = FactoryChoucroute.getChoucrouteNavets();
		System.out.println(recetteNavets);
		
		RecetteChoucroute recetteFruit = FactoryChoucroute.getChoucrouteFruits();
		System.out.println(recetteFruit);
		
	}

}
