package VisitorMat;


public class VariableRef extends Expression {
	private String name;
	
	public VariableRef(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	void accept(IVisitor v) {
		v.visit(this);
		
	}
	

}
