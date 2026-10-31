/**
 * Answers whether a piece can legally make a move on an empty board
 * @author Ansh
 */
public class MoveRules {
    /**
     * Returns whether a knight can make this move
     * @param move the move to check
     * @return true when the distances are 2 and 1, in either order
     */
    public boolean isLegalKnight(Move move) {
        if (move.isSameSquare()) {
            return false;
        }

        int fileDistance = move.getFileDistance();
        int rankDistance = move.getRankDistance();

        if (fileDistance == 2 && rankDistance == 1) {
            return true;
        }
        if (fileDistance == 1 && rankDistance == 2) {
            return true;
        }
        return false;
    }

    /**
     * Returns whether a rook can make this move
     * @param move the move to check
     * @return true when exactly one of the two deltas is zero
     */
    public boolean isLegalRook(Move move) {
        if (move.isSameSquare()) {
            return false;
        }

        if (move.getFileDelta() == 0) {
            return true;
        }
        if (move.getRankDelta() == 0) {
            return true;
        }
        return false;
    }

    /**
     * Returns whether a bishop can make this move
     * @param move the move to check
     * @return true when the file distance equals the rank distance
     */
    public boolean isLegalBishop(Move move) {
        if (move.isSameSquare()) {
            return false;
        }

        if (move.getFileDistance() == move.getRankDistance()) {
            return true;
        }
        return false;
    }

    /**
     * Returns whether a queen can make this move
     * A queen can move as a rook or a bishop
     * @param move the move to check
     * @return true when the move is legal for a rook or a bishop
     */
    public boolean isLegalQueen(Move move) {
        if (move.isSameSquare()) {
            return false;
        }

        if (isLegalRook(move)) {
            return true;
        }
        if (isLegalBishop(move)) {
            return true;
        }
        return false;
    }

    /**
     * Returns whether a king can make this move
     * @param move the move to check
     * @return true when both distances are at most 1
     */
    public boolean isLegalKing(Move move) {
        if (move.isSameSquare()) {
            return false;
        }

        if (move.getFileDistance() <= 1 && move.getRankDistance() <= 1) {
            return true;
        }
        return false;
    }

    /**
     * Returns whether a pawn can make this move
     * White moves up ranks and black moves down
     * Without a capture the pawn goes straight forward, one square, or two from its starting rank
     * A capture is one square diagonally forward, never straight or backward
     * @param move the move to check
     * @param isWhite true if the pawn is white
     * @param isCapture true if this move is a capture
     * @return true when the pawn's color and capture state allow this move
     */
    public boolean isLegalPawn(Move move, boolean isWhite, boolean isCapture) {
        if (move.isSameSquare()) {
            return false;
        }

        int direction = 1;
        if (!isWhite) {
            direction = -1;
        }

        int fileDelta = move.getFileDelta();
        int rankDelta = move.getRankDelta();
        int fileDistance = move.getFileDistance();

        if (isCapture) {
            if (fileDistance == 1 && rankDelta == direction) {
                return true;
            }
            return false;
        }

        if (fileDelta != 0) {
            return false;
        }

        if (rankDelta == direction) {
            return true;
        }

        if (rankDelta == direction * 2) {
            if (isWhite && move.getFromRank() == 1) {
                return true;
            }
            if (!isWhite && move.getFromRank() == 6) {
                return true;
            }
        }

        return false;
    }
}
