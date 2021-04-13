/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import dao.SecaoDAO;
import dao.UsuarioDAO;
import entidade.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author dudub
 */
public class IfrCadastroUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form IfrCadastroUsuario
     */
    public IfrCadastroUsuario() {
        initComponents();
        tfdIdCadUsuarios.setText("0");
        tfdIdCadUsuarios.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCadUser = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnEditarCadUsuarios = new javax.swing.JButton();
        btnExcluirCadUsuarios = new javax.swing.JButton();
        btnSalvarCadUsuarios = new javax.swing.JButton();
        btnLimparCamposCadUsuarios = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfdLoginCadUsuarios = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordCadUsuarios = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfdIdCadUsuarios = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfdPesquisarCadUsuarios = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfdStatusCadUsuarios = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Consulta de Usuários");

        jTableCadUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Login", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableCadUser);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Cadastro de Usuários");

        btnEditarCadUsuarios.setText("Editar");
        btnEditarCadUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCadUsuariosActionPerformed(evt);
            }
        });

        btnExcluirCadUsuarios.setText("Excluir");
        btnExcluirCadUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCadUsuariosActionPerformed(evt);
            }
        });

        btnSalvarCadUsuarios.setText("Salvar");
        btnSalvarCadUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCadUsuariosActionPerformed(evt);
            }
        });

        btnLimparCamposCadUsuarios.setText("Limpar Campos");
        btnLimparCamposCadUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposCadUsuariosActionPerformed(evt);
            }
        });

        jButton3.setText("Fechar");

        jLabel3.setText("Username");

        jLabel4.setText("Password");

        jPasswordCadUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordCadUsuariosActionPerformed(evt);
            }
        });

        jLabel5.setText("Status");

        jLabel6.setText("0 - Inativo 1 - Ativo");

        jLabel7.setText("Id");

        jLabel8.setText("Pesquisar");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel10.setText("*");

        jLabel11.setText("*");

        jLabel12.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(183, 183, 183))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addComponent(jLabel7))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jPasswordCadUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                                            .addComponent(tfdLoginCadUsuarios)
                                            .addComponent(tfdIdCadUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(tfdStatusCadUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEditarCadUsuarios)
                                .addGap(26, 26, 26)
                                .addComponent(btnExcluirCadUsuarios)))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLimparCamposCadUsuarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalvarCadUsuarios)
                            .addComponent(jButton3))
                        .addGap(50, 50, 50))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfdPesquisarCadUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfdPesquisarCadUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirCadUsuarios)
                    .addComponent(btnEditarCadUsuarios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(tfdIdCadUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfdLoginCadUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordCadUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdStatusCadUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarCadUsuarios)
                    .addComponent(btnLimparCamposCadUsuarios))
                .addGap(26, 26, 26)
                .addComponent(jButton3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarCadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCadUsuariosActionPerformed
        // cria instancia usuario
        Usuario u = new Usuario();
        
        //cria variavel auxilar
        char auxiliar = 'S';
        String idaux = tfdIdCadUsuarios.getText();
        int idaux1 = Integer.parseInt(idaux);
        String a = tfdLoginCadUsuarios.getText();
        String b = jPasswordCadUsuarios.getText();
        String c = tfdStatusCadUsuarios.getText();
        int d = Integer.parseInt(tfdStatusCadUsuarios.getText());
        
        // criar instancia AgendamentoDAO
        UsuarioDAO uDAO = new UsuarioDAO();
        
        //validação
        if (a.isEmpty()) { //Verifica se o campo Login está vazio.
            System.out.println("Login em branco!");
            JOptionPane.showMessageDialog(null, "O campo login deve ser preenchido!");
            auxiliar = 'N';
            limparCampos();
        } else {
            if (b.isEmpty()) { //Verifica se o campo senha esta vazia.
                System.out.println("Senha em branco! ");
                JOptionPane.showMessageDialog(null, "O campo senha deve ser preenchido!");
                auxiliar = 'N';
                limparCampos();
            } else {
                if (c.isEmpty()) { //Verifica se o campo status está vazio!
                    System.out.println("Status em branco! ");
                    JOptionPane.showMessageDialog(null, "O campo status deve ser preenchido!");
                    auxiliar = 'N';
                    limparCampos();
                } else {
                    if (String.valueOf(c).length()!=1) {
                        System.out.println("O campo status não possui apenas 1 caracter");
                        JOptionPane.showMessageDialog(null, "O campo status deve possuir apenas um caracter conforme regra escrita na tela!");
                        auxiliar = 'N';
                        limparCampos();
                    } else {

                        if ((d != 0) && (d != 1)) {
                            System.out.println(d);
                            System.out.println("O campo status aceita somente os caracteres citados na tela!");
                            JOptionPane.showMessageDialog(null, "O campo status aceita somente os caracteres citados na tela!");
                            auxiliar = 'N';
                            limparCampos();
                            
                        }
                    }
                }
            }
        }
    
            
        
         
        
        // popular o objeto
           
        if (auxiliar == 'S') {
           u.setId(idaux1);
           u.setUsername(tfdLoginCadUsuarios.getText());
           u.setPassword(jPasswordCadUsuarios.getText());
           u.setStatus(Integer.parseInt(tfdStatusCadUsuarios.getText()));
          
           // cadastrar com senha
           
           if (uDAO.salvar(u)) {
                if (idaux1 == 0) {
                    JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this, "Registro editado com sucesso!"); 
                }
           }
                
           uDAO.popularTabela(jTableCadUser, tfdPesquisarCadUsuarios.getText());      
           //limpa os campos
           tfdIdCadUsuarios.setText("0");
           tfdLoginCadUsuarios.setText("");
           jPasswordCadUsuarios.setText("");
           tfdStatusCadUsuarios.setText("");
           
           // posiciona cursor
           tfdLoginCadUsuarios.requestFocus();
           
           
     
        auxiliar = 'S';
        }
        
    }//GEN-LAST:event_btnSalvarCadUsuariosActionPerformed

    private void limparCampos () {
        tfdIdCadUsuarios.setText("0");
        tfdLoginCadUsuarios.setText("");
        jPasswordCadUsuarios.setText("");
        tfdStatusCadUsuarios.setText("");
    }
    
    private void btnLimparCamposCadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposCadUsuariosActionPerformed
        tfdIdCadUsuarios.setText("0");
        tfdLoginCadUsuarios.setText("");
        jPasswordCadUsuarios.setText("");
        tfdStatusCadUsuarios.setText("");
    }//GEN-LAST:event_btnLimparCamposCadUsuariosActionPerformed

    private void btnEditarCadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCadUsuariosActionPerformed
             String idString = String.valueOf(jTableCadUser.getValueAt(jTableCadUser.getSelectedRow(), 0));
     
        int idS = Integer.parseInt(idString);
        tfdIdCadUsuarios.setEditable(false);
        
        // criar instancia SecaoDAO
        UsuarioDAO uDAO = new UsuarioDAO();

        // criar instancia Secao
        Usuario usuario = uDAO.consultarId(idS);
        System.out.println("testando fora");
        if (usuario != null) {
            System.out.println("testando dentro");
            // define os valores do obj nos campos da tela
            tfdIdCadUsuarios.setText(""+usuario.getId());
            tfdLoginCadUsuarios.setText(usuario.getUsername());
            jPasswordCadUsuarios.setText(usuario.getPassword());
            tfdStatusCadUsuarios.setText(""+usuario.getStatus());
            //tfdStatusCadUsuarios.setText(usuario.getStatus());
            //popula tabela
            uDAO.popularTabela(jTableCadUser, tfdPesquisarCadUsuarios.getText());

            // mudar de aba
            //jTabbedPane1.setSelectedIndex(0);
            // definir o foco
            tfdLoginCadUsuarios.requestFocus();
        }        
    }//GEN-LAST:event_btnEditarCadUsuariosActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        new UsuarioDAO().popularTabela(jTableCadUser,tfdPesquisarCadUsuarios.getText());        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void jPasswordCadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordCadUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordCadUsuariosActionPerformed

    private void btnExcluirCadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCadUsuariosActionPerformed
            tfdIdCadUsuarios.setEditable(false);
         // falta validação checar google docs
            if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?") == JOptionPane.OK_OPTION) {
            
            
            String idString = String.valueOf(jTableCadUser.getValueAt(jTableCadUser.getSelectedRow(), 0));
                System.out.println(idString);
            int idExclusao = Integer.parseInt(idString);

            UsuarioDAO uDAO = new UsuarioDAO();
            
            if (uDAO.excluir(idExclusao)) {
                JOptionPane.showMessageDialog(null, "Agendamento excluído com sucesso!");
                uDAO.popularTabela(jTableCadUser, tfdPesquisarCadUsuarios.getText());
            
            
            } else {
                JOptionPane.showMessageDialog(null, "Problemas ao excluir agendamento.");
            }
        }
    }//GEN-LAST:event_btnExcluirCadUsuariosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarCadUsuarios;
    private javax.swing.JButton btnExcluirCadUsuarios;
    private javax.swing.JButton btnLimparCamposCadUsuarios;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvarCadUsuarios;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordCadUsuarios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCadUser;
    private javax.swing.JTextField tfdIdCadUsuarios;
    private javax.swing.JTextField tfdLoginCadUsuarios;
    private javax.swing.JTextField tfdPesquisarCadUsuarios;
    private javax.swing.JTextField tfdStatusCadUsuarios;
    // End of variables declaration//GEN-END:variables
}
