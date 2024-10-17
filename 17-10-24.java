 Find nth elements of spiral matrix



import java.util.* ;
import java.io.*; 
public class Solution {

	public static int findKthElement(int[][] matrix, int k) {
	    // Write your code here.
		int n =matrix.length;
		int m = matrix[0].length;
		int cnt=0;
		int left=0;
		int top=0;
		int bottom =n-1;
		int right=m-1;
		while(left<=right && top<=bottom){
			for(int i=left;i<=right;i++){
				cnt++;
				if(cnt==k) return matrix[top][i];
			}
			top++;
			for(int i=top;i<=bottom;i++){
				cnt++;
				if(cnt==k) return matrix[i][right];
			}
			right--;
			if(top<=bottom){
				for(int i=right;i>=left;i--){
					cnt++;
					if(cnt == k) return matrix[bottom][i];
				}
				bottom--;
			}
			if(left<=right){
				for(int i=bottom;i>=top;i--){
					cnt++;
					if(cnt==k) return matrix[i][left];
				}
				left++;
			}
		}
		return -1;
	}
}
