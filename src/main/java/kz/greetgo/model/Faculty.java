package kz.greetgo.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class Faculty {
  
  private String name;
  private List<Student> studentList;

  public Faculty(String name) {
    this.name = name;
    this.studentList = new ArrayList<>();
  }

  public List<Student> getStudentList() {
    return studentList;
  }

  public void addStudentToFaculty(Student student) {
    this.studentList.add(student);
  }


}
