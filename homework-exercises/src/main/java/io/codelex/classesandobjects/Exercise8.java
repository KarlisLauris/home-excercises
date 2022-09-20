package io.codelex.classesandobjects;
import io.codelex.classesandobjects.Classes.SavingsAccount;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How much money is in the account?: ");
        double savingsBalance = sc.nextDouble();
        System.out.println("Enter the annual interest rate: ");
        double annualInterestRate = sc.nextDouble();
        System.out.println("How long has the account been opened?: ");
        int months = sc.nextInt();
        SavingsAccount account = new SavingsAccount(savingsBalance,months,annualInterestRate);
        for (int i = 1; i <= months; i++) {
            System.out.println("Enter the amount of deposit for month " + i + ": ");
            double deposit = sc.nextDouble();
            account.addDeposit(deposit);
            System.out.println("Enter the amount of withdrawn for month " + i + ": ");
            double withdrawal = sc.nextDouble();
            account.addWithdrawal(withdrawal);
            account.addMonthlyInterest();
        }
        account.getTotalDeposit();
        account.getTotalWithdrawal();
        account.getTotalInterest();
        account.printBalance();
    }
}
