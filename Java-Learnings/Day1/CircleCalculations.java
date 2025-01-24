import java.util.Scanner;

public class CircleCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();
        
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        
        System.out.println("Circumference of circle: " + circumference);
        System.out.println("Area of circle: " + area);
    }
}
