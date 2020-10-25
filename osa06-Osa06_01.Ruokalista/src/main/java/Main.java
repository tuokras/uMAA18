
public class Main {

    public static void main(String[] args) {

        // Kun olet luonut metodin lisaaAteria(String ateria), 
        // voit poistaa allaolevat kommentit
        Ruokalista menu = new Ruokalista();
        menu.lisaaAteria("Tofuratatouille");
        menu.lisaaAteria("Chili-kookoskana");
        menu.lisaaAteria("Chili-kookoskana");
        menu.lisaaAteria("Lihapyörykät sinappikastikeella");

        menu.tulostaAteriat();
        menu.tyhjennaRuokalista();

        System.out.println();
        menu.lisaaAteria("Tomaatti-mozzarellasalaatti");
        menu.tulostaAteriat();
    }
}
