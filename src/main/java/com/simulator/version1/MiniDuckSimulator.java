package main.java.com.simulator.version1;

import java.util.ArrayList;
import java.util.List;
import main.java.com.simulator.version1.ducks.Duck;
import main.java.com.simulator.version1.ducks.MallardDuck;
import main.java.com.simulator.version1.ducks.RedheadDuck;

/**
 * @version 1.0.1
 */
public class MiniDuckSimulator {

  public static final String NEXT_LINE = "\n";

  public static void main(String[] args) {
    List<Duck> ducksContainer = new ArrayList<Duck>();

    ducksContainer.add(new MallardDuck());
    ducksContainer.add(new RedheadDuck());

    ducksContainer
        .forEach(duck -> {
          duck.display();
          duck.swim();
          duck.quack();
          System.out.println(NEXT_LINE);
        });
  }
}
