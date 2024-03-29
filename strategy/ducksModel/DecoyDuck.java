package strategy.ducksModel;

import strategy.abstractModel.Duck;
import strategy.behaviours.FlyNoWay;
import strategy.behaviours.MuteQuack;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}

	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
