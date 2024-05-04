package INTERFACE;

import java.sql.SQLException;

public class StudentController{
    public static void main(String[] args){
        StudentBean sb=new StudentBean();
        try {
            sb.setAll();
        }catch (RuntimeException runtimeException){
            System.out.println(runtimeException.getCause());
        }
        StudentDAO studentDAO=new StudentDAO();

        try {
            studentDAO.save(sb);
        }catch (SQLException sqlException) {
            System.out.println("error saving");
        }






    }
}
