
import java.util.Arrays;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] luvut = {8, 3, 7, 9, 1, 2, 4};
        Paaohjelma.jarjesta(luvut);
    }

    public static int pienin(int[] taulukko) {
        int pienin = taulukko[0];
        for (int i = 0; i < taulukko.length; i++) {
            if (taulukko[i] < pienin) {
                pienin = taulukko[i];
            }
        }
        return pienin;
    }

    public static int pienimmanIndeksi(int[] taulukko) {
        int pienin = taulukko[0];
        int indeksi = 0;
        for (int i = 0; i < taulukko.length; i++) {
            if (taulukko[i] < pienin) {
                pienin = taulukko[i];
                indeksi = i;
            }
        }
        return indeksi;
    }

    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
        int pienin = taulukko[aloitusIndeksi];
        int indeksi = aloitusIndeksi;
        for (int i = aloitusIndeksi; i < taulukko.length; i++) {
            if (taulukko[i] < pienin) {
                pienin = taulukko[i];
                indeksi = i;
            }
        }
        return indeksi;
    }

    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2) {
        int indeksi1Arvo = 0;
        int indeksi2Arvo = 0;
        for (int i = 0; i < taulukko.length; i++) {
            if (i == indeksi1) {
                indeksi1Arvo = taulukko[i];
            }
            if (i == indeksi2) {
                indeksi2Arvo = taulukko[i];
            }
        }
        taulukko[indeksi1] = indeksi2Arvo;
        taulukko[indeksi2] = indeksi1Arvo;
    }

    public static void jarjesta(int[] taulukko) {
        for (int i = 0; i < taulukko.length; i++) {
            System.out.println(Arrays.toString(taulukko));
            vaihda(taulukko, pienimmanIndeksiAlkaen(taulukko, i), i);
        }
    }

}
