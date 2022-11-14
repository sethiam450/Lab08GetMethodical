import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
    int year = 0;
    int month = 0;
    int day = 0;
    int minute = 0;
        Scanner in = new Scanner(System.in);
        year = SafeInput.getRangedInt(in, "What is your birth year" , 1950, 2010);
        month = SafeInput.getRangedInt(in, "What is your birth month" , 1, 12);
        day = SafeInput.getRangedInt(in, "What is your birth day" , 1, 31);
        minute = SafeInput.getRangedInt(in, "What is your birth minute" , 1, 59);
        System.out.println("You said your birth month is: " + month + ", your birth day is " + day + ", your birth year is " + year + ", and your bith minute is " + minute );











    }








}
