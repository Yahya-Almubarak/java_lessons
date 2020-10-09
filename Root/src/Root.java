
public class Root {

	public static void main(String[] args) {
		double a = 81;
		int n = 3;
		//System.out.println(root(a, n));
		System.out.println(rootByLoop(a, n));

	}
	
	public static double rootByLoop(double a, int n) {
		double xL = 0;
		double xU = a;
		double xBar;
		double yBar;
		do {
			xBar = (xL + xU) /2;
		    yBar = Math.pow(xBar, n) - a;
			
			if(yBar < 0) 
				xL = xBar;
			else
				xU = xBar;
			
		} while (Math.abs(yBar) >= 0.0000000000001 );
		return xBar;
	}
	
	
	
	
	public static  double root(double a, int n) {
		return checkMidPoint(0, a, a, n);
		
	}
	
	public static double checkMidPoint(double xL, double xU, double a,  int n) {
		double xBar = (xL + xU) / 2;
		double yBar = Math.pow(xBar, n) - a;
		if(Math.abs(yBar) <= 0.0000000000001) return xBar;
		if(yBar >= 0) return checkMidPoint(xL, xBar, a, n);
		else  return checkMidPoint(xBar, xU, a, n);
			
	}

}
