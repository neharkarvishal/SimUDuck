package main.java.com.simulator.version4.ducks;

import main.java.com.simulator.version4.behaviors.FlyNoWay;
import main.java.com.simulator.version4.behaviors.Squeak;

/**
 * Only implement Quackable because Rubber Ducks don't fly.
 *
 * @version 4.0.0
 */
public class RubberDuck extends Duck {

  public RubberDuck() {
    quackBehavior = new Squeak();
    flyBehavior = new FlyNoWay();
  }

  @Override
  public void display() {
    System.out.println("I'm a Rubber duck");
  }

}
