import java.util.Scanner;

/**
 * Asks the user for a piece and a proposed move, then tells them whether that piece can make the move
 * @author Ansh
 */
public class ChessApp {
    /**
     * Asks for the piece, the starting square, and the destination.
     * A pawn is also asked for its color and whether the move is a capture.
     * @param args not used
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== LEGAL MOVE ===");
        System.out.println();

        System.out.print("Piece (knight, rook, bishop, queen, king, pawn): ");
        String piece = input.next();

        System.out.print("From: ");
        String fromText = input.next();

        System.out.print("To: ");
        String toText = input.next();

        if (!Square.isValidText(fromText) || !Square.isValidText(toText)) {
            System.out.println();
            System.out.println("That is not a square on the board.");
            return;
        }

        boolean isWhite = false;
        boolean isCapture = false;

        if (piece.equals("pawn")) {
            System.out.print("Color (white or black): ");
            String color = input.next();
            if (color.equals("white")) {
                isWhite = true;
            }

            System.out.print("Is this a capture (yes or no): ");
            String capture = input.next();
            if (capture.equals("yes")) {
                isCapture = true;
            }
        }

        Square from = new Square(fromText);
        Square to = new Square(toText);
        Move move = new Move(from, to);
        MoveRules rules = new MoveRules();

        boolean legal = false;

        if (piece.equals("knight")) {
            legal = rules.isLegalKnight(move);
        } else if (piece.equals("rook")) {
            legal = rules.isLegalRook(move);
        } else if (piece.equals("bishop")) {
            legal = rules.isLegalBishop(move);
        } else if (piece.equals("queen")) {
            legal = rules.isLegalQueen(move);
        } else if (piece.equals("king")) {
            legal = rules.isLegalKing(move);
        } else if (piece.equals("pawn")) {
            legal = rules.isLegalPawn(move, isWhite, isCapture);
        }

        System.out.println();

        String result = "may not";
        if (legal) {
            result = "may";
        }
        System.out.println("A " + piece + " " + result + " move from " + fromText + " to " + toText + ".");
    }
}
