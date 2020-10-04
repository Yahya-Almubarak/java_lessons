import java.util.Arrays;

public class SelectionSort {
	static double grade[] = { 1, 4, 9, 5, 6, 7 };

	public static void main(String[] args) {

		for (int i = 0; i < grade.length - 1; i++) {
			int jMin = findJMin(i, grade);
			if (jMin != i) {
				swap(i, jMin, grade);
			}
		}
		System.out.println(Arrays.toString(grade));
	} // end of main

	public static void swap(int i, int jMin, double[] grade) {
		double temp = grade[i];
		grade[i] = grade[jMin];
		grade[jMin] = temp;
	} // end of swap

	public static int findJMin(int i, double[] grade) {
		int jMin = i;
		for (int j = i + 1; j < grade.length; j++) {
			if (grade[j] < grade[jMin]) {
				jMin = j;
			}
		}
		return jMin;

	} // end of findJMin

} // end of class
 