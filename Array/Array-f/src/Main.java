//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
 int [] arr ={10,20,30,40,50};
    System.out.println(arr[4]+arr[1]);

    char []name = {'A','B','C','D'};
    System.out.println(name[0] );
    System.out.println(arr.length);

    q1(0);
}
static void q1(int i){
    System.out.println("---------------------------------");
    int[] arr1 = {10, 20, 30, 40, 50};
    arr1[0] = i;  // update first element

    for(int j = 0; j < arr1.length; j++){
        System.out.println(arr1[j]);
    }
}
static void q2(int i){
    
}
