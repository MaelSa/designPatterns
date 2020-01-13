package com.company;

public class Integer extends Expression {
	int value;
	public void accept(Visitor v){
		v.visit(this);
	}
	public Integer(int v){
		this.value =v;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
