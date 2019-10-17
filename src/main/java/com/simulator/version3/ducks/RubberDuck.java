package main.java.com.simulator.version3.ducks;

import main.java.com.simulator.version3.interfaces.Quackable;

/**
 * Only implement Quackable because Rubber Ducks don't fly.
 *
 * @version 3.0.0
 * @see Quackable
 */
public class RubberDuck extends Duck implements Quackable {

  public RubberDuck() {
  }

  @Override
  public void display() {
    System.out.println("I'm a real Rubber duck");
  }

  // Custom implementation
  @Override
  public void quack() {
    System.out.println("Squeak!");
  }
}
