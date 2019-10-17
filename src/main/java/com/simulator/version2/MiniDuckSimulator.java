package main.java.com.simulator.version2;

import java.util.ArrayList;
import java.util.List;
import main.java.com.simulator.version2.ducks.Duck;
import main.java.com.simulator.version2.ducks.MallardDuck;
import main.java.com.simulator.version2.ducks.RedheadDuck;
import main.java.com.simulator.version2.ducks.RubberDuck;

/**
 * @version 2.0.0
 */
public class MiniDuckSimulator {

  public static final String NEXT_LINE = "\n";

  public static void main(String[] args) {
    List<Duck> ducksContainer = new ArrayList<Duck>();

    ducksContainer.add(new MallardDuck());
    ducksContainer.add(new RedheadDuck());
    ducksContainer.add(new RubberDuck());

    ducksContainer
        .forEach(duck -> {
          duck.display();
          duck.swim();
          duck.quack();
          duck.fly();
          System.out.println(NEXT_LINE);
        });
  }
}
