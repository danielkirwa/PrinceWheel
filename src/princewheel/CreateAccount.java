/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princewheel;

import java.awt.event.ItemEvent;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author owner
 */
public class CreateAccount extends javax.swing.JFrame {

    /**
     * Creates new form CreateAccount
     */
    public CreateAccount() {
        initComponents();
        
        
    }
      final void createaccountprogress(){
    
        try{
            int x;
             if(!"".equals(txtfname.getText()) && !"".equals(txtmname.getText())&& !"".equals(txtidnumber.getText()) && !"".equals(txtecode.getText())
                    && !"".equals(txtemail.getText()) && !"".equals(cmbaccount.getSelectedItem()) && !"".equals(jppassword.getText())&& !"".equals(jpconfirmpassword.getText())){
            x = 70;
            Thread.sleep( x);
            progressbar.setValue(x);
            lbpercent.setText(Integer.toString(x)+"%");
            }
             else if(!"".equals(txtfname.getText()) && !"".equals(txtmname.getText())&& !"".equals(txtidnumber.getText()) && !"".equals(txtecode.getText())
                    && !"".equals(txtemail.getText()) && !"".equals(cmbaccount.getSelectedItem()) && !"".equals(jppassword.getText())){
            x = 60;
            Thread.sleep( x);
            progressbar.setValue(x);
            lbpercent.setText(Integer.toString(x)+"%");
            }
             else if(!"".equals(txtfname.getText()) && !"".equals(txtmname.getText())&& !"".equals(txtidnumber.getText()) && !"".equals(txtecode.getText())
                    && !"".equals(txtemail.getText()) && !"".equals(cmbaccount.getSelectedItem())){
            x = 50;
            Thread.sleep( x);
            progressbar.setValue(x);
            lbpercent.setText(Integer.toString(x)+"%");
            }
            else if(!"".equals(txtfname.getText()) && !"".equals(txtmname.getText())&& !"".equals(txtidnumber.getText()) && !"".equals(txtecode.getText())
                    && !"".equals(txtemail.getText())){
            x = 40;
            Thread.sleep( x);
            progressbar.setValue(x);
            lbpercent.setText(Integer.toString(x)+"%");
            }
            else if(!"".equals(txtfname.getText()) && !"".equals(txtmname.getText())&& !"".equals(txtidnumber.getText()) && !"".equals(txtecode.getText())){
            x = 30;
            Thread.sleep( x);
            progressbar.setValue(x);
            lbpercent.setText(Integer.toString(x)+"%");
            }else if(!"".equals(txtfname.getText()) && !"".equals(txtmname.getText())&& !"".equals(txtidnumber.getText())){
            x = 20;
            Thread.sleep( x);
            progressbar.setValue(x);
            lbpercent.setText(Integer.toString(x)+"%");
            }else if(!"".equals(txtfname.getText()) && !"".equals(txtmname.getText())){
            x = 10;
            Thread.sleep( x);
            progressbar.setValue(x);
            lbpercent.setText(Integer.toString(x)+"%");
            }
           else{
                 x = 0;
            Thread.sleep( x);
            progressbar.setValue(x);
            lbpercent.setText(Integer.toString(x)+"%");
            }
    
        }
        catch(InterruptedException ex){
           
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btncreate = new javax.swing.JButton();
        btnquit = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnaddimage = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtlname = new javax.swing.JTextField();
        txtidnumber = new javax.swing.JTextField();
        txtecode = new javax.swing.JTextField();
        txtfname = new javax.swing.JTextField();
        txtmname = new javax.swing.JTextField();
        jpconfirmpassword = new javax.swing.JPasswordField();
        jppassword = new javax.swing.JPasswordField();
        btnshowpass = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        cmbaccount = new javax.swing.JComboBox<>();
        progressbar = new javax.swing.JProgressBar();
        jLabel9 = new javax.swing.JLabel();
        lbpercent = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("PRINCE WHEEL");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(880, 477));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(204, 204, 204)));
        jPanel2.setLayout(null);

        btncreate.setFont(new java.awt.Font("Wide Latin", 2, 12)); // NOI18N
        btncreate.setText("CREATE ACCOUNT NOW");
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });
        jPanel2.add(btncreate);
        btncreate.setBounds(40, 410, 320, 40);

        btnquit.setFont(new java.awt.Font("Wide Latin", 2, 12)); // NOI18N
        btnquit.setText("QUIT");
        btnquit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquitActionPerformed(evt);
            }
        });
        jPanel2.add(btnquit);
        btnquit.setBounds(600, 420, 180, 40);

        btnreset.setFont(new java.awt.Font("Wide Latin", 2, 12)); // NOI18N
        btnreset.setText("RESET");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        jPanel2.add(btnreset);
        btnreset.setBounds(390, 410, 150, 40);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 204, 255), 3, true));
        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel7.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel4);
        jPanel4.setBounds(420, 20, 260, 240);

        btnaddimage.setBackground(new java.awt.Color(255, 255, 255));
        btnaddimage.setText("ADD IMAGE");
        btnaddimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddimageActionPerformed(evt);
            }
        });
        jPanel3.add(btnaddimage);
        btnaddimage.setBounds(480, 273, 180, 30);

        jLabel1.setText("FULL NAME :");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(20, 30, 70, 14);

        jLabel2.setText("ID NUMBER  :");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(20, 100, 70, 14);

        jLabel3.setText("E-CODE  :");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(20, 150, 60, 14);

        jLabel4.setText("EMAIL :");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(20, 190, 37, 14);

        jLabel5.setText("PASSWORD :");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(20, 270, 64, 14);

        jLabel6.setText("CONFIRM PASSWORD :");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(20, 310, 120, 14);

        txtemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtemailFocusGained(evt);
            }
        });
        jPanel3.add(txtemail);
        txtemail.setBounds(110, 180, 120, 20);

        txtlname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlnameActionPerformed(evt);
            }
        });
        jPanel3.add(txtlname);
        txtlname.setBounds(110, 60, 120, 20);

        txtidnumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtidnumberFocusGained(evt);
            }
        });
        jPanel3.add(txtidnumber);
        txtidnumber.setBounds(110, 100, 120, 20);

        txtecode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtecodeFocusGained(evt);
            }
        });
        jPanel3.add(txtecode);
        txtecode.setBounds(110, 140, 120, 20);
        jPanel3.add(txtfname);
        txtfname.setBounds(110, 30, 120, 20);

        txtmname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmnameActionPerformed(evt);
            }
        });
        jPanel3.add(txtmname);
        txtmname.setBounds(260, 30, 130, 20);

        jpconfirmpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpconfirmpasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jpconfirmpasswordFocusLost(evt);
            }
        });
        jPanel3.add(jpconfirmpassword);
        jpconfirmpassword.setBounds(150, 300, 190, 20);

        jppassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jppasswordFocusGained(evt);
            }
        });
        jppassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jppasswordActionPerformed(evt);
            }
        });
        jPanel3.add(jppassword);
        jppassword.setBounds(150, 260, 190, 20);

        btnshowpass.setBackground(new java.awt.Color(255, 255, 255));
        btnshowpass.setText("Show password");
        btnshowpass.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnshowpassStateChanged(evt);
            }
        });
        btnshowpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowpassActionPerformed(evt);
            }
        });
        jPanel3.add(btnshowpass);
        btnshowpass.setBounds(190, 330, 120, 23);

        jLabel8.setText("ACCOUNT :");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(20, 220, 70, 14);

        cmbaccount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AGENT", "ENGINEER" }));
        cmbaccount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbaccountFocusGained(evt);
            }
        });
        jPanel3.add(cmbaccount);
        cmbaccount.setBounds(110, 220, 120, 20);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(50, 20, 710, 370);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(40, 30, 810, 470);

        progressbar.setBackground(new java.awt.Color(255, 255, 255));
        progressbar.setForeground(new java.awt.Color(0, 102, 0));
        jPanel1.add(progressbar);
        progressbar.setBounds(280, 10, 450, 14);

        jLabel9.setText("Complete at least 70% to create account ...");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 10, 240, 14);

        lbpercent.setText("0.0%");
        jPanel1.add(lbpercent);
        lbpercent.setBounds(780, 10, 50, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jppasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jppasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jppasswordActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        txtfname.setText("");
        txtmname.setText("");
        txtlname.setText("");
        txtemail.setText("");
        txtecode.setText("");
        txtidnumber.setText("");
        jppassword.setText("");
        jpconfirmpassword.setText("");
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnshowpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowpassActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnshowpassActionPerformed

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
        // TODO add your handling code here:
        // if password match
        char[] pass1 = jppassword.getPassword();
        char [] pass2 = jpconfirmpassword.getPassword();
        
        if(Arrays.equals(pass1, pass2)){
           
           int redirector = cmbaccount.getSelectedIndex();
           
           
           if(redirector == 0){
               JOptionPane.showMessageDialog(null, "<html><i style=\"color: green;\">AGENT ACCOUNT CREATED</i></html>","PRINCE WHEEL",JOptionPane.INFORMATION_MESSAGE);
               this.dispose();
               new AgentHome().setVisible(true);
           }else if(redirector == 1){
               
            JOptionPane.showMessageDialog(null, "<HTML><i style=\"color: green; font-size: 12px;\">ENGINEER ACCOUNT CREATED</i></HTML>","PRINCE WHEEL",JOptionPane.INFORMATION_MESSAGE);   
           
           }
        } 
        else{
           
            JOptionPane.showMessageDialog(null,"<html><i style=\"color: red;\">Password do not Match</i></html>","PRINCE WHEEL",JOptionPane.WARNING_MESSAGE);
    
    }
    }//GEN-LAST:event_btncreateActionPerformed

    private void btnquitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquitActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Loader().setVisible(true);
    }//GEN-LAST:event_btnquitActionPerformed

    private void btnaddimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddimageActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_btnaddimageActionPerformed

    private void txtlnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlnameActionPerformed

    private void txtmnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmnameActionPerformed
        // TODO add your handling code here:
        //createaccountprogress();
    }//GEN-LAST:event_txtmnameActionPerformed

    private void txtidnumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtidnumberFocusGained
        // TODO add your handling code here:
        createaccountprogress();
    }//GEN-LAST:event_txtidnumberFocusGained

    private void txtecodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtecodeFocusGained
        // TODO add your handling code here:
        createaccountprogress();
    }//GEN-LAST:event_txtecodeFocusGained

    private void txtemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusGained
        // TODO add your handling code here:
        createaccountprogress();
    }//GEN-LAST:event_txtemailFocusGained

    private void cmbaccountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbaccountFocusGained
        // TODO add your handling code here:
        createaccountprogress();
    }//GEN-LAST:event_cmbaccountFocusGained

    private void jppasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jppasswordFocusGained
        // TODO add your handling code here:
        createaccountprogress();
    }//GEN-LAST:event_jppasswordFocusGained

    private void jpconfirmpasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpconfirmpasswordFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jpconfirmpasswordFocusGained

    private void jpconfirmpasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpconfirmpasswordFocusLost
        // TODO add your handling code here:
        createaccountprogress();
    }//GEN-LAST:event_jpconfirmpasswordFocusLost

    private void btnshowpassStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnshowpassStateChanged
        // TODO add your handling code here:
        btnshowpass.addItemListener((ItemEvent e) ->{
         if(e.getStateChange() == ItemEvent.SELECTED){
             jppassword.setEchoChar((char) 0); 
            jpconfirmpassword.setEchoChar((char) 0);
         }else{
            jppassword.setEchoChar('\u25cf'); 
            jpconfirmpassword.setEchoChar('\u25cf');
         }
        });


        
    }//GEN-LAST:event_btnshowpassStateChanged

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
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddimage;
    private javax.swing.JButton btncreate;
    private javax.swing.JButton btnquit;
    private javax.swing.JButton btnreset;
    private javax.swing.JCheckBox btnshowpass;
    private javax.swing.JComboBox<String> cmbaccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jpconfirmpassword;
    private javax.swing.JPasswordField jppassword;
    private javax.swing.JLabel lbpercent;
    public static javax.swing.JProgressBar progressbar;
    private javax.swing.JTextField txtecode;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtidnumber;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtmname;
    // End of variables declaration//GEN-END:variables
}
