package VisitorMat;

/**
 * Conditional
 */
public class Conditional extends Statement{
    private Expression cond;
    private Block if_part;
    private Block else_part;

    public Conditional(Expression cond,Block _if, Block _else){
        super();
        this.cond = cond;
        this.if_part = _if;
        this.else_part = _else;

    }

    
    public Expression getCond() {
        return this.cond;
    }
   
    public Block getElse_part() {
        return this.else_part;
    }
    
    public Block getIf_part() {
        return this.if_part;
    }


    @Override
    public void accept(IVisitor v) {
       v.visit(this);

    }

    
}