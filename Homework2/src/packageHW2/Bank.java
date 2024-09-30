package packageHW2;

public class Bank {

	public static void main(String[] args) {
        BankAccount account1 = new BankAccount(100, 1000, 2);
        BankAccount account2 = new BankAccount(200, 1500, 2);

        account1.setBankBalance(account1.getBankBalance() + 300);

        account2.setBankBalance(account2.getBankBalance() - 400);

        System.out.println("Before interest calculation:");
        account1.displayAccount();
        account2.displayAccount();

        account1.updateBalance();
        account2.updateBalance();

        System.out.println("\nAfter interest calculation:");
        account1.displayAccount();
        account2.displayAccount();

        double account1USD = BankAccount.convertCur(150, 1.1);
        account1.setBankBalance(account1.getBankBalance() + account1USD);
        System.out.println("Account 100 after conversion of 150 Swiss Francs: $" + account1.getBankBalance());

        double account2USD = BankAccount.convertCur(140, 1.2);
        account2.setBankBalance(account2.getBankBalance() + account2USD);
        System.out.println("Account 200 after conversion of 140 Euros: $" + account2.getBankBalance());
    }
}
