import java.util.ArrayList;

public class Rook extends ChessPiece {

    private ArrayList<String> legalMoves;

    public Rook(ChessBoard board, Color color) {
        super(board, color);
    }

    public ArrayList<String> legalMoves(){
        String position = getPosition();



        return legalMoves;
    }

    public String toString(){
        if (getColor() == Color.White) { return "\u2656"; }
        else return "\u265C";
    }
}