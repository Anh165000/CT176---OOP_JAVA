package Exercise.B2.MainProgram;

import java.util.Scanner;
import Exercise.B2.Object.MyDate;

public class MainMyDate {

    private static Scanner scanner = new Scanner(System.in);
    private static int n;

    public static void main(String[] args) {
        MyDate today = new MyDate();
        today.inputDate();
        getN();
        today.nextNDate(n);
        today.printDate();
    }

    private static void getN() {
        while(true){
            try {
                System.out.print("enter the next number of days: ");
                n = Integer.parseInt(scanner.nextLine());
                if(n > 0)
                    break;
            } catch (Exception e) {
                System.out.println("enter the number and bigger than zero");
            }
        }
    }
}
