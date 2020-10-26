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
public class Kayttoliittyma {
    private Tehtavalista tehtavalista;
    private Scanner lukija;
    
    public Kayttoliittyma(Tehtavalista tehtavalista, Scanner lukija) {
        this.tehtavalista = tehtavalista;
        this.lukija = lukija;
    }
    
    public void kaynnista() {
        while (true) {
            System.out.println("Komento:");
            String komento = lukija.nextLine();
            
            if (komento.equals("lopeta")) {
                break;
            }
            
            if (komento.equals("lisaa")) {
                System.out.println("Lisättävä:");
                String lisattava = lukija.nextLine();
                tehtavalista.lisaa(lisattava);
                continue;
            }
            
            if (komento.equals("listaa")) {
                tehtavalista.tulosta();
                continue;
            }
            
            if (komento.equals("poista")) {
                System.out.println("Mikä poistetaan?");
                int tunnus = Integer.valueOf(lukija.nextLine());
                tehtavalista.poista(tunnus);
                continue;
            }
        }
    }
}
