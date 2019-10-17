package main.java.com.simulator;

import main.java.com.simulator.ducks.Duck;
import main.java.com.simulator.ducks.MallardDuck;

public class MiniDuckSimulator {

  public static void main(String[] args) {
    Duck mallard = new MallardDuck();

    mallard.display();
    mallard.swim();
    mallard.quack();
  }
}
