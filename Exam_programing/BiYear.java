/********************************
 PROBLEMA NUMERO 21
Aian Mendoza
BiYear.java
This program determines if it is a leap year
********************************/
import java.util.Scanner;
public class BiYear  {
     public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a;
      System.out.println("Enter the year:");
      a= sc.nextInt();
     if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0){
         System.out.println( a+" The year is leap year ");
     }else{
         System.out.println(a+" The year is not leap year");
     }
     }
}
