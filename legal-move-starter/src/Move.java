/**
 * Simulates moving a piece from one square to another
 * @author Ansh
 */
public class Move {
    private Square fromSquare;
    private Square toSquare;

    /**
     * Creates a Move that moves a piece from a starting square to a destination square
     * @param fromSquare the square the piece starts on
     * @param toSquare the square the piece would end on
     */
    public Move(Square fromSquare, Square toSquare) {
        this.fromSquare = fromSquare;
        this.toSquare = toSquare;
    }

    /**
     * Returns how many files apart the destination square is from the starting square
     * A negative results means the movement is towards the a-file
     * @return destination file minus starting file
     */
    public int getFileDelta() {
        return toSquare.getFile() - fromSquare.getFile();
    }

    /**
     * Returns how many ranks apart the destination square is from the starting square
     * A negative results means the movement is towards rank 1
     * @return destination rank minus starting rank
     */
    public int getRankDelta() {
        return toSquare.getRank() - fromSquare.getRank();
    }

    /**
     * Returns the number of files the move covers
     * @return the size of the file delta
     */
    public int getFileDistance() {
        return Math.abs(getFileDelta());
    }

    /**
     * Returns the number of ranks the move covers
     * @return the size of the rank delta
     */
    public int getRankDistance() {
        return Math.abs(getRankDelta());
    }

    /**
     * Returns whether the move ends on the same square it started on
     * @return true if the file and the rank both stay the same
     */
    public boolean isSameSquare() {
        return getFileDelta() == 0 && getRankDelta() == 0;
    }

    /**
     * Returns the rank the piece started on
     * @return 0 for rank 1 through 7 for rank 8
     */
    public int getFromRank() {
        return fromSquare.getRank();
    }
}
