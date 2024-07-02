import java.util.ArrayList;

public class Bank {
    private static ArrayList<BankAccount> accounts = new ArrayList<>();

    public static void createBankAccount(int accNum, String holder, int balance) {
        accounts.add(new BankAccount(accNum, holder, balance));
        System.out.println("Account created");
    }

    public static void closeBankAccount(int accNum) {
        accounts.remove(accNum);
        System.out.println("Account closed");
    }

    public static void deposit(int accNum, int amount) {
        boolean itDeposit = false;
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber() == accNum) {
                acc.setBalance(acc.getBalance() + amount);
                itDeposit = true;
            }
        }
        if (!itDeposit) System.out.println("Deposit success");
    }

    public static void withdraw(int accNum, int amount) {
        boolean itWithdrawn = false;
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber() == accNum) {
                if (acc.getBalance() < amount) {
                    System.out.println("You don't have enough money!");
                }
                acc.setBalance(acc.getBalance() - amount);
                itWithdrawn = true;
            }
        }
        if (itWithdrawn) System.out.println("You have withdrawn with success!");
    }

    public static void transfer(int transferAcc, int reciverAcc, int amount) {
        boolean itTransfered = false;
        for (BankAccount acc : accounts) {
            for (BankAccount acc2 : accounts) {
                if (acc.getAccountNumber() == transferAcc && acc2.getAccountNumber() == reciverAcc) {
                    if (acc.getBalance() < amount) {
                        System.out.println("You don't have enough money!");
                    }
                    if (acc.getBalance() >= amount) {
                        acc2.setBalance(acc2.getBalance() + amount);
                        itTransfered = true;
                    }
                }
            }
        }
        if (itTransfered) System.out.println("You have transferred with success!");
    }
}
