package applications;

import chess.ChessMatch;
import gameboard.Board;


public class Program {
    public static void main(String[] args) {
        Board board = new Board(8,8);
        ChessMatch chessMatch = new ChessMatch(board);
        UI.printBoard(chessMatch.getPieces());

    }
}
