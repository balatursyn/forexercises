package kz.greetgo.model;

import java.time.LocalDate;

/**
 * @author balatursyn
 * on 02/05/22
 */

public class Order {

  private Long id;

  private LocalDate orderDate;
  private LocalDate deliveryDate;
  private String status;
  private Customer customer;

  public Order(Long id, LocalDate orderDate, LocalDate deliveryDate, String status, Customer customer) {
    this.id = id;
    this.orderDate = orderDate;
    this.deliveryDate = deliveryDate;
    this.status = status;
    this.customer = customer;
  }

  @Override
  public String toString() {
    return "\nOrder{" +
        "id=" + id +
        ", orderDate=" + orderDate +
        ", deliveryDate=" + deliveryDate +
        ", status='" + status + '\'' +
        ", customer=" + customer +
        '}';
  }
}
