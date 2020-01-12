package VisitorMat;

public interface IVisitor {
	abstract void visit(Assignment n);
	abstract void visit(Print n);
	abstract void visit(Read n);
	abstract void visit(Block n);
	abstract void visit(BinExpression n);
	abstract void visit(Integer n);
	abstract void visit(VariableRef n);
	abstract void visit(Conditional n);
	
}
