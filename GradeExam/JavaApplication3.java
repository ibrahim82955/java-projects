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
        char [][] answer={{ 'A','B','A','C','C','D','E','E','A','D'}
                         ,{'D','B','A','B','C','A','E','E','A','D'},
                          {'E','D','D','A','C','B','E','E','A','D'},
                          {'C','B','A','E','D','C','E','E','A','D'},
                          {'A','B','D','C','C','D','E','E','A','D'},
                          {'B','B','E','C','C','D','E','E','A','D'},
                          {'B','B','A','C','C','D','E','E','A','D'},
                          {'E','B','E','C','C','D','E','E','A','D'},
                          {'D','B','D','C','C','D','A','E','A','D'}};
        
        char answ []={'D','B','D','C','C','D','A','E','A','D'};
        
        
        
        
        for (int row = 0; row < answer.length; row++) {
        int score=0;
            for (int col = 0; col < answer[row].length; col++) {
                if (answer[row][col] == answ[col]) {
                    score+=1;
                    }}
                System.out.println(score);
                
            
            
        }
        
    }
    }
 

