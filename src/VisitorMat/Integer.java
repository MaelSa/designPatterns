package VisitorMat;

public class Integer extends Expression {
	private int value;
	
	public Integer(int v){
		this.value =v;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	void accept(IVisitor v) {
		v.visit(this);
		
	}
	@Override
	public String toString(){
		return new Integer(this.getValue()).toString();
	}

}
