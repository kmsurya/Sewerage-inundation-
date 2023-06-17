import java.util.Random;

public class WaterFlowDetector {

    private static final int FLOW_THRESHOLD = 100; // Threshold value for flow detection

    public static void main(String[] args) {
        WaterFlowDetector flowDetector = new WaterFlowDetector();
        flowDetector.startMonitoring();
    }

    public void startMonitoring() {
        // Simulated data source or actual data acquisition logic
        Random random = new Random();

        while (true) {
            int flowRate = random.nextInt(200); // Simulating flow rate values between 0 and 200

            if (flowRate > FLOW_THRESHOLD) {
                System.out.println("Water flow detected: Flow rate = " + flowRate);
                // Additional actions to be taken when water flow is detected
                // For example, triggering an alarm or sending a notification
            }

            try {
                Thread.sleep(1000); // Delay between flow rate readings
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
