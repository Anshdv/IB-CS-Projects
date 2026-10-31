import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * WORKED EXAMPLE. These tests are written for you. Read them, then
 * write MoveTest and MoveRulesTest in the same style.
 *
 * Four habits to copy:
 *
 *   1. The expected value comes FIRST in every assertEquals.
 *   2. One idea per test method, and the method name says which idea.
 *   3. Test the edges, not just the middle. The a-file and the h-file
 *      are where off-by-one errors live; e4 is where they hide.
 *   4. Every public method gets at least one test that could FAIL.
 *      A test that would pass no matter what you wrote is worth nothing.
 */
public class SquareTest
{
    @Test
    public void testGetFileOnTheFirstFile()
    {
        assertEquals(0, new Square("a1").getFile());
    }

    @Test
    public void testGetFileOnTheLastFile()
    {
        assertEquals(7, new Square("h8").getFile());
    }

    @Test
    public void testGetRankOnTheFirstRank()
    {
        assertEquals(0, new Square("a1").getRank());
    }

    @Test
    public void testGetRankOnTheLastRank()
    {
        assertEquals(7, new Square("h8").getRank());
    }

    @Test
    public void testGetFileAndRankInTheMiddle()
    {
        Square e4 = new Square("e4");
        assertEquals(4, e4.getFile());
        assertEquals(3, e4.getRank());
    }

    @Test
    public void testIsValidTextAcceptsARealSquare()
    {
        assertTrue(Square.isValidText("e4"));
    }

    @Test
    public void testIsValidTextRejectsAFileOffTheBoard()
    {
        assertFalse(Square.isValidText("i4"));
    }

    @Test
    public void testIsValidTextRejectsARankOffTheBoard()
    {
        assertFalse(Square.isValidText("e9"));
        assertFalse(Square.isValidText("e0"));
    }

    @Test
    public void testIsValidTextRejectsWrongLength()
    {
        assertFalse(Square.isValidText("e"));
        assertFalse(Square.isValidText("e44"));
    }

    @Test
    public void testIsValidTextRejectsReversedOrder()
    {
        assertFalse(Square.isValidText("4e"));
    }
}
