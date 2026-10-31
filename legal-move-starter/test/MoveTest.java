import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for Move. Nothing is written for you.
 *
 * Every public method must be covered. At minimum:
 *   - a delta that is positive and one that is negative
 *   - a distance where the delta was negative, proving it lost the sign
 *   - isSameSquare both true and false
 *   - getFromRank
 */
public class MoveTest
{
    @Test
    public void testGetFileDeltaIsPositive()
    {
        Square from = new Square("a1");
        Square to = new Square("h1");
        Move move = new Move(from, to);
        assertEquals(7, move.getFileDelta());
    }

    @Test
    public void testGetFileDeltaIsNegative()
    {
        Square from = new Square("h1");
        Square to = new Square("a1");
        Move move = new Move(from, to);
        assertEquals(-7, move.getFileDelta());
    }

    @Test
    public void testGetRankDeltaIsPositive()
    {
        Square from = new Square("a1");
        Square to = new Square("a8");
        Move move = new Move(from, to);
        assertEquals(7, move.getRankDelta());
    }

    @Test
    public void testGetRankDeltaIsNegative()
    {
        Square from = new Square("a8");
        Square to = new Square("a1");
        Move move = new Move(from, to);
        assertEquals(-7, move.getRankDelta());
    }

    @Test
    public void testGetFileDistanceLosesTheSign()
    {
        Square from = new Square("h1");
        Square to = new Square("a1");
        Move move = new Move(from, to);
        assertEquals(7, move.getFileDistance());
    }

    @Test
    public void testGetRankDistanceLosesTheSign()
    {
        Square from = new Square("a8");
        Square to = new Square("a1");
        Move move = new Move(from, to);
        assertEquals(7, move.getRankDistance());
    }

    @Test
    public void testIsSameSquareWhenThePieceStays()
    {
        Square from = new Square("e4");
        Square to = new Square("e4");
        Move move = new Move(from, to);
        assertTrue(move.isSameSquare());
    }

    @Test
    public void testIsSameSquareWhenThePieceMoves()
    {
        Square from = new Square("e4");
        Square to = new Square("e5");
        Move move = new Move(from, to);
        assertFalse(move.isSameSquare());
    }

    @Test
    public void testGetFromRankOnTheFirstRank()
    {
        Square from = new Square("a1");
        Square to = new Square("a2");
        Move move = new Move(from, to);
        assertEquals(0, move.getFromRank());
    }

    @Test
    public void testGetFromRankInTheMiddle()
    {
        Square from = new Square("e4");
        Square to = new Square("e5");
        Move move = new Move(from, to);
        assertEquals(3, move.getFromRank());
    }

    @Test
    public void testGetFromRankOnTheLastRank()
    {
        Square from = new Square("h8");
        Square to = new Square("h7");
        Move move = new Move(from, to);
        assertEquals(7, move.getFromRank());
    }
}
