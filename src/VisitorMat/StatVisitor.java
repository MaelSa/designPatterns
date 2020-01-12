package VisitorMat;

public class StatVisitor implements IVisitor{
	int nbAsssignment;
	int nbPrint;
	int nbRead;
	
	public StatVisitor() {
		super();
		this.nbPrint=0;
		this.nbRead=0;
		this.nbAsssignment=0;
	}
	@Override
	public void visit(Assignment n) {
		this.nbAsssignment++;
		
	}
	@Override
	public void visit(Print n) {
		this.nbPrint++;
		
	}
	@Override
	public void visit(Read n) {
		this.nbRead++;
		
	}
	@Override
	public void visit(Block n) {
		for(Statement stat : n.getS()) {
			stat.accept(this);
		}
		
	}
	@Override 
	public String toString() {
		return "Assignment "+this.nbAsssignment+"\n"+
							"Print "+this.nbPrint+"\n"+
							"Read " + this.nbRead;
	}
	@Override
	public void visit(BinExpression n) {
		
		
	}
	@Override
	public void visit(Integer n) {
		
		
	}
	@Override
	public void visit(VariableRef n) {
		
		
	}

	@Override
	public void visit(Conditional n) {
		// TODO Auto-generated method stub

	}
}
