package main.java.com.simulator.version1.ducks;

/**
 * MallardDuck inherits everything from Duck. Must override abstract methods.
 *
 * @version 1.0.0
 */
public class MallardDuck extends Duck {
  public MallardDuck() {
  }

  @Override
  public void display() {
    System.out.println("I'm a real Mallard duck");
  }
}
