/**********************
AverageWhile.java
Aian Mendoza
This program calculates te average of the grades
************************/
import javax.swing.JOptionPane;

public class AverageWhile{
  public static void main(String[] args) {
    int counter = 1, totalStudents;
    double score, totalScore, averageScore;

    totalStudents = Integer.parseInt(JOptionpane.showImputDialog("Enter number of students"));
    while (counter <= totalStudents){
      score = Double.ParseDouble(JOptionPane.showImputDialog("Enter the score" + counter));
      totalScore += score;
      counter ++;
    }
    averageScore =totalScore / 
  }
}
