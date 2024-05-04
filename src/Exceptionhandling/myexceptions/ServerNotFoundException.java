package Exceptionhandling.myexceptions;

public class ServerNotFoundException extends RuntimeException {
    public ServerNotFoundException(String message){
        super(message);
    }
}
