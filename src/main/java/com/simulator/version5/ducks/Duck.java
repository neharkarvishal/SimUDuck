package main.java.com.simulator.version5.ducks;

import main.java.com.simulator.version5.interfaces.Flyable;
import main.java.com.simulator.version5.interfaces.Quackable;

/**
 * The main difference with this 5th version is that the class provides methods
 * for setting fly and quack behaviors at runtime. Otherwise, everything else is
 * the same.
 *
 * @version 5.0.0
 */
public abstract class Duck {
  /**
   * Instance variables of interface type
   * Each duck has a reference to something that implements the behaviors
   * via an interface. Hey, isn't this composition the DIP way!!!
   * Only problem is we still have the limitation that all Ducks
   * have fly and quack behaviors, even thought that is not always needed.
   */
  Flyable flyBehavior;
  Quackable quackBehavior;


  public Duck() {
  }

  // Setters for setting fly behaviors at runtime.
  public void setFlyBehavior(Flyable flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  // Setters for setting quack behaviors at runtime.
  public void setQuackBehavior(Quackable quackBehavior) {
    this.quackBehavior = quackBehavior;
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

}
