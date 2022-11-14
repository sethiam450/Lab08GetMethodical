import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    int favNum = 0;
    double favDub = 0;
    Scanner in = new Scanner(System.in);
    favNum = SafeInput.getInt(in, "What is your fav number");
    favDub = SafeInput.getDouble(in,  "What is your favourite double");
    System.out.println("You said your fav number is: "  + favNum + " and your favorite double is: " + favDub);
  }
}