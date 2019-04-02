import java.util.Scanner;

public class BernoulliJaotus implements Arvutatav {

    private double p;

    public void setP(double p) {
        this.p = p;
    }

    public BernoulliJaotus() {
        this.p = 0.0;
    }

    @Override
    public void arvuta() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sisesta p (vaadeldava sündmuse toimumise tõenäosus, mis on igal katsel sama)");
        setP(scan.nextDouble());

        double keskväärtus = p;
        double dispersioon = p * (1 - p);
        double standardhälve = Math.sqrt(dispersioon);

        System.out.println("Bernoulli jaotuse kohaselt on keskväärtus " + keskväärtus + ", dispersioon " +
                dispersioon + " ja standardhälve " + standardhälve + ".");
    }
}