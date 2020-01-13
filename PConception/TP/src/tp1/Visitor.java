package tp1;

public abstract class Visitor {
    public abstract void visit(Assignment node);
    public abstract void visit(Conditional node);
    public abstract void visit(Read node);
    public abstract void visit(Print node);
    public abstract void visit(While node);
    public abstract void visit(Block node);
    public abstract void visit(BinExpression node);
    public abstract void visit(VariableRef node);
    public abstract void visit(Integer node);
}
