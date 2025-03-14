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

        int arr [] = {1,2,3,4,5,6,7,8,9,10};
        
    System.out.println( checksum(100,arr));
        
        
    }
    
    
    
    public static boolean checksum( int target,int ... arr){    
            
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                
                if(arr[i]+arr[j]==target)
                    return true;
                
            }
        }
        return false;
      
    
    
    
    }
    
    
    
    
 
}
