package kz.greetgo.advancedJava;

import java.util.concurrent.CountDownLatch;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class ProcessorCounDownLatch extends Thread {
  private CountDownLatch countDownLatch;

  public ProcessorCounDownLatch(CountDownLatch countDownLatch) {
    this.countDownLatch = countDownLatch;
  }

  public void run() {
    try {
      Thread.sleep(3000);
      countDownLatch.await();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Thread #" + this.getId() + " is finished!!!");

  }
}
