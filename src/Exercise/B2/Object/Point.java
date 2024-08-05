package Exercise.B2.Object;

import java.util.Scanner;

public class Point {
    public int x, y;
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
        this.x = x;
        this.y = y;
    }

    public void inputPoint() {
        while (true) {
            try {
                x = sc.nextInt();
                y = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("format error!!");
            }
        }
    }

    public void printPoint() {
        System.out.println("(" + getX() + "," + getY() + ")");
    }

    public void setPoint(int point, int newPoint){
        point = newPoint;
    }

    public double distancePointToO(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public double distancePointToPoint(Point a, Point b){
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
    }

}
