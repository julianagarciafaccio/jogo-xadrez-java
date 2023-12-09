package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }
// somente classes dentro do mesmo pacote e subclasses pode acessar o tabuleiro de uma peça
    protected Board getBoard() {
        return board;
    }

}
