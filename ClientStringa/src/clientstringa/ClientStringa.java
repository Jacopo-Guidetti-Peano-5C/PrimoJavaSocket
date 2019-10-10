/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientstringa;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc15
 */
public class ClientStringa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here

            Socket s = new Socket("localhost",2001);
            PrintWriter pw = new PrintWriter (s.getOutputStream(),true);
            pw.println("ciao");
            s.close();
        } catch (IOException ex) {
            Logger.getLogger(ClientStringa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
