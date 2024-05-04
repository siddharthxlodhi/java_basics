package Exceptionhandling.wrapping;
import Exceptionhandling.myexceptions.InvalidNumberException;
import Exceptionhandling.myexceptions.ServerNotFoundException;
import java.util.regex.Pattern;

public class Message {

    static int checkserver=0;
    public static void sendMessage(String mobileNo,String msg){
        try {
           msg(mobileNo,msg);
        }catch (InvalidNumberException invalidNumberException){
            throw new RuntimeException(invalidNumberException);
        }catch (ServerNotFoundException serverException){
         retry(mobileNo,msg);
         throw serverException;
        }

    }
    public static void msg(String mobileNo,String msg) {
        boolean isServer = true;
        boolean isValid = mobileNumberVaildation(mobileNo);
            if (!isValid) {
                throw new InvalidNumberException("Invalid mobile no:" + mobileNo);
            } else if (!isServer) {
                checkserver++;
                System.out.println("Message try"+checkserver);
                throw new ServerNotFoundException("Server not found");
            } else {
                System.out.println("Message send successfully to:" + mobileNo);
                System.out.println("@" + msg);
            }
        }
    public static boolean mobileNumberVaildation(String mob){
        boolean isVaild=false;
         final Pattern mobile_number = Pattern.compile("^[1-9][0-9]{9}$");
            if(mobile_number.matcher(mob).matches()){
                isVaild=true;
        }
            return isVaild;
    }

    public static void main(String[] args) {
        try {
            sendMessage("7880291840","hello");
        }catch(RuntimeException runtimeException){
            System.out.println(runtimeException.getCause().getMessage());
        }
    }
    public static void retry(String mob,String msg) {
      while (checkserver<=3){
          sendMessage(mob,msg);
       }
   }
}
