package person;

public class PersonAssignment {

	public static void main(String[] args) {
		Person person1 = new Person("Ram", 5, 6, 1980);
		Person person2 = new Person("Shayam", 2, 3, 1987);
		person1.display();
		person2.display();
		person1.olderOne(person1, person2);
	}

}