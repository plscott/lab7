package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		//TODO: S1 implements bubble sort
		int length = unsortedArray.length;

		for (int i = 0; i < (length - 1); i++) {
			for (int j = 0; j < (length - i - 1); j++) {
				if (unsortedArray[j] > unsortedArray[j+1]) {
					int swap = unsortedArray[j];
					unsortedArray[j] = unsortedArray[j+1];
					unsortedArray[j+1] = swap;
				}
			}
		}
			
		return unsortedArray;
	}
}
