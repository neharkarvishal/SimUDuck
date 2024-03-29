package main.java.com.simulator.version4.ducks;

import main.java.com.simulator.version4.behaviors.FlyWithWings;
import main.java.com.simulator.version4.behaviors.Quack;

/**
 * Wait a second, didn't we say we should NOT program
 * to an implementation? But what are we doing in that
 * constructor? We're making a new instance of a concrete
 * Quack implementation class!
 *
 * Good catch! That's exactly what we're doing ... for now!
 * Later, we'll have more design patterns that can help fix
 * this problem.
 *
 * Still, notice that while we are setting the behaviors
 * to concrete classes, we could easily change that at runtime.
 * So we still have lots of flexibility here, but we're doing a
 * poor job of initializing the instance variables in a flexible
 * way. But think about it, since the quackBehavior instance
 * variable is an interface type, we could, through the magic
 * of polymorphism, dynamically assign a different QuackBehavior
 * implementation at runtime. We'll see this later.
 *
 * @version 4.0.0
 */
public class RedheadDuck extends Duck {

  public RedheadDuck() {
    // These properties are inherited from abstract Duck.
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("I'm a real Redhead duck");
  }
}
