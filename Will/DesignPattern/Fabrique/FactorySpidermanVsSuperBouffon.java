package DesignPattern.Fabrique;

public class FactorySpidermanVsSuperBouffon extends AbstactFactory<Spiderman,SuperBouffon> {

	@Override
	public Combat<Spiderman,SuperBouffon> creatVs() {
		return new SpidermanVsSuperBouffon(new Spiderman(), new SuperBouffon());
	}
}