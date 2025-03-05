
package javaapplication2;
import java.time.Month;
 import java.util.*;
public class javaapplication2 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      
      
        System.out.println(isPalindrome(567765));
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println(reverse(123345));

    }
    
    
    
     public static boolean isPalindrome(int number){  
     return number==reverse(number);
     }
    public static int reverse(int number){
    
    
       int reversedint =0;
       
        while (number!=0) {
            reversedint=reversedint*10+number%10;
            number/=10;
            
            
        }
        
        return reversedint;
        
    
    
    
    }
    
    
    
    }
    
