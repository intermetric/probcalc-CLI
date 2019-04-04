import java.util.Scanner;

public class BernoulliJaotus implements Arvutatav {

    private double p;

    //Setter:
    public void setP(double p) {

        this.p = p;
    }

    //Parameetriteta konstruktor:
    public BernoulliJaotus() {

        this.p = 0.0;
    }

    //Väljastame kasutajale näite tema sisestuse põhjal:
    @Override
    public void näide() {
        setP(Math.random());
        double keskväärtus = p;
        double dispersioon = p * (1 - p);
        double standardhälve = Math.sqrt(dispersioon);

        System.out.println("Näide:\nKui juhuslik suurus X on Bernoulli jaotusega parameetriga p=" +
                Math.round(p * 100.0) / 100.0 + ", siis on keskväärtus " +
                Math.round(keskväärtus * 100.0) / 100.0 + ", dispersioon " + Math.round(dispersioon * 100.0) / 100.0 +
                " ja standardhälve " + Math.round(standardhälve * 100.0) / 100.0 + ".\n");
    }

    //Küsime kasutajalt vajalikud andmed ja väljastame soovitud tulemuse:
    @Override
    public void arvuta() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sisesta p (vaadeldava sündmuse toimumise tõenäosus, mis on igal katsel sama)");
        setP(scan.nextDouble());

        double keskväärtus = p;
        double dispersioon = p * (1 - p);
        double standardhälve = Math.sqrt(dispersioon);

        System.out.println("Bernoulli jaotuse kohaselt on keskväärtus " + Math.round(keskväärtus * 100.0) / 100.0
                + ", dispersioon " + Math.round(dispersioon * 100.0) / 100.0 + " ja standardhälve "
                + Math.round(standardhälve * 100.0) / 100.0 + ".\n");
    }
}