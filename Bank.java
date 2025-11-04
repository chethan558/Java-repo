import java.util.Scanner;


class Account {
    String customerName;
    int accountNumber;
    String accountType;
    double balance;

    Account(String name, int number, String type) {
        customerName = name;
        accountNumber = number;
        accountType = type;
        balance = 0.0;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Enter the type of account: " + accountType);
        System.out.println("Enter the deposit amount: " + amount);
        System.out.println();
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Enter the type of account: " + accountType);
            System.out.println("Enter the withdrawal amount: " + amount);
            System.out.println();
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void displayAccount() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Type of Account: " + accountType + " account");
        System.out.println("Balance = " + balance);
        System.out.println();
    }
}


class Sav_acct extends Account {
    Sav_acct(String name, int number, String type) {
        super(name, number, type);
    }

    void computeInterest() {
        double rate = 0.05; // 5%
        double interest = balance * rate;
        balance += interest;
        System.out.println("Interest of " + interest + " added. Updated balance = " + balance);
        System.out.println();
    }
}


public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter account Number: ");
        int acc1 = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter customer name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter account Number: ");
        int acc2 = sc.nextInt();
        sc.nextLine(); 

      
        Sav_acct s1 = new Sav_acct(name1, acc1, "Savings");
        Sav_acct s2 = new Sav_acct(name2, acc2, "Savings");

        int choice;
        do {
            System.out.println("-----MENU-----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Compute interest for SavingsAccount");
            System.out.println("4. Display account details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    int ac = sc.nextInt();
                    System.out.print("Enter amount to deposit: ");
                    double damt = sc.nextDouble();
                    if (ac == s1.accountNumber)
                        s1.deposit(damt);
                    else if (ac == s2.accountNumber)
                        s2.deposit(damt);
                    else
                        System.out.println("Invalid account number!");
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    ac = sc.nextInt();
                    System.out.print("Enter amount to withdraw: ");
                    double wamt = sc.nextDouble();
                    if (ac == s1.accountNumber)
                        s1.withdraw(wamt);
                    else if (ac == s2.accountNumber)
                        s2.withdraw(wamt);
                    else
                        System.out.println("Invalid account number!");
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    ac = sc.nextInt();
                    if (ac == s1.accountNumber)
                        s1.computeInterest();
                    else if (ac == s2.accountNumber)
                        s2.computeInterest();
                    else
                        System.out.println("Invalid account number!");
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    ac = sc.nextInt();
                    if (ac == s1.accountNumber)
                        s1.displayAccount();
                    else if (ac == s2.accountNumber)
                        s2.displayAccount();
                    else
                        System.out.println("Invalid account number!");
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}

