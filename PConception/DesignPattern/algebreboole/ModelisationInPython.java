package DesignPattern.algebreboole;

public class ModelisationInPython extends Visitor {

	private StringBuffer buff;
	
	public ModelisationInPython() {
		this.buff = new StringBuffer();
	}
	
	@Override
	public void visit(BinExpression exp) {
		buff.append('(');
		exp.getLeftExp().accept(this);
		String str = "";
		switch (exp.getO()) {
		case ET:
			str = "and";
			break;
		case OU:
			str = "or";
			break;
		default:
			break;
		}
		buff.append(' ').append(str).append(' ');
		exp.getRightExp().accept(this);
		buff.append(')');
		
	}
	
	@Override
	public void visit(Bool exp) {
		String str = "";
		switch (exp.getB()) {
		case Vrai:
			str = "True";
			break;
		case Faux:
			str = "False";
			break;
		default:
			break;
		}
		buff.append(str);
	}

	@Override
	public void visit(NonOperator exp) {
		buff.append("not").append('(');
		exp.getExp().accept(this);
		buff.append(')');
	}
	
	@Override
	public String toString() {
		return buff.toString();
	}
}
