package chess.pieces;

import chess.ChessPiece;
import chess.Color;
import gameboard.Board;

public class King extends ChessPiece {
    public King() {
    }

    public King(Board board, Color color) {
        super(board, color);
    }
    public String toString(){
        return "K";
    }
}
