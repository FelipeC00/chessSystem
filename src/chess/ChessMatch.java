package chess;

import gameboard.Board;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
    }

    public ChessMatch(Board board) {
        this.board = board;
    }
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for(int i = 0; i < board.getRows(); i++){
            for(int j = 0; j < board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return mat;
    }


}