package com.company;

public class While extends Statement {
    Expression cond;
    Block body;
    public void accept(Visitor v){
        v.visit(cond);
        v.visit(body);
        v.visit(this);
    }
}
