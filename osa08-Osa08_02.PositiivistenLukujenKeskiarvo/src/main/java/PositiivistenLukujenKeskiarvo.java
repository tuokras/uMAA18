
import java.util.ArrayList;
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> luvut = new ArrayList<>();

        while (true) {
            int syote = Integer.valueOf(lukija.nextLine());

            if (syote == 0) {
                break;
            }

            if (syote > 0) {
                luvut.add(syote);
            }
        }
        
        int lkm = 0;
        int yht = 0;
        for (Integer luku : luvut) {
            lkm++;
            yht += luku;
        }
        
        if (yht == 0) {
            System.out.println("keskiarvon laskeminen ei ole mahdollista");
        }
        
        System.out.println(1.0 * yht / lkm);

    }
}
