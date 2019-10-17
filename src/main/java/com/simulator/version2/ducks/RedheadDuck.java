package main.java.com.simulator.version2.ducks;

import main.java.com.simulator.version1.ducks.Duck;

/**
 * RedheadDuck inherits everything from Duck. Must override abstract methods.
 *
 * @version 2.0.0
 */
public class RedheadDuck extends Duck {
  public RedheadDuck() {
  }

  @Override
  public void display() {
    System.out.println("I'm a real Redhead duck");
  }
}
