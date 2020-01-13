package tp1;

import java.util.*;

public class Test {
	public static void main(String[] argv){
		Statement p = new Assignment(
				new VariableRef("x"),
				new BinExpression( new VariableRef("y"), "+", new Integer(1)));
		ArrayList<Statement> list = new ArrayList<Statement>();
		list.add(p);

		Statement p2 = new Assignment(
				new VariableRef("x"),
				new BinExpression( new VariableRef("y"), "+", new Integer(2)));
		ArrayList<Statement> list2 = new ArrayList<Statement>();
		Statement p3 = new Print(new Integer(5));

		Block bruh = new Block(list2);
		Statement w = new While(
				new BinExpression( new VariableRef("x"), "==", new Integer(0)), bruh
		);
		ArrayList<Statement> list3 = new ArrayList<Statement>();
		Block wtf = new Block(list3);
		Block pkMoa = new Block(list3);
		Statement c = new Conditional(
				new BinExpression( new VariableRef("x"), ">", new Integer(15)),
				wtf, pkMoa
		);


		list.add(p2);
		list.add(p3);
		list.add(w);
		list.add(c);
		Block oskour = new Block(list);
		CodeGenerator cg = new CodeGenerator(oskour);

		System.out.println(cg.buffer);
	
	}
}
