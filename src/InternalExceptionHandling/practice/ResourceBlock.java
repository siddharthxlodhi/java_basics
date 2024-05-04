package InternalExceptionHandling.practice;

public class ResourceBlock {
    public static void main(String[] args){
        try(myClosable myClosable=new myClosable()) {
            System.out.println("after that");
            throw new Exception();
        }catch (Exception e){
            System.out.println("Catch block executed");
        }
    }
}
