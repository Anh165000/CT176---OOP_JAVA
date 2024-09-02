package Exercise.B2.MainProgram;

import Exercise.B2.Object.Fraction;

public class MainFraction {
    private static Fraction f1 = new Fraction(1, 2);
    private static Fraction f2 = new Fraction();
    public static void main(String[] args) {
        f2.readFraction();
        f2.printFraction();//
        (f2 = f1.divideFraction(f2)).printFraction();;
        // f2.printFraction();
    }
}
