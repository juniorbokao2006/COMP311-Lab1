import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the name first with nextLine() - safest order to avoid newline issues
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello " + name + "! In five years, you will be " + (age + 5) + " years old.");

        sc.close();
    }
}