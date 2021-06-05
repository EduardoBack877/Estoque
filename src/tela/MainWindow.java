/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import apoio.ConexaoBD;
import dao.RelatoriosDAO;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author fabricio.pretto
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPrincipal
     */
    public MainWindow() {
        initComponents();

        // abre tela maximizada
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuCadastroPessoa = new javax.swing.JMenuItem();
        jMenuCadastroSecoes = new javax.swing.JMenuItem();
        jMenuCadastroGrupoProdutos = new javax.swing.JMenuItem();
        jMenuCadastroDePrateleiras = new javax.swing.JMenuItem();
        jMenuCadastroProduto = new javax.swing.JMenuItem();
        jMenuMovimentação = new javax.swing.JMenu();
        jMenuMovimentacao = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItemConsultaEmTela = new javax.swing.JMenuItem();
        jMenuItemItensPorCategoria = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AutoMed System - Quinta");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 678, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        jMenuCadastros.setText("Cadastros");

        jMenuCadastroPessoa.setText("Cadastro de Usuários");
        jMenuCadastroPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroPessoaActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuCadastroPessoa);

        jMenuCadastroSecoes.setText("Cadastro de Seções");
        jMenuCadastroSecoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroSecoesActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuCadastroSecoes);

        jMenuCadastroGrupoProdutos.setText("Cadastro de Grupo de Produtos");
        jMenuCadastroGrupoProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroGrupoProdutosActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuCadastroGrupoProdutos);

        jMenuCadastroDePrateleiras.setText("Cadastro de Prateleiras");
        jMenuCadastroDePrateleiras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroDePrateleirasActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuCadastroDePrateleiras);

        jMenuCadastroProduto.setText("Cadastro de Produtos");
        jMenuCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroProdutoActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuCadastroProduto);

        jMenuBar1.add(jMenuCadastros);

        jMenuMovimentação.setText("Movimentações");

        jMenuMovimentacao.setText("Movimentação de Estoque");
        jMenuMovimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMovimentacaoActionPerformed(evt);
            }
        });
        jMenuMovimentação.add(jMenuMovimentacao);

        jMenuBar1.add(jMenuMovimentação);

        jMenu1.setText("Relatórios");

        jMenuItem4.setText("Listagem de Itens em Estoque");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItemConsultaEmTela.setText("Consulta de Movimentação em Tela");
        jMenuItemConsultaEmTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaEmTelaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemConsultaEmTela);

        jMenuItemItensPorCategoria.setText("Listagem de Itens por Categoria em Estoque");
        jMenuItemItensPorCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemItensPorCategoriaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemItensPorCategoria);

        jMenuItem5.setText("Relatório Consulta de Movimentações");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCadastroSecoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroSecoesActionPerformed
        IfrCadastroSecoes s = new IfrCadastroSecoes();
        jDesktopPane1.add(s);
        s.setVisible(true);
    }//GEN-LAST:event_jMenuCadastroSecoesActionPerformed

    private void jMenuCadastroPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroPessoaActionPerformed
        IfrCadastroUsuario u = new IfrCadastroUsuario();
        jDesktopPane1.add(u);
        u.setVisible(true);
    }//GEN-LAST:event_jMenuCadastroPessoaActionPerformed

    private void jMenuCadastroGrupoProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroGrupoProdutosActionPerformed
        IfrCadastroGrupoProd g = new IfrCadastroGrupoProd();
        jDesktopPane1.add(g);
        g.setVisible(true);
    }//GEN-LAST:event_jMenuCadastroGrupoProdutosActionPerformed

    private void jMenuCadastroDePrateleirasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroDePrateleirasActionPerformed
        IfrCadastroPrateleira p = new IfrCadastroPrateleira();
        jDesktopPane1.add(p);
        p.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuCadastroDePrateleirasActionPerformed

    private void jMenuCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroProdutoActionPerformed
        IfrCadastroProduto p = new IfrCadastroProduto();
        jDesktopPane1.add(p);
        p.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuCadastroProdutoActionPerformed

    private void jMenuMovimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMovimentacaoActionPerformed
        IfrMovEstoque p = new IfrMovEstoque();
        jDesktopPane1.add(p);
        p.setVisible(true);
    }//GEN-LAST:event_jMenuMovimentacaoActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        RelatoriosDAO rDAO = new RelatoriosDAO();
        rDAO.geraRelatorioItensNoEstoque();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItemConsultaEmTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaEmTelaActionPerformed
        IfrConsultaEstoque s = new IfrConsultaEstoque();
        jDesktopPane1.add(s);
        s.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemConsultaEmTelaActionPerformed

    private void jMenuItemItensPorCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemItensPorCategoriaActionPerformed
        RelatoriosDAO rDAO = new RelatoriosDAO();
        rDAO.geraRelatorioItensPorCategoria();// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemItensPorCategoriaActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       IfrRelatorioMovimentacao s = new IfrRelatorioMovimentacao();
        jDesktopPane1.add(s);
        s.setVisible(true); 

    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCadastroDePrateleiras;
    private javax.swing.JMenuItem jMenuCadastroGrupoProdutos;
    private javax.swing.JMenuItem jMenuCadastroPessoa;
    private javax.swing.JMenuItem jMenuCadastroProduto;
    private javax.swing.JMenuItem jMenuCadastroSecoes;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItemConsultaEmTela;
    private javax.swing.JMenuItem jMenuItemItensPorCategoria;
    private javax.swing.JMenuItem jMenuMovimentacao;
    private javax.swing.JMenu jMenuMovimentação;
    // End of variables declaration//GEN-END:variables
}
