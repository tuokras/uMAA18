
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Reseptihaku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mikä tiedosto?");
        String tiedosto = lukija.nextLine();
        ArrayList<Resepti> reseptit = lisaaTiedostosta(tiedosto);
        System.out.println("Komennot:");
        System.out.println("listaa - listaa reseptit");
        System.out.println("lopeta - lopettaa ohjelman");
        System.out.println("hae nimi - hakee reseptiä nimen perusteella");
        System.out.println("hae keittoaika - hakee reseptiä raaka-aineen perusteella");
        
        while (true) {
            System.out.println("Syötä komento:");
            String komento = lukija.nextLine();
            System.out.println("");
            if (komento.equals("lopeta")) {
                break;
            }
            
            if (komento.equals("listaa")) {
                tulostaReseptit(reseptit);
                System.out.println("");
            }
            
            if (komento.equals("hae keittoaika")) {
                reseptiKestonPerusteella(reseptit, lukija);
                System.out.println("");
            }
            
            if (komento.equals("hae aine")) {
                reseptiAinestenPerusteella(reseptit, lukija);
                System.out.println("");
            }
            
            if (komento.equals("hae nimi")) {
                reseptiNimenPerusteella(reseptit, lukija);
                System.out.println("");
            }
        }
    }

    public static ArrayList<Resepti> lisaaTiedostosta(String tiedosto) {
        String nimi;
        int kesto;
        ArrayList<String> ainekset = new ArrayList<>();
        ArrayList<Resepti> reseptit = new ArrayList<>();
        try ( Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {
            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();

                if (!rivi.isEmpty()) {
                    ainekset.add(rivi);
                } else {
                    nimi = ainekset.get(0);
                    kesto = Integer.valueOf(ainekset.get(1));
                    ainekset.remove(0);
                    ainekset.remove(0);
                    reseptit.add(new Resepti(nimi, kesto, ainekset));
                    ainekset.clear();
                }
            }
            if (!ainekset.isEmpty()) {
                nimi = ainekset.get(0);
                kesto = Integer.valueOf(ainekset.get(1));
                ainekset.remove(0);
                ainekset.remove(0);
                reseptit.add(new Resepti(nimi, kesto, ainekset));
                ainekset.clear();
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        //System.out.println(reseptit.toString());
        return reseptit;
    }
    
    public static void reseptiAinestenPerusteella(ArrayList<Resepti> reseptit, Scanner lukija) {
        System.out.println("Mitä raaka-ainetta haetaan: ");
        String aines = lukija.nextLine();
        System.out.println("Reseptit: ");
        for (Resepti resepti : reseptit) {
            if (resepti.getAinekset().contains(aines)) {
                System.out.println(resepti);
            }
        }
    }
    
    public static void reseptiKestonPerusteella(ArrayList<Resepti> reseptit, Scanner lukija) {
        System.out.println("Keittoaika korkeintaan: ");
        int kesto = Integer.valueOf(lukija.nextLine());
        System.out.println("Reseptit:");
        for (Resepti resepti : reseptit) {
            if (resepti.getKesto() <= kesto) {
                System.out.println(resepti);
            }
        }
    }
    
    public static void reseptiNimenPerusteella(ArrayList<Resepti> reseptit, Scanner lukija) {
        System.out.println("Mitä haetaan: ");
        String rivi = lukija.nextLine();
        System.out.println("Reseptit: ");
        for (Resepti resepti : reseptit) {
            if (resepti.getNimi().contains(rivi)) {
                System.out.println(resepti);
            }
        }
    }
    
    public static void tulostaReseptit(ArrayList<Resepti> reseptit) {
        System.out.println("Reseptit:");
        for (Resepti resepti : reseptit) {
            System.out.println(resepti);
        }
    }
}
