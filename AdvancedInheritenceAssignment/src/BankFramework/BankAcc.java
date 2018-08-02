package BankFramework;

//....Abstract class to represent bank account
//....inherited by SavingAcc and CurrentAcc
public abstract class BankAcc {
	 private int accNo;
	 private String accNm;
	 private float accBal;
	 
//....Constructor
	public BankAcc(int accNo, String accNm, float accBal) {
		this.accBal = accBal;
		this.accNm = accNm;
		this.accNo = accNo;
	}

//....Abstract method mandatory to implement in child classes
	 abstract public void withdraw(float amount);
	 
	 public void deposite(float amount) {
		 accBal = accBal + amount;
	}
	
//....Overridden by object class	 
	 @Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}

//...AccNo is read only
	public int getAccNo() {
		return accNo;
	}
	
//....AccNm is read
	public String getAccNm() {
		return accNm;
	}
	
//....AccNm is write	
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

//...AccBal is read only
	public float getAccBal() {
		return accBal;
	}

//....AccBal is read only so it's protected
	protected void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	
	

}	 

