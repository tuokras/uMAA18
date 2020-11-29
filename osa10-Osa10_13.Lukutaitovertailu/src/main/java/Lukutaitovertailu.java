
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Lukutaitovertailu {

    public static void main(String[] args) {
        ArrayList<String> jarjestetty = jarjesta(lue("lukutaito.csv"));
        
        jarjestetty.stream().forEach(l -> System.out.println(l));
    }

    public static ArrayList<Lukutaito> lue(String tiedosto) {
        ArrayList<Lukutaito> rivit = new ArrayList<>();

        try {
            Files.lines(Paths.get(tiedosto))
                    .map(rivi -> rivi.split(","))
                    .filter(palat -> palat.length >= 6)
                    .map(palat -> new Lukutaito(palat[0].trim(), palat[1].trim(), palat[2].substring(0, palat[2].length() - 3).trim(), palat[3].trim(), Integer.valueOf(palat[4].trim()), Double.valueOf(palat[5].trim())))
                    .forEach(rivi -> rivit.add(rivi));
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        return rivit;
    }
    
    public static ArrayList<String> jarjesta(ArrayList<Lukutaito> lista) {
        ArrayList<String> jarjestetty = new ArrayList<>();
        lista.stream().sorted((l1, l2) -> {
            if (l1.getLukutaitoprosentti() < l2.getLukutaitoprosentti()) return -1;
            if (l1.getLukutaitoprosentti() > l2.getLukutaitoprosentti()) return 1;
            return 0;
        }).forEach(l -> jarjestetty.add(l.getMaa() + " (" + l.getVuosi() + "), " + l.getSukupuoli() + ", " + l.getLukutaitoprosentti()));
        return jarjestetty;
    }

}
