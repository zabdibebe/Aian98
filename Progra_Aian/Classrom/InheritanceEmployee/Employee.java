/*
*/
import java.util.Date;
public abstract class Employee
{
  private String name;
  public Employee(String name)
  {
    this.name=name;
  }
  public abstract double getPay();

  public void printPay(int date)
  {

  }
}
