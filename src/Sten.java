/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.util.Random;

/**
 *
 * @author edvin.bergstrom
 */


public class Sten extends javax.swing.JPanel {

    /**
     * Creates new form Sten
     */
    public Sten() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        jTextField1.setText("jTextField1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.out.println("kanapp 1");
                jButton1ActionPerformed(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.out.println("kanapp 1");
                jButton1ActionPerformed(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.out.println("kanapp 1");
                jButton1ActionPerformed(evt);
            }
        });


        jTextField2.setText("jTextField2");

        jButton4.setText("jButton4");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addComponent(jButton1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3))
                                .addContainerGap(11, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton4)
                                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2)
                                        .addComponent(jButton1)
                                        .addComponent(jButton3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(76, 76, 76)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(68, Short.MAX_VALUE))
        );
    }// </editor-fold>
    public static void main(String args[]) {
        System.out.println("main");
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
            java.util.logging.Logger.getLogger(Sten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.add(new Sten());
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        //sten
        String spellare = "Sten";
        Random ra = new Random();
        String dator = "";
        int tal = 0;
        String text;
        if (ra.nextInt(2) +1 == 1){
            dator = "Sten";
            jTextField1.setText("Datorn valde " + dator);
            jTextField2.setText("Det blev lika");
            text = jTextArea1.getText();
            jTextArea1.setText(text + " \r Lika");
        }
        else if (ra.nextInt(2) +1 == 2){
            dator = "Sax";
            jTextField1.setText("Datorn valde " + dator);
            jTextField2.setText("Du vann");
            text = jTextArea1.getText();
            jTextArea1.setText(text + " \r Vann");
        }
        else {
            dator = "P�se";
            jTextField1.setText("Datorn valde " + dator);
            jTextField2.setText("Datorn vann");
            text = jTextArea1.getText();
            jTextArea1.setText(text + " \r F�rlorade");
        }


    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        //sax
        String spellare = "Sax";
        Random ra = new Random();
        String dator = "";
        int tal = 0;
        String text;
        if (ra.nextInt(2) +1 == 1){
            dator = "Sten";
            jTextField1.setText("Datorn valde " + dator);
            jTextField2.setText("F�rlust");
            text = jTextArea1.getText();
            jTextArea1.setText(text + " \r F�rlust");
        }
        else if (ra.nextInt(2) +1 == 2){
            dator = "Sax";
            jTextField1.setText("Datorn valde " + dator);
            jTextField2.setText("Lika");
            text = jTextArea1.getText();
            jTextArea1.setText(text + " \r Lika");
        }
        else {
            dator = "P�se";
            jTextField1.setText("Datorn valde " + dator);
            jTextField2.setText("Du vann");
            text = jTextArea1.getText();
            jTextArea1.setText(text + " \r Vinst");
        }
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        //sten
        String spellare = "P�se";
        Random ra = new Random();
        String dator;
        int tal = 0;
        String text;
        if (ra.nextInt(2) +1 == 1){
            dator = "Sten";
            jTextField1.setText("Datorn valde " + dator);
            jTextField2.setText("vinst");
            text = jTextArea1.getText();
            jTextArea1.setText(text + " \r Vann");
        }
        else if (ra.nextInt(2) +1 == 2){
            dator = "Sax";
            jTextField1.setText("Datorn valde " + dator);
            jTextField2.setText("F�rlust");
            text = jTextArea1.getText();
            jTextArea1.setText(text + " \r F�rlust");
        }
        else {
            dator = "P�se";
            jTextField1.setText("Datorn valde " + dator);
            jTextField2.setText("Lika");
            text = jTextArea1.getText();
            jTextArea1.setText(text + " \r Lika");
        }


    }


    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration
}