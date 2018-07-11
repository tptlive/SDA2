package pl.sdacademy.day2.machine;

import pl.sdacademy.day2.shop.Coffee;

public class CoffeeMachine {

  private CoffeeMachinePump pump;
  private WaterSource waterSource;
  private CoffeeBeansSource coffeeBeansSource;

  public CoffeeMachine(CoffeeMachinePump pump) {
    this(pump, new WaterSource(0), new CoffeeBeansSource(0));
  }

  public CoffeeMachine(CoffeeMachinePump pump,
                       WaterSource waterSource,
                       CoffeeBeansSource coffeeBeansSource) {
    this.pump = pump;
    this.waterSource = waterSource;
    this.coffeeBeansSource = coffeeBeansSource;
  }

  public Coffee makeNewCoffee() {
    int waterPortion = waterSource.getPortion();

    if (waterPortion < WaterSource.DEFAULT_PORTION_SIZE) {
      System.out.println("Not enough water: " + waterPortion);
      return null;
    }

    int beansPortion = coffeeBeansSource.getPortion();

    Coffee coffee = new Coffee(waterPortion, beansPortion);

    Coffee readyCoffee = pump.heatUp(coffee);

    return readyCoffee;
  }

  // boolean hasNextCoffee()

}
