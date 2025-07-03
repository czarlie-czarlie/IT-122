package Finals;

import java.util.Scanner;

public class Bambao_FinAct1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];

       System.out.println("Enter six random numbers");
       do {
           for (byte i = 0; i < numbers.length; i++) {
               ++i;
               System.out.print("Enter #" + i + ": \n");
               --i;
               numbers[i] = Integer.parseInt(scanner.nextLine());
           }
            for (int number : numbers) {
                if (number == numbers[0])
                    System.out.println("Original Array:");
                System.out.print(number + " ");
           }
           break;
       } while (true);
    }
}
