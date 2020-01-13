package tp1;

public class Conditional extends Statement {
    Expression cond;
    Block then;
    Block els;

    Conditional(Expression e, Block b1, Block b2){
        this.cond = e;
        this.then = b1;
        this.els = b2;
    }
    public Expression getCond(){return this.cond;}
    public Block getThen(){return this.then;}
    public Block getElse(){return this.els;}

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
