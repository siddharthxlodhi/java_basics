package InternalExceptionHandling.ourflow;

public class MyUncaughtExceptionHandlerImple implements Bootstrap.MyUncaughtExceptionhandler{
    @Override
    public void myUncaughtException(Throwable t) {
        System.err.print("Exception in "+" "+t.getClass().getName()+" " +t.getMessage());
    }
}
