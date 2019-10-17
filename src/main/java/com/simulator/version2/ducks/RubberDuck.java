package main.java.com.simulator.version2.ducks;

/**
 * This last minute addition to the game causes some maintenance issues for Joe.
 * Implementation inheritance is the cause of the problem. This rubber duck
 * invisibly inherits the fly()method from the Duck superclass. RubberDuck
 * objects should not fly!
 */
public class RubberDuck extends Duck {

  public RubberDuck() {
  }

  /**
   * Rubber ducks don't fly, or quack, but will Joe
   * remember to do something about this? What other maintenance
   * tasks will he need to think about?
   */
  @Override
  public void display() {
    System.out.println("I'm a real Rubber duck");
  }

  /**
   * Custom implementation overrides concrete Duck behavior
   * However, nothing forces you to do this. You get
   * this method for free due to implementation inheritance.
   * Would you remember to override it?
   */
  @Override
  public void quack() {
    System.out.println("Squeak!");
  }
}
