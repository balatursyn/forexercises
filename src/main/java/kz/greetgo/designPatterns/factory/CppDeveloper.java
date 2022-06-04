package kz.greetgo.designPatterns.factory;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class CppDeveloper implements Developer {
  @Override
  public void writeCode() {
    System.out.println("Cpp dev writes cpp code...");
  }
}
