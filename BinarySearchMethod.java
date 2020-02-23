public class BinarySearchMethod{
	public static void printArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.printf("%d ", array[i]);
		}
		System.out.println();
	}
	public static int binarySearch(int[] array, int k){
		// Set the initial high and low
		int low = 0;
		int high = array.length - 1;
		// Loop until low > high
		while(low <= high){
			// Calculate the midway index
			int mid = (low + high) / 2;
			if (k > array[mid])
				// k in the upper part
				low = mid + 1;
			else if (k < array[mid])
				// k in the lower part
				high = mid - 1;
			else if (k == array[mid])
				// We found k
				return mid;
		}
		// We have not found k
		return -1;
	}
	public static void main(String[] args){
		// Declare an integer array
		int[] list = {3,6,10,13,16,17,21,23,32,35};		
		// Search for 32
		int k = 32;
		// Print the array
		printArray(list);
		// Call the binarySearch method
		int index = binarySearch(list, k);
		// Have we found the value?
		if (index > 0)
			System.out.printf("Value %d found at index %d.\n", k, index);
		else
			System.out.printf("Value %d not found.\n", k);
	}
}