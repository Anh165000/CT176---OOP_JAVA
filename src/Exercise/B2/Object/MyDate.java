package Exercise.B2.Object;
import java.security.PrivateKey;
import java.util.Scanner;
public class MyDate {

    public int date, month, year;
    private int calendar[] = {0, 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};
    private Scanner sc = new Scanner(System.in);

    public MyDate(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public MyDate(){
    }

    public int getDate() {
        return date;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    
    public boolean checkYear(int year) {
        
        return false;
    }
}
