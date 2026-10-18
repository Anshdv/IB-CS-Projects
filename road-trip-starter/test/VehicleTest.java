import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * WORKED EXAMPLE. These tests are written for you. Read them before you
 * write any of your own, then write the other three test classes in the
 * same style.
 *
 * Three habits to copy:
 *
 *   1. The expected value comes FIRST in every assert. Java does not
 *      care, but a human reading a failure message does.
 *   2. Comparing doubles needs a tolerance. 462.5 and 462.49999999 are
 *      the same number as far as this test is concerned, so the third
 *      argument says how close is close enough.
 *   3. One idea per test method, and the method name says which idea.
 *      "testGetFillUpsWhenDistanceIsUnderOneTankful" is a better name
 *      than "test3".
 */
public class VehicleTest
{
    private static final double TOL = 0.0001;

    @Test
    public void testGetRangeMiles()
    {
        Vehicle van = new Vehicle(18.5, 25);
        assertEquals(462.5, van.getRangeMiles(), TOL);
    }

    @Test
    public void testGetGallonsNeeded()
    {
        Vehicle van = new Vehicle(18.5, 25);
        assertEquals(74.32432432, van.getGallonsNeeded(1375), TOL);
    }

    @Test
    public void testGetFillUpsWhenDistanceIsUnderOneTankful()
    {
        Vehicle van = new Vehicle(18.5, 25);   // range is 462.5 miles
        assertEquals(0, van.getFillUps(400));
    }

    @Test
    public void testGetFillUpsWhenDistanceIsExactlyTwoTankfuls()
    {
        Vehicle van = new Vehicle(18.5, 25);   // range is 462.5 miles
        assertEquals(1, van.getFillUps(925));
    }

    @Test
    public void testGetFillUpsJustOverOneTankful()
    {
        Vehicle van = new Vehicle(18.5, 25);
        assertEquals(1, van.getFillUps(463));
    }

    @Test
    public void testGetFillUpsOnTheFullTour()
    {
        Vehicle van = new Vehicle(18.5, 25);
        assertEquals(2, van.getFillUps(1375));
    }
}
