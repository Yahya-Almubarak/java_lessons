
public class EmployeeDriver2 {

	public static void main(String[] args) {
		String employeeName = "John Friday";
		int socialNumber = 1234;
		
		Employee2 john = new Employee2();

		john.setName(employeeName);
		john.setSocialNumber(socialNumber);
		
		String johnName = "Dummy";
		johnName = john.getName();

		System.out.println("John Name: " + john.getName());
		System.out.println("John Social number: " + john.getSocialNumber());

	}
}
