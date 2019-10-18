package main.java.com.simulator.version5.behaviors;

import main.java.com.simulator.version5.interfaces.Quackable;

public class MuteQuack implements Quackable {

  @Override
  public void quack() {
    System.out.println("<<Silence>>");
  }
}
