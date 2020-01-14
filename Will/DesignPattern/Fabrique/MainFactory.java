package DesignPattern.Fabrique;

public class MainFactory {
	public static void main(String[] args) {
		AbstactFactory<Batman, Joker> f1 = new FacoryBatmanVsJoker();
		AbstactFactory<Spiderman, SuperBouffon> f2 = new FactorySpidermanVsSuperBouffon();
		AbstactFactory<Superman, CryptonMan> f3 = new FactorySupermanVsCryptonMan();
		
		System.out.println(f1.creatVs().toString());
		System.out.println(f2.creatVs().toString());
		System.out.println(f3.creatVs().toString());
	}
}
