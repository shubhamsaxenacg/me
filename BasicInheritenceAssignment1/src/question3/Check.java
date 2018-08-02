package question3;

public class Check {
	
	int defaultVariable;
	private int privateVariable;
	public int publicVariable;
	protected int protectedVariable;
	
	
	public void disp()
	{
		System.out.println("default value: "+defaultVariable+" Private Value: "+privateVariable+" Public Value: "+publicVariable+" Protected Value: "+protectedVariable);
	}
	
	public int getPrivate()
	{
		return privateVariable;
	}
}
