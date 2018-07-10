package pl.sdacademy.day2.machine;

import pl.sdacademy.day2.shop.Coffee;

public class CoffeeMachinePump {

  public Coffee heatUp(Coffee coffee) {

    while (!coffee.isReady()) {
      int currentTemperature = coffee.getTemperature();
      coffee.setTemperature(currentTemperature + 1);
    }

    return coffee;
  }

}
