// import java.util.Scanner;

// public class StringManipulator {

//     public String reverseString(String input) {
//         // Check for null or empty input
//         if (input == null || input.isEmpty()) {
//             return input;
//         }

//         // Convert the input string to a character array
//         char[] chars = input.toCharArray();

//         // Reverse the character array
//         int left = 0;
//         int right = chars.length - 1;
//         while (left < right) {
//             char temp = chars[left];
//             chars[left] = chars[right];
//             chars[right] = temp;
//             left++;
//             right--;
//         }

//         // Convert the reversed character array back to a string
//         return new String(chars);
//     }

//     public static void main(String[] args) {
//         StringManipulator sm = new StringManipulator();

//         // Create a Scanner object to read user input
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a string to reverse: ");
//         String input = scanner.nextLine();

//         // Call the reverseString method and print the result
//         String reversed = sm.reverseString(input);
//         System.out.println("Original String: " + input);
//         System.out.println("Reversed String: " + reversed);

//         scanner.close();
//     }
// }

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StringManipulator {

    public String reverseString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    public List<Integer> findDuplicates(int[] numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int number : numbers) {
            if (!uniqueNumbers.add(number)) {
                duplicates.add(number);
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        StringManipulator sm = new StringManipulator();

        // Reverse string example
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        String reversed = sm.reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);

        // Find duplicates example
        int[] numbers = { 1, 2, 3, 4, 2, 5, 6, 3, 4, 7, 8, 5 };
        List<Integer> duplicateNumbers = sm.findDuplicates(numbers);
        System.out.println("Duplicate Numbers: " + duplicateNumbers);

        scanner.close();
    }
}
