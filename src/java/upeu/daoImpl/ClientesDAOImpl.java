package upeu.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import upeu.config.Conexion;
import upeu.dao.ClienteDAO;
import upeu.entity.Clientes;

public class ClientesDAOImpl implements ClienteDAO{
private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    @Override
    public int create(Clientes clientes) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int update(Clientes clientes) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int delete(int idcliente) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Clientes read(int idcliente) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public List<Clientes> readAll() {
        String SQL = "select p.nombres, c.idcliente from clientes c inner join personas p on c.idpersona=p.idpersona";
        List<Clientes> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Clientes s = new Clientes();
                s.setIdcliente(rs.getInt("idcliente"));
                s.setNombre(rs.getString("nombres"));
           
                lista.add(s);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return lista;
    }
    
}
