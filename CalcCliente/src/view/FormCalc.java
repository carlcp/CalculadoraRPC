/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import Service.ICalc;
/**
 *
 * @author 834398
 */
public class FormCalc extends javax.swing.JFrame {

    /**
     * Creates new form FormDataHora
     */
    public FormCalc() {
        initComponents();
         txtResult.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLog = new javax.swing.JButton();
        txtNum1 = new javax.swing.JTextField();
        btnDiv = new javax.swing.JButton();
        txtNum2 = new javax.swing.JTextField();
        btnSub = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();
        txtResult = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSoma = new javax.swing.JButton();
        btnPot = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLog.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnLog.setText("Log(10");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        txtNum1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btnDiv.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnDiv.setText("/");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        txtNum2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btnSub.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSub.setText("-");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });

        btnMult.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMult.setText("*");
        btnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultActionPerformed(evt);
            }
        });

        txtResult.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Numero 2 ou potencia / caso log ignorar essa linha");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Numero 1");

        btnSoma.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSoma.setText("+");
        btnSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomaActionPerformed(evt);
            }
        });

        btnPot.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnPot.setText("X^Y");
        btnPot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNum2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtNum1)
                            .addComponent(txtResult))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPot)
                            .addComponent(btnLog)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMult)
                    .addComponent(btnDiv)
                    .addComponent(btnLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
    
        // TODO add your handling code here:
        float num1 = Float.parseFloat(txtNum1.getText());
      
        
        try{
            
            //indicar o servidor remoto
            
            Registry srv = LocateRegistry.getRegistry(ICalc.HOST,
                    ICalc.PORTA
                  
                    
                    
            );
                    
            //Descobrir Operacoes Disponiveis
            ICalc op = (ICalc)srv.lookup(ICalc.NOME
            );
            
            //Chamar operação
            
            txtResult.setText(op.getLog(num1));
            
            
        }catch (Exception e){
            
            System.err.println("ERRO:" + e.getMessage());
            
        }
               
        
    }//GEN-LAST:event_btnLogActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
      
        // TODO add your handling code here:
        float num1 = Float.parseFloat(txtNum1.getText());
        float num2 = Float.parseFloat(txtNum2.getText());
        try{
            
            //indicar o servidor remoto
            
            Registry srv = LocateRegistry.getRegistry(ICalc.HOST,
                    ICalc.PORTA
                  
                    
                    
            );
                    
            //Descobrir Operacoes Disponiveis
            ICalc op = (ICalc)srv.lookup(ICalc.NOME
            );
            
            //Chamar operação
            
            txtResult.setText(op.getDiv(num1,num2));
            
            
        }catch (Exception e){
            
            System.err.println("ERRO:" + e.getMessage());
            
        }
        
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        float num1 = Float.parseFloat(txtNum1.getText());
        float num2 = Float.parseFloat(txtNum2.getText());
        try{
            
            //indicar o servidor remoto
            
            Registry srv = LocateRegistry.getRegistry(ICalc.HOST,
                    ICalc.PORTA
                  
                    
                    
            );
                    
            //Descobrir Operacoes Disponiveis
            ICalc op = (ICalc)srv.lookup(ICalc.NOME
            );
            
            //Chamar operação
            
            txtResult.setText(op.getSub(num1,num2));
            
            
        }catch (Exception e){
            
            System.err.println("ERRO:" + e.getMessage());
            
        }
    }//GEN-LAST:event_btnSubActionPerformed

    private void btnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        float num1 = Float.parseFloat(txtNum1.getText());
        float num2 = Float.parseFloat(txtNum2.getText());
        try{
            
            //indicar o servidor remoto
            
            Registry srv = LocateRegistry.getRegistry(ICalc.HOST,
                    ICalc.PORTA
                  
                    
                    
            );
                    
            //Descobrir Operacoes Disponiveis
            ICalc op = (ICalc)srv.lookup(ICalc.NOME
            );
            
            //Chamar operação
            
            txtResult.setText(op.getMult(num1,num2));
            
            
        }catch (Exception e){
            
            System.err.println("ERRO:" + e.getMessage());
            
        }
    }//GEN-LAST:event_btnMultActionPerformed

    private void btnSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomaActionPerformed
        // TODO add your handling code here:
        float num1 = Float.parseFloat(txtNum1.getText());
        float num2 = Float.parseFloat(txtNum2.getText());
        
        try{
            
            //indicar o servidor remoto
            
            Registry srv = LocateRegistry.getRegistry(ICalc.HOST,
                    ICalc.PORTA
                  
                    
                    
            );
                    
            //Descobrir Operacoes Disponiveis
            ICalc op = (ICalc)srv.lookup(ICalc.NOME
            );
            
            //Chamar operação
            
            txtResult.setText(op.getSoma(num1,num2));
            
            
        }catch (Exception e){
            
            System.err.println("ERRO:" + e.getMessage());
            
        }
    }//GEN-LAST:event_btnSomaActionPerformed

    private void btnPotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotActionPerformed
        // TODO add your handling code here:
        float num1 = Float.parseFloat(txtNum1.getText());
        float num2 = Float.parseFloat(txtNum2.getText());
        
        try{
            
            //indicar o servidor remoto
            
            Registry srv = LocateRegistry.getRegistry(ICalc.HOST,
                    ICalc.PORTA
                  
                    
                    
            );
                    
            //Descobrir Operacoes Disponiveis
            ICalc op = (ICalc)srv.lookup(ICalc.NOME
            );
            
            //Chamar operação
            
            txtResult.setText(op.getPot(num1,num2));
            
            
        }catch (Exception e){
            
            System.err.println("ERRO:" + e.getMessage());
            
        }
    }//GEN-LAST:event_btnPotActionPerformed

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
            java.util.logging.Logger.getLogger(FormCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnMult;
    private javax.swing.JButton btnPot;
    private javax.swing.JButton btnSoma;
    private javax.swing.JButton btnSub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}