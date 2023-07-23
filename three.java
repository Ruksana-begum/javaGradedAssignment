import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class three {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

           System.out.print("Enter the number of elements in the array: ");
           int n = scanner.nextInt();

        int[] arrNum = new int[n];
        System.out.println("Enter " + n + " sock pair IDs:");

        for (int i = 0; i < n; i++) {
            arrNum[i] = scanner.nextInt();
        }

        scanner.close();

        int singularCount = findSingularSocksCount(arrNum);
        System.out.println("Count of singular socks = " + singularCount);
    }
       // int[] arrNum = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        //int singularCount = findSingularSocksCount(arrNum);
       // System.out.println("Count of singular socks = " + singularCount);
    

    public static int findSingularSocksCount(int[] arr) {
        // Step 1: Create a HashMap to store the sock IDs as keys and their counts as values.
        Map<Integer, Integer> sockCounts = new HashMap<>();

        // Step 2: Count the occurrences of each sock ID in the array and store in the HashMap.
        for (int sockID : arr) {
            sockCounts.put(sockID, sockCounts.getOrDefault(sockID, 0) + 1);
        }

        // Step 3: Calculate the number of singular socks (socks with no pairs) from the sockCounts.
        int singularCount = 0;
        for (int count : sockCounts.values()) {
            if (count % 2 != 0) {
                singularCount++;
            }
        }

        return singularCount;
    }
}

    

