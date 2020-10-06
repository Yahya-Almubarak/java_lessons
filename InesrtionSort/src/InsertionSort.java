import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		double[] ar = { 1, 6, 9, 7, 8, 3, 2, 12, 4, 1 };
		double[] sortedArray = sort(ar);
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.toString(sortedArray));
		
	} // end of main

	public static double[] sort(double[] unsortedArray) {
		// This line is to copy unsortedArray to a new array so that the modification does not effect the original array
		double[] tempArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
		
		
		int i = 1;
		while (i < tempArray.length) {
			int j = i;
			while (j > 0 && tempArray[j - 1] > tempArray[j]) {
				swap(j, j - 1, tempArray);
				j--;
			}
			i++;
		}
		return tempArray;
	} // end of sort

	public static void swap(int i, int jMin, double[] grade) {
		double temp = grade[i];
		grade[i] = grade[jMin];
		grade[jMin] = temp;
	} // end of swap

}
