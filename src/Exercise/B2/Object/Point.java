package Exercise.B2.Object;

import java.util.Scanner;

public class Point {
    public int x, y;
    public String pointName;
    private Scanner sc = new Scanner(System.in);

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point() {

    }

    public Point(int x, int y) {

    }

    public void inputPoint() {
        while (true) {
            try {
                System.out.println("enter point name");
                x = Integer.parseInt(sc.nextLine());
                y = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("format error!!");
            }
        }
    }

    public void printPoint() {
        System.out.println("(" + getX() + "," + getY() + ")");
    }
}
