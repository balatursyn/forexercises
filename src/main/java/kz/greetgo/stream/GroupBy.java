package kz.greetgo.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class GroupBy {
  
  public static Map<String, List<Person>> groupByNationality(List<Person> people) {
    Map<String, List<Person>> map = new HashMap<>();
    for (Person person : people) {
      if (!map.containsKey(person.getNationality())) {
        map.put(person.getNationality(), new ArrayList<>());
      }
      map.get(person.getNationality()).add(person);
    }
    return map;

  }
  
}
