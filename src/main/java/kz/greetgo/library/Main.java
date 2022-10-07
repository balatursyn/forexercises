package kz.greetgo.library;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class Main {

  public static void main(String[] args) {

    Library library = new Library();
//    List<Book> filteredBookList = filterBooks(library.bookList, p -> p.getPageSize() > 150);
//    double avgPageSize = avgPageSize(library.bookList, elem -> (double) elem.getPageSize());

//    System.out.println(filteredBookList);
//    System.out.println("Average page size: "+avgPageSize);

    Map<String, List<Book>> authorBookMap = library.bookList.stream()
        .filter(elem -> elem.getPageSize() > 100)
        .sorted(Comparator.comparingInt(Book::getPageSize))
        .collect(Collectors.groupingBy(Book::getAuthor));
    System.out.println(authorBookMap);
  }

  private static double avgPageSize(List<Book> bookList, Function<Book, Double> f) {
    double result = 0;
    for (Book book : bookList) {
      result += f.apply(book);
    }
    return result;
  }

  public static List<Book> filterBooks(List<Book> bookList, Predicate<Book> predicate) {
    List<Book> resultList = new ArrayList<>();
    for (Book book : bookList) {
      if (predicate.test(book)) {
        resultList.add(book);
      }
    }
    return resultList;
  }

}
