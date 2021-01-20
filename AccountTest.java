package com.bankaccount;

/**
 * Author: Mohan Adhikari Chhetri
 * Since: Jan 2020
 */
public class AccountTest {

    public static void main(String[] args) {

        // Account balance
        BankAccount sam = new BankAccount(1000,"11114444");

        System.out.println("Sam has initial balance: $" + sam.getBalance() + " in account number: " + sam.getAccountNumber());

        // Account balance after depositing
        sam.deposit(500,0.5);
        System.out.println("Sam amount after depositing is :  $" + sam.getBalance()
        + " in account number: " + sam.getAccountNumber());


        //Account Balance after withdrawing
        sam.withdraw(200,5);
        System.out.println("Sam balance after withdrawing the money is: $" + sam.getBalance() +
        " in account number: " + sam.getAccountNumber());


    }
}
