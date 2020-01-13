package com.company;

public class BinExpression extends Expression {
	Expression rhs, lhs;
	String operator;

	public BinExpression(Expression l, String o, /*java.lang.*/Integer r){
		this.lhs =l;
		this.operator =o;
		this.rhs =r;
	}
	public void accept(Visitor v){
	    v.visit(this);
	}

	public Expression getLhs() {
		return lhs;
	}



	public void setLhs(Expression lhs) {
		this.lhs = lhs;
	}



	public String getOperator() {
		return operator;
	}



	public void setOperator(String operator) {
		this.operator = operator;
	}



	public Expression getRhs() {
		return rhs;
	}



	public void setRhs(Expression rhs) {
		this.rhs = rhs;
	}

}
