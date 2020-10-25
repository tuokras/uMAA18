/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rasmus
 */
import java.util.ArrayList;

public class Pakkaus {

    private ArrayList<Lahja> lahjat = new ArrayList<>();

    public Pakkaus() {

    }

    public void lisaaLahja(Lahja lahja) {
        lahjat.add(lahja);
    }

    public int yhteispaino() {
        int yhteispaino = 0;
        for (Lahja lahja : lahjat) {
            yhteispaino += lahja.getPaino();
        }
        return yhteispaino;
    }
}
