package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    public String name;
    public double balance;

    public final void deposit(double amount) {
        //todo
    }

    public final void withdraw(double amount) {
        //todo
    }
    public String toString() {
        if (balance >= 0) {
            return name + ", $" + balance;
        } else {
            return name + ", -$" + Math.abs(balance);
        }
    }
}
