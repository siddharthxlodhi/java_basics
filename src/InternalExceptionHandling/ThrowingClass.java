package InternalExceptionHandling;

public class ThrowingClass {

    public static void m1() throws Throw {
        throw new Throw("wrong");
    }
    public static void main(String[] args) throws Throw {
        Thread currentThread=Thread.currentThread();
        currentThread.setName("sid");

        currentThread.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler()); //implementation 1(class)
        currentThread.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler()   //implementation 2(anonymous class)
        {
            @Override
            public void uncaughtException(Thread thread, Throwable throwable) {
                System.err.println("Exception in thread"+" "+ thread.getName()+" "+throwable.getClass().getName()+" " +throwable.getMessage());
            }
        });
//        currentThread.setUncaughtExceptionHandler((Thread, throwable)-> System.out.println("lambda implementation"));  //implementation 2(anonymous class)
//        try {
//            m1();
//        } catch (Throwable t) {
//            Thread.UncaughtExceptionHandler  ueh=currentThread.getUncaughtExceptionHandler();
//            ueh.uncaughtException(currentThread,t);
//        }
m1();

    }
}
