

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee john = new Employee();
		Employee bob = new Employee();

		john.name = "John";
		john.id = 1234;
		john.salary = 2490;
		john.startingDate = 1234566;
		
		bob.name = "Bob";
		bob.id = 5678;
		bob.salary = 1890;
		bob.startingDate = 123457;
		
		john.salary = john.askForRaise();
		bob.salary = bob.askForRaise();
		
		System.out.println("John Salary " + john.salary);
		System.out.println("Bob salary " + bob.salary);
	}
}
