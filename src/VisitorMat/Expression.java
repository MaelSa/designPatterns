package VisitorMat;


public abstract class Expression extends ProgramNode  {
	abstract void accept(IVisitor v);
}
