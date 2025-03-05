/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author hemoo
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        System.out.println(numberOfDaysInAYear());
    
    
    
    }
    
     public static int numberOfDaysInAYear(){
     
     int total=0;
         for (int i = 2000; i <=2024 ; i++) {
             
             if (isleep(i)) {
                 total+=366;
             }
             else total+=365;
             
             
         }
             return total;
     
     
     }

     
     public static boolean isleep(int year){
     
     
     
     return year%400==0||(year%4==0&year%100!=0);
     }
    
}
