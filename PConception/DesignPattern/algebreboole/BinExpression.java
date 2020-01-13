package DesignPattern.algebreboole;

public class BinExpression extends Expression{

	private Expression leftExp;
	private BinOperator o;
	private Expression rightExp;
	
	public BinExpression(Expression l, BinOperator ou, Expression r) {
		this.setLeftExp(l);
		this.setO(ou);
		this.setRightExp(r);
	}

	public Expression getLeftExp() {
		return leftExp;
	}

	public void setLeftExp(Expression leftExp) {
		this.leftExp = leftExp;
	}

	public BinOperator getO() {
		return o;
	}

	public void setO(BinOperator o) {
		this.o = o;
	}

	public Expression getRightExp() {
		return rightExp;
	}

	public void setRightExp(Expression rightExp) {
		this.rightExp = rightExp;
	}

	@Override
	public String toString() {
		return "(" + leftExp.toString() + " " + o.toString() + " " + rightExp.toString() + ")";
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
