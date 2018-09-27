/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratice; 

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class Shutdown {
    public static void main(String[] args) {

        int minutes = 1;
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                ProcessBuilder processBuilder = new ProcessBuilder("shutdown",
                        "/s");
                try {
                    processBuilder.start();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }, minutes * 60 * 1000);

        System.out.println(" Shutting down in " + minutes + " minutes");
    }
 }