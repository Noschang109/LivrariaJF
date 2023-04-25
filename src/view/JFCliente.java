package view;

import DAO.ClienteDAO;
import Model.Cliente;
import Services.ClienteServicos;
import Services.FactoryServicos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.Validadores;

public class JFCliente extends javax.swing.JFrame {

    public JFCliente() {
        initComponents();
        addRowToTable();
        JbDeletar.setVisible(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFundo = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jlBarra = new javax.swing.JSeparator();
        jlNome = new javax.swing.JLabel();
        jlCPF = new javax.swing.JLabel();
        jlEndereco = new javax.swing.JLabel();
        jlTelefone = new javax.swing.JLabel();
        jtextNome = new javax.swing.JTextField();
        jtextCPF = new javax.swing.JTextField();
        jtextEndereco = new javax.swing.JTextField();
        jformTelefone = new javax.swing.JFormattedTextField();
        jbSalvar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        Tabela = new javax.swing.JScrollPane();
        jbTabela1 = new javax.swing.JTable();
        JbDeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cliente");

        jFundo.setBackground(new java.awt.Color(255, 255, 255));
        jFundo.setForeground(new java.awt.Color(255, 255, 255));

        jlTitulo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("GERENCIA CLIENTE");
        jlTitulo.setToolTipText("");

        jlNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlNome.setForeground(new java.awt.Color(0, 0, 0));
        jlNome.setText("* Nome:");
        jlNome.setToolTipText("");

        jlCPF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlCPF.setForeground(new java.awt.Color(0, 0, 0));
        jlCPF.setText("* CPF:");
        jlCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jlCPFFocusLost(evt);
            }
        });

        jlEndereco.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlEndereco.setForeground(new java.awt.Color(0, 0, 0));
        jlEndereco.setText("* Endereço:");

        jlTelefone.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlTelefone.setForeground(new java.awt.Color(0, 0, 0));
        jlTelefone.setText("* Telefone:");

        jtextNome.setToolTipText("Informe o nome completo");
        jtextNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtextNomeFocusLost(evt);
            }
        });
        jtextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextNomeActionPerformed(evt);
            }
        });
        jtextNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtextNomeKeyTyped(evt);
            }
        });

        jtextCPF.setToolTipText("Informe somente números");
        jtextCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextCPFActionPerformed(evt);
            }
        });
        jtextCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtextCPFKeyTyped(evt);
            }
        });

        jtextEndereco.setToolTipText("Informe o endereço completo");
        jtextEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextEnderecoActionPerformed(evt);
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

        jbSalvar.setBackground(new java.awt.Color(102, 102, 102));
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbEditar.setForeground(new java.awt.Color(0, 0, 0));
        jbEditar.setText("Editar");
        jbEditar.setEnabled(false);
        jbEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbEditarMouseClicked(evt);
            }
        });
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbLimpar.setBackground(new java.awt.Color(102, 102, 102));
        jbLimpar.setText("Limpar");
        jbLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbLimparMouseClicked(evt);
            }
        });
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbCancelar.setBackground(new java.awt.Color(102, 102, 102));
        jbCancelar.setText("Cancelar");
        jbCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbCancelarMouseClicked(evt);
            }
        });
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbTabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Endereço", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jbTabela1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbTabela1MouseClicked(evt);
            }
        });
        Tabela.setViewportView(jbTabela1);
        if (jbTabela1.getColumnModel().getColumnCount() > 0) {
            jbTabela1.getColumnModel().getColumn(0).setResizable(false);
            jbTabela1.getColumnModel().getColumn(1).setResizable(false);
            jbTabela1.getColumnModel().getColumn(2).setResizable(false);
            jbTabela1.getColumnModel().getColumn(3).setResizable(false);
        }

        JbDeletar.setText("Deletar");
        JbDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbDeletarActionPerformed(evt);
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
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFundoLayout.createSequentialGroup()
                                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNome)
                                    .addComponent(jlCPF)
                                    .addComponent(jlEndereco)
                                    .addComponent(jlTelefone))
                                .addGap(21, 21, 21)
                                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtextEndereco)
                                    .addComponent(jtextCPF)
                                    .addComponent(jtextNome)
                                    .addComponent(jformTelefone)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFundoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFundoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlTitulo)
                        .addGap(152, 152, 152))
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tabela, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JbDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jFundoLayout.setVerticalGroup(
            jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNome)
                    .addComponent(jtextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCPF)
                    .addComponent(jtextCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlEndereco)
                    .addComponent(jtextEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefone)
                    .addComponent(jformTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JbDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpar)
                    .addComponent(jbEditar)
                    .addComponent(jbCancelar)
                    .addComponent(jbSalvar))
                .addGap(23, 23, 23)
                .addComponent(Tabela, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        if (validaInputs()) {
            //pegar dados da tela para salvar
        int idCliente = 0;
        String nomeCliente = jtextNome.getText();
        String cpf = jtextCPF.getText();
        String cnpj = null;
        String endereco = jtextEndereco.getText();
        String telefone = jformTelefone.getText();
        ClienteServicos ClienteS = FactoryServicos.getClienteServicos();
            
        Cliente c = new Cliente(idCliente,nomeCliente, cpf, cnpj, endereco, telefone);
        ClienteS.cadCliente(c);
        limparCampos();
        addRowToTable();
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        jbSalvar.setText("Confirmar");
      
        jbCancelar.setText("Cancelar");

    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        if (jbLimpar.getText().equals("limpar")) {
            limparCampos();
        }else{
            limparCampos();
            jbLimpar.setText("Limpar");
            jbSalvar.setText("Salvar");
            jbEditar.setEnabled(false);
            jlCPF.setEnabled(true);
        }
    }//GEN-LAST:event_jbLimparActionPerformed
    
    public void limparCampos(){
            jtextNome.setText("");
            jtextCPF.setText("");
            jtextEndereco.setText("");
            jformTelefone.setText("");
            jtextNome.requestFocus();
    }
    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbTabela1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbTabela1MouseClicked
        jbEditar.setEnabled(true);
        JbDeletar.setVisible(true);
        
    }//GEN-LAST:event_jbTabela1MouseClicked

    private void jlCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jlCPFFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jlCPFFocusLost

    private void jtextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextNomeActionPerformed

    private void jtextCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextCPFActionPerformed

    private void jtextEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextEnderecoActionPerformed

    private void jtextCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextCPFKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextCPFKeyTyped

    private void jformTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jformTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jformTelefoneActionPerformed

    private void jbLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLimparMouseClicked

    }//GEN-LAST:event_jbLimparMouseClicked

    private void jbCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCancelarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCancelarMouseClicked

    private void jbEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEditarMouseClicked
        jbEditar.setText("Editar");
    }//GEN-LAST:event_jbEditarMouseClicked

    private void JbDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbDeletarActionPerformed
        // TODO add your handling code here:
        int linha;
        String cpf;
        linha = jbTabela1.getSelectedRow();
        cpf = (String) jbTabela1.getValueAt(linha,1);
        ClienteServicos ClienteS = FactoryServicos.getClienteServicos();
        Object[] resp = {"Sim" , "Nao" };
        int resposta = JOptionPane.showOptionDialog(this,"Deseja Realmente deletar esse CPF?" , "Deletar", 
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,resp,resp[0]);
        if (resposta == 0) {
            ClienteS.delCliente(cpf);
            addRowToTable();
            JOptionPane.showMessageDialog(this, "Cliente Deletado Com Sucesso! ");
        }else{
            JOptionPane.showMessageDialog(this, "Okay!");
        }
        JbDeletar.setVisible(false);
    }//GEN-LAST:event_JbDeletarActionPerformed

    private void jtextNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtextNomeFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextNomeFocusLost

    private void jtextNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextNomeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextNomeKeyTyped

    public boolean validaInputs() {
        if (jlNome.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher Nome: ");
            jlNome.requestFocus();
            return false;
        } else if (jlCPF.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher CPF: ");
            jlCPF.requestFocus();
            return false;
        } else if (jlEndereco.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher Endereço: ");
            jlEndereco.requestFocus();
            return false;
        } else if (jformTelefone.getValue() == null) {
            JOptionPane.showMessageDialog(this, "Preencher Telefone : ");
            jlTelefone.requestFocus();
            return false;
        }
        return true;
    }

    public void addRowToTable() {
        DefaultTableModel model = (DefaultTableModel) jbTabela1.getModel();
        model.getDataVector().removeAllElements();//Remove todas as linhas
        model.fireTableDataChanged();
        Object rowData[] = new Object[4];
        ClienteServicos ClienteS = FactoryServicos.getClienteServicos();
        for (Cliente c : ClienteS.getClientes()) {
            rowData[0] = c.getNomeCliente();
            rowData[1] = c.getCpf();
            rowData[2] = c.getEndereco();
            rowData[3] = c.getTelefone();
            model.addRow(rowData);
        }
    }

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
            java.util.logging.Logger.getLogger(JFCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCliente().setVisible(true);
            }
        });
    }//fim valida imputs


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbDeletar;
    private javax.swing.JScrollPane Tabela;
    private javax.swing.JPanel jFundo;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JTable jbTabela1;
    private javax.swing.JFormattedTextField jformTelefone;
    private javax.swing.JSeparator jlBarra;
    private javax.swing.JLabel jlCPF;
    private javax.swing.JLabel jlEndereco;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtextCPF;
    private javax.swing.JTextField jtextEndereco;
    private javax.swing.JTextField jtextNome;
    // End of variables declaration//GEN-END:variables
}
