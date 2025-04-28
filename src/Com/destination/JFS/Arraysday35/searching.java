package Com.destination.JFS.Arraysday35;

import java.util.Arrays;
import java.util.Scanner;

public class searching {
	public static void main(String[] args) {
		int[] nums= {1,3,4,5,6};
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++) {
			if(nums[i] != i+1) {
				System.out.println("Missing is :"+ (i+1));
				return;
			}
			
			
		}
		
		
	
		
	}

}
