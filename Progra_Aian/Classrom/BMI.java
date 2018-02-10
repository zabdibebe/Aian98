/*******************
BMI.java
Aian Mendoza
This program calculates the Body Mass Index
**********************/
import javax.swing.JOptionPane;
public class BMI{
    public static void main(String[] args) {
      float weigth, heigth;
      final double KILOGRAMS_PER_POUND = 0.45359237;
      final double METERS_PER_INCH = 0.0254;
      weigth=
      Float.parseFloat(JOptionPane.showInputDialog("Enter your WEIGTH in pounds"));
      heigth=
      Float.parseFloat(JOptionPane.showInputDialog("Enter your HEIGTH in inches"));
      double weigthInKilograms = weigth * KILOGRAMS_PER_POUND;
      double heigthInMeters = heigth * METERS_PER_INCH;
      double bmi = weigthInKilograms / (Math.pow(heigthInMeters,2));
      if (bmi < 16){
        JOptionPane.showMessageDialog(null, "Your are seriously underweigth");
      } else if (bmi < 18) {
        JOptionPane.showMessageDialog(null, "Your are seriously underweigth");
      } else if (bmi < 24) {
      JOptionPane.showMessageDialog(null, "Your are normal weigth");
      } else if (bmi < 29) {
        JOptionPane.showMessageDialog(null, "Your are overweigth");
      } else if (bmi < 35) {
        JOptionPane.showMessageDialog(null, "Your are seriously overweigth");
      }else {
        JOptionPane.showMessageDialog(null, "Your are gravely overweigth");
      }// end if
    }//end main
  }//end BMi.java
