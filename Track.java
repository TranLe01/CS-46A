
import java.util.Scanner;

public class Track {

    public static double lapsToMiles(double userLaps) {
        double numMiles = userLaps * 0.25;
        return numMiles;
    }

    public static void main(String[] args) {
        try (Scanner snr = new Scanner(System.in)) {
            double numLaps = snr.nextDouble();
            double numMiles = lapsToMiles(numLaps);
            System.out.printf("%.2f\n", numMiles);
        }
    }

}
