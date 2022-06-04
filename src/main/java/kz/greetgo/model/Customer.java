package kz.greetgo.model;

/**
 * @author balatursyn
 * on 02/05/22
 */

public class Customer {
  private Long id;
  private String name;

  public Customer(Long id, String name, Integer tier) {
    this.id = id;
    this.name = name;
    this.tier = tier;
  }

  private Integer tier;
}