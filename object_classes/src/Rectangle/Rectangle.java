package Rectangle;

public class Rectangle {
	
	private int length;
	private int breadth;
	
	public Rectangle(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}



	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public int area()
	{
		int area = length * breadth;
		return area;
		
	}
	
	public boolean compare(Rectangle rectangleTwo)
	{
		boolean equal = false;
		if(this.area()== rectangleTwo.area())
		{
			equal = true;
		}
		return equal;
	}
}
