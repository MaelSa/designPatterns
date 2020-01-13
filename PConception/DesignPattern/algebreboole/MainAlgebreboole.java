package DesignPattern.algebreboole;

public class MainAlgebreboole {

	public static void main(String[] args) {
		Expression binexp1 = new BinExpression(ValVeriter.Vrai.getBool(), BinOperator.OU, ValVeriter.Faux.getBool());
		Expression binexp2 = new BinExpression(ValVeriter.Faux.getBool(), BinOperator.ET, ValVeriter.Vrai.getBool());
		Expression binexp3 = new BinExpression(binexp1, BinOperator.ET, binexp2);
		BinExpression exp1 = new BinExpression(binexp3, BinOperator.OU, new NonOperator(ValVeriter.Faux.getBool()));
		
		Expression binexp4 = new NonOperator(ValVeriter.Vrai.getBool());
		Expression binexp5 = new NonOperator(ValVeriter.Faux.getBool());
		BinExpression exp2 = new BinExpression(binexp4, BinOperator.OU, binexp5);
		
		ModelisationV1 v1 = new ModelisationV1();
		ModelisationV2 v2 = new ModelisationV2();
		
		ModelisationInC c = new ModelisationInC();
		ModelisationInPython python = new ModelisationInPython();
		
		v1.visit(exp1);
		v2.visit(exp2);
		c.visit(exp1);
		python.visit(exp1);
		
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		System.out.println(c.toString());
		System.out.println(python.toString());

	}

}
