import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input reading
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Call the function and print the result
        int result = countNegative(arr);
        System.out.println(result);

        scanner.close();
    }

    public static int countNegative(int[] arr) {
        int count = 0;
        int N = arr.length;

        for (int i = 0; i < N; i++) {
            int currentSum = 0;
            for (int j = i; j < N; j++) {
                currentSum += arr[j];
                if (currentSum < 0) {
                    count++;
                }
            }
        }

        return count;
    }


        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
