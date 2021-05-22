/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import dao.SecaoDAO;
import entidade.Secao;
import javax.swing.JOptionPane;

/**
 *
 * @author dudub
 */
public class IfrCadastroProduto extends javax.swing.JInternalFrame {
        
        
    public IfrCadastroProduto() {
        initComponents();
        setarTfdIdEditable();
        tfdIdSecao.setText("0");
    }
            

    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabelPesquisarSecoes = new javax.swing.JLabel();
        tfdPesquisarSecoes = new javax.swing.JTextField();
        btnPesquisarSecoes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TSecao = new javax.swing.JTable();
        btnEditarSecoes = new javax.swing.JButton();
        btnExcluirSecoes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelDescricaoSecao = new javax.swing.JLabel();
        tfdDescricaoSecao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSalvarSecao = new javax.swing.JButton();
        btnFecharSecao = new javax.swing.JButton();
        jLabelConsultaSecao = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfdIdSecao = new javax.swing.JTextField();
        btnLimparCampos = new javax.swing.JButton();
        jLabelDescricaoSecao1 = new javax.swing.JLabel();
        jLabelDescricaoSecao2 = new javax.swing.JLabel();
        jLabelDescricaoSecao3 = new javax.swing.JLabel();
        jLabelDescricaoSecao4 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelDescricaoSecao5 = new javax.swing.JLabel();
        jLabelDescricaoSecao6 = new javax.swing.JLabel();
        jLabelDescricaoSecao7 = new javax.swing.JLabel();
        tfdDescricaoSecao1 = new javax.swing.JTextField();
        tfdDescricaoSecao2 = new javax.swing.JTextField();
        tfdDescricaoSecao4 = new javax.swing.JTextField();
        tfdDescricaoSecao7 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboPrateleira = new javax.swing.JComboBox<>();
        jComboGrupo = new javax.swing.JComboBox<>();
        jComboSecao = new javax.swing.JComboBox<>();

        jLabelPesquisarSecoes.setText("Pesquisar:");

        tfdPesquisarSecoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdPesquisarSecoesActionPerformed(evt);
            }
        });

        btnPesquisarSecoes.setText("Pesquisar");
        btnPesquisarSecoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarSecoesActionPerformed(evt);
            }
        });

        TSecao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Descrição", "Cor", "Marca", "Tamanho", "Quantidade", "Seção", "Grupo", "Prateleira"
            }
        ));
        jScrollPane1.setViewportView(TSecao);

        btnEditarSecoes.setText("Editar");
        btnEditarSecoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarSecoesActionPerformed(evt);
            }
        });

        btnExcluirSecoes.setText("Excluir");
        btnExcluirSecoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirSecoesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("                                                                  Cadastro de Produto");

        jLabelDescricaoSecao.setText("Descrição");

        tfdDescricaoSecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdDescricaoSecaoActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("*");

        btnSalvarSecao.setText("Salvar");
        btnSalvarSecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarSecaoActionPerformed(evt);
            }
        });

        btnFecharSecao.setText("Fechar");
        btnFecharSecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharSecaoActionPerformed(evt);
            }
        });

        jLabelConsultaSecao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelConsultaSecao.setText("Consulta de Produtos");

        jLabel3.setText("Id");

        tfdIdSecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdIdSecaoActionPerformed(evt);
            }
        });

        btnLimparCampos.setText("Limpar Campos");
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });

        jLabelDescricaoSecao1.setText("Cor");

        jLabelDescricaoSecao2.setText("Marca");

        jLabelDescricaoSecao3.setText("Tamanho");

        jLabelDescricaoSecao4.setText("Quantidade");

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("*");

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("*");

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("*");

        jLabelDescricaoSecao5.setText("Seção");

        jLabelDescricaoSecao6.setText("Grupo");

        jLabelDescricaoSecao7.setText("Prateleira");

        tfdDescricaoSecao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdDescricaoSecao1ActionPerformed(evt);
            }
        });

        tfdDescricaoSecao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdDescricaoSecao2ActionPerformed(evt);
            }
        });

        tfdDescricaoSecao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdDescricaoSecao4ActionPerformed(evt);
            }
        });

        tfdDescricaoSecao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdDescricaoSecao7ActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("*");

        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("*");

        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("*");

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("*");

        jComboPrateleira.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboPrateleira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboPrateleiraActionPerformed(evt);
            }
        });

        jComboGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboSecao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboSecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboSecaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabelPesquisarSecoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfdPesquisarSecoes, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisarSecoes))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDescricaoSecao)
                            .addComponent(jLabel3)
                            .addComponent(jLabelDescricaoSecao1)
                            .addComponent(jLabelDescricaoSecao5)
                            .addComponent(jLabelDescricaoSecao6)
                            .addComponent(jLabelDescricaoSecao7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDescricaoSecao4)
                                    .addComponent(jLabelDescricaoSecao3))
                                .addComponent(jLabelDescricaoSecao2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfdDescricaoSecao2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfdDescricaoSecao1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfdDescricaoSecao, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfdDescricaoSecao4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfdDescricaoSecao7, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(2, 2, 2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfdIdSecao, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboPrateleira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboSecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(310, 310, 310)
                            .addComponent(jLabelConsultaSecao))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEditarSecoes)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluirSecoes)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimparCampos)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvarSecao)
                    .addComponent(btnFecharSecao))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelConsultaSecao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdPesquisarSecoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPesquisarSecoes)
                    .addComponent(btnPesquisarSecoes))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirSecoes)
                    .addComponent(btnEditarSecoes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdIdSecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdDescricaoSecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescricaoSecao)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdDescricaoSecao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescricaoSecao1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdDescricaoSecao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescricaoSecao2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdDescricaoSecao4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescricaoSecao3)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdDescricaoSecao7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescricaoSecao4)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescricaoSecao5)
                    .addComponent(jLabel8)
                    .addComponent(jComboSecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescricaoSecao6)
                    .addComponent(jLabel7)
                    .addComponent(jComboGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescricaoSecao7)
                    .addComponent(jLabel6)
                    .addComponent(jComboPrateleira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarSecao)
                    .addComponent(btnLimparCampos))
                .addGap(18, 18, 18)
                .addComponent(btnFecharSecao)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setarTfdIdEditable () {
        tfdIdSecao.setEditable(false);
    }

    private void tfdPesquisarSecoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdPesquisarSecoesActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tfdPesquisarSecoesActionPerformed

    private void btnSalvarSecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarSecaoActionPerformed
        Secao s = new Secao();
        SecaoDAO sDAO = new SecaoDAO();
        String a = tfdDescricaoSecao.getText();
        String b = tfdIdSecao.getText();
        int baux = Integer.parseInt(b);
        tfdIdSecao.setEditable(false);
        if (a.isEmpty()) {
            JOptionPane.showMessageDialog(this, "O preenchimento do campo de descrição é obrigatório");
        } else {
            s.setId(baux);
            s.setDescricao(tfdDescricaoSecao.getText());
            if (new SecaoDAO().salvar(s))  {
                if (baux == 0) {
                    JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this, "Registro editado com sucesso!"); 
                }
            
            tfdIdSecao.setText("0");
            tfdDescricaoSecao.setText("");
            tfdDescricaoSecao.requestFocus();
            sDAO.popularTabela(TSecao, tfdPesquisarSecoes.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao salvar registro!");                                          
        }
        }

    }//GEN-LAST:event_btnSalvarSecaoActionPerformed

    private void btnPesquisarSecoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarSecoesActionPerformed
       new SecaoDAO().popularTabela(TSecao,tfdPesquisarSecoes.getText());
    }//GEN-LAST:event_btnPesquisarSecoesActionPerformed

    private void btnExcluirSecoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirSecoesActionPerformed
            tfdIdSecao.setEditable(false);
         // falta validação checar google docs
            if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?") == JOptionPane.OK_OPTION) {
            
            
            String idString = String.valueOf(TSecao.getValueAt(TSecao.getSelectedRow(), 0));
                System.out.println(idString);
            int idExclusao = Integer.parseInt(idString);

            SecaoDAO sDAO = new SecaoDAO();
            
            if (sDAO.excluir(idExclusao)) {
                    JOptionPane.showMessageDialog(null, "Seção excluída com sucesso!");
                sDAO.popularTabela(TSecao, tfdPesquisarSecoes.getText());
            
            
            } else {
                JOptionPane.showMessageDialog(null, "Problemas ao excluir Seção.");
            }
        }
            
    }//GEN-LAST:event_btnExcluirSecoesActionPerformed

    private void btnEditarSecoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarSecoesActionPerformed
        String idString = String.valueOf(TSecao.getValueAt(TSecao.getSelectedRow(), 0));
     
        int idS = Integer.parseInt(idString);
        tfdIdSecao.setEditable(false);
        // criar instancia SecaoDAO
        SecaoDAO secaoDAO = new SecaoDAO();

        // criar instancia Secao
        Secao secao = secaoDAO.consultarId(idS);

        if (secao != null) {

            // define os valores do obj nos campos da tela
            tfdIdSecao.setText(""+secao.getId());
            tfdDescricaoSecao.setText(secao.getDescricao());
            //popula tabela
            secaoDAO.popularTabela(TSecao, tfdPesquisarSecoes.getText());

            // mudar de aba
            //jTabbedPane1.setSelectedIndex(0);
            // definir o foco
            tfdDescricaoSecao.requestFocus();
        }
    }//GEN-LAST:event_btnEditarSecoesActionPerformed

    private void tfdIdSecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdIdSecaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdIdSecaoActionPerformed

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
            tfdIdSecao.setText("0");
            tfdDescricaoSecao.setText("");
    }//GEN-LAST:event_btnLimparCamposActionPerformed

    private void btnFecharSecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharSecaoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharSecaoActionPerformed

    private void tfdDescricaoSecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdDescricaoSecaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdDescricaoSecaoActionPerformed

    private void tfdDescricaoSecao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdDescricaoSecao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdDescricaoSecao1ActionPerformed

    private void tfdDescricaoSecao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdDescricaoSecao2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdDescricaoSecao2ActionPerformed

    private void tfdDescricaoSecao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdDescricaoSecao4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdDescricaoSecao4ActionPerformed

    private void tfdDescricaoSecao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdDescricaoSecao7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdDescricaoSecao7ActionPerformed

    private void jComboPrateleiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboPrateleiraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboPrateleiraActionPerformed

    private void jComboSecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboSecaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboSecaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TSecao;
    private javax.swing.JButton btnEditarSecoes;
    private javax.swing.JButton btnExcluirSecoes;
    private javax.swing.JButton btnFecharSecao;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JButton btnPesquisarSecoes;
    private javax.swing.JButton btnSalvarSecao;
    private javax.swing.JComboBox<String> jComboGrupo;
    private javax.swing.JComboBox<String> jComboPrateleira;
    private javax.swing.JComboBox<String> jComboSecao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelConsultaSecao;
    private javax.swing.JLabel jLabelDescricaoSecao;
    private javax.swing.JLabel jLabelDescricaoSecao1;
    private javax.swing.JLabel jLabelDescricaoSecao2;
    private javax.swing.JLabel jLabelDescricaoSecao3;
    private javax.swing.JLabel jLabelDescricaoSecao4;
    private javax.swing.JLabel jLabelDescricaoSecao5;
    private javax.swing.JLabel jLabelDescricaoSecao6;
    private javax.swing.JLabel jLabelDescricaoSecao7;
    private javax.swing.JLabel jLabelPesquisarSecoes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField tfdDescricaoSecao;
    private javax.swing.JTextField tfdDescricaoSecao1;
    private javax.swing.JTextField tfdDescricaoSecao2;
    private javax.swing.JTextField tfdDescricaoSecao4;
    private javax.swing.JTextField tfdDescricaoSecao7;
    private javax.swing.JTextField tfdIdSecao;
    private javax.swing.JTextField tfdPesquisarSecoes;
    // End of variables declaration//GEN-END:variables
}
