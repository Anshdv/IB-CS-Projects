public class Leg
{
    private double distance;
    private int averageSpeed;

    public Leg(double inputDistance, int inputAverageSpeed) {
        distance = inputDistance;
        averageSpeed = inputAverageSpeed;
    }

    public double getMiles() {
        return distance;
    }

    public int getDriveMinutes() {
        double driveMinutes = distance /  averageSpeed;
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
