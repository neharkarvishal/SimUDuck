package main.java.com.simulator.version4.behaviors;

import main.java.com.simulator.version4.interfaces.Quackable;

public class Quack implements Quackable {

  @Override
  public void quack() {
    System.out.println("Audible Quack!");
  }
}
