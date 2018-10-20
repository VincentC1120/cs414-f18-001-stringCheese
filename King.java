import java.util.ArrayList;

public class King extends ChessPiece {

    private ArrayList<String> legalMoves;

    public King(ChessBoard board, Color color) {
        super(board, color);
    }

    public ArrayList<String> legalMoves() {
        String position = getPosition();
        char letter = position.charAt(0);
        for(int i = -1; i < 2; i++){
            for (int j = -1; j < 2; j++) {
                if (row + i < 8 && row + i >= 0 && column + j < 8 && column + j >= 0 && !(row + i == row && column + j == column)) {
                    try {
                        if (board.getPiece(Character.toString((char) (letter + i)) + Integer.toString(column + j)) == null ||
                                board.getPiece(Character.toString((char) (letter + i)) + Integer.toString(column + j)).getColor() != this.color) {
                            legalMoves.add(Character.toString((char) (letter + i)) + Integer.toString(column + j));
                        }
                    } catch (IllegalPositionException e) {
                    }
                }
            }
        }
        return legalMoves;
}

    public String toString(){
        if (getColor() == Color.White) { return "\u2654"; }
        else return "\u265A";
    }
}