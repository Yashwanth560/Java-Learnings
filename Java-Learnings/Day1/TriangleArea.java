import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter base of triangle: ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter height of triangle: ");
        double height = scanner.nextDouble();
        
        double area = (base * height) / 2;
        System.out.println("Area of Triangle: " + area);
    }
}
