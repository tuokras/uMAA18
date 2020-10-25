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

public class Lastiruuma {

    private int maksimipaino;
    private ArrayList<Matkalaukku> matkalaukut;

    public Lastiruuma(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.matkalaukut = new ArrayList<>();
    }

    public void lisaaMatkalaukku(Matkalaukku laukku) {
        if (laukku.yhteispaino() <= maksimipaino - yhteispaino()) {
            matkalaukut.add(laukku);
        }
    }

    public int yhteispaino() {
        int yhteispaino = 0;

        for (Matkalaukku matkalaukku : matkalaukut) {
            yhteispaino += matkalaukku.yhteispaino();
        }

        return yhteispaino;
    }

    public void tulostaTavarat() {
        for (Matkalaukku matkalaukku : matkalaukut) {
            matkalaukku.tulostaTavarat();
        }
    }

    public String toString() {
        return matkalaukut.size() + " matkalaukkua (" + this.yhteispaino() + " kg)";
    }
}
