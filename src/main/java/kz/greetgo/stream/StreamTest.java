package kz.greetgo.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import kz.greetgo.model.Student;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class StreamTest {

  public static void main(String[] args) {

    Student student1 = new Student("Abai", 'm', 17, 1, 3.79);
    Student student2 = new Student("Dana", 'f', 16, 2, 2.89);
    Student student3 = new Student("Adema", 'f', 19, 2, 1.56);
    Student student4 = new Student("Kerey", 'm', 21, 5, 3.95);
    Student student5 = new Student("Janibek", 'm', 13, 11, 2.74);
    Student student6 = new Student("Alikhan", 'm', 9, 9, 2.43);


//    Faculty faculty1 = new Faculty("IT");
//    Faculty faculty2 = new Faculty("Finance");

//    faculty1.addStudentToFaculty(student1);
//    faculty1.addStudentToFaculty(student2);
//    faculty1.addStudentToFaculty(student3);
//
//    faculty2.addStudentToFaculty(student4);
//    faculty2.addStudentToFaculty(student5);
//    faculty2.addStudentToFaculty(student6);
//
//    List<Faculty> faculties = new ArrayList<>();
//    faculties.add(faculty1);
//    faculties.add(faculty2);

    List<Student> students = new ArrayList<>();
    students.add(student1);
    students.add(student2);
    students.add(student3);
    students.add(student4);
    students.add(student5);
    students.add(student6);
    ////////////////

    Map<Integer, List<Student>> studentsByCourse = students.stream().map(elem -> {
      elem.setName(elem.getName().toUpperCase());
      return elem;
    }).collect(Collectors.groupingBy(Student::getCourse));

    Map<Boolean, List<Student>> booleanListMap = students.stream().filter(elem -> elem.getName() != null).
        collect(Collectors.partitioningBy(elem -> elem.getGpa() > 2));


    for (Map.Entry<Boolean, List<Student>> studentByCourse : booleanListMap.entrySet()) {
      System.out.println(studentByCourse.getKey() + " : " + studentByCourse.getValue());
    }

//
//    List<Student> studentList1 = studentList.stream().map(x -> {
//      x.setName(x.getName().toUpperCase());
//      return x;
//    }).filter(x -> x.getSex() == 'f').sorted(Comparator.comparingInt(Student::getAge)).collect(Collectors.toList());


    ///

//    System.out.println(studentList1);
//
//
//    Integer arr[] = {4, 56, 8, 4, 3, 45, 78, 12, 13, 16, 19, 94, 3, 12, 55, 36, 27};
//    Arrays.stream(arr).filter(x -> x % 2 == 1).map(x -> {
//      if (x % 3 == 0) {
//        return x / 3;
//      }
//      return x;
//    }).reduce(Integer::sum).get();
//    
//    Stream stream1 = Stream.of(1,2,3,4);
//    Stream stream2 = Stream.of(5,6,7,8);
//    Stream stream3 = Stream.concat(stream1,stream2);

//
//    List<Integer> listOfInteger = Arrays.asList(arr);
//    int val = listOfInteger.stream().filter(x -> x % 2 == 1).map(x -> {
//      if (x % 3 == 0) {
//        return x / 3;
//      }
//      return x;
//    }).reduce(Integer::sum).get();
//    System.out.println(val);
  }
}
