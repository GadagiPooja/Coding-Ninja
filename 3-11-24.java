import java.util.*; 

public class Solution {
    public static int missingNumber(int[] arr, int n) {
        int d = (arr[n - 1] - arr[0]) / n;

        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int ex = arr[0] + m * d;
            if (arr[m] == ex) {
                // Move to the right half if current element matches the expected value
                l = m + 1;
            } else {
                // Move to the left half if there's a discrepancy
                r = m - 1;
            }
        }
        // At the end of the loop, 'l' points to the location where the missing element should be
        return arr[0] + l * d;
    }
}
