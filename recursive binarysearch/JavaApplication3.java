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
        
    System.out.println( binarysearch(7, 0,arr.length-1 ,arr));
        
        
    }
    
    
    
    public static int binarysearch(int key,int low , int high,int ... arr){    
        
        if (low<=high) {
           int mid = low + (high - low) / 2;
            if (key==arr[mid]) {
                return mid;
            }
            else if(key>arr[mid]){
            return  binarysearch(key,mid +1 ,high,arr);
            }else if(key<arr[mid]){
            return binarysearch(key,low,mid -1,arr);
            }
  
        }
         return -low-1;
    
    
    
    }
    
    
    
    
 
}
