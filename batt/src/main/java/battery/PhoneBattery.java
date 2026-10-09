package battery;

/**
 * Ansh Devlekar
 * The PhoneBattery class tracks the amount of charge left in a phone
 */
public class PhoneBattery
{
    private final int FULL_CHARGE = 400;
    private final double PERCENT_PER_MINUTE = 0.25;
    private int minutesOfCharge;

    /**
     * Initializes a full phone battery
     */
    public PhoneBattery()
    {
        minutesOfCharge = FULL_CHARGE;
    }

    /**
     * @param minutes the number of minutes the phone was in use
     * Subtracts minutes from the number of minutes of charge in the phone
     */
    public void use(int minutes)
    {
        minutesOfCharge -= minutes;
    }

    /**
     * @param minutes the number of minutes the phone was charged
     * Adds minutes to the number of minutes of charge in the phone
     */
    public void charge(int minutes)
    {
        minutesOfCharge += minutes;
    }

    /**
     * @return the number of minutes of charge left in the phone
     * Returns how long the phone can stay on for
     */
    public int getMinutesRemaining()
    {
        return minutesOfCharge;
    }

    /**
     * @return the number of minutes the phone was used for
     * Returns how long the phone was used for
     */
    public int getMinutesUsed()
    {
        return FULL_CHARGE - minutesOfCharge;
    }

    /**
     * @return the percentage of charge in the phone
     * Returns the battery percentage of the phone
     * by multiplying the number of minutes of charge left in the phone by 0.25
     */
    public double getPercentRemaining()
    {
        double percentRemaining = PERCENT_PER_MINUTE * minutesOfCharge;
        return percentRemaining;
    }
}