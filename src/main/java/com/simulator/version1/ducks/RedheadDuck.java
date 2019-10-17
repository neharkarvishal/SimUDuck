package main.java.com.simulator.version1.ducks;

/**
 * RedheadDuck inherits everything from Duck. Must override abstract methods.
 *
 * @version 1.0.0
 */
public class RedheadDuck extends Duck {
  public RedheadDuck() {
  }

  @Override
  public void display() {
    System.out.println("I'm a real Redhead duck");
  }
}
