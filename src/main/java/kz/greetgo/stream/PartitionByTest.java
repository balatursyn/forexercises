package kz.greetgo.stream;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static kz.greetgo.stream.PartitionBy.partitionAdults;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class PartitionByTest {
  @Test
  public void partitionAdultsShouldSeparateKidsFromAdults() {
    Person sara = new Person("Sara", 4);
    Person viktor = new Person("Viktor", 40);
    Person eva = new Person("Eva", 42);
    List<Person> collection = asList(sara, eva, viktor);
    Map<Boolean, List<Person>> result = partitionAdults(collection);
    assertThat(result.get(true)).hasSameElementsAs(asList(viktor, eva));
    assertThat(result.get(false)).hasSameElementsAs(singletonList(sara));
  }
}
