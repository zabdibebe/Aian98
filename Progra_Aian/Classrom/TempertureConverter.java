/***************
*Aian Mendoza
*TempertureConverter.java
*
*This program converts from Faherenheit to Celcius.
****************/
public class TempertureConverter{
  public static void main(String[]args){
    final double FREEZING_POINT=32.0;
      final double CONVERSION_FACTOR=5.0/9.0;
        double fahrenheit=50.0;
          double celcius=0;
            celcius=CONVERSION_FACTOR*(fahrenheit-FREEZING_POINT);
            System.out.println (fahrenheit+"degrees Faherenheit="+celcius+"degrees celcius");
              //end main
                //end TempertureConverter
  }
}
