import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a whole number: ");
        int wholeNumber = sc.nextInt();

        System.out.print("Enter a decimal number: ");
        double decimalNumber = sc.nextDouble();

        // next() reads a single word up to the next whitespace
        System.out.print("Enter a single word: ");
        String word = sc.next();

        System.out.println("You entered " + wholeNumber + ", " + decimalNumber + ", and the word \"" + word + "\".");

        sc.close();
    }
}