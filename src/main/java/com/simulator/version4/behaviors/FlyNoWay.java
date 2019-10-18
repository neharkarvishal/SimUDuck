package main.java.com.simulator.version4.behaviors;

import main.java.com.simulator.version4.interfaces.Flyable;

public class FlyNoWay implements Flyable {

  @Override
  public void fly() {
    System.out.println("I can't fly.");
  }
}
