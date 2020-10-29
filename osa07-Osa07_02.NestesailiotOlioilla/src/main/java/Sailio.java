/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rasmus
 */
public class Sailio {

    private int sisalto;

    public Sailio() {

    }

    public int sisalto() {
        return sisalto;
    }

    public void lisaa(int maara) {
        if (maara < 0) {
            return;
        }
        
        sisalto += maara;
        
        if (sisalto > 100) {
            sisalto = 100;
        }
    }

    public void poista(int maara) {
        if (maara < 0) {
            return;
        }
        
        sisalto -= maara;
        
        if (sisalto < 0) {
            sisalto = 0;
        }
    }

    public String toString() {
        return sisalto + "/100";
    }
}
