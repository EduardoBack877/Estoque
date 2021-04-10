
package dao;
import apoio.IDAOT;
import apoio.ConexaoBD;
import entidade.Secao;
import java.sql.Statement;
import java.util.ArrayList;

public class SecaoDAO implements IDAOT<Secao> {

    @Override
    public boolean salvar(Secao s) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            String sql = ""
                    + "INSERT INTO secao VALUES ( "
                    + "default, "
                    + "'" + s.getDescricao() + "'"
                    + ")";

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return resultado > 0;

        } catch (Exception e) {
            System.out.println("Erro ao salvar seção: " + e);
            return false;
        }
    }

    @Override
    public boolean atualizar(Secao o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Secao> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Secao> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Secao consultarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    
}
