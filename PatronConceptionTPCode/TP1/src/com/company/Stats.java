package com.company;

public class Stats extends Visitor {
    private int nombreBinExpression;
    private int nombreInteger;
    private int nombreVariableRef;
    private int nombreAssignment;
    private int nombreConditional;
    private int nombrePrint;
    private int nombreRead;
    private int nombreWhile;
    private int nombreBlock;
    private int nombreStatement;
    private int nombreExpression;
    public Stats(){
        nombreAssignment = 0;
        nombreBinExpression = 0;
        nombreInteger = 0;
        nombreConditional = 0;
        nombreVariableRef = 0;
        nombrePrint = 0;
        nombreRead = 0;
        nombreWhile = 0;
        nombreBlock = 0;
        nombreStatement = 0;
        nombreExpression = 0;
    }
    @Override
    public void visit(BinExpression e) {
        nombreBinExpression += 1;
    }

    @Override
    public void visit(Integer i) {
        nombreInteger += 1;
    }

    @Override
    public void visit(VariableRef v) {
        nombreVariableRef += 1;
    }

    @Override
    public void visit(Assignment a) {
        nombreAssignment += 1;
    }

    @Override
    public void visit(Conditional c) {
        nombreConditional += 1;
    }

    @Override
    public void visit(Print p) {
        nombrePrint += 1;
    }

    @Override
    public void visit(Read r) {
        nombreRead += 1;
    }

    @Override
    public void visit(While w) {
        nombreWhile += 1;
    }

    @Override
    public void visit(Block b) {
        nombreBlock += 1;
    }

    @Override
    public void visit(Statement s) {
        nombreStatement += 1;
    }

    @Override
    public void visit(Expression e) {
        nombreExpression += 1;
    }
}
