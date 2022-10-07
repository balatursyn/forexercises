package kz.greetgo.library;

import java.util.Objects;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class Email {
  private String to;
  private String from;
  private String header;
  private String body;

  public Email(String to, String from, String header, String body) {
    this.to = to;
    this.from = from;
    this.header = header;
    this.body = body;
  }

  public String getTo() {
    return to;
  }

  public String getFrom() {
    return from;
  }

  public String getHeader() {
    return header;
  }

  public String getBody() {
    return body;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Email email = (Email) o;
    return Objects.equals(to, email.to) &&
        Objects.equals(from, email.from) &&
        Objects.equals(header, email.header) &&
        Objects.equals(body, email.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(to, from, header, body);
  }

  @Override
  public String toString() {
    return "Email{" +
        "to='" + to + '\'' +
        ", from='" + from + '\'' +
        ", header='" + header + '\'' +
        ", body='" + body + '\'' +
        '}';
  }
}
