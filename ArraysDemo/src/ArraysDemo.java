
public class ArraysDemo {

	public static void main(String[] args) {
		//int[] grade = { 23, 45, 78, 93, 65, 87, 83, 73, 54, 92 };

		int[] grade;
		int size = 10;
		grade = new int[size];
		grade[0] = 23;
		grade[1] = 45;
		grade[2] = 78;
		grade[3] = 93;
		grade[4] = 65;
		grade[5] = 87;
		grade[6] = 83;
		grade[7] = 73;
		grade[8] = 54;
		grade[9] = 92;

		long sum = 0;

		for (int i = 0; i < grade.length; i++) {

			sum = sum + grade[i];

		}
		double avg = 1.0 * sum / grade.length;

		System.out.println(avg);

	}

}
