package Thuc_Hanh.B1;

import java.util.Scanner;

public class xPowN {

    public static double x;
    public static int n;
    private static Scanner sc = new Scanner(System.in);
    

    public static void main(String[] args) {
        input();
        System.out.println(String.format("%.4f", pow(x, n)));
    }

    public static void input(){
        while(true){
            try {
                System.out.print("Nhap x: ");
                x = Double.parseDouble(sc.nextLine());
                System.out.print("Nhap n: ");
                n = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Nhập sai - Nhập lại!");
            }
        }
    }

    public static double pow(double x, int n){
        return Math.pow(x, n);
    }
}
