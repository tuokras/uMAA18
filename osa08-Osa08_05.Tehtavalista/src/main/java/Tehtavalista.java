
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rasmus
 */
public class Tehtavalista {
    
    private ArrayList<String> tehtavat;
    
    public Tehtavalista() {
        this.tehtavat = new ArrayList<>();
    }
    
    public void lisaa(String tehtava) {
        tehtavat.add(tehtava);
    }
    
    public void tulosta() {
        for (int i = 0; i < tehtavat.size(); i++) {
            System.out.println(i + 1 + ": " + tehtavat.get(i));
        }
    }
    
    public void poista(int numero) {
        tehtavat.remove(numero - 1);
    }
}
