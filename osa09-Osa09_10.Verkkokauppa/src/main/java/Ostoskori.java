
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rasmus
 */
public class Ostoskori {

    private Map<String, Ostos> ostokset;

    public Ostoskori() {
        this.ostokset = new HashMap<>();
    }

    public void lisaa(String tuote, int hinta) {
        if (ostokset.get(tuote) != null) {
            ostokset.get(tuote).kasvataMaaraa();
        } else {
            ostokset.put(tuote, new Ostos(tuote, 1, hinta));
        }
    }

    public int hinta() {
        int kokonaishinta = 0;
        //System.out.println("Init");
        for (Ostos ostos : ostokset.values()) {
            kokonaishinta += ostos.hinta();
            //System.out.println("Ostoksen hinta: " + ostos.hinta());
        }
        //System.out.println("Ostoskorin kokonaishinta: " + kokonaishinta);
        return kokonaishinta;
    }

    public void tulosta() {
        for (Ostos ostos : ostokset.values()) {
            System.out.println(ostos);
        }
    }

}
