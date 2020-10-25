
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

    public String toString() {
        String tulostus = "";
        if (alkiot.isEmpty()) {
            tulostus += ("Joukko " + this.nimi + " on tyhjä.");
        } else if (alkiot.size() == 1) {
            tulostus += ("Joukossa " + this.nimi + " on 1 alkio:");
        } else {
            tulostus += ("Joukossa " + this.nimi + " on " + alkiot.size() + " alkiota:");
        }

        for (String alkio : alkiot) {
            tulostus += "\n" + alkio;
        }
        return tulostus;
    }

}
