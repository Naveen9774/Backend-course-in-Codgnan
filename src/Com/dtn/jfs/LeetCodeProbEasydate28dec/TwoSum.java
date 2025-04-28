package Com.dtn.jfs.LeetCodeProbEasydate28dec;
	public class TwoSum {
		    public int[] twoSum(int[] nums, int target) {
		        // Loop through the array with two nested loops
		        for (int i = 0; i < nums.length; i++) {
		            for (int j = i + 1; j < nums.length; j++) {
		                // If a pair of numbers add up to the target, return their indices
		                if (nums[i] + nums[j] == target) {
		                    return new int[] { i, j };
		                }
		            }
		        }
		        
		        // Return an empty array if no solution is found (though the problem guarantees one solution)
		        return new int[] {};
		    }

		    public static void main(String[] args) {
		    	TwoSum solution = new TwoSum();
		        
		        // Test case 1
		        int[] nums1 = {2, 7, 11, 15};
		        int target1 = 9;
		        int[] result1 = solution.twoSum(nums1, target1);
		        System.out.println("Result 1: [" + result1[0] + ", " + result1[1] + "]");
		        
		        // Test case 2
		        int[] nums2 = {3, 2, 4};
		        int target2 = 6;
		        int[] result2 = solution.twoSum(nums2, target2);
		        System.out.println("Result 2: [" + result2[0] + ", " + result2[1] + "]");
		        
		        // Test case 3
		        int[] nums3 = {3, 3};
		        int target3 = 6;
		        int[] result3 = solution.twoSum(nums3, target3);
		        System.out.println("Result 3: [" + result3[0] + ", " + result3[1] + "]");
		    }
		}





