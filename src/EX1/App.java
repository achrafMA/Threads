package EX1;

public class App extends Thread{

    public static void main(String[] args) {
        //ClasseTalkative CT1=new ClasseTalkative(100);
        //CT1.run();

        ClasseTalkative CT1 =new ClasseTalkative(10);
        ClasseTalkative CT2 =new ClasseTalkative(11);
        ClasseTalkative CT3=new ClasseTalkative(12);
        ClasseTalkative CT4 =new ClasseTalkative(13);
        ClasseTalkative CT5 =new ClasseTalkative(14);
        ClasseTalkative CT6 =new ClasseTalkative(15);
        ClasseTalkative CT7 =new ClasseTalkative(16);
        ClasseTalkative CT8 =new ClasseTalkative(17);
        ClasseTalkative CT9 =new ClasseTalkative(18);
        ClasseTalkative CT10 =new ClasseTalkative(19);

        Thread thread1=new Thread(CT1);
        Thread thread2=new Thread(CT2);
        Thread thread3=new Thread(CT3);
        Thread thread4=new Thread(CT4);
        Thread thread5=new Thread(CT5);
        Thread thread6=new Thread(CT6);
        Thread thread7=new Thread(CT7);
        Thread thread8=new Thread(CT8);
        Thread thread9=new Thread(CT9);
        Thread thread10=new Thread(CT10);


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();

    }
}
