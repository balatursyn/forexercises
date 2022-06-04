package kz.greetgo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import kz.greetgo.model.Student;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class RunnerClass {


  public static void main(String[] args) throws NoSuchMethodException {

    Student student1 = new Student("Abai", 'm', 17, 1, 3.79);
    Student student2 = new Student("Dana", 'f', 16, 2, 2.89);
    Student student3 = new Student("Adema", 'f', 19, 2, 1.56);
    Student student4 = new Student("Kerey", 'm', 21, 5, 3.95);
    Student student5 = new Student("Janibek", 'm', 13, 11, 2.74);
    Student student6 = new Student("Alikhan", 'm', 9, 9, 2.43);

    List<Student> studentList = new ArrayList<>();
    studentList.add(student1);
    studentList.add(student2);
    studentList.add(student3);
    studentList.add(student4);
    studentList.add(student5);
    studentList.add(student6);

//    System.out.println("Before filtering:");
//    System.out.println("list size:" + studentList.size());
//    System.out.println(studentList);

//    studentList = filterList(studentList, (student) -> student.getGpa() > 2.5);

//    Predicate<Student> gpaPredicate = elem -> elem.getGpa() < 2.5;
//    Predicate<Student> sexPredicate = elem -> elem.getSex() == 'm';

//    studentList.removeIf(gpaPredicate.negate() );
//    List<Student> finalStudentList = studentList;
//    studentList = fulfillStudentList(() -> finalStudentList);

    changeStudentName(student1, student -> {
      student.setName("Make");
      student.setSex('f');
    });
    Double averageValue = avgOfSmth(studentList, student -> student.getGpa());

    System.out.println("Average value = " + averageValue.longValue());
//    System.out.println("After filtering:");
//    System.out.println("list size:" + studentList.size());
//    System.out.println(studentList);

  }

  private static double avgOfSmth(List<Student> studentList, Function<Student, Double> function) {
    double avg = 0;
    for (Student student : studentList) {
      double val = function.apply(student);
      avg += val;
    }
    return avg / studentList.size();
  }

  private static void changeStudentName(Student student, Consumer<Student> consumer) {
    consumer.accept(student);
  }

  private static <R> List<R> filterList(List<R> list, Predicate<R> predicate) {

    List<R> newFilteredList = new ArrayList<>();

    list.forEach(elem -> {
      if (predicate.test(elem)) newFilteredList.add(elem);
    });

    return newFilteredList;
  }

  private static List<Student> fulfillStudentList(Supplier<List<Student>> supplier) {
    List<Student> studentList = new ArrayList<>(supplier.get());
    return studentList;
  }
}  


