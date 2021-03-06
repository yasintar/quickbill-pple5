
import MyFrames.FormCashier;
import MyFrames.PerPro;
import MyFrames.PerDay;
import MyFrames.Transaction;
import MyFrames.FormItem;
import MyFrames.ViewCashier;
import MyFrames.ViewProduct;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

public class AdminPage extends javax.swing.JFrame {

    public AdminPage() {
        initComponents();
    }
    
    public void close(){
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        desktop = new javax.swing.JDesktopPane();
        Cashview = new javax.swing.JButton();
        StockView = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tran.png"))); // NOI18N
        jButton3.setText("Transaction");
        jButton3.setContentAreaFilled(false);

        jButton5.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 102));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sale.png"))); // NOI18N
        jButton5.setText("Sales");
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quick Bill");
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1350, 680));

        Cashview.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Cashview.setForeground(new java.awt.Color(0, 0, 102));
        Cashview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyFrames/7-32.png"))); // NOI18N
        Cashview.setText("Cashier");
        Cashview.setBorder(null);
        Cashview.setContentAreaFilled(false);
        Cashview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashviewActionPerformed(evt);
            }
        });
        getContentPane().add(Cashview, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 130, 40));

        StockView.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        StockView.setForeground(new java.awt.Color(0, 0, 102));
        StockView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock.png"))); // NOI18N
        StockView.setText("Stock");
        StockView.setContentAreaFilled(false);
        StockView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockViewActionPerformed(evt);
            }
        });
        getContentPane().add(StockView, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, 40));

        ExitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(0, 0, 102));
        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.setContentAreaFilled(false);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 23, 110, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageedit_1_7245834402.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snowfall-on-light-blue-seamless-loop-christmas-background-4k-4096x2304_nj20ohzxx__F0000.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CashviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashviewActionPerformed

        FormCashier ac=new FormCashier();
        this.desktop.add(ac);
        ac.setVisible(true);
    }//GEN-LAST:event_CashviewActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void StockViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockViewActionPerformed
        FormItem us=new FormItem();
        this.desktop.add(us);
        us.setVisible(true);  // stock add  TODO add your handling code here:
    }//GEN-LAST:event_StockViewActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ViewProduct vs=new ViewProduct();
        this.desktop.add(vs);
        vs.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();
        AdminLogin admin=new AdminLogin();
        admin.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdminPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cashview;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton StockView;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    // End of variables declaration//GEN-END:variables
  
}
