package kz.greetgo.stream;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import kz.greetgo.model.Customer;
import kz.greetgo.model.Order;
import kz.greetgo.model.Product;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class StreamExercises {


  public static void main(String[] args) {

//    Preparing data
    Customer customer1 = new Customer((long) 565, "James", 420);
    Customer customer2 = new Customer((long) 735, "Thibaut", 123);
    Customer customer3 = new Customer((long) 76, "Cristiano", 420);
    Customer customer4 = new Customer((long) 694, "bind", 866);
    Customer customer5 = new Customer((long) 821, "beast", 169);
    Customer customer6 = new Customer((long) 78, "dip", 73);
    Customer customer7 = new Customer((long) 250, "brother", 81);
    Customer customer8 = new Customer((long) 767, "animal", 726);
    Customer customer9 = new Customer((long) 518, "wear", 719);


    Order order1 = new Order((long) 222, LocalDate.now(), LocalDate.now(), "Ready", customer1);
    Order order2 = new Order((long) 502, LocalDate.now(), LocalDate.now(), "Ready", customer2);
    Order order3 = new Order((long) 528, LocalDate.now(), LocalDate.now(), "Ready", customer3);
    Order order4 = new Order((long) 761, LocalDate.now(), LocalDate.now(), "Delivered", customer4);
    Order order5 = new Order((long) 742, LocalDate.now(), LocalDate.now(), "Delivered", customer5);
    Order order6 = new Order((long) 379, LocalDate.now(), LocalDate.now(), "Delivered", customer6);
    Order order7 = new Order((long) 385, LocalDate.now(), LocalDate.now(), "Preparing", customer7);
    Order order8 = new Order((long) 949, LocalDate.now(), LocalDate.now(), "Preparing", customer8);
    Order order9 = new Order((long) 783, LocalDate.now(), LocalDate.now(), "Preparing", customer9);


    Set<Order> orders1 = Set.of(order1, order2, order4);
    Set<Order> orders2 = Set.of(order1, order3, order5);
    Set<Order> orders3 = Set.of(order5, order6, order7, order8);
    Set<Order> orders4 = Set.of(order6, order2, order9);

    Product product1 = new Product((long) 489, "argue", "Fantastic", 62.29, orders1);
    Product product2 = new Product((long) 907, "advise", "Books", 300.27, orders2);
    Product product3 = new Product((long) 118, "good", "Books", 451.81, orders3);
    Product product4 = new Product((long) 312, "cottage", "Fantastic", 87.52, orders4);

    List<Product> productList = List.of(product1, product2, product3, product4);
/////////////////
//task1
//    List<Product> productListResult = productList.stream()
//        .filter(elem -> elem.getCategory().equalsIgnoreCase("books"))
//        .filter(elem -> elem.getPrice() > 100)
//        .collect(Collectors.toList());

//    task2
    List<Order> ordersResult = productList.stream()
        .filter(elem-> elem.getCategory().equalsIgnoreCase("fantastic"))
        .
    
    System.out.println(productListResult);
  }
}
