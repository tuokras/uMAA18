
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia
//        Varasto varasto = new Varasto();
//        varasto.lisaaTuote("kahvi", 5, 10);
//        varasto.lisaaTuote("maito", 3, 20);
//        varasto.lisaaTuote("piima", 2, 55);
//        varasto.lisaaTuote("leipa", 7, 8);
//
//        Kauppa kauppa = new Kauppa(varasto, new Scanner(System.in));
//        kauppa.asioi("Pekka");

//        Ostos ostos = new Ostos("maito", 4, 2);
//        System.out.println("ostoksen joka sisältää 4 maitoa yhteishinta on " + ostos.hinta());
//        System.out.println(ostos);
//        ostos.kasvataMaaraa();
//        System.out.println(ostos);
//        Ostoskori kori = new Ostoskori();
//        kori.lisaa("maito", 3);
//        kori.tulosta();
//        System.out.println("korin hinta: " + kori.hinta() + "\n");
//
//        kori.lisaa("piima", 2);
//        kori.tulosta();
//        System.out.println("korin hinta: " + kori.hinta() + "\n");
//
//        kori.lisaa("maito", 3);
//        kori.tulosta();
//        System.out.println("korin hinta: " + kori.hinta() + "\n");
//
//        kori.lisaa("maito", 3);
//        kori.tulosta();
//        System.out.println("korin hinta: " + kori.hinta() + "\n");

        Varasto varasto = new Varasto();
        varasto.lisaaTuote("kahvi", 5, 10);
        varasto.lisaaTuote("maito", 3, 20);
        varasto.lisaaTuote("piima", 2, 55);
        varasto.lisaaTuote("leipa", 7, 8);

        Kauppa kauppa = new Kauppa(varasto, new Scanner(System.in));
        kauppa.asioi("Pekka");
    }

}
