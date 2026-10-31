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
}
