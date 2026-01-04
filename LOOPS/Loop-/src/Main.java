void main() {
          pattern01(5);
          pattern02(5);
          pattern03(5);
          pattern04(5);
          pattern05(5);
          pattern06(6);
          pattern07(6);
          pattern08(5);
          pattern09(6);
          pattern10(6);
          pattern11(7);
          pattern12(6);
     }

     // Pattern 01 - Right angle triangle
     static void pattern01(int n) {
           System.out.println("pattern 01");
          for (int row = 0; row < n; row++) {
               for (int col = 0; col <= row; col++) {
                    System.out.print("* ");
               }
               System.out.println();
          }
          System.out.println("-------------------------");
     }

     // Pattern 02 - Square
     static void pattern02(int n) {
          System.out.println("pattern 02");
          for (int row = 1; row <= n; row++) {
               for (int col = 1; col <= n; col++) {
                    System.out.print("* ");
               }
               System.out.println();
          }
          System.out.println("-------------------------");
     }

     // Pattern 03 - Reverse right angle triangle
     static void pattern03(int n) {
          System.out.println("pattern 03");
          for (int row = n; row >= 1; row--) {
               for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
               }
               System.out.println();
          }
          System.out.println("-------------------------");
     }

     // Pattern 04 - Same as pattern03 (example)
     static void pattern04(int n) {
          System.out.println("pattern 04");
          for (int row = n; row >= 1; row--) {
               for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
               }
               System.out.println();
          }
          System.out.println("-------------------------");
     }
     static void pattern05(int n){
          System.out.println("pattern 05");
          for (int row = 1; row <= n; row++) {

               // spaces
               for (int s = n; s > row; s--) {
                    System.out.print(" ");
               }

               // stars
               for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
               }

               // next line
               System.out.println();
          }
          System.out.println("-------------------------");
     }
// start this 1 to 4
   static void pattern06(int n) {
        System.out.println("pattern 06");
     for (int row = 1; row < n; row++) {
          for (int col = 1; col <= row; col++) {
               System.out.print(col +"  ");
          }
          System.out.println();
     }
     System.out.println("-------------------------");
}
static void pattern07(int n) {
     System.out.println("pattern 07");
     for (int row = 1; row < n; row++) {
          for (int col = 1; col <= row; col++) {
               System.out.print(row +"  ");
          }
          System.out.println();
     }
     System.out.println("-------------------------");
}
static void pattern08(int n) {
     System.out.println("pattern 08");

     for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= n; j++) {

               if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(" ");
               } else {
                    System.out.print("  ");
               }
          }
          System.out.println();
     }
}
static void pattern09(int n){
     System.out.println("pattern 09");
     for (int row = 1; row <= n; row++) {

          // spaces
          for (int s = n; s > row; s--) {
               System.out.print(" ");
          }

          // stars
          for (int col = 1; col <= row; col++) {
               System.out.print(row + " ");
          }

          // next line
          System.out.println();
     }
     System.out.println("-------------------------");
}
static void pattern10(int n){
     System.out.println("pattern 10");
     int num=1;
     for (int row = 1; row <= n; row++) {

          // spaces
          for (int s = n; s > row; s--) {
               System.out.print("  ");
          }

          // stars
          for (int col = 1; col <= row; col++) {
               System.out.print(num + " ");
               num++;
          }

          // next line
          System.out.println();
     }
     System.out.println("-------------------------");
}
static void pattern11(int n){
     System.out.println("pattern 11");

     int num = 1;

     // outer loop to handle upper part
     for (int row = 1; row <= n; row++) {

          // inner loop to print spaces
          for (int col = 1; col <= n - row; col++) {

               System.out.print(" ");
          }

          // inner loop to print stars
          for (int col = 1; col <= 2 * row - 1; col++) {
               System.out.print("*");

          }
          System.out.println();
     }

     // outer loop to handle lower part
     for (int row = n-1; row >= 1; row--) {

          // inner loop to print spaces
          for (int col = 1; col <= n - row; col++) {
               System.out.print(" ");
          }

          // inner loop to print stars
          for (int col = 1; col <= 2 * row - 1; col++) {
               System.out.print("*");
          }
          System.out.println();
          System.out.println("-------------------------");
     }
}
static void pattern12(int n){
     System.out.println("pattern 11");
     for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= 2 * n; j++) {

               // To print spaces
               if (j > i && j <= 2 * n - i) {
                    System.out.print(" ");
               }

               // To print stars
               else {
                    System.out.print("*");
               }
          }
          System.out.println();
     }

     // Outer loop to handle the lower part
     for (int i = n; i >= 1; i--) {
          for (int j = 1; j <= 2 * n; j++) {

               // To print spaces
               if (j > i && j <= 2 * n - i) {
                    System.out.print(" ");
               }

               // To print stars
               else {
                    System.out.print("*");
               }
          }
          System.out.println();
     }
     System.out.println("-------------------------");
}


