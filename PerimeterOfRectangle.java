package Assigned1;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        System.out.println("Enter length and width of the rectangle:");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        int perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        sc.close();
    }
}
