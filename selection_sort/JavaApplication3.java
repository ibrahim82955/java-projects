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

        int arr [] = {10,9,8,7,6,1,2,3,4,11};
        
            
        for(int x :selection_sort(arr) ){
            System.out.print("  "+x+" ");
        }
        
    }
    
    
    
    public static int [] selection_sort(int ... arr){    
            
       
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min]<arr[j])
                    min=j;
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        
       return arr;
    }
    
    
    
    
 
}
