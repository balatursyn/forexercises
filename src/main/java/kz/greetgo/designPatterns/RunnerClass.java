package kz.greetgo.designPatterns;

import kz.greetgo.designPatterns.iterator.Iterator;
import kz.greetgo.designPatterns.iterator.JavaDeveloper;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class RunnerClass {
  public static void main(String[] args) {
    String technologies[] = {"Java", "Cpp", "Postgres"};
    JavaDeveloper javaDeveloper = new JavaDeveloper("Assylzhan Balatursynov", technologies);

    System.out.println(javaDeveloper.getName());

    Iterator iterator = javaDeveloper.getIterator();
    
    while (iterator.hasNext())
      System.out.print(iterator.next()+" ");

  }
}
