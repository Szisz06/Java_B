package moczaszilvia_b;

import java.io.IOException;
import modell.Asztal;
import modell.SajatKivetelException;
import nezet.GuiForm;

public class MoczaSzilvia_B {

    public static void main(String[] args) {
       try {
        Asztal asztal = new Asztal();
        new GuiForm().setVisible(true);
    } catch (IOException e) {
        throw new SajatKivetelException("Nem jó asztal");
    }
    }
    
}
