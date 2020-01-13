package DesignPattern.tpDecorateur;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		DecorateurListSupprimer<Integer> dls = new DecorateurListSupprimer<Integer>(list);
		dls.add(1);
		dls.clear();
		dls.remove(0);
		System.out.println(dls.list.toString());
		DecoratorListLimiter<Integer> dll = new DecoratorListLimiter<Integer>(list,2);
		dll.add(1);
		dll.add(2);
		dll.add(3);
		dll.clear();
		dll.add(4);
		dll.add(5);
		dll.add(6);
		dll.remove(0);
		dll.add(7);
		System.out.println(dll.list.toString());
	}

}
