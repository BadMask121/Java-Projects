/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratice;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
/*/* */
public class tasklist {
 
    
    public static void main(String[] args) {
        
        
        try {
            Process process = new ProcessBuilder("help").start();
            new Thread(() -> {
                Scanner sc = new Scanner(process.getInputStream());
                if (sc.hasNextLine()) sc.nextLine();
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    System.out.println(line);
                }
            }).start();
        } catch (IOException ex) {
            Logger.getLogger(tasklist.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
