package Sorting;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Generates a random array
		int[] unsortedArray = new int[(int) (Math.random()*20.0)];
		for (int i = 0; i < unsortedArray.length; i++) {
			unsortedArray[i] = (int) (Math.random()*20.0);
		}
		
		System.out.println("Unsorted Array:");
		
		for (int i: unsortedArray) {
				System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("Sorted Array:");
		//TODO: sort the array and print out its contents
		InsertionSort iSorter = new InsertionSort();
		int[] insertionSorted = iSorter.insertionSort(unsortedArray);
		for (int i = 0; i < insertionSorted.length; i++) {
			System.out.println(insertionSorted[i]);
		}
	}
}
