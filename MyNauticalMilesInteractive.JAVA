import java.util.Scanner;

/**
 * NauticalMilesInteractive[Joaquin Martin M. Tiengo].java
 */

public class NauticalMilesInteractive {
    public static void main(String[] args) {
        final double KILOMETERS_IN_NAUTICAL_MILE = 1.852;
        final double MILES_IN_NAUTICAL_MILE = 1.150779;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of nautical miles: ");
        double nauticalMiles = scanner.nextDouble();
