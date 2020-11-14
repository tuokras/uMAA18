
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rasmus
 */
public class Velkakirja {
    
    private HashMap<String, Double> velkakirja;
    
    public Velkakirja() {
        this.velkakirja = new HashMap<>();
    }
    
    public void asetaLaina(String kenelle, double maara) {
        velkakirja.put(kenelle, maara);
    }
    
    public double paljonkoVelkaa(String kuka) {
        return velkakirja.getOrDefault(kuka, 0.0);
    }
}
