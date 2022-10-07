package kz.greetgo.stream;

import java.util.Comparator;
import java.util.List;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class MaxAndComparator {

  public static Person getOldestPerson(List<Person> people) {
    return people.stream().max(Comparator.comparingInt(Person::getAge)).orElse(null);

//    Person oldestPerson = new Person("", 0);
//    for (Person person : people) {
//      if (person.getAge() > oldestPerson.getAge()) {
//        oldestPerson = person;
//      }
//    }
//    return oldestPerson;
  }
}
