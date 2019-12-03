package com.company;

import javax.swing.*;

public class Savings extends BankAccount
{
    private final int minimumBalance = 100;
    private double interestRate = .05;

    public Savings()
    {
        super();
    }

    public Savings(double balance)
    {
        super(balance);
    }

    public double getInterestRate()
    {
        return interestRate;
    }

    @Override
    public void withdrawal(double amount)//withdrawals money.  penalizes if under the minimum balance.
    {

            if (balance < minimumBalance)
            {
                balance = (balance - (balance * interestRate)) - amount;
                if(balance < 0)
                {
                    JOptionPane.showMessageDialog(null, "Your account went below zero so the withdrawal only withdrew the amount of money you have in your account.");
                    balance = 0.0;
                }
            } else
            {
                balance = balance - amount;
                if(balance < 0)
                {
                    JOptionPane.showMessageDialog(null, "Your account went below zero so the withdrawal only withdrew the amount of money you have in your account.");
                    balance = 0.0;

                }
            }


    }

    public void compoundInterest()//adds interest to account balance only if the balance is above the minimum balance
    {
        if (balance >= minimumBalance)
        {
            balance = balance + (balance*interestRate);
        }
    }
}
