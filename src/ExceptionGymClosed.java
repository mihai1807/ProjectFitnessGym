//Created an exception class for the "gym closed" unchecked exception; no action is performed on the exception.
public class ExceptionGymClosed extends RuntimeException {
    public ExceptionGymClosed(String message) {
        super(message);
    }

}
