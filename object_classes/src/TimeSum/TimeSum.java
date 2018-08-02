package TimeSum;

public class TimeSum {
	private int hour;
	private int minute;
	
	void set(int hour, int minute)
	{
		this.hour=hour;
		this.minute=minute;
	}
	
	public int getHour()
	{
		return hour;
	}
	
	public int getMinute()
	{
		return minute;
	}
	
	void display()
	{
		System.out.println(getHour()+":"+getMinute());
	}
	
	 TimeSum sum(TimeSum time1, TimeSum time2)
	{
		TimeSum time3 = new TimeSum();
		time3.hour = time1.getHour()+time2.getHour();
		time3.minute = time1.getMinute()+time2.getMinute();
		if(time3.minute>=60)
		{
			time3.hour += time3.minute/60;
			time3.minute = time3.minute%60;
		}
		return time3;
	}
}
