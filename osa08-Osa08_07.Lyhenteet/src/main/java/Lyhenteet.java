
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
public class Lyhenteet {

    private HashMap<String, String> lyhenteet;

    public Lyhenteet() {
        this.lyhenteet = new HashMap<>();
    }

    public void lisaaLyhenne(String lyhenne, String selite) {
        lyhenteet.put(lyhenne, selite);
    }

    public boolean onkoLyhennetta(String lyhenne) {
        return this.lyhenteet.containsKey(lyhenne);
    }

    public String haeLyhenne(String lyhenne) {
        return lyhenteet.get(lyhenne);
    }
}
