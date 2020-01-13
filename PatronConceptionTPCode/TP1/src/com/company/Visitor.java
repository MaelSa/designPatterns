package com.company;

abstract public class Visitor {
    abstract public void visit(BinExpression e);
    abstract public void visit(Integer i);
    abstract public void visit(VariableRef v);
    abstract public void visit(Assignment a);
    abstract public void visit(Conditional c);
    abstract public void visit(Print p);
    abstract public void visit(Read r);
    abstract public void visit(While w);
    abstract public void visit(Block b);
    abstract public void visit(Statement s);
    abstract public void visit(Expression e);
}
