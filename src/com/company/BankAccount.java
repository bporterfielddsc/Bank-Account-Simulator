package com.company;

public class BankAccount//super class
{
    private int number;
     double balance;

    public BankAccount()
    {
        balance = 0.0;
    }

    public BankAccount(double balance)
    {
        this.balance = balance;
    }


    public double getBalance()
    {
        return balance;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public int getNumber()
    {
        return number;
    }

    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    public void withdrawal(double amount)
    {
        balance = balance -amount;
    }


}
