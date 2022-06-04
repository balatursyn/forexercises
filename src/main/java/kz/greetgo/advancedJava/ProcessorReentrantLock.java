package kz.greetgo.advancedJava;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class ProcessorReentrantLock {
  private int counter = 0;
  Lock lock = new ReentrantLock();

  private void increment() {
    lock.lock();
    counter++;
    lock.unlock();
  }

  public void firstThread() {
    for (int i = 0; i < 10_000; ++i) {
      increment();
    }
  }


  public int getCounter() {
    return counter;
  }
}
