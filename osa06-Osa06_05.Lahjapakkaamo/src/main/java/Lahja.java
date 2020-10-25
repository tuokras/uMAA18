/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rasmus
 */
public class Lahja {

    private String nimi;
    private int paino;

    public Lahja(String lahjanNimi, int lahjanPaino) {
        this.nimi = lahjanNimi;
        this.paino = lahjanPaino;
    }

    public String getNimi() {
        return this.nimi;
    }

    public int getPaino() {
         return this.paino; 
    }
    
    public String toString() {
        return (this.nimi + " (paino " + this.paino + " kg)");
    }
}
