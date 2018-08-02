package TrainingAssignment;

public class CorporateTraining extends Training{

	private int days;
	
	//.....Constructor calls its parent class constructor i.e Training
	public CorporateTraining(String subject, int fees, int days) {
		super(subject, fees);
		this.days = days;
	}

	
	//....returns cost of Corporate training
	//...Abstract method in parent class
	int getOrderValue() {
		return getFees()*days;
	}

}
