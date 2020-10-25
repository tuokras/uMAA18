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

public class Pakka {
    
    private ArrayList<String> pakka;
    
    public Pakka() {
        this.pakka = new ArrayList<>();
    }
    
    public boolean onTyhja() {
        return pakka.isEmpty();
    }
    
    public void lisaa(String arvo) {
        pakka.add(arvo);
    }
    
    public ArrayList<String> arvot() {
        return pakka;
    }
    
    public String ota() {
        String viimeinen = pakka.get(pakka.size() - 1);
        pakka.remove(pakka.size() - 1);
        return viimeinen;
        
    }
    
}

