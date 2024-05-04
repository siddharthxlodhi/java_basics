package InternalExceptionHandling.ourflow;


public class Main {
    static Bootstrap bootstrap=new Bootstrap();

    public static void main(String[] args) {

        try {
            Integer.parseInt("m1");
        }catch (Throwable th)
        {
            bootstrap.start(th);
        }

    }


}
