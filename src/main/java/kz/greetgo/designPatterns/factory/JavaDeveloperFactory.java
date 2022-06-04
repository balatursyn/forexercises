package kz.greetgo.designPatterns.factory;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class JavaDeveloperFactory implements DeveloperFactory {
  @Override
  public Developer createDeveloper() {
    return new JavaDeveloper(); 
  }
}
