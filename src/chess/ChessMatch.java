package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
    // nessa classe que tem as regras para o jogo de xadrez acontecer
    private Board board;
    // e essa classe q tem q saber o tamanho do tabuleiro,e nessa classe q eu especifico o tamanho dele
    public ChessMatch(){
        board = new Board(8,8);
        initialSetup();
    }
    // metodo feito para percorrer os itens da matriz
    //isso retorna a matriz de peças da partida do jogo
    public ChessPiece[][]getPieces(){
        ChessPiece [][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i=0;i< board.getRows();i++){
            for (int j=0;j< board.getColumns();j++){
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return mat;
    }
    private void initialSetup(){
        board.placePiece(new Rook(board, Color.WITHE) , new Position(2,1));
        board.placePiece(new King(board,Color.BLACK) , new Position(0,2));
    }
}
