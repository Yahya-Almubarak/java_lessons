
public class RmsF2C {

	public static void main(String[] args) {
		float t1F;
		
		t1F= 89.5F;
		
		float t2F = 70.3F;
		float t3F = 120.76F;

		float t1C = (t1F - 32)*(5.0F/9);
		float t2C = (t2F- 32)*(5.0F/9);
		float t3C = (t3F- 32)*5/9;

		double rmsC;
		
		rmsC = Math.sqrt(( t1C*t1C + t2C*t2C + t3C*t3C )/ 3);
		 
		System.out.println(t1C);
		System.out.println(t2C);
		System.out.println(t3C);
		System.out.println(rmsC);

	}

}
