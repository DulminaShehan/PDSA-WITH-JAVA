import javax.swing.*;
import javax.xml.transform.Source;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
// This Use insert, Delete, Search, Update Array

    int[] arr = new int[10]; // array length
    int size = 5;

    Scanner Userin = new Scanner(System.in);

    System.out.println("Enter Data :");
    for (int j = 0; j < size; j++) {
        arr[j] = Userin.nextInt();
    }

    System.out.println("---------------------------------------------------------");
    System.out.println("Output of Array ");
    for (int i = 0; i < size; i++) {
        System.out.println(arr[i]);
    }

    // -------- Insert --------
    System.out.println("---------------------------------------------------------");
    System.out.println("Enter your index =");
    int insertIndex = Userin.nextInt();

    System.out.println("Enter the Element ");
    int ele = Userin.nextInt();

    for (int k = size; k > insertIndex; k--) {
        arr[k] = arr[k - 1];
    }
    arr[insertIndex] = ele;
    size++;

    System.out.println("Output of Array after Insert:");
    for (int i = 0; i < size; i++) {
        System.out.println(arr[i]);
    }

    // -------- Delete --------
    System.out.println("---------------------------------------------------------");
    System.out.println("Enter your Delete index =");
    int deleteIndex = Userin.nextInt();

    for (int j = deleteIndex; j < size - 1; j++) {
        arr[j] = arr[j + 1];
    }
    size--;

    System.out.println("Output of Array after Delete:");
    for (int i = 0; i < size; i++) {
        System.out.println(arr[i]);
    }
}
