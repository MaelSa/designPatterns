package com.company;

import java.util.*;

public class Block extends Statement {
	ArrayList<Statement> s;

	public Block(ArrayList<Statement> s) {
		super();
		this.s = s;
	}

	public void accept(Visitor v){
		for(Statement statement:s){
			v.visit(statement);
		}
	}
	
	public ArrayList<Statement> getS() {
		return s;
	}


}
