package main.java.com.simulator.version4;


import java.util.HashMap;
import main.java.com.simulator.version4.ducks.Duck;
import main.java.com.simulator.version4.ducks.MallardDuck;
import main.java.com.simulator.version4.ducks.RedheadDuck;
import main.java.com.simulator.version4.ducks.RubberDuck;

/**
 * @version 4.0.0
 */
public class MiniDuckSimulator {

  private static final String NEXT_LINE = "\n";

  public static void main(String[] args) {
    var ducksContainer = new HashMap<String, Duck>();

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
  }
}
