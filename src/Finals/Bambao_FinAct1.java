package Finals;

import java.util.Scanner;

public class Bambao_FinAct1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];

       System.out.println("Enter six random integers");
           for (byte i = 0; i < numbers.length; i++) {
               System.out.print("Enter #" + (i + 1) + ": ");
               numbers[i] = Integer.parseInt(scanner.nextLine());
           }
            for (int number : numbers) {
                if (number == numbers[0])
                    System.out.println("\nOriginal Array:");
                System.out.print(number + " ");
           }
           for (byte i = 0; i < numbers.length - 1; i++) {
               for (byte j = 0; j < numbers.length - 1 - i; j++) {
                   if (numbers[j] > numbers[j + 1]) {
                       int temp = numbers[j];
                       numbers[j] = numbers[j + 1];
                       numbers[j + 1] = temp;
                   }
               }
           }
           for (int number: numbers) {
               if (number == numbers[0])
                   System.out.println("\nSorted Array:");
               System.out.print(number + " ");
           }
        System.out.println("\nSorted array has been written to sorted_output.txt");
    }
}
