import java.util.Scanner;

public class BernoulliValem implements Arvutatav {

    private int k;
    private int n;
    private double p;

    //Setterid:
    public void setK(int k) {

        this.k = k;
    }

    public void setN(int n) {

        this.n = n;
    }

    public void setP(double p) {

        this.p = p;
    }

    //Parameetriteta konstruktor:
    public BernoulliValem() {
        this.k = 0;
        this.n = 0;
        this.p = 0.0;
    }

    //Kombinatsioonide valem:
    static long kombinatsioonid(int k, int n) {
        long lugeja = 1L;
        long nimetaja = 1L;
        if (k > n - k) {
            for (int i = k + 1; i < n + 1; i++) {
                lugeja *= i;
            }
            for (int i = 1; i < n - k + 1; i++) {
                nimetaja *= i;
            }
        } else {
            for (int i = n - k + 1; i < n + 1; i++) {
                lugeja *= i;
            }
            for (int i = 1; i < k + 1; i++) {
                nimetaja *= i;
            }
        }
        return lugeja / nimetaja;
    }

    //Väljastame kasutajale näite tema sisestuse põhjal:
    @Override
    public void näide() {
        setP(Math.random());
        setN((int) Math.round(3 + Math.random() * 12));
        setK((int) Math.round(Math.random() * n));
        double tõenäosus = kombinatsioonid(k, n) * Math.pow(p, k) * Math.pow((1 - p), (n - k));

        System.out.println("Näide:\nKui toimub n=" + n + " katset, kus mingi sündmuse toimumise tõenäosus igal katsel " +
                "on p=" + Math.round(p * 100.0) / 100.0 + ", siis tõenäosus, et sündmus toimub täpselt k=" +
                k + " katsel, on P=" + Math.round(tõenäosus * 100.0) / 100.0 + "." + "\n");
    }

    //Küsime kasutajalt vajalikud andmed ja väljastame soovitud tulemuse:
    @Override
    public void arvuta() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sisesta p (vaadeldava sündmuse toimumise tõenäosus, mis on igal katsel sama)");
        setP(scan.nextDouble());
        System.out.println("Sisesta n (kõikide katsete koguarv)");
        setN(scan.nextInt());
        System.out.println("Sisesta k (see arv, mitmel korral sündmus toimub)");
        setK(scan.nextInt());
        double tõenäosus = kombinatsioonid(k, n) * Math.pow(p, k) * Math.pow((1 - p), (n - k));
        System.out.println("Igal katsel tõenäosusega " + p + " toimuva sündmuse puhul tõenäosus, et " + n + "-st katsest" +
                " toimub sündmus " + k + " katsel, on: " + Math.round(tõenäosus * 1000.0) / 1000.0 + "." + "\n");
    }

}
