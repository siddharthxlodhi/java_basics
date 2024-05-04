package collection.List.Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Arraylist1 {
    public static void main(String[] args) {
      List<Object> list=new ArrayList<>();
      list.add(10);
      list.add(20);
      list.add(30);
        System.out.println( list.size());
        System.out.println(list.contains(30));
        System.out.println(list.get(2));
        Object[] ar=list.toArray();
        System.out.println(ar[1]);
        System.out.println(list.indexOf(10));
        List<Object> list1 =new ArrayList();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        System.out.println(list1.retainAll(list));
        System.out.println(list1);
        ListIterator it=list.listIterator();
        it.next();
        //it.next();
        it.next();
      System.out.println(it.previous());
        //it.remove();
        System.out.println(list);
        List list2=list1;
        System.out.println(list1.equals(list));
       List list3= list.subList(0,1);
      System.out.println(list3);
      it.set(50);
      System.out.println(list);


    }
}
