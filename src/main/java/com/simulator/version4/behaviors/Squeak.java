package main.java.com.simulator.version4.behaviors;

import main.java.com.simulator.version4.interfaces.Quackable;

public class Squeak implements Quackable {

  @Override
  public void quack() {
    System.out.println("Squeak!");
  }
}
