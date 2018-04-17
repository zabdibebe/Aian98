import java.util.ArrayList;
  import javax.swing.*;
public class TestArrayList{
  public static void main(String[] args) {
    ArrayList<String> cityList = new
    ArrayList<String>();
    cityList.add("London");
    cityList.add("New york");
    cityList.add("Paris");
    cityList.add("Tokio");
    cityList.add("Miami");

    JOptionPane.showMessageDialog(null,"List size: "+ cityList.size());
    JOptionPane.showMessageDialog(null,"Is Miami in this list? "+ cityList.contains("Miami"));
    JOptionPane.showMessageDialog(null,"The location of Paris is "+ cityList.indexOf("Paris"));
    JOptionPane.showMessageDialog(null,"Is this list empty?"+ cityList.isEmpty());
    cityList.remove("London");

  }
  }
}
