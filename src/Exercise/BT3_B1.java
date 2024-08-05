package Exercise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BT3_B1 {
    public static int n;
    public static double list[];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        handleInput();
    }

    public static void handleInput() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        while (true) {
            try {
                n = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Format error!!");
            }
        }
        list = new double[n];
        for (int i = 0; i < n; i++) {
            while(true){
                try {
                    System.out.print(i + 1 + ": ");
                    list[i] = Float.parseFloat(sc.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("format error!!");
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(decimalFormat.format(list[i]));
        }
    }
}
