import java.util.Date;

public class Employee {
	public String name;
	public int id;
    public long startingDate;
    public double salary;
    
    
    
	public long startWork() {
		return 1L;
	}
	public boolean sendEmail(String message) {
		return false;
           	}
	public double askForRaise() {  
	            	  return salary * 4;
	}
}
