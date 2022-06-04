package kz.greetgo.designPatterns.factory;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class CppDeveloperFactory implements DeveloperFactory {
  @Override
  public Developer createDeveloper() {
    return new CppDeveloper();
  }
}
