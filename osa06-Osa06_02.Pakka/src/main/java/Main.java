
public class Main {

    public static void main(String[] args) {

        // Kokeile luokkaasi täällä
        Pakka p = new Pakka();
        /*        System.out.println(p.onTyhja());
        System.out.println(p.arvot());
        p.lisaa("Arvo");
        System.out.println(p.onTyhja());
        System.out.println(p.arvot());
         */

        System.out.println(p.onTyhja());
        System.out.println(p.arvot());
        p.lisaa("Arvo");
        System.out.println(p.onTyhja());
        System.out.println(p.arvot());
        String otettu = p.ota();
        System.out.println(p.onTyhja());
        System.out.println(p.arvot());
        System.out.println(otettu);

        /*
        p.lisaa("1");
        p.lisaa("2");
        p.lisaa("3");
        p.lisaa("4");
        p.lisaa("5");

        while (!p.onTyhja()) {
            System.out.println(p.ota());
        }
         */    }
}
