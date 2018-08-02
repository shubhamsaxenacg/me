package TrainingAssignment;

//.....Contains main function which creates object for PublicTraining and CorporateTraining
public class TrainingCost {
	public static void main(String args[])
	{
		Training trainingP = new PublicTraining("Java", 5000, 50); //calls constructor of PublicTraining
		System.out.println("Cost of Public training with ID: "+ Training.getId()+" is : "+trainingP.getOrderValue());
		
		Training trainingC = new CorporateTraining("Bigdata", 35000, 4); //calls constructor of CorporateTraining
		System.out.println("Cost of Corporate training with ID: "+ Training.getId()+" is : "+trainingC.getOrderValue());
		
	}
}
