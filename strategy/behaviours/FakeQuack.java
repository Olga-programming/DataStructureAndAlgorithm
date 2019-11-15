package strategy.behaviours;

import strategy.behavioursInterfaces.QuackBehavior;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
