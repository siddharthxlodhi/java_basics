package InternalExceptionHandling.ourflow;

public class Myimple2 implements Bootstrap.MyUncaughtExceptionhandler {
    @Override
    public void myUncaughtException(Throwable t) {
        t.printStackTrace();

    }
}
