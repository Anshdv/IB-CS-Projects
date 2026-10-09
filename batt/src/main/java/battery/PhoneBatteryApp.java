package battery;

/**
 * The PhoneBatteryApp allows the user to control their phone battery
 */
public class PhoneBatteryApp
{
    /**
     * @param args not used
     * Demonstrates every method of PhoneBattery
     */
    public static void main(String[] args)
    {
        PhoneBattery battery = new PhoneBattery();

        System.out.println("New battery:                         "
            + battery.getMinutesRemaining() + " remaining, "
            + battery.getMinutesUsed() + " used, "
            + battery.getPercentRemaining() + "%");

        battery.use(100);

        System.out.println("After using for 100 minutes:         "
                + battery.getMinutesRemaining() + " remaining, "
                + battery.getMinutesUsed() + " used, "
                + battery.getPercentRemaining() + "%");

        battery.use(260);

        System.out.println("After using for 260 more minutes:    "
                + battery.getMinutesRemaining() + " remaining, "
                + battery.getMinutesUsed() + " used, "
                + battery.getPercentRemaining() + "%");

        battery.charge(160);

        System.out.println("After charging for 160 minutes:      "
                + battery.getMinutesRemaining() + " remaining, "
                + battery.getMinutesUsed() + " used, "
                + battery.getPercentRemaining() + "%");
    }
}
