/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rasmus
 */
public class Kissa extends Elain implements Aanteleva {
    
    public Kissa() {
        super("Kissa");
    }
    
    public Kissa(String nimi) {
        super(nimi);
    }
    
    public void mourua() {
        System.out.println(super.getNimi() + " mouruaa");
    }
    
    public void aantele() {
        this.mourua();
    }
}
