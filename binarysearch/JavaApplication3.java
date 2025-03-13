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
        
        System.out.println( binarysearch(9, arr));
        
        
    }
    
    
    
    public static int binarysearch(int key,int ... arr){
    int low=0;
    int high=arr.length-1;
    
        while (low<=high) {
            int mid=(low+high)/2;
            if (key==arr[mid]) {
                return mid;
            }
            else if(key>arr[mid]){
            low=mid +1;
            }else if(key<arr[mid]){
            high=mid -1; 
            }
  
        }
         return -low-1;
    
    
    
    }
    
    
    
    
 
}
