// vypiš TXT soubor tak, aby každý řádek byl vypsán pozpátku

package tiskradkupozpatku;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TiskRadkupozpatku {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("d:/pokus.txt"));
            String radek;
            while ((radek = br.readLine()) != null) {
                // smyčka po písmenech vytiskne pozpátku řetězec (jeden řádek)
                for (int i=radek.length()-1; i>=0; i--) {
                    System.out.print(radek.charAt(i));
                }
                // musíme odřádkovat
                System.out.println();
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TiskRadkupozpatku.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TiskRadkupozpatku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
