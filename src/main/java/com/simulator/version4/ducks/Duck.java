package main.java.com.simulator.version4.ducks;

import main.java.com.simulator.version4.interfaces.Flyable;
import main.java.com.simulator.version4.interfaces.Quackable;

/**
 * Instance variables of interface type
 * Each duck has a reference to something that implements the behaviors
 * via an interface. Hey, isn't this composition the DIP way!!!
 *
 * @version 4.0.0
 */
public abstract class Duck {

  Flyable flyBehavior;
  Quackable quackBehavior;

  public Duck() {
  }

  public void swim() {
    System.out.println("Whoa, I'm swimming!");
  }

  public abstract void display();

  /*
   * Rather than handling the quack behavior itself, the Duck object
   * delegates that behavior to the object referenced by quackBehavior.
   * This object is unknown -- that's DIP in action!
   */
  public void performQuack() {
    quackBehavior.quack();
  }

  /*
   * Rather than handling the fly behavior itself, the Duck object
   * delegates that behavior to the object referenced by flyBehavior.
   * This object is unknown -- that's DIP in action!
   */
  public void performFly() {
    flyBehavior.fly();
  }

  // Other duck-like methods
}
