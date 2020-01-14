package DesignPattern.state;

public abstract class AbstactStatV2 {
	protected Context ctx;
	
	public AbstactStatV2(Context ctx) {
		this.ctx = ctx;
	}
	
	public abstract void a();
	public abstract void b();
}
