package strategy.behaviours;

import strategy.behavioursInterfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
	public void quack() {
		System.out.println("Squeak");
	}
}
