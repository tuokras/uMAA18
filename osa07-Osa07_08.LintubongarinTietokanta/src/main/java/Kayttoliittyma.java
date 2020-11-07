
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rasmus
 */
public class Kayttoliittyma {

    private final Scanner lukija;
    private final LintuTietokanta lintubongari;

    public Kayttoliittyma(Scanner lukija, LintuTietokanta lintubongari) {
        this.lukija = lukija;
        this.lintubongari = lintubongari;
    }

    public void kaynnista() {
        while (true) {
            System.out.println("?");
            String syote = lukija.nextLine();
            if (syote.equals("Lopeta")) {
                break;
            } else if (syote.equals("Lisaa")) {
                lisaaLintu(lukija);
            } else if (syote.equals("Havainto")) {
                lisaaHavainto(lukija);
            } else if (syote.equals("Tilasto")) {
                tulostaLinnut();
            } else if (syote.equals("Nayta")) {
                tulostaLintu(lukija);
            } else {
                System.out.println("Jokin toinen komento?");
            }
        }
    }

    public void lisaaLintu(Scanner lukija) {
        System.out.println("Nimi: ");
        String nimi = lukija.nextLine();
        System.out.println("Latinankielinen nimi: ");
        String nimiLatinaksi = lukija.nextLine();
        this.lintubongari.lisaa(nimi, nimiLatinaksi);
    }

    public void lisaaHavainto(Scanner lukija) {
        System.out.println("Mikä havaittu?");
        String lintu = lukija.nextLine();
        this.lintubongari.lisaaHavainto(lintu);
    }

    public void tulostaLinnut() {
        this.lintubongari.tulostaLinnut();
    }

    public void tulostaLintu(Scanner lukija) {
        System.out.println("Mikä?");
        String nimi = lukija.nextLine();
        this.lintubongari.tulostaLintu(nimi);
    }
}
