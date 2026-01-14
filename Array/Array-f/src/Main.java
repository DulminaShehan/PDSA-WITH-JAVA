//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
void main() {

int arr[] =new int[5];
int size=5;
Scanner Userin=new Scanner(System.in);

for(int j=0;j<size;j++){
    arr[j]=Userin.nextInt();


}
 for(int i=0; i<size;i++){
     System.out.println(arr[i]);
 }
}
