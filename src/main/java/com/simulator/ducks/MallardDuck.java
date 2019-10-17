package main.java.com.simulator.ducks;

/**
 * MallardDuck inherits everything from Duck. Must override abstract methods.
 */
public class MallardDuck extends Duck {
  public MallardDuck() {
  }

  @Override
  public void display() {
    System.out.println("I'm a real Mallard duck");
  }
}
