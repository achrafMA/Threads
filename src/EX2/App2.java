package EX2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App2 {
    public static void main(String[] args) {
        int[] tab= {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        /*int[] tab2= {0, 1, 2, 3, 4, 5};
        int[] tab3= {6, 7, 8, 9, 10, 11, 12};
        int[] tab4= {13, 14, 15, 16, 17, 18};*/

        Sommeur task=new Sommeur(tab,0,18);
        Sommeur task1=new Sommeur(tab,0,5);
        Sommeur task2=new Sommeur(tab,6,12);
        Sommeur task3=new Sommeur(tab,13,18);

        Thread t1=new Thread(task);
        Thread t2=new Thread(task1);
        Thread t3=new Thread(task2);
        Thread t4=new Thread(task3);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
       // ExecutorService service= Executors.
    }
}
