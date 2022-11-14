import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args) {
    double checkOut = 0;
        boolean moreItems;
        Scanner in = new Scanner(System.in);
        checkOut = SafeInput.getRangedDouble(in, "What is the price of your item?" , 0.50 , 9.99);
        System.out.printf("The price of your item is " + checkOut );
        moreItems = SafeInput.getYNConfirm(in, "Do you have more items to scan?");
        boolean Y = true;
        boolean N = false;

        if (moreItems == true)
        {
            checkOut = SafeInput.getRangedDouble(in, "What is the price of your item?" , 0.50 , 9.99);
            System.out.printf("The price of your item is " + checkOut );
        }
        else
            System.out.printf("The price of your item is " + checkOut );
    }




}
