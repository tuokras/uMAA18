
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
public class Lauma implements Siirrettava {
    
    private ArrayList<Siirrettava> eliot;
    
    public Lauma() {
        this.eliot = new ArrayList<>();
    }
    
    public String toString() {
        String palautus = "";
        for (Siirrettava elio : eliot) {
            palautus += "\n" + elio;
        }
        return palautus;
    }
    
    public void lisaaLaumaan(Siirrettava siirrettava) {
        eliot.add(siirrettava);
    }
    
    @Override
    public void siirra(int dx, int dy) {
        for (Siirrettava elio : eliot) {
            elio.siirra(dx, dy);
        }
    }
}