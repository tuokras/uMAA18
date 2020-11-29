
import java.util.ArrayList;
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> syotteet = new ArrayList<>();
        // toteuta ohjelmasi tänne

        System.out.println("Kirjoita syötteitä, loppu lopettaa.");
        while (true) {
            String syote = lukija.nextLine();
            if (syote.equals("loppu")) {
                break;
            }

            syotteet.add(syote);

        }
        
        System.out.println("Lukujen keskiarvo: " + syotteet.stream().mapToInt(s -> Integer.valueOf(s)).average().getAsDouble());

    }
}
