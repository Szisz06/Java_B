/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

import java.io.Serializable;

/**
 *
 * @author MóczaSzilvia(SZF_E_2
 */
public class Bor extends Ital implements Serializable {

    private String cukor;

    public Bor(String nev, String fok, Cimke cimke, String cukor) {
        super(nev, fok, cimke);
        this.cukor = cukor;
    }

    public String getCukor() {
        return cukor;
    }

    @Override
    public String toString() {
        return "Bor{" + " nev=" + nev + ", fok=" + fok + ", cimke=" + cimke + ", cukor=" + cukor + '}';
    }

}
