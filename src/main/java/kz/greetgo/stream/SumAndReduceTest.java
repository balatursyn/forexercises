package kz.greetgo.stream;

import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class SumAndReduceTest {
  @Test
  public void calculateShouldSumAllNumbers() {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    Assert.assertEquals(SumAndReduce.calculate(numbers), (1 + 2 + 3 + 4 + 5));
  }

}
