Easy

import java.util.*; 
import java.io.*; 

public class Solution {

    public static boolean isValidIPv4(String ipAddress) {
        String[] arr = ipAddress.split("\\.");
        if (arr.length != 4) return false;
        
        for (String segment : arr) {
            try {
                int num = Integer.parseInt(segment);
                if (num < 0 || num > 255 || !segment.equals(String.valueOf(num))) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValidIPv4("192.168.1.1")); // should return true
        System.out.println(isValidIPv4("256.100.50.0")); // should return false
    }
}






Medium




  import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public static boolean validStackPermutation(ArrayList<Integer> a, ArrayList<Integer> b) {
        Stack<Integer> s = new Stack<>();
        int j = 0;
        
        for (int i = 0; i < a.size(); i++) {
            s.push(a.get(i));
            
            // Check if the top of the stack matches the next element in `b`
            while (!s.isEmpty() && s.peek().equals(b.get(j))) {
                s.pop();
                j++;
            }
        }
        
        // If all elements are matched and stack is empty, it's a valid permutation
        return j == b.size() && s.isEmpty();
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(List.of(1, 2, 3));
        ArrayList<Integer> b = new ArrayList<>(List.of(2, 1, 3));
        System.out.println(validStackPermutation(a, b)); // should return true

        ArrayList<Integer> c = new ArrayList<>(List.of(1, 2, 3));
        ArrayList<Integer> d = new ArrayList<>(List.of(3, 1, 2));
        System.out.println(validStackPermutation(c, d)); // should return false
    }
}
