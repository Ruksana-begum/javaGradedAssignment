import java.util.Arrays;
import java.util.Scanner;
public class first{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = s.nextInt();

        int[] Num = new int[n];
        System.out.print("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            Num[i] = s.nextInt();
        }

        s.close();
      //  int[] Num={5,3,4,2,0,8};
        try {
            calculateCumulativeMultiple(Num);
            System.out.println("arrNum = " + Arrays.toString(Num));
        } catch (ArithmeticException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }
    public static void calculateCumulativeMultiple(int[] arr) throws ArithmeticException {
        int Multiple = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                Multiple = 0;
                break;
            } else {
                Multiple *= arr[i];
            }
        arr[i] = Multiple;
        }
    

}
}

            



