
class BankAccount { // declare a class
    String accountNumber;
    String accountName;
    double balance;

    BankAccount(String accountNumber, String accountName, double initialBalance) { // what we call constructor
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = initialBalance;
    }

    double deposit(double amount) { // to deposit amount
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited: ₱%7.2f%n", amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
        return balance;
    }

    double withdraw(double amount) { // to withdraw amount
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrew: ₱%7.2f%n", amount);
        } else {
            System.out.printf("Withdraw Amount: ₱%7.2f%n", amount);
            System.out.println("Message: Insufficient funds.");
            System.out.printf("Current Balance: ₱%7.2f%n", balance);
        }
        return balance;
    }

    void displayInfo() { // to display the information
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account name: " + accountName);
        System.out.printf("Balance: ₱%7.2f%n", balance);
    }

}

public class ClassesObjects {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("20240000", "Juan de la Cruz", 2000);
        
        account1.displayInfo();
        System.out.println(" ");

        account1.deposit(500);
        account1.withdraw(1000);

        System.out.println(" ");
        
        System.out.println("------------------------------");

        System.out.println("Current Account Information:");
        System.out.println(" ");

        account1.displayInfo();
        System.out.println(" ");

    }
            
}