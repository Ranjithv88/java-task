import java.util.*;

public class SecondLargest {
     public static int findSecondLargest(int[] number) {
         if (number.length < 2) {
             throw new IllegalArgumentException("Array must have at least two numbers.");
         }
         Arrays.sort(number);
         return number[number.length - 2];
     }

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
         System.out.println("\nSecond Largest: " +findSecondLargest(numbers));
     }
}

