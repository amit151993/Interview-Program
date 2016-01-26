package dec15;

public class LargestNumSmallestNum {

	public static void main(String[] args) {
		int[] arr =  { 23, 6, 24, 76, 234 };
		int largest = arr[0];
		int smallest = arr[0];
		int largestIndex = 0;
		int smallestIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
				largestIndex = i;
			} else if (largest > arr[i]) {
				smallest = arr[i];
				smallestIndex = i;

			}

		}
		System.out.println("largest number is " + largest);
		System.out.println(largestIndex);
		System.out.println("smallest number is " + smallest);
		System.out.println(smallestIndex);
	}
}
