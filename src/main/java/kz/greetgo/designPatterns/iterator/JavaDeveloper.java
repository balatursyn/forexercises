package kz.greetgo.designPatterns.iterator;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class JavaDeveloper implements Collection {
  private String name;
  private String technologies[];

  public JavaDeveloper(String name, String[] technologies) {
    this.name = name;
    this.technologies = technologies;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String[] getTechnologies() {
    return technologies;
  }

  public void setTechnologies(String[] technologies) {
    this.technologies = technologies;
  }

  @Override
  public Iterator getIterator() {
    return new Iterator() {
      int index;

      @Override
      public boolean hasNext() {
        return index < technologies.length;
      }

      @Override
      public Object next() {
        return technologies[index++];
      }
    };
  }

}
