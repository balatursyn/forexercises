package kz.greetgo.library;

import java.util.List;
import java.util.Objects;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class Reader {
  
  private String fio;
  private String email;
  private boolean subscribed;
  private List<Book> givenBooks;

  public void setGivenBooks(List<Book> givenBooks) {
    this.givenBooks = givenBooks;
  }

  public Reader(String fio, String email, boolean subscribed) {
    this.fio = fio;
    this.email = email;
    this.subscribed = subscribed;
  }

  public Reader(String fio, String email, boolean subscribed, List<Book> givenBooks) {
    this.fio = fio;
    this.email = email;
    this.subscribed = subscribed;
    this.givenBooks = givenBooks;
  }

  public String getFio() {
    return fio;
  }

  public String getEmail() {
    return email;
  }

  public boolean isSubscribed() {
    return subscribed;
  }

  public List<Book> getGivenBooks() {
    return givenBooks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Reader reader = (Reader) o;
    return subscribed == reader.subscribed &&
        Objects.equals(fio, reader.fio) &&
        Objects.equals(email, reader.email) &&
        Objects.equals(givenBooks, reader.givenBooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fio, email, subscribed, givenBooks);
  }

  @Override
  public String toString() {
    return "Reader{" +
        "fio='" + fio + '\'' +
        ", email='" + email + '\'' +
        ", subscribed=" + subscribed +
        ", givenBooks=" + givenBooks +
        '}';
  }
}
