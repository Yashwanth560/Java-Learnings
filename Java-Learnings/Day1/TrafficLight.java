import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter light color (green, yellow, red): ");
        String lightColor = scanner.nextLine();
        System.out.print("Is there an obstacle? (yes/no): ");
        String obstacle = scanner.nextLine();

        if (obstacle.equalsIgnoreCase("yes")) {
            System.out.println("Cannot move due to obstacle.");
        } else if (lightColor.equalsIgnoreCase("green")) {
            System.out.println("Go");
        } else if (lightColor.equalsIgnoreCase("yellow")) {
            System.out.println("Slow Down");
        } else if (lightColor.equalsIgnoreCase("red")) {
            System.out.println("Stop");
        } else {
            System.out.println("Invalid light color.");
        }
    }
}
