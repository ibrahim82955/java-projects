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
        System.out.println("enter the password you want to put ");
        String pass=input.nextLine();
            System.out.println(pass_vaild(pass));
        
    
    }
    
    
    public static boolean pass_vaild(String paString){
    
    return check_pass_digit_of_num(paString)&&check_pass_digit_of_shape(paString)&&check_pass_lenth(paString);
    }
    
    
     public static boolean check_pass_lenth (String pass){
     
            return pass.length()>=8;
     
     }

     
      public static boolean check_pass_digit_of_num (String pass){
            int is_digit=0;
            for (int i = 0; i < pass.length(); i++) {
               if (Character.isDigit(pass.charAt(i))){
                   is_digit++;
               }
          }
     
     return (is_digit>=2);
    
}

 public static boolean check_pass_digit_of_shape (String pass){
           
     for (int i = 0; i < pass.length(); i++) {
               if (! Character.isLetterOrDigit(pass.charAt(i))){
                   return false;
               }
          }
    
     return true;
}

}
