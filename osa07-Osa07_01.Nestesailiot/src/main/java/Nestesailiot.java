
import java.util.Scanner;

public class Nestesailiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int ensimmainen = 0;
        int toinen = 0;

        while (true) {
            System.out.print("> ");

            System.out.println("Ensimmainen: " + ensimmainen + "/100");
            System.out.println("Toinen: " + toinen + "/100");

            String luettu = lukija.nextLine();
            String[] osat = luettu.split(" ");

            if (luettu.equals("lopeta")) {
                break;
            }

            String komento = osat[0];
            int maara = Integer.valueOf(osat[1]);

            if (komento.equals("lisaa")) {

                if (maara < 0) {
                    continue;
                }

                ensimmainen += maara;
                if (ensimmainen > 100) {
                    ensimmainen = 100;
                }
            }

            if (komento.equals("siirra")) {

                if (maara < 0) {
                    continue;
                }

                if (maara > ensimmainen) {
                    toinen += ensimmainen;
                    ensimmainen = 0;
                    continue;
                }

                toinen += maara;
                ensimmainen -= maara;

                if (toinen > 100) {
                    toinen = 100;
                }

                if (toinen < 0) {
                    toinen = 0;
                }

            }

            if (komento.equals("poista")) {
                if (maara < 0) {
                    continue;
                }
                toinen -= maara;
                if (toinen < 0) {
                    toinen = 0;
                }
            }

        }
    }

}
