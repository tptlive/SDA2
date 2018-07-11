package pl.sdacademy.day2;

import pl.sdacademy.day2.machine.CoffeeBeansSource;
import pl.sdacademy.day2.machine.CoffeeMachine;
import pl.sdacademy.day2.machine.CoffeeMachinePump;
import pl.sdacademy.day2.machine.WaterSource;
import pl.sdacademy.day2.shop.Coffee;
import pl.sdacademy.day2.shop.CoffeeShop;

public class Main {

    public static void main(String[] args) {
      WaterSource waterSource = new WaterSource(350);
      CoffeeBeansSource beansSource = new CoffeeBeansSource(1000);
      CoffeeMachinePump pump = new CoffeeMachinePump();

      CoffeeMachine coffeeMachine = new CoffeeMachine(pump, waterSource, beansSource);

	    CoffeeShop coffeeShop = new CoffeeShop(coffeeMachine);

      Coffee coffee = coffeeShop.orderCoffee();

      if (coffee == null) {
        System.out.println("No coffee for you!");
      } else {
        System.out.println(coffee);
      }

      Coffee coffee2 = coffeeShop.orderCoffee();

      if (coffee2 == null) {
        System.out.println("No coffee for you!");
      } else {
        System.out.println(coffee2);
      }
    }

}
