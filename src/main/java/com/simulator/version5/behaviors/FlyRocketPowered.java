package main.java.com.simulator.version5.behaviors;

import main.java.com.simulator.version5.interfaces.Flyable;

public class FlyRocketPowered implements Flyable {

  @Override
  public void fly() {
    System.out.println("I'm flying with a rocket");
  }
}
