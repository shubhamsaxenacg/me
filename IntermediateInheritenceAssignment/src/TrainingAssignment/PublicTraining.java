package TrainingAssignment;

public class PublicTraining extends Training {

	private int participants;

	//.....Constructor calls its parent class constructor i.e Training
	//....Constructor gets its value in parameter from main function
	public PublicTraining(String subject, int fees, int participants) {
		super(subject, fees);
		this.participants = participants;
	}

	//....returns cost of public training
	//...Abstract method in parent class
	public int getOrderValue() {

		return getFees() * participants;
	}

}
