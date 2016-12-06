/**
 * Created by jc339438 on 6/12/2016.
 */
public class Billing
{
    public static double Tax = 0.08;
    public static double BookPrice;
    public static int quantity;
    public static void main(String[] args)
    {
        computeBill(10.00);
        computeBill(10.00, 10);
        computeBill(10.00, 10, 10.00);
    }
    public static void computeBill(double price)
    {
        BookPrice = price;
        double Bills = (BookPrice * Tax) + BookPrice;
        System.out.println("Your cost is " + Bills);
    }
    public static void computeBill(double price, int bookQuantity)
    {
        BookPrice = price;
        quantity = bookQuantity;
        double Bills = (BookPrice * bookQuantity * Tax) + (BookPrice * bookQuantity);
        System.out.println("Your cost is " + Bills);
    }
    public static void computeBill(double price, int bookQuantity, double discount)
    {
        BookPrice = price;
        quantity = bookQuantity;
        double Bills = (BookPrice * bookQuantity * Tax - discount) + (BookPrice * bookQuantity);
        System.out.println("Your cost is " + Bills);
    }
}