package gianlucamessina.BE_U2_S1_L4_springData.exceptions;

public class ValidationException extends RuntimeException {
    public ValidationException(String message) {
        super(message);
    }
}
