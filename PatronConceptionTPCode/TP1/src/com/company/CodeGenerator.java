package com.company;

public class CodeGenerator extends Visitor {
    @Override
    public void visit(BinExpression b) {
        if(!b.operator.equals("==")){
            b.lhs.accept(this);
            System.out.print(b.operator);
            b.rhs.accept(this);
            System.out.print("\n");
        }else {
            b.lhs.accept(this);
            System.out.print(b.operator);
            b.rhs.accept(this);
        }
    }

    @Override
    public void visit(Integer i) {
        System.out.print(i.value);
    }

    @Override
    public void visit(VariableRef v) {
        System.out.print(v.name);
    }

    @Override
    public void visit(Assignment a) {
        a.var.accept(this);
        System.out.print(" = ");
        a.rhs.accept(this);
    }

    @Override
    public void visit(Conditional c) {
        System.out.print("if(");
        c.cond.accept(this);
        System.out.print("){\n");
        c.thenPart.accept(this);
        System.out.print(" }\nelse{\n");
        c.elsePart.accept(this);
        System.out.print("}\n");
    }

    @Override
    public void visit(Print p) {
        System.out.print("print(");
        p.print.accept(this);
        System.out.print(")");
    }

    @Override
    public void visit(Read r) {
        r.var.accept(this);
    }

    @Override
    public void visit(While w) {
        System.out.print("while (");
        w.cond.accept(this);
        System.out.print("){\n");
        w.body.accept(this);
        System.out.print("\n}\n");
    }

    @Override
    public void visit(Block b) {
        for(Statement statement : b.s){
            statement.accept(this);
        }
    }

    @Override
    public void visit(Statement s) {
        s.accept(this);
    }

    @Override
    public void visit(Expression e) {
        e.accept(this);
    }
}
