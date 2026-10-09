package battery;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests the PhoneBattery class
 */
public class PhoneBatteryTest
{
    /**
     * Proves that a new battery starts completely full
     */
    @Test
    public void newBatteryIsFull()
    {
        PhoneBattery battery = new PhoneBattery();

        assertEquals(400, battery.getMinutesRemaining());
        assertEquals(0, battery.getMinutesUsed());
    }

    /**
     * Proves that use() deceases the minutes of charge in the phone
     */
    @Test
    public void usingThePhoneReducesTheMinutesRemaining()
    {
        PhoneBattery battery = new PhoneBattery();
        battery.use(100);

        assertEquals(300, battery.getMinutesRemaining());
    }

    /**
     * Proves that charge() adds to the minutes of charge in the phone
     */
    @Test
    public void chargingIncreasesTheMinutesRemaining()
    {
        PhoneBattery battery = new PhoneBattery();
        battery.use(300);
        battery.charge(100);

        assertEquals(200, battery.getMinutesRemaining());
    }

    /**
     * Proves that the number of minutes the phone was used and the number of minutes of charge remaining stay in step
     */
    @Test
    public void usedAndRemainingStayInStep()
    {
        PhoneBattery battery = new PhoneBattery();
        battery.use(150);

        assertEquals(150, battery.getMinutesUsed());
        assertEquals(250, battery.getMinutesRemaining());
    }

    /**
     * Proves that each minute of use depletes the percentage by 0.25
     */
    @Test
    public void percentRemainingAfterUse()
    {
        PhoneBattery battery = new PhoneBattery();
        battery.use(100);

        assertEquals(75.0, battery.getPercentRemaining(), 0.0001);
    }

    /**
     * Proves that the battery percentage is not always a whole number
     */
    @Test
    public void percentRemainingThatIsNotAWholeNumber()
    {
        PhoneBattery battery = new PhoneBattery();
        battery.use(1);

        assertEquals(99.75, battery.getPercentRemaining(), 0.0001);
    }

    /**
     * Proves that the battery percentage is in step with the number of minutes of charge after using and charging
     */
    @Test
    public void usingThenChargingReturnsToTheExpectedLevel()
    {
        PhoneBattery battery = new PhoneBattery();
        battery.use(320);
        battery.charge(120);

        assertEquals(200, battery.getMinutesRemaining());
        assertEquals(50.0, battery.getPercentRemaining(), 0.0001);
    }
}
