1.
Easy

 Sort Odd Even


import java.util.* ;
import java.io.*; 
public class Solution {
	public static void sortOddEven(int[] nums) {
		// Write your code here.
		List<Integer> odd = new ArrayList<>();
		List<Integer> even = new ArrayList<>();

		for(int i=0;i<nums.length;i++){
			if(nums[i] %2 == 0) even.add(nums[i]);
			else odd.add(nums[i]);
		}
		Collections.sort(even);
		odd.sort(Collections.reverseOrder());

		int i=0;
		for(int n:odd) nums[i++]=n;
		for(int n:even) nums[i++]=n;

	}
}
