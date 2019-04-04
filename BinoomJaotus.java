import java.util.Scanner;

public class BinoomJaotus implements Arvutatav {

    private int n;
    private double p;

    //Setterid:
    public void setN(int n) {
        this.n = n;
    }

    public void setP(double p) {
        this.p = p;
    }

    //Parameetriteta konstruktor:
    public BinoomJaotus() {
        this.n = 0;
        this.p = 0.0;
    }

    //Väljastame kasutajale näite tema sisestuse põhjal:
    @Override
    public void näide() {
        setP(Math.random());
        setN((int) Math.round(3 + Math.random() * 12));
        double keskväärtus = n * p;
        double dispersioon = (n * p) * (1 - p);
        double standardhälve = Math.sqrt(dispersioon);

        System.out.println("Näide:\nKui juhuslik suurus X on binoomjaotusega parameetritega p=" +
                Math.round(p * 100.0)/100.0 + " ja n=" + n + ", siis on keskväärtus "
                + Math.round(keskväärtus * 100.0) / 100.0 +
                ", dispersioon " + Math.round(dispersioon * 100.0) / 100.0 + " ja standardhälve "
                + Math.round(standardhälve* 100.0) / 100.0 + ".\n");
    }

    //Küsime kasutajalt vajalikud andmed ja väljastame soovitud tulemuse:
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

        System.out.println("Binoomjaotuse kohaselt on keskväärtus " + Math.round(keskväärtus * 100.0) / 100.0
                + ", dispersioon " + Math.round(dispersioon * 100.0) / 100.0 + " ja standardhälve " +
                Math.round(standardhälve * 100.0) / 100.0 + ".\n");

    }
}