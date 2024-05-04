package collection.Set;

import collection.List.Arraylist.Employee;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo{
    public static void main(String[] args) {

        Employee e1 = new Employee("n1", 18, "10000", 5000.00);
        Employee e2 = new Employee("n2", 18, "10000", 61000.00);
        Employee e3 = new Employee("n3", 20, "12300", 51000.00);
        Employee e4 = new Employee("n4", 21, "12340", 76000.00);

        TreeSet<Employee> treeSet=new TreeSet<>((o1, o2) ->Integer.compare(Integer.parseInt(o1.getId()), Integer.parseInt(o2.getId())));
        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e4);
        System.out.println(treeSet);

        Iterator<Employee> iterator=treeSet.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
