package VisitorMat;

public class Read extends Statement {
	private VariableRef var;

	public VariableRef getVar() {
		return var;
	}

	public void setVar(VariableRef var) {
		this.var = var;
	}

	
	@Override
	public void accept(IVisitor v) {
		v.visit(this);
		
	}
}
