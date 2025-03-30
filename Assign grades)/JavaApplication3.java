/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author hemoo
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
       int sizee=input.nextInt();
       int arr []=new int[sizee];
       int arr2 []=new int[sizee];
       int max=Integer.MIN_VALUE;
       for (int i = 0; i < sizee; i++) {
            arr[i]=input.nextInt();
           
            
        }
       
        
        for (int j=0,i = arr.length-1; i>=0 ; j++,i--) {
            
            arr2[j]=arr[i];
            
}
        
        
        for (int i : arr2) {
            System.out.println(i);
        }
    }
    
    
}
