package examCorrection_2011_2012.state;

public class StateEteint extends State {

	@Override
	public void allumer(Telephone telephone) {
		System.out.println("State En éteint - passe en allumer");
		telephone.setCurrentState(ALLUMER);
	}

	@Override
	public void eteindre(Telephone telephone) {
		System.out.println("State En éteint - rien ne se passe");
	}

	@Override
	public void tempsInactionDepasse(Telephone telephone) {
		System.out.println("State En éteint - rien ne se passe");
	}

	@Override
	public void action(Telephone telephone) {
		System.out.println("State En éteint - rien ne se passe");
	}

}
