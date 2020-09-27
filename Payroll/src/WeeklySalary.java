
public class WeeklySalary {

	public static void main(String[] args) {
		
		float hourlyWage = 8.0F;

		int sundayWorkHours = 7;
		int mondayWorkHours = 10;
		int tuesdayWorkHours = 10;
		int whensdayWorkHours = 8;
		int thursdayWorkHours = 11;
		int fridayWorkHours = 6;
		int saturdayWorkHours = 9;
		
		float ordinarySalary = 0;
		float weekendSalary = 0;
		float extraWorkSalary = 0; 
		float totalSalary = 0;
		
		
		if(sundayWorkHours <= 8) {
			ordinarySalary = ordinarySalary + sundayWorkHours * hourlyWage;
		} else {
			ordinarySalary = ordinarySalary +  8 * hourlyWage;
			extraWorkSalary = extraWorkSalary + (sundayWorkHours - 8 ) * hourlyWage * 2;
		}
		
		if(mondayWorkHours <= 8) {
			ordinarySalary = ordinarySalary + mondayWorkHours * hourlyWage;
		} else {
			ordinarySalary = ordinarySalary +  8 * hourlyWage;
			extraWorkSalary = extraWorkSalary + (mondayWorkHours - 8 ) * hourlyWage * 2;
		}
		
		weekendSalary = (fridayWorkHours + saturdayWorkHours) * hourlyWage * 3;
		
		totalSalary = ordinarySalary + extraWorkSalary + weekendSalary;
		
		System.out.println("Total Salary: " + totalSalary);
		
		

		

	}

}
