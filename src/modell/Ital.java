/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;
public class Ital {

    String nev;
    String fok;
    Cimke cimke;

    public String getNev() {
        return nev;
    }

    public Cimke getCimke() {
        return cimke;
    }

    public String getFok() {
        return fok;
    }

    public void setNev(String nev) {
        char firstChar = nev.charAt(0);
        if (Character.isLetter(firstChar)) {
            if (!Character.isUpperCase(firstChar)) {
                this.nev = Character.toUpperCase(firstChar) + nev.substring(1);
            }
        }
    }

    public void setFok(String fok) {
        if (!fok.endsWith("%")) {
            throw new SajatKivetelException("%-JEL KELL HOGY ELGYEN A FOK UTOLSÓ KARAKTERE");
        } else if (!fok.contains(".")) {
            int length = fok.length();
            this.fok = fok.substring(0, length - 1) + ".0" + fok.charAt(length - 1);

        } else {
            this.fok = fok;
        }
    }

    public Ital(String nev, String fok, Cimke cimke) {
        this.setNev(nev);
        this.setFok(fok);
        this.cimke = cimke;
    }

    @Override
    public String toString() {
        return "Ital{" + "nev=" + nev + ", fok=" + fok + ", cimke=" + cimke + '}';
    }

}
