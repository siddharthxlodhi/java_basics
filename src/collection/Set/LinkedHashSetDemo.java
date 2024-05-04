package collection.Set;

import collection.List.Arraylist.Employee;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        Employee e1 = new Employee("n1", 18, "10000", 5000.00);
        Employee e2 = new Employee("n2", 18, "10000", 61000.00);
        Employee e3 = new Employee("n3", 20, "12300", 51000.00);
        Employee e4 = new Employee("n4", 21, "12340", 76000.00);

        List<Employee> l1 = new ArrayList<>();
        l1.add(e1);
        l1.add(e2);
        l1.add(e3);
        l1.add(e4);

        Set<Employee> s1=new LinkedHashSet<>(l1);
        System.out.println(s1);
    }
}
