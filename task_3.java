package codesoft;

import java.util.Scanner;

import codesoft.atmbank.Atm;
import codesoft.checkbalance.BankAccount;

public class task_3 {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000.0); // Initial balance
        Atm atm = new Atm(userAccount);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            atm.displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            atm.handleUserChoice(choice);
        } while (choice != 4);
    }
}
