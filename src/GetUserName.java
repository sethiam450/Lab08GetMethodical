import java.util.Scanner;
public class GetUserName {
    public static void main(String[] args) {
        String uName = "";
        Scanner in = new Scanner(System.in);
        uName = SafeInput.getNonZeroLenString(in, "What is your username?");
        System.out.println("Awesome, your username is " + uName);



    }





}
