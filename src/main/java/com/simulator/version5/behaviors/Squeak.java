package main.java.com.simulator.version5.behaviors;

import main.java.com.simulator.version5.interfaces.Quackable;

public class Squeak implements Quackable {

  @Override
  public void quack() {
    System.out.println("Squeak!");
  }
}
