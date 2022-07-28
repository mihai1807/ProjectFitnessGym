//Created an exception class for the "person does not exist" unchecked exception; a message is displayed on the exception.
public class ExceptionPersonDoesNotExist extends Exception {


    public ExceptionPersonDoesNotExist() {
    }

    @Override
    public String getMessage() {
        return "Person with this id does not exist in the Gym.";
    }
}
