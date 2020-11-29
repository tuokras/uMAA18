/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rasmus
 */
public class Lukutaito {
    
    private String teema;
    private String ikaryhma;
    private String sukupuoli;
    private String maa;
    private int vuosi;
    private double lukutaitoprosentti;
    
    public Lukutaito(String teema, String ikaryhma, String sukupuoli, String maa, int vuosi, double lukutaitoprosentti) {
        this.teema = teema;
        this.ikaryhma = ikaryhma;
        this.sukupuoli = sukupuoli;
        this.maa = maa;
        this.vuosi = vuosi;
        this.lukutaitoprosentti = lukutaitoprosentti;
    }
    
    public String getTeema() {
        return teema;
    }
    
    public String getIkaryhma() {
        return ikaryhma;
    }
    
    public String getSukupuoli() {
        return sukupuoli;
    }
    
    public String getMaa() {
        return maa;
    }
    
    public int getVuosi() {
        return vuosi;
    }
    
    public double getLukutaitoprosentti() {
        return lukutaitoprosentti;
    }
}
