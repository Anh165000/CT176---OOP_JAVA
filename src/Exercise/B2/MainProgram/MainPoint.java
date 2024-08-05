package Exercise.B2.MainProgram;

import Exercise.B2.Object.Point;

public class MainPoint {
    public static void main(String[] args) {
        Point a = new Point();
        Point b = new Point(5, 6);
        a.inputPoint();
        a.printPoint();
        b.printPoint();
        System.out.println(a.distancePointToO());
        System.out.println(a.distancePointToPoint(a, b));
    }
}
