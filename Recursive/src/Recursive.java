
public class Recursive {
	


	public static void main(String[] args) {
		int n = 12;
		for(int i = 0; i < n; i++)
		System.out.println(fibonacci(i));
		System.out.println("____________________");
		System.out.println(factorial(n));
	}
	
	public static long factorial(int n) {
		
		if(n <= 1) return 1;
		long fact = factorial(n-1);
		return n * fact;

	}
	
	public static long fibonacci(int n) {
		if(n <=1 ) return 1;
		return fibonacci(n-1) + fibonacci(n-2);
		
	}

}
