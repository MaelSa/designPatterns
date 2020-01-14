package DesignPattern.state;

public class E2 extends AbstactStatV2 {

	public E2(Context ctx) {
		super(ctx);
	}

	@Override
	public void a() {
		ctx.updateV2(new E4(ctx));
	}

	@Override
	public void b() {
		ctx.updateV2(new E2(ctx));
	}

}
