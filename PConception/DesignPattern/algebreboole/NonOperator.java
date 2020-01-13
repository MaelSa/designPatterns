package DesignPattern.algebreboole;

public class NonOperator extends Expression {
	
	private Expression exp;
	
	public NonOperator(Expression exp) {
		this.setExp(exp);
	}

	public SimpleOperator getOp() {
		return SimpleOperator.NON;
	}
	
	public Expression getExp() {
		return exp;
	}

	public void setExp(Expression exp) {
		this.exp = exp;
	}
	
	@Override
	public String toString() {
		return getOp().name() + " " + exp.toString();
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);		
	}
}
