package com.company;

import java.util.*;

public class Test {
public static void main(String[] argv){
	Statement p = new Assignment(
			new VariableRef("y"),
			new BinExpression( new VariableRef("x"), "*", new Integer(4)));
	Statement p1 = new Assignment(
			new VariableRef("y"),
			new BinExpression( new VariableRef("x"), "*", new Integer(4)));
	ArrayList<Statement> list = new ArrayList<Statement>();
	list.add(p);
	list.add(p1);


	CodeGenerator codeGenerator = new CodeGenerator();
	((Assignment) p).accept(codeGenerator);
	ProgramNode s = new Block(list);
	((Block) s).accept(codeGenerator);

	Statement p2 = new Conditional(new BinExpression(new VariableRef("z"), "==", new Integer(5)),
			((Block) s), ((Block) s));
	((Conditional) p2).accept(codeGenerator);
}
}
