import java.util.Random;

public class GasDetector {

    private static final double GAS_THRESHOLD = 50.0; // Threshold value for gas detection

    public static void main(String[] args) {

        GasDetector gasDetector = new GasDetector();

        gasDetector.startMonitoring();

    }

    public void startMonitoring() {

        // Simulated data source or actual data acquisition logic

        Random random = new Random();

        while (true) {

            double gasValue = random.nextDouble() * 100; // Simulating gas values between 0.0 and 100.0

            if (gasValue > GAS_THRESHOLD) {

                System.out.println("Gas value detected: " + gasValue);

                // Additional actions to be taken when gas value is detected

                // For example, activating ventilation or sending an alert

            }

            try {

                Thread.sleep(1000); // Delay between gas value readings

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        }

    }

}
