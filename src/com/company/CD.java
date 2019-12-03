package com.company;

import javax.swing.*;

public class CD extends BankAccount
{
    private double interestRate = .05;
    private double amountAbove;

    public CD()
    {
        super();
    }

    public CD(double balance)
    {
        super(balance);
    }

    public double getInterestRate()
    {
        return interestRate;
    }

    public void deposit(double amount)//adds money.  increases interest rate by .25% every time 5000 is deposited over 20000.
    {


        if(balance >= 20000)
        {
            balance = balance + amount;
            amountAbove =  amountAbove + amount;

            if(amountAbove == 5000)
            {

                interestRate = interestRate + .0025;
                amountAbove = 0.0;

            }
        }
        else
        {
            balance = balance + amount;
        }

    }

    @Override
    public void withdrawal(double amount)//penalizes for removing money
    {

            balance = (balance - (balance * .06)) - amount;

        if(balance < 0)
        {
            JOptionPane.showMessageDialog(null, "your account went below zero.  The withdrawal only withdrew the amount of money you have in your account.");
            balance = 0.0;
        }
    }

    public void compoundInterest()
    {


        balance = balance + (balance * interestRate);

    }
}
