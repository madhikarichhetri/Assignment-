package com.bankaccount;

/**
 * Author: Mohan Adhikari Chhetri
 * Since: Jan 2020
 */
public class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(double balance, String accountNumber){
        this.balance = 1000;
        this.accountNumber = "11114444";

    }
    public void deposit(double amount) {
       double newBalance = balance + amount;
       balance = newBalance;
    }


    public void withdraw(double amount) {
       if (amount <= balance) {
           double newBalance = balance - amount;
           balance = newBalance;
     } else {
          System.err.println("There is insufficient fund in the account.");
       }
   }
   // i is interest given on deposit
   public void deposit(double amount,double i) {

        double newBalance = balance + amount;
       balance = newBalance + newBalance*i;
   }

 // x is transaction fee per withdraw
    public void withdraw(double amount, double x) {
        if (amount <= balance) {
            double newBalance = balance - amount;
            balance = newBalance - x;
        } else {
            System.err.println("There is insufficient fund in the account.");
        }
    }
    public double getBalance() {
        return balance;

    }
    public String getAccountNumber(){
        return accountNumber;
    }


}




