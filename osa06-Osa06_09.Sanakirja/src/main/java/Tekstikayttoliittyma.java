/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rasmus
 */
import java.util.Scanner;

public class Tekstikayttoliittyma {

    private Scanner lukija;
    private Sanakirja sanakirja;

    public Tekstikayttoliittyma(Scanner lukija, Sanakirja sanakirja) {
        this.lukija = lukija;
        this.sanakirja = sanakirja;
    }

    public void kaynnista() {

        while (true) {
            System.out.println("Komento:");
            String komento = lukija.nextLine();

            if (komento.equals("lopeta")) {
                System.out.println("Hei hei!");
                break;
            }

            if (komento.equals("lisaa")) {
                System.out.println("Sana:");
                String sana = lukija.nextLine();
                System.out.println("Käännös:");
                String kaannos = lukija.nextLine();

                sanakirja.lisaa(sana, kaannos);

                continue;

            }

            if (komento.equals("hae")) {
                System.out.println("Haettava:");
                String haettava = lukija.nextLine();
                
                String tulostus = sanakirja.kaanna(haettava);
                
                //NullPointerException jos tuolostu.equals(null)
                if (tulostus == null) {
                    System.out.println("Sanaa " + haettava + " ei löydy");
                    continue;
                }
                
                System.out.println("Käännos: " + tulostus);
                
                continue;

            }

            System.out.println("Tuntematon komento");
        }
    }
}
