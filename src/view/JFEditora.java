/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import util.Validadores;


public class JFEditora extends javax.swing.JFrame {

   
    public JFEditora() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFundo = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jlBarra = new javax.swing.JSeparator();
        jlNomeEditora = new javax.swing.JLabel();
        jlEnderecoEditora = new javax.swing.JLabel();
        jlTelefoneEditora = new javax.swing.JLabel();
        jlGerenteEditora = new javax.swing.JLabel();
        jtNomeEditora = new javax.swing.JTextField();
        jtEndereco = new javax.swing.JTextField();
        jformTelefone = new javax.swing.JFormattedTextField();
        jlSalvar = new javax.swing.JButton();
        jlEditar = new javax.swing.JButton();
        jlLimpar = new javax.swing.JButton();
        jlCancelar = new javax.swing.JButton();
        jtGerente = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jlCnpj = new javax.swing.JLabel();
        jtCnpj = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editora");

        jFundo.setBackground(new java.awt.Color(255, 255, 255));

        jlTitulo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("GERENCIA EDITORA");
        jlTitulo.setToolTipText("");

        jlNomeEditora.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlNomeEditora.setText("Nome Editora:");

        jlEnderecoEditora.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlEnderecoEditora.setText("Endereço:");

        jlTelefoneEditora.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlTelefoneEditora.setText("Telefone:");

        jlGerenteEditora.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlGerenteEditora.setText("Gerente:");

        jtNomeEditora.setToolTipText("Informe o nome completo");
        jtNomeEditora.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtNomeEditoraFocusLost(evt);
            }
        });
        jtNomeEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNomeEditoraActionPerformed(evt);
            }
        });
        jtNomeEditora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNomeEditoraKeyTyped(evt);
            }
        });

        jtEndereco.setToolTipText("Informe somente números");
        jtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEnderecoActionPerformed(evt);
            }
        });
        jtEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtEnderecoKeyTyped(evt);
            }
        });

        try {
            jformTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jformTelefone.setToolTipText("Informe somente números");
        jformTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jformTelefoneActionPerformed(evt);
            }
        });
        jformTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jformTelefoneKeyTyped(evt);
            }
        });

        jlSalvar.setText("Salvar");
        jlSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlSalvarActionPerformed(evt);
            }
        });

        jlEditar.setText("Editar");
        jlEditar.setEnabled(false);
        jlEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlEditarActionPerformed(evt);
            }
        });

        jlLimpar.setText("Limpar");
        jlLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlLimparActionPerformed(evt);
            }
        });

        jlCancelar.setText("Cancelar");
        jlCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlCancelarActionPerformed(evt);
            }
        });

        jtGerente.setToolTipText("Informe o nome completo");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", ""}
            },
            new String [] {
                "Nome Editora", "Endereço", "Telefone", "Gerente"
            }
        ));
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTable1KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jlCnpj.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlCnpj.setText("Cnpj:");

        jtCnpj.setToolTipText("Informe somente números");
        jtCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCnpjActionPerformed(evt);
            }
        });
        jtCnpj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCnpjKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jFundoLayout = new javax.swing.GroupLayout(jFundo);
        jFundo.setLayout(jFundoLayout);
        jFundoLayout.setHorizontalGroup(
            jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlBarra)
            .addGroup(jFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFundoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18))
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())))
            .addGroup(jFundoLayout.createSequentialGroup()
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFundoLayout.createSequentialGroup()
                        .addComponent(jlNomeEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtNomeEditora)
                        .addGap(241, 241, 241))
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlEnderecoEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtCnpj)
                            .addComponent(jtEndereco)))
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFundoLayout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(jlTitulo))
                            .addGroup(jFundoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jlSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jlEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 63, Short.MAX_VALUE))
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlTelefoneEditora)
                            .addComponent(jlGerenteEditora))
                        .addGap(38, 38, 38)
                        .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtGerente)
                            .addComponent(jformTelefone))))
                .addContainerGap())
        );
        jFundoLayout.setVerticalGroup(
            jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFundoLayout.createSequentialGroup()
                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNomeEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNomeEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlEnderecoEditora)
                    .addComponent(jtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCnpj)
                    .addComponent(jtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefoneEditora)
                    .addComponent(jformTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlGerenteEditora)
                    .addComponent(jtGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSalvar)
                    .addComponent(jlEditar)
                    .addComponent(jlLimpar)
                    .addComponent(jlCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));

        jMenu1.setBackground(new java.awt.Color(0, 0, 0));
        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(0, 0, 0));
        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jlCancelarActionPerformed

    private void jlLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlLimparActionPerformed
        jtNomeEditora.setText("");
        jtEndereco.setText("");
        jtCnpj.setText("");
        jformTelefone.setText("");
        jtGerente.setText("");
        jtNomeEditora.requestFocus();
    }//GEN-LAST:event_jlLimparActionPerformed

    private void jlEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlEditarActionPerformed

    private void jlSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlSalvarActionPerformed

    }//GEN-LAST:event_jlSalvarActionPerformed

    private void jtNomeEditoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNomeEditoraKeyTyped
        String Letras = "\"0123456789<>:?/~^}][{´`=+-_!|'\\'@#$%¨&*()²³£¢¬§º°ª\";";
        if (Letras.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jtNomeEditoraKeyTyped

    private void jtNomeEditoraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNomeEditoraFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNomeEditoraFocusLost

    private void jtCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCnpjActionPerformed
        
    }//GEN-LAST:event_jtCnpjActionPerformed

    private void jtEnderecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtEnderecoKeyTyped
       
    }//GEN-LAST:event_jtEnderecoKeyTyped

    private void jtNomeEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNomeEditoraActionPerformed
        
    }//GEN-LAST:event_jtNomeEditoraActionPerformed

    private void jTable1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyTyped

    private void jtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEnderecoActionPerformed

    private void jformTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jformTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jformTelefoneActionPerformed

    private void jformTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jformTelefoneKeyTyped
       
    }//GEN-LAST:event_jformTelefoneKeyTyped

    private void jtCnpjKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCnpjKeyTyped
        String number = "0123456789";
        if (jlCnpj.getText().length() < 11) {
            if (!number.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jtCnpjKeyTyped

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
            java.util.logging.Logger.getLogger(JFEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFEditora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jFundo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JFormattedTextField jformTelefone;
    private javax.swing.JSeparator jlBarra;
    private javax.swing.JButton jlCancelar;
    private javax.swing.JLabel jlCnpj;
    private javax.swing.JButton jlEditar;
    private javax.swing.JLabel jlEnderecoEditora;
    private javax.swing.JLabel jlGerenteEditora;
    private javax.swing.JButton jlLimpar;
    private javax.swing.JLabel jlNomeEditora;
    private javax.swing.JButton jlSalvar;
    private javax.swing.JLabel jlTelefoneEditora;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtCnpj;
    private javax.swing.JTextField jtEndereco;
    private javax.swing.JTextField jtGerente;
    private javax.swing.JTextField jtNomeEditora;
    // End of variables declaration//GEN-END:variables
}
