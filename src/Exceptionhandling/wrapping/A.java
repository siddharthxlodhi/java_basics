package Exceptionhandling.wrapping;

public class A {

   public static void m1(){
       Integer.parseInt("m1");
   }
    public static void m2(){
       m1();
    }
    public static void m3(){
       try {
           m2();
       }catch (NumberFormatException numberFormatException){
           throw new IllegalArgumentException("invalid input",numberFormatException);
       }

    }

    public static void main(String[] args) {
       try{
           m3();
       }catch (RuntimeException runtimeException){
//           runtimeException.getCause().printStackTrace();
           runtimeException.printStackTrace();
       }
    }


}
