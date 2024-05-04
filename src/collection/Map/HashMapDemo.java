package collection.Map;

import collection.List.Arraylist.Employee;

import java.util.*;
import java.util.stream.Stream;

public class HashMapDemo {
    public static void main(String[] args) {

        Employee e1 = new Employee("n1", 18, "10000", 5000.00);
        Employee e2 = new Employee("n2", 18, "10000", 61000.00);
        Employee e3 = new Employee("n3", 20, "12300", 51000.00);
        Employee e4 = new Employee("n4", 21, "12340", 76000.00);

        Map<Integer, Employee> map=new HashMap<>();
        map.put(1,e1);
        map.put(2,e2);
        map.put(3,e3);
        map.put(4,e4);


//        map.compute(1, (key, value) ->
//                value == null ? null : new Employee("sid",20,"7898",0));
//        System.out.println(map);


        //Iterating methods

        // 1.key iterator
        Iterator<Integer> iterator=map.keySet().iterator();
        while (iterator.hasNext()){
            Integer key=iterator.next();
            System.out.println("key:"+key);
            System.out.println("Value:"+map.get(key));

        }

        //2.Value iterator
        Iterator<Employee> iterator1=map.values().iterator();
        while (iterator1.hasNext()){
           Employee employee=iterator1.next();
            System.out.println(employee);
        }

        //3.Entry Iterator
        Iterator<Map.Entry<Integer, Employee>> iterator2=map.entrySet().iterator();
        while (iterator2.hasNext()){
            Map.Entry<Integer,Employee> employeeEntry=iterator2.next();
            System.out.println(employeeEntry.getKey()+":"+employeeEntry.getValue());
        }

        //4.For each loop(key)
        for (Integer key:map.keySet()){
            System.out.println(key+":"+map.get(key));
        }

        //5.For each Loop(values)
        for(Employee e:map.values()){
            System.out.println(e);

        }

        //6.For each Loop(Entry)
        for(Map.Entry<Integer,Employee> employeeEntry:map.entrySet()){
            System.out.println(employeeEntry.getKey()+":"+employeeEntry.getValue());

        }


        //7.For each method
        map.forEach((key,value)->{
            System.out.println(key);
            System.out.println(value);
        });

        //8.Stream(Java 8)
        Stream<Map.Entry<Integer,Employee>> stream= map.entrySet().stream();
        stream.forEach((employeeEntry)->{
            System.out.println(employeeEntry.getKey()+":"+employeeEntry.getValue());
        });


    }

    }



