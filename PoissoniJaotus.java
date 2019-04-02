import java.util.Scanner;

public class PoissoniJaotus implements Arvutatav {

    private double lambda;

    public void setLambda(double lambda) {
        this.lambda = lambda;
    }

    public PoissoniJaotus() {
        this.lambda = 0;
    }

    @Override
    public void näide(){
        setLambda(Math.round(3 + Math.random() * 12));
        double keskväärtus;
        double dispersioon;
        keskväärtus = dispersioon = lambda;
        double standardhälve = Math.sqrt(dispersioon);

        System.out.println("Näide\nKui juhuslik suurus X on Poissoni jaotusega parameetriga lambda=" + lambda +
                "siis on keskväärtus " + Math.round(keskväärtus*100)/100.0 + ", dispersioon " + Math.round(dispersioon*100)/100.0 +
                " ja standardhälve " + Math.round(dispersioon*100)/100.0 + ".");
    }

    @Override
    public void arvuta() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sisesta lambda (Poissoni jaotuse parameeter)");
        setLambda(scan.nextDouble());

        double keskväärtus;
        double dispersioon;

        keskväärtus = dispersioon = lambda;

        double standardhälve = Math.sqrt(dispersioon);

        System.out.println("Poissoni jaotuse kohaselt on keskväärtus " + keskväärtus + ", dispersioon " +
                dispersioon + " ja standardhälve " + standardhälve + ".");
    }
}