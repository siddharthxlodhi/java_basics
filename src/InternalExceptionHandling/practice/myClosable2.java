package InternalExceptionHandling.practice;

import java.io.Closeable;
import java.io.IOException;

public class myClosable2 implements Closeable {
    @Override
    public void close(){
        System.out.println("Closed 2");
    }
}
