package BankFramework;

//.......Abstract class which is inherited by MMBankFactory
public abstract class BankFactory {
	
	abstract public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried);

	
	abstract public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit);

}
