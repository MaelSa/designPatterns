package DesignPattern.tpVisiteur.etudiant;

public class While extends Statement {

	private Expression cond;
	private Block body;
	
	public While(Expression cond, Block body) {
		this.cond = cond;
		this.body = body;
	}
	
	public Expression getCond() {
		return cond;
	}
	public void setCond(Expression cond) {
		this.cond = cond;
	}
	public Block getBody() {
		return body;
	}
	public void setBody(Block body) {
		this.body = body;
	}
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
