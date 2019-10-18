package main.java.com.simulator.version5.behaviors;

import main.java.com.simulator.version5.interfaces.Flyable;

public class FlyNoWay implements Flyable {

  @Override
  public void fly() {
    System.out.println("I can't fly.");
  }
}
