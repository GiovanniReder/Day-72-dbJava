package giovanni.exception;

public class IllegalStateException extends RuntimeException {
    public IllegalStateException(String msg){
        super("errore nel driver manager: " + msg);
    }
}
