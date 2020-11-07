/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rasmus
 */
public class Lintu {
    
    private final String nimi;
    private final String nimiLatinaksi;
    private int havaintoja;
    
    public Lintu(String nimi, String nimiLatinaksi) {
        this.nimi = nimi;
        this.nimiLatinaksi = nimiLatinaksi;
        this.havaintoja = 0;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public String getNimiLatinaksi() {
        return this.nimiLatinaksi;
    }
    
    public int getHavainnot() {
        return this.havaintoja;
    }
    
    public void havaintoja() {
        this.havaintoja++;
    }
    
    @Override
    public String toString() {
        return this.nimi + " (" + this.nimiLatinaksi + "): " + this.havaintoja + " havaintoa";
    }
}
