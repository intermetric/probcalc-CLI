import java.util.Scanner;

public class PoissoniJaotus implements Arvutatav {

    @Override
    public void arvuta() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sisesta p - siinkohal lambda (vaadeldava sündmuse toimumise tõenäosus, " +
                "mis on igal katsel sama)");
        double l = scan.nextDouble();

        double keskväärtus;
        double dispersioon;

        keskväärtus = dispersioon = l;

        double standardhälve = Math.sqrt(dispersioon);

        System.out.println("Poissoni jaotuse kohaselt on keskväärtus " + keskväärtus + ", dispersioon " +
                dispersioon + " ja standardhälve " + standardhälve + ".");
    }
}