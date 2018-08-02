package BankFramework;

//.....Implementing the logic of Saving Account
//.....This class is inheriting BankAcc class

public class SavingAcc extends BankAcc {

//....Static final value is initialized which will not be inherited in it's child class
	private boolean isSalaried;
	private static final float MINBAL = 3_000;
	

//....Constructor Class
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
//.....Withdraw function is used to check the minimum balance and determine if the withdraw is to be done
	public void withdraw(float amount)
	{
		float accBal = this.getAccBal();
		if(MINBAL<(accBal- amount))
			accBal = accBal - amount; 
		setAccBal(accBal);
	}


}
