package date;

import java.text.SimpleDateFormat;

public class Date {
	private int day;
	private int month;
	private int year;
	
	
	Date(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString()
	{
		String date;
		String dayString = Integer.toString(day);
		String monthString = Integer.toString(month);
		String yearString = Integer.toString(year);
		
		date = dayString + "/" + monthString + "/" + yearString;
		return date;
	}
	
	public boolean isSmaller(Date d)
	{
		boolean s = false;
		if(this.year> d.year)
		{
			s = true;
		}
		else if(this.year< d.year)
		{
			s = false;
		}
		else
		{
			if(this.month> d.month)
			{
				s = true;
			}
			else if(this.month< d.month)
			{
				s = false;
			}
			else
			{
				if(this.day> d.day)
				{
					s = true;
				}
				else if(this.day< d.day)
				{
					s = false;
				}
				else
				{
					s = false;
				}
			}
		}
		return s;
	}
	
	public int[] diff(Date d)
	{
		String secondDate= d.toString();
		String firstDate = this.toString();
		int differenceArray[] = new int[3];
		try {
			java.util.Date firsDate = new SimpleDateFormat("dd/MM/yyyy").parse(firstDate);
			java.util.Date seconDate = new SimpleDateFormat("dd/MM/yyyy").parse(secondDate);
			
			long diff = seconDate.getTime() - firsDate.getTime();
			
			differenceArray[0] = (int) (diff/(24*60*60*1000));
			differenceArray[1] = (int) (differenceArray[0]/30);
			differenceArray[2] = (int) (differenceArray[1]/12);
				
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return differenceArray;
	}
	
	
}
