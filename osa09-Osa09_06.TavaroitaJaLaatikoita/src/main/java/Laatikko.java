
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
public class Laatikko implements Talletettava {
    
    private double kapasiteetti;
    private ArrayList<Talletettava> tavarat;
    
    public Laatikko(double maksimikapasiteetti) {
        this.kapasiteetti = maksimikapasiteetti;
        this.tavarat = new ArrayList<>();
    }
    
    public void lisaa(Talletettava tavara) {
        if (tavara.paino() <= kapasiteetti) {
            tavarat.add(tavara);
            kapasiteetti -= tavara.paino();
        }
    }
    
    @Override
    public String toString() {
        return "Laatikko: " + tavarat.size() + " esinettä, paino yhteensä " + this.paino() + " kiloa";
    }
    
    public double paino() {
        double paino = 0;
        for (Talletettava tavara : tavarat) {
            paino += tavara.paino();
        }
        return paino;
    }
    
}
