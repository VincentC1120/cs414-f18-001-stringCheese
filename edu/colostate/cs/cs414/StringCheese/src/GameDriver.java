package edu.colostate.cs.cs414.StringCheese.src;

import java.util.HashSet;
import java.util.Scanner;

public class GameDriver {


    public static void main(String[] args){
        ChessBoard board = new ChessBoard();
        board.initialize();

        System.out.println(board.toString());
        System.out.println("White Player goes first" +
                "\nEnter \"Select\" <position> to show the valid moves of a piece " +
                "\nExample: \"select A4\"");

        Scanner scan = new Scanner(System.in);
        String[] command = scan.nextLine().split(" ");
        HashSet<String> moves = new HashSet<>();

        if(command[0].equalsIgnoreCase("select")){
            moves = board.selectPiece(command[1]);
        }

        if(moves.isEmpty()){
            System.out.println("No valid moves for position: " + command[1] );
        }
    }
}
