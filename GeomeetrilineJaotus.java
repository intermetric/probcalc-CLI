import java.util.Scanner;

public class GeomeetrilineJaotus implements Arvutatav {

    @Override
    public void arvuta() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sisesta p (vaadeldava sündmuse toimumise tõenäosus, mis on igal katsel sama)");
        double p = scan.nextDouble();

        double keskväärtus = 1 / p;
        double dispersioon = (1 - p) / p * p;
        double standardhälve = Math.sqrt(dispersioon);

        System.out.println("Geomeetrilise jaotuse kohaselt on keskväärtus " + keskväärtus + ", dispersioon " +
                dispersioon + " ja standardhälve " + standardhälve + ".");
    }
}