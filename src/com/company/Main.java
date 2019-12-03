package com.company;

import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;
//Blayne Porterfield
//Program1

public class Main
{

    public static void main(String[] args) //controls the first menu that is displayed.  Calls appopriate method based on user choice.
    {
        String menu1 = new String();


        menu1 += "Please choice the type of account you would like to open\n\n";
        menu1 += "1.    savings\n";
        menu1 += "2.    checking\n";
        menu1 += "3.    CD";

        int userChoice = Integer.parseInt(JOptionPane.showInputDialog(menu1));

        if (userChoice == 1)
        {
            savingsAccount();

        } else if (userChoice == 2)
        {
            checkingAccount();

        } else if (userChoice == 3)
        {
            cdAccount();

        }
    }

    private static void cdAccount()//controls menu for user CD account
    {
        CD cdAccount = new CD();
        cdAccount.setNumber(ThreadLocalRandom.current().nextInt(000000, 1000000));
        JOptionPane.showMessageDialog(null, "Your account number is " + cdAccount.getNumber());
        String exit = new String();
        while (exit.equals(""))
        {
            String cdMenu = new String();
            cdMenu += "Please choice what you would like to do with your account\n\n";
            cdMenu += "1.  withdrawal\n";
            cdMenu += "2.  deposit\n";
            cdMenu += "3.  check balance\n";
            cdMenu += "5.  compound interest\n";
            cdMenu += "6.  exit";


            int userChoice = Integer.parseInt(JOptionPane.showInputDialog(cdMenu));

            if (userChoice == 1)
            {
                double amount = Double.parseDouble(JOptionPane.showInputDialog("how much would you like to withdrawal?"));
                cdAccount.withdrawal(amount);

            } else if (userChoice == 2)
            {
                double amount = Double.parseDouble(JOptionPane.showInputDialog("how much would you like to deposit?"));
                cdAccount.deposit(amount);

            } else if (userChoice == 3)
            {
                JOptionPane.showMessageDialog(null, "your balance is " + cdAccount.getBalance());
            } else if (userChoice == 4)
            {
                JOptionPane.showMessageDialog(null, "your interest rate is " + cdAccount.getInterestRate());
            }
            else if (userChoice == 5)
            {
                cdAccount.compoundInterest();
            }
            else if (userChoice == 6)
            {
                exit = "exit";
            }
        }
    }

    private static void checkingAccount()//controls menu for user checking account
    {
        Checking checkingAccount = new Checking();
        checkingAccount.setNumber(ThreadLocalRandom.current().nextInt(000000, 1000000));
        JOptionPane.showMessageDialog(null, "Your account number is " + checkingAccount.getNumber());
        String exit = new String();
        while (exit.equals(""))
        {
            String cdMenu = new String();
            cdMenu += "Please choice what you would like to do with your account\n\n";
            cdMenu += "1.  withdrawal\n";
            cdMenu += "2.  deposit\n";
            cdMenu += "3.  check balance\n";
            cdMenu += "4.  exit";


            int userChoice = Integer.parseInt(JOptionPane.showInputDialog(cdMenu));

            if (userChoice == 1)
            {
                double amount = Double.parseDouble(JOptionPane.showInputDialog("how much would you like to withdrawal?"));
                checkingAccount.withdrawal(amount);

            } else if (userChoice == 2)
            {
                double amount = Double.parseDouble(JOptionPane.showInputDialog("how much would you like to deposit?"));
                checkingAccount.deposit(amount);

            } else if (userChoice == 3)
            {
                JOptionPane.showMessageDialog(null, "your balance is " + checkingAccount.getBalance());
            } else if (userChoice == 4)
            {
                exit = "exit";
            }
        }
    }

    private static void savingsAccount()//controls menu for user savings account
    {
        String exit = new String();
        Savings savingsAccount = new Savings();
        savingsAccount.setNumber(ThreadLocalRandom.current().nextInt(000000, 1000000));
        JOptionPane.showMessageDialog(null, "Your account number is " + savingsAccount.getNumber());
        while (exit.equals(""))
        {
            String savingsMenu = new String();
            savingsMenu += "Please choice what you would like to do with your account\n\n";
            savingsMenu += "1.  withdrawal\n";
            savingsMenu += "2.  deposit\n";
            savingsMenu += "3.  check balance\n";
            savingsMenu += "4.  check interest rate\n";
            savingsMenu += "5.  compound interest\n";
            savingsMenu += "6.  exit";


            int userChoice = Integer.parseInt(JOptionPane.showInputDialog(savingsMenu));

            if (userChoice == 1)
            {
                double amount = Double.parseDouble(JOptionPane.showInputDialog("how much would you like to withdrawal?"));
                savingsAccount.withdrawal(amount);

            } else if (userChoice == 2)
            {
                double amount = Double.parseDouble(JOptionPane.showInputDialog("how much would you like to deposit?"));
                savingsAccount.deposit(amount);
                System.out.println("Test");

            } else if (userChoice == 3)
            {
                JOptionPane.showMessageDialog(null, "your balance is " + savingsAccount.getBalance());
            } else if (userChoice == 4)
            {
                JOptionPane.showMessageDialog(null, "your interest rate is " + savingsAccount.getInterestRate());
            } else if (userChoice == 5)
            {
                savingsAccount.compoundInterest();
            } else if (userChoice == 6)
            {
                exit = "exit";
            }
        }
    }


}
