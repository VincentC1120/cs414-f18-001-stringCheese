package edu.colostate.cs.cs414.StringCheese.src;

import java.util.ArrayList;

public abstract class ChessPiece {

    public enum Color {White, Black};
    protected ChessBoard board; // the board it belongs to, default null
    protected int row; // the index of the horizontal rows 0..7
    protected int column; //the index of the vertical coloumn 0..7
    protected Color color; // the color of the piece
    protected String position;

    public ChessPiece(ChessBoard board, Color color){
        this.board = board;
        this.color = color;
    }

    public Color getColor(){ return color; }

    public String getPosition() { return position; }

    public void setPosition(String position) throws IllegalPositionException {

        if(position.charAt(0) < 'a' || position.charAt(0) > 'h' ||
           position.charAt(1) < '1' || position.charAt(1) > '8')
            throw new IllegalPositionException();

        row = position.charAt(0) - 'a';
        column = Character.getNumericValue(position.charAt(1)) - 1;
        this.position = position;
    }

    abstract public ArrayList<String> legalMoves();
    abstract public String toString();

}




