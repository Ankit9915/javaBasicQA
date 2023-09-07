
package hackerRank;
import java.util.Scanner;

public class ArraySumNumberAndString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter '1' to calculate the sum of an array, or '2' to concatenate a sentence: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            // Calculate the sum of an array
            System.out.print("Enter the number of elements in the array: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }

            int sum = sum(arr);
            System.out.println("Sum of array elements: " + sum);
        } else if (choice == 2) {
            // Concatenate a sentence
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine();

            String concatenatedString = sum(sentence);
            System.out.println("Concatenated string: " + concatenatedString);
        } else {
            System.out.println("Invalid choice!");
        }
    }

    // Method to calculate the sum of an integer array
    public static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Method to concatenate strings
    public static String sum(String sentence) {
        StringBuilder result = new StringBuilder();
        String[] words = sentence.split(" ");
        for (String word : words) {
            result.append(word);
        }
        return result.toString();
    }
}
