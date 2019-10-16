package main.java.com.simulator.ducks;

/*
 * Consider using abstract classes if any of these statements apply to your situation:
 *   In java application, there are some related classes that need to share some lines of code then
 * you can put these lines of code within abstract class and this abstract class should be extended
 * by all these related classes.
 *
 *   You can define non-static or non-final field(s) in abstract class, so that via a method you can
 * access and modify the state of Object to which they belong.
 *
 *   You can expect that the classes that extend an abstract class have many common methods or
 * fields, or require access modifiers other than public (such as protected and private).
 *
 * Consider using interfaces if any of these statements apply to your situation:
 *   It is total abstraction, All methods declared within an interface must be implemented by the
 * class(es) that implements this interface.
 *
 *   A class can implement more than one interface. It is called multiple inheritance.
 *
 *   You want to specify the behavior of a particular data type, but not concerned about who
 * implements its behavior.
 */

public abstract class Duck {

  Duck() {
  }

  public abstract void display();
}
