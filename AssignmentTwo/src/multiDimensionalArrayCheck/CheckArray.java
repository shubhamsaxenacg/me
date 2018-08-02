package multiDimensionalArrayCheck;

//........Object of this class is created in MultiDimensionalArrayCheck
public class CheckArray {
	
//........Traverses the 2D array to find a specific element provided in the parameter
	public void findElement(String array[][], int rowLength, int colLength, String element)
	{
		
		for(int i=0; i< rowLength; i++)
		{
			for(int j=0; j< colLength; j++)
			{
				if(element.equals(array[i][j]))
				{
					System.out.println(element+" Is Found At Position ["+i+"]["+j+"]");
					break;
				}
				
				
				
			}
		}
	}

}
