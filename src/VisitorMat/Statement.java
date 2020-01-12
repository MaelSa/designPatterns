package VisitorMat;

public abstract class Statement extends ProgramNode {
	
	
	public abstract void accept(IVisitor v);
	
}
