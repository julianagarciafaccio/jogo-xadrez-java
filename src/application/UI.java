package application;

import chess.ChessPiece;

public class UI {
    // metodo criado para imprimir o tabuleiro na tela, esta sendo usado como parametros a matri
    // criada e as peças
    public static void printBoard(ChessPiece[][] pieces){
        // funçao criada para imprimir o tabuleiro e percorrer por todos os itens da matriz
        for (int i=0; i<pieces.length; i++){
            System.out.println((8 - i)+ " ");
            for (int j=0; j<pieces.length; j++){
                printPiece(pieces[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }
    private static void printPiece(ChessPiece piece){
        if (piece == null){
            System.out.println("-");
        }
        else {
            System.out.println(piece);
        }
        System.out.println(" ");
    }

}
