package InternalExceptionHandling.ourflow;

public class Bootstrap {
    MyUncaughtExceptionhandler custom=null;
    MyUncaughtExceptionhandler myUncaughtExceptionhandler=new MyUncaughtExceptionHandlerImple();
    public interface MyUncaughtExceptionhandler{
        public abstract void myUncaughtException(Throwable t);
    }

    public  void start(Throwable th)
    {
     DisplayException(th);
    }


    private void DisplayException(Throwable th){
        if(custom!=null){
            custom.myUncaughtException(th);
        }
        else{
            myUncaughtExceptionhandler.myUncaughtException(th);
        }
    }

    public  void setCustom(MyUncaughtExceptionhandler custom) {
        this.custom = custom;
    }
}
