
import java.util.Scanner;

public class Nestesailiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Sailio ensimmainen = new Sailio();
        Sailio toinen = new Sailio();

        while (true) {
            System.out.println("Ensimmainen: " + ensimmainen);
            System.out.println("Toinen: " + toinen);

            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }

            String palat[] = luettu.split(" ");
            String komento = palat[0];
            int maara = Integer.valueOf(palat[1]);

            if (komento.equals("lisaa")) {
                ensimmainen.lisaa(maara);
            }

            if (komento.equals("siirra")) {
                if (maara <= ensimmainen.getMaara()) {
                    toinen.lisaa(maara);
                    ensimmainen.poista(maara);
                    continue;
                }
                if (maara > ensimmainen.getMaara()) {
                    toinen.lisaa(ensimmainen.getMaara());
                    ensimmainen.poista(ensimmainen.getMaara());
                    continue;
                }
            }
            if (komento.equals("poista")) {
                toinen.poista(maara);
            }
        }
    }
}
