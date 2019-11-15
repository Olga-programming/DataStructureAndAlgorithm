package strategy.behaviours;

import strategy.behavioursInterfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
	public void fly() {
		System.out.println("I'm flying!!");
	}
}