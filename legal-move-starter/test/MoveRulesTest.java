import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for MoveRules. Nothing is written for you.
 *
 * Each of the six methods needs a move it ACCEPTS and one it REJECTS.
 * A file where every assertion is assertFalse passes completely against
 * a MoveRules that returns false every time, which means it has tested
 * nothing.
 *
 * These six cases are required:
 *   1. Every piece rejects a move to the square it is already on.
 *   2. A knight rejects e4 to g6. Two and two, not two and one.
 *   3. A pawn rejects two squares forward from a non-starting rank.
 *   4. A pawn rejects a diagonal move that is not a capture.
 *   5. A pawn rejects moving backwards.
 *   6. A black pawn is tested, not only a white one.
 */
public class MoveRulesTest
{
    private MoveRules rules = new MoveRules();

    private Move move(String from, String to)
    {
        return new Move(new Square(from), new Square(to));
    }

    @Test
    public void testEveryPieceRejectsTheSameSquare()
    {
        assertFalse(rules.isLegalKnight(move("e4", "e4")));
        assertFalse(rules.isLegalRook(move("a1", "a1")));
        assertFalse(rules.isLegalBishop(move("c1", "c1")));
        assertFalse(rules.isLegalQueen(move("d1", "d1")));
        assertFalse(rules.isLegalKing(move("e4", "e4")));
        assertFalse(rules.isLegalPawn(move("e2", "e2"), true, false));
    }

    @Test
    public void testKnightAcceptsAMove()
    {
        assertTrue(rules.isLegalKnight(move("b1", "c3")));
    }

    @Test
    public void testKnightAcceptsTwoFilesAndOneRank()
    {
        assertTrue(rules.isLegalKnight(move("b1", "d2")));
    }

    @Test
    public void testKnightRejectsTwoAndTwo()
    {
        assertFalse(rules.isLegalKnight(move("e4", "g6")));
    }

    @Test
    public void testKnightRejectsOneAndOne()
    {
        assertFalse(rules.isLegalKnight(move("e4", "f5")));
    }

    @Test
    public void testRookAcceptsAMove()
    {
        assertTrue(rules.isLegalRook(move("a1", "a8")));
    }

    @Test
    public void testRookAcceptsARank()
    {
        assertTrue(rules.isLegalRook(move("a1", "h1")));
    }

    @Test
    public void testRookRejectsADiagonal()
    {
        assertFalse(rules.isLegalRook(move("a1", "b2")));
    }

    @Test
    public void testBishopAcceptsAMove()
    {
        assertTrue(rules.isLegalBishop(move("c1", "h6")));
    }

    @Test
    public void testBishopRejectsAFile()
    {
        assertFalse(rules.isLegalBishop(move("c1", "c5")));
    }

    @Test
    public void testQueenAcceptsAMove()
    {
        assertTrue(rules.isLegalQueen(move("d1", "d8")));
    }

    @Test
    public void testQueenAcceptsABishopMove()
    {
        assertTrue(rules.isLegalQueen(move("d1", "h5")));
    }

    @Test
    public void testQueenRejectsAKnightMove()
    {
        assertFalse(rules.isLegalQueen(move("e4", "f6")));
    }

    @Test
    public void testKingAcceptsAMove()
    {
        assertTrue(rules.isLegalKing(move("e4", "e5")));
    }

    @Test
    public void testKingRejectsTwoSquares()
    {
        assertFalse(rules.isLegalKing(move("e4", "e6")));
    }

    @Test
    public void testKingRejectsTwoFiles()
    {
        assertFalse(rules.isLegalKing(move("e4", "g4")));
    }

    @Test
    public void testWhitePawnAcceptsOneSquareForward()
    {
        assertTrue(rules.isLegalPawn(move("e2", "e3"), true, false));
    }

    @Test
    public void testWhitePawnAcceptsTwoSquaresFromTheStart()
    {
        assertTrue(rules.isLegalPawn(move("e2", "e4"), true, false));
    }

    @Test
    public void testPawnRejectsTwoSquaresOffTheStart()
    {
        assertFalse(rules.isLegalPawn(move("e3", "e5"), true, false));
    }

    @Test
    public void testWhitePawnAcceptsACapture()
    {
        assertTrue(rules.isLegalPawn(move("e4", "d5"), true, true));
    }

    @Test
    public void testWhitePawnRejectsAStraightCapture()
    {
        assertFalse(rules.isLegalPawn(move("e4", "e5"), true, true));
    }

    @Test
    public void testWhitePawnRejectsABackwardCapture()
    {
        assertFalse(rules.isLegalPawn(move("e4", "d3"), true, true));
    }

    @Test
    public void testPawnRejectsADiagonalThatIsNotACapture()
    {
        assertFalse(rules.isLegalPawn(move("e4", "d5"), true, false));
    }

    @Test
    public void testPawnRejectsMovingBackwards()
    {
        assertFalse(rules.isLegalPawn(move("e4", "e3"), true, false));
    }

    @Test
    public void testBlackPawnAcceptsOneSquareForward()
    {
        assertTrue(rules.isLegalPawn(move("e7", "e6"), false, false));
    }

    @Test
    public void testBlackPawnAcceptsTwoSquaresFromTheStart()
    {
        assertTrue(rules.isLegalPawn(move("e7", "e5"), false, false));
    }

    @Test
    public void testBlackPawnRejectsTwoSquaresOffTheStart()
    {
        assertFalse(rules.isLegalPawn(move("e6", "e4"), false, false));
    }
}
