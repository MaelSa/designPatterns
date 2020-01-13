package com.company;

public class Conditional extends Statement {
    Expression cond;
    Block thenPart;
    Block elsePart;
    public void accept(Visitor v){
        v.visit(thenPart);
        v.visit(elsePart);
        v.visit(cond);
        v.visit(this);
    }
    public Conditional(Expression cond,Block thenPart,Block elsePart){
        this.elsePart = elsePart;
        this.cond = cond;
        this.thenPart = thenPart;
    }
}
