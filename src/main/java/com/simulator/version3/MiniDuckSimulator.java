package main.java.com.simulator.version3;


import java.util.HashMap;
import main.java.com.simulator.version3.ducks.Duck;
import main.java.com.simulator.version3.ducks.MallardDuck;
import main.java.com.simulator.version3.ducks.RedheadDuck;
import main.java.com.simulator.version3.ducks.RubberDuck;

/**
 * @version 3.0.0
 */
public class MiniDuckSimulator {

  public static final String NEXT_LINE = "\n";

  public static void main(String[] args) {
    HashMap<String, Duck> ducksContainer = new HashMap<String, Duck>();

    ducksContainer.put("MallardDuck", new MallardDuck());
    ducksContainer.put("RedheadDuck", new RedheadDuck());
    ducksContainer.put("RubberDuck", new RubberDuck());

    ducksContainer
        .forEach((duckName, duckObject) -> {
          duckObject.display();
          duckObject.swim();
          System.out.println(NEXT_LINE);
        });
  }
}
