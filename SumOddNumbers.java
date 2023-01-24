import java.text.BreakIterator;
import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an odd number: ");
        int oddSumMax = in.nextInt();
        int total = 0;

        while (oddSumMax % 2 == 0) {
            System.out.println("Sorry this isn't an odd number");
            System.out.println("Enter an odd number: ");
            oddSumMax = in.nextInt();
        }


        for (int i = 1; i <= oddSumMax; i++) {
            if (i % 2 != 0) {
                total += i;
            }
        }
        System.out.println(total);

        in.close();
    }
}
