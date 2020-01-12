package VisitorMat;

public class GeneratorVisitor implements IVisitor{
	String affichage;
	public GeneratorVisitor() {
		super();
		affichage="";
	}

	@Override
	public void visit(Assignment n) {
		n.getVar().accept(this);
		affichage+=" = ";
		n.getRhs().accept(this);
		
	}

	@Override
	public void visit(Print n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Read n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Block n) {
		for(ProgramNode node : n.getS()){
			node.accept(this);
		}
		
	}

	@Override
	public void visit(BinExpression n) {
		 n.getLhs().accept(this);
		 affichage +=n.getOperator();
		 n.getRhs().accept(this);
		
	}

	@Override
	public void visit(Integer n) {
		affichage+= n.getValue();
		
	}

	@Override
	public void visit(VariableRef n) {
		affichage+=n.getName();
		
	}
	public void display(){
		System.out.println(this.affichage);
	}

	@Override
	public void visit(Conditional n) {
		affichage+="if(";
		n.getCond().accept(this);
		affichage+="){\n";
		n.getIf_part().accept(this);
		affichage+="}else{\n";
		n.getElse_part().accept(this);
		

	}

}
