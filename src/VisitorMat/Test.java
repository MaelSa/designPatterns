package VisitorMat;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Statement p2 = new Assignment(
				new VariableRef("y"),
				new BinExpression( new VariableRef("x"), "+", new Integer(4)));
		Statement p = new Assignment(
				new VariableRef("y"),
				new BinExpression( new VariableRef("x"), "*", new Integer(4)));

				
				
		ArrayList<Statement> list = new ArrayList<Statement>();
		ArrayList<Statement> list2 = new ArrayList<Statement>();
		list.add(p);
		list2.add(p2);
		Block s = new Block(list);
		Block s2 = new Block(list2);
		Statement test = new Conditional(
				new BinExpression(new VariableRef("x"),"<",new Integer(2))
						, s, s2);
				
		StatVisitor v = new StatVisitor();
		GeneratorVisitor vis = new GeneratorVisitor();
		test.accept(v);
		test.accept(vis);
		//System.out.println(v.toString());
		vis.display();
	

	}

}
