package com.mycompany.atm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jair
 */
public class AtmAbono extends javax.swing.JFrame {

    int id = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AtmAbono() {
        initComponents();
        DisplayDinero.setEnabled(false);
        Bt1.setEnabled(false);
        Bt2.setEnabled(false);
        Bt3.setEnabled(false);
        Bt4.setEnabled(false);
        Bt5.setEnabled(false);
        Bt6.setEnabled(false);
        Bt7.setEnabled(false);
        Bt8.setEnabled(false);
        Bt9.setEnabled(false);
        Bt0.setEnabled(false);
        BtClear.setEnabled(false);
    }

    public AtmAbono(int id) {
        initComponents();
        DisplayDinero.setEnabled(false);
        Bt1.setEnabled(false);
        Bt2.setEnabled(false);
        Bt3.setEnabled(false);
        Bt4.setEnabled(false);
        Bt5.setEnabled(false);
        Bt6.setEnabled(false);
        Bt7.setEnabled(false);
        Bt8.setEnabled(false);
        Bt9.setEnabled(false);
        Bt0.setEnabled(false);
        BtClear.setEnabled(false);
        setId(id);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton21 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Bt7 = new javax.swing.JButton();
        Bt8 = new javax.swing.JButton();
        Bt9 = new javax.swing.JButton();
        BtCancel = new javax.swing.JButton();
        Display = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        DisplayDinero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Bt4 = new javax.swing.JButton();
        Bt5 = new javax.swing.JButton();
        Bt6 = new javax.swing.JButton();
        BtClear = new javax.swing.JButton();
        BtAccept = new javax.swing.JButton();
        Bt3 = new javax.swing.JButton();
        Bt1 = new javax.swing.JButton();
        Bt2 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        Bt0 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        BtOtra = new javax.swing.JButton();
        Bt10000 = new javax.swing.JButton();
        Bt1000 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Bt100 = new javax.swing.JButton();

        jButton21.setText("jButton21");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bt7.setText("7");
        Bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt7ActionPerformed(evt);
            }
        });
        jPanel1.add(Bt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 50, 50));

        Bt8.setText("8");
        Bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt8ActionPerformed(evt);
            }
        });
        jPanel1.add(Bt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 50, 50));

        Bt9.setText("9");
        Bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt9ActionPerformed(evt);
            }
        });
        jPanel1.add(Bt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 50, 50));

        BtCancel.setBackground(new java.awt.Color(255, 0, 0));
        BtCancel.setText("CANCEL");
        BtCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCancelActionPerformed(evt);
            }
        });
        jPanel1.add(BtCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 130, 50));

        Display.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cantidad a abonar:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("$100.00");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("$1000.00");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("$10000.00");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Otra cantidad");

        javax.swing.GroupLayout DisplayLayout = new javax.swing.GroupLayout(Display);
        Display.setLayout(DisplayLayout);
        DisplayLayout.setHorizontalGroup(
            DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DisplayLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(DisplayLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DisplayDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157))
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(19, 19, 19))
        );
        DisplayLayout.setVerticalGroup(
            DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DisplayDinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(1, 1, 1)
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addGap(47, 47, 47)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(39, 39, 39))
        );

        jPanel1.add(Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 390, 260));

        Bt4.setText("4");
        Bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt4ActionPerformed(evt);
            }
        });
        jPanel1.add(Bt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 50, 50));

        Bt5.setText("5");
        Bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt5ActionPerformed(evt);
            }
        });
        jPanel1.add(Bt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 50, 50));

        Bt6.setText("6");
        Bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt6ActionPerformed(evt);
            }
        });
        jPanel1.add(Bt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 50, 50));

        BtClear.setBackground(new java.awt.Color(255, 102, 0));
        BtClear.setForeground(new java.awt.Color(0, 0, 0));
        BtClear.setText("CLEAR");
        BtClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtClearActionPerformed(evt);
            }
        });
        jPanel1.add(BtClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 130, 50));

        BtAccept.setBackground(new java.awt.Color(51, 204, 0));
        BtAccept.setText("ACCEPT");
        BtAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAcceptActionPerformed(evt);
            }
        });
        jPanel1.add(BtAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 130, 50));

        Bt3.setText("3");
        Bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt3ActionPerformed(evt);
            }
        });
        jPanel1.add(Bt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 50, 50));

        Bt1.setText("1");
        Bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt1ActionPerformed(evt);
            }
        });
        jPanel1.add(Bt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 50, 50));

        Bt2.setText("2");
        Bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt2ActionPerformed(evt);
            }
        });
        jPanel1.add(Bt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 50, 50));
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 50, 50));

        Bt0.setText("0");
        Bt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt0ActionPerformed(evt);
            }
        });
        jPanel1.add(Bt0, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, 50, 50));
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, 50, 50));
        jPanel1.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, 130, 50));

        BtOtra.setText("<-");
        BtOtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtOtraActionPerformed(evt);
            }
        });
        jPanel1.add(BtOtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 100, 50));

        Bt10000.setText("<-");
        Bt10000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt10000ActionPerformed(evt);
            }
        });
        jPanel1.add(Bt10000, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 100, 50));

        Bt1000.setText("<-");
        Bt1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt1000ActionPerformed(evt);
            }
        });
        jPanel1.add(Bt1000, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 100, 50));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Adobe Gothic Std B", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CASH");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel1)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 390, 80));

        Bt100.setText("<-");
        Bt100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt100ActionPerformed(evt);
            }
        });
        jPanel1.add(Bt100, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 100, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt7ActionPerformed
        String numero = DisplayDinero.getText();
        numero += "7";
        DisplayDinero.setText(numero);
    }//GEN-LAST:event_Bt7ActionPerformed

    private void Bt100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt100ActionPerformed
        DisplayDinero.setText("100");
    }//GEN-LAST:event_Bt100ActionPerformed

    private void BtOtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtOtraActionPerformed
        Bt1.setEnabled(true);
        Bt2.setEnabled(true);
        Bt3.setEnabled(true);
        Bt4.setEnabled(true);
        Bt5.setEnabled(true);
        Bt6.setEnabled(true);
        Bt7.setEnabled(true);
        Bt8.setEnabled(true);
        Bt9.setEnabled(true);
        Bt0.setEnabled(true);
        BtClear.setEnabled(true);
        BtCancel.setEnabled(true);
    }//GEN-LAST:event_BtOtraActionPerformed

    private void Bt1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt1000ActionPerformed
        DisplayDinero.setText("1000");
    }//GEN-LAST:event_Bt1000ActionPerformed

    private void Bt10000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt10000ActionPerformed
        DisplayDinero.setText("10000");
    }//GEN-LAST:event_Bt10000ActionPerformed

    private void Bt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt0ActionPerformed
        String numero = DisplayDinero.getText();
        numero += "0";
        DisplayDinero.setText(numero);
    }//GEN-LAST:event_Bt0ActionPerformed

    private void BtClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtClearActionPerformed
        DisplayDinero.setText("");
    }//GEN-LAST:event_BtClearActionPerformed

    private void Bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt1ActionPerformed
        String numero = DisplayDinero.getText();
        numero += "1";
        DisplayDinero.setText(numero);
    }//GEN-LAST:event_Bt1ActionPerformed

    private void Bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt2ActionPerformed
        String numero = DisplayDinero.getText();
        numero += "2";
        DisplayDinero.setText(numero);
    }//GEN-LAST:event_Bt2ActionPerformed

    private void Bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt3ActionPerformed
        String numero = DisplayDinero.getText();
        numero += "3";
        DisplayDinero.setText(numero);
    }//GEN-LAST:event_Bt3ActionPerformed

    private void Bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt4ActionPerformed
        String numero = DisplayDinero.getText();
        numero += "4";
        DisplayDinero.setText(numero);
    }//GEN-LAST:event_Bt4ActionPerformed

    private void Bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt5ActionPerformed
        String numero = DisplayDinero.getText();
        numero += "5";
        DisplayDinero.setText(numero);
    }//GEN-LAST:event_Bt5ActionPerformed

    private void Bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt6ActionPerformed
        String numero = DisplayDinero.getText();
        numero += "6";
        DisplayDinero.setText(numero);
    }//GEN-LAST:event_Bt6ActionPerformed

    private void Bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt8ActionPerformed
        String numero = DisplayDinero.getText();
        numero += "8";
        DisplayDinero.setText(numero);
    }//GEN-LAST:event_Bt8ActionPerformed

    private void Bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt9ActionPerformed
        String numero = DisplayDinero.getText();
        numero += "9";
        DisplayDinero.setText(numero);
    }//GEN-LAST:event_Bt9ActionPerformed

    private void BtCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCancelActionPerformed
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cuenta(id).setVisible(true);
            }
        });
    }//GEN-LAST:event_BtCancelActionPerformed

    private void BtAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAcceptActionPerformed
        connection con = new connection();
        Archivos arch = new Archivos();
        int id = getId();
        double retiro = 0.0, dinero = 0.0, saldo = 0.0;
        retiro = Double.parseDouble(DisplayDinero.getText());
        dinero = con.ConsultaDinero(id);
        if (retiro <= 0 || retiro > 10000) {
            JOptionPane.showMessageDialog(this, "Cantidad equivocada");
        } else {
            saldo = dinero + retiro;
            Persona persona = new Persona(retiro, id);
            try {
                arch.actualizarArchivoDeposito(persona);
            } catch (IOException ex) {
                Logger.getLogger(AtmAbono.class.getName()).log(Level.SEVERE, null, ex);
            }
            con.actualizarDinero(id, String.valueOf(saldo));
        }
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cuenta(id).setVisible(true);
            }
        });
    }//GEN-LAST:event_BtAcceptActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt0;
    private javax.swing.JButton Bt1;
    private javax.swing.JButton Bt100;
    private javax.swing.JButton Bt1000;
    private javax.swing.JButton Bt10000;
    private javax.swing.JButton Bt2;
    private javax.swing.JButton Bt3;
    private javax.swing.JButton Bt4;
    private javax.swing.JButton Bt5;
    private javax.swing.JButton Bt6;
    private javax.swing.JButton Bt7;
    private javax.swing.JButton Bt8;
    private javax.swing.JButton Bt9;
    private javax.swing.JButton BtAccept;
    private javax.swing.JButton BtCancel;
    private javax.swing.JButton BtClear;
    private javax.swing.JButton BtOtra;
    private javax.swing.JPanel Display;
    private javax.swing.JTextField DisplayDinero;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton21;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
