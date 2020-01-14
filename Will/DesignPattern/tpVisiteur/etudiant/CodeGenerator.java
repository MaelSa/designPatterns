package DesignPattern.tpVisiteur.etudiant;

public class CodeGenerator extends Visitor {

	StringBuffer buff;
	
	public CodeGenerator() {
		this.buff = new StringBuffer();
	}
	
	@Override
	public void visit(Assignment a) {
		a.getVar().accept(this);
		buff.append("=");
		a.getRhs().accept(this);
		buff.append(";\n");
	}

	@Override
	public void visit(BinExpression exp) {
		exp.getLhs().accept(this);
		buff.append(exp.getOperator());
		exp.getRhs().accept(this);
	}

	@Override
	public void visit(Block a) {
		for(Statement tmp: a.getS()) tmp.accept(this);
	}

	@Override
	public void visit(Conditional a) {
		buff.append("if(");
		a.getCond().accept(this);
		buff.append(") {\n");
		a.getThan_part().accept(this);
		buff.append("} else {\n");
		a.getElse_part().accept(this);
		buff.append("}\n");
	}

	@Override
	public void visit(Integer a) {
		buff.append(a.getValue());
	}

	@Override
	public void visit(Print a) {
		buff.append("print(");
		a.getPrint().accept(this);
		buff.append(")\n");
	}

	@Override
	public void visit(Read a) {
		buff.append("read(");
		a.getVar().accept(this);
		buff.append(")\n");
	}

	@Override
	public void visit(VariableRef a) {
		buff.append(a.getName());
	}

	@Override
	public void visit(While a) {
		buff.append("while(");
		a.getCond().accept(this);
		buff.append("){\n");
		a.getBody().accept(this);
		buff.append("}\n");
	}

}
