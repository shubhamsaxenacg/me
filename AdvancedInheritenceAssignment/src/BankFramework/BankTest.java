package BankFramework;

public class BankTest {
	public static void main(String args[])
	{
		BankFactory bankfactory = new MMBankFactory();
		
		SavingAcc savingAcc = bankfactory.getNewSavingAcc(10,"Shubham" , 10_000 , true);
		savingAcc.withdraw(1000);
		savingAcc.deposite(3000);
		
		System.out.println(savingAcc.toString());
		
		
		 CurrentAcc currentAcc = bankfactory.getNewCurrentAcc(10,"Subhjmnm" , 50_000 , 1000);
		 currentAcc.withdraw(5_000);
		
		System.out.println(currentAcc.toString());
		

		
	}
}
