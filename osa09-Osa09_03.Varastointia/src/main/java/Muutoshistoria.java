
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
public class Muutoshistoria {
    
    private ArrayList<Double> muutoshistoria;
    
    public Muutoshistoria() {
        this.muutoshistoria = new ArrayList<>();
    }
    
    public void lisaa(double tilanne) {
        muutoshistoria.add(tilanne);
        System.out.println("Metodia lisaa kutsuttu, listan sisältö: " + muutoshistoria.toString());
    }
    
    public void nollaa() {
        muutoshistoria.clear();
    }
    
    @Override
    public String toString() {
        return muutoshistoria.toString();
    }
    
    public double maxArvo() {
        if (muutoshistoria.isEmpty()) {
            return 0;
        }
        double suurin = muutoshistoria.get(0);
        for (Double arvo : muutoshistoria) {
            if (arvo > suurin) {
                suurin = arvo;
            }
        }
        return suurin;
    }
    
    public double minArvo() {
        if (muutoshistoria.isEmpty()) {
            return 0;
        }
        double pienin = muutoshistoria.get(0);
        for (Double arvo : muutoshistoria) {
            if (arvo < pienin) {
                pienin = arvo;
            }
        }
        return pienin;
    }
    
    public double keskiarvo() {
        if (muutoshistoria.isEmpty()) {
            return 0;
        }
        Double summa = 0.0;
        for (Double arvo : muutoshistoria) {
            summa += arvo;
        }
        return summa / muutoshistoria.size();
    }
}
