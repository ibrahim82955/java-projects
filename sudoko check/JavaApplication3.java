package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sudoku[][]= new int[9][9];
        
        System.out.println("Plz Enter The Your Solution");
        for (int row = 0; row < sudoku.length; row++) {
            for (int col = 0; col < sudoku[row].length; col++) {
                sudoku[row][col]=input.nextInt();
            }  
    }
        
        
        System.out.println(rowcheck(sudoku) ? "is valid" : "not valid");
        
        
        
}
    
    
    public static boolean rowcheck(int sudoku [][]) {
             for (int row = 0; row < sudoku.length; row++) {
            for (int col = 0; col < sudoku[row].length; col++) {
                            
                if (sudoku[row][col]<0  || sudoku[row][col]>9  || !isvalid(row,col,sudoku)) {
                    return false;
                    
            }
                }
                    }
        
             return true; 
}
    
    public static boolean isvalid(int row,int col,int sudoku [][]) {
        //    check on rows
        for (int i = 0; i < 9; i++) {
            if (i!=col && sudoku[row][i]==sudoku[row][col]) {
                return false;
                
            }
            
        }
        //        check on cols
        for (int i = 0; i < 9; i++) {
            if (i!=row && sudoku[i][col]==sudoku[row][col]) {
                return false;
                
            }
            
        }
//        check on squares [3][3]
        for (int i = (row/3)*3; i < (row/3)*3+3; i++) {
            for (int j = (col/3)*3; j < (col/3)*3+3; j++) {
            
                if( !(i==row && j==col) &&sudoku[i][j]==sudoku[row][col])
                    return  false;
                
            }
            
        }
        
    return true;
    }
    
       
}