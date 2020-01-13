package DesignPattern.state;

import DesignPattern.state.GeneriqueState.Script;

public class Context {
	GeneriqueState currentState;
	AbstactStatV2 currentStatV2;
	
	public void updateV2(AbstactStatV2 state) {
		this.currentStatV2 = state;
	}
	
	public void simulV2(String str) {
		for(char c:str.toCharArray()) {
			if(c=='a') currentStatV2.a();
			else if(c=='b') currentStatV2.b();
			else break;
		}
	}

	public void updateV1(GeneriqueState stat) {
		this.currentState = stat;
	}
	
	public void simulV1(String str) {
		for(char c:str.toCharArray()) {
			currentState.update(c);
		}
		System.out.println(currentState.name);
	}
	
	public static void main(String[] args) {
		Context ctx = new Context();
		GeneriqueState e1 = new GeneriqueState("E1", ctx);
		GeneriqueState e2 = new GeneriqueState("E2", ctx);
		GeneriqueState e3 = new GeneriqueState("E3", ctx);
		GeneriqueState e4 = new GeneriqueState("E4", ctx);
		
		Script s1 = new GeneriqueState.Script() {
			
			@Override
			public boolean run(GeneriqueState stat) {
				System.out.println("traitement sur "+stat.name);
				return true;
			}
		};
		
		e1.addState('a', new DoubleContaineur<Script, GeneriqueState>(s1,e2))
		.addState('b', new DoubleContaineur<Script, GeneriqueState>(s1,e3));
		e2.addState('a', new DoubleContaineur<Script, GeneriqueState>(s1,e4))
		.addState('b', new DoubleContaineur<Script, GeneriqueState>(s1,e2));
		e3.addState('a', new DoubleContaineur<Script, GeneriqueState>(s1,e3))
		.addState('b', new DoubleContaineur<Script, GeneriqueState>(s1,e4));
		
		ctx.currentState = e1;
		ctx.simulV1("abba");
		
	}
}
