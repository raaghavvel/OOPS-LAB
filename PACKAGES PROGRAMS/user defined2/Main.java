package com.bank;

import com.bank.model.Account;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("ACC1001");
        acc1.deposit(1000);
        acc1.displayBalance();
    }
}