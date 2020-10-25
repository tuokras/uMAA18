
import java.util.ArrayList;

public class Joukko {

    private String nimi;
    private ArrayList<String> alkiot;

    public Joukko(String nimi) {
        this.nimi = nimi;
        this.alkiot = new ArrayList<>();
    }

    public void lisaa(String alkio) {
        this.alkiot.add(alkio);
    }

    public ArrayList<String> getAlkiot() {
        return this.alkiot;
    }
    
    public String pisin() {
        if (alkiot.isEmpty()) {
            return null;
        }
        String pisin = alkiot.get(0);
        for (String joukko: alkiot) {
            if (joukko.length() > pisin.length()) {
                pisin = joukko;
            }
        }
        return pisin;
    }

}
