package kz.greetgo.stream;

/**
 * @author balatursyn
 * on 02/05/22
 */


import static java.util.Arrays.asList;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MaxAndComparatorTest {
  // }

  @Test
  public void getOldestPersonShouldReturnOldestPerson() {
    Person sara = new Person("Sara", 4);
    Person viktor = new Person("Viktor", 40);
    Person eva = new Person("Eva", 42);
    List<Person> collection = asList(sara, eva, viktor);
    Assert.assertEquals(MaxAndComparator.getOldestPerson(collection),eva);
  }

// {
}
