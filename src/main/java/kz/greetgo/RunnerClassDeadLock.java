package kz.greetgo;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class RunnerClassDeadLock {


  private static void makeLock(Lock firstLock, Lock secondLock) {
    boolean firstLockWasLocked = false;
    boolean secondLockWasLocked = false;

    while (true) {
      try {

        firstLockWasLocked = firstLock.tryLock();
        secondLockWasLocked = secondLock.tryLock();

      } finally {
        
        if (secondLockWasLocked && firstLockWasLocked) return;

        if (firstLockWasLocked) firstLock.unlock();

        if (secondLockWasLocked) secondLock.unlock();
      }
    }
  }

  public static void main(String[] args) throws InterruptedException {
    Account account1 = new Account(10000);
    Account account2 = new Account(10000);

    Lock lock1 = new ReentrantLock();
    Lock lock2 = new ReentrantLock();


    Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 100; ++i) {
          makeLock(lock1, lock2); 
          Account.transfer(account1, account2, new Random().nextInt(1000));
          lock2.unlock();
          lock1.unlock();
        }
      }
    });

    Thread thread2 = new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 100; ++i) {
          makeLock(lock2,lock1);
          Account.transfer(account2, account1, new Random().nextInt(1000));
          lock1.unlock();
          lock2.unlock();
        }
      }
    });

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

    System.out.println("Balance: " + (account1.getBalance() + account2.getBalance()));

  }


}
