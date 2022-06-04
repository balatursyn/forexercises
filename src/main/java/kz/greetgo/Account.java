package kz.greetgo;

/**
 * @author balatursyn
 * on 02/05/22
 */


public class Account {
  private int balance;

  public Account(int balance) {
    this.balance = balance;
  }

  private void put(int amount) {
    balance += amount;
  }

  private void withdraw(int amount) {
    balance -= amount;
  }

  public static void transfer(Account account1, Account account2, int amount) {
    account1.withdraw(amount);
    account2.put(amount);
  }

  public int getBalance() {
    return balance;
  }
}
