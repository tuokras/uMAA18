
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rasmus
 */
public class Arvosanatilastot {

    public ArrayList<Integer> pisteet;
    public ArrayList<Integer> arvosanat;

    public Arvosanatilastot() {
        this.pisteet = new ArrayList<>();
        this.arvosanat = new ArrayList<>();
    }

    public void lisaa(int piste) {
        if (piste >= 0 && piste <= 100) {
            pisteet.add(piste);
            arvosanat.add(pisteetArvosanaksi(piste));
        }

    }

    public double pisteidenKeskiarvo() {
        int yht = 0;
        for (Integer piste : pisteet) {
            yht += piste;
        }
        return 1.0 * yht / pisteet.size();
    }

    public double hyvaksyttyjenKeskiarvo() {
        int yht = 0;
        int lkm = 0;
        for (Integer piste : pisteet) {
            if (piste >= 50) {
                yht += piste;
                lkm++;
            }
        }
        if (lkm > 0) {
            return 1.0 * yht / lkm;
        }
        return -1;
    }

    public double hyvaksyttyjenProsenttiosuus() {
        int lkm = 0;
        for (Integer piste : pisteet) {
            if (piste >= 50) {
                lkm++;
            }
        }
        return 100.0 * lkm / pisteet.size();
    }

    public int arvosanojenLkm(int arvosana) {
        int lkm = 0;
        for (Integer saatu : arvosanat) {
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

}
