
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Tehtavalista lista = new Tehtavalista();
        Scanner lukija = new Scanner(System.in);
        

        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(lista, lukija);
        kayttoliittyma.kaynnista();
    }
}
