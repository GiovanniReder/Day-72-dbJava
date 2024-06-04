package giovanni.exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException(long id) {
        super("L'evento con id: " + id + " non è stato trovato nel db!");
    }
}
