package main.java.com.simulator.version2.ducks;

/**
 * SimUDuck Version 2. The executives of the game development company decided
 * that flying ducks is just what the SimUDuck simulator game needed to blow
 * away the competition. So Joe figured he just needed to add a fly() method in
 * the Duck superclass and then all the ducks will inherit it. Joe was very
 * proud of himself for being a true OOP genius.
 *
 * @version 2.0.0
 */
public abstract class Duck {

  Duck() {
  }

  // All ducks quack so provide an implementation that can be inherited
  public void quack() {
    System.out.println("Quack! Quack!");
  }

  // All ducks swim so provide an implementation that can be inherited
  public void swim() {
    System.out.println("Whoa, I'm swimming!");
  }

  /**
   * Each duck is responsible for their own implementation of display() for how it looks on the
   * screen. Force subclasses to provide their own implementation.
   */
  public abstract void display();

  /**
   * To meet the executives' need Joe added this thinking all ducks fly.
   * Was this a good idea?
   */
  public void fly() {
    System.out.println("Look, I' flying!");
  }
}
