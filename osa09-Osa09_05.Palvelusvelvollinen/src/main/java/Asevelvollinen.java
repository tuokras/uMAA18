/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rasmus
 */
public class Asevelvollinen implements Palvelusvelvollinen {
    
    private int palvelusaika;
    
    public Asevelvollinen(int palvelusaika) {
        this.palvelusaika = palvelusaika;
    }
    
    public int paiviaJaljella() {
        return this.palvelusaika;
    }
    
    public void palvele() {
        if (palvelusaika > 0) {
            this.palvelusaika--;
        } 
    }
}
