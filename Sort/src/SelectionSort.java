import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		
		double temp = 0;
		double[] grade = { 7, 3, 5, 1, 6};
		int aLength = grade.length;
		
		for (int i = 0; i < aLength-1; i++)
		{
		    
		    int jMin = i;
		   
		    for (int j = i+1; j < aLength; j++)
		    {
		        
		        if (grade[j] < grade[jMin])
		        { 
		            jMin = j;
		        }
		    }

		    if (jMin != i) 
		    { 
		    	temp = grade[i];
		    	grade[i] = grade[jMin];
		    	grade[jMin] = temp;
		        
		    }
		}
		
		System.out.println(Arrays.toString(grade));

	}

}
