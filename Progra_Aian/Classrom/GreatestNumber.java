/************************
GreatestNumber.java

Aian Mendoza
This program findsthe greatest of three numbers
*************************/
import javax.swing.JOptionPane;
public class GreatestNumber{
    public static void main(String[] args) {
      double numberOne,numberTwo, numberThree;

      numberOne=
      Double.parseDoble(JOptionPane.showImputDialog("enter the first number")); //30
    numberTwo=
      Double.parseDoble(JOptionPane.showImputDialog("enter the second number")); //10
      numberThree=
      Double.parseDoble(JOptionPane.showImputDialog("enter the third number")); //80

      if (numberOne > numberTwo) {
        if (numberOne > numberThree) {
          JOptionPane.showMessageDialog(null, "The greatest number is " + numberOne);
        }//end if
      }//end if
      if (numberTwo > numberOne) {
        if (numberTwo> numberThree) {
          JOptionPane.showMessageDialog(null, "The greatest number is " + numberTwo);
        }//end if
      }//end if
      if (numberThree > numberOne) {
        if (numberThree > numberTwo) {
          JOptionPane.showMessageDialog(null, "The greatest number is " + numberOne);
        }//end if
      }//end if
    }
