package binary_search;

public class Main {

	public static int calculateIndexMidLength(int loIndex, int hiIndex) {
		int returnValue = 0;
		if (loIndex < hiIndex) {

		}
		return returnValue;

	}

	static int[] arrs = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11, 12, 13, 14, 15, 16,16 ,17};

	public static int binarySearch(int e, int[] arr) {

		int loIndex = 0;
		int hiIndex = arr.length - 1;
		while (loIndex <= hiIndex) {

			int midIndex = loIndex + ((hiIndex - loIndex) / 2);
			System.out.println("Mid :" + midIndex + " Lo : " + loIndex + " Hi: " + hiIndex);

			if (e == arr[midIndex]) {
				return arr[midIndex];
			}

			if (e > arr[midIndex]) {
				loIndex = midIndex + 1;

			}
			if (e < arr[midIndex]) {
				hiIndex = midIndex - 1;
			}

		}

		return 0;

	}

	public static void printArray(int[] arr) {
		for (int t : arr) {
			System.out.print(" " + t);
		}
	}

	public static int[] removeDuplicates(int[] arrs) {
		int[] returnValue = new int[arrs.length];
		int retValCtr = 0;
		int x = 0;

		while (x < arrs.length - 1) {

			if (x == arrs.length - 2 &&((arrs[x + 1] != arrs[x]))) {
				System.out.println("last");
				returnValue[retValCtr] = arrs[x];
				returnValue[retValCtr+1] = arrs[x+1];
				retValCtr++;

			} else if (arrs[x + 1] == arrs[x]) {

			}

			else if ((arrs[x + 1] != arrs[x])) {
				returnValue[retValCtr] = arrs[x];
				retValCtr++;
			}
			x++;
		}
		return returnValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(binarySearch(1, arrs));
		;
		printArray(removeDuplicates(arrs));

	}

}
