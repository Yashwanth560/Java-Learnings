import java.util.Random;

public class SensorDataMonitoring {
    public static void main(String[] args) {
        Random random = new Random();
        int highestValue = Integer.MIN_VALUE;
        int readings = 0;

        while (true) {
            int sensorValue = random.nextInt(100); // Simulated sensor value (0-99)
            readings++;
            highestValue = Math.max(highestValue, sensorValue);

            System.out.println("Sensor Reading: " + sensorValue);

            if (sensorValue > 90) { // Stop if the value exceeds 90
                System.out.println("Threshold exceeded! Highest Value: " + highestValue);
                System.out.println("Total Readings Taken: " + readings);
                break;
            }
        }
    }
}
