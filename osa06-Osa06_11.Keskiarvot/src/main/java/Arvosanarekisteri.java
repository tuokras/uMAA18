
import java.util.ArrayList;

public class Arvosanarekisteri {

    private ArrayList<Integer> arvosanat;
    private ArrayList<Integer> pisteet;

    public Arvosanarekisteri() {
        this.arvosanat = new ArrayList<>();
        this.pisteet = new ArrayList<>();
    }

    public void lisaaArvosanaPisteidenPerusteella(int pisteet) {
        this.arvosanat.add(pisteetArvosanaksi(pisteet));
        this.pisteet.add(pisteet);
    }

    public int montakoSaanutArvosanan(int arvosana) {
        int lkm = 0;
        for (int saatu : this.arvosanat) {
            if (saatu == arvosana) {
                lkm++;
            }
        }

        return lkm;
    }

    public static int pisteetArvosanaksi(int pisteet) {

        int arvosana = 0;
        if (pisteet < 50) {
            arvosana = 0;
        } else if (pisteet < 60) {
            arvosana = 1;
        } else if (pisteet < 70) {
            arvosana = 2;
        } else if (pisteet < 80) {
            arvosana = 3;
        } else if (pisteet < 90) {
            arvosana = 4;
        } else {
            arvosana = 5;
        }

        return arvosana;
    }

    public double arvosanojenKeskiarvo() {
        int summa = 0;
        double keskiarvo = 0;

        if (!arvosanat.isEmpty()) {
            for (Integer arvosana : arvosanat) {
                summa += arvosana;
            }
            keskiarvo = 1.0 * summa / arvosanat.size();
            return keskiarvo;
        }
        return -1;
    }

    public double koepisteidenKeskiarvo() {
        int summa = 0;
        double keskiarvo = 0;

        if (!pisteet.isEmpty()) {
            for (Integer piste : pisteet) {
                summa += piste;
            }
            keskiarvo = 1.0 * summa / pisteet.size();
            return keskiarvo;
        }

        return -1;
    }

}
