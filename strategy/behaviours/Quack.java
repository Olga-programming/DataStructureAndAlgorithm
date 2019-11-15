package strategy.behaviours;

import strategy.behavioursInterfaces.QuackBehavior;

public class Quack implements QuackBehavior {
	public void quack() {
		System.out.println("Quack");
	}
}
