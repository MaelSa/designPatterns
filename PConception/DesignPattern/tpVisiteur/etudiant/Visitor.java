package DesignPattern.tpVisiteur.etudiant;

public abstract class Visitor {

	public abstract void visit(Assignment a);
	public abstract void visit(BinExpression exp);
	public abstract void visit(Block a);
	public abstract void visit(Conditional a);
	public abstract void visit(Integer a);
	public abstract void visit(Print a);
	public abstract void visit(Read a);
	public abstract void visit(VariableRef a);
	public abstract void visit(While a);
}
