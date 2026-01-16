/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrayexesises1;

import java.util.Arrays;

/**
 *
 * @author LOQ
 */
public class ArrayExesises1 {

    public static void main(String[] args) {
      //Write a java progarm to sort a numeric array and a string array.
      
      int[] numbers={45,20,30,47,85,0,100};
      String[] names={"Dulmina","Mesada","Dilmi","chamika","viduni"};
      
      
      Arrays.sort(numbers);
        System.out.println("Numbers = "+Arrays.toString(numbers));
       Arrays.sort(names);
        System.out.println("Name is "+Arrays.toString(names));
      
      
      
      
    }
}
