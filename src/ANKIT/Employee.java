//package ANKIT;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Setter
//@Getter
//@Builder
//@AllArgsConstructor
//
//public class Employee {
//    private String name;
//    private String id;
//    private int age;
//    private double salary;
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "id='" + id + '\'' +
//                '}';
//    }
//
//    public static void main(String[] args) {
//        List list = new ArrayList();
//
//        Employee e1 = new Employee("s1", "123", 24, 22000);
//        Employee e2 = new Employee("s2", "234", 42, 29000);
//        Employee e3 = new Employee("s3", "345", 33, 33000);
//        Employee e4 = new Employee("s4", "456", 27, 67000);
//        Employee e5 = new Employee("s5", "567", 26, 19000);
//        Employee e6 = new Employee("s6", "678", 40, 37000);
//        Employee e7 = new Employee("s7", "789", 30, 50000);
//        Employee e8 = new Employee("s8", "890", 23, 30000);
//        list.add(e1);
//        list.add(e2);
//        list.add(e3);
//        list.add(e4);
//        list.add(e5);
//        list.add(e6);
//        list.add(e7);
//        list.add(e8);
//        List filterlist = new ArrayList();
//        for (Object e : list) {
//            Employee ee = (Employee) e;
//            if (filterbysalary(ee)) {
//                filterlist.add(ee);
//            }
//
//        }
//
//    }
//
//    public static boolean filterbysalary(Employee e) {
//        if (e.getSalary() > 200000) {
//            return true;
//        }
//        return false;
//    }
//}
//
//
//
