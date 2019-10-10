/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverstringa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc15
 */
public class ServerStringa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
            // TODO code application logic here
try {
            ServerSocket ss = new ServerSocket(2001);
            for (;;) {
                Socket s;
                s = ss.accept();
                InputStreamReader isr= new InputStreamReader(s.getInputStream());
                BufferedReader br = new BufferedReader(isr);
                System.out.println("Il server ha ricevuto: " + br.readLine() );
                s.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(ServerStringa.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
