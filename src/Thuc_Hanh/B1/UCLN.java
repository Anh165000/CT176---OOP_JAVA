package Thuc_Hanh.B1;

import java.util.Scanner;

public class UCLN {
    private static Scanner scanner = new Scanner(System.in);
    public static int a, b;
    public static void main(String[] args) {
        input();
        System.out.println(uscln(a, b));
    }

    public static void input(){
        while (true) {
            try {
                System.out.print("Nhap a: ");
                a = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhap b: ");
                b = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Nhap sai, nhap lai!!");
            }
        }
    }

    public static int uscln(int a, int b){
        int temp;
        while( b != 0){
            temp = a;
            a = b;
            b = temp % b ;
        }
        return a;
    }
}
