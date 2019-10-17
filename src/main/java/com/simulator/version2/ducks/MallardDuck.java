package main.java.com.simulator.version2.ducks;

/**
 * MallardDuck inherits everything from Duck. Must override abstract methods.
 *
 * @version 2.0.0
 */
public class MallardDuck extends Duck {
  public MallardDuck() {
  }

  @Override
  public void display() {
    System.out.println("I'm a real Mallard duck");
  }
}
