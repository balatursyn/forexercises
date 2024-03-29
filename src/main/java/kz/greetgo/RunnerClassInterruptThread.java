package kz.greetgo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class RunnerClassInterruptThread {
  public static void main(String[] args) throws InterruptedException {
    ExecutorService executorService = Executors.newFixedThreadPool(2);
    List<Future> futureList = new ArrayList<>();

    
    executorService.shutdown();

  }


}

class CallableImpl implements Callable<String> {

  @Override
  public String call() throws Exception {
    return "Callable element";
  }
}

class MyThread extends Thread {
  @Override
  public void run() {
    System.out.println(this.getId() + " ---- threadId");
  }
}
