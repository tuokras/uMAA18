
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Arvosanatilastot tilasto = new Arvosanatilastot();
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(lukija, tilasto);

        kayttoliittyma.kaynnista();

    }
}
