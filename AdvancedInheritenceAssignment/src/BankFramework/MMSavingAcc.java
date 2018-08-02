package BankFramework;

//......this Class is used to create bank specific functionalities
//.....this extends SavingAcc

public class MMSavingAcc extends SavingAcc{
	
	private static final float MINBAL = 10_000;
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		
	}

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
//.....CONCRETE CLASS REPRESENTING BANK SPECIFIC
	public void withdraw(float amount)
	{
		float accBal = this.getAccBal();
		if(MINBAL<(accBal- amount))
			accBal = accBal - amount; 
		setAccBal(accBal);
	}
	
	

}
