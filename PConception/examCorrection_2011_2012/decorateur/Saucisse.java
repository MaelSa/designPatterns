package examCorrection_2011_2012.decorateur;


public class Saucisse extends Ingredient {
	public Saucisse(RecetteChoucroute ingredient){
		super(ingredient);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Saucisse "+ this.ingredient;
	}
}
