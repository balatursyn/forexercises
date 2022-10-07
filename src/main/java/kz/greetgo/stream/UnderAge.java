package kz.greetgo.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class UnderAge{
  public static Set<String> getKidNames(List<Person> people) {
    return people.stream().filter(person -> person.getAge() < 18)
            .map(Person::getName)
            .collect(Collectors.toSet());
  }
}
