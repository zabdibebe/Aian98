/*************************
WhileLoop.java
Aian Mendoza
This program makes entries in a brital registry
**************************/
import javax.swing.JOptionPane;
public class WhileLoop {
  public static void main(String[] args) {
    String registry = "";
    char more;
    more = JOptionPane.showImputDialog("Do you want to create a bridal registry? (y/n)").charAt(0);

    while (more == 'y'){
      registry +=
      JOptionPane.showImputDialog("Enter store \n");
      more=
      JOptionPane.showImputDialog("any more items? (y/n)").charAt(0);
  } //end while
  if (!registry.equals("")) {
    JOptionPane.showMessageDialog(null,"\nBridal registry\n" + registry);
}
  }
}
