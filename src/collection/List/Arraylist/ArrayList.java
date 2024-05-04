package collection.List.Arraylist;
import java.util.Iterator;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
//        Collection collection=new java.util.ArrayList(20);
//        System.out.println(collection);
        List<Object> list1=new java.util.ArrayList<>(20);
        list1.add(10);
        list1.add(20);
        list1.add(30);
        System.out.println(list1);
        list1.add(2,50);
        System.out.println(list1);
        boolean b=list1.contains(0);
        System.out.println(b);
        System.out.println(list1.get(2));
        System.out.println(list1.indexOf(20));
        System.out.println(list1.size());
        Object[] ar=list1.toArray();
        for (int i=0;i<=3;i++){
            System.out.println(ar[i]);
        }
        Iterator it=list1.listIterator();
        System.out.println(it.hasNext());
        System.out.println(it.next());



        List<Object> list2=new java.util.ArrayList<>(20);
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(70);
        list2.retainAll(list1);
        System.out.println(list2);



    }


}
