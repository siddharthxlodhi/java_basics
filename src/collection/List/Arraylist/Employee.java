package collection.List.Arraylist;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Getter
@Setter
@AllArgsConstructor
@Builder

public class Employee implements Comparable<Employee>, Serializable {

    private String name;
   transient private int age;
    private String id;
    private double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                '}';
    }

    //    @Override
//    public boolean equals(Object object) {
//        if (object==this) {
//            return true;
//        }
//
//      if(!(object instanceof Employee)){
//          return false;
//      }
//      if(this.id.equals(((Employee) object).id)){
//          return true;
//      }
//        return false;
//    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Employee employee = (Employee) object;
        return Objects.equals(id, employee.id)&&Objects.equals(age,employee.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("n1", 18, "10000", 5000.00);
        Employee e2 = new Employee("n2", 18, "10000", 61000.00);
        Employee e3 = new Employee("n3", 20, "12300", 51000.00);
        Employee e4 = new Employee("n4", 21, "12340", 76000.00);
       Employee e5=new EmployeeBuilder().name("n5").age(22).id("12345").build();
        System.out.println(e1.equals(e2));

        List<Employee> l1 = new ArrayList<>();
        l1.add(e1);
        l1.add(e2);
        l1.add(e3);
        l1.add(e4);
        l1.add(e5);
        System.out.println(l1);
        List<Employee> filteredList=new ArrayList<>(l1.size());
        for (Employee e:l1){
            if(e.getSalary()>20000){
                filteredList.add(e);
            }
        }
        List<String> idList=new ArrayList<>(filteredList.size());
        for (Employee e:filteredList){
          idList.add(mapById(e));
        }
        System.out.println(idList);
    }

    public static boolean filterBySalary(Employee employee) {
        return employee.getSalary() > 20000.00;
    }


    public static String mapById(Employee employee) {
     return employee.getId();

    }

@Override
 public int compareTo(Employee o) {
     return Integer.compare(Integer.parseInt(this.getId()), Integer.parseInt(o.getId()));
   }
}
