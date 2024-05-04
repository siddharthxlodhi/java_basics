package collection.List.Vector;

import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        List<Integer> l1=new Vector<>();
        l1.add(1);
        l1.add(3);
        l1.add(2);
        Collections.sort(l1);
        Iterator<Integer> itr= l1.iterator();
//        while (itr.hasNext()) {
//            itr.next();
//            l1.add(50); //ConcurrentModificationException(Fail Fast)
//        }
        l1.forEach( (element) -> {
            System.out.println( element );
        });
       Vector<Integer> v=new Vector<>();
       v.add(10);
       v.add(20);
       v.add(30);
        Enumeration<Integer> e=v.elements();
        while (e.hasMoreElements()) {
                Integer i=e.nextElement();
            System.out.println(i);
            if (i==20){
                v.add(21); //Fail safe
            }
        }


    }
}
