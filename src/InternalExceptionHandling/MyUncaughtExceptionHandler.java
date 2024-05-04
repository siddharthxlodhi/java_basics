package InternalExceptionHandling;

public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {
        System.err.print("welcome in exception handling you have exception in :::\"" + thread.getName() + ":::\" ");




    }
}
