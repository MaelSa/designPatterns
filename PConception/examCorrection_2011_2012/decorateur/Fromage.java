package examCorrection_2011_2012.decorateur;

public class Fromage extends Ingredient {

	public Fromage(RecetteChoucroute ingredient) {
		super(ingredient);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Fromage "+ this.ingredient;
	}
	
}
