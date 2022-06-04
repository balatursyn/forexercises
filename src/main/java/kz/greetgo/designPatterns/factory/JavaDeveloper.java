package kz.greetgo.designPatterns.factory;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class JavaDeveloper implements Developer {
  @Override
  public void writeCode() {
    System.out.println("Java dev writes Java code...");
  }
}
