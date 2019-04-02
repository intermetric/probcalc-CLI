import java.util.Scanner;

public class GeomeetrilineJaotus implements Arvutatav {

    private double p;

    public void setP(double p) {
        this.p = p;
    }

    public GeomeetrilineJaotus() {
        this.p = 0.0;
    }

    public void näide() {
        setP(Math.random());
        double keskväärtus = 1 / p;
        double dispersioon = (1 - p) / (p * p);
        double standardhälve = Math.sqrt(dispersioon);

        System.out.println("Näide:\nKui juhuslik suurus X on geomeetrilise jaotusega parameetriga p=" + Math.round(p*100)/100.0 + "siis on keskväärtus " +
                Math.round(keskväärtus*100)/100.0 + ", dispersioon " + Math.round(dispersioon*100)/100.0 +
                " ja standardhälve " + Math.round(dispersioon*100)/100.0 + ".");
    }

    @Override
    public void arvuta() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sisesta p (vaadeldava sündmuse toimumise tõenäosus, mis on igal katsel sama)");
        setP(scan.nextDouble());

        double keskväärtus = 1 / p;
        double dispersioon = (1 - p) / (p * p);
        double standardhälve = Math.sqrt(dispersioon);

        System.out.println("Geomeetrilise jaotuse kohaselt on keskväärtus " + Math.round(keskväärtus*100)/100.0 + ", dispersioon " +
                Math.round(dispersioon*100)/100.0 + " ja standardhälve " + Math.round(standardhälve*100)/100.0 + ".");
    }
}