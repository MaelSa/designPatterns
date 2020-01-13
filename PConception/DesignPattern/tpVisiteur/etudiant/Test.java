package DesignPattern.tpVisiteur.etudiant;

import java.util.*;

public class Test {
	public static void main(String[] argv){
		Statement p1 = new Assignment(
				new VariableRef("y"), new Integer(4));
		Statement p2 = new Assignment(
				new VariableRef("x"),
				new BinExpression( new VariableRef("y"), "+", new Integer(4)));
		Statement p3b1 = new Assignment(
				new VariableRef("x"),
				new BinExpression( new VariableRef("x"), "+", new Integer(1)));
		ArrayList<Statement> listb1 = new ArrayList<Statement>();
		listb1.add(p3b1);
		Statement p3b2 = new Assignment(
				new VariableRef("x"),
				new BinExpression( new VariableRef("x"), "+", new Integer(2)));
		ArrayList<Statement> listb2 = new ArrayList<Statement>();
		listb2.add(p3b2);
		Statement p3 = new Conditional(
				new BinExpression(new VariableRef("y"), "==", new Integer(10)),
				new Block(listb1), new Block(listb2));
		
		ArrayList<Statement> list = new ArrayList<Statement>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		ProgramNode s = new Block(list);
		CodeGenerator cg = new CodeGenerator();
		cg.visit(new Block(list));
		System.out.println(cg.buff.toString());
	}
}
