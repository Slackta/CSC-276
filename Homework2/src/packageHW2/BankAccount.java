package packageHW2;

public class BankAccount {
	private final double INTEREST_RATE = 0.03;
	
	private int accountNum;
	private double bankBalance;
	private int duration;
	private double interest;
	
	public BankAccount(int accountNum, double bankBalance, int duration)
	{
		this.accountNum = accountNum;
		this.bankBalance = bankBalance;
		this.duration = duration;
	}
	
	public void calcInterest()
	{
		interest = bankBalance * INTEREST_RATE * duration;
	}
	
	public void updateBalance()
	{
		calcInterest();
		bankBalance += interest;
	}

	public void displayAccount()
	{
		System.out.println("\nAccount Number: " + accountNum);
		System.out.println("Balance: " + bankBalance);
		System.out.println("Duration: " + duration);
		System.out.println("Interest: " + interest);
	}
	public static double convertCur(double fAmount, double fEx) {
		 return fAmount * fEx;
	 }
	
	public double getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }
    
    public int getAccountNum() {
        return accountNum;
    }
    
    public int getDuration() {
        return duration;
    }
}