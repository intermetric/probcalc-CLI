import java.util.Arrays;
import java.util.Scanner;

public class Hüpergeomeetriline implements Arvutatav {

    private int suurN;
    private int m;
    private int väikeN;

    //Setterid:
    public void setSuurN(int suurN) {
        this.suurN = suurN;
    }

    public void setM(int m) {
        this.m = m;
    }

    public void setVäikeN(int väikeN) {
        this.väikeN = väikeN;
    }

    //Parameetriteta konstruktor:
    public Hüpergeomeetriline() {
        this.suurN = 0;
        this.m = 0;
        this.väikeN = 0;
    }

    //Kombinatsioonide valem:
    static long kombinatsioonid(int k, int n) {
        long lugeja = 1L;
        long nimetaja = 1L;
        if (k > n - k) {
            for (int i = k + 1; i < n + 1; i++) {
                lugeja *= i;
            }
            for (int i = 1; i < n - k + 1; i++) {
                nimetaja *= i;
            }
        } else {
            for (int i = n - k + 1; i < n + 1; i++) {
                lugeja *= i;
            }
            for (int i = 1; i < k + 1; i++) {
                nimetaja *= i;
            }
        }
        return lugeja / nimetaja;
    }

    //Väljastame kasutajale näite tema sisestuse põhjal:
    @Override
    public void näide() {
        setM((int) Math.round(2 + Math.random() * 3));
        int[] klassid = new int[m];
        int[] k = new int[m];
        int kSumma = 0;
        int nSumma = 0;
        long lugeja = 1;
        for (int i = 0; i < m; i++) {
            klassid[i] = (int) Math.round(1 + Math.random() * 4);
            k[i] = (int) Math.round(Math.random() * klassid[i]);
            kSumma += k[i];
            nSumma += klassid[i];
            lugeja *= kombinatsioonid(k[i], klassid[i]);
        }
        setSuurN(nSumma);
        setVäikeN(kSumma);
        long nimetaja = kombinatsioonid(väikeN, suurN);
        double tõenäosus = (double) lugeja / (double) nimetaja;
        System.out.println("Näide:\nKui " + suurN + " objekti on jagatud " + m + " klassi järgmiselt:\n" +
                Arrays.toString(klassid) + "," + "\n" +
                "siis " + väikeN + " objekti valimisel on tõenäosus, et klassidest valitakse vastavalt\n"
                + Arrays.toString(k) + "\nobjekti, P=" + Math.round(tõenäosus * 1000.0) / 1000.0 + "." + "\n");
    }

    //Küsime kasutajalt vajalikud andmed ja väljastame soovitud tulemuse:
    @Override
    public void arvuta() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sisesta m (klasside koguarv)");
        setM(scan.nextInt());
        int[] klassid = new int[m];
        int[] k = new int[m];
        int kSumma = 0;
        int nSumma = 0;
        long lugeja = 1;
        for (int i = 0; i < m; i++) {
            System.out.println("Sisesta N(" + (i + 1) + ") ehk mitu objekti vastavasse klassi kuulub");
            klassid[i] = scan.nextInt();
            System.out.println("Sisesta k(" + (i + 1) + ") ehk mitu objekti sellest klassist valitakse");
            k[i] = scan.nextInt();
            kSumma += k[i];
            nSumma += klassid[i];
            lugeja *= kombinatsioonid(k[i], klassid[i]);
        }
        setSuurN(nSumma);
        setVäikeN(kSumma);
        long nimetaja = kombinatsioonid(väikeN, suurN);
        double tõenäosus = (double) lugeja / (double) nimetaja;
        System.out.println("Tõenäosus, et " + suurN + "-st objektist, mis on jaotatud " + m + " klassi järgmiselt:\n"
                + Arrays.toString(klassid) + "\n" +
                väikeN + " objekti valimisel saadakse klassidest vastavalt\n" + Arrays.toString(k) + "\nobjekti, on: "
                + Math.round(tõenäosus * 1000.0) / 1000.0 + "." + "\n");
    }
}