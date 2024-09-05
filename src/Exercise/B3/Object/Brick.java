package Exercise.B3.Object;

import java.util.Scanner;

public class Brick {
    public String code, color;
    public double height, width;
    public int price, typesOfBrick;
    public final int QUANTITY = 10;
    private Scanner scanner = new Scanner(System.in);
    Brick brickBox[] = new Brick[QUANTITY];

    public Brick(String code, String color, double height, double width) {
        this.code = code;
        this.color = color;
        this.height = height;
        this.width = width;
    }

    public Brick() {
    }

    public int getTypesOfBrick() {
        return typesOfBrick;
    }

    public String getCode() {
        return code;
    }

    public String getColor() {
        return color;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public int getQuality() {
        return QUANTITY;
    }

    public int getPrice() {
        return price;
    }

    public void readBrickBox() {
        
        while (true) {
            try {
                System.out.println("how many types of the brick: ");
                typesOfBrick = Integer.parseInt(scanner.nextLine());
                Brick listBirickBox[] = new Brick[typesOfBrick];
                for (int i = 0; i < typesOfBrick; i++) {
                    if (listBirickBox[i].height != 0) {
                        System.out.println("the height of all the brick in box: ");
                        height = Double.parseDouble(scanner.nextLine());
                    }
                    if (width != 0) {
                        System.out.println("the width of all the brick in box: ");
                        width = Double.parseDouble(scanner.nextLine());
                    }
                }
                
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
