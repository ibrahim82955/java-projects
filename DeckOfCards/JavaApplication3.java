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
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int[] deck = new int[52];
         String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
       String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
        "10", "Jack", "Queen", "King"};
            for (int i = 0; i < deck.length; i++)
             deck[i] = i;
            
//            shuffle
        
         for (int i = 0; i < deck.length; i++){
             
             int index=(int)(Math.random()*deck.length);         
             int temp=deck[i];
             deck[i]=deck[index];
             deck[index]=temp;

         }
         
         for (int i = 0; i < 4; i++) {
             String suit =  suits[deck[i]/13];
             String rank = ranks[deck[i]%13];
              System.out.println("Card number " + deck[i] + ": " 
         + rank + " of " + suit);
             
            
        }
        
        
    
            
            
    }
    
    
    
    
    
 
}
