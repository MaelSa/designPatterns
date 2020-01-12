package VisitorMat;


public class Print extends Statement {
	private Expression print;
	
	
	public Print(Expression p){
		this.print = p;
	}

	public Expression getPrint() {
		return print;
	}

	public void setPrint(Expression print) {
		this.print = print;
	}

	@Override
	public void accept(IVisitor v) {
		v.visit(this);
		
	}

	
}
