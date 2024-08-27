package Exercise.B2.MainProgram;

import Exercise.B2.Object.MyDate;
public class MainMyDate {
    public static void main(String[] args) {
        MyDate today = new MyDate();
        today.inputDate();
        // today.printDate();
        // today.nextDate();
        today.nextNDate(546);
        today.printDate();
    }
}
