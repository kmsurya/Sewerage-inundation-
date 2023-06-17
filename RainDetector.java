import java.util.Random;

public class RainDetector {

    private static final double RAIN_THRESHOLD = 0.5; // Threshold value for rain detection

    public static void main(String[] args) {

        RainDetector rainDetector = new RainDetector();

        rainDetector.startMonitoring();

    }

    public void startMonitoring() {

        // Simulated data source or actual data acquisition logic

        Random random = new Random();

        while (true) {

            double rainValue = random.nextDouble(); // Simulating rain values between 0.0 and 1.0

            if (rainValue > RAIN_THRESHOLD) {

                System.out.println("Rain value detected: " + rainValue);

                // Additional actions to be taken when rain value is detected

                // For example, activating drainage systems or sending an alert

            }

            try {

                Thread.sleep(1000); // Delay between rain value readings

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        }

    }

}
