package InternalExceptionHandling.practice;

import java.io.Closeable;


public class myClosable implements Closeable {


    @Override
    public void close(){
        System.out.println("Closed 1");

    }
}
