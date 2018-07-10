package pl.sdacademy.day2.shop;

import pl.sdacademy.day2.machine.CoffeeMachine;

public class CoffeeShop {

  private CoffeeMachine coffeeMachine;

  public CoffeeShop(CoffeeMachine coffeeMachine) {
    this.coffeeMachine = coffeeMachine;
  }

  public Coffee orderCoffee() {
    return coffeeMachine.makeNewCoffee();
  }

}
