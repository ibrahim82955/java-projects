
package javaapplication2;
import java.time.Month;
 import java.util.*;
public class javaapplication2 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println(" Enter full year (e.g., 2012):");
        int year=input.nextInt();
        System.out.println("Enter month as number between 1 and 12: ");
        int month=input.nextInt();
        printmonth(year, month);
        

    }
    
    public static void printmonth(int year , int month ) {
        
        printmonthtitle(year, month);
         printMonthBody(year, month);
        
    }
     public static void printmonthtitle(int year , int month ) {
       System.out.println("           " + getMonthName(month)  + " " + year );
       System.out.println("--------------------------------");
       System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
}

        
      public static String getMonthName(int month) {
         String month_name="";
          switch (month) {
              case 1:
                  month_name= "January";
                  break;
                   case 2:
                  month_name= "February";
                  break;
                   case 3:
                  month_name= "March";
                  break;
                   case 4:
                  month_name= "April";
                  break;
                   case 5:
                  month_name= "May";
                  break;
                   case 6:
                  month_name= "June";
                  break;
                   case 7:
                  month_name= "July";
                  break;
                   case 8:
                  month_name= "August";
                  break;
                   case 9:
                  month_name= "September";
                  break;
                   case 10:
                  month_name= "October";
                  break;
                   case 11:
                  month_name= "November";
                  break;
                   case 12:
                  month_name= "December";
                  break;
          
        
        }
           return month_name;
    
}
      
      public static void  printMonthBody(int year,int month){
      
          int first_day =  getStartDay(month,  year);
           int numberOfDaysInMonth = getNumberOfDaysInMonth(month, year);
           int i=0;
           
           //pading space
           for (i = 0; i<first_day ; i++) {
               System.out.print("    ");
              
          }
          for (i= 1; i <= numberOfDaysInMonth; i++) {
              
              System.out.printf("%4d",i);
              
          
           if ((i + first_day) % 7 == 0) {
              System.out.println();
              
          }
          } 
           System.out.println();
      
      
      
      
      
      
      }
      
      public  static  int getStartDay(int Month , int year){
      
      final int day_of_week_1800=3;
      
      int total_number_of_days=total_number_of_days(Month,year);
      
      
      
      
      return ((total_number_of_days+day_of_week_1800)%7);
      }
      
    public static int  total_number_of_days(int Month,int year){
      int total =0;
      
        for (int i = 1800; i < year; i++) {
            if (isleap(i)) {
                total+=366;
            }
            else{
            total+=365;
            }
            }
        
        for (int i = 1; i < Month; i++) {
            total+=getNumberOfDaysInMonth(i, year);
            
        }
              
         return total;
        }      
      
       public static int getNumberOfDaysInMonth(int month, int year) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || 
            month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else if (month == 2) {
            if (isleap(year)) {
                return 29;
            } else {
                return 28;
            }
        } else {
            return -1; 
        }
    }
      
      public static boolean isleap(int year) {
          return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0); 
        
    }

}