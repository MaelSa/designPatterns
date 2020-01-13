package DesignPattern.state;

public class E1 extends AbstactStatV2 {

	public E1(Context ctx) {
		super(ctx);
	}

	@Override
	public void a() {
		ctx.updateV2(new E2(ctx));
	}

	@Override
	public void b() {
		ctx.updateV2(new E3(ctx));
	}

}
