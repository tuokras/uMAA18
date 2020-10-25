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

public class Huone {
    
    private ArrayList<Henkilo> henkilot = new ArrayList<>();
    
    public Huone() {
        
    }
    
    public void lisaa(Henkilo henkilo) {
        henkilot.add(henkilo);
    }
    
    public boolean onTyhja() {
        return henkilot.isEmpty(); 
    }
    
    public ArrayList<Henkilo> getHenkilot() {
        return henkilot;
    }
    
    public Henkilo lyhin() {
        if (this.onTyhja()) {
            return null;
        }
        Henkilo lyhin = this.henkilot.get(0);
        for (Henkilo hlo: henkilot) {
            if (hlo.getPituus() < lyhin.getPituus()) {
                lyhin = hlo;
            }
        }
        return lyhin;
    }
    
    public Henkilo ota() {
        if (this.onTyhja()) {
            return null;
        }
        Henkilo lyhin = this.lyhin();
        henkilot.remove(lyhin);
        return lyhin;
    }
}
