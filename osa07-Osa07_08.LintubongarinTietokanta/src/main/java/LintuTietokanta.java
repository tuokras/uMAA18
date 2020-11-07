
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
public class LintuTietokanta {

    private final ArrayList<Lintu> tietokanta;

    public LintuTietokanta() {
        this.tietokanta = new ArrayList<>();
    }

    public void lisaa(String nimi, String nimiLatinaksi) {
        Lintu lintu = new Lintu(nimi, nimiLatinaksi);
        this.tietokanta.add(lintu);
    }

    public void lisaaHavainto(String nimi) {
        for (Lintu lintu : tietokanta) {
            if (lintu.getNimi().equals(nimi) || lintu.getNimiLatinaksi().equals(nimi)) {
                lintu.havaintoja();
                return;
            }
        }
        System.out.println("Ei ole lintu!");
    }

    public void tulostaLinnut() {
        for (Lintu lintu : tietokanta) {
            System.out.println(lintu);
        }
    }

    public void tulostaLintu(String nimi) {
        for (Lintu lintu : tietokanta) {
            if (lintu.getNimi().equals(nimi) || lintu.getNimiLatinaksi().equals(nimi)) {
                System.out.println(lintu);
                return;
            }
        }
        System.out.println("Ei ole lintu!");
    }
}
