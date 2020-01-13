package examCorrection_2011_2012.state;

public class Telephone {
	
	private State currentState;
	
	public Telephone(){
		this.currentState = State.ETEINT;
	}
	
	public void allumer(){
		currentState.allumer(this);
	}
	
	public void eteindre(){
		currentState.eteindre(this);
	}
	
	public void tempsInactionDepasse(){
		currentState.tempsInactionDepasse(this);
	}
	
	public void action(){
		currentState.action(this);
	}

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}
}
