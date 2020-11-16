/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rasmus
 */
public class YhdenTavaranLaatikko extends Laatikko {

    private Tavara yksiTavara;
    private boolean tyhja;

    public YhdenTavaranLaatikko() {
        this.tyhja = true;
    }

    @Override
    public void lisaa(Tavara tavara) {
        if (tyhja) {
            yksiTavara = tavara;
            tyhja = false;
        }
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        if (tyhja) {
            return false;
        }
        return yksiTavara.equals(tavara);
    }
}
