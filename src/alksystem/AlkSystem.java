/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alksystem;

import java.awt.Color;
import java.net.MalformedURLException;

/**
 *
 * @author HDMS PC
 */
public class AlkSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException {
        // TODO code application logic here
        //aqui debe ir el preloader
        SplashScreen sps = new SplashScreen();
        sps.setVisible(true);
        sps.setLocationRelativeTo(null);
        sps.setAlwaysOnTop(true);
        sps.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
        //programa principal
        login log = new login();
        sps.dispose();
        log.setVisible(true);
      
        log.setLocationRelativeTo(null);
  
        log.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
 
    }
    
}
