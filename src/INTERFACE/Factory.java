package INTERFACE;

public class Factory {
    static final String type="MySQL";
    public static BaseDAO getobj(){
        if ("MySQL".equals(type)){
           return new StudentDAO();
        } else if ("NoSQL".equals(type)) {
            return new nosqlStudentDAO();

        }

        return null;
    }
}
