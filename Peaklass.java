import java.util.Scanner;

public class Peaklass {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Kui soovid kasutada Bernoulli valemit - sisesta '1' \n                   " +
                " Multinoomvalemit - sisesta '2' \n                    Hüpergeomeetrilist valemit - sisesta '3' " +
                " \n                    Bernoulli jaotust - sisesta '4' \n                    " +
                "Binoomjaotust - sisesta '5' \n                    Geomeetrilist jaotust - sisesta '6' \n " +
                "                   Poissoni jaotust - sisesta '7'.");
        int sisestus = scan.nextInt();

    }
}
