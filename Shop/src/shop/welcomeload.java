/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author User
 */
public class welcomeload extends javax.swing.JFrame {

    /**
     * Creates new form welcomeload
     */
    public welcomeload() {
        initComponents();
        this.setBounds(450, 230, 470, 250);
        progressbar.setIndeterminate(false);
        progressbar.setString("loading depency");
progress.setText("0%");

Thread i = new Thread(new Runnable() {
            @Override
            public void run() {
      try {
            
            Timer time = new Timer(500, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if("".equals(progress.getText()))
                    {
                        progress.setText("0%");
                        progressbar.setValue(0);
                    }else if(progressbar.getValue()==0){
                        progress.setText("2%");
                        progressbar.setValue(2);
                    }else if(progressbar.getValue()==2){
                        progress.setText("5%");
                        progressbar.setValue(5);
                    }else if(progressbar.getValue()==5){
                        progress.setText("10%");
                        progressbar.setValue(10);
                    }else if(progressbar.getValue()==10){
                        progress.setText("15%");
                        progressbar.setValue(15);
                    }else if(progressbar.getValue()==15){
                        progress.setText("20%");
                        progressbar.setValue(20);
                    }else if(progressbar.getValue()==20){
                        progress.setText("25%");
                        progressbar.setValue(25);
                    }else if(progressbar.getValue()==25){
                        progress.setText("30%");
                        progressbar.setValue(30);
                    }else if(progressbar.getValue()==30){
                        progress.setText("35%");
                        progressbar.setValue(35);
                    }else if(progressbar.getValue()==35){
                        progress.setText("40%");
                        progressbar.setValue(40);
                    }else if(progressbar.getValue()==40){
                        progress.setText("45%");
                        progressbar.setValue(45);
                    }else if(progressbar.getValue()==45){
                        progress.setText("50%");
                        progressbar.setValue(50);
                    }else if(progressbar.getValue()==50){
                        progress.setText("53%");
                        progressbar.setValue(53);
                    }else if(progressbar.getValue()==53){
                        progress.setText("55%");
                        progressbar.setValue(55);
                    }else if(progressbar.getValue()==55){
                        progress.setText("60%");
                        progressbar.setValue(60);
                    }else if(progressbar.getValue()==60){
                        progress.setText("65%");
                        progressbar.setValue(65);
                    }else if(progressbar.getValue()==65){
                        progress.setText("68%");
                        progressbar.setValue(68);
                    }else if(progressbar.getValue()==68){
                        progress.setText("72%");
                        progressbar.setValue(72);
                    }else if(progressbar.getValue()==72){
                        progress.setText("74%");
                        progressbar.setValue(74);
                    }else if(progressbar.getValue()==74){
                        progress.setText("75%");
                        progressbar.setValue(75);
                    }else if(progressbar.getValue()==75){
                        progress.setText("78%");
                        progressbar.setValue(78);
                    }else if(progressbar.getValue()==78){
                        progress.setText("80%");
                        progressbar.setValue(80);
                    }else if(progressbar.getValue()==80){
                        progress.setText("81%");
                        progressbar.setValue(81);
                    }else if(progressbar.getValue()==81){
                        progress.setText("83%");
                        progressbar.setValue(83);
                    }else if(progressbar.getValue()==83){
                        progress.setText("84%");
                        progressbar.setValue(84);
                    }else if(progressbar.getValue()==84){
                        progress.setText("86%");
                        progressbar.setValue(86);
                    }else if(progressbar.getValue()==86){
                        progress.setText("87%");
                        progressbar.setValue(87);
                    }else if(progressbar.getValue()==87){
                        progress.setText("89%");
                        progressbar.setValue(89);
                    }else if(progressbar.getValue()==89){
                        progress.setText("90%");
                        progressbar.setValue(90);
                    }else if(progressbar.getValue()==90){
                        progress.setText("94%");
                        progressbar.setValue(94);
                    }else if(progressbar.getValue()==94){
                        progress.setText("96%");
                        progressbar.setValue(96);
                    }else if(progressbar.getValue()==96){
                        progress.setText("loading sales... 97%");
                        progressbar.setValue(97);
                    }else if(progressbar.getValue()==97){
progress.setText("trying to open database... 98%");
                        progressbar.setValue(98);
                    }else if(progressbar.getValue()==98){
progress.setText("Database open... 99%");                        
                        progressbar.setValue(99);
                        progressbar.setIndeterminate(true);
                    }else
                            if(progressbar.getValue()==99){
                                progress.setText("Loading software structure... 100%");                                
                                progressbar.setValue(100);
                                progressbar.setIndeterminate(true);
                           
                            }else if (progressbar.getValue()==100)
                            {
                                progressbar.setIndeterminate(true);
progress.setText("Done... 100%");

                            }
                }
            });
        time.start();      
        Timer h = new Timer(23000, (ActionEvent e) -> {
            //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
            if(time.isRunning()==true){
                time.stop();
                //JOptionPane.showMessageDialog(null, "oops");
                dispose();
                new login().setVisible(true);
            }
            });
        h.start();
        } catch (Exception e) {
        }    

            }
         
        });
i.start();

if(i.isInterrupted()){
new login().setVisible(true);
}


   
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loadpanel = new javax.swing.JPanel();
        progressbar = new javax.swing.JProgressBar();
        progress = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        loadpanel.setBackground(new java.awt.Color(0, 51, 102));

        progressbar.setBackground(new java.awt.Color(0, 0, 0));
        progressbar.setForeground(new java.awt.Color(0, 51, 102));
        progressbar.setToolTipText("");
        progressbar.setBorderPainted(false);
        progressbar.setString("10%");

        progress.setForeground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Welcome to Covenant Plus CMS backend as a staff you are resposible for all");

        jLabel2.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("transactions.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("@Copyright 2017 ShopAce by efeTheHero. All Rights Reserved");

        jLabel4.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("This is a private software under strict Copyright Law. ");

        javax.swing.GroupLayout loadpanelLayout = new javax.swing.GroupLayout(loadpanel);
        loadpanel.setLayout(loadpanelLayout);
        loadpanelLayout.setHorizontalGroup(
            loadpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loadpanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(loadpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loadpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(progressbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(loadpanelLayout.createSequentialGroup()
                        .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        loadpanelLayout.setVerticalGroup(
            loadpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loadpanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(progress)
                .addGap(18, 18, 18)
                .addComponent(progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loadpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loadpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(welcomeload.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcomeload.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcomeload.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcomeload.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcomeload().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel loadpanel;
    private javax.swing.JLabel progress;
    private javax.swing.JProgressBar progressbar;
    // End of variables declaration//GEN-END:variables
}
