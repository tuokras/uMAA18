
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
    private final Arvosanatilastot tilasto;

    public Kayttoliittyma(Scanner lukija, Arvosanatilastot tilasto) {
        this.lukija = lukija;
        this.tilasto = tilasto;
    }

    public void kaynnista() {
        System.out.println("Syötä yhteispisteet, -1 lopettaa");
        while (true) {
            int syote = Integer.valueOf(lukija.nextLine());
            if (syote == -1) {
                break;
            }
            tilasto.lisaa(syote);
        }

        System.out.println("Pisteiden keskiarvo (kaikki): " + tilasto.pisteidenKeskiarvo());
        if (tilasto.hyvaksyttyjenKeskiarvo() == -1) {
            System.out.println("Pisteiden keskiarvo (hyväksytyt): -");
        } else {
            System.out.println("Pisteiden keskiarvo (hyväksytyt): " + tilasto.hyvaksyttyjenKeskiarvo());
        }
        System.out.println("Hyväksymisprosentti: " + tilasto.hyvaksyttyjenProsenttiosuus());

        System.out.println("Arvosanajakauma:");
        int arvosana = 5;
        while (arvosana >= 0) {
            int tahtia = tilasto.arvosanojenLkm(arvosana);
            System.out.print(arvosana + ": ");
            while (tahtia > 0) {
                System.out.print("*");
                tahtia--;
            }
            System.out.println("");
            arvosana -= 1;
        }
    }
}
