package InternalExceptionHandling;

public class Throw extends Throwable {
    String message;

    Throw(String message){
        this.message=message;

    }
    @Override
    public String getMessage(){
return message;
    }
}
