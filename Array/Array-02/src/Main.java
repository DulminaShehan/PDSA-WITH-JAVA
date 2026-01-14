import javax.swing.*;
import javax.xml.transform.Source;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
// This Use insert, Delete, Search, Update Array

    int[] arr= new int[10];// array length
    int size=5;

    Scanner Userin=new Scanner(System.in);

    System.out.println("Enter Data :");
    for(int j=0;j<size;j++){
        arr[j]=Userin.nextInt();
    }
    System.out.println("---------------------------------------------------------");
    System.out.println("Output of Array ");
    for(int i=0;i<size;i++){
        System.out.println(arr[i]);;
    }
    System.out.println("---------------------------------------------------------");
    //insert - Start
    System.out.println("Enter you index =");
    int ind=Userin.nextInt();

    System.out.println("Enter the Element ");
    int ele=Userin.nextInt();

    size++;

    for (int k=size;k>ind;k--){
        arr[k]=arr[k-1];

    }
    arr[ind]=ele;
    System.out.println("Output of Array");
    for(int i=0;i<size;i++){
        System.out.println(arr[i]);;
    }
    //Insert - End
    System.out.println("---------------------------------------------------------");
    //Delete
    System.out.println("Enter you Delete");
}
