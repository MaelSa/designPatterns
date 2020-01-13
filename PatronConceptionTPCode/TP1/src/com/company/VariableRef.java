package com.company;

public class VariableRef extends Expression {
	String name;
	public void accept(Visitor v){
		v.visit(this);
	}
	public VariableRef(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
