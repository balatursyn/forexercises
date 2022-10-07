package kz.greetgo.stream;

import static kz.greetgo.stream.UnderAge.getKidNames;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.Arrays;
import java.util.List;
import org.testng.annotations.Test;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class UnderAgeTest {

  @Test
  public void getKidNameShouldReturnNamesOfAllKidsUnder18() {
    Person sara = new Person("Sara", 4);
    Person viktor = new Person("Viktor", 40);
    Person eva = new Person("Eva", 42);
    Person anna = new Person("Anna", 5);
    List<Person> collection = Arrays.asList(sara, eva, viktor, anna);
    assertThat(getKidNames(collection))
        .contains("Sara", "Anna")
        .doesNotContain("Viktor", "Eva");
  }
}
