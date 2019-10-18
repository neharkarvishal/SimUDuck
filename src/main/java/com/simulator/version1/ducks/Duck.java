package main.java.com.simulator.version1.ducks;

/**
 * Interface or Abstract class, which one to use?
 * Consider using abstract classes if any of these statements apply to your situation:
 * 1. In java application, there are some related classes that need to share some lines of code then
 * you can put these lines of code within abstract class and this abstract class should be extended
 * by all these related classes.
 *
 * 2. You can define non-static or non-final field(s) in abstract class, so that via a method you
 * can access and modify the state of Object to which they belong.
 *
 * 2. You can expect that the classes that extend an abstract class have many common methods or
 * fields, or require access modifiers other than public (such as protected and private).
 *
 * Consider using interfaces if any of these statements apply to your situation:
 * 1. It is total abstraction, All methods declared within an interface must be implemented by the
 * class(es) that implements this interface.
 *
 * 2. A class can implement more than one interface. It is called multiple inheritance.
 *
 * 3. You want to specify the behavior of a particular data type, but not concerned about who
 * implements its behavior.
 */

/**
 * Starting point for SimUDuck. The game can show a large variety of
 * duck species swimming and making quacking sounds. The initial designers used standard OOP
 * techniques and created an abstract Duck superclass (this class) from which all other duck types
 * inherit.
 *
 * This is a good example of how Abstract classes can be used effectively: a combination of methods
 * are needed in the child classes. Two of these, quack() and swim() have implementations, the
 * assumption being that all child classes will need these implementations. But one method is
 * abstract. No implementation is provided because each child class (duck) will display itself
 * differently (some may be in color, some black and white, and they all look different.
 *
 * Furthermore, the class is declared abstract because we don't want programmers using this class to
 * create direct instances. We only want instances created from specific sub classes, because only
 * those classes have enough distinct properties and methods to be useful. So this is a form of
 * developer control.
 *
 * @version 1.0.0
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

  /*
   * Each duck is responsible for their own implementation of display() for how it looks on the
   * screen. Force subclasses to provide their own implementation.
   */
  public abstract void display();
}
