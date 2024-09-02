package Exercise.B2.Object;

import java.util.Scanner;

public class Fraction {

    public int numerator, denominator;
    private Scanner scanner = new Scanner(System.in);

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {

    }

    public void readFraction() {
        while (true) {
            try {
                if (!hadValue(numerator)) {
                    System.out.print("numerator: ");
                    numerator = Integer.parseInt(scanner.nextLine());
                }
                if (!hadValue(denominator)) {
                    System.out.print("denominator: ");
                    denominator = Integer.parseInt(scanner.nextLine());
                }
                if (denominator != 0)
                    break;
            } catch (Exception e) {
                System.out.println("format error!!");
            }
        }
    }

    private boolean hadValue(int a) {
        if (a != 0)
            return true;
        return false;
    }

    public void printFraction() {
        if (numerator == 0)
            System.out.println(0);
        else if (denominator == 1 || denominator == -1){
            if(denominator == -1)
                System.out.println(-numerator);
            else
                System.out.println(numerator);
        }
        else if (denominator > 0)
            System.out.println(numerator + "/" + denominator);
        else
            System.out.println(-numerator + "/" + -denominator);
    }

    public void inverseFraction() {
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }

    public Fraction getValueInverseFraction(Fraction f) {
        Fraction temp = new Fraction(f.denominator, f.numerator);
        return temp;
    }

    public double valueOfFraction(Fraction f) {
        return ((double) f.numerator / f.denominator);
    }

    public boolean biggerThan(Fraction f) {
        Fraction temp = new Fraction(numerator, denominator);
        if (valueOfFraction(temp) > valueOfFraction(f))
            return true;
        return false;
    }
    
    public Fraction plusFraction(Fraction f) {
        Fraction temp = new Fraction(numerator, denominator);
        if(numerator == 0){
            return f;
        }
        temp.numerator = temp.numerator * f.denominator + temp.denominator * f.numerator;
        temp.denominator = temp.denominator * f.denominator;
        if(GCD(temp) != 1)
            temp = shortenFraction(temp);
        return temp;
    }

    public Fraction subtractFraction(Fraction f) {
        Fraction temp = new Fraction(numerator, denominator);
        if(numerator == 0){
            return f;
        }
        temp.numerator = temp.numerator * f.denominator - temp.denominator * f.numerator;
        temp.denominator = temp.denominator * f.denominator;
        if(GCD(temp) != 1)
            temp = shortenFraction(temp);
        return temp;
    }

    public Fraction multiplyFraction(Fraction f) {
        Fraction temp = new Fraction(numerator, denominator);
        if(numerator == 0 || f.numerator == 0){
            temp.numerator = 0;
            return temp;
        }
        temp.numerator = temp.numerator * f.numerator;
        temp.denominator = temp.denominator * f.denominator;
        if(GCD(temp) != 1)
            temp = shortenFraction(temp);
        return temp;
    }
    
    public Fraction divideFraction(Fraction f) {
        Fraction temp = new Fraction(numerator, denominator);
        if(numerator == 0 || f.numerator == 0){
            temp.numerator = 0;
            return temp;
        }
        temp.numerator = temp.numerator * f.denominator;
        temp.denominator = temp.denominator * f.numerator;
        if(GCD(temp) != 1)
            temp = shortenFraction(temp);
        return temp;
    }

    private Fraction shortenFraction(Fraction f){
        return new Fraction(f.numerator / GCD(f), f.denominator / GCD(f));
    }

    public int GCD(Fraction tempF){
        Fraction f = new Fraction(tempF.numerator, tempF.denominator);
        if(f.numerator == f.denominator)
            return f.numerator;
        else if(f.numerator < f.denominator){
            int temp = f.numerator;
            f.numerator = f.denominator;
            f.denominator = temp;
        }
        while(f.denominator != 0){
            int temp = f.numerator;
            f.numerator = f.denominator;
            f.denominator = temp % f.denominator;
        }
        return f.numerator;
    }

    // public static void main(String[] args) {
    //     Fraction f = new Fraction(120, 100);
    //     System.out.println(GCD(f));
    // }
}
