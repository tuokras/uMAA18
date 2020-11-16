
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rasmus
 */
public class MaksimipainollinenLaatikko extends Laatikko {

    private int maksimipaino;
    private ArrayList<Tavara> tavarat;

    public MaksimipainollinenLaatikko(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.tavarat = new ArrayList<>();
    }
    
    @Override
    public void lisaa(Tavara tavara) {
        if (tavara.getPaino() <= maksimipaino) {
            tavarat.add(tavara);
            maksimipaino -= tavara.getPaino();
        }
    }
    
    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        return (tavarat.contains(tavara));
    }

    
    
}