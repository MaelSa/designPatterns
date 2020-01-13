package com.company;

public class Read extends Statement {
	VariableRef var;
	public void accept(Visitor v){
		v.visit(this);
	}
	public VariableRef getVar() {
		return var;
	}

	public void setVar(VariableRef var) {
		this.var = var;
	}

}
