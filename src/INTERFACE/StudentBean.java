package INTERFACE;

import lombok.Getter;

import java.util.Scanner;
@Getter

public class StudentBean   {

    private String rollno;
    private int id;
    private String branch;
    private String name;

    public void setName(String name) {
        if (name!=null && !name.isEmpty()) {
            this.name = name;
        }else {
            throw new IllegalArgumentException("Invalid Name");
        }
    }

    public void setRollno(String rollno) {
        if (rollno != null && !rollno.isEmpty()) {
            this.rollno = rollno;
        } else {
throw new IllegalArgumentException("Invalid Rollno");
        }
    }

    public void setBranch(String branch) {
        if (branch != null && !branch.isEmpty()) {
            this.branch = branch;
        }else {
            throw new IllegalArgumentException("Invalid branch");
        }
    }

    public void setId(String id) {
        if(id != null && !id.isEmpty()) {
            try {
                this.id = Integer.parseInt(id);
            }catch (NumberFormatException numberFormatException){
                throw new IllegalArgumentException("Invalid ID");

            }
        }
    }

    public void setAll(){

        try(Scanner sc=new Scanner(System.in)){
            setId("1");
            setName("Sid");
            setBranch("it");
            setRollno("123f");
        } catch (IllegalArgumentException illegalArgumentException) {
          throw new RuntimeException("Illegal",illegalArgumentException);

        }
    }

    public int getId() {
        return 0;
    }

    public String getName() {
        return null;
    }

    public String getBranch() {
        return null;
    }

    public String getRollno() {
        return null;
    }
}


