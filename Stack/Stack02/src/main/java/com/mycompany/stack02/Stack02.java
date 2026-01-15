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
    boolean isEmpty(){
     return top==-1;
     }
    void printstack(){
        System.out.println("Printing stack ");
     for(int i=0;i<=top;i++){
         System.out.println(arr[i]);
     }
    
    }
     void push(int x){
      if(isfull()){
          System.out.println("Over Flow");
            
      }
      else 
      {
          top++;
          arr[top]=x;
          System.out.println("insert in ="+ x);
      }
      
     }
     void pop(){
     if(isEmpty()){
         System.out.println("Stack Empty");
     }
     else{
     
         System.out.println("Removing ="+arr[top]);
         top--;
     }
     
     }
     void size(){
         System.out.println(top+1);
     }
    public static void main(String[] args) {
        Stack02 mystack= new Stack02(5);
        mystack.push(10);
        mystack.push(20);
        mystack.push(30);
        mystack.push(40);
        mystack.push(50);
        mystack.pop();
        mystack.pop();
        mystack.printstack();
        mystack.size();
     
    }
}
