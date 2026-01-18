/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrayex2;

/**
 *
 * @author LOQ
 */
public class ArrayEx2 {

    public static void main(String[] args) {
        int[]numbers={10,20,30,40,50,};
        int sum=0;
        
        for(int i=0;i<numbers.length;i++){
         sum= sum + numbers[i];
         
        }
        System.out.println("Sum of array values = "+ sum);
        
     
    }
}
