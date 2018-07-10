package pl.sdacademy.day2.shop;

public class Coffee {

  private int water; // ml
  private int beans; // g

  private int temperature = 20; // degrees

  public Coffee(int water, int beans) {
    this.water = water;
    this.beans = beans;
  }

  public boolean isReady() {
    return temperature >= 95;
  }

  public int getTemperature() {
    return temperature;
  }

  public void setTemperature(int temperature) {
    this.temperature = temperature;
  }

  @Override
  public String toString() {
    if (isReady()) {
      return "Coffee is warm and nice";
    } else {
      return "Coffee is cold and awful";
    }
  }

}
