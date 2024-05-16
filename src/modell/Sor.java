/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

import java.io.Serializable;
import java.util.Random;
import java.util.UUID;

/**
 *
 * @author MóczaSzilvia(SZF_E_2
 */
public class Sor extends Ital implements Comparable<Sor>, Serializable{
    private UUID uuid;
    private int malata;
    private static Random rnd = new Random();


    
    public Sor(String nev, String fok, Cimke cimke) {
        this(nev, fok, cimke, rnd.nextInt(15) + 50);
        this.uuid = UUID.randomUUID();
    }
    public Sor(String nev, String fok, Cimke cimke, int malata) {
        super(nev, fok, cimke);
        this.malata = malata;
        this.uuid = UUID.randomUUID();
    }

    public UUID getUuid() {
        return uuid;
    }

    public int getMalata() {
        return malata;
    }

    @Override
    public String toString() {
        return "Sör{" + " nev=" + nev + ", fok=" + fok + ", cimke=" + cimke + ", uuid=" + uuid + ", malata=" + malata + '}';
    }
    
    @Override
    public int compareTo(Sor o){
    return this.getNev().compareTo(o.getNev());}
    
}
