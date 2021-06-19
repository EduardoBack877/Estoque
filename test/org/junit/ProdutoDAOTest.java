package org.junit;


import apoio.ConexaoBD;
import dao.ProdutoDAO;
import entidade.Produto;
import java.sql.Connection;
import java.sql.SQLException;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;




public class ProdutoDAOTest {
   private static ProdutoDAO produtoDAO;
   
   @BeforeClass
   public static void init () throws SQLException
   {
    Connection conexao = ConexaoBD.getInstance().getConnection();
     produtoDAO = new ProdutoDAO();
     
     
   }
   
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
}
