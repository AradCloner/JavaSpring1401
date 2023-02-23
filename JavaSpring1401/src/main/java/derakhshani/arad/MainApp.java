package derakhshani.arad;

import java.util.List;

public class MainApp {

  public static void main(String[] args) {
    Car car = Car.of(10);
    List<Car> cars = List.of(Car.of(10), Car.of(20));
  }
}
