//package kz.greetgo.designPatterns.lambdas;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.function.Consumer;
//import java.util.function.Function;
//import java.util.function.Supplier;
//
///**
// * @author balatursyn
// * on 02/05/22
// */
//
//
//public class SupplierTest {
//
//  public static List<Car> carSupplier(Supplier<List<Car>> carSupplier) {
//
//    final List<Car> carArrayList = new ArrayList<>();
//
//    carSupplier.get().forEach(x ->   carArrayList.add(x));
//    
//
//    return carArrayList;
//  }
//
//  public static void carConsumer(Car car, Consumer<Car> carConsumer) {
//    car.setMark("Jent");
////    carConsumer.accept(car);
//  }
//
//  public static double carFunction(List<Car> carList, Function<Car, Double> carDoubleFunction) {
//    double avg = 0;
//    for (Car car : carList) {
//      avg += car.getVolume();
//    }
//    avg = avg / carList.size();
//    return avg;
//  }
//
//
//  public static void main(String[] args) {
//
//    Car car1 = new Car("Mercedes", "w124", 3.2);
//    Car car2 = new Car("Mercedes", "w210", 2.8);
//    Car car3 = new Car("Mercedes", "w211", 5.5);
//    Car car4 = new Car("Mercedes", "w212", 6.3);
//
//    List<Car> inList = new ArrayList<>();
//    inList.add(car1);
//    inList.add(car2);
//    inList.add(car3);
//    inList.add(car4);
//
//    List<Car> carList = carSupplier(() -> inList);
//
//    double carAvgValue = carFunction(carList, (x -> x.doubleValue()));
//
//    System.out.println(carAvgValue);
//  }
//
//
//  private static class Car {
//    private String mark;
//
//    public double getVolume() {
//      return volume;
//    }
//
//    public void setMark(String mark) {
//      this.mark = mark;
//    }
//
//    public void setModel(String model) {
//      this.model = model;
//    }
//
//    public void setVolume(double volume) {
//      this.volume = volume;
//    }
//
//    private String model;
//    private double volume;
//
//    public Car(String mark, String model, double volume) {
//      this.mark = mark;
//      this.model = model;
//      this.volume = volume;
//    }
//
//    @Override
//    public String toString() {
//      return "Car{" +
//          "mark='" + mark + '\'' +
//          ", model='" + model + '\'' +
//          ", volume='" + volume + '\'' +
//          '}';
//    }
//  }
//}
