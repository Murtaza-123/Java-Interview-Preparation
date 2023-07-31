
public class CommandLine {
    public static void main(String[] ar)
    {
        int Total = Integer.parseInt(ar[0]);
        int Discount = Integer.parseInt(ar[1]);
        int n = Total / 100 * Discount;
        System.out.println("Total Price: \t" + Total);
        System.out.println("Discount: \t" + n);
        int NetBill = Total - n;
        System.out.println("Net Price: \t" + NetBill);
        
        
    }
}
