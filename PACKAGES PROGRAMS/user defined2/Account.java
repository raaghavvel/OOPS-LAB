package com.bank.model;

public class Account {
    private String accNumber;
    private double balance;
    
    public Account(String accNumber) {
        this.accNumber = accNumber;
        this.balance = 0.0;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    public void displayBalance() {
        System.out.println("Account " + accNumber + " balance: $" + balance);
    }
}