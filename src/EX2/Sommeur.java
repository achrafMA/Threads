package EX2;

public class Sommeur implements Runnable{
    private int[] tab;
    private int debut;
    private int fin;
    int sum=0;

    public  int getSomme(int[] tab,int debut,int fin){

        for (int i=debut;i<fin+1;i++){
            sum+=tab[i];
        }
        System.out.println(sum);
        return sum;
    }
    @Override
    public void run() {

    }
    public Sommeur(int[] tab, int i, int i1) {
    }

    public Sommeur(int[] tab, int debut, int fin, int somme) {
        this.tab = tab;
        this.debut = debut;
        this.fin = fin;
        this.sum = sum;
    }

    public int[] getTab() {
        return tab;
    }

    public void setTab(int[] tab) {
        this.tab = tab;
    }

    public int getDebut() {
        return debut;
    }

    public void setDebut(int debut) {
        this.debut = debut;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int somme) {
        this.sum = sum;
    }

}
