package DesignPattern.Fabrique;

public class FacoryBatmanVsJoker extends AbstactFactory<Batman,Joker> {

	@Override
	public Combat<Batman,Joker> creatVs() {
		return new BatmanVsJoker(new Batman(), new Joker());
	}
}
