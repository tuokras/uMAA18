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

public class Matkalaukku {

    private int maksimipaino;
    private ArrayList<Tavara> tavarat;

    public Matkalaukku(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.tavarat = new ArrayList<>();
    }

    public void lisaaTavara(Tavara tavara) {
        if (tavara.getPaino() <= maksimipaino - yhteispaino()) {
            tavarat.add(tavara);
        }
    }

    public void tulostaTavarat() {
        for (Tavara tavara : tavarat) {
            System.out.println(tavara);
        }
    }

    public int yhteispaino() {
        int yhteispaino = 0;

        for (Tavara tavara : tavarat) {
            yhteispaino += tavara.getPaino();
        }

        return yhteispaino;
    }

    public Tavara raskainTavara() {
        if (tavarat.isEmpty()) {
            return null;
        }

        Tavara raskain = tavarat.get(0);
        
        for (Tavara tavara : tavarat) {
            if (tavara.getPaino() > raskain.getPaino()) {
                raskain = tavara;
            }
        }
        return raskain;
    }

    public String toString() {

        if (tavarat.isEmpty()) {
            return "ei tavaroita (" + this.yhteispaino() + " kg)";
        }

        if (tavarat.size() == 1) {
            return "1 tavara (" + this.yhteispaino() + " kg)";
        }

        return tavarat.size() + " tavaraa (" + this.yhteispaino() + " kg)";
    }
}
