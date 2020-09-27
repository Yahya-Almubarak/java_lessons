
public class DrawStars {

	public static void main(String[] args) {
		int n = 8;
		int m = 8;
		
		System.out.println("");
		System.out.println("1   1  1  1  1  1  1  1  1");
		System.out.println("=================================");
		System.out.println("");
		
		for(int i = 0; i < n; i++) {
			
				System.out.print("* ");
			
		}
		System.out.println("");
		

		System.out.println("");
		System.out.println("2 2 2 2 2 2 2  2 2 2 2 2 ");
		System.out.println("=================================");
		System.out.println("");
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print("* ");
			}
			System.out.println("");
			
		}
		
		System.out.println("");
		System.out.println("3 3 3 3 3 3  3 3 3 3 3 3");
		System.out.println("=================================");
		System.out.println("");
		
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println("");
			
		}
		
		System.out.println("");
		System.out.println("4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4");
		System.out.println("=================================");
		System.out.println("");
		
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println("");
			
		}
		for(int i = n-1; i >= 0; i--) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println("");
			
		}
		
		System.out.println("");
		System.out.println("5 5 5 5 5 5 5 5 5 5 5 5");
		System.out.println("=================================");
		System.out.println("");
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n- i -1; j++) {
				System.out.print("  ");
			}
			for(int j = n -i - 1 ; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println("");	
		}
		
		System.out.println("");
		System.out.println("6 6 6 6 6 6 6 6 6 6 6 6");
		System.out.println("=================================");
		System.out.println("");
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for(int j = i ; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println("");	
                  }

		
	} 
} 
