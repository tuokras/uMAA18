/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rasmus
 */
public class Opiskelija extends Henkilo {
    
    private int opintopisteet;
    
    public Opiskelija(String nimi, String osoite) {
        super(nimi, osoite);
    }
    
    public void opiskele() {
        opintopisteet++;
    }
    
    public int opintopisteita() {
        return opintopisteet;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n  " + "opintopisteitä " + this.opintopisteita();
    }
}
