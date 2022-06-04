package kz.greetgo.advancedJava;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class RunnerClassInner {

  public static void main(String[] args) throws InterruptedException {

    ProcessorReentrantLock processorReentrantLock = new ProcessorReentrantLock();

    Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
        processorReentrantLock.firstThread();
      }
    });

    Thread thread2 = new Thread(new Runnable() {
      @Override
      public void run() {
        processorReentrantLock.firstThread();
      }
    });

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

    System.out.println("counter=" + processorReentrantLock.getCounter());


  }
}



