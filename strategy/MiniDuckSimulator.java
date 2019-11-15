package strategy;

import strategy.abstractModel.Duck;
import strategy.behaviours.FlyRocketPowered;
import strategy.ducksModel.*;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {

		System.out.println("\n-------------------- RubberDuck");
		RubberDuck rubberDuckie = new RubberDuck();
		rubberDuckie.performQuack();

		System.out.println("\n-------------------- MallardDuck");
		MallardDuck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();

		System.out.println("\n-------------------- DecoyDuck");
		DecoyDuck decoy = new DecoyDuck();
		decoy.performQuack();

		System.out.println("\n-------------------- ModelDuck");
		Duck model = new ModelDuck();
		model.performFly();


		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
