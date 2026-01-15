/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stack02;

/**
 *
 * @author LOQ
 */
public class Stack02 {
     int arr[];
     int top;
     int capacity;
     Stack02(int size){
     arr=new int[size];
     capacity=size;
     top=-1;
     
     }
     boolean isfull(){
     return top+1==capacity;
     
     }
     void push(int x){
      if(isfull()){
          System.out.println("Over Flow");
            
      }
      else 
      {
          top++;
          arr[top]=x;
          System.out.println("insert in"+ x);
      }
      
     }
    public static void main(String[] args) {
        Stack02 mystack= new Stack02(5);
        mystack.push(10);
    }
}
