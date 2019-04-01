import java.util.Scanner;

public class BinoomJaotus implements Arvutatav {

    @Override
    public void arvuta() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sisesta p (vaadeldava sündmuse toimumise tõenäosus, mis on igal katsel sama)");
        double p = scan.nextDouble();
        System.out.println("Sisesta n (kõikide katsete koguarv)");
        int n = scan.nextInt();

        double keskväärtus = n * p;
        double dispersioon = (n * p) * (1 - p);
        double standardhälve = Math.sqrt(dispersioon);

        System.out.println("Binoomjaotuse kohaselt on keskväärtus " + keskväärtus + ", dispersioon " +
                dispersioon + " ja standardhälve " + standardhälve + ".");

    }
}