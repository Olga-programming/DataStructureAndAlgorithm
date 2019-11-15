package strategy.ducksModel;

import strategy.abstractModel.Duck;
import strategy.behaviours.FlyNoWay;
import strategy.behaviours.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
