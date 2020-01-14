package DesignPattern.algebreboole;

public class ModelisationInC extends Visitor {

	private StringBuffer buff;
	
	public ModelisationInC() {
		this.buff = new StringBuffer();
	}
	
	@Override
	public void visit(BinExpression exp) {
		buff.append('(');
		exp.getLeftExp().accept(this);
		String str = "";
		switch (exp.getO()) {
		case ET:
			str = "&&";
			break;
		case OU:
			str = "||";
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
			str = "1";
			break;
		case Faux:
			str = "0";
			break;
		default:
			break;
		}
		buff.append(str);
	}

	@Override
	public void visit(NonOperator exp) {
		buff.append("!");
		exp.getExp().accept(this);
	}
	
	@Override
	public String toString() {
		return buff.toString();
	}
}
