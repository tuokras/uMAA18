/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rasmus
 */
import java.util.ArrayList;

public class Tehtavalista {

    private ArrayList<String> tehtavalista = new ArrayList<>();

    public Tehtavalista() {

    }

    public void lisaa(String tehtava) {
        tehtavalista.add(tehtava);
    }

    public void tulosta() {
        for (String tehtava : tehtavalista) {
            System.out.println(tehtavalista.indexOf(tehtava) + 1 + ": " + tehtava);
        }
    }

    public void poista(int numero) {
        tehtavalista.remove(numero - 1);
    }
}
