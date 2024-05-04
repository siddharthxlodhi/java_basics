package ConcurrentCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo {
    public static void main(String[] args) {
//        List<Integer> list=new ArrayList<>(); It leads Concurrent modification exception
        List<Integer> list=new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Runnable t1=()-> {
            for (Integer i:list) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        Runnable t2=()->{
            list.add(7);
            list.add(8);
            list.add(9);
        };
        new Thread(t2).start();
        new Thread(t1).start();


    }
}
