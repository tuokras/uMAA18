/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rasmus
 */
public class Koira extends Elain implements Aanteleva {

    //private String nimi;

    public Koira() {
        //this.nimi = "Koira";
        super("Koira");
    }

    public Koira(String nimi) {
        //this.nimi = nimi;
        super(nimi);
    }

    public void hauku() {
        System.out.println(super.getNimi() + " haukkuu");
    }
    
    public void aantele() {
        this.hauku();
    }
    
    
}
