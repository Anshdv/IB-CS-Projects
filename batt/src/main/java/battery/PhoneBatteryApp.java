package battery;

/**
 * TODO: Write class-level Javadoc here. Add your name.
 */
public class PhoneBatteryApp
{
    /**
     * Demonstrates every method of PhoneBattery.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        PhoneBattery battery = new PhoneBattery();

        System.out.println("New battery:        "
            + battery.getMinutesRemaining() + " remaining, "
            + battery.getMinutesUsed() + " used, "
            + battery.getPercentRemaining() + "%");

        // TODO: call use(100) and print the same three values.

        // TODO: call use(260) and print again.

        // TODO: call charge(160) and print again.

        // Label every line so a reader can tell what happened.
    }
}
