package kz.greetgo.advancedJava;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @author balatursyn
 * on 02/05/22
 */
class ProducerAndConsumer {

  private Queue<Integer> queue = new LinkedList<>();
  private final int SIZE = 10;
  private final Object lock = new Object();

  public void produce() throws InterruptedException {
    while (true) {
      synchronized (lock) {
        if (queue.size() == SIZE) {
          lock.wait();
        } else {
          Integer val = new Random().nextInt(100);
          queue.offer(val);
          System.out.println("Offered by producer: " + val);
          System.out.println("Offer, size: " + queue.size());
          lock.notify();
        }
      }
    }
  }

  public void consume() throws InterruptedException {
    while (true) {
      synchronized (lock) {
        if (queue.size() == 0) {
          lock.wait();
        } else {
          System.out.println("Polled by consumer: " + queue.poll());
          System.out.println("Poll, size: " + queue.size());
          lock.notify();
        }
      }
    }

  }

}
