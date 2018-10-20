import java.util.ArrayList;

public class Pawn extends ChessPiece {

    private ArrayList<String> legalMoves;

    public Pawn(ChessBoard board, Color color) {
        super(board, color);
    }

    public ArrayList<String> legalMoves(){
        String position = getPosition();



        return legalMoves;
    }

    public String toString(){
        if (getColor() == Color.White) { return "\u2659"; }
        else return "\u265F";
    }
}