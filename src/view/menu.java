/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

public class menu extends javax.swing.JFrame {

    public static void setvisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFundo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbMenu = new javax.swing.JMenuBar();
        jmGerenciamento = new javax.swing.JMenu();
        jmCliente = new javax.swing.JMenuItem();
        jmEditora = new javax.swing.JMenuItem();
        jmLivro = new javax.swing.JMenuItem();
        jmVenda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jFundo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngtree-books-logo-image_80037.jpg"))); // NOI18N

        javax.swing.GroupLayout jFundoLayout = new javax.swing.GroupLayout(jFundo);
        jFundo.setLayout(jFundoLayout);
        jFundoLayout.setHorizontalGroup(
            jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFundoLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jFundoLayout.setVerticalGroup(
            jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFundoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jbMenu.setBackground(new java.awt.Color(0, 0, 0));

        jmGerenciamento.setBackground(new java.awt.Color(0, 0, 0));
        jmGerenciamento.setMnemonic('G');
        jmGerenciamento.setText("Gerenciamento");

        jmCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmCliente.setBackground(new java.awt.Color(0, 0, 0));
        jmCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img Icon/Icone Cliente (Escuro).png"))); // NOI18N
        jmCliente.setMnemonic('C');
        jmCliente.setText("Cliente");
        jmCliente.setToolTipText("Cad / Edit / List / Del Cliente");
        jmCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmClienteActionPerformed(evt);
            }
        });
        jmGerenciamento.add(jmCliente);

        jmEditora.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmEditora.setBackground(new java.awt.Color(0, 0, 0));
        jmEditora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img Icon/Icone Editora (Escuro).png"))); // NOI18N
        jmEditora.setMnemonic('E');
        jmEditora.setText("Editora");
        jmEditora.setToolTipText("Cad / Edit / List / Del Editora");
        jmEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEditoraActionPerformed(evt);
            }
        });
        jmGerenciamento.add(jmEditora);

        jmLivro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img Icon/Icone Livro (Escuro).png"))); // NOI18N
        jmLivro.setMnemonic('L');
        jmLivro.setText("Livro");
        jmLivro.setToolTipText("Cad / Edit / List / Del Livro");
        jmLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmLivroActionPerformed(evt);
            }
        });
        jmGerenciamento.add(jmLivro);

        jbMenu.add(jmGerenciamento);

        jmVenda.setBackground(new java.awt.Color(0, 0, 0));
        jmVenda.setText("Venda Livro");
        jbMenu.add(jmVenda);

        setJMenuBar(jbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmClienteActionPerformed
        JFCliente janelaCliente = new JFCliente();
        janelaCliente.setVisible(true);
    }//GEN-LAST:event_jmClienteActionPerformed

    private void jmEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEditoraActionPerformed
        JFEditora janelaEditora = new JFEditora();
        janelaEditora.setVisible(true);
    }//GEN-LAST:event_jmEditoraActionPerformed

    private void jmLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmLivroActionPerformed
        JFLivro janelaLivro = new JFLivro();
        janelaLivro.setVisible(true);
    }//GEN-LAST:event_jmLivroActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jFundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jbMenu;
    private javax.swing.JMenuItem jmCliente;
    private javax.swing.JMenuItem jmEditora;
    private javax.swing.JMenu jmGerenciamento;
    private javax.swing.JMenuItem jmLivro;
    private javax.swing.JMenu jmVenda;
    // End of variables declaration//GEN-END:variables
}
