package kz.greetgo.library;

import java.util.Objects;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class Book {
  private String author;
  private String name;
  private Integer issueYear;

  @Override
  public String toString() {
    return "\nBook{" +
        "author='" + author + '\'' +
        ", name='" + name + '\'' +
        ", issueYear=" + issueYear +
        ", pageSize=" + pageSize +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Book book = (Book) o;
    return Objects.equals(author, book.author) &&
        Objects.equals(name, book.name) &&
        Objects.equals(issueYear, book.issueYear) &&
        Objects.equals(pageSize, book.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, name, issueYear, pageSize);
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Integer getPageSize() {
    return pageSize;
  }

  private Integer pageSize;

  public Book(String author, String name, Integer year, Integer pageSize) {
    this.author = author;
    this.name = name;
    this.issueYear = year;
    this.pageSize = pageSize;
  }

  public String getAuthor() {
    return author;
  }

  public String getName() {
    return name;
  }

  public Integer getIssueYear() {
    return issueYear;
  }

}
