package DesignPattern.algebreboole;

public abstract class Visitor {

	public abstract void visit(BinExpression exp);
	public abstract void visit(Bool exp);
	public abstract void visit(NonOperator exp);
}
