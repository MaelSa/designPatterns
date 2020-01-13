package examCorrection_2011_2012.decorateur;

public abstract class Ingredient extends RecetteChoucroute {

	protected RecetteChoucroute ingredient;
	
	public Ingredient(RecetteChoucroute ingredient){
		this.ingredient = ingredient;
	}
	
}
