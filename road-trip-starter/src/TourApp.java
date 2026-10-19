import java.util.Scanner;

public class TourApp
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("\nWelcome to the Tour Van!\n");
        System.out.print("Enter how many miles per gallon your van can drive: ");
        double milesPerGallon = in.nextDouble();
        System.out.print("Enter how many gallons your van's tank can hold: ");
        double tankSize = in.nextDouble();
        System.out.print("Enter the current reading on your odometer: ");
        int odometerReading = in.nextInt();

        System.out.print("\nEnter the length of your first leg: ");
        int length1 = in.nextInt();
        System.out.print("Enter the average speed during your first leg: ");
        int averageSpeed1 = in.nextInt();
        System.out.print("Enter the length of your second leg: ");
        int length2 = in.nextInt();
        System.out.print("Enter the average speed during your second leg: ");
        int averageSpeed2 = in.nextInt();
        System.out.print("Enter the length of your third leg: ");
        int length3 = in.nextInt();
        System.out.print("Enter the average speed during your third leg: ");
        int averageSpeed3 = in.nextInt();

        System.out.print("\nEnter the cost of fuel per gallon in cents: ");
        int costOfFuelPerGallon = in.nextInt();
        System.out.print("Enter the number of people in your party: ");
        int numberOfPeople = in.nextInt();
        System.out.print("Enter the departure time in minutes: ");
        int departureMinutes = in.nextInt();

        Vehicle tourVan = new Vehicle(tankSize, milesPerGallon);
        Odometer myOdometer = new Odometer(odometerReading);
        Leg leg1 = new Leg(length1, averageSpeed1);
        Leg leg2 = new Leg(length2, averageSpeed2);
        Leg leg3 = new Leg(length3, averageSpeed3);
        Leg.currentMinutes = departureMinutes;
        TourCost myTourCost = new TourCost(costOfFuelPerGallon);

        System.out.println("\n---------------- TOUR REPORT ----------------\n");

        System.out.printf("\nTotal distance        %.2f miles", Leg.totalDistance);
        System.out.printf("\nVan range             %.2f miles", tourVan.getRangeMiles());
        System.out.printf("\nFuel Needed           %.2f gallons", tourVan.getGallonsNeeded(Leg.totalDistance));
        System.out.printf("\nRefueling stops       %d\n", tourVan.getFillUps(Leg.totalDistance));

        System.out.printf("\nLeg 1 drive time      %d:%d",
                leg1.convertMinutesToClockHours(leg1.getDriveMinutes()),
                leg1.convertMinutesToClockMinutes(leg1.getDriveMinutes()));
        System.out.printf("\nLeg 2 drive time      %d:%d",
                leg2.convertMinutesToClockHours(leg2.getDriveMinutes()),
                leg2.convertMinutesToClockMinutes(leg2.getDriveMinutes()));
        System.out.printf("\nLeg 3 drive time      %d:%d",
                leg3.convertMinutesToClockHours(leg3.getDriveMinutes()),
                leg3.convertMinutesToClockMinutes(leg3.getDriveMinutes()));
    }
}
