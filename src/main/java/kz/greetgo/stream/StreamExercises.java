package kz.greetgo.stream;

import static java.util.Arrays.asList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class StreamExercises {


  public static void main(String[] args) {
    List<List<String>> collection = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));
    System.out.println(transform(collection));
  }


  public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
    int answer = Arrays.stream(names).filter(elem -> elem.length() > 5).mapToInt(String::length).sum();
    return answer;
  }

  public static List<String> transform(List<List<String>> collection) {
    List<String> newCollection = new ArrayList<>();
    collection.stream().flatMap(Collection::stream).forEach(newCollection::add);
    return newCollection;
  }

}

