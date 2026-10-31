/**
 * Template for a square on an empty chessboard, denoted by its row and column
 * @author Ansh
 */
public class Square {
    private int file;
    private int rank;

    /**
     * Builds a square from a square's name, such as "e4"
     * @param name a file letter a–h followed by a rank digit 1–8
     */
    public Square(String name) {
        file = name.charAt(0) - 'a';
        rank = name.charAt(1) - '1';
    }

    /**
     * Returns the file of this square as a number
     * @return 0 for the a-file through 7 for the h-file
     */
    public int getFile() {
        return file;
    }

    /**
     * Returns the rank of this square as a number
     * @return 0 for rank 1 through 7 for rank 8
     */
    public int getRank() {
        return rank;
    }

    /**
     * Checks if the text entered is a valid square name
     * @param text the text to check
     * @return true if the text is one file letter a–h then one rank digit 1–8
     */
    public static boolean isValidText(String text) {
        if (text.length() != 2) {
            return false;
        }

        char fileLetter = text.charAt(0);
        char rankDigit = text.charAt(1);

        boolean fileOnBoard = fileLetter >= 'a' && fileLetter <= 'h';
        boolean rankOnBoard = rankDigit >= '1' && rankDigit <= '8';

        return fileOnBoard && rankOnBoard;
    }
}
