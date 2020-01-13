package DesignPattern.algebreboole;

public class ModelisationV2 extends Visitor {

	private StringBuffer buff;
	
	public ModelisationV2() {
		this.buff = new StringBuffer();
	}
	
	@Override
	public void visit(BinExpression exp) {
		buff.append('(');
		exp.getLeftExp().accept(this);
		buff.append(' ').append(exp.getO().name()).append(' ');
		exp.getRightExp().accept(this);
		buff.append(')');
		
	}

	@Override
	public void visit(Bool exp) {
		buff.append(exp.getB().name());
	}

	@Override
	public void visit(NonOperator exp) {
		buff.append(exp.getOp().name()).append('(');
		exp.getExp().accept(this);
		buff.append(')');
	}

	@Override
	public String toString() {
		return buff.toString();
	}
}
