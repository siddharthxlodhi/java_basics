package collection.List.LinkedLIst;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.size());
        System.out.println(list.contains(20));
        List<Integer> list1 = new LinkedList<>(list);
        System.out.println(list1);
        Iterator<Integer> itr = list.iterator();
//        while (itr.hasNext()) {
//            itr.next();
//            list.add(50); //ConcurrentModificationException
//        }
    }
}
