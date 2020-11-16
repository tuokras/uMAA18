
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rasmus
 */
public class Varasto {

    private Map<String, Integer> varastosaldo = new HashMap<>();
    private Map<String, Integer> hinnasto = new HashMap<>();
    
    public void lisaaTuote(String tuote, int hinta, int saldo) {
        varastosaldo.put(tuote, saldo);
        hinnasto.put(tuote, hinta);
    }
    
    public int hinta(String tuote) {
        if (varastosaldo.get(tuote) != null) {
            return hinnasto.get(tuote);
        }
        return -99;
    }
    
    public int saldo(String tuote) {
        if (varastosaldo.get(tuote) != null) {
            return varastosaldo.get(tuote);
        }
        return 0;
    }
    
    public boolean ota(String tuote) {
        if (varastosaldo.getOrDefault(tuote, 0) > 0) {
            varastosaldo.put(tuote, varastosaldo.get(tuote) - 1);
            return true;
        }
        return false;
    }
    
    public Set<String> tuotteet() {
        return varastosaldo.keySet();
    }
}
