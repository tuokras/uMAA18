
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rasmus
 */
public class Ajoneuvorekisteri {

    private HashMap<Rekisterinumero, String> omistajat;

    public Ajoneuvorekisteri() {
        this.omistajat = new HashMap<>();
    }

    public boolean lisaa(Rekisterinumero rekkari, String omistaja) {

        if (!omistajat.containsKey(rekkari)) {
            omistajat.put(rekkari, omistaja);
            return true;
        }
        return false;
    }

    public String hae(Rekisterinumero rekkari) {
        return omistajat.get(rekkari);
    }

    public boolean poista(Rekisterinumero rekkari) {
        if (omistajat.get(rekkari) != null) {
            omistajat.remove(rekkari);
            return true;
        }
        return false;
    }

    public void tulostaRekisterinumerot() {
        for (Rekisterinumero ar : this.omistajat.keySet()) {
            System.out.println(ar);
        }
    }

    public void tulostaOmistajat() {
        ArrayList<String> tulostettavatHenkilot = new ArrayList<>();
        for (String hlo : this.omistajat.values()) {
            if (!tulostettavatHenkilot.contains(hlo)) {
                tulostettavatHenkilot.add(hlo);
            }
        }
        for (String tulostettava : tulostettavatHenkilot) {
            System.out.println(tulostettava);
        }
    }
}
