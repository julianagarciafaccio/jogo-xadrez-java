package boardgame;

public class BoardException  extends RuntimeException{
    // um construtor do tipo string q e responsavel por tratar as exceçoes do tipo rumtime
    // pega o msg e repassa para o construtor da super classe q no caso e o rumtime
    public BoardException(String msg){
        super(msg);
    }

}
