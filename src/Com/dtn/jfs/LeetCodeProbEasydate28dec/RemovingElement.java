package Com.dtn.jfs.LeetCodeProbEasydate28dec;
import java.util.Arrays;
public class RemovingElement {
	
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};  // Initial array
	        int elementToRemove = 3;  // Element to remove

	        // Find the index of the element to remove
	        int indexToRemove = -1;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == elementToRemove) {
	                indexToRemove = i;
	                break;
	            }
	        }

	        // If the element was found
	        if (indexToRemove != -1) {
	            // Shift elements to the left after the element to remove
	            for (int i = indexToRemove; i < arr.length - 1; i++) {
	                arr[i] = arr[i + 1];
	            }

	            // Create a new array with one less element
	            arr = Arrays.copyOf(arr, arr.length - 1);

	            // Print the new array
	            System.out.println("Array after removal: " + Arrays.toString(arr));
	        } else {
	            System.out.println("Element " + elementToRemove + " not found in the array.");
	        }
	    }
	}






