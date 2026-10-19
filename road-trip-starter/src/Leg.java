public class Leg
{
    public static double totalDistance;
    public static int currentMinutes;

    private int distance;
    private int averageSpeed;

    public Leg(int inputDistance, int inputAverageSpeed) {
        distance = inputDistance;
        averageSpeed = inputAverageSpeed;
        totalDistance += distance;
        currentMinutes += getDriveMinutes();
    }

    public double getMiles() {
        return distance;
    }

    public int getDriveMinutes() {
        int driveMinutes = (distance / 60) + (distance % 60);
        return (int) Math.round(driveMinutes);
    }

    public int getArrivalMinutes(int departMinutes) {
        return departMinutes + getDriveMinutes();
    }

    public int convertMinutesToClockHours(int minutes) {
        int restrictedMinutes = minutes % 1440;
        int clockHours = restrictedMinutes / 60;
        return clockHours;
    }

    public int convertMinutesToClockMinutes(int minutes) {
        int restrictedMinutes = minutes % 1440;
        int clockMinutes = restrictedMinutes % 60;
        return clockMinutes;
    }
}
