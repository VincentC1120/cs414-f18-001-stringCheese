package edu.colostate.cs.cs414.StringCheese.src;

public class ChessBoard {
    private ChessPiece[][] board;

    public ChessBoard() {
        board = new ChessPiece[8][8];
    }

    public void initialize() {
        // This method initializes the board to the standard chess opening state with indexing as shown in the figure.
        // This method should use the constructors of the appropriate pieces, and call placePiece below to place the
        // newly constructed pieces in the right position.
        // a = 0, b = 1, ..., h = 7
        placePiece( new Rook(this, ChessPiece.Color.White), "a1");
        placePiece( new Bishop(this, ChessPiece.Color.White), "c1");
        placePiece( new King(this, ChessPiece.Color.White), "e1");
        placePiece( new Bishop(this, ChessPiece.Color.White), "f1");
        placePiece( new Rook(this, ChessPiece.Color.White), "h1");
        for(char i = 'a'; i < 'i'; i++){
            placePiece( new Pawn(this, ChessPiece.Color.White), Character.toString(i) + Integer.toString(2));
            placePiece( new Pawn(this, ChessPiece.Color.Black), Character.toString(i) + Integer.toString(7));
        }
        placePiece( new Rook(this, ChessPiece.Color.Black), "a8");
        placePiece( new Bishop(this, ChessPiece.Color.Black), "c8");
        placePiece( new King(this, ChessPiece.Color.Black), "e8");
        placePiece( new Bishop(this, ChessPiece.Color.Black), "f8");
        placePiece( new Rook(this, ChessPiece.Color.Black), "h8");

    }

    public ChessPiece getPiece(String position) throws IllegalPositionException {
        // This method returns the chess piece at a given position. The position is represented as a two-character
        // string (e.g., e8) as described above. The first letter is in lowercase (a..h) and the second letter is a
        // digit (1..8). If the position is illegal because the string contains illegal characters or represents a
        // position outside the board, the exception is thrown.

        if(position.charAt(0) < 'a' || position.charAt(0) > 'h' ||
           position.charAt(1) < '1' || position.charAt(1) > '8')
            throw new IllegalPositionException();
        int row = position.charAt(0) - 'a';
        int col = Character.getNumericValue(position.charAt(1)) - 1;
        return board[row][col];
    }

    public boolean placePiece(ChessPiece piece, String position) {
        if(position.length() != 2) return false;
        try {
            if(getPiece(position) == null || getPiece(position).getColor() != piece.getColor()){
                int row = position.charAt(0) - 'a';
                int col = Character.getNumericValue(position.charAt(1)) - 1;
                piece.setPosition(position);    //check out setPosition
                board[row][col] = piece;
                return true;
                //FIXME how do I account for a piece that is captured and removed from the board. I need to update that
                //FIXME old piece instance row/col variables to be -1? Or I probably just don't care
            } else {
                return false;
            }
        } catch (IllegalPositionException e) {
            return false;
        }


        // This method tries to place the given piece at a given position, and returns true if successful, and false if
        // there is already a piece of the same player in the given position or the position was illegal for any of the
        // two reasons mentioned in the description of getPiece. If an opponent's piece exists, that piece is captured.
        // If successful, this method should call an appropriate method in the ChessPiece class (i.e., setPosition) to
        // set the piece's position.

    }

    public void move(String fromPosition, String toPosition) throws IllegalMoveException {
        // This method checks if moving the piece from the fromPosition to toPosition is a legal move. Legality is
        // defined based on the rules described above in Section 2.1. If the move is legal, it executes the move,
        // changing the value of the board as needed. Otherwise, the stated exception is thrown.



    }

    public String toString() {
        String s = "";
        for(int row = 0; row < 8; row++){
            for(int col = 0; col < 8; col++){
                s += board[row][col] + " | ";
            }
            s += '\n';
        }
        return s;
        // call ChessPiece toString(), just for debugging
    }

    public static void main(String[] args) {
        ChessBoard board = new ChessBoard();
        board.initialize();
        System.out.println(board);
        //board.move("c2", "c4");
        //System.out.println(board);
    }

}

