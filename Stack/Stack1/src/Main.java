class A implements Runnable{
    public void run(){
        System.out.println("Hello");
    }
}//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
      A a= new A();
      Thread o= new Thread(a);
      o.start();
     }




}
