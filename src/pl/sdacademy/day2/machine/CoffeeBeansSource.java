package pl.sdacademy.day2.machine;

public class CoffeeBeansSource {

  private static final int DEFAULT_PORTION_SIZE = 20;
  private int amount;

  public CoffeeBeansSource(int amount) {
    this.amount = amount;
  }

  public int getPortion() {
    return DEFAULT_PORTION_SIZE;
  }

}
