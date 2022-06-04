package kz.greetgo.designPatterns.factory;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class DeveloperBySpec {
  public static Developer create(String spec) {
    switch (spec.toLowerCase()) {
      case "java":
        return new JavaDeveloperFactory().createDeveloper();
      case "cpp":
        return new CppDeveloperFactory().createDeveloper();
      default:
        return (Developer) new RuntimeException(spec + " is unknown specialty");
    }
  }
}
