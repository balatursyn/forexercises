package kz.greetgo.designPatterns.prototype;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class ProjectFactory {
  Project project;

  public void setProject(Project project) {
    this.project = project;
  }

  public ProjectFactory(Project project) {
    this.project = project;
  }
  
  public Project cloneProject(){
    return (Project) project.copy();
  }
}
