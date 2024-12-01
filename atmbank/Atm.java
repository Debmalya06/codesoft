package codesoft.atmbank;

import java.util.Scanner;

import codesoft.checkbalance.BankAccount;

public class Atm {
    private BankAccount userAccount;

    public Atm(BankAccount userAccount) {
        this.userAccount = userAccount;
    }

    public void displayMenu() {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void handleUserChoice(int choice) {
        Scanner scanner = new Scanner(System.in);
        switch (choice) {
            case 1:
            System.out.print("Enter withdrawal amount: $");
            double withdrawAmount = scanner.nextDouble();
            withdraw(withdrawAmount);
            break;
            case 2:
            System.out.print("Enter deposit amount: $");
            double depositAmount = scanner.nextDouble();
            deposit(depositAmount);
            break;
            case 3:
                checkBalance();
                break;
            case 4:
                System.out.println("Thank you for using the ATM. Have a great day!");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
    }

    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
            return;
        }
    
        if (userAccount.withdraw(amount)) {
            System.out.println("Withdrawal successful. $" + amount + " has been deducted from your account.");
        } else {
            System.out.println("Insufficient funds. Your current balance is $" + userAccount.getBalance());
        }
    }

    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
            return;
        }
    
        userAccount.deposit(amount);
        System.out.println("Deposit successful. $" + amount + " has been added to your account.");
    }

    private void checkBalance() {
        System.out.println("Your account balance: $" + userAccount.getBalance());
    }
}

