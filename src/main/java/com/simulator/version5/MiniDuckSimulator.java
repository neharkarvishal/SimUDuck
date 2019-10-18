package main.java.com.simulator.version5;


//import java.util.HashMap;

import main.java.com.simulator.version5.behaviors.FlyRocketPowered;
import main.java.com.simulator.version5.ducks.Duck;
import main.java.com.simulator.version5.ducks.MallardDuck;
//import main.java.com.simulator.version5.ducks.RedheadDuck;
//import main.java.com.simulator.version5.ducks.RubberDuck;

/**
 * @version 5.0.0
 */
public class MiniDuckSimulator {

  public static final String NEXT_LINE = "\n";

  public static void main(String[] args) {

    Duck mallard = new MallardDuck();

    mallard.display();
    mallard.performQuack();
    mallard.performFly();
    System.out.println(NEXT_LINE);

    /**
     * through the magic of polymorphism, dynamically assign a different
     * QuackBehavior or FlyBehaviour implementation at runtime
     */
    mallard.setFlyBehavior(new FlyRocketPowered());
    mallard.performFly();

    /*
    HashMap<String, Duck> ducksContainer = new HashMap<String, Duck>();

    ducksContainer.put("MallardDuck", new MallardDuck());
    ducksContainer.put("RedheadDuck", new RedheadDuck());
    ducksContainer.put("RubberDuck", new RubberDuck());

    ducksContainer
        .forEach((duckName, duckObject) -> {
          duckObject.display();
          duckObject.swim();
          duckObject.performQuack();
          duckObject.performFly();
          System.out.println(NEXT_LINE);
        });
    */
  }
}
