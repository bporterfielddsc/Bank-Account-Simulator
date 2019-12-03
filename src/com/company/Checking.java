package com.company;

import javax.swing.*;
import java.util.HashMap;

public class Checking extends BankAccount
{
    HashMap<Integer,Double> checks = new HashMap<>();
    int i = 1;

    public Checking()
    {
        super();
    }

    public Checking(double balance)
    {
        super(balance);
    }

    public HashMap<Integer, Double> getChecks()
    {
        return checks;
    }

    @Override
    public void withdrawal(double amount)//keeps track of check number and withdrawal amount.
    {

        balance = balance - amount;
        if(balance >= 0)
        {
            checks.put(i, amount);
            i = i + 1;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "your account went below zero.  The withdrawal only withdrew the amount of money you have in your account.");
            balance = 0.0;
        }
    }
}
