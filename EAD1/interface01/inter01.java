import java.util.Scanner;
public class inter01 {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int a,b,c;
      System.out.println("Enter a number:");
      a=sc.nextInt();
      System.out.println("Enter another number:");
      b=sc.nextInt();
      c=a+b;
      System.out.println("Sum of the numbers is: "+c);
    }
}