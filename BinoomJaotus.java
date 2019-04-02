import java.util.Scanner;

public class BinoomJaotus implements Arvutatav {

    private int n;
    private double p;

    public void setN(int n) {
        this.n = n;
    }

    public void setP(double p) {
        this.p = p;
    }

    @Override
    public void arvuta() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sisesta p (vaadeldava sündmuse toimumise tõenäosus, mis on igal katsel sama)");
        setP(scan.nextDouble());
        System.out.println("Sisesta n (kõikide katsete koguarv)");
        setN(scan.nextInt());

        double keskväärtus = n * p;
        double dispersioon = (n * p) * (1 - p);
        double standardhälve = Math.sqrt(dispersioon);

        System.out.println("Binoomjaotuse kohaselt on keskväärtus " + keskväärtus + ", dispersioon " +
                dispersioon + " ja standardhälve " + standardhälve + ".");

    }
}