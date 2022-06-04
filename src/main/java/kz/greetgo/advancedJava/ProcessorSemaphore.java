package kz.greetgo.advancedJava;

import java.util.concurrent.Semaphore;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class ProcessorSemaphore {
  Semaphore semaphore = new Semaphore(3);
  public void process(){
    try {
      semaphore.acquire();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    semaphore.release();
  }
  
}
