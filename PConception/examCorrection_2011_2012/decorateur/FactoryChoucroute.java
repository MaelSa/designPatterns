package examCorrection_2011_2012.decorateur;

public abstract class FactoryChoucroute {

	public static RecetteChoucroute getChoucrouteAlsacienne(){
		return new VinBlanc(new Saucisse(new Saindoux(new Lard(new Choucroute()))));
	}
	
	public static RecetteChoucroute getChoucrouteNavets(){
		return new Navets(getChoucrouteAlsacienne());
	}
	
	public static RecetteChoucroute getChoucrouteFruits(){
		return new Lard(new Raisin(new Ananas(new Fromage(new Choucroute()))));
	}
	
}
