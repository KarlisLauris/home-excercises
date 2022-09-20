package io.codelex.classesandobjects.Classes;

public class SavingsAccount {
    private double savingsBalance;
    private double annualInterestRate;
    private double totalDeposit;
    private double totalWithdrawal;
    private double totalInterest;
    private int months;
    public SavingsAccount(double savingsBalance,int months, double annualInterestRate){
        this.savingsBalance = savingsBalance;
        this.annualInterestRate = annualInterestRate;
        this.months = months;
        totalDeposit = 0;
        totalWithdrawal = 0;
        totalInterest = 0;
    }

    public double calculateMonthlyInterest() {
        return savingsBalance * annualInterestRate / 12;
    }

    public void getTotalDeposit() {
        System.out.println("Total deposit: " + totalDeposit);
    }
    public void getTotalWithdrawal() {
        System.out.println("Total withdrawal: " + totalWithdrawal);
    }
    public void getTotalInterest() {
        System.out.println("Total interest: "+ totalInterest);
    }
    public void addMonthlyInterest() {
        savingsBalance += calculateMonthlyInterest();
        totalInterest += calculateMonthlyInterest();
    }
    public void addDeposit(double deposit) {
        savingsBalance += deposit;
        totalDeposit += deposit;
    }
    public void addWithdrawal(double withdrawal) {
        savingsBalance -= withdrawal;
        totalWithdrawal += withdrawal;
    }
    public void printBalance() {
        System.out.println("Balance: " + savingsBalance);
    }
}
