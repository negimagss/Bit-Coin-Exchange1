/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm.roundRobin;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
/**
 *
 * @author @Shardul_Negi(negi_mags)
 */
import org.apache.commons.io.FileUtils;
public class HTML {
    
    public void generateInvoice(String inv) throws IOException {
    
 String text = "Hello world";
        BufferedWriter output = null;
        try {
            File file = new File("Invoice\\Invoice.html");
            output = new BufferedWriter(new FileWriter(file));
            output.write(inv);
        } catch ( IOException e ) {
            e.printStackTrace();
        } finally {
          if ( output != null ) {
            output.close();
          }
        }
}
}