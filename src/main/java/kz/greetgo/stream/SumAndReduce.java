package kz.greetgo.stream;

import java.util.List;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class SumAndReduce {
  public static int calculate(List<Integer> numbers) {
    return numbers.stream().reduce(Integer::sum).orElse(0);
  }
}
