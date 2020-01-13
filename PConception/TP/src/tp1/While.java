package tp1;

public class While extends Statement {
    Expression cond;
    Block body;

    While(Expression e, Block b){
        this.cond = e;
        this.body = b;
    }
    public Expression getCond(){return this.cond;}
    public Block getBody(){return this.body;}

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
