package DesignPattern.state;

public class E3 extends AbstactStatV2 {

	public E3(Context ctx) {
		super(ctx);
	}

	@Override
	public void a() {
		ctx.updateV2(new E3(ctx));
	}

	@Override
	public void b() {
		ctx.updateV2(new E4(ctx));
	}

}
