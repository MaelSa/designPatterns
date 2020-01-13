package com.company;

public class Assignment extends Statement {
	Expression rhs;
	VariableRef var;

	public Assignment(VariableRef var, Expression rhs) {
		super();
		this.rhs = rhs;
		this.var = var;
	}

	public void accept(Visitor v){
		v.visit(this);
	}
	public Expression getRhs() {
		return rhs;
	}

	public void setRhs(Expression rhs) {
		this.rhs = rhs;
	}

	public VariableRef getVar() {
		return var;
	}

	public void setVar(VariableRef var) {
		this.var = var;
	}

	@Override
	public String toString() {
		return var.toString()+" = "+rhs.toString();
	}
}
