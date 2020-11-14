
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
    
    private Scanner lukija;
    private Tehtavalista tehtavalista;
    
    public Kayttoliittyma(Tehtavalista tehtavalista, Scanner lukija) {
        this.lukija = lukija;
        this.tehtavalista = tehtavalista;
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
            }
            
            if (komento.equals("listaa")) {
                tehtavalista.tulosta();
            }
            
            if (komento.equals("poista")) {
                System.out.println("Mikä poistetaan?");
                int id = Integer.valueOf(lukija.nextLine());
                tehtavalista.poista(id);
            }
        }
    }
}
