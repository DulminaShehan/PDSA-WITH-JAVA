/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exception;
import java.util.Scanner;
/**
 *
 * @author LOQ
 */
class A{
 public void say(){
  for(int i=0;i<10;i++){
      System.out.println("Hello");
  }
 }
}
class B{
public void say(){
 for(int i=0;i<10;i++){
     System.out.println("Well come");
 }
}
}
public class Exception {

    public static void main(String[] args) {
      A a= new A();
      B b=new B();
      a.say();
      b.say();
    }
}
