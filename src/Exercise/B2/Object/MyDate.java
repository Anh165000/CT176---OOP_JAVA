package Exercise.B2.Object;

// import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;

public class MyDate {

    private int date, month, year, temp;
    private int calendar[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private Scanner sc = new Scanner(System.in);

    public MyDate(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public MyDate() {
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

    public void printDate() {
        System.out.println(String.format("%02d/", date) + String.format("%02d", month) + String.format("/%04d", year));
    }

    public void inputDate() {

        while (true) {
            try {
                System.out.println("DD/MM/YYYY");
                String strInput = sc.nextLine();
                date = Integer.parseInt(strInput.substring(0, 2));
                month = Integer.parseInt(strInput.substring(3, 5));
                year = Integer.parseInt(strInput.substring(6));
                if ((date == 29 && month == 2 && !isLeapYear(year)) || (date < 1) || (month < 1 || month > 12)
                        || (year > 2024) || (strInput.length() != 10))
                    continue;
                else if ((date == 29 && month == 2 && isLeapYear(year)))
                    break;
                else if (date > calendar[month])
                    continue;
                else
                    break;
            } catch (Exception e) {
                System.out.println("format error!!");
                System.out.println("Ex: DD/MM/YYYY");
                // System.out.println(strInput);
            }
        }
    }

    private boolean isLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0))
            return true;
        return false;
    }

    public void nextDate() {
        temp = month;
        if (isLeapYear(year))
            calendar[2] = 29;
        else
            calendar[2] = 28;
        if (date == calendar[month]) {
            month += 1;
            date += 1;
        } else {
            date += 1;
        }
        fixed();
    }

    private void fixed() {

        // int month = this.month;
        if (month > 12) {
            month %= 12;
            year += 1;
        }
        if (date > calendar[temp])
            date %= calendar[temp];
    }

    public void nextNDate(int n) {
        while (n != 0) {
            nextDate();
            n -= 1;
        }
    }
}
