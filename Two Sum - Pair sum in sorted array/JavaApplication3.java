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
        
    System.out.println( checksum(19,arr));
        
        
    }
    
    
    
    public static int [] checksum( int target,int ... arr){    
            
       int low=0;
       int high=arr.length-1;
        
        while (low<high) {
            int sum =arr[low] +arr[high];
            if(sum==target)
                return new int[]{arr[low],arr[high]};
            else if (sum>target){
                high--;
            }
             else if (sum<target){
                low++;
            }
                    
            
        }
      
    
    
    return new int[]{0};
    }
    
    
    
    
 
}
