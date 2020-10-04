
public class CircleArea {
	
	static double pi = 3.14;
	
	public static void main(String[ ] args) {

		double r = 2;
		double a = circleArea(r);
		System.out.println(a);

	   } 


	   public static double circleArea(double radius) {
		   double area = pi*radius*radius;
			return area;
	   
	   }

	  


}
