/***********************
Aian Mendoza

PrintPurchaseOrder
This program calculate and prints a purchase
order amout
***********************/
 import java.util.Scanner;
      public class PrintPurchaseOrder{
        public static void main(String[] args) {
          Scanner userData = new Scanner(System.in);
            double price ;
              int quantity;
              System.out.println("Enter the price");
                price = userData.nextDouble();
                  System.out.println("Enter the quantity");
                    quantity =  userData.nextInt();

                      System.out.println("total purchase order $"+ price * quantity);
}
  }
