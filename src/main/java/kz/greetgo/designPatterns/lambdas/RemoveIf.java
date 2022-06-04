package kz.greetgo.designPatterns.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class RemoveIf {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("One");
    list.add("Two");
    list.add("Three");
    list.add("Four");
    list.add("Five");
    list.add("Six");
    list.add("Seven");
    list.add("Eight");



    Predicate<String> predicateContains = str -> str.toLowerCase().contains("o");
    Predicate<String> predicateLength = str -> str.length() > 3;
    
    list.removeIf(predicateContains.or(predicateLength));
    
    System.out.println(list);

  }

}
