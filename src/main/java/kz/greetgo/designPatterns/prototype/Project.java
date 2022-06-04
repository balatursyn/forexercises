package kz.greetgo.designPatterns.prototype;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class Project implements Copiable {
  private int id;
  private String name;

  public Project(int id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public Object copy() {
    Project project = new Project(this.id, this.name);
    return project;
  }

  @Override
  public String toString() {
    return "Project{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


}
