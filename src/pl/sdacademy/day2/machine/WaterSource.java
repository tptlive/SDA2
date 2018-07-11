package pl.sdacademy.day2.machine;

public class WaterSource {

  public static final int DEFAULT_PORTION_SIZE = 200;

  private int amount;

  public WaterSource(int amount) {
    this.amount = amount;
  }

  public int getPortion() {
    if(amount < DEFAULT_PORTION_SIZE) {
      int currentAmount = amount;
      amount = 0;
      return currentAmount;
    }

    amount -= DEFAULT_PORTION_SIZE;
    return DEFAULT_PORTION_SIZE;
  }

}
