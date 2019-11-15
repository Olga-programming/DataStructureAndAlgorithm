package strategy.behaviours;

import strategy.behavioursInterfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly");
	}
}
