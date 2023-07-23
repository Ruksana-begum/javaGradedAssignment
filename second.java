import java.util.ArrayList;//ArrayList to create a dynamic list for storing the missing numbers
import java.util.List;//List to declare the return type of the method.
import java.util.Scanner;//to take input from user

public class sec {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = s.nextInt();

        int[] arrNum = new int[n];
        System.out.println("Enter " + n + " consecutive integers:");

        for (int i = 0; i < n; i++) {
            arrNum[i] = s.nextInt();
        }

        s.close();
        List<Integer> missingNumbers = findMissingNumbers(arrNum);
        System.out.println("Missing numbers: " + missingNumbers);
        // int[] arrNum1 = {1, 2, 4, 5, 6};
        // int[] arrNum2 = {1, 2, 3, 5, 6, 8, 10, 11, 14};

        // System.out.println("Missing numbers in arrNum1: " + findMissingNumbers(arrNum1));
        // System.out.println("Missing numbers in arrNum2: " + findMissingNumbers(arrNum2));
    }

    public static List<Integer> findMissingNumbers(int[] arr) { //this method takes arr as argument
        List<Integer> missingNumbers = new ArrayList<>();//as input and returns a list of integers representing the missing numbers in the array.
        int n = arr.length;//ArrayList that will store the missing numbers. and n hold the values
        int expectedNumber = arr[0];//This variable is used to track the expected number in the consecutive sequence.

        for (int i = 0; i < n; i++) {
            while (arr[i] != expectedNumber) {
                missingNumbers.add(expectedNumber);
                expectedNumber++;
            }
            expectedNumber++;
        }

        return missingNumbers;
    }
}


