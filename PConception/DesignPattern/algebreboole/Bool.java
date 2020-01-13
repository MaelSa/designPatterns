package DesignPattern.algebreboole;

public class Bool extends Expression{

	private ValVeriter b;
	
	public Bool(ValVeriter b) {
		this.setB(b);
	}

	public ValVeriter getB() {
		return b;
	}

	public void setB(ValVeriter b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return new StringBuffer().append(b.name()).toString();
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
