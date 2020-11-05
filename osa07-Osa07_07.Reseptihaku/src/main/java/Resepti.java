
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rasmus
 */
public class Resepti {

    private ArrayList<String> ainekset = new ArrayList<>();
    private String nimi;
    private int kesto;

    public Resepti(String nimi, int kesto, ArrayList<String> ainekset) {
        this.nimi = nimi;
        this.kesto = kesto;
        for (String aines : ainekset) {
            this.ainekset.add(aines);
        }
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public int getKesto() {
        return this.kesto;
    }
    
    public ArrayList<String> getAinekset() {
        return this.ainekset;
    }
    
    public void tulostaAinekset() {
        System.out.println(this.ainekset);
    }
    
    public String toString() {
        return this.getNimi() + ", keittoaika: " + this.getKesto();
    }
    
}