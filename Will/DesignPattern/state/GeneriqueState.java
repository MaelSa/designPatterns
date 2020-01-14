package DesignPattern.state;

import java.util.HashMap;

public class GeneriqueState {
	public interface Script{
		boolean run(GeneriqueState stat);
	}
	
	public final String name;
	public Context ctx;
	private HashMap<Integer, DoubleContaineur<Script, GeneriqueState>> mapNextStat;
	
	public GeneriqueState(String name, Context ctx) {
		this.name = name;
		this.ctx = ctx;
		mapNextStat = new HashMap<Integer, DoubleContaineur<Script, GeneriqueState>>();
	}
	
	public GeneriqueState addState(char c, DoubleContaineur<Script, GeneriqueState> state_script) {
		mapNextStat.put((int)c, state_script);
		return this;
	}
	
	public void update(char c) {
		DoubleContaineur<Script, GeneriqueState> nextState = mapNextStat.getOrDefault((int)c, getDefault(name,ctx));
		nextState.a.run(this);
		ctx.updateV1(nextState.b);
	}
	
	private static DoubleContaineur<Script, GeneriqueState> getDefault(String name, Context ctx){
		Script s = new GeneriqueState.Script() {
			
			@Override
			public boolean run(GeneriqueState stat) {
				System.out.println("puit");
				return false;
			}
		};
		return new DoubleContaineur<Script, GeneriqueState>(s,new GeneriqueState(name, ctx));
	}
}
