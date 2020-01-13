package examCorrection_2011_2012.state;

public class StateAllumer extends State {

	@Override
	public void allumer(Telephone telephone) {
		System.out.println("State Allumer - rien ne se passe");
	}

	@Override
	public void eteindre(Telephone telephone) {
		System.out.println("State Allumer - passe en éteint");
		telephone.setCurrentState(ETEINT);
	}

	@Override
	public void tempsInactionDepasse(Telephone telephone) {
		System.out.println("State Allumer - passe en veille");
		telephone.setCurrentState(VEILLE);
	}

	@Override
	public void action(Telephone telephone) {
		System.out.println("State Allumer - rien ne se passe");
	}

}
