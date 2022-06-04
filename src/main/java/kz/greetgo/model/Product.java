package kz.greetgo.model;

import java.util.Set;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class Product {
  private Long id;

  private String name;
  private String category;
  private Double price;

  private Set<Order> orders;

  public Product(Long id, String name, String category, Double price, Set<Order> orders) {
    this.id = id;
    this.name = name;
    this.category = category;
    this.price = price;
    this.orders = orders;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getCategory() {
    return category;
  }

  public Double getPrice() {
    return price;
  }

  public Set<Order> getOrders() {
    return orders;
  }

  @Override
  public String toString() {
    return "\nProduct{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", category='" + category + '\'' +
        ", price=" + price +
        ", orders=" + orders +
        '}';
  }
}
