import java.util.Scanner;

public class Peaklass {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sisestus = 0;
        while (sisestus != 8) {
            System.out.println("Kui soovid kasutada Bernoulli valemit - sisesta '1' \n                   " +
                    " Multinoomvalemit - sisesta '2' \n                    Hüpergeomeetrilist valemit - sisesta '3' " +
                    " \n                    Bernoulli jaotust - sisesta '4' \n                    " +
                    "Binoomjaotust - sisesta '5' \n                    Geomeetrilist jaotust - sisesta '6' \n " +
                    "                   Poissoni jaotust - sisesta '7'.\n                    Väljumiseks sisesta '8'.");

            sisestus = scan.nextInt();
            if (sisestus == 1) {
                Arvutatav arvutaja = new BernoulliValem();
                arvutaja.näide();
                arvutaja.arvuta();
            }
            else if (sisestus == 2) {
                Arvutatav arvutaja = new Multinoom();
                arvutaja.näide();
                arvutaja.arvuta();
            }
            else if (sisestus == 3) {
                Arvutatav arvutaja = new Hüpergeomeetriline();
                arvutaja.näide();
                arvutaja.arvuta();
            }
            else if (sisestus == 4) {
                Arvutatav arvutaja = new BernoulliJaotus();
                arvutaja.näide();
                arvutaja.arvuta();
            }
            else if (sisestus == 5) {
                Arvutatav arvutaja = new BinoomJaotus();
                arvutaja.näide();
                arvutaja.arvuta();
            }
            else if (sisestus == 6) {
                Arvutatav arvutaja = new GeomeetrilineJaotus();
                arvutaja.näide();
                arvutaja.arvuta();
            }
            else if (sisestus == 7){
                Arvutatav arvutaja = new PoissoniJaotus();
                arvutaja.näide();
                arvutaja.arvuta();
            }
        }
    }
}
