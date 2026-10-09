package battery;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests the PhoneBattery class.
 */
public class PhoneBatteryTest
{
    /**
     * Proves that a new battery starts completely full.
     */
    @Test
    public void newBatteryIsFull()
    {
        PhoneBattery battery = new PhoneBattery();

        assertEquals(400, battery.getMinutesRemaining());
        assertEquals(0, battery.getMinutesUsed());
    }

    // TODO 2: usingThePhoneReducesTheMinutesRemaining
    //         use(100) on a new battery -> 300 minutes remaining

    // TODO 3: chargingIncreasesTheMinutesRemaining
    //         use(300) then charge(100) -> 200 minutes remaining

    // TODO 4: usedAndRemainingStayInStep
    //         use(150) -> 150 used AND 250 remaining.
    //         Two assertions. If these disagree, your class stores
    //         both numbers and forgot to update one of them.

    // TODO 5: percentRemainingAfterUse
    //         use(100) -> 75.0 percent
    //
    //         assertEquals on a double needs a THIRD value:
    //             assertEquals(75.0, battery.getPercentRemaining(), 0.001);

    // TODO 6: percentRemainingThatIsNotAWholeNumber
    //         use(1) -> 99.75 percent

    // TODO 7: usingThenChargingReturnsToTheExpectedLevel
    //         use(320) then charge(120) -> 200 remaining, 50.0 percent

    // Run your tests WITH COVERAGE. You need 100% on PhoneBattery.
    // Coverage only proves every line ran. Your assertions still have
    // to check the right values.
}
