package Thuc_Hanh.B1;

import java.util.Scanner;

public class ReverseString {
    public static String str;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        input();
        System.out.println(reverse(str));
    }

    public static void input() {
        str = scanner.nextLine();
    }

    public static String reverse(String str){
        int length = str.length();
        for(int i = str.length() - 1; i >= 0; i--){
            str += str.charAt(i);
        }
        str = str.substring(length);
        return str;
    }
}
