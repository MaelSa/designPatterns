package DesignPattern.tpVisiteur.etudiant;

public class Conditional extends Statement {
	private Expression cond;
	private Block than_part;
	private Block else_part;
	
	public Conditional(Expression cond, Block than_part, Block else_part) {
		this.cond = cond;
		this.than_part = than_part;
		this.else_part = else_part;
	}

	public Expression getCond() {
		return cond;
	}

	public void setCond(Expression cond) {
		this.cond = cond;
	}

	public void setThan_part(Block than_part) {
		this.than_part = than_part;
	}

	public void setElse_part(Block else_part) {
		this.else_part = else_part;
	}

	public Block getThan_part() {
		return than_part;
	}

	public Block getElse_part() {
		return else_part;
	}
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
