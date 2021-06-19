/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import apoio.ConexaoBD;
import dao.ProdutoDAO;
import dao.ProdutoDAO;
import entidade.Produto;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.Assert;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;
        
public class ProdutoDAOteste {
    
   private static Connection conexao;
   private static ProdutoDAO produtoDAO;
   
   @BeforeClass
   
   public static void init () throws SQLException
   {
     conexao = ConexaoBD.getInstance().getConnection();
     produtoDAO = new ProdutoDAO();
     
     
   }
   
 /* @Test 
  public void criarProduto() {
     int aux = 0;
     Produto prod = new Produto(); 
     prod.setCodgrupo(1);
     prod.setCodprat(1);
     prod.setCodsecao(1);
     prod.setCor("Amarelo");
     prod.setDescricao("Blazer");
     prod.setMarca("Nike");
     prod.setQtd(10);
     prod.setTamanho("M");
     if (produtoDAO.salvar(prod)) {
         aux = 1;
     };
  }*/
   
   @Test
   public void testeSalvar() throws Exception {
     int aux = 0;
     Produto prod = new Produto(); 
     prod.setCodgrupo(1);
     prod.setCodprat(1);
     prod.setCodsecao(1);
     prod.setCor("Amarelo");
     prod.setDescricao("Blazer");
     prod.setMarca("Nike");
     prod.setQtd(10);
     prod.setTamanho("M");
     if (produtoDAO.salvar(prod)) {
         aux = 1;
     };
     assertTrue(aux == 1);
 
    }
   
 /*  @Test
   public void testeEditar () {
       criarProduto();
       
   }*/
   
   
   
}
   

