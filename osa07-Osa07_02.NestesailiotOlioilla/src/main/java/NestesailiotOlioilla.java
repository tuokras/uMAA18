
import java.util.Scanner;

public class NestesailiotOlioilla {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Sailio ensimmainen = new Sailio();
        Sailio toinen = new Sailio();

        while (true) {
            System.out.print("> ");

            System.out.println("Ensimmäinen: " + ensimmainen);
            System.out.println("Toinen: " + toinen);

            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }

            String[] osat = luettu.split(" ");
            String komento = osat[0];
            int maara = Integer.valueOf(osat[1]);

            if (komento.equals("lisaa")) {
                ensimmainen.lisaa(maara);
            }

            if (komento.equals("siirra")) {
                if (maara <= ensimmainen.sisalto()) {
                    toinen.lisaa(maara);
                    ensimmainen.poista(maara);
                    continue;
                }
                if (maara > ensimmainen.sisalto()) {
                    toinen.lisaa(ensimmainen.sisalto());
                    ensimmainen.poista(ensimmainen.sisalto());
                    continue;
                }
            }

            if (komento.equals("poista")) {
                toinen.poista(maara);
            }

        }
    }

}
