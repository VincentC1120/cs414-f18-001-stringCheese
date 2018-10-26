package edu.colostate.cs.cs414.StringCheese.src;

import java.util.HashSet;

public class Rook extends ChessPiece {

    private HashSet<String> legalMoves;

    @Override
    public HashSet<String> getValidMoves() {
        return null;
    }

    public Rook(ChessBoard board, Color color) {
        super(board, color);
        legalMoves = new HashSet<String>();
    }

    public HashSet<String> legalMoves(){
        String position = getPosition();



        return legalMoves;
    }

    public String toString(){
        if (getColor() == Color.White) { return "\u2656"; }
        else return "\u265C";
    }
}
