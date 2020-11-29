
import java.util.ArrayList;
import java.util.Scanner;

public class TiettyjenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> syotteet = new ArrayList<>();
        // toteuta ohjelmasi tänne
        
        System.out.println("Kirjoita syötteitä, loppu lopettaa");
        while (true) {
            String syote = lukija.nextLine();
            
            if (syote.equals("loppu")) {
                break;
            }
            syotteet.add(syote);
        }
        
        System.out.println("Tulostetaanko negatiivisten vai positiivisten lukujen keskiarvo?");
        System.out.println("(n/p)");
        String valinta = lukija.nextLine();
        
        if (valinta.equals("n")) {
            System.out.println("Negatiivisten lukujen keskiarvo: " + syotteet.stream().mapToInt(s -> Integer.valueOf(s)).filter(luku -> luku < 0).average().getAsDouble());
        }
        
        if (valinta.equals("p")) {
            System.out.println("Positiivisten lukujen keskiarvo: " + syotteet.stream().mapToInt(s -> Integer.valueOf(s)).filter(luku -> luku > 0).average().getAsDouble());
        }
    }
}
