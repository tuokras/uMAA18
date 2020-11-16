/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rasmus
 */
public class CDLevy implements Talletettava {
    
    private double paino;
    private String artisti;
    private String nimi;
    private int julkaisuvuosi;
    
    public CDLevy(String artisti, String nimi, int julkaisuvuosi) {
        this.paino = 0.1;
        this.artisti = artisti;
        this.nimi = nimi;
        this.julkaisuvuosi = julkaisuvuosi;
    }

    @Override
    public double paino() {
        return paino;
    }
    
    public String toString() {
        return artisti + ": " + nimi + " (" + julkaisuvuosi + ")";
    }
    
    
}
