package src.edu.colostate.cs.cs414.StringCheese;

import java.util.ArrayList;


public class Bishop extends ChessPiece {

    private ArrayList<String> legalMoves;

    public Bishop(ChessBoard board, Color color) {
        super(board, color);
    }

    public ArrayList<String> legalMoves(){
        String position = getPosition();



        return legalMoves;
    }

    public String toString(){
        if (getColor() == Color.White) { return "\u2657"; }
        else return "\u265D";
    }
}