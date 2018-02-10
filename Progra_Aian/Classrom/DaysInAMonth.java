/************************
DaysInAMonth.java
Aian Mendoza
This program finds tje number of days in a DaysInAMonth
*************************/
import javax.swing.JOptionPane;
public class DaysInAMonth {
  public static void main(String[] args) {
    int numberOfDaysInAMonth = 0;
    String monthOfYear;
    monthOfYear =
    JOptionPane.showImputDialog("Enter your month");

    switch(monthOfYear){
      case "January":
        numberOfDaysInAMonth = 31;
        break;
      case "February":
          numberOfDaysInAMonth = 28;      
}
