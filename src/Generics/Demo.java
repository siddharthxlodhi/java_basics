package Generics;

import INTERFACE.Connection;
import INTERFACE.MysqlConnection;
import INTERFACE.Nosql;
import collection.List.Arraylist.Employee;

import java.util.HashMap;
import java.util.Optional;

public class Demo <K extends Connection,V extends Employee>{
    public V add(K k,V v)
    {
        HashMap<K,V> hashMap=new HashMap<K,V>();
        hashMap.put(k,v);
        return v;

    }

    public static void main(String[] args) {
        Demo<MysqlConnection,Employee> demo=new Demo<>();
        demo.add(new MysqlConnection(),new Employee("sid",1,"12",100));
    }
}
