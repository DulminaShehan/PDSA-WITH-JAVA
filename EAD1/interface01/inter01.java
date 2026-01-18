import java.util.Scanner;
public class inter01 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("Enter your number =");
        a = sc.nextInt();

        System.out.println("Enter your second number =");
        b = sc.nextInt();

        try {
            c = a / b;
            System.out.println("Answer = " + c);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        System.out.println("Bye");
    }
}