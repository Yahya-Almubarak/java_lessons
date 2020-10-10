import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { -12, 3, 7, 7, 7, 7, 99, 100};
		int key = 7;
		System.out.println(binarySearch(arr, key));
		System.out.println(Arrays.binarySearch(arr, key));
		

	}
	
	public static int binarySearch(int[] arr, int key) {
		return binarySearch(arr, 0, arr.length -1, key);
	}
	
	public static int binarySearch (int[] arr, int first, int last, int key) {
		int mid;
		int index;
		if(first == last) {
			if(arr[first] == key) {
				index = first;
			}
			else {
				index = -1;
			}
		}
		else {
			mid = (last + first) / 2;
			if(key > arr[mid]) {
				first = mid + 1;
			}
			else {
				last = mid;
			}
			index = binarySearch(arr, first, last, key);
		}
		return index;
	}

}
