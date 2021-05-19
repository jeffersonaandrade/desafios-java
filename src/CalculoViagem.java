import java.util.Scanner;

public class CalculoViagem {

    private static final double VEHICLE_MILEAGE = 12.0;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.printf("%.3f\n", getNecessaryLiterAmoutForTheTrip(scanner.nextInt(), scanner.nextInt()));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static double getNecessaryLiterAmoutForTheTrip(int timeSpentInHours, int averageSpeedInKilometerPerHour) {
        return timeSpentInHours * averageSpeedInKilometerPerHour / VEHICLE_MILEAGE;
    }
}
