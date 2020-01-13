package examCorrection_2011_2012.state;

public abstract class State {
	
	public static final State ALLUMER = new StateAllumer();
	public static final State ETEINT = new StateEteint();
	public static final State VEILLE = new StateEnVeille();
	
	public abstract void allumer(Telephone telephone);
	
	public abstract void eteindre(Telephone telephone);
	
	public abstract void tempsInactionDepasse(Telephone telephone);
	
	public abstract void action(Telephone telephone);
	
}
