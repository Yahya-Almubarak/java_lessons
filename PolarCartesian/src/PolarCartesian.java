
public class PolarCartesian {

	public static void main(String[] args) {
		double x = 3;
		double y = -1;
		double[] polar = convertCartesian2Polar(x, y);
		System.out.println(polar[1] * 180/Math.PI);
		System.out.println(" x = " + convertPolar2Cartesian(polar[0], polar[1])[0]);
		System.out.println(" y = " + convertPolar2Cartesian(polar[0], polar[1])[1]);
		double theta = Math.atan2(y, x);
		System.out.println(theta * 180/ Math.PI);
		System.out.println(" x = " + convertPolar2Cartesian(polar[0], theta)[0]);
		System.out.println(" y = " + convertPolar2Cartesian(polar[0], theta)[1]);
		
		

	}
	
	public static double[] convertCartesian2Polar(double x, double y) {
		double[] polar = new double[2];
		double r = Math.sqrt(x*x + y*y);
		double theta = 0;
		if(x > 0) 
			theta = Math.atan(y/x);
		else if(x < 0 && y >= 0) 
			theta = Math.atan(y/x) + Math.PI ;
		else if( x < 0 && y < 0)
			theta = Math.atan(y/x) - Math.PI ;
		else if(x == 0 && y > 0) 
			theta = Math.PI / 2;
		else if(x == 0 && y < 0) 
			theta = - Math.PI / 2;
		return new double[] {r, theta};
	}
	
	public static double[] convertPolar2Cartesian(double r, double theta) {
		double[] cartesian = new double[2];
		double x = r * Math.cos(theta);
		double y = r * Math.sin(theta);
		cartesian[0] = x;
		cartesian[1] = y;
		return cartesian;
	}

}
