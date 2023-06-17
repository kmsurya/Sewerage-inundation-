import java.util.Random;

public class WaterLevelDetector {

    private static final int WATER_LEVEL_THRESHOLD = 80; // Threshold value for water level detection

    public static void main(String[] args) {
        WaterLevelDetector levelDetector = new WaterLevelDetector();
        levelDetector.startMonitoring();
    }

    public void startMonitoring() {
        // Simulated data source or actual data acquisition logic
        Random random = new Random();

        while (true) {
            int waterLevel = random.nextInt(101); // Simulating water level values between 0 and 100

            if (waterLevel > WATER_LEVEL_THRESHOLD) {
                System.out.println("Water level detected: " + waterLevel + "%");
                // Additional actions to be taken when water level is detected
                // For example, triggering a pump or sending an alert
            }

            try {
                Thread.sleep(1000); // Delay between water level readings
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
