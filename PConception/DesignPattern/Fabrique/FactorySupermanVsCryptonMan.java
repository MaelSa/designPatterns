package DesignPattern.Fabrique;

public class FactorySupermanVsCryptonMan extends AbstactFactory<Superman,CryptonMan> {

	@Override
	public Combat<Superman,CryptonMan> creatVs() {
		return new SupermanVsCryptonMan(new Superman(), new CryptonMan());
	}
}
