
public class Fibonacci {

	public static void main(String[] args) {
		long fo = 1;
		long f1 = 1;
		long f;
		
		System.out.println(fo);
		System.out.println(f1);
		
		for(int i = 2; i < 20; i++) {
			
				f = fo + f1;
				System.out.println(f);
				fo = f1;
				f1 = f;
			
		}
		

	}
}
