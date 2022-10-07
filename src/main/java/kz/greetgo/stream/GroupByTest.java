package kz.greetgo.stream;

import static kz.greetgo.stream.GroupBy.groupByNationality;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class GroupByTest {
  @Test
  public void groupByNationalityTest() {
    Person sara = new Person("Sara", 4, "Norwegian");
    Person viktor = new Person("Viktor", 40, "Serbian");
    Person eva = new Person("Eva", 42, "Norwegian");
    List<Person> collection = Arrays.asList(sara, eva, viktor);
    Map<String, List<Person>> result = groupByNationality(collection);
    assertThat(result.get("Norwegian")).hasSameElementsAs(Arrays.asList(sara, eva));
    assertThat(result.get("Serbian")).hasSameElementsAs(Arrays.asList(viktor));
  }
}
