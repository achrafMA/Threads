package EX1;

public class ClasseTalkative implements Runnable{
    private int nb;

    public ClasseTalkative(int nb) {
        this.nb = nb;
    }

    @Override
    public void run() {
        for (int i = 0;i<100;i++){
            System.out.println(nb);
        }
    }
}
