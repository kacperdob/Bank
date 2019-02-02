package com.dobr;

public abstract class Account {
private String name;
private String lastName;
private String accNumber;
private int accBalance;
private AccType accType;
private String currency;

    public Account(String name, String lastName, String accNumber, int accBalance, AccType accType, String currency) {
        this.name = name;
        this.lastName = lastName;
        this.accNumber = accNumber;
        this.accBalance = accBalance;
        this.accType = accType;
        this.currency = currency;
    }

}
