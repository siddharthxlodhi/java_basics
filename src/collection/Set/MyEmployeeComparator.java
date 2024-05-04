package collection.Set;

import collection.List.Arraylist.Employee;

import java.util.Comparator;

public class MyEmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(Integer.parseInt(o1.getId()), Integer.parseInt(o2.getId()));
    }
}
