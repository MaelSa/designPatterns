package examCorrection_2011_2012.state;

public class StateEnVeille extends State {

	@Override
	public void allumer(Telephone telephone) {
		System.out.println("State En Veille - rien ne se passe");
	}

	@Override
	public void eteindre(Telephone telephone) {
		System.out.println("State En Veille - passe en action");
		telephone.setCurrentState(ALLUMER);
	}

	@Override
	public void tempsInactionDepasse(Telephone telephone) {
		System.out.println("State En Veille - rien ne se passe");
	}

	@Override
	public void action(Telephone telephone) {
		System.out.println("State En Veille - passe en allumer");
		telephone.setCurrentState(ALLUMER);
	}

}
