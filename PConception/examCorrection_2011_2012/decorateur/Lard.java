package examCorrection_2011_2012.decorateur;

public class Lard extends Ingredient {

	public Lard(RecetteChoucroute ingredient) {
		super(ingredient);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Lard "+ this.ingredient;
	}
	
}
