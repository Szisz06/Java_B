/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author MóczaSzilvia(SZF_E_2
 */
public class Asztal {

    private final ArrayList<Ital> italok;
    protected ArrayList<Sor> sorok;
    protected ArrayList<Bor> borok;
    protected List edesek;
    protected List szarazok;

    public Asztal() throws IOException {
        italok = new ArrayList<>();
        italok.add(new Sor("sor2", "5%", Cimke.HAGYOMANYOS));
        italok.add(new Sor("sor1", "10%", Cimke.HAGYOMANYOS, 60));
        italok.add(new Bor("bor1", "15%", Cimke.REGI, "édes"));
        italok.add(new Bor("bor2", "15%", Cimke.REGI, "száraz"));
        italok.add(new Bor("bor3", "15%", Cimke.REGI, "édes"));
        sorokBorok();
        statisztika();
        italokAsztalon();
        italokFajlban();
        statisztika();
    }

    private void italokAsztalon() {
        kiirKonzol(italok);
        System.out.println("-------------------------");
        kiirKonzol(sorok);
        System.out.println("-------------------------");
        System.out.println("Édesek:");
        kiirKonzol(edesek);
        System.out.println("Szárazok:");
        kiirKonzol(szarazok);
    }

    private void sorokBorok() {
        sorok = new ArrayList<>();
        borok = new ArrayList<>();
        for (Ital ital : italok) {
            if (ital instanceof Sor) {
                sorok.add((Sor) ital);
            }
        }
        Collections.sort(sorok, new SorNevComparator());
        //Collections.sort(sorok, new SorMalataComparator());
    }

    private void italokFajlban() throws IOException {
        try {
            kiirFajlba(italok, "italok.txt");
            System.out.println("Sikeresen kiírva a fájlba.");
        } catch (IOException e) {
            System.err.println("Hiba történt a fájlba írás közben: " + e.getMessage());
        }
    }

    private void statisztika() {
        edesek = new ArrayList<>();
        szarazok = new ArrayList<>();
        for (Ital ital : italok) {
            if (ital instanceof Bor) {
                Bor bor = (Bor) ital;
                if (bor.getCukor().equals("édes")) {
                    edesek.add(bor.getNev());
                } else if (bor.getCukor().equals("száraz")) {
                    szarazok.add(bor.getNev());
                }
            }
        }
    }

    protected <T> void kiirKonzol(List<T> list) {
        for (Object elem : list) {
            System.out.println(elem.toString());
        }
    }

    protected static void kiirFajlba(List<Ital> list, String fn) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fn))) {
            for (Object elem : list) {
                writer.write(elem.toString());
                writer.newLine();
            }
        }
    }

    public ArrayList<Ital> getItalok() {
        return italok;
    }

    public void hozzaadItal(Ital ujItal) {
        italok.add(ujItal);
    }
}
