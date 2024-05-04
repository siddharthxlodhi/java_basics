package collection.Map;

import collection.List.Arraylist.Employee;
import collection.Set.MyEmployeeComparator;

import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee("n1", 18, "10000", 5000.00);
        Employee e2 = new Employee("n2", 18, "10000", 61000.00);
        Employee e3 = new Employee("n3", 20, "12300", 51000.00);
        Employee e4 = new Employee("n4", 21, "12340", 76000.00);


        TreeMap<Employee,String> treeMap=new TreeMap<>(new MyEmployeeComparator());
        treeMap.put(e1,"1");
        treeMap.put(e2,"2");
        treeMap.put(e3,"3");
        treeMap.put(e4,"4");
        System.out.println(treeMap); //Natural sorting

//      treeMap.put(null,"amit"); Leads Null pointer exception
//      System.out.println(treeMap.comparator());





    }
}
