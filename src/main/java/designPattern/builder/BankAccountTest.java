package designPattern.builder;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount.Builder(123).withOwner("Marge").atBranch("Springfield")
				.openingBalance(100).atRate(2.5).build();
		System.out.println("this is the BankAccount: " + bankAccount.getInterestRate());
	}

}
