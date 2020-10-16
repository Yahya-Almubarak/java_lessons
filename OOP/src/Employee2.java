
public class Employee2 {
	
	private String name;
	private int socialNumber;
	private boolean expert;


	

	public void setName(String name) {
		//this.name = name;
		this.name = new String(name);
		int a = 56;
	}

	public String getName() {
		return this.name;
	}

	public void setSocialNumber(int socialNumber) {
		this.socialNumber = socialNumber;
	}

	public int getSocialNumber() {
		return this.socialNumber;
	}
	
	public boolean isExpert() {
		return expert;
	}

	public void setExpert(boolean expert) {
		this.expert = expert;
	}

}
