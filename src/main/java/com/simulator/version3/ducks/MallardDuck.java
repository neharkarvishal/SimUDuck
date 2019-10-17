package main.java.com.simulator.version3.ducks;

import main.java.com.simulator.version3.interfaces.Flyable;
import main.java.com.simulator.version3.interfaces.Quackable;

/**
 * Provide custom implementations of Flyable and Quackable.
 *
 * @version 3.0.0
 * @see Flyable
 * @see Quackable
 */
public class MallardDuck extends Duck implements Flyable, Quackable {

  public MallardDuck() {
  }

  // Custom implementation
  @Override
  public void display() {
    System.out.println("I'm a real Mallard duck");
  }

  @Override
  public void fly() {
    System.out.println("I am Flying!");
  }

  @Override
  public void quack() {
    System.out.println("Quack!");
  }
}
